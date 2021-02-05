package src.main.java.buttons;

import src.main.java.logic.PatternButton;
import src.main.java.panels.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHelp extends PatternButton {
    private static final long serialVersionUID = -1289421385764069641L;

    public ButtonHelp() {
        init();
    }

    @Override
    public void init() {
        this.setText("Help");
        this.setLocation(570, 230);
        this.addActionListener(new ButtonActionListener());
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            MainPanel.textArea.setText("ƒоступные команды:\nPush - добваить число в стек \nPop - удалить верхний элемент стека \nClear - очистить стек \nPeek - узнать верхний элемент стека \nIsEmpty - узнать пуст ли стек \nUnification - соеденить этот стек с его копией");
        }
    }
}
