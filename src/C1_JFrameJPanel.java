import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C1_JFrameJPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		 
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton btn = new JButton("Button");
		panel.add(btn);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}