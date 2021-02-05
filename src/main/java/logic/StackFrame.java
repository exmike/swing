package src.main.java.logic;

import src.main.java.buttons.*;
import src.main.java.panels.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class StackFrame extends JFrame {

    private static final long serialVersionUID = 6888325842436730862L;

    public static JLabel messageLabel;
    public static JTextField inputField;
    public static ButtonInput buttonInput;
    public static ButtonPush buttonPush;
    public static ButtonPop buttonPop;
    public static ButtonPeek buttonPeek;
    public static ButtonClear buttonClear;
    public static ButtonIsEmpty buttonIsEmpty;
    public static ButtonUnification buttonUnification;
    public static ButtonHelp buttonHelp;
    public static ButtonUnknown buttonUnknown;

    public StackFrame() {
        super("Стек на массиве");
        this.add(new MainPanel());
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 200, 680, 380);
        this.setResizable(false);
        this.setLayout(null);


        messageLabel = new JLabel();
        messageLabel.setBounds(250, 15, 100, 15);
        messageLabel.setText("");
        this.add(messageLabel);

        inputField = new JTextField();
        inputField.setBounds(200, 30, 200, 25);
        inputField.setEditable(false);
        this.add(inputField);

        this.add(buttonInput = new ButtonInput());
        this.add(buttonPush = new ButtonPush());
        this.add(buttonPop = new ButtonPop());
        this.add(buttonPeek = new ButtonPeek());
        this.add(buttonClear = new ButtonClear());
        this.add(buttonIsEmpty = new ButtonIsEmpty());
        this.add(buttonUnification = new ButtonUnification());
        this.add(buttonHelp = new ButtonHelp());
        this.add(buttonUnknown = new ButtonUnknown());


        this.setVisible(true);
    }
}
