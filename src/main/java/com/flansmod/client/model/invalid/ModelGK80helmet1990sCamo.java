//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GK80helmet
// Model Creator: 
// Created on: 03.05.2021 - 19:04:11
// Last changed on: 03.05.2021 - 19:04:11

package com.flansmod.client.model.invalid; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGK80helmet1990sCamo extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelGK80helmet1990sCamo() //Same as Filename
	{
		headModel = new ModelRendererTurbo[25];
		headModel[0] = new ModelRendererTurbo(this, 26, 12, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 22, 11, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 23, 9, textureX, textureY); // Box 32
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		headModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 35
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 36
		headModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 45
		headModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 23
		headModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		headModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 26, 13, textureX, textureY); // Box 7
		headModel[11] = new ModelRendererTurbo(this, 24, 10, textureX, textureY); // Box 8
		headModel[12] = new ModelRendererTurbo(this, 35, 10, textureX, textureY); // Box 9
		headModel[13] = new ModelRendererTurbo(this, 24, 11, textureX, textureY); // Box 10
		headModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 11
		headModel[15] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 12
		headModel[16] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 13
		headModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		headModel[18] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 1
		headModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		headModel[20] = new ModelRendererTurbo(this, 23, 12, textureX, textureY); // Box 3
		headModel[21] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 4
		headModel[22] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 5
		headModel[23] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 6
		headModel[24] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import 

		headModel[0].addShapeBox(2F, -8F, -4F, 2, 2, 8, 0F, 1F, 0.8F, 0.5F, 0.2F, 0.6F, -0.5F, 0.2F, -0.1F, 0.325F, 1F, 0.2F, 0.925F, 0F, -1.2F, 1.375F, 0.9F, -1F, 0.625F, 0.9F, 0.3F, 0.825F, 0F, 0.3F, 1.625F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(2F, -9.9F, -4F, 2, 1, 8, 0F, 1F, 0.3F, -2.5F, -1.4F, 0F, -2.7F, -1.4F, -0.3F, -1.575F, 1F, 0F, -1.075F, 1F, 0.1F, 0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 1F, 0.325F, 1F, 0.7F, 0.925F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -8F, -4F, 2, 2, 8, 0F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.2F, 0.925F, 0F, 0.2F, 0.925F, 1F, -1.2F, 1.375F, 1F, -1.2F, 1.375F, 1F, 0.3F, 1.625F, 1F, 0.3F, 1.625F); // Box 32
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -6.5F, -4F, 2, 1, 8, 0F, 1F, 0.7F, 1.375F, 1F, 0.7F, 1.375F, 1F, -0.8F, 1.625F, 1F, -0.8F, 1.625F, 1F, 0.4F, 1.9F, 1F, 0.4F, 1.9F, 1F, 1.9F, 1.9F, 1F, 1.9F, 1.9F); // Box 34
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -5.4F, -5F, 2, 1, 5, 0F, 1F, -0.3F, 0.9F, 1F, -0.3F, 0.9F, 0.9F, -1.2F, 0F, 1F, -1.3F, 0F, 1F, -0.3F, 2F, 1F, -0.3F, 2F, 1F, 0.8F, 0F, 1F, 0.8F, 0F); // Box 35
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2F, -5.4F, 1.4F, 4, 1, 4, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, -1.7F, 0.5F, 0F, -1.7F, 0.5F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 1.5F, 1.1F, 0F, 1.5F, 1.1F); // Box 36
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -9.9F, -4F, 2, 1, 8, 0F, 0F, 0.3F, -2.5F, 0F, 0.3F, -2.5F, 0F, 0F, -1.075F, 0F, 0F, -1.075F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.7F, 0.925F, 0F, 0.7F, 0.925F); // Box 45
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -0.8F, -4.1F, 10, 1, 1, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 23
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-6F, -3F, -0.5F, 1, 3, 1, 0F, -0.4F, 0.6F, 0F, -0.1F, 0.7F, 0F, 0F, 0.5F, 0F, -0.5F, 0.425F, 0F, -1.8F, -0.4F, 3.5F, 1.2F, -0.4F, 3.5F, 1.2F, -0.2F, -3.7F, -1.8F, -0.2F, -3.7F); // Box 5
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -6.5F, -4F, 1, 2, 2, 0F, 0.9F, 0.5F, 0.375F, 1F, 0.7F, 1.375F, 1F, -0.8F, 1.5F, 0.9F, 0.18F, 0F, 1.25F, -0.4F, 0.9F, 1F, -0.6F, 1.9F, 1F, 0.5F, 1.4F, 1.45F, 0.3F, 0F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -8F, -4F, 2, 2, 8, 0F, 0.2F, 0.6F, -0.5F, 1F, 0.8F, 0.5F, 1F, 0.2F, 0.925F, 0.2F, -0.1F, 0.325F, 0.9F, -1F, 0.375F, 0F, -1.2F, 1.375F, 0F, 0.3F, 1.625F, 0.9F, 0.3F, 0.825F); // Box 7
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -9.9F, -4F, 2, 1, 8, 0F, -1.4F, 0F, -2.7F, 1F, 0.3F, -2.5F, 1F, 0F, -1.075F, -1.4F, -0.3F, -1.575F, 0.2F, 0.3F, -0.5F, 1F, 0.1F, 0.5F, 1F, 0.7F, 0.925F, 0.2F, 1F, 0.325F); // Box 8
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -6.5F, -2F, 1, 1, 4, 0F, 0.9F, 0.18F, 0F, 1F, -0.8F, 1.5F, 1F, 0F, 1.7F, 0.9F, -0.35F, 0F, 1.45F, 1.3F, 0F, 1F, 1.2F, 1.4F, 1F, 0.2F, 1.9F, 1.45F, 1.8F, -0.4F); // Box 9
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -6.5F, 2F, 1, 1, 2, 0F, 0.9F, -0.35F, 0F, 1F, 0F, 1.7F, 1F, -0.8F, 1.625F, 0.9F, -0.8F, 0.825F, 1.45F, 1.8F, 0.4F, 1F, -0.8F, 1.9F, 1.05F, 2F, 1.9F, 1.25F, 2.1F, 1F); // Box 10
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-6F, -5.4F, 1.4F, 4, 1, 4, 0F, -0.55F, -1.7F, -0.2F, 0F, -1.2F, 0F, 0F, -1.7F, 0.5F, -0.75F, -2F, -0.4F, 0.05F, 1.3F, -0.2F, 0F, -0.3F, -1F, 0F, 1.5F, 1.1F, -0.45F, 1.4F, 0F); // Box 11
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-6F, -5.4F, -2.4F, 4, 1, 5, 0F, -0.55F, -1.2F, -0.4F, 0F, 0F, 0.25F, 0F, -1.2F, 0F, -0.55F, -1.7F, -1F, 0.05F, 0.8F, -0.4F, 0F, 0F, 0.85F, 0F, -0.1F, -1F, 0.05F, 1.3F, -1F); // Box 12
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -5.4F, -5F, 1, 1, 3, 0F, 1.25F, -0.5F, -0.1F, 1F, -0.3F, 0.9F, 1F, -1.3F, 0F, 1.45F, -1.2F, 0F, 1.45F, 0F, 0.4F, 1F, -0.3F, 2F, 1F, 0.5F, 0F, 2.05F, 0.8F, 0F); // Box 13
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(5F, -3F, -0.5F, 1, 3, 1, 0F, -0.1F, 0.7F, 0F, -0.4F, 0.6F, 0F, -0.5F, 0.425F, 0F, 0F, 0.5F, 0F, 1.2F, -0.4F, 3.5F, -1.8F, -0.4F, 3.5F, -1.8F, -0.2F, -3.7F, 1.2F, -0.2F, -3.7F); // Box 0
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(3F, -5.4F, -5F, 1, 1, 3, 0F, 1F, -0.3F, 0.9F, 1.25F, -0.5F, -0.1F, 1.45F, -1.2F, 0F, 1F, -1.3F, 0F, 1F, -0.3F, 2F, 1.45F, 0F, 0.4F, 2.05F, 0.8F, 0F, 1F, 0.5F, 0F); // Box 1
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(3F, -6.5F, -4F, 1, 2, 2, 0F, 1F, 0.7F, 1.375F, 0.9F, 0.5F, 0.625F, 0.9F, 0.18F, 0F, 1F, -0.8F, 1.5F, 1F, -0.6F, 1.9F, 1.25F, -0.4F, 0.9F, 1.45F, 0.3F, 0F, 1F, 0.5F, 1.4F); // Box 2
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3F, -6.5F, -2F, 1, 1, 4, 0F, 1F, -0.8F, 1.5F, 0.9F, 0.18F, 0F, 0.9F, -0.35F, 0F, 1F, 0F, 1.7F, 1F, 1.2F, 1.4F, 1.45F, 1.3F, 0F, 1.45F, 1.8F, -0.4F, 1F, 0.2F, 1.9F); // Box 3
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(2F, -5.4F, -2.4F, 4, 1, 5, 0F, 0F, 0F, 0.25F, -0.55F, -1.2F, -0.4F, -0.55F, -1.7F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0.85F, 0.05F, 0.8F, -0.4F, 0.05F, 1.3F, -1F, 0F, -0.1F, -1F); // Box 4
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(2F, -5.4F, 1.4F, 4, 1, 4, 0F, 0F, -1.2F, 0F, -0.55F, -1.7F, -0.2F, -0.75F, -2F, -0.4F, 0F, -1.7F, 0.5F, 0F, -0.3F, -1F, 0.05F, 1.3F, -0.2F, -0.45F, 1.4F, 0F, 0F, 1.5F, 1.1F); // Box 5
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(3F, -6.5F, 2F, 1, 1, 2, 0F, 1F, 0F, 1.7F, 0.9F, -0.35F, 0F, 0.9F, -0.8F, 0.825F, 1F, -0.8F, 1.625F, 1F, -0.8F, 1.9F, 1.45F, 1.8F, 0.4F, 1.25F, 2.1F, 1F, 1.05F, 2F, 1.9F); // Box 6
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-0.5F, -7F, -5.8F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		headModel[24].setRotationPoint(0F, 0F, 0F);


	}
}