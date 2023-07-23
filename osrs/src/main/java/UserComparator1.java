import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("UserComparator1")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("aw")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqe;Lqe;B)I",
		garbageValue = "75"
	)
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1);
	}

	@ObfuscatedName("compare")
	public int compare(Object var1, Object var2) {
		return this.compare_bridged((User)var1, (User)var2);
	}

	@ObfuscatedName("equals")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
