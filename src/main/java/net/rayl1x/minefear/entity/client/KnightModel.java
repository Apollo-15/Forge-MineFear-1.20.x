package net.rayl1x.minefear.entity.client;
// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class KnightModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart knight;
	private final ModelPart body;
	private final ModelPart right_leg;
	private final ModelPart eye_symbol;
	private final ModelPart full_masonic_symbol2;
	private final ModelPart mas_upper2;
	private final ModelPart eye_symbol3;
	private final ModelPart masonic_symbol_lower2;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart sword;
	private final ModelPart head;
	private final ModelPart torso;
	private final ModelPart left_leg;

	public KnightModel(ModelPart root) {
		this.knight = root.getChild("knight");
		this.body = this.knight.getChild("body");
		this.right_leg = this.body.getChild("right_leg");
		this.eye_symbol = this.body.getChild("eye_symbol");
		this.full_masonic_symbol2 = this.body.getChild("full_masonic_symbol2");
		this.mas_upper2 = this.full_masonic_symbol2.getChild("mas_upper2");
		this.eye_symbol3 = this.full_masonic_symbol2.getChild("eye_symbol3");
		this.masonic_symbol_lower2 = this.full_masonic_symbol2.getChild("masonic_symbol_lower2");
		this.left_hand = this.body.getChild("left_hand");
		this.right_hand = this.body.getChild("right_hand");
		this.sword = this.right_hand.getChild("sword");
		this.head = this.body.getChild("head");
		this.torso = this.body.getChild("torso");
		this.left_leg = this.body.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition knight = partdefinition.addOrReplaceChild("knight", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = knight.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(32, 58).addBox(-0.5F, -3.0F, -0.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 75).addBox(-1.5F, 10.0F, -4.3F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(84, 24).addBox(-1.5F, 2.0F, -1.3F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(42, 104).addBox(-1.5F, -2.0F, -1.3F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(50, 73).addBox(-1.0F, 9.5F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(86, 0).addBox(-1.5F, -11.0F, -1.3F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(82, 90).addBox(-2.0F, -13.0F, -1.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(96, 61).addBox(-2.0F, -10.0F, -1.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.1F, -11.0F, 0.3F));

		PartDefinition cube_r1 = right_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(100, 24).addBox(-2.101F, -2.0F, -1.0F, 5.002F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 1.8F, -2.906F, 0.0F, 0.0F));

		PartDefinition cube_r2 = right_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 55).addBox(-3.001F, -1.0F, -3.0F, 4.002F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 10.2F, -1.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = right_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(108, 82).addBox(-1.001F, -2.0F, 0.0F, 4.002F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.7F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = right_leg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 103).addBox(-0.972F, -1.0001F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 104).addBox(-0.972F, 0.4999F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -6.2F, -1.3F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r5 = right_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 113).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 114).addBox(-1.0F, 0.5F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(82, 114).addBox(-1.0F, 2.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -6.2F, -0.1F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r6 = right_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 114).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(108, 112).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(114, 0).addBox(-1.0F, -2.5F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -3.2F, -0.1F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r7 = right_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(114, 4).addBox(-1.072F, -1.0001F, -1.001F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.2F, -1.4F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r8 = right_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 112).addBox(-2.0F, -4.0F, -2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -8.0F, -0.2F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r9 = right_leg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(84, 109).addBox(-1.0F, -4.0F, -2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -8.0F, -0.2F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r10 = right_leg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(44, 81).addBox(-1.0F, -4.001F, -2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -8.0F, -1.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r11 = right_leg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(100, 90).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.8F, -1.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition eye_symbol = body.addOrReplaceChild("eye_symbol", CubeListBuilder.create().texOffs(0, 0).addBox(-9.3983F, 9.5504F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.3983F, 10.2212F, 11.1572F, 4.0247F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.2306F, 9.3827F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.8952F, 8.7119F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.268F, 8.7622F, 11.1505F, 0.3018F, 0.3019F, 0.3018F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0567F, 8.5208F, 11.1505F, 0.3018F, 0.3018F, 0.3018F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0567F, 9.0037F, 11.1505F, 0.3018F, 0.3019F, 0.3018F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0304F, 9.0037F, 11.1505F, 0.3018F, 0.3019F, 0.3018F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.8455F, 8.3095F, 11.1505F, 0.9056F, 0.3019F, 0.3018F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.8455F, 9.215F, 11.1505F, 0.9056F, 0.3019F, 0.3018F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.2121F, 8.7119F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.5475F, 8.0411F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.8829F, 7.3704F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.2244F, 7.3704F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.889F, 6.6996F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.7214F, 6.5319F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.2183F, 6.6996F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.386F, 6.5319F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.5537F, 6.1965F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.5598F, 8.0411F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.0629F, 8.8796F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.7275F, 8.2089F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.3798F, 8.2089F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.7152F, 7.5381F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.3921F, 7.5381F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0567F, 6.8673F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0506F, 6.8673F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0444F, 8.8796F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.709F, 9.5504F, 11.1572F, 0.3354F, 0.6708F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.8767F, 9.3827F, 11.1572F, 0.3354F, 0.3354F, 0.3354F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.8191F, 8.7622F, 11.1505F, 0.3018F, 0.3019F, 0.3018F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0304F, 8.5208F, 11.1505F, 0.3018F, 0.3018F, 0.3018F, new CubeDeformation(0.0F)), PartPose.offset(7.4F, -34.6F, -11.8F));

		PartDefinition full_masonic_symbol2 = body.addOrReplaceChild("full_masonic_symbol2", CubeListBuilder.create(), PartPose.offset(0.6F, -31.1F, 1.0F));

		PartDefinition mas_upper2 = full_masonic_symbol2.addOrReplaceChild("mas_upper2", CubeListBuilder.create().texOffs(64, 119).addBox(-7.1303F, 6.8132F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(60, 117).addBox(-7.2006F, 6.7428F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(66, 119).addBox(-7.1303F, 6.6725F, 12.6436F, 0.0704F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(108, 117).addBox(-9.4525F, 12.5836F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(110, 117).addBox(-7.0599F, 6.8836F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(62, 119).addBox(-7.271F, 6.8132F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(0, 118).addBox(-6.9895F, 6.9539F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(96, 117).addBox(-7.3414F, 6.8836F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 58).addBox(-6.9192F, 7.0243F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(2, 118).addBox(-7.4117F, 6.9539F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 60).addBox(-6.8488F, 7.0947F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(4, 118).addBox(-7.4821F, 7.0243F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(106, 118).addBox(-6.7784F, 7.1651F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(112, 118).addBox(-7.5525F, 7.0947F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(6, 118).addBox(-6.708F, 7.3058F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 112).addBox(-7.6229F, 7.1651F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(98, 103).addBox(-6.6377F, 7.3762F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(8, 118).addBox(-7.6932F, 7.3058F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(10, 118).addBox(-6.5673F, 7.4465F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(114, 118).addBox(-7.7636F, 7.3762F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(12, 118).addBox(-6.5673F, 7.5169F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(14, 118).addBox(-7.834F, 7.4465F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 62).addBox(-6.4969F, 7.5873F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(16, 118).addBox(-7.834F, 7.5169F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 64).addBox(-6.4969F, 7.9391F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(102, 118).addBox(-7.9043F, 7.5873F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(68, 117).addBox(-6.4266F, 8.0095F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(104, 118).addBox(-7.9043F, 7.9391F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 66).addBox(-6.3562F, 8.0799F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(62, 117).addBox(-7.9747F, 8.0095F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(60, 119).addBox(-6.2858F, 8.2206F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(116, 118).addBox(-8.0451F, 8.0799F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(18, 118).addBox(-6.2154F, 8.4317F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(54, 119).addBox(-8.1154F, 8.2206F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(56, 117).addBox(-6.2154F, 8.5725F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 118).addBox(-8.1858F, 8.4317F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(20, 118).addBox(-6.2154F, 8.7132F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(58, 117).addBox(-8.1858F, 8.5725F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 68).addBox(-6.1451F, 8.7132F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 70).addBox(-6.0747F, 8.9947F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 72).addBox(-6.1451F, 8.8539F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(98, 117).addBox(-8.2562F, 8.7132F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(74, 118).addBox(-6.0043F, 9.2058F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(28, 119).addBox(-8.3266F, 8.9947F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 74).addBox(-5.934F, 9.4873F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(22, 118).addBox(-8.3969F, 9.2058F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(56, 119).addBox(-5.8636F, 9.8391F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(24, 118).addBox(-8.4673F, 9.4873F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(76, 118).addBox(-5.7932F, 10.0502F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(58, 119).addBox(-8.5377F, 9.8391F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 76).addBox(-5.7229F, 10.2613F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(26, 118).addBox(-8.608F, 10.0502F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(78, 118).addBox(-5.6525F, 10.4725F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(76, 106).addBox(-8.6784F, 10.2613F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 78).addBox(-5.5821F, 10.7539F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 34).addBox(-8.7488F, 10.4725F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(36, 118).addBox(-5.5118F, 10.7539F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(30, 119).addBox(-8.8191F, 10.7539F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(64, 117).addBox(-5.5118F, 10.965F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(32, 119).addBox(-8.8895F, 10.7539F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(72, 117).addBox(-5.4414F, 10.965F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(88, 117).addBox(-8.8895F, 10.965F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(90, 117).addBox(-5.4414F, 11.1762F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(92, 117).addBox(-8.9599F, 10.965F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(70, 117).addBox(-5.371F, 11.1762F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(94, 117).addBox(-8.9599F, 11.1762F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(80, 118).addBox(-5.371F, 11.4576F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(66, 117).addBox(-9.0303F, 11.1762F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 80).addBox(-5.3006F, 11.4576F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 36).addBox(-9.0303F, 11.4576F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(82, 118).addBox(-5.3006F, 11.7391F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(38, 118).addBox(-9.1006F, 11.4576F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 38).addBox(-5.2303F, 11.7391F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(40, 118).addBox(-9.1006F, 11.7391F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(42, 118).addBox(-5.2303F, 11.9502F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(44, 118).addBox(-9.171F, 11.7391F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(46, 118).addBox(-5.1599F, 11.9502F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 46).addBox(-9.171F, 11.9502F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 48).addBox(-5.1599F, 12.1613F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(34, 119).addBox(-9.2414F, 11.9502F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(84, 118).addBox(-5.0895F, 12.1613F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(48, 119).addBox(-9.2414F, 12.1613F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 54).addBox(-9.3117F, 12.1613F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(86, 118).addBox(-5.0895F, 12.3021F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(118, 56).addBox(-9.3117F, 12.3021F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(100, 118).addBox(-5.0192F, 12.3021F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(28, 109).addBox(-5.0192F, 12.4428F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(50, 119).addBox(-9.3821F, 12.3021F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(26, 114).addBox(-4.9489F, 12.4428F, 12.6437F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(72, 115).addBox(-9.3821F, 12.4428F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(52, 119).addBox(-4.9488F, 12.5836F, 12.6436F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F))
		.texOffs(86, 116).addBox(-9.4622F, 12.4428F, 12.6437F, 0.2111F, 0.6333F, 0.7741F, new CubeDeformation(0.0F)), PartPose.offset(6.5F, -13.3F, -15.3F));

		PartDefinition eye_symbol3 = full_masonic_symbol2.addOrReplaceChild("eye_symbol3", CubeListBuilder.create().texOffs(0, 0).addBox(-8.3549F, 10.9003F, 12.6486F, 0.2147F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.3549F, 11.3296F, 12.6486F, 2.5758F, 0.2146F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.2476F, 10.7929F, 12.6486F, 0.2146F, 0.2146F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0329F, 10.3636F, 12.6486F, 0.2146F, 0.2147F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.6315F, 10.3958F, 12.6443F, 0.1932F, 0.1932F, 0.1932F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.4963F, 10.2413F, 12.6443F, 0.1932F, 0.1932F, 0.1932F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.4963F, 10.5504F, 12.6443F, 0.1932F, 0.1932F, 0.1932F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.8395F, 10.5504F, 12.6443F, 0.1932F, 0.1932F, 0.1932F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.3611F, 10.1061F, 12.6443F, 0.5796F, 0.1932F, 0.1932F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.3611F, 10.6856F, 12.6443F, 0.5796F, 0.1932F, 0.1932F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.3157F, 10.3636F, 12.6486F, 0.2146F, 0.2147F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.5304F, 9.9343F, 12.6486F, 0.2147F, 0.2147F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.745F, 9.505F, 12.6486F, 0.2147F, 0.2146F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.6036F, 9.505F, 12.6486F, 0.2147F, 0.2146F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.389F, 9.0757F, 12.6486F, 0.2146F, 0.2147F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.2817F, 8.9684F, 12.6486F, 0.2147F, 0.2147F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.9597F, 9.0757F, 12.6486F, 0.2146F, 0.2147F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.067F, 8.9684F, 12.6486F, 0.2146F, 0.2147F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.1743F, 8.7537F, 12.6486F, 0.2146F, 0.2146F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.8183F, 9.9343F, 12.6486F, 0.2147F, 0.2147F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.1403F, 10.471F, 12.6486F, 0.2146F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.9256F, 10.0417F, 12.6486F, 0.2147F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.4231F, 10.0417F, 12.6486F, 0.2147F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.6377F, 9.6124F, 12.6486F, 0.2147F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.711F, 9.6124F, 12.6486F, 0.2147F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.4963F, 9.1831F, 12.6486F, 0.2146F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.8524F, 9.1831F, 12.6486F, 0.2146F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.2084F, 10.471F, 12.6486F, 0.2146F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.9937F, 10.9003F, 12.6486F, 0.2146F, 0.4293F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.1011F, 10.7929F, 12.6486F, 0.2146F, 0.2146F, 0.2147F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.7042F, 10.3958F, 12.6443F, 0.1932F, 0.1932F, 0.1932F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.8395F, 10.2413F, 12.6443F, 0.1932F, 0.1932F, 0.1932F, new CubeDeformation(0.0F)), PartPose.offset(6.5F, -13.3F, -15.1F));

		PartDefinition masonic_symbol_lower2 = full_masonic_symbol2.addOrReplaceChild("masonic_symbol_lower2", CubeListBuilder.create().texOffs(112, 114).addBox(1.7718F, -2.4963F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(44, 116).addBox(1.9141F, -2.6386F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 104).addBox(2.0565F, -2.7809F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 96).addBox(2.1988F, -2.9232F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 20).addBox(2.6257F, -3.3502F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 116).addBox(2.7681F, -3.4925F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 8).addBox(2.3411F, -3.0655F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 10).addBox(2.4834F, -3.2079F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 90).addBox(-1.0746F, -0.2191F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 22).addBox(-0.9956F, -0.14F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(28, 117).addBox(-0.6002F, -0.14F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(60, 115).addBox(-0.6793F, -0.061F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 86).addBox(-0.8374F, -0.061F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(64, 115).addBox(-0.9165F, -0.061F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 88).addBox(-0.8374F, 0.0181F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(56, 115).addBox(-0.7584F, 0.0181F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 24).addBox(-1.2169F, -0.3614F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(16, 116).addBox(-1.3593F, -0.5038F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 26).addBox(-1.5016F, -0.6461F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 16).addBox(-1.9286F, -1.073F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 18).addBox(-2.0709F, -1.2154F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 106).addBox(-1.6439F, -0.7884F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 108).addBox(-1.7862F, -0.9307F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 28).addBox(1.0602F, -1.8558F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(114, 112).addBox(1.3448F, -2.1404F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(40, 116).addBox(1.2025F, -1.9981F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(82, 116).addBox(1.6295F, -2.4251F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 98).addBox(1.4872F, -2.2828F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(100, 116).addBox(0.9179F, -1.7135F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(20, 116).addBox(0.6332F, -1.4288F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 110).addBox(0.7756F, -1.5712F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(68, 115).addBox(-3.7787F, -2.9232F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(0, 116).addBox(-4.0634F, -3.2079F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(4, 116).addBox(-3.9211F, -3.0655F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 30).addBox(-4.348F, -3.4925F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(48, 117).addBox(-4.2057F, -3.3502F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 92).addBox(-3.6364F, -2.7809F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(48, 115).addBox(-3.3518F, -2.4963F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(52, 117).addBox(-3.4941F, -2.6386F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 32).addBox(-0.0784F, -0.6461F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 100).addBox(0.2063F, -0.9307F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(12, 116).addBox(0.0639F, -0.7884F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 12).addBox(0.4909F, -1.2154F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 102).addBox(0.3486F, -1.073F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 14).addBox(-0.2207F, -0.5038F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(104, 116).addBox(-0.5053F, -0.2191F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(32, 117).addBox(-0.363F, -0.3614F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(24, 116).addBox(-2.6402F, -1.8558F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 52).addBox(-2.9248F, -2.1404F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(36, 116).addBox(-2.7825F, -1.9981F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(52, 115).addBox(-3.2095F, -2.4251F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(112, 116).addBox(-3.0671F, -2.2828F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(8, 116).addBox(-2.4978F, -1.7135F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 94).addBox(-2.2132F, -1.4288F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F))
		.texOffs(116, 114).addBox(-2.3555F, -1.5712F, -2.6967F, 0.6325F, 0.7116F, 0.7116F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_hand = body.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(104, 72).addBox(7.7F, -31.7F, -0.6F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(102, 0).mirror().addBox(7.9F, -42.4F, -0.8F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(100, 29).mirror().addBox(4.0F, -39.9F, 0.2F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.6F, 0.0F, 0.0F));

		PartDefinition cube_r12 = left_hand.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 88).addBox(6.1F, -23.7F, -0.305F, 1.0F, 2.0F, 3.006F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r13 = left_hand.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(100, 19).mirror().addBox(2.999F, 15.0F, -5.0F, 5.002F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.2F, -9.6F, 2.5F, -2.906F, 0.0F, 0.0F));

		PartDefinition cube_r14 = left_hand.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(82, 86).addBox(29.8F, 8.7F, 0.2F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r15 = left_hand.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(21.8F, 8.7F, 0.2F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r16 = left_hand.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 40).addBox(29.8F, 8.7F, 0.2F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 93).addBox(39.8F, 7.1F, -1.8F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r17 = left_hand.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(104, 105).mirror().addBox(9.9F, -16.0F, -0.8F, 1.6F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -54.2F, 2.4F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r18 = left_hand.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 104).mirror().addBox(-18.8F, -28.0F, -0.79F, 2.0F, 4.0F, 3.9888F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.1F, -8.7F, 0.0F, 0.0F, 0.0F, 0.6458F));

		PartDefinition cube_r19 = left_hand.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(76, 109).addBox(-6.6F, -21.9F, -0.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition cube_r20 = left_hand.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(108, 114).addBox(-5.1F, -23.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r21 = left_hand.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(86, 74).addBox(34.8F, 7.7F, -0.8F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r22 = left_hand.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 103).addBox(23.8F, 8.2F, -0.4F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r23 = left_hand.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(84, 67).addBox(40.8F, 7.1F, -1.8F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r24 = left_hand.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(104, 86).addBox(-3.001F, -1.3F, 6.3F, 4.002F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.7F, -35.7F, -2.6F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r25 = left_hand.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(100, 100).addBox(3.0F, -19.0F, -5.6F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, -8.0F, -1.3F, -0.2967F, 0.0F, 0.0F));

		PartDefinition right_hand = body.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(100, 29).addBox(-10.0F, -39.9F, 0.2F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(102, 0).addBox(-9.9F, -42.4F, -0.8F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(104, 77).addBox(-11.7F, -31.7F, -0.6F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.6F, 0.0F, 0.0F));

		PartDefinition cube_r26 = right_hand.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(20, 109).addBox(-7.1F, -23.7F, -0.305F, 1.0F, 2.0F, 3.006F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r27 = right_hand.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(100, 19).addBox(-8.001F, 15.0F, -5.0F, 5.002F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, -9.6F, 2.5F, -2.906F, 0.0F, 0.0F));

		PartDefinition cube_r28 = right_hand.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 107).addBox(-1.001F, -1.3F, 6.3F, 4.002F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.7F, -35.7F, -2.6F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r29 = right_hand.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(104, 105).addBox(-11.5F, -16.0F, -0.8F, 1.6F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -54.2F, 2.4F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r30 = right_hand.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 104).addBox(16.8F, -28.0F, -0.79F, 2.0F, 4.0F, 3.9888F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1F, -8.7F, 0.0F, 0.0F, 0.0F, -0.6458F));

		PartDefinition cube_r31 = right_hand.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(42, 109).addBox(5.6F, -21.9F, -0.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7F, -4.3F, 0.0F, 0.0F, 0.0F, -1.0559F));

		PartDefinition cube_r32 = right_hand.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1F, -23.5F, -0.4F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3665F));

		PartDefinition cube_r33 = right_hand.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(88, 114).addBox(4.1F, -23.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r34 = right_hand.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(86, 82).addBox(-30.8F, 8.7F, 0.2F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r35 = right_hand.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 103).addBox(-27.8F, 8.2F, -0.4F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r36 = right_hand.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 102).addBox(-8.0F, -19.0F, -5.6F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, -8.0F, -1.3F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r37 = right_hand.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(64, 86).addBox(-39.8F, 7.7F, -0.8F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 2.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r38 = right_hand.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(44, 86).addBox(-44.8F, 7.1F, -1.8F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r39 = right_hand.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(34, 93).addBox(-40.8F, 7.1F, -1.8F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r40 = right_hand.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(82, 36).addBox(-38.8F, 8.7F, 0.2F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition sword = right_hand.addOrReplaceChild("sword", CubeListBuilder.create().texOffs(8, 111).addBox(-7.9F, -3.8F, 17.3F, 1.4F, 3.8F, 1.4F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-7.702F, -2.1F, -4.6F, 0.604F, 0.5F, 22.4F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.7F, -1.6F, -4.6F, 0.6F, 1.0F, 22.4F, new CubeDeformation(0.0F)), PartPose.offset(-1.8F, -19.0F, -19.9F));

		PartDefinition cube_r41 = sword.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(100, 112).addBox(-8.17F, 10.6F, 13.3F, 1.9F, 1.6F, 1.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r42 = sword.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(36, 112).addBox(9.599F, -11.9F, 7.5F, 0.602F, 1.8F, 1.8F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.3F, 0.0F, -18.3F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r43 = sword.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 0).addBox(-10.2F, -3.2F, 13.7F, 0.6F, 1.0F, 22.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.3F, -5.3F, -18.3F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r44 = sword.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 99).addBox(-13.601F, 18.1F, 20.08F, 1.402F, 2.0F, 1.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7F, -2.8F, -10.7F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r45 = sword.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(100, 34).addBox(-12.7F, 8.8F, 35.0F, 1.0F, 1.0F, 0.3F, new CubeDeformation(0.0F))
		.texOffs(100, 34).addBox(-12.9F, 8.6F, 34.5F, 1.4F, 1.4F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(104, 34).addBox(-12.7F, 8.8F, 29.4F, 1.0F, 1.0F, 5.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9F, 0.1F, -10.7F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r46 = sword.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(78, 99).addBox(-13.599F, -18.7F, 21.5F, 1.4F, 2.0F, 1.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7F, 6.9F, 45.0F, 2.2253F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(70, 57).addBox(-4.0F, -32.5F, 0.6F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(72, 51).addBox(-5.55F, -33.8F, 5.4F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(-5.0F, -34.5F, -2.7F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-5.0F, -39.5F, -2.7F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(40, 57).addBox(-4.0F, -37.5F, 0.3F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(114, 46).addBox(-4.8F, -37.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(114, 59).addBox(-3.0F, -37.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(114, 63).addBox(-1.0F, -37.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(74, 114).addBox(0.0F, -37.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(78, 114).addBox(2.0F, -37.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(114, 55).addBox(3.8F, -37.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 12).addBox(-5.0F, -40.5F, -1.7F, 10.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-5.0F, -41.5F, 0.3F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(46, 31).addBox(-5.0F, -32.5F, -1.7F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(50, 75).addBox(4.0F, -37.5F, -0.7F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(68, 75).addBox(-5.0F, -37.5F, -0.7F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 71).addBox(-5.4F, -35.8F, 4.6F, 11.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(70, 64).addBox(-5.4F, -36.8F, 5.6F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 55).addBox(-5.4F, -37.8F, 6.6F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-2.1F, -49.6F, 6.3F, 4.2F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(46, 22).addBox(-5.6F, -33.3F, -2.2F, 11.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(22, 81).addBox(-3.0F, -30.9F, -0.2F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -11.1F, -0.6F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(12, 107).addBox(-0.5F, -28.3F, -47.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 107).addBox(1.0F, -28.3F, -47.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 103).addBox(-2.0F, -28.3F, -47.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(106, 11).addBox(-0.5F, -31.3F, -47.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 11).addBox(-2.0F, -31.3F, -47.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 40).addBox(1.0F, -31.3F, -47.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(82, 33).addBox(2.0F, -31.3F, -47.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(82, 31).addBox(2.0F, -29.3F, -47.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 71).addBox(-2.0F, -29.3F, -47.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 65).addBox(-2.0F, -31.3F, -47.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 8).addBox(-2.0F, -28.3F, -50.3F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(50, 109).addBox(2.0F, -31.3F, -50.3F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(22, 75).addBox(-2.0F, -31.3F, -50.3F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(100, 41).addBox(-2.0F, -31.3F, -50.3F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4F, 0.5F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(98, 46).addBox(-2.0F, -45.3F, -42.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4F, 0.5F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(100, 12).addBox(-2.0F, -55.7F, -25.6F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4F, 0.6F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(62, 99).addBox(-2.0F, -57.6F, -11.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4F, 0.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(92, 105).addBox(-1.5F, -55.9F, -8.7F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 65).addBox(-6.0F, -43.1F, -22.4F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.4F, 2.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(58, 67).addBox(-5.0F, -27.3F, -0.2F, 10.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(16, 88).addBox(-4.0F, -30.3F, 0.3F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 46).addBox(-4.5F, -30.9F, -0.7F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(30, 67).addBox(-5.0F, -32.9F, -0.7F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(46, 40).addBox(-5.5F, -34.9F, -0.7F, 11.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(76, 44).addBox(-5.0F, -37.5F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 46).addBox(-5.5F, -40.9F, -1.2F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(98, 44).addBox(-5.0F, -37.5F, 2.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 94).addBox(-4.5F, -39.9F, -1.5F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.1F));

		PartDefinition cube_r53 = torso.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 106).addBox(-14.2F, -23.9F, -0.201F, 2.0F, 4.0F, 3.002F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r54 = torso.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(66, 106).addBox(12.0F, -24.0F, 0.798F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, -1.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r55 = torso.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(16, 100).addBox(-4.01F, -19.6F, 5.0F, 8.02F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.5F, -5.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r56 = torso.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(16, 100).addBox(-4.01F, -20.0F, 1.0F, 8.02F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 1.6F, 0.1571F, 0.0F, 0.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, -8.2F, -0.2F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(12, 109).addBox(0.0F, -13.2F, 0.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 73).addBox(-1.0F, -0.2F, -3.2F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(84, 12).addBox(-1.0F, -21.2F, -0.2F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(30, 65).addBox(-0.5F, -0.7F, 2.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 61).addBox(-1.5F, -20.2F, 0.1F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 93).addBox(-1.5F, -23.2F, 0.1F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(104, 67).addBox(-1.0F, -12.2F, -0.2F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6F, -0.8F, -0.8F));

		PartDefinition cube_r57 = left_leg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(96, 55).mirror().addBox(-1.001F, -1.0F, -3.0F, 4.002F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r58 = left_leg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(100, 24).mirror().addBox(-2.901F, -2.0F, -1.0F, 5.002F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -9.0F, 2.9F, -2.906F, 0.0F, 0.0F));

		PartDefinition cube_r59 = left_leg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(108, 82).mirror().addBox(-3.001F, -2.0F, 0.0F, 4.002F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -11.2F, 1.8F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r60 = left_leg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(100, 95).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -7.4F, 0.1F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r61 = left_leg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(92, 112).addBox(-1.0F, -4.0F, -2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -18.2F, 0.9F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r62 = left_leg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(16, 83).addBox(-1.0F, -4.001F, -2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -18.2F, -0.4F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r63 = left_leg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 111).addBox(-2.0F, -4.0F, -2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -18.2F, 0.9F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r64 = left_leg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(56, 113).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(114, 6).addBox(-1.0F, 0.5F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(114, 50).addBox(-1.0F, 2.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -16.4F, 1.0F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r65 = left_leg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(98, 53).addBox(-1.028F, -1.0001F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 53).addBox(-1.028F, 0.4999F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -16.4F, -0.2F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r66 = left_leg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(110, 53).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 113).addBox(-1.0F, 0.5F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(114, 41).addBox(-1.0F, 2.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -16.4F, 1.0F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r67 = left_leg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(114, 2).addBox(-0.928F, -1.0001F, -1.001F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -13.4F, -0.3F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		knight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return knight;
	}
}