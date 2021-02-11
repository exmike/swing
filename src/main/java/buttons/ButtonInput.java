package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.logic.StackFrame;
import src.main.java.panels.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonInput extends PatternButton {
    public ButtonInput() {
        super("Enter", 410, 25);
        this.setEnabled(false);
    }

    @Override
    protected void onClick(ActionEvent arg) {
        logic.logicButtonInput();
    }

}
