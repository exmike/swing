package src.main.java.buttons;

import src.main.java.logic.Logic;
import src.main.java.panels.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPop extends PatternButton {
    public ButtonPop() {
        super("Pop",10,175);
    }

    @Override
    protected void onClick(ActionEvent arg) {
        if (Logic.size == 0) {
            MainPanel.textArea.setText("�������� ����������, ���� ���� \n�� ������ ���������� ������");
        } else {
            MainPanel.textArea.setText("����� " + Logic.array[Logic.size - 1] + " ������� �� ����� \n�� ������ ���������� ������");
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
