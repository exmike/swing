import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonUnification extends PatternButton {
    private static final long serialVersionUID = 1160708394970736328L;

    public ButtonUnification() {
        init();
    }

    @Override
    public void init() {
        this.setText("Unification");
        this.setLocation(570, 175);
        this.addActionListener(new ButtonActionListener());
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Logic.size == 0) {
                MainPanel.textArea.setText("Объединение невозможно, стек пуст \nВы можете продолжить работу");
            } else {
                int z = Logic.size, y = Logic.size - 1;
                for (int x = 0; x < z; x++) {
                    Logic.array[Logic.size] = Logic.array[y];
                    try {
                        StackPanel.getLabel(Logic.size).setText("" + Logic.array[Logic.size]);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                    Logic.size++;
                    y--;
                }
                MainPanel.textArea.setText("Стек объединён \nВы можете продолжить работу");
            }
        }
    }
}
