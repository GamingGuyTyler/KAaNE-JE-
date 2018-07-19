/**
 * Complicated Wires, started work on 7/10/2018 12:00 AM
 * 
 * Finished version 0.1 on 7/12/2018 3:23 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class complicatedWires {
    static JFrame f;
    public static void module() {
        System.out.println("[COMPLICATED WIRES MODULE]");
        f = new JFrame("KAaNE [COMPLICATED WIRES MODULE]");
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0011");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0012");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // Define the checkboxes
        JCheckBox redCB = new JCheckBox();
        redCB.setText("RED");
        redCB.setBounds(10,20,50,20);
        JCheckBox blueCB = new JCheckBox();
        blueCB.setText("BLUE");
        blueCB.setBounds(70,20,60,20);
        JCheckBox starCB = new JCheckBox();
        ImageIcon starIcon = new ImageIcon("imgs/keypad/2-filledstar.png");
        JLabel starLabel = new JLabel(starIcon);
        starCB.setBounds(10,50,20,20);
        starLabel.setBounds(20,35,50,50);
        JCheckBox ledCB = new JCheckBox();
        ledCB.setText("LED");
        ledCB.setBounds(70,50,50,20);
        // Define the button
        JButton button = new JButton();
        button.setText("OK");
        button.setBounds(40,80,60,20);
        // Define the output text
        JLabel outputText = new JLabel();
        outputText.setText("CUT");
        outputText.setBounds(60,110,40,20);
        outputText.setVisible(false);
        // save for reference:
        // cut bounds 60 110 40 20
        // dont cut bounds 40 110 70 20
        // Add everything into JFrame
        f.add(redCB); f.add(blueCB); f.add(starCB); f.add(starLabel); f.add(ledCB); f.add(button); f.add(outputText);
        // Define the rest of the JFrame stuff
        f.setLayout(null);
        f.setSize(170,180);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            Boolean red = redCB.isSelected();
            Boolean blue = blueCB.isSelected();
            Boolean star = starCB.isSelected();
            Boolean led = ledCB.isSelected();
            String batteries = props.getProperty("batteriesTotal");
            String sn1 = props.getProperty("sn1");
            String sn2 = props.getProperty("sn2");
            String sn3 = props.getProperty("sn3");
            String sn4 = props.getProperty("sn4");
            String sn5 = props.getProperty("sn5");
            String sn6 = props.getProperty("sn6");
            String parallel = props.getProperty("parallel");
            String lastDigit = "0";
            // Determine last digit
            if (sn6.equals("0") || sn6.equals("1") || sn6.equals("2") || sn6.equals("3") || sn6.equals("4") || sn6.equals("5") || sn6.equals("6") || sn6.equals("7") || sn6.equals("8") || sn6.equals("9")) {
                lastDigit = sn6;
            } else if (sn5.equals("0") || sn5.equals("1") || sn5.equals("2") || sn5.equals("3") || sn5.equals("4") || sn5.equals("5") || sn5.equals("6") || sn5.equals("7") || sn5.equals("8") || sn5.equals("9")) {
                lastDigit = sn5;
            } else if (sn4.equals("0") || sn4.equals("1") || sn4.equals("2") || sn4.equals("3") || sn4.equals("4") || sn4.equals("5") || sn4.equals("6") || sn4.equals("7") || sn4.equals("8") || sn4.equals("9")) {
                lastDigit = sn4;
            } else if (sn3.equals("0") || sn3.equals("1") || sn3.equals("2") || sn3.equals("3") || sn3.equals("4") || sn3.equals("5") || sn3.equals("6") || sn3.equals("7") || sn3.equals("8") || sn3.equals("9")) {
                lastDigit = sn3;
            } else if (sn2.equals("0") || sn2.equals("1") || sn2.equals("2") || sn2.equals("3") || sn2.equals("4") || sn2.equals("5") || sn2.equals("6") || sn2.equals("7") || sn2.equals("8") || sn2.equals("9")) {
                lastDigit = sn2;
            } else if (sn1.equals("0") || sn1.equals("1") || sn1.equals("2") || sn1.equals("3") || sn1.equals("4") || sn1.equals("5") || sn1.equals("6") || sn1.equals("7") || sn1.equals("8") || sn1.equals("9")) {
                lastDigit = sn1;
            }
            System.out.println("Last Digit - " + lastDigit);
            // Convert edgework into booleans to make the logic more understandable
            boolean evenDigit = false;
            int lastDigitInt = Integer.parseInt(lastDigit);
            if ((lastDigitInt % 2) == 0) {
                evenDigit = true;
            }
            boolean bats = false;
            int batInt = Integer.parseInt(batteries);
            if (batInt > 2) {
                bats = true;
            }
            boolean par = false;
            int parInt = Integer.parseInt(parallel);
            if (parInt == 1) {
                par = true;
            }
            // Debug printing
            System.out.println("Red - " + red);
            System.out.println("Blue - " + blue);
            System.out.println("Star - " + star);
            System.out.println("Led - " + led);
            System.out.println("Even last digit - " + evenDigit);
            System.out.println("More than 2 batteries - " + bats);
            System.out.println("Parallel - " + par);
            // Logic
            // I'm kinda proud of how simple this thing looks. Give me a cookie XD
            outputText.setText("CUT");
            outputText.setBounds(60,110,40,20);
            if (red == false) {
                if (blue == false) {
                    if (led == false) {
                        System.out.println("Cut;plain white.");
                        outputText.setVisible(true);
                    } else if (star == false || bats == false) {
                        System.out.println("Don't cut; Led + No star/less than 2 bats");
                        outputText.setText("DON'T CUT");
                        outputText.setBounds(40,110,70,20);
                        outputText.setVisible(true);
                    } else {
                        System.out.println("Cut;led + more than 2 bats");
                        outputText.setVisible(true);
                    }
                } else if (led == false) {
                    if (star == false) {
                        if (evenDigit == false) {
                            System.out.println("Don't cut; Only blue but last digit odd");
                            outputText.setText("DON'T CUT");
                            outputText.setBounds(40,110,70,20);
                            outputText.setVisible(true);
                        } else {
                            System.out.println("Cut;only blue but last digit even");
                            outputText.setVisible(true);
                        }
                    } else {
                        System.out.println("Don't cut;Only blue + star");
                        outputText.setText("DON'T CUT");
                        outputText.setBounds(40,110,70,20);
                        outputText.setVisible(true);
                    }
                } else if (par == false) {
                    System.out.println("Don't cut;Only blue + led but no parallel");
                    outputText.setText("DON'T CUT");
                    outputText.setBounds(40,110,70,20);
                    outputText.setVisible(true);
                } else {
                    System.out.println("Cut;Only blue + led but parallel");
                    outputText.setVisible(true);
                }
            } else if (blue == false) {
                if (star == false) {
                    if (led == false) {
                        if (evenDigit == false) {
                            System.out.println("Don't cut;Only red but last digit odd");
                            outputText.setText("DON'T CUT");
                            outputText.setBounds(40,110,70,20);
                            outputText.setVisible(true);
                        } else {
                            System.out.println("Cut;Only red but last digit even");
                            outputText.setVisible(true);
                        }
                    } else if (bats == false) {
                        System.out.println("Don't cut;Red + led but less than 2 bats");
                        outputText.setText("DON'T CUT");
                        outputText.setBounds(40,110,70,20);
                        outputText.setVisible(true);
                    } else {
                        System.out.println("Cut;Red + led but more than 2 bats");
                        outputText.setVisible(true);
                    }
                } else if (led == false) {
                    System.out.println("Cut;Red + Star");
                    outputText.setVisible(true);
                } else if (bats == false) {
                    System.out.println("Don't cut;Red + Star + Led but less than 2 bats");
                    outputText.setText("DON'T CUT");
                    outputText.setBounds(40,110,70,20);
                    outputText.setVisible(true);
                } else {
                    System.out.println("Cut;Red + Star + Led but more than 2 bats");
                    outputText.setVisible(true);
                }
            } else if (star == false) {
                if (evenDigit == false) {
                    System.out.println("Don't cut;Red + Blue but last digit odd");
                    outputText.setText("DON'T CUT");
                    outputText.setBounds(40,110,70,20);
                    outputText.setVisible(true);
                } else {
                    System.out.println("Cut;Red + Blue but last digit even");
                    outputText.setVisible(true);
                }
            } else if (led == false) {
                if (par == false) {
                    System.out.println("Don't cut;Red + Blue + Star but no parallel");
                    outputText.setText("DON'T CUT");
                    outputText.setBounds(40,110,70,20);
                    outputText.setVisible(true);
                } else {
                    System.out.println("Cut;Red + Blue + Star but parallel");
                    outputText.setVisible(true);
                }
            } else {
                System.out.println("Don't cut;Everything");
                outputText.setText("DON'T CUT");
                outputText.setBounds(40,110,70,20);
                outputText.setVisible(true);
            }
        });
    }
}
