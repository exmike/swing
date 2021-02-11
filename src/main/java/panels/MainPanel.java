package src.main.java.panels;


import lombok.Getter;
import src.main.java.text.TextArea;

import java.awt.*;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
    @Getter
    private TextArea textArea;
    @Getter
    private StackPanel stackPanel;

    public MainPanel() {
        init();
    }

    private void init() {
        this.setBounds(120, 120, 440, 200);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.add(textArea = new TextArea());
        this.add(stackPanel = new StackPanel());
    }
}
