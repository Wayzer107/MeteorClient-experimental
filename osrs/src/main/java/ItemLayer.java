import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("aw")
	int z;
	@ObfuscatedName("ay")
	int x;
	@ObfuscatedName("ar")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	Renderable first;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	Renderable second;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	Renderable third;
	@ObfuscatedName("ag")
	long tag;
	@ObfuscatedName("az")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldw;",
		garbageValue = "-986587125"
	)
	static AttackOption[] method1129() {
		return new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1089, AttackOption.field1090};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Luc;",
		garbageValue = "643907738"
	)
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field4185, FillMode.field4184};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "2136056509"
	)
	public static int method1128(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}
}
