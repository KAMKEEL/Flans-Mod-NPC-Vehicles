//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelByzanMail extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelByzanMail() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

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
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6

		bodyModel[0].addShapeBox(-4F, 8.6F, -2F, 8, 1, 4, 0F,0.6F, 0.1F, 0.8F, 0.6F, 0.1F, 0.8F, 0.6F, 0.1F, 0.8F, 0.6F, 0.1F, 0.8F, 0.6F, 0.1F, 0.8F, 0.6F, 0.1F, 0.8F, 0.6F, 0.1F, 0.8F, 0.6F, 0.1F, 0.8F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10.3F, -2F, 8, 5, 4, 0F,0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 7.7F, -2F, 16, 2, 4, 0F,0.7F, -0.1F, 0.7F, -7.3F, -0.1F, 0.7F, -7.3F, -0.1F, 0.7F, 0.7F, -0.1F, 0.7F, 0.5F, -1.1F, 0.5F, -7.3F, -1.1F, 0.5F, -7.3F, -1.1F, 0.5F, 0.5F, -1.1F, 0.5F); // Box 0
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.2F, -2F, 16, 16, 4, 0F,0.7F, 0.1F, 0.7F, -7.2F, 0.1F, 0.7F, -7.2F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, -8F, 0.7F, -7.2F, -8F, 0.7F, -7.2F, -8F, 0.7F, 0.7F, -8F, 0.7F); // Box 1
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 8.5F, -2F, 16, 2, 4, 0F,0.5F, -1.1F, 0.5F, -7.3F, -1.1F, 0.5F, -7.3F, -1.1F, 0.5F, 0.5F, -1.1F, 0.5F, 0.7F, -0.1F, 0.7F, -7.3F, -0.1F, 0.7F, -7.3F, -0.1F, 0.7F, 0.7F, -0.1F, 0.7F); // Box 1
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 3F, -2F, 8, 1, 4, 0F,0.8F, 0.1F, 0.8F, 0.8F, 0.1F, 0.8F, 0.8F, 0.1F, 0.8F, 0.8F, 0.1F, 0.8F, 0.8F, 0.1F, 0.8F, 0.8F, 0.1F, 0.8F, 0.8F, 0.1F, 0.8F, 0.8F, 0.1F, 0.8F); // Box 4
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-6.5F, 1F, -2F, 8, 1, 4, 0F,-2.5F, 1.4F, 0.8F, -4.5F, 1.5F, 0.8F, -4.5F, 1.5F, 0.8F, -2.5F, 1.4F, 0.8F, -3.5F, 1.7F, 0.8F, -3.5F, 1.7F, 0.8F, -3.5F, 1.7F, 0.8F, -3.5F, 1.7F, 0.8F); // Box 5
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 1F, -2F, 8, 1, 4, 0F,-4.5F, 1.5F, 0.8F, -2.5F, 1.4F, 0.8F, -2.5F, 1.4F, 0.8F, -4.5F, 1.5F, 0.8F, -3.5F, 1.7F, 0.8F, -3.5F, 1.7F, 0.8F, -3.5F, 1.7F, 0.8F, -3.5F, 1.7F, 0.8F); // Box 6
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 6
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 11, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F); // Box 6
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-5F, -2F, -2F, 8, 6, 8, 0F,-3.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, -3.5F, -3.5F, 0.3F, -3.5F, -3.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, -2F, -3.5F, -3.5F, -2F, -3.5F); // Box 3
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 11, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-7F, -2F, -2F, 8, 6, 8, 0F,-3.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, -3.5F, -3.5F, 0.3F, -3.5F, -3.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, -2F, -3.5F, -3.5F, -2F, -3.5F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 2
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 3
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 4
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 5
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 5

		leftLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 6, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 2
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 3
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7.4F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 4
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, -1.7F, -2F, 4, 8, 4, 0F,0.5F, -0.1F, 0.4F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.4F, -0.3F, -0.3F, 0.8F, 1.2F, -0.5F, 0.7F, 1.2F, -0.5F, 0.7F, -0.3F, -0.3F, 0.8F); // Box 5
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 0
		rightLegModel[3] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 1
		rightLegModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 4

		rightLegModel[0].addShapeBox(-2F, 7.4F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 6, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, -1.7F, -2F, 4, 8, 4, 0F,0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 1.2F, -0.5F, 0.7F, -0.3F, -0.3F, 0.9F, -0.3F, -0.3F, 0.9F, 1.2F, -0.5F, 0.7F); // Box 4
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 7

		skirtFrontModel[0].addShapeBox(-4F, -1.5F, -3F, 16, 16, 4, 0F,0.7F, 0.1F, -0.3F, -7.2F, 0.1F, -0.3F, -7.2F, 0.1F, -0.3F, 0.7F, 0.1F, -0.3F, 1.2F, -10F, 0F, -6.5F, -10F, 0F, -6.5F, -10F, 0F, 1.2F, -10F, 0F); // Box 7
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 8

		skirtRearModel[0].addShapeBox(-4F, -1.5F, -1F, 16, 16, 4, 0F,0.7F, 0.1F, -0.3F, -7.2F, 0.1F, -0.3F, -7.2F, 0.1F, -0.3F, 0.7F, 0.1F, -0.3F, 1.2F, -10F, 0F, -6.5F, -10F, 0F, -6.5F, -10F, 0F, 1.2F, -10F, 0F); // Box 8
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}