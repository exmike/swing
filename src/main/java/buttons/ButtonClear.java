package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.panels.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ButtonClear extends PatternButton {
    public ButtonClear() {
        super("Clear", 10, 285);
    }
    Logic logic = new Logic();

    @Override
    protected void onClick(ActionEvent arg) {
        logic.logicButtonClear();
    }
}
