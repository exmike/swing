package src.main.java.logic;

import javax.swing.JButton;

public abstract class PatternButton extends JButton {
    private static final long serialVersionUID = -5513676392227854745L;

    public PatternButton() {
        thisInit();
    }

    private void thisInit() {
        this.setSize(100, 35);
    }

    public abstract void init();

}
