import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class C3_JLabel {

	public static void main(String[] args) {

		
		JFrame f =new JFrame("Label Ornegi");
		JLabel l1 = new JLabel();
		l1.setText("Yazi Kismi");
		l1.setBounds(100, 50, 150, 30);
		
		JButton btn = new JButton("Degistir");
		btn.setBounds(100,100,100,30);
		
		btn.addActionListener(new ActionListener() {
			int c=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("Buton "+c++ +" kez tiklandi");
	
			}
		});
		
		f.add(btn);
		f.add(l1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
