package src.main.java.buttons;

import src.main.java.logic.PatternButton;
import src.main.java.panels.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonUnknown extends PatternButton {
    private static final long serialVersionUID = -506884056524002824L;

    public ButtonUnknown() {
        init();
    }

    @Override
    public void init() {
        this.setText("...");
        this.setLocation(570, 285);
        this.addActionListener(new ButtonActionListener());
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            MainPanel.textArea.setText("Эта кнопка находится в разработке  \nНе обращайте на неё внимание \nВы можете продолжить работу");
        }
    }
}
