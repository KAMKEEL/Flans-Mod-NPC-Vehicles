//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelFalken extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelFalken() {
        this.textureX = 1024;
        this.textureY = 1024;
        (this.bodyModel = new ModelRendererTurbo[28])[0] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 681, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 153, 17, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 353, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 529, 25, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 897, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 937, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 697, 49, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 265, 57, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 929, 41, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 73, 89, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 505, 65, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 105, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 137, 105, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 137, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 449, 137, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 569, 137, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 633, 137, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 681, 65, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 265, 41, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 233, 145, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 449, 153, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 921, 161, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 361, 105, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 201, 81, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 697, 145, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 120, 3, 10, 0.0f);
        this.bodyModel[0].setRotationPoint(-258.0f, -24.0f, -5.0f);
        this.bodyModel[0].rotateAngleY = -0.02094395f;
        this.bodyModel[0].rotateAngleZ = 0.02181662f;
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 120, 3, 10, 0.0f);
        this.bodyModel[1].setRotationPoint(-258.0f, -24.0f, -5.0f);
        this.bodyModel[1].rotateAngleY = 0.02094395f;
        this.bodyModel[1].rotateAngleZ = 0.02181662f;
        this.bodyModel[2].addBox(0.0f, 0.0f, -7.0f, 100, 3, 14, 0.0f);
        this.bodyModel[2].setRotationPoint(-139.0f, -27.0f, 0.0f);
        this.bodyModel[2].rotateAngleY = -0.1745329f;
        this.bodyModel[2].rotateAngleZ = 0.02617994f;
        this.bodyModel[3].addBox(0.0f, 0.0f, -7.0f, 100, 3, 14, 0.0f);
        this.bodyModel[3].setRotationPoint(-139.0f, -27.0f, 0.0f);
        this.bodyModel[3].rotateAngleY = 0.1745329f;
        this.bodyModel[3].rotateAngleZ = 0.02617994f;
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 70, 1, 32, 0.0f);
        this.bodyModel[4].setRotationPoint(-56.0f, -30.0f, -14.0f);
        this.bodyModel[4].rotateAngleY = -0.7330383f;
        this.bodyModel[5].addBox(0.0f, 0.0f, -32.0f, 70, 1, 32, 0.0f);
        this.bodyModel[5].setRotationPoint(-56.0f, -30.0f, 14.0f);
        this.bodyModel[5].rotateAngleY = 0.7330383f;
        this.bodyModel[6].addBox(0.0f, 0.0f, -3.0f, 12, 1, 6, 0.0f);
        this.bodyModel[6].setRotationPoint(-70.0f, -30.0f, -18.0f);
        this.bodyModel[6].rotateAngleY = -0.1745329f;
        this.bodyModel[7].addBox(0.0f, 0.0f, -3.0f, 12, 1, 6, 0.0f);
        this.bodyModel[7].setRotationPoint(-70.0f, -30.0f, 18.0f);
        this.bodyModel[7].rotateAngleY = 0.1745329f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 70, 1, 40, 0.0f);
        this.bodyModel[8].setRotationPoint(-52.0f, -30.0f, -20.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 70, 1, 20, 0.0f);
        this.bodyModel[9].setRotationPoint(-108.0f, -27.0f, -10.0f);
        this.bodyModel[9].rotateAngleZ = 0.01745329f;
        this.bodyModel[10].addBox(0.0f, -0.5f, -8.0f, 18, 1, 16, 0.0f);
        this.bodyModel[10].setRotationPoint(18.0f, -29.5f, 0.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 180, 5, 10, 0.0f);
        this.bodyModel[11].setRotationPoint(-258.0f, -25.0f, -5.0f);
        this.bodyModel[11].rotateAngleZ = 0.1570796f;
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 75, 14, 10, 0.0f);
        this.bodyModel[12].setRotationPoint(-80.0f, -53.0f, -5.0f);
        this.bodyModel[12].rotateAngleZ = -0.296706f;
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 55, 19, 10, 0.0f);
        this.bodyModel[13].setRotationPoint(-61.0f, -14.0f, -5.0f);
        this.bodyModel[13].rotateAngleZ = 2.879793f;
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 49, 15, 10, 0.0f);
        this.bodyModel[14].setRotationPoint(-12.0f, -16.61333f, -5.0f);
        this.bodyModel[14].rotateAngleZ = -3.106686f;
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 70, 1, 40, 0.0f);
        this.bodyModel[15].setRotationPoint(-52.0f, -27.0f, -20.0f);
        this.bodyModel[15].rotateAngleZ = 0.03490658f;
        this.bodyModel[16].addBox(0.0f, 0.0f, -4.0f, 50, 1, 8, 0.0f);
        this.bodyModel[16].setRotationPoint(20.0f, -30.0f, -44.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, -4.0f, 50, 1, 8, 0.0f);
        this.bodyModel[17].setRotationPoint(20.0f, -30.0f, 45.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 28, 30, 1, 0.0f);
        this.bodyModel[18].setRotationPoint(15.0f, -57.0f, -35.0f);
        this.bodyModel[18].rotateAngleX = -0.4363323f;
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 28, 30, 1, 0.0f);
        this.bodyModel[19].setRotationPoint(15.0f, -57.0f, 35.0f);
        this.bodyModel[19].rotateAngleX = 0.4363323f;
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 9, 11, 8, 0.0f);
        this.bodyModel[20].setRotationPoint(-14.0f, -28.0f, -4.0f);
        this.bodyModel[20].rotateAngleZ = 0.2082002f;
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 19, 4, 10, 0.0f);
        this.bodyModel[21].setRotationPoint(-228.0f, -26.0f, -5.0f);
        this.bodyModel[21].rotateAngleZ = 0.1570796f;
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 33, 8, 10, 0.0f);
        this.bodyModel[22].setRotationPoint(-210.0f, -31.0f, -5.0f);
        this.bodyModel[22].rotateAngleZ = 0.06981317f;
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 41, 14, 10, 0.0f);
        this.bodyModel[23].setRotationPoint(-178.0f, -37.0f, -5.0f);
        this.bodyModel[23].rotateAngleZ = 0.05235988f;
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 37, 17, 10, 0.0f);
        this.bodyModel[24].setRotationPoint(-137.5f, -43.5f, -5.0f);
        this.bodyModel[24].rotateAngleZ = 0.03490658f;
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 20, 12, 10, 0.0f);
        this.bodyModel[25].setRotationPoint(-100.0f, -48.0f, -5.0f);
        this.bodyModel[25].rotateAngleZ = 0.1047198f;
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 70, 1, 3, 0.0f);
        this.bodyModel[26].setRotationPoint(0.0f, -30.0f, -24.0f);
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 70, 1, 3, 0.0f);
        this.bodyModel[27].setRotationPoint(0.0f, -30.0f, 21.0f);
        (this.bodyWheelModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 481, 57, this.textureX, this.textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 481, 57, this.textureX, this.textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 913, 9, this.textureX, this.textureY);
        this.bodyWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 10, 10, 3, 0.0f);
        this.bodyWheelModel[0].setRotationPoint(-58.0f, 0.0f, -4.0f);
        this.bodyWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 10, 10, 3, 0.0f);
        this.bodyWheelModel[1].setRotationPoint(-58.0f, 0.0f, 1.0f);
        this.bodyWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 8, 4, 0.0f);
        this.bodyWheelModel[2].setRotationPoint(-55.0f, -11.0f, -2.0f);
        (this.tailModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo((ModelBase)this, 441, 97, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 601, 97, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 905, 81, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 761, 97, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 257, 105, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 345, 129, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 881, 49, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo((ModelBase)this, 881, 129, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo((ModelBase)this, 977, 129, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo((ModelBase)this, 929, 129, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo((ModelBase)this, 185, 137, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo((ModelBase)this, 105, 65, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo((ModelBase)this, 153, 65, this.textureX, this.textureY);
        this.tailModel[0].addBox(0.0f, 0.0f, -8.0f, 60, 18, 16, 0.0f);
        this.tailModel[0].setRotationPoint(-8.0f, -30.0f, -32.0f);
        this.tailModel[1].addBox(0.0f, 0.0f, -8.0f, 60, 18, 16, 0.0f);
        this.tailModel[1].setRotationPoint(-8.0f, -30.0f, 32.0f);
        this.tailModel[2].addBox(0.0f, 0.0f, -8.0f, 40, 28, 16, 0.0f);
        this.tailModel[2].setRotationPoint(19.0f, -40.0f, 32.0f);
        this.tailModel[3].addBox(0.0f, 0.0f, 0.0f, 40, 28, 16, 0.0f);
        this.tailModel[3].setRotationPoint(19.0f, -40.0f, -40.0f);
        this.tailModel[4].addBox(-2.0f, 0.0f, -8.0f, 34, 18, 16, 0.0f);
        this.tailModel[4].setRotationPoint(-11.5f, -30.0f, 32.0f);
        this.tailModel[4].rotateAngleZ = 0.3141593f;
        this.tailModel[5].addBox(-2.0f, 0.0f, -8.0f, 34, 18, 16, 0.0f);
        this.tailModel[5].setRotationPoint(-11.5f, -30.0f, -32.0f);
        this.tailModel[5].rotateAngleZ = 0.3141593f;
        this.tailModel[6].addBox(0.0f, 0.0f, 0.0f, 20, 20, 1, 0.0f);
        this.tailModel[6].setRotationPoint(65.0f, -40.0f, -25.0f);
        this.tailModel[6].rotateAngleZ = -0.7853982f;
        this.tailModel[7].addBox(0.0f, 0.0f, 0.0f, 20, 28, 1, 0.0f);
        this.tailModel[7].setRotationPoint(45.0f, -40.0f, -25.0f);
        this.tailModel[8].addBox(0.0f, 0.0f, 0.0f, 20, 28, 1, 0.0f);
        this.tailModel[8].setRotationPoint(45.0f, -40.0f, 40.0f);
        this.tailModel[9].addBox(0.0f, 0.0f, 0.0f, 20, 28, 1, 0.0f);
        this.tailModel[9].setRotationPoint(45.0f, -40.0f, 24.0f);
        this.tailModel[10].addBox(0.0f, 0.0f, 0.0f, 20, 28, 1, 0.0f);
        this.tailModel[10].setRotationPoint(45.0f, -40.0f, -40.0f);
        this.tailModel[11].addBox(0.0f, 0.0f, 0.0f, 20, 20, 1, 0.0f);
        this.tailModel[11].setRotationPoint(65.0f, -40.0f, -40.0f);
        this.tailModel[11].rotateAngleZ = -0.7853982f;
        this.tailModel[12].addBox(0.0f, 0.0f, 0.0f, 20, 20, 1, 0.0f);
        this.tailModel[12].setRotationPoint(65.0f, -40.0f, 40.0f);
        this.tailModel[12].rotateAngleZ = -0.7853982f;
        this.tailModel[13].addBox(0.0f, 0.0f, 0.0f, 20, 20, 1, 0.0f);
        this.tailModel[13].setRotationPoint(65.0f, -40.0f, 24.0f);
        this.tailModel[13].rotateAngleZ = -0.7853982f;
        (this.tailWheelModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 1009, 1, this.textureX, this.textureY);
        this.tailWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 929, 9, this.textureX, this.textureY);
        this.tailWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 945, 9, this.textureX, this.textureY);
        this.tailWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 481, 57, this.textureX, this.textureY);
        this.tailWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 481, 57, this.textureX, this.textureY);
        this.tailWheelModel[0].addBox(0.0f, 0.0f, -1.0f, 2, 18, 2, 0.0f);
        this.tailWheelModel[0].setRotationPoint(55.0f, -12.0f, -32.0f);
        this.tailWheelModel[1].addBox(0.0f, 0.0f, -1.0f, 2, 18, 2, 0.0f);
        this.tailWheelModel[1].setRotationPoint(55.0f, -12.0f, 32.0f);
        this.tailWheelModel[2].addBox(0.0f, 0.0f, -1.0f, 2, 21, 2, 0.0f);
        this.tailWheelModel[2].setRotationPoint(-54.0f, -15.0f, 0.0f);
        this.tailWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 10, 10, 3, 0.0f);
        this.tailWheelModel[3].setRotationPoint(51.0f, 0.0f, -36.0f);
        this.tailWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 10, 10, 3, 0.0f);
        this.tailWheelModel[4].setRotationPoint(51.0f, 0.0f, 33.0f);
        (this.leftWingModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 209, 169, this.textureX, this.textureY);
        this.leftWingModel[0].addBox(0.0f, 0.0f, -8.0f, 100, 1, 16, 0.0f);
        this.leftWingModel[0].setRotationPoint(-36.0f, -30.0f, 106.0f);
        this.leftWingModel[0].rotateAngleY = -0.8377581f;
        this.leftWingModel[1].addBox(0.0f, 0.0f, 0.0f, 100, 1, 16, 0.0f);
        this.leftWingModel[1].setRotationPoint(-41.0f, -30.0f, 101.0f);
        this.leftWingModel[1].rotateAngleY = -0.6981317f;
        (this.rightWingModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 705, 25, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 681, 161, this.textureX, this.textureY);
        this.rightWingModel[0].addBox(0.0f, 0.0f, -8.0f, 100, 1, 16, 0.0f);
        this.rightWingModel[0].setRotationPoint(-36.0f, -30.0f, -106.0f);
        this.rightWingModel[0].rotateAngleY = 0.8377581f;
        this.rightWingModel[1].addBox(0.0f, 0.0f, 0.0f, 100, 1, 16, 0.0f);
        this.rightWingModel[1].setRotationPoint(-30.0f, -30.0f, -112.0f);
        this.rightWingModel[1].rotateAngleY = 0.6981317f;
        this.propellerModels = new ModelRendererTurbo[1][3];
        this.propellerModels[0][0] = new ModelRendererTurbo((ModelBase)this, 800, 800, this.textureX, this.textureY);
        this.propellerModels[0][1] = new ModelRendererTurbo((ModelBase)this, 800, 800, this.textureX, this.textureY);
        this.propellerModels[0][2] = new ModelRendererTurbo((ModelBase)this, 800, 800, this.textureX, this.textureY);
        this.propellerModels[0][0].addBox(-0.0f, -12.0f, -1.0f, 1, 1, 1, 0.0f);
        this.propellerModels[0][1].addBox(-0.0f, -12.0f, -1.0f, 1, 1, 1, 0.0f);
        this.propellerModels[0][2].addBox(-0.0f, -12.0f, -1.0f, 1, 1, 1, 0.0f);
        this.propellerModels[0][0].setRotationPoint(-52.0f, -30.0f, 0.0f);
        this.propellerModels[0][1].setRotationPoint(-52.0f, -30.0f, 0.0f);
        this.propellerModels[0][2].setRotationPoint(-52.0f, -30.0f, 0.0f);
        (this.yawFlapModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 985, 1, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 529, 17, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0f, 1.0f, -0.5f, 8, 28, 1, 0.0f);
        this.yawFlapModel[0].setRotationPoint(43.0f, -57.0f, -34.5f);
        this.yawFlapModel[0].rotateAngleX = -0.4363323f;
        this.yawFlapModel[1].addBox(0.0f, 1.0f, -0.5f, 8, 28, 1, 0.0f);
        this.yawFlapModel[1].setRotationPoint(43.0f, -57.0f, 35.5f);
        this.yawFlapModel[1].rotateAngleX = 0.4363323f;
        (this.pitchFlapLeftModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 929, 9, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo((ModelBase)this, 425, 57, this.textureX, this.textureY);
        this.pitchFlapLeftModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 800, this.textureX, this.textureY);
        this.pitchFlapLeftModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 800, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addBox(-11.0f, 0.0f, 0.0f, 11, 1, 26, 0.0f);
        this.pitchFlapLeftModel[0].setRotationPoint(-66.0f, -30.0f, 21.0f);
        this.pitchFlapLeftModel[0].rotateAngleX = 0.4363323f;
        this.pitchFlapLeftModel[0].rotateAngleY = -0.3141593f;
        this.pitchFlapLeftModel[1].addBox(-5.0f, 0.0f, 0.0f, 11, 1, 26, 0.0f);
        this.pitchFlapLeftModel[1].setRotationPoint(-66.0f, -30.0f, 21.0f);
        this.pitchFlapLeftModel[1].rotateAngleX = 0.4014257f;
        this.pitchFlapLeftModel[1].rotateAngleY = -0.03490658f;
        this.pitchFlapLeftModel[1].rotateAngleZ = 0.08726646f;
        this.pitchFlapLeftModel[2].addBox(0.0f, -4.0f, -7.0f, 12, 4, 14, 0.0f);
        this.pitchFlapLeftModel[2].setRotationPoint(59.0f, -18.0f, 32.0f);
        this.pitchFlapLeftModel[2].rotateAngleZ = 0.6981317f;
        this.pitchFlapLeftModel[3].addBox(0.0f, 0.0f, -7.0f, 12, 4, 14, 0.0f);
        this.pitchFlapLeftModel[3].setRotationPoint(59.0f, -33.0f, 32.0f);
        this.pitchFlapLeftModel[3].rotateAngleZ = -0.6981317f;
        (this.pitchFlapRightModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 209, 41, this.textureX, this.textureY);
        this.pitchFlapRightModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.pitchFlapRightModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 800, this.textureX, this.textureY);
        this.pitchFlapRightModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 800, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addBox(-12.0f, 0.0f, -25.0f, 11, 1, 26, 0.0f);
        this.pitchFlapRightModel[0].setRotationPoint(-66.0f, -30.0f, -21.0f);
        this.pitchFlapRightModel[0].rotateAngleX = -0.4363323f;
        this.pitchFlapRightModel[0].rotateAngleY = 0.3141593f;
        this.pitchFlapRightModel[1].addBox(-6.0f, 0.0f, -26.0f, 11, 1, 26, 0.0f);
        this.pitchFlapRightModel[1].setRotationPoint(-66.0f, -30.0f, -21.0f);
        this.pitchFlapRightModel[1].rotateAngleX = -0.4014257f;
        this.pitchFlapRightModel[1].rotateAngleY = 0.03490658f;
        this.pitchFlapRightModel[1].rotateAngleZ = 0.08726646f;
        this.pitchFlapRightModel[2].addBox(0.0f, 0.0f, -7.0f, 12, 4, 14, 0.0f);
        this.pitchFlapRightModel[2].setRotationPoint(59.0f, -33.0f, -32.0f);
        this.pitchFlapRightModel[2].rotateAngleZ = -0.6981317f;
        this.pitchFlapRightModel[3].addBox(0.0f, -4.0f, -7.0f, 12, 4, 14, 0.0f);
        this.pitchFlapRightModel[3].setRotationPoint(59.0f, -18.0f, -32.0f);
        this.pitchFlapRightModel[3].rotateAngleZ = 0.6981317f;
        this.flipAll();
    }
}
