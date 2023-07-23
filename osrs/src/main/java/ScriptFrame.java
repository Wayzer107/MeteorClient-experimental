import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	Script script;
	@ObfuscatedName("ay")
	int pc;
	@ObfuscatedName("ar")
	int[] intLocals;
	@ObfuscatedName("am")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-922438804"
	)
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (Login.loadInterface(var0)) {
				Widget[] var1 = ArchiveLoader.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						UserComparator8.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	static final void method336() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.endCycle == -1) {
				var0.startCycle = 0;
				class11.method40(var0);
			} else {
				var0.remove();
			}
		}

	}
}
