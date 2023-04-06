//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: IrishPlate
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIrishSegmentata extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelIrishSegmentata() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[6];
		leftLegModel = new ModelRendererTurbo[9];
		rightLegModel = new ModelRendererTurbo[9];
		skirtFrontModel = new ModelRendererTurbo[2];
		skirtRearModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 42
		bodyModel[1] = new ModelRendererTurbo(this, 0, 53, textureX, textureY); // Box 73
		bodyModel[2] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Box 74
		bodyModel[3] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 75
		bodyModel[4] = new ModelRendererTurbo(this, 0, 53, textureX, textureY); // Box 165
		bodyModel[5] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 166
		bodyModel[6] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Box 167
		bodyModel[7] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 52
		bodyModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 53
		bodyModel[9] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 54
		bodyModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 55
		bodyModel[11] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 56
		bodyModel[12] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 57
		bodyModel[13] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 58
		bodyModel[14] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 59
		bodyModel[15] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 60
		bodyModel[16] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 64
		bodyModel[19] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 65

		bodyModel[0].addShapeBox(0F, -0.2F, -2.5F, 9, 5, 5, 0F,0F, 0.3F, 0.2F, -4F, 0.1F, 0.2F, -4F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 1F, -4F, -2F, 0.8F, -4F, -2F, 0.8F, 0F, -0.5F, 0.8F); // Box 42
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-6F, 1F, -4.4F, 3, 1, 1, 0F,-1F, 0F, -0.8F, -1F, 0F, -0.6F, -1F, 0F, 0.2F, -1F, 0F, 0.4F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F); // Box 73
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-6F, 3F, -4.4F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.6F, -1F, 0F, 0.2F, -1F, 0F, 0.4F); // Box 74
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-6F, 2F, -4.4F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F); // Box 75
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(3F, 1F, -4.4F, 3, 1, 1, 0F,-1F, 0F, -0.6F, -1F, 0F, -0.8F, -1F, 0F, 0.4F, -1F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F); // Box 165
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(3F, 2F, -4.4F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F); // Box 166
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3F, 3F, -4.4F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, -1F, 0F, -0.6F, -1F, 0F, -0.8F, -1F, 0F, 0.4F, -1F, 0F, 0.2F); // Box 167
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.5F, 0.8F, -2.5F, 9, 1, 5, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F); // Box 52
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4.5F, 4.8F, -2.5F, 9, 1, 5, 0F,-0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F); // Box 53
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.5F, 8.8F, -2.5F, 9, 1, 5, 0F,-0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F); // Box 54
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 7.8F, -2.5F, 9, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 55
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4.5F, 6.8F, -2.5F, 9, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F); // Box 56
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.5F, 5.8F, -2.5F, 9, 1, 5, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.2F, 0.1F, 0.1F, 0.2F, 0.3F, 0.1F, 0.2F, 0.3F, 0.1F, 0.2F, 0.3F, 0.1F, 0.2F, 0.3F); // Box 57
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.5F, 9.8F, -2.5F, 9, 1, 5, 0F,-0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0.2F, -0.15F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Box 58
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 10.8F, -2.5F, 9, 1, 5, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0.4F, 0.2F, 0.7F, 0.4F, 0.2F, 0.7F, 0.4F, 0.2F, 0.7F, 0.4F, 0.2F, 0.7F); // Box 59
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.5F, 11.8F, -2.5F, 9, 1, 5, 0F,0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.2F, 0.5F, 0.7F, 0.2F, 1F, 0.7F, 0.2F, 1F, 0.7F, 0.2F, 1F, 0.7F, 0.2F, 1F); // Box 60
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-9F, -0.2F, -2.5F, 9, 5, 5, 0F,-4F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -4F, 0.1F, 0.2F, -4F, -2F, 0.8F, 0F, 0F, 1F, 0F, -0.5F, 0.8F, -4F, -2F, 0.8F); // Box 61
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4.5F, 1.8F, -2.5F, 9, 1, 5, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F); // Box 63
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.5F, 2.8F, -2.5F, 9, 1, 5, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F); // Box 64
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4.5F, 3.8F, -2.5F, 9, 1, 5, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F); // Box 65
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 57
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 58
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 62
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 77
		leftArmModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 99
		leftArmModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 102

		leftArmModel[0].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 9F, -2F, 4, 3, 4, 0F,0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F); // Box 58
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -0.6F, -2F, 4, 1, 4, 0F,0.4F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.4F, 1.2F, 0.2F, 0.3F, 3.4F, 0.3F, 0.4F, 3.4F, 0.3F, 0.4F, 3.4F, 0.3F, 0.3F, 3.4F, 0.3F); // Box 62
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 5.7F, -2F, 4, 3, 4, 0F,0.3F, 2F, 0.3F, 0.3F, 2F, 0.3F, 0.3F, 2F, 0.3F, 0.3F, 2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 77
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 3.9F, -2F, 4, 2, 4, 0F,0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F); // Box 99
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0F, -2F, -2F, 4, 4, 4, 0F,0F, 0.3F, 0.7F, -1F, 0.1F, 0.3F, -1F, 0.1F, 0.3F, 0F, 0.3F, 0.7F, 0F, -1.2F, 1.3F, -0.5F, -3.5F, 0.5F, -0.5F, -3.5F, 0.5F, 0F, -1.2F, 1.3F); // Box 102
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 101
		rightArmModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 103
		rightArmModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 104
		rightArmModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 105
		rightArmModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 106
		rightArmModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 62

		rightArmModel[0].addShapeBox(-3F, -0.6F, -2F, 4, 1, 4, 0F,0.2F, 1.2F, 0.2F, 0.4F, 1.2F, 0.2F, 0.4F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.4F, 3.4F, 0.3F, 0.3F, 3.4F, 0.3F, 0.3F, 3.4F, 0.3F, 0.4F, 3.4F, 0.3F); // Box 101
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5.7F, -2F, 4, 3, 4, 0F,0.3F, 2F, 0.3F, 0.3F, 2F, 0.3F, 0.3F, 2F, 0.3F, 0.3F, 2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 103
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 9F, -2F, 4, 3, 4, 0F,0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F); // Box 104
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 105
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 3.9F, -2F, 4, 2, 4, 0F,0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F); // Box 106
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-4F, -2F, -2F, 4, 4, 4, 0F,-1F, 0.1F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, -1F, 0.1F, 0.3F, -0.5F, -3.5F, 0.5F, 0F, -1.2F, 1.3F, 0F, -1.2F, 1.3F, -0.5F, -3.5F, 0.5F); // Box 62
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 82
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 84
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 86
		leftLegModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 87
		leftLegModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 88
		leftLegModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 89
		leftLegModel[7] = new ModelRendererTurbo(this, 99, 3, textureX, textureY); // Box 90
		leftLegModel[8] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 45

		leftLegModel[0].addShapeBox(-2F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 82
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.8F, 5.1F, -2.5F, 4, 1, 1, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 84
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.8F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1F, 0.6F, 0.4F, -1F, 0.6F, 0.3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F); // Box 85
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.8F, 1.9F, -2F, 4, 5, 3, 0F,0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, -1.5F, 0.2F, 0.5F, -1.5F, -0.7F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.9F, 0.3F, 0F, -1.2F); // Box 86
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.8F, 6.1F, -2.5F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 87
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(2F, 6.5F, -1.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F); // Box 88
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(2F, 5.5F, -1.8F, 1, 1, 3, 0F,-1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 89
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 11.1F, -3.5F, 4, 1, 2, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 1.1F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 45
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 91
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 92
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 93
		rightLegModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 94
		rightLegModel[4] = new ModelRendererTurbo(this, 99, 3, textureX, textureY); // Box 95
		rightLegModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 96
		rightLegModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 97
		rightLegModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 98
		rightLegModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 99

		rightLegModel[0].addShapeBox(-2F, 1.1F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 91
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.2F, 1.9F, -2F, 4, 5, 3, 0F,0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1.5F, -0.7F, 0.8F, -1.5F, 0.2F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.3F, 0F, -1.2F, 0.3F, 0F, -0.9F); // Box 92
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.2F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1F, 0.6F, 0.4F, -1F, 0.6F, 0F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 93
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 94
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 11.1F, -3.5F, 4, 1, 2, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.2F, 5.1F, -2.5F, 4, 1, 1, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 96
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.2F, 6.1F, -2.5F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 97
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3F, 5.5F, -1.8F, 1, 1, 3, 0F,0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 98
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-3F, 6.5F, -1.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F); // Box 99
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 44
		skirtFrontModel[1] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 39

		skirtFrontModel[0].addShapeBox(-4F, -1.5F, -2F, 8, 2, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.9F, 0.1F, 0.5F, 0.9F, 0.1F, 0.5F); // Box 44
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-4F, 0.5F, -2F, 8, 2, 2, 0F,0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1.4F, 1F, 1.4F, 1.4F, 1F, 1.4F, 1.4F, 1F, 1.7F, 1.4F, 1F, 1.7F); // Box 39
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 45
		skirtRearModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 40

		skirtRearModel[0].addShapeBox(-4F, -1.5F, 0F, 8, 2, 2, 0F,0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 1F, 0.8F, 0F, 1F); // Box 45
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-4F, 0.5F, 0F, 8, 2, 2, 0F,0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 1.4F, 1F, 1.8F, 1.4F, 1F, 1.7F, 1.4F, 1F, 1.4F, 1.4F, 1F, 1.4F); // Box 40
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);
	}
}