import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

/**
 * Wires Module, started work on 1:32 AM 6/17/2018 on this module.
 * 
 * Completely reworked the module on 5:55 AM to use JFrame instead of basic Swing windows.
 *
 * Finished Version 0.1 at 10:47 PM 6/17/2018
 * 
 * Finished Version 0.2 at 9:59 AM 6/18/2018
 *
 * Version 0.1
 *
 */

public class wires {
	static JFrame f;
        @SuppressWarnings("empty-statement")
	public static void module() {
		System.out.println("[WIRES MODULE]");
		f = new JFrame("KAaNE [WIRES MODULE]");
		// Grab the config stuff
		File configFile = new File("config.properties");
		Properties props = new Properties();
		try {
			FileReader reader = new FileReader(configFile);
			props.load(reader);
		} catch (FileNotFoundException ex) {
			System.out.println("ERROR CODE #0005");
			System.out.println("Config file could not be found!");
			System.out.println("Ignoring...");
		} catch (IOException ex) {
			System.out.println("ERROR CODE #0006");
			System.out.println("IO Exception while trying to load file!");
			System.out.println("Ignoring...");
		}
		String dm = props.getProperty("displayModule");
		System.out.println("Display Module Setting = " + dm);
		// Define the Input Text
		final JLabel inputText = new JLabel();
		inputText.setHorizontalAlignment(JLabel.CENTER);
		inputText.setSize(320,30);
		inputText.setText("Input the amount of wires below.");
		// Define the Input Amount Button
		JButton buttonAmount=new JButton("OK");
		buttonAmount.setBounds(200,50,75,20);
		// Define the Input Amount Combo Box
		String inputAmountText[]={"3","4","5","6"};
		final JComboBox<String> inputAmount=new JComboBox<>(inputAmountText);
		inputAmount.setBounds(50,50,90,20);
		// Define the wire colors
		String wireColors[]={"Red","White","Yellow","Blue","Black"};
		// Define the Wire Combo Boxes
		final JComboBox<String> wire1cb=new JComboBox<>(wireColors);
		wire1cb.setBounds(50,100,90,20);
		final JComboBox<String> wire2cb=new JComboBox<>(wireColors);
		wire2cb.setBounds(50,125,90,20);
		final JComboBox<String> wire3cb=new JComboBox<>(wireColors);
		wire3cb.setBounds(50,150,90,20);
		final JComboBox<String> wire4cb=new JComboBox<>(wireColors);
		wire4cb.setBounds(50,175,90,20);
		final JComboBox<String> wire5cb=new JComboBox<>(wireColors);
		wire5cb.setBounds(50,200,90,20);
		final JComboBox<String> wire6cb=new JComboBox<>(wireColors);
		wire6cb.setBounds(50,225,90,20);
		// Define the wire text
		final JLabel wire1txt = new JLabel();
		wire1txt.setBounds(150,100,90,20);
		wire1txt.setText("#1");
		final JLabel wire2txt = new JLabel();
		wire2txt.setBounds(150,125,90,20);
		wire2txt.setText("#2");
		final JLabel wire3txt = new JLabel();
		wire3txt.setBounds(150,150,90,20);
		wire3txt.setText("#3");
		final JLabel wire4txt = new JLabel();
		wire4txt.setBounds(150,175,90,20);
		wire4txt.setText("#4");
		final JLabel wire5txt = new JLabel();
		wire5txt.setBounds(150,200,90,20);
		wire5txt.setText("#5");
		final JLabel wire6txt = new JLabel();
		wire6txt.setBounds(150,225,90,20);
		wire6txt.setText("#6");
		// Define the Final Button
		JButton finalButton=new JButton("OK");
		finalButton.setBounds(50,250,75,20);
		// Define the displayed module if the user selected the option to
                // Below needs work. The "Display Module" option in the settings is currently hidden due to this.
		ImageIcon dmBgIcon = new ImageIcon("imgs/EmptyComponent.png"); ImageIcon dmNoneIcon = new ImageIcon("imgs/wires/none.png"); ImageIcon dmBlack1Icon = new ImageIcon("imgs/wires/black1.png"); ImageIcon dmBlack2Icon = new ImageIcon("imgs/wires/black2.png"); ImageIcon dmBlack3Icon = new ImageIcon("imgs/wires/black3.png"); ImageIcon dmBlack4Icon = new ImageIcon("imgs/wires/black4.png"); ImageIcon dmBlack5Icon = new ImageIcon("imgs/wires/black5.png"); ImageIcon dmBlack6Icon = new ImageIcon("imgs/wires/black6.png"); ImageIcon dmBlue1Icon = new ImageIcon("imgs/wires/blue1.png"); ImageIcon dmBlue2Icon = new ImageIcon("imgs/wires/blue2.png"); ImageIcon dmBlue3Icon = new ImageIcon("imgs/wires/blue3.png"); ImageIcon dmBlue4Icon = new ImageIcon("imgs/wires/blue4.png"); ImageIcon dmBlue5Icon = new ImageIcon("imgs/wires/blue5.png"); ImageIcon dmBlue6Icon = new ImageIcon("imgs/wires/blue6.png"); ImageIcon dmRed1Icon = new ImageIcon("imgs/wires/red1.png"); ImageIcon dmRed2Icon = new ImageIcon("imgs/wires/red2.png"); ImageIcon dmRed3Icon = new ImageIcon("imgs/wires/red3.png"); ImageIcon dmRed4Icon = new ImageIcon("imgs/wires/red4.png"); ImageIcon dmRed5Icon = new ImageIcon("imgs/wires/red5.png"); ImageIcon dmRed6Icon = new ImageIcon("imgs/wires/red6.png"); ImageIcon dmWhite1Icon = new ImageIcon("imgs/wires/white1.png"); ImageIcon dmWhite2Icon = new ImageIcon("imgs/wires/white2.png"); ImageIcon dmWhite3Icon = new ImageIcon("imgs/wires/white3.png"); ImageIcon dmWhite4Icon = new ImageIcon("imgs/wires/white4.png"); ImageIcon dmWhite5Icon = new ImageIcon("imgs/wires/white5.png"); ImageIcon dmWhite6Icon = new ImageIcon("imgs/wires/white6.png"); ImageIcon dmYellow1Icon = new ImageIcon("imgs/wires/yellow1.png"); ImageIcon dmYellow2Icon = new ImageIcon("imgs/wires/yellow2.png"); ImageIcon dmYellow3Icon = new ImageIcon("imgs/wires/yellow3.png"); ImageIcon dmYellow4Icon = new ImageIcon("imgs/wires/yellow4.png"); ImageIcon dmYellow5Icon = new ImageIcon("imgs/wires/yellow5.png"); ImageIcon dmYellow6Icon = new ImageIcon("imgs/wires/yellow6.png");
		JLabel dmBg = new JLabel(); JLabel dmNone = new JLabel(); JLabel dmBlack1 = new JLabel(); JLabel dmBlack2 = new JLabel(); JLabel dmBlack3 = new JLabel(); JLabel dmBlack4 = new JLabel(); JLabel dmBlack5 = new JLabel(); JLabel dmBlack6 = new JLabel(); JLabel dmBlue1 = new JLabel(); JLabel dmBlue2 = new JLabel(); JLabel dmBlue3 = new JLabel(); JLabel dmBlue4 = new JLabel(); JLabel dmBlue5 = new JLabel(); JLabel dmBlue6 = new JLabel(); JLabel dmRed1 = new JLabel(); JLabel dmRed2 = new JLabel(); JLabel dmRed3 = new JLabel(); JLabel dmRed4 = new JLabel(); JLabel dmRed5 = new JLabel(); JLabel dmRed6 = new JLabel(); JLabel dmWhite1 = new JLabel(); JLabel dmWhite2 = new JLabel(); JLabel dmWhite3 = new JLabel(); JLabel dmWhite4 = new JLabel(); JLabel dmWhite5 = new JLabel(); JLabel dmWhite6 = new JLabel(); JLabel dmYellow1 = new JLabel(); JLabel dmYellow2 = new JLabel(); JLabel dmYellow3 = new JLabel(); JLabel dmYellow4 = new JLabel(); JLabel dmYellow5 = new JLabel(); JLabel dmYellow6 = new JLabel();
		dmBg.setIcon(dmBgIcon); dmNone.setIcon(dmNoneIcon); dmBlack1.setIcon(dmBlack1Icon); dmBlack2.setIcon(dmBlack2Icon); dmBlack3.setIcon(dmBlack3Icon); dmBlack4.setIcon(dmBlack4Icon); dmBlack5.setIcon(dmBlack5Icon); dmBlack6.setIcon(dmBlack6Icon); dmBlue1.setIcon(dmBlue1Icon); dmBlue2.setIcon(dmBlue2Icon); dmBlue3.setIcon(dmBlue3Icon); dmBlue4.setIcon(dmBlue4Icon); dmBlue5.setIcon(dmBlue5Icon); dmBlue6.setIcon(dmBlue6Icon); dmRed1.setIcon(dmRed1Icon); dmRed2.setIcon(dmRed2Icon); dmRed3.setIcon(dmRed3Icon); dmRed4.setIcon(dmRed4Icon); dmRed5.setIcon(dmRed5Icon); dmRed6.setIcon(dmRed6Icon); dmWhite1.setIcon(dmWhite1Icon); dmWhite2.setIcon(dmWhite2Icon); dmWhite3.setIcon(dmWhite3Icon); dmWhite4.setIcon(dmWhite4Icon); dmWhite5.setIcon(dmWhite5Icon); dmWhite6.setIcon(dmWhite6Icon); dmYellow1.setIcon(dmYellow1Icon); dmYellow2.setIcon(dmYellow2Icon); dmYellow3.setIcon(dmYellow3Icon); dmYellow4.setIcon(dmYellow4Icon); dmYellow5.setIcon(dmYellow5Icon); dmYellow6.setIcon(dmYellow6Icon);
		dmBg.setBounds(350,0,200,200);
		dmNone.setBounds(350,0,200,200);
		dmBlack1.setBounds(350,0,200,200);
		dmBlack2.setBounds(350,0,200,200);
		dmBlack3.setBounds(350,0,200,200);
		dmBlack4.setBounds(350,0,200,200);
		dmBlack5.setBounds(350,0,200,200);
		dmBlack6.setBounds(350,0,200,200);
		dmBlue1.setBounds(350,0,200,200);
		dmBlue2.setBounds(350,0,200,200);
		dmBlue3.setBounds(350,0,200,200);
		dmBlue4.setBounds(350,0,200,200);
		dmBlue5.setBounds(350,0,200,200);
		dmBlue6.setBounds(350,0,200,200);
		dmRed1.setBounds(350,0,200,200);
		dmRed2.setBounds(350,0,200,200);
		dmRed3.setBounds(350,0,200,200);
		dmRed4.setBounds(350,0,200,200);
		dmRed5.setBounds(350,0,200,200);
		dmRed6.setBounds(350,0,200,200);
		dmWhite1.setBounds(350,0,200,200);
		dmWhite2.setBounds(350,0,200,200);
		dmWhite3.setBounds(350,0,200,200);
		dmWhite4.setBounds(350,0,200,200);
		dmWhite5.setBounds(350,0,200,200);
		dmWhite6.setBounds(350,0,200,200);
		dmYellow1.setBounds(350,0,200,200);
		dmYellow2.setBounds(350,0,200,200);
		dmYellow3.setBounds(350,0,200,200);
		dmYellow4.setBounds(350,0,200,200);
		dmYellow5.setBounds(350,0,200,200);
		dmYellow6.setBounds(350,0,200,200);
		if (dm.equals("1")) {
			
		} else {
			dmBg.setVisible(false); dmNone.setVisible(false); dmBlack1.setVisible(false); dmBlack2.setVisible(false); dmBlack3.setVisible(false); dmBlack4.setVisible(false); dmBlack5.setVisible(false); dmBlack6.setVisible(false); dmBlue1.setVisible(false); dmBlue2.setVisible(false); dmBlue3.setVisible(false); dmBlue4.setVisible(false); dmBlue5.setVisible(false); dmBlue6.setVisible(false); dmRed1.setVisible(false); dmRed2.setVisible(false); dmRed3.setVisible(false); dmRed4.setVisible(false); dmRed5.setVisible(false); dmRed6.setVisible(false); dmWhite1.setVisible(false); dmWhite2.setVisible(false); dmWhite3.setVisible(false); dmWhite4.setVisible(false); dmWhite5.setVisible(false); dmWhite6.setVisible(false); dmYellow1.setVisible(false); dmYellow2.setVisible(false); dmYellow3.setVisible(false); dmYellow4.setVisible(false); dmYellow5.setVisible(false); dmYellow6.setVisible(false); 
		}
		// Set the Wire CBs, SN CB, text and the final button to non-visible, since we'll make them visible when the user selects the appropriate amount.
		wire1cb.setVisible(false); wire2cb.setVisible(false); wire3cb.setVisible(false); wire4cb.setVisible(false); wire5cb.setVisible(false); wire6cb.setVisible(false); finalButton.setVisible(false); wire1txt.setVisible(false); wire2txt.setVisible(false); wire3txt.setVisible(false); wire4txt.setVisible(false); wire5txt.setVisible(false); wire6txt.setVisible(false);
		// Define more JFrame stuff
		f.add(inputText); f.add(buttonAmount); f.add(inputAmount); f.add(wire1cb); f.add(wire2cb); f.add(wire3cb); f.add(wire4cb); f.add(wire5cb); f.add(wire6cb); f.add(wire1txt); f.add(wire2txt); f.add(wire3txt); f.add(wire4txt); f.add(wire5txt); f.add(wire6txt); f.add(finalButton); f.add(dmBg); f.add(dmNone); f.add(dmBlack1); f.add(dmBlack2); f.add(dmBlack3); f.add(dmBlack4); f.add(dmBlack5); f.add(dmBlack6); f.add(dmBlue1); f.add(dmBlue2); f.add(dmBlue3); f.add(dmBlue4); f.add(dmBlue5); f.add(dmBlue6); f.add(dmRed1); f.add(dmRed2); f.add(dmRed3); f.add(dmRed4); f.add(dmRed5); f.add(dmRed6); f.add(dmWhite1); f.add(dmWhite2); f.add(dmWhite3); f.add(dmWhite4); f.add(dmWhite5); f.add(dmWhite6); f.add(dmYellow1); f.add(dmYellow2); f.add(dmYellow3); f.add(dmYellow4); f.add(dmYellow5); Component add = f.add(dmYellow6);
		f.setLayout(null);
		if (dm.equals("1")) {
			f.setSize(700,350);
		} else {
			f.setSize(350,350);
		}
		f.setResizable(false);
		f.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonAmount.addActionListener((ActionEvent e) -> {
                    String x = inputAmount.getItemAt(inputAmount.getSelectedIndex());
                    System.out.println("Inputed Wires: " + x);
                    wire1txt.setText("#1"); wire2txt.setText("#2"); wire3txt.setText("#3"); wire4txt.setText("#4"); wire5txt.setText("#5"); wire6txt.setText("#6");
                    wire1cb.setVisible(true); wire2cb.setVisible(true); wire3cb.setVisible(true); wire4cb.setVisible(false); wire5cb.setVisible(false); wire6cb.setVisible(false); finalButton.setVisible(true); wire1txt.setVisible(true); wire2txt.setVisible(true); wire3txt.setVisible(true); wire4txt.setVisible(false); wire5txt.setVisible(false); wire6txt.setVisible(false);
                    if("4".equals(x)) {
                        wire4cb.setVisible(true); wire4txt.setVisible(true);
                    } if("5".equals(x)) {
                        wire4cb.setVisible(true); wire5cb.setVisible(true); wire4txt.setVisible(true); wire5txt.setVisible(true);
                    } if("6".equals(x)) {
                        wire4cb.setVisible(true); wire5cb.setVisible(true); wire6cb.setVisible(true); wire4txt.setVisible(true); wire5txt.setVisible(true); wire6txt.setVisible(true);
                    }
                });
		finalButton.addActionListener((ActionEvent e) -> {
                    wire1txt.setVisible(false); wire2txt.setVisible(false); wire3txt.setVisible(false); wire4txt.setVisible(false); wire5txt.setVisible(false); wire6txt.setVisible(false);
                    String w1 = wire1cb.getItemAt(wire1cb.getSelectedIndex()); String w2 = wire2cb.getItemAt(wire2cb.getSelectedIndex()); String w3 = wire3cb.getItemAt(wire3cb.getSelectedIndex());
                    String x = inputAmount.getItemAt(inputAmount.getSelectedIndex());
                    String sn = props.getProperty("sn6");
                    System.out.println("SN6 read as " + sn);
                    // Check which is the last digit of the SN. If there is none, then just set it as 0.
                    int snc = 0;
                    if ((sn.equals("0")) || (sn.equals("1")) || (sn.equals("2")) || (sn.equals("3")) || (sn.equals("4")) || (sn.equals("5")) || (sn.equals("6")) || (sn.equals("7")) || (sn.equals("8")) || (sn.equals("9"))) {
                        snc = Integer.parseInt(sn);
                        snc = snc % 2;
                    } else {
                        sn = props.getProperty("sn5");
                        System.out.println("SN5 read as " + sn);
                        if ((sn.equals("0")) || (sn.equals("1")) || (sn.equals("2")) || (sn.equals("3")) || (sn.equals("4")) || (sn.equals("5")) || (sn.equals("6")) || (sn.equals("7")) || (sn.equals("8")) || (sn.equals("9"))) {
                            snc = Integer.parseInt(sn);
                            snc = snc % 2;
                        } else {
                            sn = props.getProperty("sn4");
                            System.out.println("SN4 read as " + sn);
                            if ((sn.equals("0")) || (sn.equals("1")) || (sn.equals("2")) || (sn.equals("3")) || (sn.equals("4")) || (sn.equals("5")) || (sn.equals("6")) || (sn.equals("7")) || (sn.equals("8")) || (sn.equals("9"))) {
                                snc = Integer.parseInt(sn);
                                snc = snc % 2;
                            } else {
                                sn = props.getProperty("sn3");
                                System.out.println("SN3 read as " + sn);
                                if ((sn.equals("0")) || (sn.equals("1")) || (sn.equals("2")) || (sn.equals("3")) || (sn.equals("4")) || (sn.equals("5")) || (sn.equals("6")) || (sn.equals("7")) || (sn.equals("8")) || (sn.equals("9"))) {
                                    snc = Integer.parseInt(sn);
                                    snc = snc % 2;
                                } else {
                                    sn = props.getProperty("sn2");
                                    System.out.println("SN2 read as " + sn);
                                    if ((sn.equals("0")) || (sn.equals("1")) || (sn.equals("2")) || (sn.equals("3")) || (sn.equals("4")) || (sn.equals("5")) || (sn.equals("6")) || (sn.equals("7")) || (sn.equals("8")) || (sn.equals("9"))) {
                                        snc = Integer.parseInt(sn);
                                        snc = snc % 2;
                                    } else {
                                        sn = props.getProperty("sn1");
                                        System.out.println("SN1 read as " + sn);
                                        if ((sn.equals("0")) || (sn.equals("1")) || (sn.equals("2")) || (sn.equals("3")) || (sn.equals("4")) || (sn.equals("5")) || (sn.equals("6")) || (sn.equals("7")) || (sn.equals("8")) || (sn.equals("9"))) {
                                            snc = Integer.parseInt(sn);
                                            snc = snc % 2;
                                        } else {
                                            ;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("1st wire - " + w1);
                    System.out.println("2nd wire - " + w2);
                    System.out.println("3rd wire - " + w3);
                    if("3".equals(x)) {
                        if(!(("Red".equals(w1)) || ("Red".equals(w2)) || ("Red".equals(w3)))) {
                            System.out.println("Step 1.1");
                            System.out.println("Cut the 2nd wire, since there's no red wires.");
                            wire2txt.setText("CUT");
                            wire2txt.setVisible(true);
                        } else if ("White".equals(w3)) {
                            System.out.println("Step 1.2");
                            System.out.println("Cut the last wire because it's white.");
                            wire3txt.setText("CUT");
                            wire3txt.setVisible(true);
                        } else if ((("Blue".equals(w1)) && ("Blue".equals(w2))) || (("Blue".equals(w1)) && ("Blue".equals(w3))) || (("Blue".equals(w2)) && ("Blue".equals(w3)))) {
                            if (("Blue".equals(w2)) && !("Blue".equals(w3))) {
                                System.out.println("Step 1.3.1");
                                System.out.println("Cut the 2nd wire since it's the last blue wire and there's more than one blue wire.");
                                wire2txt.setText("CUT");
                                wire2txt.setVisible(true);
                            }  if ("Blue".equals(w3)) {
                                System.out.println("Step 1.3.2");
                                System.out.println("Cut the last wire since it's the last blue wire and there's more than one blue wire.");
                                wire3txt.setText("CUT");
                                wire3txt.setVisible(true);
                            }
                        } else {
                            System.out.println("Step 1.4");
                            System.out.println("Cut the last wire since no other condition applies.");
                            wire3txt.setText("CUT");
                            wire3txt.setVisible(true);
                        }
                    } if("4".equals(x)) {
                        String w4 = wire4cb.getItemAt(wire4cb.getSelectedIndex());
                        System.out.println("4th wire - " + w4);
                        if ((((w1 == "Red") && ("Red".equals(w2))) || ((w1 == "Red") && (w3 == "Red")) || ((w1 == "Red") && (w4 == "Red")) || ((w2 == "Red") && (w3 == "Red")) || ((w2 == "Red") && ("Red".equals(w4))) || ((w3 == "Red") && (w4 == "Red"))) && snc == 1) {
                            if (("Red".equals(w2)) && !(("Red".equals(w3)) || (w4 == "Red"))) {
                                System.out.println("Step 2.1.1");
                                System.out.println("Cut the 2nd wire since it's the last red wire, there's more than one red wire, and the last digit of the SN is odd.");
                                wire2txt.setText("CUT");
                                wire2txt.setVisible(true);
                            } if ((w3 == "Red") && !(w4 == "Red")) {
                                System.out.println("Step 2.1.2");
                                System.out.println("Cut the 3rd wire since it's the last red wire, there's more than one red wire, and the last digit of the SN is odd.");
                                wire3txt.setText("CUT");
                                wire3txt.setVisible(true);
                            } if (w4 == "Red") {
                                System.out.println("Step 2.1.3");
                                System.out.println("Cut the last wire since it's the last red wire, there's more than one red wire, and the last digit of the SN is odd.");
                                wire4txt.setText("CUT");
                                wire4txt.setVisible(true);
                            }
                        } else if ((w4 == "Yellow") && !((w1 == "Red") || (w2 == "Red") || (w3 == "Red"))) {
                            System.out.println("Step 2.2");
                            System.out.println("Cut the 1st wire since the last wire is yellow and there are no red wires.");
                            wire1txt.setText("CUT");
                            wire1txt.setVisible(true);
                        } else if (((w1 == "Blue") && !((w2 == "Blue") || (w3 == "Blue") || (w4 == "Blue"))) || ((w2 == "Blue") && !((w1 == "Blue") || (w3 == "Blue") || (w4 == "Blue"))) || ((w3 == "Blue") && !((w1 == "Blue") || (w2 == "Blue") || (w4 == "Blue"))) || ((w4 == "Blue") && !((w1 == "Blue") || (w2 == "Blue") || (w3 == "Blue")))) {
                            System.out.println("Step 2.3");
                            System.out.println("Cut the 1st wire since there's exactly one blue wire.");
                            wire1txt.setText("CUT");
                            wire1txt.setVisible(true);
                        } else if (((w1 == "Yellow") && (w2 == "Yellow")) || ((w1 == "Yellow") && (w3 == "Yellow")) || ((w1 == "Yellow") && (w4 == "Yellow")) || ((w2 == "Yellow") && (w3 == "Yellow")) || ((w2 == "Yellow") && (w4 == "Yellow")) || ((w3 == "Yellow") && (w4 == "Yellow"))) {
                            System.out.println("Step 2.4");
                            System.out.println("Cut the last wire since there's more than one yellow wire.");
                            wire4txt.setText("CUT");
                            wire4txt.setVisible(true);
                        } else {
                            System.out.println("Step 2.5");
                            System.out.println("Cut the 2nd wire since no other condition applies.");
                            wire2txt.setText("CUT");
                            wire2txt.setVisible(true);
                        }
                    } if(x == "5") {
                        String w4 = wire4cb.getItemAt(wire4cb.getSelectedIndex()); String w5 = wire5cb.getItemAt(wire5cb.getSelectedIndex());
                        System.out.println("4th wire - " + w4);
                        System.out.println("5th wire - " + w5);
                        if ((w5 == "Black") && (snc == 1)) {
                            System.out.println("Step 3.1");
                            System.out.println("Cut the 4th wire since the last wire is black and the last digit of the SN is odd.");
                            wire4txt.setText("CUT");
                            wire4txt.setVisible(true);
                        } else if ((((w1 == "Red") && !((w2 == "Red") || (w3 == "Red") || (w4 == "Red") || (w5 == "Red"))) || ((w2 == "Red") && !((w1 == "Red") || (w3 == "Red") || (w4 == "Red") || (w5 == "Red"))) || ((w3 == "Red") && !((w1 == "Red") || (w2 == "Red") || (w4 == "Red") || (w5 == "Red"))) || ((w4 == "Red") && !((w1 == "Red") || (w2 == "Red") || (w3 == "Red") || (w5 == "Red"))) || ((w5 == "Red") && !((w1 == "Red") || (w2 == "Red") || (w3 == "Red") || (w4 == "Red")))) && (((w1 == "Yellow") && (w2 == "Yellow")) || ((w1 == "Yellow") && (w3 == "Yellow")) || ((w1 == "Yellow") && (w4 == "Yellow")) || ((w1 == "Yellow") && (w5 == "Yellow")) || ((w2 == "Yellow") && (w3 == "Yellow")) || ((w2 == "Yellow") && (w4 == "Yellow")) || ((w2 == "Yellow") && (w5 == "Yellow")) || ((w3 == "Yellow") && (w4 == "Yellow")) || ((w3 == "Yellow") && (w5 == "Yellow")) || ((w4 == "Yellow") && (w5 == "Yellow")))) {
                            System.out.println("Step 3.2");
                            System.out.println("Cut the 1st wire since there's exactly one red wire and there's more than one yellow wire.");
                            wire1txt.setText("CUT");
                            wire1txt.setVisible(true);
                        } else if (!((w1 == "Black") || (w2 == "Black") || (w3 == "Black") || (w4 == "Black") || (w5 == "Black"))) {
                            System.out.println("Step 3.3");
                            System.out.println("Cut the 2nd wire since there's no black wires.");
                            wire2txt.setText("CUT");
                            wire2txt.setVisible(true);
                        } else {
                            System.out.println("Step 3.4");
                            System.out.println("Cut the 1st wire since no other condition applies.");
                            wire1txt.setText("CUT");
                            wire1txt.setVisible(true);
                        }
                    } if(x == "6") {
                        String w4 = wire4cb.getItemAt(wire4cb.getSelectedIndex()); String w5 = wire5cb.getItemAt(wire5cb.getSelectedIndex()); String w6 = wire6cb.getItemAt(wire6cb.getSelectedIndex());
                        System.out.println("4th wire - " + w4);
                        System.out.println("5th wire - " + w5);
                        System.out.println("6th wire - " + w6);
                        if ((!((w1 == "Yellow") || (w2 == "Yellow") || (w3 == "Yellow") || (w4 == "Yellow") || (w5 == "Yellow") || (w6 == "Yellow"))) && (snc == 1)) {
                            System.out.println("Step 4.1");
                            System.out.println("Cut the 3rd wire since there's no yellow wires and the last digit of the SN is odd.");
                            wire3txt.setText("CUT");
                            wire3txt.setVisible(true);
                        } else if ((((w1 == "Yellow") && !((w2 == "Yellow") || (w3 == "Yellow") || (w4 == "Yellow") || (w5 == "Yellow") || (w6 == "Yellow"))) || ((w2 == "Yellow") && !((w1 == "Yellow") || (w3 == "Yellow") || (w4 == "Yellow") || (w5 == "Yellow") || (w6 == "Yellow"))) || ((w3 == "Yellow") && !((w1 == "Yellow") || (w2 == "Yellow") || (w4 == "Yellow") || (w5 == "Yellow") || (w6 == "Yellow"))) || ((w4 == "Yellow") && !((w1 == "Yellow") || (w2 == "Yellow") || (w3 == "Yellow") || (w5 == "Yellow") || (w6 == "Yellow"))) || ((w5 == "Yellow") && !((w1 == "Yellow") || (w2 == "Yellow") || (w3 == "Yellow") || (w4 == "Yellow") || (w6 == "Yellow"))) || ((w6 == "Yellow") && !((w1 == "Yellow") || (w2 == "Yellow") || (w3 == "Yellow") || (w4 == "Yellow") || (w5 == "Yellow")))) && (((w1 == "White") && (w2 == "White")) || ((w1 == "White") && (w3 == "White")) || ((w1 == "White") && (w4 == "White")) || ((w1 == "White") && (w5 == "White")) || ((w1 == "White") && (w6 == "White")) || ((w2 == "White") && (w3 == "White")) || ((w2 == "White") && (w4 == "White")) || ((w2 == "White") && (w5 == "White")) || ((w2 == "White") && (w6 == "White")) || ((w3 == "White") && (w4 == "White")) || ((w3 == "White") && (w5 == "White")) || ((w3 == "White") && (w6 == "White")) || ((w4 == "White") && (w5 == "White")) || ((w4 == "White") && (w6 == "White")) || ((w5 == "White") && (w6 == "White")))) {
                            System.out.println("Step 4.2");
                            System.out.println("Cut the 4th wire since there's exactly one yellow wire and there's more than one white wire.");
                            wire4txt.setText("CUT");
                            wire4txt.setVisible(true);
                        } else if (!(("Red".equals(w1)) || ("Red".equals(w2)) || ("Red".equals(w3)) || ("Red".equals(w4)) || ("Red".equals(w5)) || ("Red".equals(w6)))) {
                            System.out.println("Step 4.3");
                            System.out.println("Cut the last wire since there's no red wires.");
                            wire6txt.setText("CUT");
                            wire6txt.setVisible(true);
                        } else {
                            System.out.println("Step 4.4");
                            System.out.println("Cut the 4th wire since no other condition applies.");
                            wire4txt.setText("CUT");
                            wire4txt.setVisible(true);
                        }
                    }
                });
	}
}
