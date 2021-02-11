package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.panels.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPeek extends PatternButton {
    public ButtonPeek() {
        super("Peek", 10, 230);
    }

    @Override
    protected void onClick(ActionEvent arg) {
        if (Logic.size == 0) {
            MainPanel.textArea.setText("Просмотр верхнего значения невозможен, стек пуст \nВы можете продолжить работу");
        } else {
            MainPanel.textArea.setText("Верхнее значение: " + Logic.array[Logic.size - 1] + "\nВы можете продолжить работу");
        }
    }
}
