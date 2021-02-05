import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StackPanel extends JPanel {

    private static final long serialVersionUID = 5434583611082148797L;
    public static JLabel[] labelNumArray;
    public static final int LABEL_N = 16;

    public StackPanel() {
        this.setBounds(330, 10, 100, LABEL_N * 10 + 20);
        this.setBackground(Color.WHITE);
        this.setLayout(null);

        initStackLines();
        initSetLabeles();


    }


    private void initSetLabeles() {

        labelNumArray = new JLabel[LABEL_N];
        for (int i = 0, x = LABEL_N * 10; i < LABEL_N; i++) {
            labelNumArray[i] = new JLabel();
            labelNumArray[i].setFont(new Font("Arial", 10, 10));
            labelNumArray[i].setBounds(10, x, 80, 10);
            this.add(labelNumArray[i]);
            x -= 10;
        }

    }

    private void initStackLines() {
        JPanel panelLine1 = new JPanel();
        JPanel panelLine2 = new JPanel();
        JPanel panelLine3 = new JPanel();

        panelLine1.setBounds(5, 5, 5, 170);
        panelLine2.setBounds(5, 170, 90, 5);
        panelLine3.setBounds(90, 5, 5, 170);

        panelLine1.setBackground(Color.BLACK);
        panelLine2.setBackground(Color.BLACK);
        panelLine3.setBackground(Color.BLACK);

        this.add(panelLine1);
        this.add(panelLine2);
        this.add(panelLine3);
    }

    public static JLabel getLabel(int i) throws Exception {
        if (i < 0 || i >= labelNumArray.length) {
            throw new Exception("Incorrect index");
        }
        return labelNumArray[i];
    }
}
