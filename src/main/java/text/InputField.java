package src.main.java.text;

import javax.swing.*;

public class InputField extends JTextField {

    public InputField() {
        init();
    }

    private void init() {
        this.setBounds(200, 30, 200, 25);
        this.setEditable(false);
    }
}
