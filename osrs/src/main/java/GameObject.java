import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("aw")
	int plane;
	@ObfuscatedName("ay")
	int z;
	@ObfuscatedName("ar")
	int centerX;
	@ObfuscatedName("am")
	int centerY;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public Renderable renderable;
	@ObfuscatedName("aj")
	int orientation;
	@ObfuscatedName("ag")
	int startX;
	@ObfuscatedName("az")
	int endX;
	@ObfuscatedName("av")
	int startY;
	@ObfuscatedName("ap")
	int endY;
	@ObfuscatedName("aq")
	int field2282;
	@ObfuscatedName("at")
	int lastDrawn;
	@ObfuscatedName("ah")
	public long tag;
	@ObfuscatedName("ax")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "37"
	)
	public static int method1358(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-982961579"
	)
	static int method1359(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}
}
