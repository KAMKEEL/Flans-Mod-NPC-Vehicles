package com.wolffsmod.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.AnimTrackLink;
import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.EntityFlanVehicleNPC;
import com.wolffsmod.entity.Seat;
import com.wolffsmod.flan.FlanUtils;

import net.minecraft.entity.Entity;

import java.util.Optional;

public abstract class ModelFlanVehicle extends ModelVehicle
{
    private static final float worldScale = 0.0625F;

    public ModelRendererTurbo[] leftFrontLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightFrontLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftBackLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightBackLegModel = new ModelRendererTurbo[0];

    public ModelFlanVehicle() {}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        EntityFlanVehicleNPC vehicle = ((EntityFlanVehicleNPC) entity);

        renderSteeringWheel(vehicle.wheelYaw);
        renderPart(bodyModel);
        if (vehicle.doorsOpen)
            renderPart(bodyDoorOpenModel);
        else
            renderPart(bodyDoorCloseModel);
        renderWheels(vehicle.wheelsAngle, vehicle.rotateWheels);
        renderPart(leftFrontLegModel);
        renderPart(rightFrontLegModel);
        renderPart(leftBackLegModel);
        renderPart(rightBackLegModel);
        renderPart(trailerModel);
        renderTracks();
        renderFancyTrack(vehicle.trackLinksLeft, vehicle.trackLinksRight);
        renderGuns(vehicle, vehicle.vehicleGunModelScale);
        renderTurretAndBarrel(vehicle.turretOrigin, vehicle, vehicle.recoilPos);
        renderDrillHead(vehicle.harvesterAngle);
        renderAnimDoors();
    }

    protected void renderGuns(EntityFlanDriveableNPC entity, float vehicleGunModelScale)
    {
        for (String gunName : gunModels.keySet())
        {
            ModelRendererTurbo[][] gunModel = gunModels.get(gunName);

            if (gunModel.length < 1)
                continue;

            Optional<Seat> passenger = entity.getPassengerFromGun(gunName);

            if (passenger.isPresent() && passenger.get().part == EnumDriveablePart.turret)
                continue;

            //Yaw only parts
            for (ModelRendererTurbo gunModelPart : gunModel[0])
            {
                //Yaw and render
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                passenger.ifPresent(seat -> gunModelPart.rotateAngleY = -seat.getLocalYaw() * (float) Math.PI / 180F);
                gunModelPart.render(worldScale);
                GL11.glPopMatrix();
            }

            if (gunModel.length < 2)
                continue;

            //Yaw and pitch, no recoil parts
            for (ModelRendererTurbo gunModelPart : gunModel[1])
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                //Yaw, pitch and render
                if (passenger.isPresent())
                {
                    gunModelPart.rotateAngleY = -passenger.get().getLocalYaw() * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                }
                gunModelPart.render(worldScale);
                GL11.glPopMatrix();
            }

            if (gunModel.length < 3)
                continue;

            //Yaw, pitch and recoil parts
            for (ModelRendererTurbo gunModelPart : gunModel[2])
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                //Yaw, pitch, recoil and render
                if (passenger.isPresent())
                {
                    gunModelPart.rotateAngleY = -passenger.get().getLocalYaw() * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                }
                gunModelPart.render(worldScale);
                GL11.glPopMatrix();
            }

            for (int i = 3; i < gunModel.length; i++)
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                if (passenger.isPresent())
                {
                    for(ModelRendererTurbo gunModelPart : gunModel[i])
                    {
                        gunModelPart.rotateAngleY = -passenger.get().getLocalYaw() * (float) Math.PI / 180F;
                        gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                    }
                }
                renderPart(gunModel[i]);
                GL11.glPopMatrix();
            }
        }
    }

    protected void renderTurretGuns(EntityFlanDriveableNPC entity)
    {
        for (String gunName : gunModels.keySet())
        {
            ModelRendererTurbo[][] gunModel = gunModels.get(gunName);

            if (gunModel.length < 1)
                continue;

            Optional<Seat> passenger = entity.getPassengerFromGun(gunName);

            if (passenger.isPresent() && passenger.get().part == EnumDriveablePart.turret)
            {
                float effectiveYaw = passenger.get().getLocalYaw() - entity.driver.getLocalYaw();

                //Yaw only parts
                for (ModelRendererTurbo gunModelPart : gunModel[0])
                {
                    //Yaw and render
                    gunModelPart.rotateAngleY = -effectiveYaw * (float) Math.PI / 180F;
                    gunModelPart.render(worldScale, oldRotateOrder);
                }

                if (gunModel.length < 2)
                    continue;

                //Yaw and pitch, no recoil parts
                for (ModelRendererTurbo gunModelPart : gunModel[1])
                {
                    //Yaw, pitch and render
                    gunModelPart.rotateAngleY = -effectiveYaw * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                    gunModelPart.render(worldScale, oldRotateOrder);
                }

                if (gunModel.length < 3)
                    continue;

                //Yaw, pitch and recoil parts
                for (ModelRendererTurbo gunModelPart : gunModel[2])
                {
                    //Yaw, pitch, recoil and render
                    gunModelPart.rotateAngleY = -effectiveYaw * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                    gunModelPart.render(worldScale, oldRotateOrder);
                }
            }
        }
    }

    protected void renderTurretAndBarrel(Vector3f turretOrigin, EntityFlanDriveableNPC entity, float recoilPos)
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(turretOrigin.x, turretOrigin.y, turretOrigin.z);
            GL11.glRotatef(-entity.driver.getLocalYaw(), 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-turretOrigin.x, -turretOrigin.y, -turretOrigin.z);

            GL11.glPushMatrix();
            {
                GL11.glScalef(turretScale.x, turretScale.y, turretScale.z);
                GL11.glTranslatef(turretTrans.x, turretTrans.y, turretTrans.z);
                renderPart(turretModel);

                for (ModelRendererTurbo model: barrelModel)
                    model.rotateAngleZ = -entity.driver.getPitch() * (float) Math.PI / 180F;
                renderPart(barrelModel);

                GL11.glPushMatrix();
                {
                    GL11.glTranslatef(barrelAttach.x, barrelAttach.y, -barrelAttach.z);
                    GL11.glRotatef(-entity.driver.getPitch(), 0F, 0F, 1F);
                    renderPart(barrelSpecModel);
                }
                GL11.glPopMatrix();

                for (ModelRendererTurbo[] ammo : ammoModel)
                {
                    for (ModelRendererTurbo model : ammo)
                        model.rotateAngleZ = -entity.driver.getPitch() * (float) Math.PI / 180F;
                    renderPart(ammo);
                }

                renderDrakon();
                renderTurretGuns(entity);
            }
            GL11.glPopMatrix();

            GL11.glTranslatef(barrelAttach.x, barrelAttach.y, -barrelAttach.z);
            GL11.glRotatef(-entity.driver.getPitch(), 0F, 0F, 1F);
            GL11.glTranslatef(recoilPos*-(5F/16F),0F, 0F);
            renderPart(animBarrelModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderTracks()
    {
        renderPart(rightTrackModel);
        renderPart(leftTrackModel);
        for (ModelRendererTurbo[] latm : leftAnimTrackModel)
            renderPart(latm);
        for (ModelRendererTurbo[] ratm : rightAnimTrackModel)
            renderPart(ratm);
        renderPart(rightAnimTrackModel1);
        renderPart(leftAnimTrackModel1);
        renderPart(rightAnimTrackModel2);
        renderPart(leftAnimTrackModel2);
        renderPart(rightAnimTrackModel3);
        renderPart(leftAnimTrackModel3);
    }

    protected void renderAnimDoors()
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(doorAttach.x, doorAttach.y, -doorAttach.z);
            renderPart(doorAnimModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(door2Attach.x, door2Attach.y, -door2Attach.z);
            renderPart(door2AnimModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderDrillHead(float harvesterAngle)
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(drillHeadOrigin.x, drillHeadOrigin.y, drillHeadOrigin.z);
            GL11.glRotatef(harvesterAngle * 50F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(-drillHeadOrigin.x, -drillHeadOrigin.y, -drillHeadOrigin.z);
            renderPart(drillHeadModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderDrakon()
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(drakonArmAttach.x, drakonArmAttach.y, drakonArmAttach.z);
            renderPart(drakonArmModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(drakonRailAttach.x, drakonRailAttach.y, drakonRailAttach.z);
            renderPart(drakonRailModel);
            renderPart(drakonModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(drakonDoorAttach.x, drakonDoorAttach.y, drakonDoorAttach.z);
            renderPart(drakonDoorModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderSteeringWheel(float wheelYaw)
    {
        for (ModelRendererTurbo model: steeringWheelModel)
            model.rotateAngleX = wheelYaw * (float) Math.PI / 180F * 3F;
        renderPart(steeringWheelModel);
    }

    protected void renderWheels(float wheelsAngle, boolean rotateWheels)
    {
        if (rotateWheels)
        {
            rotateWheels(frontWheelModel, wheelsAngle);
            rotateWheels(backWheelModel, wheelsAngle);
            rotateWheels(leftBackWheelModel, wheelsAngle);
            rotateWheels(rightBackWheelModel, wheelsAngle);
            rotateWheels(leftFrontWheelModel, wheelsAngle);
            rotateWheels(rightFrontWheelModel, wheelsAngle);
            rotateWheels(rightTrackWheelModels, wheelsAngle);
            rotateWheels(leftTrackWheelModels, wheelsAngle);
        }
        renderPart(frontWheelModel);
        renderPart(backWheelModel);
        renderPart(leftBackWheelModel);
        renderPart(rightBackWheelModel);
        renderPart(leftFrontWheelModel);
        renderPart(rightFrontWheelModel);
        renderPart(rightTrackWheelModels);
        renderPart(leftTrackWheelModels);
    }

    protected void rotateWheels(ModelRendererTurbo[] wheelModels, float wheelsAngle)
    {
        for (ModelRendererTurbo leftTrackWheelModel : wheelModels)
        {
            leftTrackWheelModel.rotateAngleZ = -wheelsAngle;
        }
        renderPart(wheelModels);
    }

    protected boolean hasFancyTracks()
    {
        return fancyTrackModel.length > 0;
    }

    protected void renderFancyTrack(AnimTrackLink[] trackLinksLeft, AnimTrackLink[] trackLinksRight)
    {
        if (!hasFancyTracks())
            return;

        for (AnimTrackLink link : trackLinksLeft)
        {
            float rotZ = link.zRot;
            for (; rotZ > 180F; rotZ -= 360F) {}
            for (; rotZ <= -180F; rotZ += 360F) {}
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16F, link.position.y / 16F, link.position.z / 16F);
            GL11.glRotatef(rotZ * (float) (180 / Math.PI), 0, 0, 1);
            renderPart(fancyTrackModel);
            GL11.glPopMatrix();
        }

        for (AnimTrackLink link : trackLinksRight)
        {
            float rotZ = link.zRot;
            for (; rotZ > 180F; rotZ -= 360F) {}
            for (; rotZ <= -180F; rotZ += 360F) {}
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16F, link.position.y / 16F, link.position.z / 16F);
            GL11.glRotatef(rotZ * (float) (180 / Math.PI), 0, 0, 1);
            renderPart(fancyTrackModel);
            GL11.glPopMatrix();
        }
    }

    @Override
    public void flipAll()
    {
        flip(bodyModel);
        flip(bodyDoorOpenModel);
        flip(bodyDoorCloseModel);
        for (ModelRendererTurbo[][] modsOfMods : gunModels.values())
        {
            for (ModelRendererTurbo[] mods : modsOfMods)
                flip(mods);
        }
        flip(turretModel);
        flip(barrelModel);
        flip(barrelSpecModel);
        flip(animBarrelModel);
        flip(leftFrontWheelModel);
        flip(rightFrontWheelModel);
        flip(leftBackWheelModel);
        flip(rightBackWheelModel);
        flip(rightFrontLegModel);
        flip(leftFrontLegModel);
        flip(rightBackLegModel);
        flip(leftBackLegModel);
        flip(rightTrackModel);
        flip(leftTrackModel);
        flip(rightTrackWheelModels);
        flip(leftTrackWheelModels);
        flip(trailerModel);
        flip(steeringWheelModel);
        flip(frontWheelModel);
        flip(backWheelModel);
        flip(drillHeadModel);
        flip(rightAnimTrackModel1);
        flip(leftAnimTrackModel1);
        flip(rightAnimTrackModel2);
        flip(leftAnimTrackModel2);
        flip(rightAnimTrackModel3);
        flip(leftAnimTrackModel3);
        flip(drakonArmModel);
        flip(drakonRailModel);
        flip(drakonDoorModel);
        flip(drakonModel);
        flip(drakonReloadModel);
        for (ModelRendererTurbo[] latm : leftAnimTrackModel)
            flip(latm);
        for (ModelRendererTurbo[] ratm : rightAnimTrackModel)
            flip(ratm);
        flip(doorAnimModel);
        flip(door2AnimModel);
        flip(fancyTrackModel);
    }

    @Override
    public void translateAll(float x, float y, float z)
    {
        translate(bodyModel, x, y, z);
        translate(bodyDoorOpenModel, x, y, z);
        translate(bodyDoorCloseModel, x, y, z);
        for (ModelRendererTurbo[][] modsOfMods : gunModels.values())
        {
            for (ModelRendererTurbo[] mods : modsOfMods)
                translate(mods, x, y, z);
        }
        translate(turretModel, x, y, z);
        translate(barrelModel, x, y, z);
        translate(barrelSpecModel, x, y, z);
        translate(animBarrelModel, x, y, z);
        translate(leftFrontWheelModel, x, y, z);
        translate(rightFrontWheelModel, x, y, z);
        translate(leftBackWheelModel, x, y, z);
        translate(rightBackWheelModel, x, y, z);
        translate(leftFrontLegModel, x, y, z);
        translate(rightFrontLegModel, x, y, z);
        translate(leftBackLegModel, x, y, z);
        translate(rightBackLegModel, x, y, z);
        translate(rightTrackModel, x, y, z);
        translate(leftTrackModel, x, y, z);
        translate(rightTrackWheelModels, x, y, z);
        translate(leftTrackWheelModels, x, y, z);
        translate(trailerModel, x, y, z);
        translate(steeringWheelModel, x, y, z);
        translate(frontWheelModel, x, y, z);
        translate(backWheelModel, x, y, z);
        translate(drillHeadModel, x, y, z);
        translate(rightAnimTrackModel1, x, y, z);
        translate(leftAnimTrackModel1, x, y, z);
        translate(rightAnimTrackModel2, x, y, z);
        translate(leftAnimTrackModel2, x, y, z);
        translate(rightAnimTrackModel3, x, y, z);
        translate(leftAnimTrackModel3, x, y, z);
        for (ModelRendererTurbo[] latm : leftAnimTrackModel)
            translate(latm, x, y, z);
        for (ModelRendererTurbo[] ratm : rightAnimTrackModel)
            translate(ratm, x, y, z);
        translate(doorAnimModel, x, y, z);
        translate(door2AnimModel, x, y, z);
        translate(drakonArmModel, x, y, z);
        translate(drakonRailModel, x, y, z);
        translate(drakonDoorModel, x, y, z);
        translate(drakonReloadModel, x, y, z);
        translate(drakonModel, x, y, z);
        translate(fancyTrackModel, x, y, z);
    }
}
