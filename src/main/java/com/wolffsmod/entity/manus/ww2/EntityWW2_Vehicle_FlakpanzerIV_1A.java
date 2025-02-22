package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_FlakpanzerIV_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_FlakpanzerIV_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 34 0 -360 360 -5 85");
        setRotatedDriverOffset("-23 0 0");
        setPassenger("1 31 12 12 core -30 30 -10 10 WW2_MG_MG42ZB_1A FrontMG");
        addBarrelPosition("0 40 0");
        addBarrelPosition("0 40 0");
        addGunOrigin("1 48 18 12");
        
    }
}
