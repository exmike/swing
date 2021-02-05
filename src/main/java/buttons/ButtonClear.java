package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.logic.PatternButton;
import src.main.java.panels.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ButtonClear extends PatternButton {
    private static final long serialVersionUID = 5309565656335985776L;

    public ButtonClear() {
        init();
    }

    @Override
    public void init() {
        this.setText("Clear");
        this.setLocation(10, 285);
        this.addActionListener(new ButtonActionListener());
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Logic.size != 0) {
                Arrays.fill(Logic.array, 0);
                for (int i = 0; i < StackPanel.LABEL_N; i++) {
                    try {
                        StackPanel.getLabel(i).setText("");
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
                Logic.size = 0;
            }
            MainPanel.textArea.setText("Стек очищен! \nВы можете продолжить работу");
        }
    }
}
