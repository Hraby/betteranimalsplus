package its_meow.betteranimalsplus.client.model.shark;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import its_meow.betteranimalsplus.common.entity.EntityShark;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

/**
 * MakoShark - Batman Created using Tabula 7.0.1
 */
public class ModelMakoShark extends EntityModel<EntityShark> {
    public ModelRenderer body;
    public ModelRenderer tail00;
    public ModelRenderer neck;
    public ModelRenderer lFin00;
    public ModelRenderer rFin00;
    public ModelRenderer dorsalFin00;
    public ModelRenderer tail01;
    public ModelRenderer tail02;
    public ModelRenderer lLowerTailFin;
    public ModelRenderer rLowerTailFin;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer upperTailFin;
    public ModelRenderer mLowerTailFin;
    public ModelRenderer tail05;
    public ModelRenderer tailFinUpper00;
    public ModelRenderer tailFinLower00;
    public ModelRenderer tailFinUpper01;
    public ModelRenderer tailFinUpper02;
    public ModelRenderer tailFinLower01;
    public ModelRenderer tailFinLower02;
    public ModelRenderer head;
    public ModelRenderer lowerJaw;
    public ModelRenderer snout;
    public ModelRenderer teethUpper;
    public ModelRenderer headUpper;
    public ModelRenderer headUpper2;
    public ModelRenderer teethLower;
    public ModelRenderer lFin01;
    public ModelRenderer lFin02;
    public ModelRenderer rFin01;
    public ModelRenderer rFin02;
    public ModelRenderer dorsalFin01;
    public ModelRenderer dorsalFin03;
    public ModelRenderer dorsalFin02;
    public ModelRenderer dorsalFin04;

