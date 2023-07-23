import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mq")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("aw")
	static int[] Varps_masks;
	@ObfuscatedName("ay")
	public static int[] Varps_temp;
	@ObfuscatedName("ar")
	public static int[] Varps_main;
	@ObfuscatedName("gv")
	static int currentPort;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}
}
