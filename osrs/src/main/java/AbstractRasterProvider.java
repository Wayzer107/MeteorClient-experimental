import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ar")
	public int[] pixels;
	@ObfuscatedName("am")
	public int width;
	@ObfuscatedName("as")
	public int height;
	@ObfuscatedName("aj")
	protected float[] field4179;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2103103659"
	)
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-93"
	)
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1721609371"
	)
	public final void apply() {
		Rasterizer2D.method2601(this.pixels, this.width, this.height, this.field4179);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "24429174"
	)
	public final void method2627(boolean var1) {
		this.field4179 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
