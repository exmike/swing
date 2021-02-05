import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonIsEmpty extends PatternButton {
    private static final long serialVersionUID = -4748427512973119459L;

    public ButtonIsEmpty() {
        init();
    }

    @Override
    public void init() {
        this.setText("IsEmpty");
        this.setLocation(570, 120);
        this.addActionListener(new ButtonActionListener());
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Logic.size == 0) {
                MainPanel.textArea.setText("Стек пуст! \nВы можете продолжить работу");
            } else {
                MainPanel.textArea.setText("Стек не пуст! \nВы можете продолжить работу");
            }
        }
    }
}
