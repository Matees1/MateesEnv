package net.matees.events.handling;

import net.matees.events.input.InputEvent;
import net.matees.events.input.InputListener;

public class EventListeners {
    //Input Event
    private static InputListener inputListener = new InputListener();

    public static void initEvents() {
        //Input Event
        inputListener.addListener(new InputEvent());
    }

    public static InputListener getInputListener() {
        return EventListeners.inputListener;
    }
}
