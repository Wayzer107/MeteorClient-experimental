import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("ac")
	public static String field1871;
	@ObfuscatedName("bv")
	@Export("xInset")
	int xInset;
	@ObfuscatedName("bq")
	@Export("yInset")
	int yInset;
	@ObfuscatedName("bo")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("br")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("bw")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0;
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2;
		this.flags = new int[this.xSize][this.ySize];
		this.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1057196754"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1208247289"
	)
	public void method1093(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 128);
				this.setFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 2);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 8);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 32);
				this.setFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 1);
				this.setFlag(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 4);
				this.setFlag(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 16);
				this.setFlag(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 64);
				this.setFlag(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 130);
				this.setFlag(var1 - 1, var2, 8);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 10);
				this.setFlag(var1, var2 + 1, 32);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 40);
				this.setFlag(var1 + 1, var2, 128);
				this.setFlag(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 160);
				this.setFlag(var1, var2 - 1, 2);
				this.setFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 65536);
					this.setFlag(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 1024);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 4096);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 16384);
					this.setFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 512);
					this.setFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 2048);
					this.setFlag(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 8192);
					this.setFlag(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 32768);
					this.setFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 66560);
					this.setFlag(var1 - 1, var2, 4096);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 5120);
					this.setFlag(var1, var2 + 1, 16384);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 20480);
					this.setFlag(var1 + 1, var2, 65536);
					this.setFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920);
					this.setFlag(var1, var2 - 1, 1024);
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1569995917"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;

		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			if (var7 >= 0 && var7 < this.xSize) {
				for (int var8 = var2; var8 < var2 + var4; ++var8) {
					if (var8 >= 0 && var8 < this.ySize) {
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "745791000"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-190738836"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "45"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-908082263"
	)
	public void method1098(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 2);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 8);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 32);
				this.setFlagOff(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 1);
				this.setFlagOff(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 4);
				this.setFlagOff(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 16);
				this.setFlagOff(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 64);
				this.setFlagOff(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 130);
				this.setFlagOff(var1 - 1, var2, 8);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 10);
				this.setFlagOff(var1, var2 + 1, 32);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 40);
				this.setFlagOff(var1 + 1, var2, 128);
				this.setFlagOff(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 160);
				this.setFlagOff(var1, var2 - 1, 2);
				this.setFlagOff(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 65536);
					this.setFlagOff(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 1024);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 4096);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 16384);
					this.setFlagOff(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 512);
					this.setFlagOff(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 2048);
					this.setFlagOff(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 8192);
					this.setFlagOff(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 32768);
					this.setFlagOff(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 66560);
					this.setFlagOff(var1 - 1, var2, 4096);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 5120);
					this.setFlagOff(var1, var2 + 1, 16384);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 20480);
					this.setFlagOff(var1 + 1, var2, 65536);
					this.setFlagOff(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 81920);
					this.setFlagOff(var1, var2 - 1, 1024);
					this.setFlagOff(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "1718462800"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.xSize) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlagOff(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-866743118"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] &= ~var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public void method1101(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] &= -262145;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-118"
	)
	public static int method1091(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1867192379"
	)
	static void method1102() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.cachedAppearanceBuffer[var0] = null;
			Players.playerMovementSpeeds[var0] = MoveSpeed.WALK;
		}

	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1603276123"
	)
	static final void method1103(boolean var0) {
		class105.method618();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class503.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
