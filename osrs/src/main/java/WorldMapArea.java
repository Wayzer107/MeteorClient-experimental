import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("aw")
	int id;
	@ObfuscatedName("ay")
	String internalName;
	@ObfuscatedName("ar")
	String externalName;
	@ObfuscatedName("am")
	int backGroundColor;
	@ObfuscatedName("as")
	int zoom;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	Coord origin;
	@ObfuscatedName("ag")
	int regionLowX;
	@ObfuscatedName("az")
	int regionHighX;
	@ObfuscatedName("av")
	int regionLowY;
	@ObfuscatedName("ap")
	int regionHighY;
	@ObfuscatedName("aq")
	boolean isMain;
	@ObfuscatedName("at")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.backGroundColor = -1;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "1472949028"
	)
	public void read(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.backGroundColor = var1.readInt();
		var1.readUnsignedByte();
		this.isMain = var1.readUnsignedByte() == 1;
		this.zoom = var1.readUnsignedByte();
		int var3 = var1.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)Lkz;",
		garbageValue = "2141604791"
	)
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE2};
		WorldMapSectionType var4 = (WorldMapSectionType)ClientPreferences.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new WorldMapSection1();
			break;
		case 1:
			var5 = new WorldMapSection2();
			break;
		case 2:
			var5 = new class261();
			break;
		case 3:
			var5 = new WorldMapSection0();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var5).read(var1);
		return (WorldMapSection)var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2035965907"
	)
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1924447461"
	)
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64;
		int var4 = var2 / 64;
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false;
					}

					var6 = (WorldMapSection)var5.next();
				} while(!var6.containsPosition(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-40"
	)
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5.getBorderTileLengths(var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Lmr;",
		garbageValue = "322661377"
	)
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator();

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (WorldMapSection)var3.next();
		} while(!var4.containsPosition(var1, var2));

		return var4.coord(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2141810509"
	)
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1427046787"
	)
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-128"
	)
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-77"
	)
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1981016427"
	)
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-389390805"
	)
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-155817671"
	)
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1352292707"
	)
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-101"
	)
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lmr;",
		garbageValue = "117"
	)
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1522833237"
	)
	static final boolean method1383(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1581255918"
	)
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class503.getPacketBufferNode(ClientPacket.CONTINUE, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeIntME(var0);
		Client.packetWriter.addNode(var2);
	}
}
