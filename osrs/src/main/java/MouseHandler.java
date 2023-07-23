import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("as")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("aj")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ag")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("az")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("av")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ap")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("aq")
	public static int MouseHandler_x;
	@ObfuscatedName("at")
	public static int MouseHandler_y;
	@ObfuscatedName("ah")
	public static long MouseHandler_millis;
	@ObfuscatedName("ax")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("aa")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("au")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ae")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ab")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ad")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ao")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ac")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("by")
	static String field145;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "0"
	)
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	@ObfuscatedName("mousePressed")
	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class113.clockNow();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("mouseReleased")
	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("mouseClicked")
	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}
}
