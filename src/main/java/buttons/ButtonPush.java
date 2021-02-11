package src.main.java.buttons;

import src.main.java.logic.StackFrame;
import src.main.java.panels.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPush extends PatternButton {

    public ButtonPush() {
        super("Push", 10, 120);
    }

    @Override
    protected void onClick(ActionEvent arg) {
     logic.logicButtonPush();
    }
}
