import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "84"
	)
	int[] getTexturePixels(int var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1542791475"
	)
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "41"
	)
	boolean vmethod3989(int var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1788191406"
	)
	boolean isLowDetail(int var1);
}
