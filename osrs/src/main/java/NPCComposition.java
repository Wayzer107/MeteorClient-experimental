import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static PlatformInfo field1570;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public static AbstractArchive field1567;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("aj")
	@Export("id")
	public int id;
	@ObfuscatedName("ag")
	@Export("name")
	public String name;
	@ObfuscatedName("az")
	@Export("size")
	public int size;
	@ObfuscatedName("av")
	@Export("models")
	int[] models;
	@ObfuscatedName("ap")
	int[] field1577;
	@ObfuscatedName("aq")
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("at")
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ah")
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ax")
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("aa")
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("au")
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ae")
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ab")
	@Export("runSequence")
	public int runSequence;
	@ObfuscatedName("ad")
	@Export("runBackSequence")
	public int runBackSequence;
	@ObfuscatedName("ao")
	@Export("runLeftSequence")
	public int runLeftSequence;
	@ObfuscatedName("ac")
	@Export("runRightSequence")
	public int runRightSequence;
	@ObfuscatedName("ak")
	@Export("crawlSequence")
	public int crawlSequence;
	@ObfuscatedName("an")
	@Export("crawlBackSequence")
	public int crawlBackSequence;
	@ObfuscatedName("af")
	@Export("crawlLeftSequence")
	public int crawlLeftSequence;
	@ObfuscatedName("ai")
	@Export("crawlRightSequence")
	public int crawlRightSequence;
	@ObfuscatedName("al")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bd")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bb")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bn")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ba")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bf")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bs")
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bp")
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bv")
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bq")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bo")
	@Export("ambient")
	int ambient;
	@ObfuscatedName("br")
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bw")
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("be")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bc")
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bi")
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bu")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bk")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bz")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bx")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bh")
	@Export("headIconSpriteIndexes")
	short[] headIconSpriteIndexes;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.runBackSequence = -1;
		this.runLeftSequence = -1;
		this.runRightSequence = -1;
		this.crawlSequence = -1;
		this.crawlBackSequence = -1;
		this.crawlLeftSequence = -1;
		this.crawlRightSequence = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
		this.headIconArchiveIds = null;
		this.headIconSpriteIndexes = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "906627314"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "80"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "2143209883"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 == 18) {
			var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field1577 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1577[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) {
				var3 = var1.readUnsignedByte();
				var4 = 0;

				for (var5 = var3; var5 != 0; var5 >>= 1) {
					++var4;
				}

				this.headIconArchiveIds = new int[var4];
				this.headIconSpriteIndexes = new short[var4];

				for (int var6 = 0; var6 < var4; ++var6) {
					if ((var3 & 1 << var6) == 0) {
						this.headIconArchiveIds[var6] = -1;
						this.headIconSpriteIndexes[var6] = -1;
					} else {
						this.headIconArchiveIds[var6] = var1.method2543();
						this.headIconSpriteIndexes[var6] = (short)var1.method2540();
					}
				}
			} else if (var2 == 103) {
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.isInteractable = false;
				} else if (var2 == 109) {
					this.isClickable = false;
				} else if (var2 == 111) {
					this.isFollower = true;
				} else if (var2 == 114) {
					this.runSequence = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.runSequence = var1.readUnsignedShort();
					this.runBackSequence = var1.readUnsignedShort();
					this.runLeftSequence = var1.readUnsignedShort();
					this.runRightSequence = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.crawlSequence = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.crawlSequence = var1.readUnsignedShort();
					this.crawlBackSequence = var1.readUnsignedShort();
					this.crawlLeftSequence = var1.readUnsignedShort();
					this.crawlRightSequence = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = class141.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort();
				if (this.transformVarbit == 65535) {
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort();
				if (this.transformVarp == 65535) {
					this.transformVarp = -1;
				}

				var3 = -1;
				if (var2 == 118) {
					var3 = var1.readUnsignedShort();
					if (var3 == 65535) {
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte();
				this.transforms = new int[var4 + 2];

				for (var5 = 0; var5 <= var4; ++var5) {
					this.transforms[var5] = var1.readUnsignedShort();
					if (this.transforms[var5] == 65535) {
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3;
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lig;ILig;ILhs;I)Ljo;",
		garbageValue = "1827488061"
	)
	public final Model method966(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NewShit var5) {
		if (this.transforms != null) {
			NPCComposition var6 = this.transform();
			return var6 == null ? null : var6.method966(var1, var2, var3, var4, var5);
		} else {
			long var10 = (long)this.id;
			if (var5 != null) {
				var10 |= var5.field1566 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var10);
			if (var8 == null) {
				ModelData var9 = this.method968(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var8, var10);
			}

			Model var12;
			if (var1 != null && var3 != null) {
				var12 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var12 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) {
				var12 = var3.transformActorModel(var8, var4);
			} else {
				var12 = var8.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var12.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var12;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)Lie;",
		garbageValue = "1919655467"
	)
	public final ModelData method967(NewShit var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method967(var1);
		} else {
			return this.method968(this.field1577, var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([ILhs;I)Lie;",
		garbageValue = "1988428396"
	)
	ModelData method968(int[] var1, NewShit var2) {
		int[] var3 = var1;
		if (var2 != null && var2.field1562 != null) {
			var3 = var2.field1562;
		}

		if (var3 == null) {
			return null;
		} else {
			boolean var4 = false;

			for (int var5 = 0; var5 < var3.length; ++var5) {
				if (var3[var5] != -1 && !field1567.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field1567, var3[var6], 0);
				}

				ModelData var10;
				if (var9.length == 1) {
					var10 = var9[0];
					if (var10 == null) {
						var10 = new ModelData(var9, var9.length);
					}
				} else {
					var10 = new ModelData(var9, var9.length);
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) {
					var7 = this.recolorTo;
					if (var2 != null && var2.field1564 != null) {
						var7 = var2.field1564;
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) {
						var10.recolor(this.recolorFrom[var8], var7[var8]);
					}
				}

				if (this.retextureFrom != null) {
					var7 = this.retextureTo;
					if (var2 != null && var2.field1563 != null) {
						var7 = var2.field1563;
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) {
						var10.retexture(this.retextureFrom[var8], var7[var8]);
					}
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lhi;",
		garbageValue = "253383500"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = WallDecoration.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Tile.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1593779214"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = WallDecoration.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-17"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return FileSystem.method904(this.params, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-802547226"
	)
	@Export("getStringParam")
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "193919919"
	)
	public boolean method973() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndexes != null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "898038948"
	)
	public int[] method974() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2078204105"
	)
	public int method975(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-68700738"
	)
	public short[] method976() {
		return this.headIconSpriteIndexes;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "1198678943"
	)
	public short method977(int var1) {
		return this.headIconSpriteIndexes != null && var1 < this.headIconSpriteIndexes.length ? this.headIconSpriteIndexes[var1] : -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhw;",
		garbageValue = "93"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
