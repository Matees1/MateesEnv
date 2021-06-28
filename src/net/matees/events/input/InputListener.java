package net.matees.events.input;

import java.util.ArrayList;
import java.util.List;

public class InputListener {

    private final List<ReceiveInput> handler = new ArrayList<>();

    public void ReceiveInput(String input) {
        for (ReceiveInput handler : handler) {
            handler.SendInput(input);
        }
    }

    public void addListener(ReceiveInput event) {
        handler.add(event);
    }
}
