import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class92 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field937;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field939;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field932;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field929;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field933;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field928;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field926;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field940;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field936;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field930;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field931;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field934;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field927;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field938;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field925;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static final class92 field935;

	static {
		field937 = new class92();
		field939 = new class92();
		field932 = new class92();
		field929 = new class92();
		field933 = new class92();
		field928 = new class92();
		field926 = new class92();
		field940 = new class92();
		field936 = new class92();
		field930 = new class92();
		field931 = new class92();
		field934 = new class92();
		field927 = new class92();
		field938 = new class92();
		field925 = new class92();
		field935 = new class92();
	}

	class92() {
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1773939440"
	)
	static int method505(int var0, Script var1, boolean var2) {
		if (var0 == 3600) {
			if (class177.friendSystem.friendListStatus == 0) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (class177.friendSystem.friendListStatus == 1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class177.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == 3601) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class177.friendSystem.method406() && var3 >= 0 && var3 < class177.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class177.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 3602) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class177.friendSystem.method406() && var3 >= 0 && var3 < class177.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class177.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 3603) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (class177.friendSystem.method406() && var3 >= 0 && var3 < class177.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class177.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == 3604) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					WorldMapData_0.setFriendsRank(var5, var9);
					return 1;
				} else if (var0 == 3605) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class177.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == 3606) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class177.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == 3607) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class177.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == 3608) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					boolean var6 = true;
					class177.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == 3609) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = ClanMate.method2185(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class177.friendSystem.isFriended(new Username(var5, class457.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == 3611) {
					if (Canvas.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Canvas.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == 3612) {
					if (Canvas.friendsChat != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 3613) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Canvas.friendsChat != null && var3 < Canvas.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Canvas.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == 3614) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Canvas.friendsChat != null && var3 < Canvas.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Canvas.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 3615) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Canvas.friendsChat != null && var3 < Canvas.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Canvas.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 3616) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.friendsChat != null ? Canvas.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == 3617) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					PacketBufferNode.clanKickUser(var5);
					return 1;
				} else if (var0 == 3618) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.friendsChat != null ? Canvas.friendsChat.rank * -1577825767 * -1945538007 : 0;
					return 1;
				} else if (var0 == 3619) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class152.Clan_joinChat(var5);
					return 1;
				} else if (var0 == 3620) {
					Skeleton.Clan_leaveChat();
					return 1;
				} else if (var0 == 3621) {
					if (!class177.friendSystem.method406()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class177.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == 3622) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class177.friendSystem.method406() && var3 >= 0 && var3 < class177.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class177.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == 3623) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = ClanMate.method2185(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class177.friendSystem.isIgnored(new Username(var5, class457.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == 3624) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Canvas.friendsChat != null && var3 < Canvas.friendsChat.getSize() && Canvas.friendsChat.get(var3).getUsername().equals(class136.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 3625) {
					if (Canvas.friendsChat != null && Canvas.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Canvas.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == 3626) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Canvas.friendsChat != null && var3 < Canvas.friendsChat.getSize() && ((ClanMate)Canvas.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != 3627) {
					if (var0 == 3628) {
						class177.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class177.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class177.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class177.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class177.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (Canvas.friendsChat != null) {
								Canvas.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Canvas.friendsChat != null && var3 < Canvas.friendsChat.getSize() && ((ClanMate)Canvas.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1477325147"
	)
	static final void method504() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1637635386"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (Login.loadInterface(var0)) {
			Widget[] var1 = ArchiveLoader.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
