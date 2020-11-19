import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {
	
	private static final int HEIGHT = 400;
	private static final int WIDTH = 400;
	
	public static void main(String[] args) {
		//so far, all our program were sequential
		//they reached the END - finito, "long silence - just kidding"
		
		JFrame frame = new JFrame("Dark wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b3 = new JButton("at code monkey");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		
		frame.pack();
		
		frame.setVisible(true);
	}
	
}
