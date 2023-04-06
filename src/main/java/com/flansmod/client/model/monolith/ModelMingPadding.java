//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MingPadding
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingPadding extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelMingPadding() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[9];
		rightLegModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		bodyModel[3] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 26
		bodyModel[5] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 33
		bodyModel[6] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 37
		bodyModel[7] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 38
		bodyModel[8] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 40
		bodyModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 41

		bodyModel[0].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 22
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2F, 8, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 4F, -2F, 8, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 24
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.2F, -1.5F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 25
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 10F, -2F, 8, 2, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 26
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, -2F, 4, 4, 4, 0F,-1.5F, 0.4F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.4F, 0.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 33
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, -2F, 2, 6, 4, 0F,-1.5F, 0.45F, 0.5F, 1.5F, 0.3F, 0.5F, 1F, 0.3F, 0.5F, 0F, 0.45F, 0.5F, 4.5F, 0F, 0.5F, -6.5F, 2F, 0.5F, -6.5F, 2F, 0.5F, 4.5F, 0F, 0.5F); // Box 37
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 10F, -2.5F, 1, 4, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0.5F, -1.2F, 0.5F, 0.5F, -1.2F, 0.5F, 0F, 0.8F, 0F, 0F); // Box 38
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 10F, -2.5F, 1, 4, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0.5F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0F, -1.2F, 0.5F, 0F); // Box 39
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.5F, 9.5F, -2.5F, 1, 1, 1, 0F,1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F); // Box 40
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 9.5F, -2.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F); // Box 41
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 42
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 43
		leftArmModel[2] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 44

		leftArmModel[0].addShapeBox(-1F, 8F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 42
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 4F, -2F, 4, 4, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 43
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 44
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 34
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 35
		rightArmModel[2] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 36

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 34
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4F, -2F, 4, 4, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 35
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 8F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 36
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 45
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 46
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 47
		leftLegModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 48
		leftLegModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 49
		leftLegModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 50
		leftLegModel[6] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 51
		leftLegModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		leftLegModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 53

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F,0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.3F, 0F, 1.2F, 1F, 0F, 1.2F, 1F, 0F, 1.2F, 0.3F, 0F, 1.2F); // Box 45
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 46
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 47
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 5F, -2.9F, 4, 3, 1, 0F,-0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F); // Box 48
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 6.5F, -3.05F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, 0.35F, -0.3F, -0.3F, 0.35F, -0.3F, -0.3F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0.35F, -0.3F, -0.3F, 0.35F, -0.3F, -0.3F); // Box 49
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 6.5F, -2F, 4, 1, 4, 0F,0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F); // Box 50
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 7F, -2F, 4, 9, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 51
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 9.4F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 52
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 53
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 27
		rightLegModel[4] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 28
		rightLegModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 29
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 30
		rightLegModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 31
		rightLegModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 32

		rightLegModel[0].addShapeBox(-2F, 9.4F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 1
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 5F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 27
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 7F, -2F, 4, 9, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 28
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 5F, -2.9F, 4, 3, 1, 0F,-0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F); // Box 29
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 6.5F, -2F, 4, 1, 4, 0F,0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F); // Box 30
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 6.5F, -3.05F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, 0.35F, -0.3F, -0.3F, 0.35F, -0.3F, -0.3F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0.35F, -0.3F, -0.3F, 0.35F, -0.3F, -0.3F); // Box 31
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F,0.5F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 1.2F, 0.3F, 0F, 1.2F, 0.3F, 0F, 1.2F, 1F, 0F, 1.2F); // Box 32
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);
	}
}