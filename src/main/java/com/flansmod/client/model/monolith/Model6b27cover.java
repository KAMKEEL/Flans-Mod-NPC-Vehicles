//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Model6b27cover extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public Model6b27cover() //Same as Filename
	{
		headModel = new ModelRendererTurbo[39];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		headModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 35
		headModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 45
		headModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 23
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		headModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 8
		headModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 9
		headModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 10
		headModel[9] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 11
		headModel[10] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 12
		headModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 13
		headModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 14
		headModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		headModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		headModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 17
		headModel[16] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 18
		headModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 19
		headModel[18] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 0
		headModel[19] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 0
		headModel[20] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 1
		headModel[21] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 13
		headModel[22] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 14
		headModel[23] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 15
		headModel[24] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 20
		headModel[25] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 21
		headModel[26] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 22
		headModel[27] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 0
		headModel[28] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		headModel[29] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 1
		headModel[30] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 2
		headModel[31] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 3
		headModel[32] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 4
		headModel[33] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 5
		headModel[34] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 6
		headModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 7
		headModel[36] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 8
		headModel[37] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 9
		headModel[38] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 10

		headModel[0].addShapeBox(-1F, -9F, -4F, 2, 2, 8, 0F,0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -1F, 1.4F, 0.5F, -1F, 1.4F, 1F, -0.5F, 0.8F, 1F, -0.5F, 0.8F, 1F, 1.3F, 2F, 1F, 1.3F, 2F); // Box 32
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-1F, -6.5F, -4F, 2, 2, 8, 0F,1F, 1F, 0.8F, 1F, 1F, 0.8F, 1F, -0.8F, 2F, 1F, -0.8F, 2F, 1F, -0.5F, 2.3F, 1F, -0.5F, 2.3F, 1F, 0.7F, 2.1F, 1F, 0.7F, 2.1F); // Box 34
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -5.4F, -5F, 2, 1, 3, 0F,1F, -0.2F, 0.6F, 1F, -0.2F, 0.6F, 0.9F, 0F, 0F, 1F, 0F, 0F, 1F, -0.6F, 1.3F, 1F, -0.6F, 1.3F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 35
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1.5F, -10F, -4F, 3, 1, 8, 0F,0F, 0F, -2.1F, 0F, 0F, -2.1F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 1F, 1.4F, 0F, 1F, 1.4F); // Box 45
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -0.8F, -4.1F, 10, 1, 1, 0F,-0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 23
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1F, -4.8F, -5F, 2, 1, 3, 0F,1F, 0.2F, 1.3F, 1F, 0.2F, 1.3F, 0.9F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 0
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.6F, -5.4F, -5F, 1, 1, 3, 0F,0.3F, -0.4F, 0.3F, 1.6F, -0.2F, 0.6F, 1.2F, -0.8F, -0.3F, 0.77F, -1F, 0.4F, 0.4F, -0.4F, 0.8F, 1.6F, -0.6F, 1.3F, 1.2F, 0.3F, 0F, 1.7F, 0.9F, 0.5F); // Box 8
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.6F, -4.8F, -5F, 1, 1, 3, 0F,0.4F, 0F, 0.8F, 1.6F, 0.2F, 1.3F, 1.6F, -0.1F, -0.3F, 1.7F, -1.3F, 0.5F, -0.5F, -0.1F, -1.4F, 1.6F, -0.5F, -0.5F, 1.6F, -0.5F, -0.3F, 1F, 1.5F, 5.2F); // Box 9
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.4F, -6.5F, -4F, 1, 2, 3, 0F,0.2F, 1F, 0.4F, 1.4F, 1F, 0.8F, 1F, 0.5F, -0.5F, 0.25F, 0.47F, 0.2F, 0.6F, -0.3F, 1.7F, 1.4F, -0.5F, 2.3F, 0F, 0F, -0.5F, 1.4F, 0.6F, -0.5F); // Box 10
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -9F, -4F, 2, 2, 8, 0F,0F, -0.3F, -0.6F, 0.5F, -0.1F, -0.2F, 0.5F, -1F, 1.4F, 0.3F, -1.3F, 0.5F, 0.6F, -0.5F, 0.4F, 0F, -0.5F, 0.8F, 0F, 1.3F, 2F, 0.9F, 1.3F, 1.2F); // Box 11
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -10F, -4F, 2, 1, 8, 0F,-1F, -0.4F, -2.2F, 0.5F, 0F, -2.1F, 0.5F, -0.7F, 0.2F, -0.9F, -1F, -0.5F, 0F, 0.3F, -0.6F, 0.5F, 0.1F, -0.2F, 0.5F, 1F, 1.4F, 0.3F, 1.3F, 0.5F); // Box 12
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.4F, -6.5F, -2F, 2, 2, 4, 0F,0F, 0.47F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.15F, -0.2F, 0F, 1.37F, 0.5F, -0.5F, 0.7F, 0F, 0.4F, 0.7F, 1.5F, 1.4F, 1.47F, 0.45F, 0.76F); // Box 13
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.5F, -5.4F, -1.3F, 1, 1, 3, 0F,0.15F, 1.45F, -0.5F, 1F, -0.2F, -0.5F, 1F, -0.9F, 1F, 0.3F, 0.75F, 1.3F, 1.6F, -0.2F, -0.5F, 1F, -0.2F, -0.5F, 1F, 0.4F, 1F, 1.8F, 0.4F, 1.3F); // Box 14
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.5F, -5.4F, -1.3F, 1, 1, 1, 0F,0.5F, -0.61F, 4.4F, 1F, -0.8F, 0.8F, 1F, -0.2F, -0.5F, 0.19F, 1.45F, -0.5F, 1.8F, 0.9F, 0.2F, 1F, 0F, 0.5F, 1F, -0.2F, -0.5F, 1.6F, -0.2F, -0.5F); // Box 15
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5.5F, -1F, -0.3F, 1, 1, 3, 0F,0.8F, 2.5F, 1.2F, -0.6F, 2.8F, 1.2F, -0.8F, 0.9F, 2F, 1.2F, 0.9F, 1F, 0.9F, -2.4F, -0.1F, -0.7F, -2.5F, -0.1F, -0.7F, -2.1F, -1.4F, 1F, -2F, -1.4F); // Box 16
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.5F, -5.2F, 2.7F, 1, 1, 1, 0F,0.8F, -0.3F, -0.3F, 0F, -0.7F, 0F, -1F, -1.8F, 0.5F, 1.2F, -2F, 0F, 1.8F, 0.2F, -0.3F, 0F, 0F, 0F, -1F, 1.85F, 0.5F, 2.2F, 2.3F, 0F); // Box 17
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-5.5F, -5.4F, -1.3F, 1, 1, 3, 0F,0.6F, -0.8F, -0.5F, -1F, -0.8F, -0.5F, -1F, -1.4F, 1.3F, 0.8F, -1.4F, 1.3F, 0.8F, 0.9F, 0.2F, -1F, 0.5F, 0F, -1F, 2.2F, 2F, 1.2F, 2.5F, 2F); // Box 18
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.4F, -6.5F, 2F, 1, 1, 2, 0F,0.15F, -0.2F, 0F, 1F, -0.2F, 0F, 1.4F, -0.8F, 2F, 0.5F, -0.8F, 1.2F, 1.9F, 1.5F, -1F, 1F, 1.4F, -1.5F, 1.4F, 1.7F, 2.1F, 0.9F, 1.7F, 1.1F); // Box 19
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4.6F, -3.1F, 3F, 1, 1, 1, 0F,1.7F, 0.9F, 0F, 1F, 0.4F, 0F, 1.6F, 0.7F, 2.1F, 0.7F, 0.7F, 1.1F, 2.1F, 0.2F, -0.7F, 1.6F, -1F, 0F, 1.6F, 0.1F, 1.8F, 0.7F, 0.2F, 0.7F); // Box 0
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4.4F, -4.2F, -2.05F, 1, 3, 1, 0F,-0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -0.1F, 0F, -0.4F, 0.3F, -0.3F, -0.2F, -0.9F, -0.3F, -0.2F, -0.9F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F); // Box 0
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(4.1F, -1.2F, -2.05F, 1, 1, 1, 0F,0F, 0.3F, -0.2F, -0.6F, 0.3F, -0.2F, -0.6F, 0.05F, -0.2F, 0F, 0.05F, -0.2F, 0.2F, -0.1F, 1.7F, -0.9F, -0.1F, 1.7F, -1F, 0.2F, -2.3F, 0.2F, 0.2F, -2.3F); // Box 1
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-5.4F, -4.2F, -2.05F, 1, 3, 1, 0F,-0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.9F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -0.9F, -0.3F, -0.2F); // Box 13
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-5.4F, -2.2F, 1.95F, 1, 1, 1, 0F,-1.2F, 0.3F, -2.2F, 0.6F, 0.3F, -2.2F, 0.6F, 0F, 1.8F, -1.2F, 0F, 1.8F, -0.9F, -0.3F, 3.8F, 0.3F, -0.3F, 3.8F, 0.3F, 0F, -4.2F, -0.9F, 0F, -4.2F); // Box 14
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-5.1F, -1.2F, -2.05F, 1, 1, 1, 0F,-0.6F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.9F, -0.1F, 1.7F, 0.2F, -0.1F, 1.7F, 0.2F, 0.2F, -2.3F, -1F, 0.2F, -2.3F); // Box 15
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(4.4F, -2.2F, 1.95F, 1, 1, 1, 0F,0.6F, 0.3F, -2.2F, -1.2F, 0.3F, -2.2F, -1.2F, 0F, 1.8F, 0.6F, 0F, 1.8F, 0.3F, -0.3F, 3.8F, -0.9F, -0.3F, 3.8F, -0.9F, 0F, -4.2F, 0.3F, 0F, -4.2F); // Box 20
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(3.5F, -2.6F, 3.95F, 1, 1, 1, 0F,3.7F, 0.4F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, 3.7F, 0.4F, -0.2F, 3.7F, -1F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, 3.7F, -1F, -0.2F); // Box 21
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-4.5F, -2.6F, 3.95F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.2F, 3.7F, 0.4F, -0.2F, 3.7F, 0.4F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, 3.7F, -1F, -0.2F, 3.7F, -1F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 22
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-1F, -5.5F, -4F, 2, 2, 8, 0F,1F, 1F, -2F, 1F, 1F, -2F, 1F, -1.7F, 2.1F, 1F, -1.7F, 2.1F, 1F, -1.7F, -1.4F, 1F, -1.7F, -1.4F, 1F, 1.5F, 1.8F, 1F, 1.5F, 1.8F); // Box 0
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(2F, -10F, -4F, 2, 1, 8, 0F,0.5F, 0F, -2.1F, -1F, -0.4F, -2.2F, -0.9F, -1F, -0.5F, 0.5F, -0.7F, 0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.3F, -0.6F, 0.3F, 1.3F, 0.5F, 0.5F, 1F, 1.4F); // Box 0
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(2F, -9F, -4F, 2, 2, 8, 0F,0.5F, -0.1F, -0.2F, 0F, -0.3F, -0.6F, 0.3F, -1.3F, 0.5F, 0.5F, -1F, 1.4F, 0F, -0.5F, 0.8F, 0.6F, -0.5F, 0.4F, 0.9F, 1.3F, 1.2F, 0F, 1.3F, 2F); // Box 1
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(3.4F, -6.5F, 2F, 1, 1, 2, 0F,1F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.5F, -0.8F, 1.2F, 1.4F, -0.8F, 2F, 1F, 1.4F, -1.5F, 1.9F, 1.5F, -1F, 0.9F, 1.7F, 1.1F, 1.4F, 1.7F, 2.1F); // Box 2
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(3.6F, -3.1F, 3F, 1, 1, 1, 0F,1F, 0.4F, 0F, 1.7F, 0.9F, 0F, 0.7F, 0.7F, 1.1F, 1.6F, 0.7F, 2.1F, 1.6F, -1F, 0F, 2.1F, 0.2F, -0.7F, 0.7F, 0.2F, 0.7F, 1.6F, 0.1F, 1.8F); // Box 3
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(3.4F, -6.5F, -4F, 1, 2, 3, 0F,1.4F, 1F, 0.8F, 0.2F, 1F, 0.4F, 0.25F, 0.47F, 0.2F, 1F, 0.5F, -0.5F, 1.4F, -0.5F, 2.3F, 0.6F, -0.3F, 1.7F, 1.4F, 0.6F, -0.5F, 0F, 0F, -0.5F); // Box 4
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(3.6F, -4.8F, -5F, 1, 1, 3, 0F,1.6F, 0.2F, 1.3F, 0.4F, 0F, 0.8F, 1.7F, -1.3F, 0.5F, 1.6F, -0.1F, -0.3F, 1.6F, -0.5F, -0.5F, -0.5F, -0.1F, -1.4F, 1F, 1.5F, 5.2F, 1.6F, -0.5F, -0.3F); // Box 5
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(2.4F, -6.5F, -2F, 2, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0.47F, -0.5F, 0.15F, -0.2F, 0F, 1F, 0F, 0F, 0.7F, 0F, 0.4F, 1.37F, 0.5F, -0.5F, 1.47F, 0.45F, 0.76F, 0.7F, 1.5F, 1.4F); // Box 6
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(3.5F, -5.4F, -1.3F, 1, 1, 1, 0F,1F, -0.8F, 0.8F, 0.5F, -0.61F, 4.4F, 0.19F, 1.45F, -0.5F, 1F, -0.2F, -0.5F, 1F, 0F, 0.5F, 1.8F, 0.9F, 0.2F, 1.6F, -0.2F, -0.5F, 1F, -0.2F, -0.5F); // Box 7
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(3.5F, -5.4F, -1.3F, 1, 1, 3, 0F,1F, -0.2F, -0.5F, 0.15F, 1.45F, -0.5F, 0.3F, 0.75F, 1.3F, 1F, -0.9F, 1F, 1F, -0.2F, -0.5F, 1.6F, -0.2F, -0.5F, 1.8F, 0.4F, 1.3F, 1F, 0.4F, 1F); // Box 8
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(4.5F, -5.4F, -1.3F, 1, 1, 3, 0F,-1F, -0.8F, -0.5F, 0.6F, -0.8F, -0.5F, 0.8F, -1.4F, 1.3F, -1F, -1.4F, 1.3F, -1F, 0.5F, 0F, 0.8F, 0.9F, 0.2F, 1.2F, 2.5F, 2F, -1F, 2.2F, 2F); // Box 9
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(4.5F, -1F, -0.3F, 1, 1, 3, 0F,-0.6F, 2.8F, 1.2F, 0.8F, 2.5F, 1.2F, 1.2F, 0.9F, 1F, -0.8F, 0.9F, 2F, -0.7F, -2.5F, -0.1F, 0.9F, -2.4F, -0.1F, 1F, -2F, -1.4F, -0.7F, -2.1F, -1.4F); // Box 10
		headModel[38].setRotationPoint(0F, 0F, 0F);
	}
}