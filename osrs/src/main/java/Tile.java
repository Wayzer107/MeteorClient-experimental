import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	static Fonts field1985;
	@ObfuscatedName("aw")
	int plane;
	@ObfuscatedName("ay")
	int x;
	@ObfuscatedName("ar")
	int y;
	@ObfuscatedName("am")
	int originalPlane;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	SceneTilePaint paint;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	SceneTileModel model;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	BoundaryObject boundaryObject;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	WallDecoration wallDecoration;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	FloorDecoration floorDecoration;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	ItemLayer itemLayer;
	@ObfuscatedName("aq")
	int gameObjectsCount;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ljc;"
	)
	GameObject[] gameObjects;
	@ObfuscatedName("ah")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ax")
	int gameObjectsEdgeMask;
	@ObfuscatedName("aa")
	int minPlane;
	@ObfuscatedName("au")
	boolean drawPrimary;
	@ObfuscatedName("ae")
	boolean drawSecondary;
	@ObfuscatedName("ab")
	boolean drawGameObjects;
	@ObfuscatedName("ad")
	int drawGameObjectEdges;
	@ObfuscatedName("ao")
	int field1995;
	@ObfuscatedName("ac")
	int field1991;
	@ObfuscatedName("ak")
	int field1993;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhi;",
		garbageValue = "1533776836"
	)
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = IntHashTable.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "83"
	)
	static final void method1160(String var0) {
		class415.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1158913545"
	)
	static final void method1161() {
		Client.field514 = Client.cycleCntr;
		class458.field3887 = true;
	}
}
