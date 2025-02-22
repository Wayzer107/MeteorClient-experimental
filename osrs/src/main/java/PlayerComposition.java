import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("aa")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class424 field2889;
	@ObfuscatedName("ao")
	static int field2888;
	@ObfuscatedName("aw")
	int[] field2894;
	@ObfuscatedName("ay")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ar")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("am")
	public int field2899;
	@ObfuscatedName("as")
	public int field2900;
	@ObfuscatedName("aj")
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ag")
	@Export("hash")
	long hash;
	@ObfuscatedName("az")
	long field2897;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lhv;"
	)
	@Export("customisations")
	ObjTypeCustomisation[] customisations;
	@ObfuscatedName("ap")
	@Export("isFemale")
	boolean isFemale;

	static {
		equipmentIndices = new int[]{class210.field1838.field1848, class210.field1837.field1848, class210.field1836.field1848, class210.field1833.field1848, class210.field1834.field1848, class210.field1839.field1848, class210.field1835.field1848};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field2889 = new class424(16, class422.field3754);
		field2888 = 0;
	}

	public PlayerComposition() {
		this.field2899 = -1;
		this.field2900 = 0;
		this.isFemale = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lmb;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field2899 = -1;
		this.field2900 = 0;
		this.isFemale = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field2894, var1.field2894.length);
		ObjTypeCustomisation[] var4 = (ObjTypeCustomisation[])(var1.customisations != null ? (ObjTypeCustomisation[])Arrays.copyOf(var1.customisations, var1.customisations.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method1679(var3, var2, var4, false, var5, var1.field2900, var1.npcTransformId, var1.field2899);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lhv;Z[IIIII)V",
		garbageValue = "1828739510"
	)
	public void method1679(int[] var1, int[] var2, ObjTypeCustomisation[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.customisations = var3;
		this.isFemale = var4;
		this.field2899 = var8;
		this.method1680(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "439535909"
	)
	public void method1680(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method1681(var4);
		}

		if (var2 == null) {
			var2 = this.method1681(var4);
		}

		this.field2894 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.field2900 = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1012952291"
	)
	int[] method1681(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = class132.KitDefinition_get(var4);
				if (var5 != null && !var5.nonSelectable && var5.bodypartID == var3 + (var1 == 1 ? 7 : 0)) {
					var2[equipmentIndices[var3]] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2138181432"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]];
		if (var3 != 0) {
			var3 -= 256;

			KitDefinition var4;
			do {
				if (!var2) {
					--var3;
					if (var3 < 0) {
						var3 = KitDefinition.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= KitDefinition.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = class132.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || var1 + (this.field2900 == 1 ? 7 : 0) != var4.bodypartID);

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "953473118"
	)
	public void method1683(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = ClanChannel.field1410[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		} else {
			do {
				++var3;
				if (var3 >= ClanChannel.field1410[var1].length) {
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1643075322"
	)
	public void method1684(int var1) {
		if (this.field2900 != var1) {
			this.method1680((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-1001147090"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field2900);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3;
		this.hash = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) {
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) {
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) {
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += (long)this.bodyColors[var5];
		}

		this.hash <<= 1;
		this.hash += (long)this.field2900;
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && var1 != this.hash || this.isFemale) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lig;ILig;IB)Ljo;",
		garbageValue = "-42"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return Tile.getNpcDefinition(this.npcTransformId).method966(var1, var2, var3, var4, (NewShit)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) {
					var5 += (long)(var1.shield - this.equipment[5] << 40);
					var7[5] = var1.shield;
				}

				if (var1.weapon >= 0) {
					var5 += (long)(var1.weapon - this.equipment[3] << 48);
					var7[3] = var1.weapon;
				}
			}

			Model var18 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !class132.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !class125.ItemDefinition_get(var11 - 512).method1041(this.field2900)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field2897) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field2897);
					}

					if (var18 == null) {
						return null;
					}
				}

				if (var18 == null) {
					ModelData[] var19 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (var13 >= 256 && var13 < 512) {
							ModelData var14 = class132.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = class125.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method1042(this.field2900);
							if (var15 != null) {
								if (this.customisations != null) {
									ObjTypeCustomisation var16 = this.customisations[var12];
									if (var16 != null) {
										int var17;
										if (var16.recol != null && var22.recolorFrom != null && var22.recolorTo.length == var16.recol.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.recol[var17]);
											}
										}

										if (var16.retex != null && var22.retextureFrom != null && var16.retex.length == var22.retextureTo.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.retex[var17]);
											}
										}
									}
								}

								var19[var11++] = var15;
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < ClanChannel.field1410[var13].length) {
							var20.recolor(class33.field89[var13], ClanChannel.field1410[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < WorldMapSectionType.field2391[var13].length) {
							var20.recolor(ViewportMouse.field2226[var13], WorldMapSectionType.field2391[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field2897 = var5;
				}
			}

			Model var21;
			if (var1 == null && var3 == null) {
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) {
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) {
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4);
			}

			return var21;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lie;",
		garbageValue = "-734942912"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return Tile.getNpcDefinition(this.npcTransformId).method967((NewShit)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !class132.KitDefinition_get(var3 - 256).method947()) {
					var1 = true;
				}

				if (var3 >= 512 && !class125.ItemDefinition_get(var3 - 512).method1043(this.field2900)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = class132.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class125.ItemDefinition_get(var5 - 512).method1044(this.field2900);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < ClanChannel.field1410[var5].length) {
						var8.recolor(class33.field89[var5], ClanChannel.field1410[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < WorldMapSectionType.field2391[var5].length) {
						var8.recolor(ViewportMouse.field2226[var5], WorldMapSectionType.field2391[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "295497"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field2889.method2146(var1);
		if (var3 == null) {
			var3 = ++field2888 - 1;
			field2889.method2147(var1, var3);
			field2888 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "481625166"
	)
	void method1690() {
		this.method1680(this.field2894, this.equipment, this.bodyColors, this.field2900, this.npcTransformId);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-121"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!TileItem.client.method361() && !TileItem.client.method363() && !TileItem.client.method362()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class328.method1678(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) {
				if (class150.clientPreferences.getUsernameToRemember() != null) {
					Login.Login_username = class150.clientPreferences.getUsernameToRemember();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			class395.method2020();
		} else {
			class328.method1678(10);
		}
	}
}
