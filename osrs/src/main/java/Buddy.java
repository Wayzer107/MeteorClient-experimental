import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("as")
	public int world;
	@ObfuscatedName("aj")
	public int int2;
	@ObfuscatedName("ag")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-104"
	)
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1047684295"
	)
	public boolean hasWorld() {
		return this.world > 0;
	}
}
