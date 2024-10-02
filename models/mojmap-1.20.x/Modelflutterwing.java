// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelflutterwing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "flutterwing"), "main");
	private final ModelPart body;
	private final ModelPart Wing2;
	private final ModelPart Wing1;
	private final ModelPart Head;

	public Modelflutterwing(ModelPart root) {
		this.body = root.getChild("body");
		this.Wing2 = root.getChild("Wing2");
		this.Wing1 = root.getChild("Wing1");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body_r1 = body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(16, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.25F, 4.25F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Wing2 = partdefinition.addOrReplaceChild("Wing2", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 11.75F, 3.75F));

		PartDefinition Wing_r1 = Wing2.addOrReplaceChild("Wing_r1",
				CubeListBuilder.create().texOffs(0, 23).addBox(-18.0F, -5.75F, 0.0F, 16.0F, 19.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, -3.75F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Wing1 = partdefinition.addOrReplaceChild("Wing1", CubeListBuilder.create(),
				PartPose.offset(2.0F, 11.75F, 3.75F));

		PartDefinition Wing_r2 = Wing1.addOrReplaceChild("Wing_r2",
				CubeListBuilder.create().texOffs(0, 23).mirror()
						.addBox(2.0F, -5.75F, 0.0F, 16.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -3.75F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.75F, 2.0F));

		PartDefinition Antenna_r1 = Head.addOrReplaceChild("Antenna_r1",
				CubeListBuilder.create().texOffs(16, 15)
						.addBox(-2.0F, -7.75F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 8)
						.addBox(-2.0F, -0.75F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Wing2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Wing1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Wing2.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Wing1.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}