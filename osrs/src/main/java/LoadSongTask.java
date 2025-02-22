import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class LoadSongTask extends SongTask {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field3717;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field3718;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field3716;

	@ObfuscatedSignature(
		descriptor = "(Lpp;Lnd;Lnd;Lnd;)V"
	)
	public LoadSongTask(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field3717 = var2;
		this.field3718 = var3;
		this.field3716 = var4;
		super.field3712 = "LoadSongTask";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod2107(int var1) {
		int var2 = 0;
		Iterator var3 = class306.musicSongs.iterator();

		while (true) {
			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				if (var4 != null && var4.midiPcmStream.field2795 > 1 && var4.midiPcmStream.method1596()) {
					this.method2102("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var4 != null && !var4.field2849) {
					try {
						if (var4.musicTrackArchive != null && var4.musicTrackGroupId != -1 && var4.musicTrackFileId != -1) {
							if (var4.field2858 == null) {
								var4.field2858 = MusicTrack.readTrack(var4.musicTrackArchive, var4.musicTrackGroupId, var4.musicTrackFileId);
								if (var4.field2858 == null) {
									continue;
								}
							}

							if (var4.field2848 == null) {
								var4.field2848 = new SoundCache(this.field3716, this.field3718);
							}

							if (var4.midiPcmStream.method1589(var4.field2858, this.field3717, var4.field2848)) {
								++var2;
								var4.field2849 = true;
								var4.midiPcmStream.method1590();
							}
						} else {
							++var2;
						}
					} catch (Exception var6) {
						var6.printStackTrace();
						this.method2102(var6.getMessage());
						return true;
					}
				} else {
					++var2;
				}
			}

			if (var2 == class306.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	static void method2108() {
		PacketBufferNode var0 = class503.getPacketBufferNode(ClientPacket.WINDOW_STATUS, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(Huffman.getWindowedMode());
		var0.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth);
		var0.packetBuffer.writeShort(WorldMapArchiveLoader.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
