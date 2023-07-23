import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ew")
	public long keyDual;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	public DualNode previousDual;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	public DualNode nextDual;

	@ObfuscatedName("fy")
	public void removeDual() {
		if (this.nextDual != null) {
			this.nextDual.previousDual = this.previousDual;
			this.previousDual.nextDual = this.nextDual;
			this.previousDual = null;
			this.nextDual = null;
		}
	}
}
