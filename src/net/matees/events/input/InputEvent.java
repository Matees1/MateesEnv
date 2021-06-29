package net.matees.events.input;

public class InputEvent implements ReceiveInput {

    @Override
    public void SendInput(String input) {
        System.out.println(input);
    }
}
