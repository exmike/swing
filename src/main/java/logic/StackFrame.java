package src.main.java.logic;

import lombok.Getter;
import src.main.java.buttons.*;
import src.main.java.interfaces.IFrame;
import src.main.java.panels.*;
import src.main.java.text.MessageLabel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;


public class StackFrame extends JFrame implements IFrame {
    private final ArrayList<JComponent> components = new ArrayList<JComponent>();
    @Getter
    MessageLabel messageLabel;
    public StackFrame() {
        super("Стек на массиве");
        init();
        addNewObjectsToStackFrame();
    }

    private void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 200, 680, 380);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
    }

    private void addNewObjectsToStackFrame() {
        addEachComponents(components);
        this.add(new MainPanel());
        this.add(messageLabel = new MessageLabel());

        this.addNewComponent(
                new ButtonInput(),
                new ButtonPush(),
                new ButtonPop(),
                new ButtonPeek(),
                new ButtonClear(),
                new ButtonIsEmpty(),
                new ButtonUnification(),
                new ButtonHelp(),
                new ButtonUnknown()
        );
    }

    private void addEachComponents(ArrayList<JComponent> components) {
        for (JComponent jComponent : components) {
            this.add(jComponent);
        }
    }

    public void addNewComponent(JComponent ... jComponent) {
        Collections.addAll(components, jComponent);
    }
}