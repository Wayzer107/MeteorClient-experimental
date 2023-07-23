import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "448946158"
	)
	void postDecode() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "595587202"
	)
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class141.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-154725242"
	)
	public int getIntParam(int var1, int var2) {
		return FileSystem.method904(this.params, var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-86"
	)
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}
}
