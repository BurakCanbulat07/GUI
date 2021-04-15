import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class C2_JButton {

	public static void main(String[] args) {
		//btn.setBounds(x,y,width,height);
		
		JFrame f =new JFrame("Buton ornegi");
		
		JButton btn = new JButton();
		btn.setText("Gonder");
		btn.setBounds(100,100,100,30);
		
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Butona tiklandi");
				
			}
			
		});
		
		f.add(btn);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
