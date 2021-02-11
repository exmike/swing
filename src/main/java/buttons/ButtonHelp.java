package src.main.java.buttons;

import java.awt.event.ActionEvent;

public class ButtonHelp extends PatternButton {
    public ButtonHelp() {
        super("Help", 570, 230);
    }

    @Override
    protected void onClick(ActionEvent arg) {
        logic.logicButtonHelp();
    }
}
