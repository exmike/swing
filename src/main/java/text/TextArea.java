package src.main.java.text;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JTextArea {
    public TextArea(){
        init();
    }

    private void init(){
        this.setText("Нажмите на нужную вам кнопку. \nЕсли нужна помощь - нажмите кнопку Help");
        this.setFont(new Font("Arial",Font.BOLD, 12));
        this.setBounds(10, 10, 310, 180);
        this.setEditable(false);
    }
}
