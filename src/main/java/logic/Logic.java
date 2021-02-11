package src.main.java.logic;


import src.main.java.panels.MainPanel;
import src.main.java.panels.StackPanel;
import src.main.java.text.TextArea;

import java.util.Arrays;

public class Logic {
    private int[] array;
    private int size;
    TextArea textArea;
    StackPanel stackPanel;

    public Logic() {
        init();
    }

    private void init() {
        array = new int[100];
        size = 0;
        MainPanel mainPanel = new MainPanel();
        this.textArea = mainPanel.getTextArea();
        this.stackPanel = mainPanel.getStackPanel();
    }

    public void logicButtonClear() {
        if (this.size != 0) {
            Arrays.fill(this.array, 0);
            for (int i = 0; i < StackPanel.LABEL_N; i++) {
                try {
                    stackPanel.getLabel(i).setText("");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            this.size = 0;
        }
        this.textArea.setText("���� ������! \n�� ������ ���������� ������");
    }

    public void logicButtonHelp() {
        textArea.setText(
                "��������� �������:" +
                        "\n" + "Push - �������� ����� � ���� " +
                        "\nPop - ������� ������� ������� ����� " +
                        "\nClear - �������� ���� " +
                        "\nPeek - ������ ������� ������� ����� " +
                        "\nIsEmpty - ������ ���� �� ���� " +
                        "\nUnification - ��������� ���� ���� � ��� ������"
        );

    }

    public void logicButtonInput() {
        this.array[this.size] = Integer.parseInt(StackFrame.inputField.getText());
        textArea.setText("����� " + this.array[this.size] + " ��������� � ���� \n�� ������ ���������� ������");
        try {
            stackPanel.getLabel(this.size).setText("" + this.array[this.size]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.size++;
        StackFrame.messageLabel.setText("");
        StackFrame.inputField.setText("");
        StackFrame.inputField.setEditable(false);
        StackFrame.buttonInput.setEnabled(false);
        StackFrame.buttonClear.setEnabled(true);
        StackFrame.buttonHelp.setEnabled(true);
        StackFrame.buttonIsEmpty.setEnabled(true);
        StackFrame.buttonPeek.setEnabled(true);
        StackFrame.buttonPop.setEnabled(true);
        StackFrame.buttonPush.setEnabled(true);
        StackFrame.buttonUnification.setEnabled(true);
        StackFrame.buttonUnknown.setEnabled(true);
    }

    public void logicButtonUnknown() {
        this.textArea.setText("��� ������ ��������� � ����������  \n�� ��������� �� �� �������� \n�� ������ ���������� ������");
    }

    public void logicButtonUnification() {
        if (this.size == 0) {
            this.textArea.setText("����������� ����������, ���� ���� \n�� ������ ���������� ������");
        } else {
            int z = this.size, y = this.size - 1;
            for (int x = 0; x < z; x++) {
                this.array[this.size] = this.array[y];
                try {
                    stackPanel.getLabel(this.size).setText("" + this.array[this.size]);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                this.size++;
                y--;
            }
            this.textArea.setText("���� �������� \n�� ������ ���������� ������");
        }
    }

    public void logicButtonPush(){
        StackFrame.inputField.setEditable(true);
        StackFrame.buttonInput.setEnabled(true);
        StackFrame.buttonClear.setEnabled(false);
        StackFrame.buttonHelp.setEnabled(false);
        StackFrame.buttonIsEmpty.setEnabled(false);
        StackFrame.buttonPeek.setEnabled(false);
        StackFrame.buttonPop.setEnabled(false);
        StackFrame.buttonPush.setEnabled(false);
        StackFrame.buttonUnification.setEnabled(false);
        StackFrame.buttonUnknown.setEnabled(false);

        StackFrame.messageLabel.setText("������� �����!");
        MainPanel.textArea.setText("�������� ����� ����� ��� ���������� � ����...");
    }
}

