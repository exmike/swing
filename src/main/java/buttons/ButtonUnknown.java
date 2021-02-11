package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.panels.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonUnknown extends PatternButton {
    public ButtonUnknown() {
        super("...", 570, 285);
    }

    @Override
    protected void onClick(ActionEvent arg) {
        logic.logicButtonUnknown();
    }

}
