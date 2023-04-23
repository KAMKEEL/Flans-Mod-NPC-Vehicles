package com.wolffsmod.entity.manus.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzer4G extends EntityFlanVehicleNPC
{
	public EntityPanzer4G(World w)
	{
		super(w);
		setSize(3.0F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(1F);
		setDriver("0 21 0 -360 360 -5 20");
		addBarrelPosition("0 31 0");

	}
}
