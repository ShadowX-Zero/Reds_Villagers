package net.mcreator.redsvillagers.client.gui;

public class ArrowSmithGUIScreen extends AbstractContainerScreen<ArrowSmithGUIMenu> {

	private final static HashMap<String, Object> guistate = ArrowSmithGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ArrowSmithGUIScreen(ArrowSmithGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 175;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("reds_villagers:textures/screens/arrow_smith_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("reds_villagers:textures/screens/arrowscreensymbol.png"), this.leftPos + 80, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.reds_villagers.arrow_smith_gui.label_arrowsmithing"), 50, 8, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.reds_villagers.arrow_smith_gui.label_empty"), 45, 43, -12829636, false);
	}

	@Override
	public void init() {
		super.init();

	}

}
