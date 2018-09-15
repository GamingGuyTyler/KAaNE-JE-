/**
 * Passwords module, started work on 7/16/2018 7:50 PM
 * 
 * Version 0.1 finished on 7/18/2018 10:28 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class passwords {
    static JFrame f;
    public static void module() {
        System.out.println("[PASSWORDS MODULE]");
        f = new JFrame("KAaNE [PASSWORDS MODULE]");
<<<<<<< HEAD
        ImageIcon icon = new ImageIcon("imgs/icons/passwords.png");
        f.setIconImage(icon.getImage());
=======
>>>>>>> 3dedd24bc3ad9a0d728ef4ef2433a9543d23f4e5
        // Define the column labels
        JLabel tcLabel = new JLabel("3rd Clmn");
        tcLabel.setBounds(10,10,55,20);
        JLabel fcLabel = new JLabel("5th Clmn");
        fcLabel.setBounds(70,10,50,20);
        // Define the column textboxes
        JTextField tctb1 = new JTextField();
        JTextField tctb2 = new JTextField();
        JTextField tctb3 = new JTextField();
        JTextField tctb4 = new JTextField();
        JTextField tctb5 = new JTextField();
        JTextField tctb6 = new JTextField();
        JTextField fctb1 = new JTextField();
        JTextField fctb2 = new JTextField();
        JTextField fctb3 = new JTextField();
        JTextField fctb4 = new JTextField();
        JTextField fctb5 = new JTextField();
        JTextField fctb6 = new JTextField();
        tctb1.setDocument(new JTextFieldLimit(1));
        tctb2.setDocument(new JTextFieldLimit(1));
        tctb3.setDocument(new JTextFieldLimit(1));
        tctb4.setDocument(new JTextFieldLimit(1));
        tctb5.setDocument(new JTextFieldLimit(1));
        tctb6.setDocument(new JTextFieldLimit(1));
        fctb1.setDocument(new JTextFieldLimit(1));
        fctb2.setDocument(new JTextFieldLimit(1));
        fctb3.setDocument(new JTextFieldLimit(1));
        fctb4.setDocument(new JTextFieldLimit(1));
        fctb5.setDocument(new JTextFieldLimit(1));
        fctb6.setDocument(new JTextFieldLimit(1));
        tctb1.setHorizontalAlignment(JTextField.CENTER);
        tctb2.setHorizontalAlignment(JTextField.CENTER);
        tctb3.setHorizontalAlignment(JTextField.CENTER);
        tctb4.setHorizontalAlignment(JTextField.CENTER);
        tctb5.setHorizontalAlignment(JTextField.CENTER);
        tctb6.setHorizontalAlignment(JTextField.CENTER);
        fctb1.setHorizontalAlignment(JTextField.CENTER);
        fctb2.setHorizontalAlignment(JTextField.CENTER);
        fctb3.setHorizontalAlignment(JTextField.CENTER);
        fctb4.setHorizontalAlignment(JTextField.CENTER);
        fctb5.setHorizontalAlignment(JTextField.CENTER);
        fctb6.setHorizontalAlignment(JTextField.CENTER);
        tctb1.setBounds(11,30,50,20);
        tctb2.setBounds(11,50,50,20);
        tctb3.setBounds(11,70,50,20);
        tctb4.setBounds(11,90,50,20);
        tctb5.setBounds(11,110,50,20);
        tctb6.setBounds(11,130,50,20);
        fctb1.setBounds(70,30,50,20);
        fctb2.setBounds(70,50,50,20);
        fctb3.setBounds(70,70,50,20);
        fctb4.setBounds(70,90,50,20);
        fctb5.setBounds(70,110,50,20);
        fctb6.setBounds(70,130,50,20);
        // Define the button
        JButton button = new JButton("OK");
        button.setBounds(35,160,60,20);
        // Define the output text
        JTextArea outputText = new JTextArea();
        outputText.setEditable(false);
        outputText.setLineWrap(true);
        outputText.setWrapStyleWord(true);
        outputText.setBounds(130,30,200,120);
        // Add everything to JFrame
        f.add(tcLabel); f.add(fcLabel);
        f.add(tctb1); f.add(tctb2); f.add(tctb3); f.add(tctb4); f.add(tctb5); f.add(tctb6);
        f.add(fctb1); f.add(fctb2); f.add(fctb3); f.add(fctb4); f.add(fctb5); f.add(fctb6);
        f.add(button); f.add(outputText);
        // Define the rest of the JFrame
        f.setLayout(null);
        f.setSize(350,220);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        String regx = "[]";
        button.addActionListener((ActionEvent e) -> {
            String tc1 = tctb1.getText();
            String tc2 = tctb2.getText();
            String tc3 = tctb3.getText();
            String tc4 = tctb4.getText();
            String tc5 = tctb5.getText();
            String tc6 = tctb6.getText();
            String fc1 = fctb1.getText();
            String fc2 = fctb2.getText();
            String fc3 = fctb3.getText();
            String fc4 = fctb4.getText();
            String fc5 = fctb5.getText();
            String fc6 = fctb6.getText();
            tc1 = tc1.toUpperCase();
            tc2 = tc2.toUpperCase();
            tc3 = tc3.toUpperCase();
            tc4 = tc4.toUpperCase();
            tc5 = tc5.toUpperCase();
            tc6 = tc6.toUpperCase();
            fc1 = fc1.toUpperCase();
            fc2 = fc2.toUpperCase();
            fc3 = fc3.toUpperCase();
            fc4 = fc4.toUpperCase();
            fc5 = fc5.toUpperCase();
            fc6 = fc6.toUpperCase();
            System.out.println("3-1: " + tc1);
            System.out.println("3-2: " + tc2);
            System.out.println("3-3: " + tc3);
            System.out.println("3-4: " + tc4);
            System.out.println("3-5: " + tc5);
            System.out.println("3-6: " + tc6);
            System.out.println("5-1: " + fc1);
            System.out.println("5-2: " + fc2);
            System.out.println("5-3: " + fc3);
            System.out.println("5-4: " + fc4);
            System.out.println("5-5: " + fc5);
            System.out.println("5-6: " + fc6);
            ArrayList<String> outputs = new ArrayList<String>();
            if (tc1.equals("A") || tc2.equals("A") || tc3.equals("A") || tc4.equals("A") || tc5.equals("A") || tc6.equals("A")) {
                if (fc1.equals("E") || fc2.equals("E") || fc3.equals("E") || fc4.equals("E") || fc5.equals("E") || fc6.equals("E")) {
                    System.out.println("PLACE");
                    outputs.add("PLACE");
                }
                if (fc1.equals("N") || fc2.equals("N") || fc3.equals("N") || fc4.equals("N") || fc5.equals("N") || fc6.equals("N")) {
                    System.out.println("AGAIN");
                    System.out.println("LEARN");
                    outputs.add("AGAIN");
                    outputs.add("LEARN");
                }
                if (fc1.equals("L") || fc2.equals("L") || fc3.equals("L") || fc4.equals("L") || fc5.equals("L") || fc6.equals("L")) {
                    System.out.println("SMALL");
                    outputs.add("SMALL");
                }
                if (fc1.equals("T") || fc2.equals("T") || fc3.equals("T") || fc4.equals("T") || fc5.equals("T") || fc6.equals("T")) {
                    System.out.println("PLANT");
                    outputs.add("PLANT");
                }
            }
            if (tc1.equals("E") || tc2.equals("E") || tc3.equals("E") || tc4.equals("E") || tc5.equals("E") || tc6.equals("E")) {
                if (fc1.equals("E") || fc2.equals("E") || fc3.equals("E") || fc4.equals("E") || fc5.equals("E") || fc5.equals("E")) {
                    System.out.println("THERE");
                    System.out.println("THESE");
                    System.out.println("WHERE");
                    outputs.add("THERE");
                    outputs.add("THESE");
                    outputs.add("WHERE");
                }
                if (fc1.equals("L") || fc2.equals("L") || fc3.equals("L") || fc4.equals("L") || fc5.equals("L") || fc6.equals("L")) {
                    System.out.println("SPELL");
                    outputs.add("SPELL");
                }
                if (fc1.equals("R") || fc2.equals("R") || fc3.equals("R") || fc4.equals("R") || fc5.equals("R") || fc6.equals("R")) {
                    System.out.println("THEIR");
                    outputs.add("THEIR");
                }
                if (fc1.equals("T") || fc2.equals("T") || fc3.equals("T") || fc4.equals("T") || fc5.equals("T") || fc6.equals("T")) {
                    System.out.println("GREAT");
                    outputs.add("GREAT");
                }
                if (fc1.equals("Y") || fc2.equals("Y") || fc3.equals("Y") || fc4.equals("Y") || fc5.equals("Y") || fc6.equals("Y")) {
                    System.out.println("EVERY");
                    outputs.add("EVERY");
                }
            }
            if (tc1.equals("G") || tc2.equals("G") || tc3.equals("G") || tc4.equals("G") || tc5.equals("G") || tc6.equals("G")) {
                if (fc1.equals("T") || fc2.equals("T") || fc3.equals("T") || fc4.equals("T") || fc5.equals("T") || fc6.equals("T")) {
                    System.out.println("RIGHT");
                    outputs.add("RIGHT");
                }
            }
            if (tc1.equals("H") || tc2.equals("H") || tc3.equals("H") || tc4.equals("H") || tc5.equals("H") || tc6.equals("H")) {
                if (fc1.equals("R") || fc2.equals("R") || fc3.equals("R") || fc4.equals("R") || fc5.equals("R") || fc6.equals("R")) {
                    System.out.println("OTHER");
                    outputs.add("OTHER");
                }
            }
            if (tc1.equals("I") || tc2.equals("I") || tc3.equals("I") || tc4.equals("I") || tc5.equals("I") || tc6.equals("I")) {
                if (fc1.equals("E") || fc2.equals("E") || fc3.equals("E") || fc4.equals("E") || fc5.equals("E") || fc6.equals("E")) {
                    System.out.println("WRITE");
                    outputs.add("WRITE");
                }
                if (fc1.equals("G") || fc2.equals("G") || fc3.equals("G") || fc4.equals("G") || fc5.equals("G") || fc6.equals("G")) {
                    System.out.println("THING");
                    outputs.add("THING");
                }
                if (fc1.equals("H") || fc2.equals("H") || fc3.equals("H") || fc4.equals("H") || fc5.equals("H") || fc6.equals("H")) {
                    System.out.println("WHICH");
                    outputs.add("WHICH");
                }
                if (fc1.equals("K") || fc2.equals("K") || fc3.equals("K") || fc4.equals("K") || fc5.equals("K") || fc6.equals("K")) {
                    System.out.println("THINK");
                    outputs.add("THINK");
                }
                if (fc1.equals("L") || fc2.equals("L") || fc3.equals("L") || fc4.equals("L") || fc5.equals("L") || fc6.equals("L")) {
                    System.out.println("STILL");
                    outputs.add("STILL");
                }
                if (fc1.equals("T") || fc2.equals("T") || fc3.equals("T") || fc4.equals("T") || fc5.equals("T") || fc6.equals("T")) {
                    System.out.println("POINT");
                    outputs.add("POINT");
                }
            }
            if (tc1.equals("L") || tc2.equals("L") || tc3.equals("L") || tc4.equals("L") || tc5.equals("L") || tc6.equals("L")) {
                if (fc1.equals("W") || fc2.equals("W") || fc3.equals("W") || fc4.equals("W") || fc5.equals("W") || fc6.equals("W")) {
                    System.out.println("BELOW");
                    outputs.add("BELOW");
                }
            }
            if (tc1.equals("O") || tc2.equals("O") || tc3.equals("O") || tc4.equals("O") || tc5.equals("O") || tc6.equals("O")) {
                if (fc1.equals("T") || fc2.equals("T") || fc3.equals("T") || fc4.equals("T") || fc5.equals("T") || fc6.equals("T")) {
                    System.out.println("ABOUT");
                    outputs.add("ABOUT");
                }
            }
            if (tc1.equals("R") || tc2.equals("R") || tc3.equals("R") || tc4.equals("R") || tc5.equals("R") || tc6.equals("R")) {
                if (fc1.equals("D") || fc2.equals("D") || fc3.equals("D") || fc4.equals("D") || fc5.equals("D") || fc6.equals("D")) {
                    System.out.println("WORLD");
                    outputs.add("WORLD");
                }
                if (fc1.equals("E") || fc2.equals("E") || fc3.equals("E") || fc4.equals("E") || fc5.equals("E") || fc6.equals("E")) {
                    System.out.println("LARGE");
                    System.out.println("THREE");
                    outputs.add("LARGE");
                    outputs.add("THREE");
                }
                if (fc1.equals("T") || fc2.equals("T") || fc3.equals("T") || fc4.equals("T") || fc5.equals("T") || fc6.equals("T")) {
                    System.out.println("FIRST");
                    outputs.add("FIRST");
                }
            }
            if (tc1.equals("T") || tc2.equals("T") || tc3.equals("T") || tc4.equals("T") || tc5.equals("T") || tc6.equals("T")) {
                if (fc1.equals("R") || fc2.equals("R") || fc3.equals("R") || fc4.equals("R") || fc5.equals("R") || fc6.equals("R")) {
                    System.out.println("WATER");
                    System.out.println("AFTER");
                    outputs.add("WATER");
                    outputs.add("AFTER");
                }
            }
            if (tc1.equals("U") || tc2.equals("U") || tc3.equals("U") || tc4.equals("U") || tc5.equals("U") || tc6.equals("U")) {
                if (fc1.equals("D") || fc2.equals("D") || fc3.equals("D") || fc4.equals("D") || fc5.equals("D") || fc6.equals("D")) {
                    System.out.println("COULD");
                    System.out.println("FOUND");
                    System.out.println("SOUND");
                    System.out.println("WOULD");
                    outputs.add("COULD");
                    outputs.add("FOUND");
                    outputs.add("SOUND");
                    outputs.add("WOULD");
                }
                if (fc1.equals("E") || fc2.equals("E") || fc3.equals("E") || fc4.equals("E") || fc5.equals("E") || fc6.equals("E")) {
                    System.out.println("HOUSE");
                    outputs.add("HOUSE");
                }
                if (fc1.equals("Y") || fc2.equals("Y") || fc3.equals("Y") || fc4.equals("Y") || fc5.equals("Y") || fc6.equals("Y")) {
                    System.out.println("STUDY");
                    outputs.add("STUDY");
                }
            }
            if (tc1.equals("V") || tc2.equals("V") || tc3.equals("V") || tc4.equals("V") || tc5.equals("V") || tc6.equals("V")) {
                if (fc1.equals("R") || fc2.equals("R") || fc3.equals("R") || fc4.equals("R") || fc5.equals("R") || fc6.equals("R")) {
                    System.out.println("NEVER");
                    outputs.add("NEVER");
                }
            }
            String[] outputss = outputs.toArray(new String[0]);
            String output = Arrays.toString(outputss);
            // remove [ and ] characters
            char[] ca = regx.toCharArray();
            for (char c : ca) {
                output = output.replace(""+c, "");
            }
            outputText.setText(output);
        });
        // Add in the cool selection thing
        tctb1.addActionListener((ActionEvent e) -> {
            tctb2.requestFocusInWindow();
        });
        tctb2.addActionListener((ActionEvent e) -> {
            tctb3.requestFocusInWindow();
        });
        tctb3.addActionListener((ActionEvent e) -> {
            tctb4.requestFocusInWindow();
        });
        tctb4.addActionListener((ActionEvent e) -> {
            tctb5.requestFocusInWindow();
        });
        tctb5.addActionListener((ActionEvent e) -> {
            tctb6.requestFocusInWindow();
        });
        tctb6.addActionListener((ActionEvent e) -> {
            fctb1.requestFocusInWindow();
        });
        fctb1.addActionListener((ActionEvent e) -> {
            fctb2.requestFocusInWindow();
        });
        fctb2.addActionListener((ActionEvent e) -> {
            fctb3.requestFocusInWindow();
        });
        fctb3.addActionListener((ActionEvent e) -> {
            fctb4.requestFocusInWindow();
        });
        fctb4.addActionListener((ActionEvent e) -> {
            fctb5.requestFocusInWindow();
        });
        fctb5.addActionListener((ActionEvent e) -> {
            fctb6.requestFocusInWindow();
        });
        fctb6.addActionListener((ActionEvent e) -> {
            tctb1.requestFocusInWindow();
        });
    }
}
