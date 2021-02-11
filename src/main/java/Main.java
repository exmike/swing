package src.main.java;

import src.main.java.logic.StackFrame;

import javax.swing.*;

class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StackFrame().add(new JPanel());
            }
        });
    }
}





