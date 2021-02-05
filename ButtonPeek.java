import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPeek extends PatternButton {
	private static final long serialVersionUID = 467659879606756997L;

	public ButtonPeek() {
		init();
	}

	@Override
	public void init() {
		this.setText("Peek");
		this.setLocation(10, 230);
		this.addActionListener(new ButtonActionListener());
	}
	
	private class ButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(Logic.size == 0) {
				MainPanel.textArea.setText("Просмотр верхнего значения невозможен, стек пуст \nВы можете продолжить работу");
			}else {
				MainPanel.textArea.setText("Верхнее значение: " + Logic.array[Logic.size-1] + "\nВы можете продолжить работу");
			}
		}
	}
}
