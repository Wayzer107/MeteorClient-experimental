import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "104966018"
	)
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "37"
	)
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1055724816"
	)
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1968685542"
	)
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lmr;",
		garbageValue = "119"
	)
	Coord coord(int var1, int var2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "706418314"
	)
	void read(Buffer var1);
}
