//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CarabinierHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCarabinierHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCarabinierHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[22];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 26
		headModel[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 28
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		headModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 14
		headModel[8] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 29
		headModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 38
		headModel[10] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 39
		headModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 14
		headModel[12] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 15
		headModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 16
		headModel[14] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 17
		headModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 18
		headModel[16] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 19
		headModel[17] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 20
		headModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		headModel[19] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 12
		headModel[20] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 41
		headModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50

		headModel[0].addShapeBox(-4F, -9F, -4F, 4, 3, 8, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 1.3F, 0.2F, 0F, 1.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 1.5F, 0.9F, -0.5F, 1.5F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.5F, -3.3F, 8, 1, 8, 0F,-2F, 0.2F, -3.3F, -2F, 0.2F, -3.3F, -2F, 0F, -1F, -2F, 0F, -1F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.5F, -5F, 8, 2, 9, 0F,0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, 0.4F, 0.9F, 0.9F, 0.4F, 0.9F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -5.5F, 0.8F, 10, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, 0.2F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F, 1F, 0F, -0.1F, 1F, 0F); // Box 26
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -4.5F, 0.8F, 10, 4, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -2F, 0.1F, -0.1F, -2F, 0.1F, -0.1F, -1.7F, -1F, -0.1F, -1.7F, -1F, -0.1F, 0.5F, 1.5F, -0.1F, 0.5F, 1.5F); // Box 28
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2F, -9F, 3F, 4, 3, 1, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 1.3F, 0.2F, 0F, 1.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 1.5F, 0.9F, -0.5F, 1.5F); // Box 3
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -9F, -3.8F, 1, 1, 1, 0F,2.2F, 0F, -0.4F, 2.2F, 0F, -0.4F, 2.2F, 0F, 1F, 2.2F, 0F, 1F, 2.2F, 1.5F, 0.9F, 2.2F, 1.5F, 0.9F, 2.2F, 1.5F, 1.2F, 2.2F, 1.5F, 1.2F); // Box 10
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -5.5F, -8.5F, 9, 1, 2, 0F,-1.8F, -0.8F, -1.3F, -1.8F, -0.8F, -1.3F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -1.8F, 0.9F, 0.3F, -1.8F, 0.9F, 0.3F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F); // Box 14
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -6F, -6.5F, 9, 1, 3, 0F,0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 1F, 1F, 0.1F, 1F, 1F, 0.1F, -1.3F, 0F, 4.3F, -1.3F, 0F, 4.3F); // Box 29
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -7F, -6F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3F, -9F, -5F, 6, 2, 1, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1F, -7.5F, 6.1F, 2, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, -0.4F, 0.3F, 0.5F, -0.4F); // Box 14
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1F, -11.5F, 6.1F, 2, 4, 1, 0F,0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 15
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -14.5F, 6.1F, 2, 3, 1, 0F,0.3F, 0.7F, 3F, 0.3F, 0.7F, 3F, 0.3F, -1F, -1.5F, 0.3F, -1F, -1.5F, 0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 16
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1F, -15F, 1.1F, 2, 2, 3, 0F,0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.2F, -1F, 0.3F, 0.2F, -1F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0.6F, 0.3F, 0.5F, 0.6F); // Box 17
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-1F, -15F, -1.9F, 2, 2, 3, 0F,0.3F, 1F, 1.3F, 0.3F, 1F, 1.3F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.5F, 0.6F, 0.3F, 0.5F, 0.6F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F); // Box 18
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -14F, 0.1F, 1, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -12F, 4.1F, 1, 8, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1F, -5F, 6.1F, 2, 2, 1, 0F,0.3F, 0F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0F, 0F, 1.3F, 0F, 0F, 1.3F); // Box 21
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -4.5F, -3F, 8, 5, 1, 0F,1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, 1.2F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F); // Box 12
		headModel[19].setRotationPoint(0F, 0F, 0F);
		headModel[19].rotateAngleX = -0.12217305F;

		headModel[20].addShapeBox(-2F, -5.5F, -3F, 4, 1, 1, 0F,3.5F, 0.2F, 0F, 3.5F, 0.2F, 0F, 3.5F, 0.2F, 0.5F, 3.5F, 0.2F, 0.5F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F); // Box 41
		headModel[20].setRotationPoint(0F, 0F, 0F);
		headModel[20].rotateAngleX = -0.12217305F;

		headModel[21].addShapeBox(0F, -9F, -4F, 4, 3, 8, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 1.3F, 0.2F, 0F, 1.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 1.5F, 0.9F, -0.5F, 1.5F); // Box 50
		headModel[21].setRotationPoint(0F, 0F, 0F);
	}
}