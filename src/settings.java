/**
 * Settings
 * 
 * Used to define the bomb
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.text.*;
import be.pcl.swing.*;

public class settings {
	static JFrame f;
	public static void menu() {
		System.out.println("[SETTINGS]");
		f = new JFrame("KAaNE [SETTINGS]");
		// Make the config file
		File configFile = new File("config.properties");
		// Define the properties.
		Properties props = new Properties();
		// Set the default properties.
		props.setProperty("bob","0"); 
		props.setProperty("bobLit","0");
		props.setProperty("car","0");
		props.setProperty("carLit","0");
		props.setProperty("clr","0");
		props.setProperty("clrLit","0");
		props.setProperty("frk","0");
		props.setProperty("frkLit","0");
		props.setProperty("frq","0");
		props.setProperty("frqLit","0");
		props.setProperty("ind","0");
		props.setProperty("indLit","0");
		props.setProperty("msa","0");
		props.setProperty("msaLit","0");
		props.setProperty("nsa","0");
		props.setProperty("nsaLit","0");
		props.setProperty("sig","0");
		props.setProperty("sigLit","0");
		props.setProperty("snd","0");
		props.setProperty("sndLit","0");
		props.setProperty("trn","0");
		props.setProperty("trnLit","0");
		props.setProperty("batteriesTotal","0");
		props.setProperty("batteryHolders","0");
		props.setProperty("batteriesAA","0");
		props.setProperty("batteriesD","0");
		props.setProperty("dvid","0");
		props.setProperty("parallel","0");
		props.setProperty("ps2","0");
		props.setProperty("rj45","0");
		props.setProperty("serial","0");
		props.setProperty("stereoRCA","0");
		props.setProperty("sn1","B");
		props.setProperty("sn2","B");
		props.setProperty("sn3","B");
		props.setProperty("sn4","0");
		props.setProperty("sn5","0");
		props.setProperty("sn6","0");
		props.setProperty("displayModule","0");
		// Write everything in
		try {
			FileWriter writer = new FileWriter(configFile);
			props.store(writer, "settings");
		} catch (FileNotFoundException ex) {
			System.out.println("ERROR CODE #0001");
			System.out.println("Config file could not be found.");
			System.out.println("Ignoring...");
		} catch (IOException ex) {
			System.out.println("ERROR CODE #0002");
			System.out.println("IO Exception while trying to write in the config file.");
			System.out.println("Ignoring...");
		}
		// Define the Welcome Text
		JLabel welcomeText = new JLabel();
		welcomeText.setHorizontalAlignment(JLabel.CENTER);
		welcomeText.setSize(320,30);
		welcomeText.setText("Set the settings below.");
		// Define the Save Button
		JButton saveButton=new JButton("SAVE");
		saveButton.setBounds(75,30,75,20);
		// Define the Clear Button
		JButton clearButton=new JButton("CLEAR");
		clearButton.setBounds(175,30,75,20);
		// Define the Saved/Cleared Text
		JLabel changeText = new JLabel();
		changeText.setHorizontalAlignment(JLabel.CENTER);
		changeText.setSize(320,600);
		changeText.setVisible(false);
		// Define the Indicator Checkboxes
		String lit = "LIT";
		JCheckBox bobCheck = new JCheckBox("BOB");
		bobCheck.setBounds(20,50,50,20);
		JCheckBox litBobCheck = new JCheckBox(lit);
		litBobCheck.setBounds(71,50,50,20);
		JCheckBox carCheck = new JCheckBox("CAR");
		carCheck.setBounds(20,70,50,20);
		JCheckBox litCarCheck = new JCheckBox(lit);
		litCarCheck.setBounds(71,70,50,20);
		JCheckBox clrCheck = new JCheckBox("CLR");
		clrCheck.setBounds(20,90,50,20);
		JCheckBox litClrCheck = new JCheckBox(lit);
		litClrCheck.setBounds(71,90,50,20);
		JCheckBox frkCheck = new JCheckBox("FRK");
		frkCheck.setBounds(20,110,50,20);
		JCheckBox litFrkCheck = new JCheckBox(lit);
		litFrkCheck.setBounds(71,110,50,20);
		JCheckBox frqCheck = new JCheckBox("FRQ");
		frqCheck.setBounds(20,130,50,20);
		JCheckBox litFrqCheck = new JCheckBox(lit);
		litFrqCheck.setBounds(71,130,50,20);
		JCheckBox indCheck = new JCheckBox("IND");
		indCheck.setBounds(20,150,50,20);
		JCheckBox litIndCheck = new JCheckBox(lit);
		litIndCheck.setBounds(71,150,50,20);
		JCheckBox msaCheck = new JCheckBox("MSA");
		msaCheck.setBounds(20,170,51,20);
		JCheckBox litMsaCheck = new JCheckBox(lit);
		litMsaCheck.setBounds(71,170,50,20);
		JCheckBox nsaCheck = new JCheckBox("NSA");
		nsaCheck.setBounds(20,190,50,20);
		JCheckBox litNsaCheck = new JCheckBox(lit);
		litNsaCheck.setBounds(71,190,50,20);
		JCheckBox sigCheck = new JCheckBox("SIG");
		sigCheck.setBounds(20,210,50,20);
		JCheckBox litSigCheck = new JCheckBox(lit);
		litSigCheck.setBounds(71,210,50,20);
		JCheckBox sndCheck = new JCheckBox("SND");
		sndCheck.setBounds(20,230,50,20);
		JCheckBox litSndCheck = new JCheckBox(lit);
		litSndCheck.setBounds(71,230,50,20);
		JCheckBox trnCheck = new JCheckBox("TRN");
		trnCheck.setBounds(20,250,50,20);
		JCheckBox litTrnCheck = new JCheckBox(lit);
		litTrnCheck.setBounds(71,250,50,20);
		// Define the Battery Textboxes
		NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
		ImprovedFormattedTextField batteriesTotalTextBox = new ImprovedFormattedTextField(integerNumberInstance,0);
		batteriesTotalTextBox.setBounds(121,53,50,20);
		ImprovedFormattedTextField batteryHoldersTextBox = new ImprovedFormattedTextField(integerNumberInstance,0);
		batteryHoldersTextBox.setBounds(121,73,50,20);
		ImprovedFormattedTextField batteriesAATextBox = new ImprovedFormattedTextField(integerNumberInstance,0);
		batteriesAATextBox.setBounds(121,93,50,20);
		ImprovedFormattedTextField batteriesDTextBox = new ImprovedFormattedTextField(integerNumberInstance,0);
		batteriesDTextBox.setBounds(121,113,50,20);
		// Define the Battery text
		JLabel batteriesTotalText = new JLabel("Total Bs");
		batteriesTotalText.setBounds(176,53,60,20);
		JLabel batteryHoldersText = new JLabel("Total BHs");
		batteryHoldersText.setBounds(176,73,60,20);
		JLabel batteriesAAText = new JLabel("Total AAs");
		batteriesAAText.setBounds(176,93,60,20);
		JLabel batteriesDText = new JLabel("Total Ds");
		batteriesDText.setBounds(176,113,60,20);
		// Define the Port Checkboxes
		JCheckBox dvidCheck = new JCheckBox("DVI-D");
		dvidCheck.setBounds(117,133,60,20);
		JCheckBox parallelCheck = new JCheckBox("PARALLEL");
		parallelCheck.setBounds(117,153,90,20);
		JCheckBox ps2Check = new JCheckBox("PS/2");
		ps2Check.setBounds(117,173,60,20);
		JCheckBox rj45Check = new JCheckBox("RJ-45");
		rj45Check.setBounds(117,193,60,20);
		JCheckBox serialCheck = new JCheckBox("SERIAL");
		serialCheck.setBounds(117,213,80,20);
		JCheckBox stereoRCACheck = new JCheckBox("STEREO RCA");
		stereoRCACheck.setBounds(117,233,100,20);
		// Define the Port JLabels
		ImageIcon icon = new ImageIcon("imgs/edgework/DVI-D.png");
		JLabel dvidImg = new JLabel(icon);
		dvidImg.setBounds(177,133,58,20);
		icon = new ImageIcon("imgs/edgework/Parallel.png");
		JLabel parallelImg = new JLabel(icon);
		parallelImg.setBounds(207,153,76,20);
		icon = new ImageIcon("imgs/edgework/PS2.png");
		JLabel ps2Img = new JLabel(icon);
		ps2Img.setBounds(177,173,21,20);
		icon = new ImageIcon("imgs/edgework/RJ45.png");
		JLabel rj45Img = new JLabel(icon);
		rj45Img.setBounds(177,193,19,20);
		icon = new ImageIcon("imgs/edgework/Serial.png");
		JLabel serialImg = new JLabel(icon);
		serialImg.setBounds(197,213,39,20);
		icon = new ImageIcon("imgs/edgework/RCA.png");
		JLabel stereoRCAImg = new JLabel(icon);
		stereoRCAImg.setBounds(217,233,42,20);
		// Define the SN text box.
		JTextField snTextBox = new JTextField();
		snTextBox.setDocument(new JTextFieldLimit(6)); // Set the char limit to 6.
		snTextBox.setBounds(236,53,75,20);
		// Define the SN text.
		JLabel snText = new JLabel("SN");
		snText.setBounds(311,53,50,20);
		// Define the Display Module checkbox
		JCheckBox dmCheck = new JCheckBox("DISPLAY MODULES");
		dmCheck.setBounds(0,270,150,20);
                dmCheck.setVisible(false); // set it to visible since it's unfinished
		// Add everything in the JFrame
		f.add(welcomeText); f.add(saveButton); f.add(bobCheck); f.add(litBobCheck); f.add(carCheck); f.add(litCarCheck); f.add(clrCheck); f.add(litClrCheck); f.add(frkCheck); f.add(litFrkCheck); f.add(frqCheck); f.add(litFrqCheck); f.add(indCheck); f.add(litIndCheck); f.add(msaCheck); f.add(litMsaCheck); f.add(nsaCheck); f.add(litNsaCheck); f.add(sigCheck); f.add(litSigCheck); f.add(sndCheck); f.add(litSndCheck); f.add(trnCheck); f.add(litTrnCheck); f.add(clearButton); f.add(changeText); f.add(batteriesTotalTextBox); f.add(batteriesTotalText); f.add(batteryHoldersTextBox); f.add(batteryHoldersText); f.add(batteriesAATextBox); f.add(batteriesAAText); f.add(batteriesDTextBox); f.add(batteriesDText); f.add(dvidCheck); f.add(parallelCheck); f.add(ps2Check); f.add(rj45Check); f.add(serialCheck); f.add(stereoRCACheck); f.add(dvidImg); f.add(parallelImg); f.add(ps2Img); f.add(rj45Img); f.add(serialImg); f.add(stereoRCAImg); f.add(snTextBox); f.add(snText); f.add(dmCheck);
		// Define the rest of the JFrame stuff
		f.setLayout(null);
		f.setSize(350,350);
		f.setResizable(false);
		f.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Re-set the Indicator Properties.
				boolean isSelected = bobCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("bob","1"); 
					isSelected = litBobCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("bobLit","1");
					} else {
						props.setProperty("bobLit","0");
					}
				} else {
					props.setProperty("bob","0");
					props.setProperty("bobLit","0");
					// Unselect the LIT check box since the indicator isn't checked.
					litBobCheck.setSelected(false);
				}
				isSelected = carCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("car","1"); 
					isSelected = litCarCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("carLit","1");
					} else {
						props.setProperty("carLit","0");
					}
				} else {
					props.setProperty("car","0");
					props.setProperty("carLit","0");
					litCarCheck.setSelected(false);
				}
				isSelected = clrCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("clr","1"); 
					isSelected = litClrCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("clrLit","1");
					} else {
						props.setProperty("clrLit","0");
					}
				} else {
					props.setProperty("clr","0");
					props.setProperty("clrLit","0");
					litClrCheck.setSelected(false);
				}
				isSelected = frkCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("frk","1"); 
					isSelected = litFrkCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("frkLit","1");
					} else {
						props.setProperty("frkLit","0");
					}
				} else {
					props.setProperty("frk","0");
					props.setProperty("frkLit","0");
					litFrkCheck.setSelected(false);
				}
				isSelected = frqCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("frq","1"); 
					isSelected = litFrqCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("frqLit","1");
					} else {
						props.setProperty("frqLit","0");
					}
				} else {
					props.setProperty("frq","0");
					props.setProperty("frqLit","0");
					litFrqCheck.setSelected(false);
				}
				isSelected = indCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("ind","1"); 
					isSelected = litIndCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("indLit","1");
					} else {
						props.setProperty("indLit","0");
					}
				} else {
					props.setProperty("ind","0");
					props.setProperty("indLit","0");
					litIndCheck.setSelected(false);
				}
				isSelected = msaCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("msa","1"); 
					isSelected = litMsaCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("msaLit","1");
					} else {
						props.setProperty("msaLit","0");
					}
				} else {
					props.setProperty("msa","0");
					props.setProperty("msaLit","0");
					litMsaCheck.setSelected(false);
				}
				isSelected = nsaCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("nsa","1"); 
					isSelected = litNsaCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("nsaLit","1");
					} else {
						props.setProperty("nsaLit","0");
					}
				} else {
					props.setProperty("nsa","0");
					props.setProperty("nsaLit","0");
					litNsaCheck.setSelected(false);
				}
				isSelected = sigCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("sig","1"); 
					isSelected = litSigCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("sigLit","1");
					} else {
						props.setProperty("sigLit","0");
					}
				} else {
					props.setProperty("sig","0");
					props.setProperty("sigLit","0");
					litSigCheck.setSelected(false);
				}
				isSelected = sndCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("snd","1"); 
					isSelected = litSndCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("sndLit","1");
					} else {
						props.setProperty("sndLit","0");
					}
				} else {
					props.setProperty("snd","0");
					props.setProperty("sndLit","0");
					litSndCheck.setSelected(false);
				}
				isSelected = trnCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("trn","1"); 
					isSelected = litTrnCheck.isSelected();
					if (isSelected == true) {
						props.setProperty("trnLit","1");
					} else {
						props.setProperty("trnLit","0");
					}
				} else {
					props.setProperty("trn","0");
					props.setProperty("trnLit","0");
					litTrnCheck.setSelected(false);
				}
				// Re-set the Battery properties.
				String batteriesTotal = batteriesTotalTextBox.getText();
				String batteryHolders = batteryHoldersTextBox.getText();
				String batteriesAA = batteriesAATextBox.getText();
				String batteriesD = batteriesDTextBox.getText();
				props.setProperty("batteriesTotal",batteriesTotal);
				props.setProperty("batteryHolders",batteryHolders);
				props.setProperty("batteriesAA",batteriesAA);
				props.setProperty("batteriesD",batteriesD);
				// Re-set the Port properties.
				if (dvidCheck.isSelected()) {
					props.setProperty("dvid","1");
				} else {
					props.setProperty("dvid","0");
				}
				// Upper-Case the SN.
				String sn = snTextBox.getText();
				sn = sn.toUpperCase();
				// Split the SN into an array.
				String[] snArr = sn.split("");
				// Set different strings based on the array. Also set the properties inside the Try/Catch stuff because apparently Eclipse doesn't like it if I don't.
				String sn1 = snArr[0];
				// below code doesn't fucking work after hours of fucking around with it
				// i'm done trying to fix it
				if (sn1 == "") {
					props.setProperty("sn1","B");
				} else {
					props.setProperty("sn1",sn1);
				}
				try {
					String sn2 = snArr[1];
					props.setProperty("sn2",sn2);
				} catch (ArrayIndexOutOfBoundsException ex) {
					String sn2 = "B"; // Rest of the textbox is empty, so just set it as the default property.
					props.setProperty("sn2",sn2);
				}
				try {
					String sn3 = snArr[2];
					props.setProperty("sn3",sn3);
				} catch (ArrayIndexOutOfBoundsException ex) {
					String sn3 = "B";
					props.setProperty("sn3",sn3);
				}
				try {
					String sn4 = snArr[3];
					props.setProperty("sn4",sn4);
				} catch (ArrayIndexOutOfBoundsException ex) {
					String sn4 = "0";
					props.setProperty("sn4",sn4);
				}
				try {
					String sn5 = snArr[4];
					props.setProperty("sn5",sn5);
				} catch (ArrayIndexOutOfBoundsException ex) {
					String sn5 = "0";
					props.setProperty("sn5",sn5);
				}
				try {
					String sn6 = snArr[5];
					props.setProperty("sn6",sn6);
				} catch (ArrayIndexOutOfBoundsException ex) {
					String sn6 = "0";
					props.setProperty("sn6",sn6);
				}
				isSelected = dmCheck.isSelected();
				if (isSelected == true) {
					props.setProperty("displayModule", "1");
				} else {
					props.setProperty("displayModule","0");
				}
				// Write everything into the config file.
				try {
					FileWriter writer = new FileWriter(configFile);
					props.store(writer, "settings");
				} catch (FileNotFoundException ex) {
					System.out.println("ERROR CODE #0003");
					System.out.println("Config file could not be found.");
					System.out.println("Ignoring...");
				} catch (IOException ex) {
					System.out.println("ERROR CODE #0004");
					System.out.println("IO Exception while trying to write in the config file.");
					System.out.println("Ignoring...");
				}
				// Show the "saved" text.
				changeText.setText("SAVED!");
				changeText.setVisible(true);
			}
		});
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Unselect all the Indicator Checkboxes
				bobCheck.setSelected(false);
				litBobCheck.setSelected(false);
				carCheck.setSelected(false);
				litCarCheck.setSelected(false);
				clrCheck.setSelected(false);
				litClrCheck.setSelected(false);
				frkCheck.setSelected(false);
				litFrkCheck.setSelected(false);
				frqCheck.setSelected(false);
				litFrqCheck.setSelected(false);
				indCheck.setSelected(false);
				litIndCheck.setSelected(false);
				msaCheck.setSelected(false);
				litMsaCheck.setSelected(false);
				nsaCheck.setSelected(false);
				litNsaCheck.setSelected(false);
				sigCheck.setSelected(false);
				litSigCheck.setSelected(false);
				sndCheck.setSelected(false);
				litSndCheck.setSelected(false);
				trnCheck.setSelected(false);
				litTrnCheck.setSelected(false);
				// Set the battery text to 0.
				batteriesTotalTextBox.setText("0");
				batteryHoldersTextBox.setText("0");
				batteriesAATextBox.setText("0");
				batteriesDTextBox.setText("0");
				// Unselect all the Port Checkboxes
				dvidCheck.setSelected(false);
				parallelCheck.setSelected(false);
				ps2Check.setSelected(false);
				rj45Check.setSelected(false);
				serialCheck.setSelected(false);
				stereoRCACheck.setSelected(false);
				// Clear the SN text.
				snTextBox.setText("");
				// Unselect the Display Module checkbox
				dmCheck.setSelected(false);
				// Show the "cleared" text.
				changeText.setText("CLEARED!");
				changeText.setVisible(true);
			}
		});
	}
}
