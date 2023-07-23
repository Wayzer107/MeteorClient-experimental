import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	PcmStream after;
	@ObfuscatedName("ae")
	int field248;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	AbstractSound sound;
	@ObfuscatedName("ad")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("az")
	protected abstract int vmethod5648();

	@ObfuscatedName("av")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("aq")
	protected abstract void skip(int var1);

	@ObfuscatedName("by")
	int vmethod1019() {
		return 255;
	}

	@ObfuscatedName("gy")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