    public ModelMakoShark() {
        this.textureWidth = 60;
        this.textureHeight = 200;
        this.lowerJaw = new ModelRenderer(this, 0, 156);
        this.lowerJaw.setRotationPoint(0.0F, 2.4F, -8.4F);
        this.lowerJaw.addBox(-3.0F, -1.0F, -4.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(lowerJaw, -0.22759093446006054F, 0.0F, 0.0F);
        this.rFin00 = new ModelRenderer(this, 0, 178);
        this.rFin00.setRotationPoint(-3.6F, 0.0F, -13.9F);
        this.rFin00.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 5, 0.0F);
        this.setRotateAngle(rFin00, 0.18203784098300857F, 0.0F, 0.7740535232594852F);
        this.tail02 = new ModelRenderer(this, 0, 65);
        this.tail02.setRotationPoint(0.0F, 0.1F, 5.3F);
        this.tail02.addBox(-2.0F, -3.0F, 0.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(tail02, -1.7453292519943296E-4F, 0.0F, 0.0F);
        this.dorsalFin01 = new ModelRenderer(this, 26, 134);
        this.dorsalFin01.setRotationPoint(0.0F, -3.1F, 0.4F);
        this.dorsalFin01.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(dorsalFin01, -0.136659280431156F, 0.0F, 0.0F);
        this.tail03 = new ModelRenderer(this, 0, 78);
        this.tail03.setRotationPoint(0.0F, -1.0F, 5.7F);
        this.tail03.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F);
        this.headUpper2 = new ModelRenderer(this, 29, 24);
        this.headUpper2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headUpper2.addBox(-3.0F, 0.0F, 0.0F, 6, 1, 9, 0.0F);
        this.setRotateAngle(headUpper2, 0.091106186954104F, 0.0F, 0.0F);
        this.tailFinUpper02 = new ModelRenderer(this, 25, 84);
        this.tailFinUpper02.setRotationPoint(0.0F, -4.8F, -0.5F);
        this.tailFinUpper02.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 2, 0.0F);
        this.setRotateAngle(tailFinUpper02, -0.136659280431156F, 0.0F, 0.0F);
        this.headUpper = new ModelRenderer(this, 0, 144);
        this.headUpper.setRotationPoint(0.0F, -5.0F, 2.0F);
        this.headUpper.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 8, 0.0F);
        this.setRotateAngle(headUpper, -1.0927506446736497F, 0.0F, 0.0F);
        this.lLowerTailFin = new ModelRenderer(this, 9, 189);
        this.lLowerTailFin.setRotationPoint(2.2F, 4.0F, 2.5F);
        this.lLowerTailFin.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(lLowerTailFin, 0.36425021489121656F, 0.0F, -0.5462880558742251F);
        this.dorsalFin02 = new ModelRenderer(this, 26, 144);
        this.dorsalFin02.setRotationPoint(-1.0F, -1.8F, 0.2F);
        this.dorsalFin02.addBox(0.0F, -2.2F, 0.1F, 1, 4, 3, 0.0F);
        this.setRotateAngle(dorsalFin02, -0.08726646259971647F, 0.0F, 0.0F);
        this.snout = new ModelRenderer(this, 0, 135);
        this.snout.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.snout.addBox(-2.5F, -5.0F, 0.0F, 5, 5, 2, 0.0F);
        this.setRotateAngle(snout, 1.3203415791337103F, 0.0F, 0.0F);
        this.tailFinUpper00 = new ModelRenderer(this, 25, 61);
        this.tailFinUpper00.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.tailFinUpper00.addBox(-0.51F, -6.0F, -1.5F, 1, 6, 4, 0.0F);
        this.setRotateAngle(tailFinUpper00, -0.6829473363053812F, 0.0F, 0.0F);
        this.tail01 = new ModelRenderer(this, 0, 50);
        this.tail01.setRotationPoint(0.0F, -1.4F, 10.4F);
        this.tail01.addBox(-2.5F, -3.0F, 0.0F, 5, 7, 6, 0.0F);
        this.setRotateAngle(tail01, -0.04363323129985824F, 0.0F, 0.0F);
        this.teethUpper = new ModelRenderer(this, 0, 164);
        this.teethUpper.setRotationPoint(-2.5F, 0.8F, -3.4F);
        this.teethUpper.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
        this.rFin02 = new ModelRenderer(this, 0, 190);
        this.rFin02.setRotationPoint(0.0F, 4.7F, 1.0F);
        this.rFin02.addBox(0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(rFin02, 0.136659280431156F, 0.0F, 0.0F);
        this.dorsalFin04 = new ModelRenderer(this, 30, 152);
        this.dorsalFin04.setRotationPoint(0.0F, -2.5F, 1.2F);
        this.dorsalFin04.addBox(0.0F, 0.0F, -0.6F, 1, 6, 2, 0.0F);
        this.setRotateAngle(dorsalFin04, 0.5009094953223726F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 13.0F, 3.0F);
        this.body.addBox(-4.5F, -5.5F, -14.0F, 9, 9, 14, 0.0F);
        this.setRotateAngle(body, 0.022863813201125717F, 0.0F, 0.0F);
        this.tailFinLower02 = new ModelRenderer(this, 15, 97);
        this.tailFinLower02.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.tailFinLower02.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(tailFinLower02, 0.31869712141416456F, 0.0F, 0.0F);
        this.tail05 = new ModelRenderer(this, 25, 50);
        this.tail05.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.tail05.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.lFin01 = new ModelRenderer(this, 12, 173);
        this.lFin01.mirror = true;
        this.lFin01.setRotationPoint(-0.5F, 5.9F, 0.0F);
        this.lFin01.addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
        this.setRotateAngle(lFin01, 0.22759093446006054F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 103);
        this.neck.setRotationPoint(0.0F, -1.0F, -13.6F);
        this.neck.addBox(-4.0F, -4.5F, -9.0F, 8, 8, 9, 0.0F);
        this.setRotateAngle(neck, 0.045553093477052F, 0.0F, 0.0F);
        this.rFin01 = new ModelRenderer(this, 12, 173);
        this.rFin01.setRotationPoint(-0.5F, 5.9F, 0.0F);
        this.rFin01.addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
        this.setRotateAngle(rFin01, 0.22759093446006054F, 0.0F, 0.0F);
        this.dorsalFin03 = new ModelRenderer(this, 26, 163);
        this.dorsalFin03.setRotationPoint(-1.0F, -5.2F, 1.7F);
        this.dorsalFin03.addBox(0.0F, -3.1F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(dorsalFin03, -0.5235987755982988F, 0.0F, 0.0F);
        this.tail00 = new ModelRenderer(this, 0, 27);
        this.tail00.setRotationPoint(0.0F, -1.0F, -0.7F);
        this.tail00.addBox(-3.5F, -4.5F, 0.0F, 7, 8, 11, 0.0F);
        this.setRotateAngle(tail00, -0.05969026041820607F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 124);
        this.head.setRotationPoint(0.0F, 0.3F, -8.6F);
        this.head.addBox(-3.5F, -3.0F, -4.2F, 7, 4, 4, 0.0F);
        this.setRotateAngle(head, -0.136659280431156F, 0.0F, 0.0F);
        this.lFin02 = new ModelRenderer(this, 0, 190);
        this.lFin02.mirror = true;
        this.lFin02.setRotationPoint(0.0F, 4.7F, 1.0F);
        this.lFin02.addBox(0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(lFin02, 0.136659280431156F, 0.0F, 0.0F);
        this.tailFinLower00 = new ModelRenderer(this, 25, 91);
        this.tailFinLower00.setRotationPoint(0.0F, 0.9F, 1.7F);
        this.tailFinLower00.addBox(-0.49F, 0.0F, -1.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(tailFinLower00, 0.4553564018453205F, 0.0F, 0.0F);
        this.mLowerTailFin = new ModelRenderer(this, 22, 179);
        this.mLowerTailFin.setRotationPoint(-0.5F, 1.6F, 0.9F);
        this.mLowerTailFin.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(mLowerTailFin, 0.40980330836826856F, 0.0F, 0.0F);
        this.tailFinLower01 = new ModelRenderer(this, 15, 88);
        this.tailFinLower01.setRotationPoint(0.0F, 2.6F, -0.5F);
        this.tailFinLower01.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(tailFinLower01, 0.136659280431156F, 0.0F, 0.0F);
        this.rLowerTailFin = new ModelRenderer(this, 9, 189);
        this.rLowerTailFin.setRotationPoint(-2.2F, 4.0F, 2.5F);
        this.rLowerTailFin.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(rLowerTailFin, 0.36425021489121656F, 0.0F, 0.5462880558742251F);
        this.dorsalFin00 = new ModelRenderer(this, 26, 124);
        this.dorsalFin00.setRotationPoint(0.5F, -6.6F, -7.0F);
        this.dorsalFin00.addBox(-1.5F, -0.4F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(dorsalFin00, -0.40980330836826856F, 0.0F, 0.0F);
        this.lFin00 = new ModelRenderer(this, 0, 178);
        this.lFin00.mirror = true;
        this.lFin00.setRotationPoint(3.6F, 0.0F, -13.9F);
        this.lFin00.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 5, 0.0F);
        this.setRotateAngle(lFin00, 0.18203784098300857F, 0.0F, -0.7740535232594852F);
        this.tail04 = new ModelRenderer(this, 0, 89);
        this.tail04.setRotationPoint(0.0F, -0.4F, 4.9F);
        this.tail04.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 4, 0.0F);
        this.teethLower = new ModelRenderer(this, 0, 171);
        this.teethLower.setRotationPoint(-2.0F, -1.8F, -3.0F);
        this.teethLower.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.upperTailFin = new ModelRenderer(this, 19, 189);
        this.upperTailFin.setRotationPoint(-0.5F, -1.4F, 0.8F);
        this.upperTailFin.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(upperTailFin, 1.2292353921796064F, 0.0F, 0.0F);
        this.tailFinUpper01 = new ModelRenderer(this, 25, 73);
        this.tailFinUpper01.setRotationPoint(0.0F, -6.7F, -0.3F);
        this.tailFinUpper01.addBox(-0.5F, -5.0F, -1.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(tailFinUpper01, -0.22759093446006054F, 0.0F, 0.0F);
        this.neck.addChild(this.lowerJaw);
        this.body.addChild(this.rFin00);
        this.tail01.addChild(this.tail02);
        this.dorsalFin00.addChild(this.dorsalFin01);
        this.tail02.addChild(this.tail03);
        this.headUpper.addChild(this.headUpper2);
        this.tailFinUpper01.addChild(this.tailFinUpper02);
        this.snout.addChild(this.headUpper);
        this.tail01.addChild(this.lLowerTailFin);
        this.dorsalFin01.addChild(this.dorsalFin02);
        this.head.addChild(this.snout);
        this.tail05.addChild(this.tailFinUpper00);
        this.tail00.addChild(this.tail01);
        this.head.addChild(this.teethUpper);
        this.rFin01.addChild(this.rFin02);
        this.dorsalFin02.addChild(this.dorsalFin04);
        this.tailFinLower01.addChild(this.tailFinLower02);
        this.tail04.addChild(this.tail05);
        this.lFin00.addChild(this.lFin01);
        this.body.addChild(this.neck);
        this.rFin00.addChild(this.rFin01);
        this.dorsalFin00.addChild(this.dorsalFin03);
        this.body.addChild(this.tail00);
        this.neck.addChild(this.head);
        this.lFin01.addChild(this.lFin02);
        this.tail05.addChild(this.tailFinLower00);
        this.tail03.addChild(this.mLowerTailFin);
        this.tailFinLower00.addChild(this.tailFinLower01);
        this.tail01.addChild(this.rLowerTailFin);
        this.body.addChild(this.dorsalFin00);
        this.body.addChild(this.lFin00);
        this.tail03.addChild(this.tail04);
        this.lowerJaw.addChild(this.teethLower);
        this.tail03.addChild(this.upperTailFin);
        this.tailFinUpper00.addChild(this.tailFinUpper01);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setRotationAngles(EntityShark entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        ModelBullShark.animate(entity, ageInTicks, body, tail00, tail01, tail02, lowerJaw);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
}