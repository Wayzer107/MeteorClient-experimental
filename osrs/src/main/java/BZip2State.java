import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tb")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("aw")
	final int field4156;
	@ObfuscatedName("ay")
	final int field4157;
	@ObfuscatedName("ar")
	final int field4154;
	@ObfuscatedName("am")
	final int field4153;
	@ObfuscatedName("as")
	final int field4155;
	@ObfuscatedName("aj")
	final int field4152;
	@ObfuscatedName("ag")
	byte[] inputArray;
	@ObfuscatedName("az")
	int nextByte;
	@ObfuscatedName("av")
	int nextBit_unused;
	@ObfuscatedName("ap")
	byte[] outputArray;
	@ObfuscatedName("aq")
	int next_out;
	@ObfuscatedName("at")
	int outputLength;
	@ObfuscatedName("ah")
	int field4135;
	@ObfuscatedName("ax")
	byte out_char;
	@ObfuscatedName("aa")
	int su_rNToGo;
	@ObfuscatedName("au")
	int bsBuff;
	@ObfuscatedName("ae")
	int bsLive;
	@ObfuscatedName("ab")
	int blockSize100k;
	@ObfuscatedName("ad")
	int originalPointer;
	@ObfuscatedName("ao")
	int field4138;
	@ObfuscatedName("ac")
	int su_ch2;
	@ObfuscatedName("ak")
	int[] unzftab;
	@ObfuscatedName("an")
	int nblocks_used;
	@ObfuscatedName("af")
	int[] cftab;
	@ObfuscatedName("al")
	int nInUse;
	@ObfuscatedName("bd")
	boolean[] inUse;
	@ObfuscatedName("bb")
	boolean[] inUse16;
	@ObfuscatedName("bn")
	byte[] seqToUnseq;
	@ObfuscatedName("ba")
	byte[] ll8;
	@ObfuscatedName("bf")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bs")
	byte[] selector;
	@ObfuscatedName("bp")
	byte[] selectorMtf;
	@ObfuscatedName("bv")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bq")
	int[][] limit;
	@ObfuscatedName("bo")
	int[][] base;
	@ObfuscatedName("br")
	int[][] perm;
	@ObfuscatedName("bw")
	int[] minLens;
	@ObfuscatedName("be")
	int field4144;

	BZip2State() {
		this.field4156 = 4096;
		this.field4157 = 16;
		this.field4154 = 258;
		this.field4153 = 6;
		this.field4155 = 50;
		this.field4152 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}
}
