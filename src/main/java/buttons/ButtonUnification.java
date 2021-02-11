package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.panels.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonUnification extends PatternButton {
    public ButtonUnification() {
        super("Unification", 570, 175);
    }

    @Override
    protected void onClick(ActionEvent arg) {
       logic.logicButtonUnification();
    }
}
