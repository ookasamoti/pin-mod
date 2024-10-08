package net.ookasamoti.pinmod.util;

public class PinModConstants {
    // Pin
    public static final long TEMPORARY_PIN_DURATION = 10000L;
    public static final long ENTITY_PIN_DURATION = 8000L;
    public static final double MAX_HIT_RESULT_RANGE = 512.0;

    // PinRenderer
    public static final double MAX_RENDER_DISTANCE = 16.0;
    public static final double MAX_SOUND_DISTANCE = 8.0;
    public static final double CURSOR_DISTANCE_THRESHOLD_INFO = 5.0;
    public static final double CURSOR_DISTANCE_THRESHOLD_MANAGE = 0.8;

    //KeyInputHandler
    public static final long DOUBLE_CLICK_INTERVAL = 300L;
    public static final int RADIAL_MENU_THRESHOLD = 250;

    // RadialMenuHandler
    public static final int RADIUS_OUTER = 60;
    public static final int RADIUS_INNER = 30;
    public static final int SEGMENTS = 50;

    public static final float SLICE_COLOR_R = 0.2f;
    public static final float SLICE_COLOR_G = 0.2f;
    public static final float SLICE_COLOR_B = 0.2f;
    public static final float SLICE_HOVERED_ALPHA = 0.1f;
    public static final float SLICE_DEFAULT_ALPHA = 0.02f;
}
