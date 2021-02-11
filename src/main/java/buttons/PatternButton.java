package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.logic.StackFrame;
import src.main.java.panels.MainPanel;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class PatternButton extends JButton {
    protected MainPanel mainPanel;
    Logic logic = new Logic();

    public PatternButton(String text, int x, int y) {
        this.setSize(100, 35);
        this.addActionListener(new ButtonActionListener());
        this.setText(text);
        this.setLocation(x, y);
    }

    protected abstract void onClick(ActionEvent arg);

    protected class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            onClick(arg0);
        }
    }
}
