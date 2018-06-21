/**
 * KAaNE Java Edition
 * 
 * Started the project on June 16, 2018 at around 5:35 AM.
 * 
 * Current Version: 0.1
 * 
 * 
 * KTaNE by Steel Crate Games
 *
 * Keypad code and Needy Knobs idea by Jonathan-Walsh
 *
 * Mods belong to their rightful owners.
 *
 * KAaNE logo generated from patorjk.com
 *
 * Rest by me (Gaming Guy Tyler)
 *
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class kaane {
	static JFrame f;
	public static void main(String[] args) {
		// Define JFrame stuff
		f=new JFrame("KAaNE");
		// Define the Welcome Text
		final JLabel welcome = new JLabel();
		welcome.setHorizontalAlignment(JLabel.CENTER);
		welcome.setSize(320,50);
		welcome.setText("<html>Welcome to KAaNE [Java Ed.]! Select a Module below!<br/>MAKE SURE TO SET THE EDGEWORK SETTINGS BEFORE ANYTHING ELSE!</html>");
		// Define the Button
		JButton b=new JButton("OK");
		b.setBounds(200,70,75,20);
		// Define the Combo Box
		String modules[]={"Wires", "Button", "Keypad","Settings"};
		final JComboBox<String> cb=new JComboBox<>(modules);
		cb.setBounds(50,70,90,20);
		// Define more JFrame stuff
		f.add(cb); f.add(b); f.add(welcome);
		f.setLayout(null);
		f.setSize(350,150);
		f.setResizable(false);
		f.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
		// Wait till the user actually does stuff
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = cb.getItemAt(cb.getSelectedIndex());
				// Modules start below
				if(x == "Wires"){
					wires.module();
				} if (x == "Button") {
					button.module();
				} if(x == "Settings") {
					settings.menu();
				} if(x == "Keypad") {
					keypad.module();
				}
			}
		});
	}
}