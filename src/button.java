/**
 * Buttons Module, started work on 10:47 PM 6/17/2018
 *
 * Finished version 0.1 on 10:00 AM 6/18/2018
 *
 * Version 0.1
 *
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class button {
	static JFrame f;
	public static void module() {
		System.out.println("[BUTTON MODULE]");
		f = new JFrame("KAaNE [BUTTON MODULE]");
		// Grab the config stuff
		File configFile = new File("config.properties");
		Properties props = new Properties();
		try {
			FileReader reader = new FileReader(configFile);
			props.load(reader);
		} catch (FileNotFoundException ex) {
			System.out.println("ERROR CODE #0007");
			System.out.println("Config file could not be found!");
			System.out.println("Ignoring...");
		} catch (IOException ex) {
			System.out.println("ERROR CODE #0008");
			System.out.println("IO Exception while trying to load file!");
			System.out.println("Ignoring...");
		}
		// Define the Input Text
		final JLabel inputText = new JLabel();
		inputText.setHorizontalAlignment(JLabel.CENTER);
		inputText.setSize(320,30);
		inputText.setText("Input the text and color below.");
		// Define the Input Button
		JButton button=new JButton("OK");
		button.setBounds(200,50,75,20);
		// Define the Color Combo Box
		String colorText[]={"Red","Blue","White","Yellow","Other"};
		final JComboBox<String> colorCombo=new JComboBox<>(colorText);
		colorCombo.setBounds(50,50,90,20);
		// Define the Text Combo Box
		String tText[]={"ABORT","DETONATE","HOLD","Other"};
		final JComboBox<String> textCombo=new JComboBox<>(tText);
		textCombo.setBounds(50,70,90,20);
		// Define the Final text
		JLabel finalText = new JLabel();
		finalText.setHorizontalAlignment(JLabel.CENTER);
		finalText.setSize(320,320);
		finalText.setText("<html>Hold the button.<br/>Release on 4 if the strip is blue.<br/>Release on 5 if the strip is yellow.<br/>Release on 1 if it's anything else.</html>");
		finalText.setVisible(false);
		// Add everything
		f.add(inputText); f.add(button); f.add(colorCombo); f.add(textCombo); f.add(finalText);
		// Define the rest of the JFrame stuff
		f.setLayout(null);
		f.setSize(350,350);
		f.setResizable(false);
		f.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String color = colorCombo.getItemAt(colorCombo.getSelectedIndex());
				String text = textCombo.getItemAt(textCombo.getSelectedIndex());
				String batteriesTotal = props.getProperty("batteriesTotal");
				int batteriesTotalC = Integer.parseInt(batteriesTotal);
				String litCar = props.getProperty("carLit");
				String litFrk = props.getProperty("frkLit");
				System.out.println("Color - " + color);
				System.out.println("Text - " + text);
				System.out.println("Detected Batteries - " + batteriesTotalC);
				System.out.println("Detected lit CAR - " + litCar);
				System.out.println("Detected lit FRK - " + litFrk);
				if ((color == "Blue") && (text == "ABORT")) {
					System.out.println("Step 1");
					System.out.println("Blue and ABORT, so refer to RaHB.");
					finalText.setVisible(true);
				} else if ((text == "DETONATE") && (batteriesTotalC > 1)) {
					System.out.println("Step 2");
					System.out.println("More than 1B and DETONATE, so press and release.");
					finalText.setText("Press and immediately release.");
					finalText.setVisible(true);
				} else if ((color == "White") && (litCar.equals("1"))) {
					System.out.println("Step 3");
					System.out.println("White and lit CAR, so refer to RaHB.");
					finalText.setVisible(true);
				} else if ((batteriesTotalC > 2) && (litFrk.equals("1"))) {
					System.out.println("Step 4");
					System.out.println("More than 2B and lit FRK, so press and release.");
					finalText.setText("Press and immediately release.");
					finalText.setVisible(true);
				} else if (color == "Yellow") {
					System.out.println("Step 5");
					System.out.println("Yellow, so refer to RaHB.");
					finalText.setVisible(true);
				} else if ((color == "Red") && (text == "HOLD")) {
					System.out.println("Step 6");
					System.out.println("Red and HOLD, so press and release.");
					finalText.setText("Press and immediately release.");
					finalText.setVisible(true);
				} else {
					System.out.println("Step 7");
					System.out.println("No other condition applies, so refer to RaHB.");
					finalText.setVisible(true);
				}
			}
		});
	}
}
