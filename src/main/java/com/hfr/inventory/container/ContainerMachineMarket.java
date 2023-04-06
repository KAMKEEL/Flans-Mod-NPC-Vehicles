package com.hfr.inventory.container;

import com.hfr.tileentity.machine.TileEntityMachineMarket;
import com.hfr.util.LockedSlot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerMachineMarket extends Container {

	private TileEntityMachineMarket diFurnace;

	public ContainerMachineMarket(InventoryPlayer invPlayer, TileEntityMachineMarket tedf) {

		diFurnace = tedf;

		this.addSlotToContainer(new Slot(tedf, 0, 17, 90));
		this.addSlotToContainer(new Slot(tedf, 1, 35, 90));
		this.addSlotToContainer(new Slot(tedf, 2, 53, 90));
		this.addSlotToContainer(new LockedSlot(tedf, 3, 17, 108));
		this.addSlotToContainer(new LockedSlot(tedf, 4, 35, 108));
		this.addSlotToContainer(new LockedSlot(tedf, 5, 53, 108));
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18 + 56));
			}
		}
		
		for(int i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142 + 56));
		}
	}

	@Override
	public void addCraftingToCrafters(ICrafting crafting) {
		super.addCraftingToCrafters(crafting);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int par2) {
		ItemStack var3 = null;
		Slot var4 = (Slot) this.inventorySlots.get(par2);

		if (var4 != null && var4.getHasStack()) {
			ItemStack var5 = var4.getStack();
			var3 = var5.copy();

			if (par2 <= 5) {
				if (!this.mergeItemStack(var5, 6, this.inventorySlots.size(), true)) {
					return null;
				}
			} else {
				if (!this.mergeItemStack(var5, 0, 3, false))
					return null;
			}

			if (var5.stackSize == 0) {
				var4.putStack((ItemStack) null);
			} else {
				var4.onSlotChanged();
			}
		}

		return var3;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return diFurnace.isUseableByPlayer(player);
	}
}
