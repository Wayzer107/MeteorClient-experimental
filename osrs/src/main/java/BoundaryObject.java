import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public static AbstractArchive field2256;
	@ObfuscatedName("aw")
	int z;
	@ObfuscatedName("ay")
	int x;
	@ObfuscatedName("ar")
	int y;
	@ObfuscatedName("am")
	int orientationA;
	@ObfuscatedName("as")
	int orientationB;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public Renderable renderable1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public Renderable renderable2;
	@ObfuscatedName("az")
	public long tag;
	@ObfuscatedName("av")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
