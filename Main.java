import javax.swing.SwingUtilities;

class Main {
	public static void main (String[] args){	
		
		SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new StackFrame();
            }
        });
    }
}





