import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field1616(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field1615(1, 2);

	@ObfuscatedName("wk")
	static long field1614;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("am")
	public final int value;
	@ObfuscatedName("as")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	public int rsOrdinal() {
		return this.id;
	}
}
