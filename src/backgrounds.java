/**
 * Backgrounds module, started work on 8/8/2018 (forgot to put in time, rip. somewhere around 2:00 PM)
 * 
 * Finished version 0.1 on 8/8/2018 6:56 PM
 * 
 * Finished version 0.2 on 8/24/2018 2:10 AM
 * 
 * Version 0.2
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class backgrounds {
    static JFrame f;
    public static void module() {
        System.out.println("[BACKGROUNDS]");
        f = new JFrame("KAaNE [BACKGROUNDS]");
        ImageIcon icon = new ImageIcon("imgs/icons/backgrounds.png");
        f.setIconImage(icon.getImage());
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0019");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0020");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // Arrays
        String[] colors = {"Red","Orange","Yellow","Green","Blue","Purple","White","Grey","Black"};
        String[] text = {"PUSH ME!","BUSH ME!","PUSH NE!","PUSH HE!","PUSH SHE!"};
        // CBs
        JComboBox bgCB = new JComboBox(colors);
        bgCB.setBounds(10,10,70,20);
        JComboBox btnCB = new JComboBox(colors);
        btnCB.setBounds(170,10,70,20);
        // Labels
        JLabel bgLabel = new JLabel("Background");
        bgLabel.setBounds(90,10,70,20);
        JLabel btnLabel = new JLabel("Button");
        btnLabel.setBounds(250,10,50,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(114,40,60,20);
        // Output
        JLabel output = new JLabel("");
        output.setBounds(142,70,20,20);
        // Line
        ImageIcon line = new ImageIcon("imgs/line.png");
        JLabel lineL = new JLabel(line);
        lineL.setBounds(0,100,350,1);
        // Faulty CBs
        JComboBox fBgCB = new JComboBox(colors);
        fBgCB.setBounds(10,110,70,20);
        JComboBox fBtnLeftCB = new JComboBox(colors);
        fBtnLeftCB.setBounds(170,110,70,20);
        JComboBox fBtnRightCB = new JComboBox(colors);
        fBtnRightCB.setBounds(170,140,70,20);
        JComboBox fBtnLeftTxtCB = new JComboBox(text);
        fBtnLeftTxtCB.setBounds(170,170,90,20);
        JComboBox fBtnRightTxtCB = new JComboBox(text);
        fBtnRightTxtCB.setBounds(170,200,90,20);
        // Faulty Labels
        JLabel fBgLabel = new JLabel("Background");
        fBgLabel.setBounds(90,110,70,20);
        JLabel fBtnLeftLabel = new JLabel("Button L");
        fBtnLeftLabel.setBounds(250,110,50,20);
        JLabel fBtnRightLabel = new JLabel("Button R");
        fBtnRightLabel.setBounds(250,140,50,20);
        JLabel fBtnLeftTxtLabel = new JLabel("Text L");
        fBtnLeftTxtLabel.setBounds(270,170,50,20);
        JLabel fBtnRightTxtLabel = new JLabel("Text R");
        fBtnRightTxtLabel.setBounds(270,200,50,20);
        JLabel fNumLabel = new JLabel("# not on counter");
        fNumLabel.setBounds(110,230,100,20);
        // Faulty Button
        JButton fButton = new JButton("OK");
        fButton.setBounds(15,140,60,20);
        // Output
        JLabel fOutput = new JLabel("");
        fOutput.setBounds(25,185,50,20);
        // Checks
        JCheckBox fLCheck = new JCheckBox("L no affect");
        fLCheck.setBounds(10,250,90,20);
        JCheckBox fRCheck = new JCheckBox("R no affect");
        fRCheck.setBounds(10,270,90,20);
        JCheckBox fEvenCheck = new JCheckBox("Even");
        fEvenCheck.setBounds(110,250,60,20);
        JCheckBox fOddCheck = new JCheckBox("Odd");
        fOddCheck.setBounds(110,270,50,20);
        JCheckBox fFiveCheck = new JCheckBox("5");
        fFiveCheck.setBounds(180,250,50,20);
        // Add everything
        f.add(bgCB); f.add(bgLabel); f.add(btnCB); f.add(btnLabel);
        f.add(button); f.add(output);
        f.add(lineL); f.add(fBgCB); f.add(fBtnLeftCB); f.add(fBtnRightCB);
        f.add(fBgLabel); f.add(fBtnLeftLabel); f.add(fBtnRightLabel);
        f.add(fBtnLeftTxtCB); f.add(fBtnRightTxtCB);
        f.add(fBtnLeftTxtLabel); f.add(fBtnRightTxtLabel);
        f.add(fButton); f.add(fOutput); f.add(fNumLabel); f.add(fFiveCheck);
        f.add(fLCheck); f.add(fRCheck); f.add(fEvenCheck); f.add(fOddCheck);
        // Define JFrame
        f.setLayout(null);
        f.setSize(320,350);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            String bg = (String) bgCB.getItemAt(bgCB.getSelectedIndex());
            String btn = (String) btnCB.getItemAt(btnCB.getSelectedIndex());
            System.out.println("(Non-Faulty)");
            System.out.println("BG color - " + bg);
            System.out.println("BTN color - " + btn);
            String ltr1 = "";
            String ltr2 = "";
            // Add booleans for proper letter checking
            boolean first = false;
            boolean second = false;
            // Grab bomb info
            int bAA = Integer.parseInt(props.getProperty("batteriesAA"));
            int bD = Integer.parseInt(props.getProperty("batteriesD"));
            int snd = Integer.parseInt(props.getProperty("snd"));
            int sndLit = Integer.parseInt(props.getProperty("sndLit"));
            int sndUnlit = 0;
            if (sndLit == 0 && snd == 1) sndUnlit = 1;
            int serial = Integer.parseInt(props.getProperty("serial"));
            // Order check int
            int check;
            // Rule checking
            // I'm positive there's a way to shorthand this, but I'm not sure how.
            // I'd be grateful if anyone can shorthand this.
            if (bg.equals(btn)) {first = true; ltr1 = "A";}
            if (bg.matches("Black|White") || btn.matches("Black|White")) {
                check = orderCheck(first,second);
                if (check == 2) {ltr2 = "B"; second = true;}
                else {ltr1 = "D"; first = true;}
            }
            if (bD == 0) {
                check = orderCheck(first,second);
                if (check == 1) {ltr1 = "C"; first = true;}
                if (check == 2) {ltr2 = "E"; second = true;}
            }
            if (bAA == 0) {
                check = orderCheck(first,second);
                if (check == 1) {ltr1 = "D"; first = true;}
                if (check == 2) {ltr2 = "D"; second = true;}
            }
            Set<String> primary = new HashSet<>();
            primary.add("Red"); primary.add("Yellow"); primary.add("Blue");
            if (primary.contains(bg) && primary.contains(btn)) {
                check = orderCheck(first,second);
                if (check == 1) {ltr1 = "B"; first = true;}
                if (check == 2) {ltr2 = "F"; second = true;}
            }
            Set<String> secondary = new HashSet<>();
            secondary.add("Orange"); secondary.add("Green"); secondary.add("Purple");
            if (secondary.contains(btn)) {
                check = orderCheck(first,second);
                if (check == 1) {ltr1 = "F"; first = true;}
                if (check == 2) {ltr2 = "E"; second = true;}
            }
            if (sndUnlit == 1) {
                check = orderCheck(first,second);
                if (check == 1) {ltr1 = "E"; first = true;}
                if (check == 2) {ltr2 = "B"; second = true;}
            }
            if (serial == 1) {
                check = orderCheck(first,second);
                if (check == 1) {ltr1 = "B"; first = true;}
                if (check == 2) {ltr2 = "C"; second = true;}
            }
            Set<String> mixBlue1 = new HashSet<>();
            Set<String> mixBlue2 = new HashSet<>();
            mixBlue1.add("Yellow"); mixBlue1.add("Red");
            mixBlue2.add("Green"); mixBlue2.add("Purple");
            if (mixBlue1.contains(bg) && mixBlue2.contains(btn)) {
                check = orderCheck(first,second);
                if (check == 1) {ltr1 = "C"; first = true;}
                if (check == 2) {ltr2 = "D"; second = true;}
            }
            check = orderCheck(first,second);
            if (check == 1) {
                ltr1 = "E"; ltr2 = "A";
            }
            if (check == 2) {
                ltr2 = "A";
            }
            System.out.println("Letter 1 - " + ltr1);
            System.out.println("Letter 2 - " + ltr2);
            // Letter checking
            System.out.println("# of presses - " + letterCheck(ltr1,ltr2));
            output.setText(Integer.toString(letterCheck(ltr1,ltr2)));
        });
        fButton.addActionListener((ActionEvent e) -> {
            String bg = (String) bgCB.getItemAt(bgCB.getSelectedIndex());
            String btnL = (String) fBtnLeftCB.getItemAt(fBtnLeftCB.getSelectedIndex());
            String btnR = (String) fBtnRightCB.getItemAt(fBtnRightCB.getSelectedIndex());
            String btnLTxt = (String) fBtnLeftTxtCB.getItemAt(fBtnLeftTxtCB.getSelectedIndex());
            String btnRTxt = (String) fBtnRightTxtCB.getItemAt(fBtnRightTxtCB.getSelectedIndex());
            boolean lNoAffect = fLCheck.isSelected();
            boolean rNoAffect = fRCheck.isSelected();
            boolean even = fEvenCheck.isSelected();
            boolean odd = fOddCheck.isSelected();
            boolean five = fFiveCheck.isSelected();
            String sn1 = props.getProperty("sn1");
            String sn2 = props.getProperty("sn2");
            String sn3 = props.getProperty("sn3");
            String sn4 = props.getProperty("sn4");
            String sn5 = props.getProperty("sn5");
            String sn6 = props.getProperty("sn6");
            int lastDigit = 1;
            if (sn6.equals("0") || sn6.equals("1") || sn6.equals("2") || sn6.equals("3") || sn6.equals("4") || sn6.equals("5") || sn6.equals("6") || sn6.equals("7") || sn6.equals("8") || sn6.equals("9")) {
                lastDigit = Integer.parseInt(sn6);
            } else if (sn5.equals("0") || sn5.equals("1") || sn5.equals("2") || sn5.equals("3") || sn5.equals("4") || sn5.equals("5") || sn5.equals("6") || sn5.equals("7") || sn5.equals("8") || sn5.equals("9")) {
                lastDigit = Integer.parseInt(sn5);
            } else if (sn4.equals("0") || sn4.equals("1") || sn4.equals("2") || sn4.equals("3") || sn4.equals("4") || sn4.equals("5") || sn4.equals("6") || sn4.equals("7") || sn4.equals("8") || sn4.equals("9")) {
                lastDigit = Integer.parseInt(sn4);
            } else if (sn3.equals("0") || sn3.equals("1") || sn3.equals("2") || sn3.equals("3") || sn3.equals("4") || sn3.equals("5") || sn3.equals("6") || sn3.equals("7") || sn3.equals("8") || sn3.equals("9")) {
                lastDigit = Integer.parseInt(sn3);
            } else if (sn2.equals("0") || sn2.equals("1") || sn2.equals("2") || sn2.equals("3") || sn2.equals("4") || sn2.equals("5") || sn2.equals("6") || sn2.equals("7") || sn2.equals("8") || sn2.equals("9")) {
                lastDigit = Integer.parseInt(sn2);
            } else if (sn1.equals("0") || sn1.equals("1") || sn1.equals("2") || sn1.equals("3") || sn1.equals("4") || sn1.equals("5") || sn1.equals("6") || sn1.equals("7") || sn1.equals("8") || sn1.equals("9")) {
                lastDigit = Integer.parseInt(sn1);
            }
            System.out.println("(Faulty)");
            System.out.println("BG Color - " + bg);
            System.out.println("BTN L Color - " + btnL);
            System.out.println("BTN R Color - " + btnR);
            System.out.println("BTN L Text - " + btnLTxt);
            System.out.println("BTN R Text - " + btnRTxt);
            System.out.println("L No Affect - " + lNoAffect);
            System.out.println("R No Affect - " + rNoAffect);
            System.out.println("No Even - " + even);
            System.out.println("No Odd - " + odd);
            System.out.println("Five - " + five);
            System.out.println("Last Digit - " + lastDigit);
            if (lNoAffect || rNoAffect) {
                System.out.println("Rule 1");
                if (lNoAffect) {
                    fOutput.setText("L Fake");
                } else {
                    fOutput.setText("R Fake");
                }
            } else if (btnL.equals(bg) || btnR.equals(bg)) {
                System.out.println("Rule 2");
                if (btnL.equals(bg)) {
                    fOutput.setText("R Fake");
                } else {
                    fOutput.setText("L Fake");
                }
            } else if (btnLTxt.equals("BUSH ME!") || btnRTxt.equals("BUSH ME!")) {
                System.out.println("Rule 3");
                fOutput.setText("L Fake");
            } else if (btnLTxt.equals("PUSH NE!") || btnRTxt.equals("PUSH NE!")) {
                System.out.println("Rule 4");
                fOutput.setText("R Fake");
            } else if (btnLTxt.equals("PUSH HE!") || btnRTxt.equals("PUSH HE!")) {
                System.out.println("Rule 5");
                if (btnLTxt.equals("PUSH HE!")) {
                    fOutput.setText("L Fake");
                } else {
                    fOutput.setText("R Fake");
                }
            } else if (btnLTxt.equals("PUSH SHE!") || btnRTxt.equals("PUSH SHE!")) {
                System.out.println("Rule 6");
                if (btnLTxt.equals("PUSH SHE!")) {
                    fOutput.setText("R Fake");
                } else {
                    fOutput.setText("L Fake");
                }
            } else if (even) {
                System.out.println("Rule 7");
                fOutput.setText("L Fake");
            } else if (odd) {
                System.out.println("Rule 8");
                fOutput.setText("R Fake");
            } else if (five && (btnL.equals("Black") || btnR.equals("Black"))) {
                System.out.println("Rule 9");
                if (btnL.equals("Black")) {
                    fOutput.setText("L Fake");
                } else {
                    fOutput.setText("R Fake");
                }
            } else if (lastDigit % 2 == 0) {
                System.out.println("Rule 10");
                fOutput.setText("R Fake");
            } else {
                System.out.println("Rule 11");
                fOutput.setText("L Fake");
            }
            if (fOutput.getText().equals("L Fake")) {
                System.out.println("Left Fake");
            } else {
                System.out.println("Right Fake");
            }
        });
        fLCheck.addActionListener((ActionEvent e) -> {fRCheck.setSelected(false);});
        fRCheck.addActionListener((ActionEvent e) -> {fLCheck.setSelected(false);});
        fEvenCheck.addActionListener((ActionEvent e) -> {fOddCheck.setSelected(false);});
        fOddCheck.addActionListener((ActionEvent e) -> {fEvenCheck.setSelected(false);});
    }
    public static int orderCheck(boolean a, boolean b) {
        // 1 = 1st letter
        // 2 = 2nd letter
        // 3 = All done
        int c = 3;
        if (a == true && b == false) {
            c = 2;
        } else if (a == false) {
            c = 1;
        }
        return c;
    }
    public static int letterCheck(String a, String b) {
        int c = 0;
        switch (a) {
            case "A":
                switch (b) {
                    case "A": c = 3; break;
                    case "B": c = 2; break;
                    case "C": c = 9; break;
                    case "D": c = 1; break;
                    case "E": c = 7; break;
                    case "F": c = 4; break;
                } break;
            case "B":
                switch (b) {
                    case "A": c = 7; break;
                    case "B": c = 9; break;
                    case "C": case "D": c = 8; break;
                    case "E": c = 2; break;
                    case "F": c = 3; break;
                } break;
            case "C":
                switch (b) {
                    case "A": c = 5; break;
                    case "B": c = 1; break;
                    case "C": c = 7; break;
                    case "D": case "E": c = 4; break;
                    case "F": c = 6; break;
                } break;
            case "D":
                switch (b) {
                    case "A": case "D": c = 6; break;
                    case "B": c = 4; break;
                    case "C": c = 2; break;
                    case "E": c = 8; break;
                    case "F": c = 5; break;
                } break;
            case "E":
                switch (b) {
                    case "A": case "C": c = 5; break;
                    case "B": c = 1; break;
                    case "D": c = 3; break;
                    case "E": case "F": c = 9; break;
                } break;
            case "F":
                switch (b) {
                    case "A": c = 1; break;
                    case "B": c = 2; break;
                    case "C": c = 3; break;
                    case "D": c = 6; break;
                    case "E": c = 7; break;
                    case "F": c = 8; break;
                }
        }
        return c;
    }
}