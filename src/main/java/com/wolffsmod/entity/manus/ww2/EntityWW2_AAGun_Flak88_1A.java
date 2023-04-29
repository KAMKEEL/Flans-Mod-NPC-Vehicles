package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntityWW2_AAGun_Flak88_1A extends EntityFlanAAGunNPC
{
    public EntityWW2_AAGun_Flak88_1A(World w)
    {
        super(w);
    }

    @Override
    public void setupConfig()
    {
        setDriver("3 30 -16 -360 360 0 90");
        setNumBarrels(1);
        addBarrel("0 88 40 0");
        setRecoil(5F);
    }
}
