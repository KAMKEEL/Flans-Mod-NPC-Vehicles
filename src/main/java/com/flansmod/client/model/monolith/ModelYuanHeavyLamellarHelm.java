//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: YuanHeavyLamellarHelm
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYuanHeavyLamellarHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelYuanHeavyLamellarHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[21];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 54
		headModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box43
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 79
		headModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 80
		headModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box62
		headModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 38
		headModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 39
		headModel[10] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 91
		headModel[11] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 27
		headModel[12] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 136
		headModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 258
		headModel[14] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 260
		headModel[15] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 32
		headModel[16] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 33
		headModel[17] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 34
		headModel[18] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 35
		headModel[19] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 36
		headModel[20] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 37

		headModel[0].addShapeBox(-4F, -7.5F, -4F, 8, 3, 8, 0F,0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.9F, -1F, 0.9F, 0.9F, -1F, 0.9F, 0.9F, -1F, 0.9F, 0.9F, -1F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.3F, -4F, 8, 1, 8, 0F,-1.8F, 1.4F, -1.8F, -1.8F, 1.4F, -1.8F, -1.8F, 1.4F, -1.8F, -1.8F, 1.4F, -1.8F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -14.8F, -0.5F, 1, 4, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 50
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -15.8F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 54
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6F, 4.7F, 16, 12, 1, 0F,0.9F, -0.2F, 0F, -7.1F, -0.2F, 0F, -7.1F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 2F, -5.5F, -0.6F, -6F, -5.5F, -0.6F, -6F, -5.5F, 0.2F, 2F, -5.5F, 0.2F); // Import Box43
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2F, -11.8F, -2F, 4, 1, 4, 0F,-1.5F, -0.2F, -1.5F, -1.5F, -0.2F, -1.5F, -1.5F, -0.2F, -1.5F, -1.5F, -0.2F, -1.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 79
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -12.8F, -1F, 2, 1, 2, 0F,-0.8F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F); // Box 80
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -15.5F, -0.5F, 1, 2, 3, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 1F, 0F, 1.2F, 1F, 0F, 1.2F, 0.5F, 0.8F, 1F, 0.5F, 0.8F, 1F); // Import Box62
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, 0F, -3.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0.5F, -1.2F, 0.5F, 0.5F, -1.2F, 0.5F, 0F, 0.8F, 0F, 0F); // Box 38
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-0.5F, 0F, -3.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0.5F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0F, -1.2F, 0.5F, 0F); // Box 39
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -5F, -3.4F, 8, 5, 1, 0F,0.2F, 0.3F, -4.2F, 0.2F, 0.3F, -4.2F, 0.2F, 0.3F, 3.8F, 0.2F, 0.3F, 3.8F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F); // Box 91
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-0.5F, -13.5F, -0.5F, 1, 2, 3, 0F,1F, 0F, 1.2F, 1F, 0F, 1.2F, 0.5F, -1F, 3F, 0.5F, -1F, 3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F); // Box 27
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -6F, -4F, 8, 2, 1, 0F,0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 136
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -5.3F, -4F, 2, 2, 1, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, -0.5F, -0.7F, 0.9F, -0.5F, -0.7F, 0.9F, -0.5F, -0.3F, 0.9F, -0.5F, -0.3F, 0.9F); // Box 258
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -5.3F, -4F, 2, 2, 1, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, -0.5F, -0.5F, 0.9F, -0.5F, -0.1F, 0.9F, 0F, -0.1F, 0.9F); // Box 260
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-6F, -5.8F, -9F, 1, 12, 18, 0F,-0.8F, 0F, -4.5F, 0.1F, 0F, -4.5F, 0.1F, 0F, -4.2F, -0.8F, 0F, -4.2F, 0.2F, -5.5F, -4.5F, -0.7F, -5.5F, -4.5F, -0.7F, -5.5F, -3.5F, 0.2F, -5.5F, -3.5F); // Box 32
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -1F, -5.5F, 16, 6, 1, 0F,-0.5F, -0.2F, -0.6F, -8.5F, -0.2F, -0.6F, -8.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -2.5F, 0.2F, -8F, -2.5F, 0.2F, -8F, -2.5F, -0.6F, 0F, -2.5F, -0.6F); // Box 33
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-6F, -1F, -5.5F, 6, 6, 1, 0F,-0.5F, 0.7F, -3.6F, -3.5F, -0.2F, -0.6F, -3.5F, -0.2F, 0F, -0.5F, 0.7F, 3F, 0F, -4.5F, -2.8F, -3.8F, -3.5F, 0.1F, -3.8F, -3.5F, -0.6F, 0F, -4.5F, 2.4F); // Box 34
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(0F, -1F, -5.5F, 6, 6, 1, 0F,-3.5F, -0.2F, -0.6F, -0.5F, 0.7F, -3.6F, -0.5F, 0.7F, 3F, -3.5F, -0.2F, 0F, -3.8F, -3.5F, 0.1F, 0F, -4.5F, -2.8F, 0F, -4.5F, 2.4F, -3.8F, -3.5F, -0.6F); // Box 35
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(5F, -5.8F, -9F, 1, 12, 18, 0F,0.1F, 0F, -4.5F, -0.8F, 0F, -4.5F, -0.8F, 0F, -4.2F, 0.1F, 0F, -4.2F, -0.7F, -5.5F, -4.5F, 0.2F, -5.5F, -4.5F, 0.2F, -5.5F, -3.5F, -0.7F, -5.5F, -3.5F); // Box 36
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3F, -5.3F, -4F, 2, 2, 1, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, -0.5F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.1F, 0.9F, -0.5F, -0.1F, 0.9F); // Box 37
		headModel[20].setRotationPoint(0F, 0F, 0F);
	}
}