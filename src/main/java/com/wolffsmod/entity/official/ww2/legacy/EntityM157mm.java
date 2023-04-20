package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM157mm extends EntityFlanVehicleNPC
{
    public EntityM157mm(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -2 0 -15 15 -10 10");
        addBarrelPosition("0 20 0");
        
    }
}
