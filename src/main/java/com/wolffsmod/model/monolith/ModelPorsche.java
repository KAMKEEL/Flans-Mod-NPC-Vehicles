//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelPorsche extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelPorsche() {
        this.textureX = 1024;
        this.textureY = 1024;
        (this.bodyModel = new ModelRendererTurbo[24])[0] = new ModelRendererTurbo((ModelBase)this, 0, 720, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 800, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 175, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 225, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 275, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 350, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 420, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 450, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 480, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 510, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 550, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 575, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 600, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 630, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 650, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 680, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 680, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 480, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 630, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 650, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 510, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 550, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 600, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 575, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 78, 22, 36, 0.0f);
        this.bodyModel[0].setRotationPoint(-52.0f, -22.0f, -18.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 10, 8, 36, 0.0f);
        this.bodyModel[1].setRotationPoint(34.0f, -12.2f, -18.0f);
        this.bodyModel[1].rotateAngleZ = -1.047198f;
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 13, 4, 36, 0.0f);
        this.bodyModel[2].setRotationPoint(19.0f, -4.0f, -18.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 11, 7, 36, 0.0f);
        this.bodyModel[3].setRotationPoint(23.8f, -16.0f, -18.0f);
        this.bodyModel[3].rotateAngleZ = -0.3490658f;
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 20, 14, 36, 0.0f);
        this.bodyModel[4].setRotationPoint(-69.5f, -12.6f, -18.0f);
        this.bodyModel[4].rotateAngleZ = 0.4886922f;
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 15, 9, 36, 0.0f);
        this.bodyModel[5].setRotationPoint(-63.0f, -9.0f, -18.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 62, 10, 8, 0.0f);
        this.bodyModel[6].setRotationPoint(-52.0f, -22.0f, 18.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 62, 10, 8, 0.0f);
        this.bodyModel[7].setRotationPoint(-52.0f, -22.0f, -26.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 62, 1, 12, 0.0f);
        this.bodyModel[8].setRotationPoint(-52.0f, -12.0f, 18.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 17, 1, 12, 0.0f);
        this.bodyModel[9].setRotationPoint(10.0f, -12.0f, 18.0f);
        this.bodyModel[9].rotateAngleZ = 0.2094395f;
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 12, 1, 12, 0.0f);
        this.bodyModel[10].setRotationPoint(26.0f, -15.5f, 18.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 13, 6, 0, 0.0f);
        this.bodyModel[11].setRotationPoint(26.0f, -14.5f, 18.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 7, 1, 12, 0.0f);
        this.bodyModel[12].setRotationPoint(38.0f, -15.5f, 18.0f);
        this.bodyModel[12].rotateAngleZ = -0.6981317f;
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 18, 1, 12, 0.0f);
        this.bodyModel[13].setRotationPoint(-68.0f, -15.0f, 18.0f);
        this.bodyModel[13].rotateAngleZ = -0.1745329f;
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 9, 1, 12, 0.0f);
        this.bodyModel[14].setRotationPoint(-73.0f, -8.0f, 18.0f);
        this.bodyModel[14].rotateAngleZ = 0.9250245f;
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 18, 10, 8, 0.0f);
        this.bodyModel[15].setRotationPoint(6.0f, -22.0f, 19.0f);
        this.bodyModel[15].rotateAngleY = -0.4537856f;
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 18, 10, 8, 0.0f);
        this.bodyModel[16].setRotationPoint(9.5f, -22.0f, -26.0f);
        this.bodyModel[16].rotateAngleY = 0.4537856f;
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 62, 1, 12, 0.0f);
        this.bodyModel[17].setRotationPoint(-52.0f, -12.0f, -30.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 18, 1, 12, 0.0f);
        this.bodyModel[18].setRotationPoint(-68.0f, -15.0f, -30.0f);
        this.bodyModel[18].rotateAngleZ = -0.1745329f;
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 9, 1, 12, 0.0f);
        this.bodyModel[19].setRotationPoint(-73.0f, -8.0f, -30.0f);
        this.bodyModel[19].rotateAngleZ = 0.9250245f;
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 17, 1, 12, 0.0f);
        this.bodyModel[20].setRotationPoint(10.0f, -12.0f, -30.0f);
        this.bodyModel[20].rotateAngleZ = 0.2094395f;
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 12, 1, 12, 0.0f);
        this.bodyModel[21].setRotationPoint(26.0f, -15.5f, -30.0f);
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 7, 1, 12, 0.0f);
        this.bodyModel[22].setRotationPoint(38.0f, -15.5f, -30.0f);
        this.bodyModel[22].rotateAngleZ = -0.6981317f;
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 13, 6, 0, 0.0f);
        this.bodyModel[23].setRotationPoint(26.0f, -14.5f, -18.0f);
        (this.turretModel = new ModelRendererTurbo[9])[0] = new ModelRendererTurbo((ModelBase)this, 350, 0, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 350, 100, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 350, 175, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 350, 250, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase)this, 350, 300, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo((ModelBase)this, 350, 350, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo((ModelBase)this, 350, 400, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo((ModelBase)this, 350, 450, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo((ModelBase)this, 350, 500, this.textureX, this.textureY);
        this.turretModel[0].addBox(-19.0f, 0.0f, -14.0f, 38, 12, 28, 0.0f);
        this.turretModel[0].setRotationPoint(0.0f, -34.0f, 0.0f);
        this.turretModel[1].addBox(-10.0f, 0.0f, 9.0f, 16, 12, 12, 0.0f);
        this.turretModel[1].setRotationPoint(0.0f, -34.0f, 0.0f);
        this.turretModel[1].rotateAngleY = 0.4886922f;
        this.turretModel[2].addBox(-11.0f, 0.0f, 7.0f, 25, 12, 12, 0.0f);
        this.turretModel[2].setRotationPoint(0.0f, -34.0f, 0.0f);
        this.turretModel[2].rotateAngleY = -0.2792527f;
        this.turretModel[3].addBox(-11.0f, 0.0f, -19.0f, 25, 12, 12, 0.0f);
        this.turretModel[3].setRotationPoint(0.0f, -34.0f, 0.0f);
        this.turretModel[3].rotateAngleY = 0.2792527f;
        this.turretModel[4].addBox(-10.0f, 0.0f, -21.0f, 16, 12, 12, 0.0f);
        this.turretModel[4].setRotationPoint(0.0f, -34.0f, 0.0f);
        this.turretModel[4].rotateAngleY = -0.4886922f;
        this.turretModel[5].addBox(-31.0f, 0.0f, -10.0f, 12, 10, 20, 0.0f);
        this.turretModel[5].setRotationPoint(0.0f, -33.5f, 0.0f);
        this.turretModel[6].addBox(-4.0f, 0.0f, -5.0f, 23, 10, 10, 0.0f);
        this.turretModel[6].setRotationPoint(0.0f, -36.0f, 0.0f);
        this.turretModel[6].rotateAngleZ = -0.08726646f;
        this.turretModel[7].addBox(-20.0f, 0.0f, -5.0f, 16, 10, 10, 0.0f);
        this.turretModel[7].setRotationPoint(0.0f, -37.0f, 0.0f);
        this.turretModel[7].rotateAngleZ = 0.1745329f;
        this.turretModel[8].addBox(-11.0f, 0.0f, 5.0f, 12, 10, 12, 0.0f);
        this.turretModel[8].setRotationPoint(0.0f, -38.0f, 0.0f);
        (this.barrelModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 350, 540, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 350, 590, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 350, 625, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 350, 650, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 350, 675, this.textureX, this.textureY);
        this.barrelModel[0].addBox(21.0f, -5.0f, -13.0f, 1, 8, 26, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.barrelModel[1].addBox(13.0f, -4.0f, -3.0f, 26, 6, 6, 0.0f);
        this.barrelModel[1].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.barrelModel[2].addBox(39.0f, -3.0f, -2.0f, 14, 4, 4, 0.0f);
        this.barrelModel[2].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.barrelModel[3].addBox(50.0f, -2.5f, -1.5f, 26, 3, 3, 0.0f);
        this.barrelModel[3].setRotationPoint(0.0f, -28.0f, 0.0f);
        this.barrelModel[4].addBox(76.0f, -3.0f, -2.0f, 8, 4, 4, 0.0f);
        this.barrelModel[4].setRotationPoint(0.0f, -28.0f, 0.0f);
        (this.leftTrackModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo((ModelBase)this, 500, 50, this.textureX, this.textureY);
        this.leftTrackModel[1] = new ModelRendererTurbo((ModelBase)this, 500, 50, this.textureX, this.textureY);
        this.leftTrackModel[2] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.leftTrackModel[3] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.leftTrackModel[4] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.leftTrackModel[5] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.leftTrackModel[6] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.leftTrackModel[7] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.leftTrackModel[8] = new ModelRendererTurbo((ModelBase)this, 500, 200, this.textureX, this.textureY);
        this.leftTrackModel[9] = new ModelRendererTurbo((ModelBase)this, 500, 250, this.textureX, this.textureY);
        this.leftTrackModel[10] = new ModelRendererTurbo((ModelBase)this, 500, 275, this.textureX, this.textureY);
        this.leftTrackModel[11] = new ModelRendererTurbo((ModelBase)this, 500, 320, this.textureX, this.textureY);
        this.leftTrackModel[12] = new ModelRendererTurbo((ModelBase)this, 500, 360, this.textureX, this.textureY);
        this.leftTrackModel[13] = new ModelRendererTurbo((ModelBase)this, 500, 400, this.textureX, this.textureY);
        this.leftTrackModel[14] = new ModelRendererTurbo((ModelBase)this, 500, 425, this.textureX, this.textureY);
        this.leftTrackModel[15] = new ModelRendererTurbo((ModelBase)this, 500, 450, this.textureX, this.textureY);
        this.leftTrackModel[16] = new ModelRendererTurbo((ModelBase)this, 500, 475, this.textureX, this.textureY);
        this.leftTrackModel[17] = new ModelRendererTurbo((ModelBase)this, 500, 500, this.textureX, this.textureY);
        this.leftTrackModel[18] = new ModelRendererTurbo((ModelBase)this, 500, 360, this.textureX, this.textureY);
        this.leftTrackModel[0].addBox(0.0f, 0.0f, 0.0f, 11, 11, 11, 0.0f);
        this.leftTrackModel[0].setRotationPoint(-68.0f, -7.0f, -29.0f);
        this.leftTrackModel[1].addBox(0.0f, 0.0f, 0.0f, 11, 11, 11, 0.0f);
        this.leftTrackModel[1].setRotationPoint(28.0f, -11.0f, -29.0f);
        this.leftTrackModel[2].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.leftTrackModel[2].setRotationPoint(13.0f, -1.0f, -29.0f);
        this.leftTrackModel[3].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.leftTrackModel[3].setRotationPoint(1.0f, -1.0f, -29.0f);
        this.leftTrackModel[4].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.leftTrackModel[4].setRotationPoint(-42.0f, -1.0f, -29.0f);
        this.leftTrackModel[5].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.leftTrackModel[5].setRotationPoint(-54.0f, -1.0f, -29.0f);
        this.leftTrackModel[6].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.leftTrackModel[6].setRotationPoint(-14.5f, -1.0f, -29.0f);
        this.leftTrackModel[7].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.leftTrackModel[7].setRotationPoint(-26.5f, -1.0f, -29.0f);
        this.leftTrackModel[8].addBox(0.0f, 0.0f, 0.0f, 79, 1, 11, 0.0f);
        this.leftTrackModel[8].setRotationPoint(-55.0f, 9.0f, -29.0f);
        this.leftTrackModel[9].addBox(0.0f, 0.0f, 0.0f, 19, 1, 11, 0.0f);
        this.leftTrackModel[9].setRotationPoint(23.0f, 9.0f, -29.0f);
        this.leftTrackModel[9].rotateAngleZ = 0.5235988f;
        this.leftTrackModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 12, 11, 0.0f);
        this.leftTrackModel[10].setRotationPoint(39.0f, -11.5f, -29.0f);
        this.leftTrackModel[11].addBox(0.0f, 0.0f, 0.0f, 12, 1, 11, 0.0f);
        this.leftTrackModel[11].setRotationPoint(27.5f, -12.0f, -29.0f);
        this.leftTrackModel[12].addBox(0.0f, 0.0f, 0.0f, 18, 1, 11, 0.0f);
        this.leftTrackModel[12].setRotationPoint(11.5f, -4.0f, 0.0f);
        this.leftTrackModel[12].rotateAngleZ = 0.4537856f;
        this.leftTrackModel[13].addBox(0.0f, 0.0f, 0.0f, 48, 1, 11, 0.0f);
        this.leftTrackModel[13].setRotationPoint(-36.0f, -4.0f, -29.0f);
        this.leftTrackModel[14].addBox(0.0f, 0.0f, 0.0f, 22, 1, 11, 0.0f);
        this.leftTrackModel[14].setRotationPoint(-57.0f, -8.0f, -29.0f);
        this.leftTrackModel[14].rotateAngleZ = -0.1745329f;
        this.leftTrackModel[15].addBox(0.0f, 0.0f, 0.0f, 12, 1, 11, 0.0f);
        this.leftTrackModel[15].setRotationPoint(-69.0f, -8.0f, -29.0f);
        this.leftTrackModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 13, 11, 0.0f);
        this.leftTrackModel[16].setRotationPoint(-69.0f, -8.0f, -29.0f);
        this.leftTrackModel[17].addBox(0.0f, 0.0f, 0.0f, 16, 1, 11, 0.0f);
        this.leftTrackModel[17].setRotationPoint(-69.0f, 4.0f, -29.0f);
        this.leftTrackModel[17].rotateAngleZ = -0.3490658f;
        this.leftTrackModel[18].addBox(0.0f, 0.0f, 0.0f, 18, 1, 11, 0.0f);
        this.leftTrackModel[18].setRotationPoint(11.5f, -4.0f, -29.0f);
        this.leftTrackModel[18].rotateAngleZ = 0.4537856f;
        (this.rightTrackModel = new ModelRendererTurbo[18])[0] = new ModelRendererTurbo((ModelBase)this, 500, 50, this.textureX, this.textureY);
        this.rightTrackModel[1] = new ModelRendererTurbo((ModelBase)this, 500, 50, this.textureX, this.textureY);
        this.rightTrackModel[2] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.rightTrackModel[3] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.rightTrackModel[4] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.rightTrackModel[5] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.rightTrackModel[6] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.rightTrackModel[7] = new ModelRendererTurbo((ModelBase)this, 500, 150, this.textureX, this.textureY);
        this.rightTrackModel[8] = new ModelRendererTurbo((ModelBase)this, 500, 200, this.textureX, this.textureY);
        this.rightTrackModel[9] = new ModelRendererTurbo((ModelBase)this, 500, 250, this.textureX, this.textureY);
        this.rightTrackModel[10] = new ModelRendererTurbo((ModelBase)this, 500, 275, this.textureX, this.textureY);
        this.rightTrackModel[11] = new ModelRendererTurbo((ModelBase)this, 500, 320, this.textureX, this.textureY);
        this.rightTrackModel[12] = new ModelRendererTurbo((ModelBase)this, 500, 360, this.textureX, this.textureY);
        this.rightTrackModel[13] = new ModelRendererTurbo((ModelBase)this, 500, 400, this.textureX, this.textureY);
        this.rightTrackModel[14] = new ModelRendererTurbo((ModelBase)this, 500, 425, this.textureX, this.textureY);
        this.rightTrackModel[15] = new ModelRendererTurbo((ModelBase)this, 500, 450, this.textureX, this.textureY);
        this.rightTrackModel[16] = new ModelRendererTurbo((ModelBase)this, 500, 475, this.textureX, this.textureY);
        this.rightTrackModel[17] = new ModelRendererTurbo((ModelBase)this, 500, 500, this.textureX, this.textureY);
        this.rightTrackModel[0].addBox(0.0f, 0.0f, 0.0f, 11, 11, 11, 0.0f);
        this.rightTrackModel[0].setRotationPoint(-68.0f, -7.0f, 18.0f);
        this.rightTrackModel[1].addBox(0.0f, 0.0f, 0.0f, 11, 11, 11, 0.0f);
        this.rightTrackModel[1].setRotationPoint(28.0f, -11.0f, 18.0f);
        this.rightTrackModel[2].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.rightTrackModel[2].setRotationPoint(13.0f, -1.0f, 18.0f);
        this.rightTrackModel[3].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.rightTrackModel[3].setRotationPoint(1.0f, -1.0f, 18.0f);
        this.rightTrackModel[4].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.rightTrackModel[4].setRotationPoint(-42.0f, -1.0f, 18.0f);
        this.rightTrackModel[5].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.rightTrackModel[5].setRotationPoint(-54.0f, -1.0f, 18.0f);
        this.rightTrackModel[6].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.rightTrackModel[6].setRotationPoint(-14.5f, -1.0f, 18.0f);
        this.rightTrackModel[7].addBox(0.0f, 0.0f, 0.0f, 10, 10, 11, 0.0f);
        this.rightTrackModel[7].setRotationPoint(-26.5f, -1.0f, 18.0f);
        this.rightTrackModel[8].addBox(0.0f, 0.0f, 0.0f, 79, 1, 11, 0.0f);
        this.rightTrackModel[8].setRotationPoint(-55.0f, 9.0f, 18.0f);
        this.rightTrackModel[9].addBox(0.0f, 0.0f, 0.0f, 19, 1, 11, 0.0f);
        this.rightTrackModel[9].setRotationPoint(23.0f, 9.0f, 18.0f);
        this.rightTrackModel[9].rotateAngleZ = 0.5235988f;
        this.rightTrackModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 12, 11, 0.0f);
        this.rightTrackModel[10].setRotationPoint(39.0f, -11.5f, 18.0f);
        this.rightTrackModel[11].addBox(0.0f, 0.0f, 0.0f, 12, 1, 11, 0.0f);
        this.rightTrackModel[11].setRotationPoint(27.5f, -12.0f, 18.0f);
        this.rightTrackModel[12].addBox(0.0f, 0.0f, 0.0f, 18, 1, 11, 0.0f);
        this.rightTrackModel[12].setRotationPoint(11.5f, -4.0f, 18.0f);
        this.rightTrackModel[12].rotateAngleZ = 0.4537856f;
        this.rightTrackModel[13].addBox(0.0f, 0.0f, 0.0f, 48, 1, 11, 0.0f);
        this.rightTrackModel[13].setRotationPoint(-36.0f, -4.0f, 18.0f);
        this.rightTrackModel[14].addBox(0.0f, 0.0f, 0.0f, 22, 1, 11, 0.0f);
        this.rightTrackModel[14].setRotationPoint(-57.0f, -8.0f, 18.0f);
        this.rightTrackModel[14].rotateAngleZ = -0.1745329f;
        this.rightTrackModel[15].addBox(0.0f, 0.0f, 0.0f, 12, 1, 11, 0.0f);
        this.rightTrackModel[15].setRotationPoint(-69.0f, -8.0f, 18.0f);
        this.rightTrackModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 13, 11, 0.0f);
        this.rightTrackModel[16].setRotationPoint(-69.0f, -8.0f, 18.0f);
        this.rightTrackModel[17].addBox(0.0f, 0.0f, 0.0f, 16, 1, 11, 0.0f);
        this.rightTrackModel[17].setRotationPoint(-69.0f, 4.0f, 18.0f);
        this.rightTrackModel[17].rotateAngleZ = -0.3490658f;
        this.translateAll(0, -1, 0);
        this.flipAll();
    }
}
