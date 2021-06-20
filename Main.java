package keypass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
		static int count = 0;
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Add an entry");
		b.setBounds(50, 100, 95, 30);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hi");
				JFrame g = new JFrame("Password generator");
				JButton btn = new JButton("OK");
				JButton btn2 = new JButton("Cancel");
				JLabel titelLabel=new JLabel("Titel:");
				JTextField titelTextField=new JTextField();
				JLabel userLabel=new JLabel("Username:");
				JLabel passwordLabel=new JLabel("Password:");
				JTextField userTextField=new JTextField();
			    JPasswordField passwordField=new JPasswordField();
			    titelTextField.setBounds(100, 80, 95, 15);
			    titelLabel.setBounds(0, 80, 95, 15);
				btn.setBounds(50, 300, 95, 30);
				btn2.setBounds(150, 300, 95, 30);
				userLabel.setBounds(0, 100, 95, 15);
				passwordLabel.setBounds(0, 120, 95, 15);
				userTextField.setBounds(100, 100, 95, 15);
				passwordField.setBounds(100, 120, 95, 15);
				
				g.add(titelLabel);
				g.add(titelTextField);
				g.add(btn);
				g.add(btn2);
				g.add(userLabel);
				g.add(passwordLabel);
				g.add(passwordField);
				g.add(userTextField);
				g.setSize(400, 400);
				g.setLayout(null);
				g.setVisible(true);
				
				btn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						ArrayList<String> array = new ArrayList<String>();
						String userText = userTextField.getText();
						String passwordText = passwordField.getText();
						JLabel userLabel=new JLabel(userText);
						JLabel passLabel=new JLabel(passwordText);
						
						userLabel.setBounds(0, 200+(count*30), 70, 70);
						passLabel.setBounds(60, 200+(count*30), 70, 70);
						f.add(userLabel);
						f.add(passLabel);
						count ++;
						f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						
						// array.add(userText);
						// array.add(passwordText);
						// System.out.println(array);
						
					}
				});
			}
		});
		
		
	}

}
