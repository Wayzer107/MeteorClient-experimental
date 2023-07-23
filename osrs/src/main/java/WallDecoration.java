import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("aw")
	int z;
	@ObfuscatedName("ay")
	int x;
	@ObfuscatedName("ar")
	int y;
	@ObfuscatedName("am")
	int orientation;
	@ObfuscatedName("as")
	int orientation2;
	@ObfuscatedName("aj")
	int xOffset;
	@ObfuscatedName("ag")
	int yOffset;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public Renderable renderable1;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public Renderable renderable2;
	@ObfuscatedName("ap")
	public long tag;
	@ObfuscatedName("aq")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "63"
	)
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6;
	}
}
