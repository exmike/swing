import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPush extends PatternButton {
	private static final long serialVersionUID = -7797226722176567278L;
	
	
	public ButtonPush() {
		init();
	}

	@Override
	public void init() {
		this.setText("Push");
		this.setLocation(10, 120);
		this.addActionListener(new ButtonActionListener());
		
	}
	private class ButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			StackFrame.inputField.setEditable(true);
			StackFrame.buttonInput.setEnabled(true);
			
			
			
			StackFrame.buttonClear.setEnabled(false);
			StackFrame.buttonHelp.setEnabled(false);
			StackFrame.buttonIsEmpty.setEnabled(false);
			StackFrame.buttonPeek.setEnabled(false);
			StackFrame.buttonPop.setEnabled(false);
			StackFrame.buttonPush.setEnabled(false);
			StackFrame.buttonUnification.setEnabled(false);
			StackFrame.buttonUnknown.setEnabled(false);
			
			
			
			StackFrame.messageLabel.setText("¬ведите число!");
			MainPanel.textArea.setText("ќжидание ввода числа дл€ добавлени€ в стек...");
			
		}
		
	}
	
}
