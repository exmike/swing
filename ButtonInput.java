import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonInput extends PatternButton {

    private static final long serialVersionUID = 8001026255479528219L;

    public ButtonInput() {
        init();
    }

    @Override
    public void init() {
        this.setText("Enter");
        this.setLocation(410, 25);
        this.setEnabled(false);
        this.addActionListener(new ButtonActionListener());
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            Logic.array[Logic.size] = Integer.parseInt(StackFrame.inputField.getText());
            MainPanel.textArea.setText("Число " + Logic.array[Logic.size] + " добавлено в стек \nВы можете продолжить работу");
            try {
                StackPanel.getLabel(Logic.size).setText("" + Logic.array[Logic.size]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Logic.size++;
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
    }
}
