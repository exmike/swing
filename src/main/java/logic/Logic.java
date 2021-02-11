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
        this.textArea.setText("Стек очищен! \nВы можете продолжить работу");
    }

    public void logicButtonHelp() {
        textArea.setText(
                "Доступные команды:" +
                        "\n" + "Push - добавить число в стек " +
                        "\nPop - удалить верхний элемент стека " +
                        "\nClear - очистить стек " +
                        "\nPeek - узнать верхний элемент стека " +
                        "\nIsEmpty - узнать пуст ли стек " +
                        "\nUnification - соеденить этот стек с его копией"
        );

    }

    public void logicButtonInput() {
        this.array[this.size] = Integer.parseInt(StackFrame.inputField.getText());
        textArea.setText("Число " + this.array[this.size] + " добавлено в стек \nВы можете продолжить работу");
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
        this.textArea.setText("Эта кнопка находится в разработке  \nНе обращайте на неё внимание \nВы можете продолжить работу");
    }

    public void logicButtonUnification() {
        if (this.size == 0) {
            this.textArea.setText("Объединение невозможно, стек пуст \nВы можете продолжить работу");
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
            this.textArea.setText("Стек объединён \nВы можете продолжить работу");
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

        StackFrame.messageLabel.setText("Введите число!");
        MainPanel.textArea.setText("Ожидание ввода числа для добавления в стек...");
    }
}

