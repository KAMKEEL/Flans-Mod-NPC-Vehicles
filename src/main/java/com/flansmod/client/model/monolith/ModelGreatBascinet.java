//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GreatBascinet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGreatBascinet extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelGreatBascinet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[22];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		headModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 21
		headModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 28
		headModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 29
		headModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		headModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		headModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 32
		headModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 33
		headModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 19
		headModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 20
		headModel[13] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 21
		headModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 22
		headModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 23
		headModel[16] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 24
		headModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 25
		headModel[18] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 26
		headModel[19] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 27
		headModel[20] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 28
		headModel[21] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 29

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.5F, 0.3F, 0.6F, 0.5F, 0.3F, 0.6F, 0.5F, -1F, 3F, 0.5F, -1F, 3F, 0.8F, 0F, 1.3F, 0.8F, 0F, 1.3F, 0.8F, 2F, 2.4F, 0.8F, 2F, 2.4F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.3F, -5F, -4F, 1, 5, 6, 0F,0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0.2F, -3F, -0.5F, 0.2F, -3F, -0.5F, 0.2F, 1F, 0.5F, 0.2F, 1F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5F, 3F, 8, 5, 1, 0F,0.8F, -1F, 1.3F, 0.8F, -1F, 1.3F, 0.8F, -2F, 2.4F, 0.8F, -2F, 2.4F, 0.8F, 0.2F, 0.3F, 0.8F, 0.2F, 0.3F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F); // Box 20
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(4.7F, -5F, -4F, 1, 5, 6, 0F,0.8F, 0F, 1.3F, -0.9F, 0F, 1.3F, -0.9F, -1F, 0.8F, 0.8F, -1F, 0.8F, 0.8F, 0.2F, -2.7F, -0.9F, 0.2F, -2.7F, -0.9F, 0.2F, 1.3F, 0.8F, 0.2F, 1.3F); // Box 21
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-1F, 1.5F, -2.5F, -1F, 1.5F, -2.5F, -1F, 0.5F, 2F, -1F, 0.5F, 2F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.6F, 0.5F, 1.8F, 3F, 0.5F, 1.8F, 3F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4.5F, -3F, -4.7F, 1, 3, 4, 0F,-0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 28
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4.5F, -7F, -4.7F, 1, 3, 4, 0F,-0.2F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, -0.7F, -0.2F, 0.5F, -0.7F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F); // Box 29
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4.5F, -7.5F, -1.7F, 1, 2, 2, 0F,-0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 30
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5.5F, -3F, -4.7F, 1, 3, 4, 0F,-0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 31
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.5F, -7.5F, -1.7F, 1, 2, 2, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.5F, 0.5F, -0.8F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 32
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5.5F, -7F, -4.7F, 1, 3, 4, 0F,-0.5F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0.5F, -0.7F, -0.5F, 0.5F, -0.7F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F); // Box 33
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -12.8F, -4F, 8, 1, 8, 0F,-3.8F, 0F, -7.5F, -3.8F, 0F, -7.5F, -3.8F, -0.2F, 0.3F, -3.8F, -0.2F, 0.3F, -1F, 0.5F, -2.5F, -1F, 0.5F, -2.5F, -1F, 1.5F, 2F, -1F, 1.5F, 2F); // Box 19
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5F, -7.5F, -9F, 19, 9, 9, 0F,-3F, -1.5F, -0.5F, -12F, -1.5F, -0.5F, -9F, 0.5F, -4.7F, 0F, 0.5F, -4.7F, -2.5F, -5F, 0.5F, -11.5F, -5F, 0.5F, -8.7F, -5F, -5.2F, 0.3F, -5F, -5.2F); // Box 20
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, -3.5F, -9F, 19, 9, 9, 0F,-2.5F, 0F, 0.5F, -11.5F, 0F, 0.5F, -8.7F, 0F, -5.2F, 0.3F, 0F, -5.2F, -3F, -6F, -0.5F, -12F, -6F, -0.5F, -8.8F, -5.5F, -4.7F, 0.2F, -5.5F, -4.7F); // Box 21
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0.5F, -7.3F, -7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.4F, 0.3F, 0.5F, -0.4F, 0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 22
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3.5F, -7.3F, -7.5F, 2, 1, 1, 0F,0F, -0.3F, -0.5F, -1F, -0.8F, -1.5F, -1F, -0.8F, 2.5F, 0F, -0.3F, 0.5F, 0.5F, -0.4F, -0.2F, -0.7F, 0.4F, -1.5F, -0.7F, 0.4F, 2.5F, 1F, 0F, 0.5F); // Box 23
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2.5F, -7.3F, -7F, 2, 1, 1, 0F,1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 0.5F, -0.4F, 0.3F, -0.5F, -0.4F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 24
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-5.5F, -7.3F, -7.5F, 2, 1, 1, 0F,-1F, -0.8F, -1.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0.5F, -1F, -0.8F, 2.5F, -0.7F, 0.4F, -1.5F, 0.5F, -0.4F, -0.2F, 1F, 0F, 0.5F, -0.7F, 0.4F, 2.5F); // Box 25
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, 0F, 1F, 4, 2, 3, 0F,0.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.6F, 0.2F, 0F, 1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 1F, -0.5F, 1F); // Box 26
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, 0F, -5F, 4, 2, 6, 0F,0.6F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.6F, 0.2F, 0F, 1.5F, 0F, -1F, 0F, 1.5F, 1F, 0F, -1F, 0F, 1.5F, -1.5F, 0F); // Box 27
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(0F, 0F, -5F, 4, 2, 6, 0F,0F, 0.2F, 0F, 0.6F, 0.2F, -1F, 0.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 1F, 1.5F, 0F, 0F, 1.5F, -1.5F, 0F, 0F, -1F, 0F); // Box 28
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(0F, 0F, 1F, 4, 2, 3, 0F,0F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 1.5F, -1.5F, 0F, 1F, -0.5F, 1F, 0F, 0.5F, 1F); // Box 29
		headModel[21].setRotationPoint(0F, 0F, 0F);
	}
}