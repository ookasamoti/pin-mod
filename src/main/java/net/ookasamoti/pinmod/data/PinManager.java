package net.ookasamoti.pinmod.data;

import net.ookasamoti.pinmod.Pin;

import java.util.LinkedList;
import java.util.Queue;

public class PinManager {
    private static final Queue<Pin> pins = new LinkedList<>();
    private static Pin lastTemporaryPin = null;

    public static void addPin(Pin pin) {
        pins.removeIf(existingPin -> existingPin.getX() == pin.getX() && existingPin.getY() == pin.getY() && existingPin.getZ() == pin.getZ());
        pins.add(pin);
        if (pin.isTemporary()) {
            lastTemporaryPin = pin;
        }
    }

    public static Queue<Pin> getPins() {
        return new LinkedList<>(pins);
    }

    public static void removePin(Pin pin) {
        pins.remove(pin);
    }

    public static void removeLastTemporaryPin() {
        if (lastTemporaryPin != null) {
            removePin(lastTemporaryPin);
            lastTemporaryPin = null;
        }
    }
}
