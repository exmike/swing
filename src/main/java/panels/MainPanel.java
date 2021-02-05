package src.main.java.panels;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainPanel extends JPanel {
    private static final long serialVersionUID = 2949687444255909471L;

    public static JTextArea textArea = new JTextArea(12, 39);
    public static StackPanel panelForStack = new StackPanel();

    public MainPanel() {
        init();
    }

    private void init() {

        super.setBounds(120, 120, 440, 200);
        super.setBackground(Color.GRAY);
        super.setLayout(null);
        super.add(panelForStack);

        textArea.setText("Нажмите на нужную вам кнопку. \nЕсли нужна помощ - нажмите кнопку Help");
        textArea.setFont(new Font("Arial", Font.BOLD, 12));
        textArea.setBounds(10, 10, 310, 180);
        textArea.setEditable(false);
        this.add(textArea);
    }
}
