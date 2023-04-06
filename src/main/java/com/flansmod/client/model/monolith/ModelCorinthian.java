//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Corinthian
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCorinthian extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelCorinthian() //Same as Filename
	{
		headModel = new ModelRendererTurbo[25];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 31
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		headModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 18
		headModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19
		headModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 20
		headModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
		headModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 22
		headModel[10] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 23
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		headModel[12] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 25
		headModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 26
		headModel[14] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 27
		headModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 28
		headModel[16] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 29
		headModel[17] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 19
		headModel[18] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 20
		headModel[19] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 32
		headModel[20] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 33
		headModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
		headModel[22] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 35
		headModel[23] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 36
		headModel[24] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 37

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.5F, -4F, 8, 1, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0.4F, 0.9F, 0.9F, 0.4F, 0.9F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3.75F, -5.5F, -4.8F, 1, 3, 4, 0F,0.25F, 0F, 0.05F, 0F, 0F, 0F, 0.1F, 0F, 0.5F, 0.2F, 0F, 0.5F, 2.8F, 4.5F, 1F, -0.8F, 3F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 31
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0.75F, -3F, -4.8F, 2, 5, 1, 0F,0F, -0.2F, 0.5F, -0.1F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, 0F, 1F, -1F, -2F, 0.7F, -1F, -2F, 0F, 0F, 0F, -1.5F); // Box 17
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2.75F, -3F, -4.8F, 2, 5, 1, 0F,-0.1F, 0F, 0.3F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -2F, 0.7F, -0.2F, 0F, 1F, 0F, 0F, -1.5F, -1F, -2F, 0F); // Box 18
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.75F, -5.5F, -4.8F, 1, 3, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0.05F, 0.2F, 0F, 0.5F, 0.1F, 0F, 0.5F, -0.8F, 3F, 0F, 2.8F, 4.5F, 1F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3.5F, -6F, -4.8F, 2, 2, 1, 0F,0.2F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0.2F, 0.25F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, 0.2F, 0F); // Box 20
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1.5F, -6F, -4.8F, 2, 2, 1, 0F,0F, 0F, 0F, 0.2F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, -0.55F, 0.2F, 0.25F, 0F, 0.2F, 0F, 0F, -0.2F, 0F); // Box 21
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.5F, -6F, -4.8F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, -0.2F, 0.2F); // Box 22
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.5F, -4F, -4.95F, 1, 2, 1, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F); // Box 23
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0.5F, -6F, -4.8F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.5F, 0F, 0.2F); // Box 24
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -1.6F, -4.95F, 1, 1, 1, 0F,-0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 25
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, -5.5F, 1.8F, 10, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F); // Box 26
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.85F, -5.5F, -0.2F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 27
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-5F, -4.5F, 1.8F, 10, 3, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0.1F, -0.1F, -1F, 0.1F, -0.1F, -0.7F, -1F, -0.1F, -0.7F, -1F, -0.1F, 0F, 1F, -0.1F, 0F, 1F); // Box 28
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.85F, -5.5F, -0.2F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 29
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -11.3F, -3.5F, 1, 1, 8, 0F,-0.1F, 0F, -2.2F, -0.1F, 0F, -2.2F, -0.1F, 0F, -2.2F, -0.1F, 0F, -2.2F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0.5F, 0.1F, -0.1F, 0.5F, 0.1F); // Box 19
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-0.5F, -9.5F, 2.5F, 1, 3, 2, 0F,-0.1F, 0.3F, 0.1F, -0.1F, 0.3F, 0.1F, -0.1F, 0.3F, 0.1F, -0.1F, 0.3F, 0.1F, -0.1F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, -0.1F, -0.5F, 1.2F, -0.1F, -0.5F, 1.2F); // Box 20
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-0.5F, -9.5F, -3.5F, 1, 3, 6, 0F,-0.1F, 0.8F, 0.1F, -0.1F, 0.8F, 0.1F, -0.1F, 0.3F, 0.1F, -0.1F, 0.3F, 0.1F, -0.1F, -0.5F, -1.3F, -0.1F, -0.5F, -1.3F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F); // Box 32
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-0.5F, -15.3F, -1.5F, 1, 4, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 33
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-0.5F, -15.3F, -3.5F, 1, 4, 2, 0F,0.15F, -2.5F, 3.5F, 0.15F, -2.5F, 3.5F, 0.15F, -0.5F, -1F, 0.15F, -0.5F, -1F, -0.15F, 1F, 0F, -0.15F, 1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 34
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.5F, -15.3F, 2.5F, 1, 4, 4, 0F,0.15F, -0.5F, -1F, 0.15F, -0.5F, -1F, 0.15F, -3.5F, 1F, 0.15F, -3.5F, 1F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 1.3F, -2F, -0.15F, 1.3F, -2F); // Box 35
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-0.5F, -10F, 4.5F, 1, 3, 3, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 1.85F, 0F, 0.15F, 1.85F, 0F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, 0.15F, 1F, -1F, 0.15F, 1F, -1F); // Box 36
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-0.5F, -9.8F, 7.5F, 1, 3, 3, 0F,0.15F, 2F, 0F, 0.15F, 2F, 0F, -0.15F, -9F, -2.5F, -0.15F, -9F, -2.5F, 0.15F, 1F, 1F, 0.15F, 1F, 1F, -0.15F, 8F, -3.2F, -0.15F, 8F, -3.2F); // Box 37
		headModel[24].setRotationPoint(0F, 0F, 0F);
	}
}