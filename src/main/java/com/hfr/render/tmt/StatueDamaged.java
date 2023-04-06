//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.hfr.render.tmt;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class StatueDamaged extends ModelBase
{
	public static final StatueDamaged instance = new StatueDamaged();
	
	ModelRenderer Box_20_II;
	ModelRenderer Box_17_II;
	ModelRenderer Box_20;
	ModelRenderer Box_21;
	ModelRenderer Box_22;
	ModelRenderer Box_23;
	ModelRenderer Box_24;
	ModelRenderer Box_25;
	ModelRenderer Box_26;
	ModelRenderer Box_27;
	ModelRenderer Box_28;
	ModelRenderer Box_29;
	ModelRenderer Box_31;
	ModelRenderer Box_32;
	ModelRenderer Box_33;
	ModelRenderer Box_34_II;
	ModelRenderer Box_35;
	ModelRenderer Box_36_II;
	ModelRenderer Box_37_II;
	ModelRenderer Box_38_II;
	ModelRenderer Box_40;
	ModelRenderer Box_41;
	ModelRenderer Box_43;
	ModelRenderer Box_44;
	ModelRenderer Box_34;
	ModelRenderer Box_36;
	ModelRenderer Box_37;
	ModelRenderer Box_38;
	ModelRenderer Box_0;
	ModelRenderer Box_1;
	ModelRenderer Box_2;
	ModelRenderer Box_3;
	ModelRenderer Box_4;
	ModelRenderer Box_5;
	ModelRenderer Box_7;
	ModelRenderer Box_8;
	ModelRenderer Box_9;
	ModelRenderer Box_11;
	ModelRenderer Box_13;
	ModelRenderer Box_15;
	ModelRenderer Box_16;
	ModelRenderer Box_17;
	ModelRenderer Box_18;

	public StatueDamaged()
	{
		textureWidth = 128;
		textureHeight = 256;

		Box_20_II = new ModelRenderer(this, 1, 1);
		Box_20_II.addBox(-6.5F, 0F, -1.5F, 3, 3, 3);
		Box_20_II.setRotationPoint(0F, -32.3F, -0.5F);
		Box_20_II.setTextureSize(128, 256);
		Box_20_II.mirror = true;
		setRotation(Box_20_II, 0F, 0F, 0.95993109F);
		Box_17_II = new ModelRenderer(this, 41, 1);
		Box_17_II.addBox(1F, 12.4F, 1F, 4, 1, 2);
		Box_17_II.setRotationPoint(0F, -35F, 0.3F);
		Box_17_II.setTextureSize(128, 256);
		Box_17_II.mirror = true;
		setRotation(Box_17_II, 0F, 0F, 0F);
		Box_20 = new ModelRenderer(this, 57, 1);
		Box_20.addBox(-4F, 9.5F, -2.5F, 8, 3, 4);
		Box_20.setRotationPoint(0F, -35F, 0F);
		Box_20.setTextureSize(128, 256);
		Box_20.mirror = true;
		setRotation(Box_20, 0F, 0F, 0F);
		Box_21 = new ModelRenderer(this, 89, 1);
		Box_21.addBox(1F, 8.4F, 1F, 4, 3, 2);
		Box_21.setRotationPoint(0F, -35F, 0.3F);
		Box_21.setTextureSize(128, 256);
		Box_21.mirror = true;
		setRotation(Box_21, 0F, 0F, 0F);
		Box_22 = new ModelRenderer(this, 105, 1);
		Box_22.addBox(-1F, 12.4F, 1F, 2, 1, 2);
		Box_22.setRotationPoint(0F, -35F, 0.3F);
		Box_22.setTextureSize(128, 256);
		Box_22.mirror = true;
		setRotation(Box_22, 0F, 0F, 0F);
		Box_23 = new ModelRenderer(this, 49, 9);
		Box_23.addBox(-1F, 8.4F, 1F, 2, 3, 2);
		Box_23.setRotationPoint(0F, -35F, 0.3F);
		Box_23.setTextureSize(128, 256);
		Box_23.mirror = true;
		setRotation(Box_23, 0F, 0F, 0F);
		Box_24 = new ModelRenderer(this, 65, 9);
		Box_24.addBox(-1F, 8.4F, 1F, 2, 3, 2);
		Box_24.setRotationPoint(0F, -35F, 0F);
		Box_24.setTextureSize(128, 256);
		Box_24.mirror = true;
		setRotation(Box_24, 0F, 0F, 0F);
		Box_25 = new ModelRenderer(this, 81, 9);
		Box_25.addBox(-5F, 8.4F, 1F, 4, 3, 2);
		Box_25.setRotationPoint(0F, -35F, 0F);
		Box_25.setTextureSize(128, 256);
		Box_25.mirror = true;
		setRotation(Box_25, 0F, 0F, 0F);
		Box_26 = new ModelRenderer(this, 97, 9);
		Box_26.addBox(-1F, 12.4F, 1F, 2, 1, 2);
		Box_26.setRotationPoint(0F, -35F, 0F);
		Box_26.setTextureSize(128, 256);
		Box_26.mirror = true;
		setRotation(Box_26, 0F, 0F, 0F);
		Box_27 = new ModelRenderer(this, 113, 9);
		Box_27.addBox(-5F, 12.4F, 1F, 4, 1, 2);
		Box_27.setRotationPoint(0F, -35F, 0F);
		Box_27.setTextureSize(128, 256);
		Box_27.mirror = true;
		setRotation(Box_27, 0F, 0F, 0F);
		Box_28 = new ModelRenderer(this, 41, 17);
		Box_28.addBox(-4.2F, 12F, -1F, 4, 6, 4);
		Box_28.setRotationPoint(0F, -35F, 0F);
		Box_28.setTextureSize(128, 256);
		Box_28.mirror = true;
		setRotation(Box_28, -0.17453293F, 0F, 0F);
		Box_29 = new ModelRenderer(this, 65, 17);
		Box_29.addBox(-3.2F, 18F, -4.2F, 3, 7, 4);
		Box_29.setRotationPoint(0F, -35F, 0F);
		Box_29.setTextureSize(128, 256);
		Box_29.mirror = true;
		setRotation(Box_29, 0F, 0F, 0F);
		Box_31 = new ModelRenderer(this, 81, 17);
		Box_31.addBox(-5F, 12.4F, -2F, 4, 1, 3);
		Box_31.setRotationPoint(0F, -35F, 0F);
		Box_31.setTextureSize(128, 256);
		Box_31.mirror = true;
		setRotation(Box_31, 0F, 0F, 0F);
		Box_32 = new ModelRenderer(this, 97, 17);
		Box_32.addBox(1F, 12.4F, -2F, 4, 1, 3);
		Box_32.setRotationPoint(0F, -35F, 0F);
		Box_32.setTextureSize(128, 256);
		Box_32.mirror = true;
		setRotation(Box_32, 0F, 0F, 0F);
		Box_33 = new ModelRenderer(this, 113, 17);
		Box_33.addBox(1F, 9.4F, -2F, 4, 2, 3);
		Box_33.setRotationPoint(0F, -35F, 0F);
		Box_33.setTextureSize(128, 256);
		Box_33.mirror = true;
		setRotation(Box_33, 0F, 0F, 0F);
		Box_34_II = new ModelRenderer(this, 1, 25);
		Box_34_II.addBox(-4.5F, 8.5F, -3F, 9, 1, 5);
		Box_34_II.setRotationPoint(0F, -35F, 0F);
		Box_34_II.setTextureSize(128, 256);
		Box_34_II.mirror = true;
		setRotation(Box_34_II, 0F, 0F, 0F);
		Box_35 = new ModelRenderer(this, 81, 25);
		Box_35.addBox(-5F, 9.4F, -2F, 4, 2, 3);
		Box_35.setRotationPoint(0F, -35F, 0F);
		Box_35.setTextureSize(128, 256);
		Box_35.mirror = true;
		setRotation(Box_35, 0F, 0F, 0F);
		Box_36_II = new ModelRenderer(this, 97, 25);
		Box_36_II.addBox(-3.5F, 2.5F, -3F, 8, 3, 4);
		Box_36_II.setRotationPoint(-0.5F, -35F, 0F);
		Box_36_II.setTextureSize(128, 256);
		Box_36_II.mirror = true;
		setRotation(Box_36_II, 0F, 0F, 0F);
		Box_37_II = new ModelRenderer(this, 1, 33);
		Box_37_II.addBox(-3F, 7F, -3F, 6, 1, 4);
		Box_37_II.setRotationPoint(0F, -35F, 0F);
		Box_37_II.setTextureSize(128, 256);
		Box_37_II.mirror = true;
		setRotation(Box_37_II, 0F, 0F, 0F);
		Box_38_II = new ModelRenderer(this, 25, 33);
		Box_38_II.addBox(-3.5F, 0.5F, -2.5F, 7, 2, 4);
		Box_38_II.setRotationPoint(0F, -35F, 0F);
		Box_38_II.setTextureSize(128, 256);
		Box_38_II.mirror = true;
		setRotation(Box_38_II, 0F, 0F, 0F);
		Box_40 = new ModelRenderer(this, 1, 17);
		Box_40.addBox(-3.5F, 1.5F, -2.5F, 3, 2, 1);
		Box_40.setRotationPoint(-0.2F, -35.3F, 0F);
		Box_40.setTextureSize(128, 256);
		Box_40.mirror = true;
		setRotation(Box_40, 0F, 0F, 0F);
		Box_41 = new ModelRenderer(this, 57, 17);
		Box_41.addBox(-3.5F, 3.51F, -2.5F, 4, 1, 1);
		Box_41.setRotationPoint(-0.2F, -35.3F, 0F);
		Box_41.setTextureSize(128, 256);
		Box_41.mirror = true;
		setRotation(Box_41, 0F, 0F, 0F);
		Box_43 = new ModelRenderer(this, 25, 25);
		Box_43.addBox(-0.5F, 3.5F, -2.5F, 4, 1, 1);
		Box_43.setRotationPoint(0F, -35F, 0F);
		Box_43.setTextureSize(128, 256);
		Box_43.mirror = true;
		setRotation(Box_43, 0F, 0F, 0F);
		Box_44 = new ModelRenderer(this, 49, 33);
		Box_44.addBox(0.5F, 1.51F, -2.5F, 3, 2, 1);
		Box_44.setRotationPoint(0F, -35F, 0F);
		Box_44.setTextureSize(128, 256);
		Box_44.mirror = true;
		setRotation(Box_44, 0F, 0F, 0F);
		Box_34 = new ModelRenderer(this, 17, 41);
		Box_34.addBox(-4.5F, 0.1F, -1.5F, 4, 5, 4);
		Box_34.setRotationPoint(0F, -34.5F, 0F);
		Box_34.setTextureSize(128, 256);
		Box_34.mirror = true;
		setRotation(Box_34, 0F, 0F, 0.26179939F);
		Box_36 = new ModelRenderer(this, 41, 41);
		Box_36.addBox(0.5F, 0.1F, -1.5F, 4, 5, 4);
		Box_36.setRotationPoint(0F, -34.5F, 0F);
		Box_36.setTextureSize(128, 256);
		Box_36.mirror = true;
		setRotation(Box_36, 0F, 0F, 0F);
		Box_37 = new ModelRenderer(this, 65, 41);
		Box_37.addBox(0F, 0.1F, -1F, 4, 3, 2);
		Box_37.setRotationPoint(0F, -34.5F, 0F);
		Box_37.setTextureSize(128, 256);
		Box_37.mirror = true;
		setRotation(Box_37, 0F, 0F, 0F);
		Box_38 = new ModelRenderer(this, 89, 41);
		Box_38.addBox(-1.5F, -2.5F, -1.2F, 3, 3, 3);
		Box_38.setRotationPoint(0F, -35F, 0F);
		Box_38.setTextureSize(128, 256);
		Box_38.mirror = true;
		setRotation(Box_38, 0F, 0F, 0F);
		Box_0 = new ModelRenderer(this, 1, 49);
		Box_0.addBox(0.3F, 12F, -2F, 4, 6, 4);
		Box_0.setRotationPoint(0F, -35F, -2.8F);
		Box_0.setTextureSize(128, 256);
		Box_0.mirror = true;
		setRotation(Box_0, 0.27925268F, 0F, 0F);
		Box_1 = new ModelRenderer(this, 57, 49);
		Box_1.addBox(1F, 18F, -2.2F, 3, 9, 4);
		Box_1.setRotationPoint(0F, -32F, -9.5F);
		Box_1.setTextureSize(128, 256);
		Box_1.mirror = true;
		setRotation(Box_1, 0.68067841F, 0F, 0F);
		Box_2 = new ModelRenderer(this, 1, 65);
		Box_2.addBox(0F, 0F, 0F, 18, 7, 41);
		Box_2.setRotationPoint(-9F, -10F, -13F);
		Box_2.setTextureSize(128, 256);
		Box_2.mirror = true;
		setRotation(Box_2, 0F, 0F, 0F);
		Box_3 = new ModelRenderer(this, 1, 121);
		Box_3.addBox(0F, 0F, 0F, 22, 7, 36);
		Box_3.setRotationPoint(-11F, -3F, -8F);
		Box_3.setTextureSize(128, 256);
		Box_3.mirror = true;
		setRotation(Box_3, 0F, 0F, 0F);
		Box_4 = new ModelRenderer(this, 1, 169);
		Box_4.addBox(0F, 0F, 0F, 15, 8, 26);
		Box_4.setRotationPoint(4F, -4F, 2F);
		Box_4.setTextureSize(128, 256);
		Box_4.mirror = true;
		setRotation(Box_4, 0F, 0F, 0F);
		Box_5 = new ModelRenderer(this, 1, 209);
		Box_5.addBox(0F, 7F, 0F, 22, 6, 36);
		Box_5.setRotationPoint(-11F, -3F, -8F);
		Box_5.setTextureSize(128, 256);
		Box_5.mirror = true;
		setRotation(Box_5, 0F, 0F, 0F);
		Box_7 = new ModelRenderer(this, 1, 169);
		Box_7.addBox(0F, 0F, 0F, 15, 8, 26);
		Box_7.setRotationPoint(-19F, -4F, 2F);
		Box_7.setTextureSize(128, 256);
		Box_7.mirror = true;
		setRotation(Box_7, 0F, 0F, 0F);
		Box_8 = new ModelRenderer(this, 73, 49);
		Box_8.addBox(0F, 0F, 0F, 16, 7, 5);
		Box_8.setRotationPoint(-8F, -3F, -13F);
		Box_8.setTextureSize(128, 256);
		Box_8.mirror = true;
		setRotation(Box_8, 0F, 0F, 0F);
		Box_9 = new ModelRenderer(this, 1, 65);
		Box_9.addBox(0F, 0F, 0F, 12, 10, 5);
		Box_9.setRotationPoint(-6F, -6F, -18F);
		Box_9.setTextureSize(128, 256);
		Box_9.mirror = true;
		setRotation(Box_9, 0F, 0F, 0F);
		Box_11 = new ModelRenderer(this, 81, 65);
		Box_11.addBox(0F, 7F, 0F, 16, 6, 5);
		Box_11.setRotationPoint(-8F, -3F, -13F);
		Box_11.setTextureSize(128, 256);
		Box_11.mirror = true;
		setRotation(Box_11, 0F, 0F, 0F);
		Box_13 = new ModelRenderer(this, 81, 81);
		Box_13.addBox(0F, 7F, 0F, 12, 4, 9);
		Box_13.setRotationPoint(-6F, -3F, -22F);
		Box_13.setTextureSize(128, 256);
		Box_13.mirror = true;
		setRotation(Box_13, 0F, 0F, 0F);
		Box_15 = new ModelRenderer(this, 25, 57);
		Box_15.addBox(0F, 0F, 0F, 6, 6, 1);
		Box_15.setRotationPoint(2F, -34.5F, 2F);
		Box_15.setTextureSize(128, 256);
		Box_15.mirror = true;
		setRotation(Box_15, 0.01745329F, -0.2443461F, -0.2443461F);
		Box_16 = new ModelRenderer(this, 41, 57);
		Box_16.addBox(0F, 0F, 0F, 5, 6, 1);
		Box_16.setRotationPoint(7.5F, -36F, 3.5F);
		Box_16.setTextureSize(128, 256);
		Box_16.mirror = true;
		setRotation(Box_16, 0.01745329F, -0.2443461F, 0.12217305F);
		Box_17 = new ModelRenderer(this, 17, 81);
		Box_17.addBox(-6F, 0F, 0F, 6, 6, 1);
		Box_17.setRotationPoint(-2.5F, -34.5F, 1.5F);
		Box_17.setTextureSize(128, 256);
		Box_17.mirror = true;
		setRotation(Box_17, 0.01745329F, 0.2443461F, 0.38397244F);
		Box_18 = new ModelRenderer(this, 17, 89);
		Box_18.addBox(-5F, 0F, 0F, 5, 6, 1);
		Box_18.setRotationPoint(-8F, -37F, 3F);
		Box_18.setTextureSize(128, 256);
		Box_18.mirror = true;
		setRotation(Box_18, 0.01745329F, 0.2443461F, -0.10471976F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Box_20_II.render(f5);
		Box_17_II.render(f5);
		Box_20.render(f5);
		Box_21.render(f5);
		Box_22.render(f5);
		Box_23.render(f5);
		Box_24.render(f5);
		Box_25.render(f5);
		Box_26.render(f5);
		Box_27.render(f5);
		Box_28.render(f5);
		Box_29.render(f5);
		Box_31.render(f5);
		Box_32.render(f5);
		Box_33.render(f5);
		Box_34_II.render(f5);
		Box_35.render(f5);
		Box_36_II.render(f5);
		Box_37_II.render(f5);
		Box_38_II.render(f5);
		Box_40.render(f5);
		Box_41.render(f5);
		Box_43.render(f5);
		Box_44.render(f5);
		Box_34.render(f5);
		Box_36.render(f5);
		Box_37.render(f5);
		Box_38.render(f5);
		Box_0.render(f5);
		Box_1.render(f5);
		Box_2.render(f5);
		Box_3.render(f5);
		Box_4.render(f5);
		Box_5.render(f5);
		Box_7.render(f5);
		Box_8.render(f5);
		Box_9.render(f5);
		Box_11.render(f5);
		Box_13.render(f5);
		Box_15.render(f5);
		Box_16.render(f5);
		Box_17.render(f5);
		Box_18.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}
