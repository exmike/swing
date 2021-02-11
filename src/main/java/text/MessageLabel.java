package src.main.java.text;

import javax.swing.*;

public class MessageLabel extends JLabel {
     public MessageLabel() {
        init();
    }

    private void init() {
        this.setBounds(250, 15, 100, 15);
        this.setText("");
    }
}
