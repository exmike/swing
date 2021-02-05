package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.logic.PatternButton;
import src.main.java.panels.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPop extends PatternButton {
    private static final long serialVersionUID = 4380563615050851674L;

    public ButtonPop() {
        init();
    }

    @Override
    public void init() {
        this.setText("Pop");
        this.setLocation(10, 175);
        this.addActionListener(new ButtonActionListener());
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Logic.size == 0) {
                MainPanel.textArea.setText("Удаление невозможно, стек пуст \nВы можете продолжить работу");
            } else {
                MainPanel.textArea.setText("Число " + Logic.array[Logic.size - 1] + " удалено из стека \nВы можете продолжить работу");
                Logic.array[Logic.size - 1] = 0;
                try {
                    StackPanel.getLabel(Logic.size - 1).setText("");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                Logic.size--;
            }
        }
    }
}
