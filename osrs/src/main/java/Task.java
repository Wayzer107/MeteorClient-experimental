import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("Task")
public class Task {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	Task next;
	@ObfuscatedName("am")
	public volatile int status;
	@ObfuscatedName("as")
	int type;
	@ObfuscatedName("aj")
	public int intArgument;
	@ObfuscatedName("ag")
	Object objectArgument;
	@ObfuscatedName("az")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
