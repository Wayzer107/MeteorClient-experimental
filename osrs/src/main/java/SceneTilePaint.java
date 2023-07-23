import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("aw")
	int swColor;
	@ObfuscatedName("ay")
	int seColor;
	@ObfuscatedName("ar")
	int neColor;
	@ObfuscatedName("am")
	int nwColor;
	@ObfuscatedName("as")
	int texture;
	@ObfuscatedName("aj")
	boolean isFlat;
	@ObfuscatedName("ag")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)Lih;",
		garbageValue = "107"
	)
	public static class213 method1324() {
		return Client.keyHandlerInstance;
	}
}
