package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.panels.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonIsEmpty extends PatternButton {
    public ButtonIsEmpty() {
        super("IsEmpty",570,120);
    }

    @Override
    protected void onClick(ActionEvent arg) {
        if (Logic.size == 0) {
            MainPanel.textArea.setText("���� ����! \n�� ������ ���������� ������");
        } else {
            MainPanel.textArea.setText("���� �� ����! \n�� ������ ���������� ������");
        }
    }
}
