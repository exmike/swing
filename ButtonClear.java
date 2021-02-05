import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            if (Logic.size == 0) {
                MainPanel.textArea.setText("Стек очищен! \nВы можете продолжить работу");
            } else {
                for (int i = 0; i < Logic.array.length; i++) {
                    Logic.array[i] = 0;
                }
                for (int i = 0; i < StackPanel.LABEL_N; i++) {
                    try {
                        StackPanel.getLabel(i).setText("");
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
                Logic.size = 0;
                MainPanel.textArea.setText("Стек очищен! \nВы можете продолжить работу");
            }
        }
    }
}
