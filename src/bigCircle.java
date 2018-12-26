/**
 * The Big Circle module, Started work on 12/22/18 11:30 PM
 * 
 * Finished version 0.1 on 12/25/18 11:10 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import be.pcl.swing.*;
import java.text.*;

public class bigCircle {
    static JFrame f;
    public static void module() {
        System.out.println("[BIG CIRCLE]");
        f = new JFrame("KAaNE [BIG CIRCLE]");
        ImageIcon icon = new ImageIcon("imgs/icons/big circle.png");
        f.setIconImage(icon.getImage());
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0029");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0030");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // Checkbox
        JCheckBox spinCheck = new JCheckBox("Spinning Counter-Clockwise");
        spinCheck.setBounds(10,10,200,20);
        // TBs
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField twoFactorTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        twoFactorTB.setBounds(10,30,20,20);
        ImprovedFormattedTextField solvedTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        solvedTB.setBounds(10,70,30,20);
        ImprovedFormattedTextField parallelPlateTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        parallelPlateTB.setBounds(10,90,30,20);
        ImprovedFormattedTextField paraserialPlateTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        paraserialPlateTB.setBounds(10,110,30,20);
        ImprovedFormattedTextField dvidPlateTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        dvidPlateTB.setBounds(10,130,30,20);
        ImprovedFormattedTextField dvidRCAPlateTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        dvidRCAPlateTB.setBounds(10,150,30,20);
        // Labels
        JLabel twoFactorText = new JLabel("<html>Least Significant # in Two Factor Code<br/>(if you don't have the mod, just leave it 0)</html>");
        twoFactorText.setBounds(30,30,250,40);
        JLabel output = new JLabel("");
        output.setBounds(75,90,170,20);
        JLabel solvedText = new JLabel("Solved Modules");
        solvedText.setBounds(40,70,100,20);
        JLabel parallelPlateText = new JLabel("Port Plates w/ Parallel");
        parallelPlateText.setBounds(40,90,130,20);
        JLabel paraserialPlateText = new JLabel("Port Plates w/ Parallel & Serial");
        paraserialPlateText.setBounds(40,110,200,20);
        JLabel dvidPlateText = new JLabel("Port Plates w/ DVI-D");
        dvidPlateText.setBounds(40,130,130,20);
        JLabel dvidRCAPlateText = new JLabel("Port Plates w/ DVI-D & Stereo RCA");
        dvidRCAPlateText.setBounds(40,150,200,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(10,170,60,20);
        // Add everything
        f.add(spinCheck); f.add(twoFactorTB); f.add(twoFactorText);
        f.add(output); f.add(button); f.add(solvedTB); f.add(solvedText);
        f.add(parallelPlateTB); f.add(paraserialPlateTB); f.add(dvidPlateTB); f.add(dvidRCAPlateTB);
        f.add(parallelPlateText); f.add(paraserialPlateText); f.add(dvidPlateText); f.add(dvidRCAPlateText);
        // Define JFrame
        f.setLayout(null);
        f.setSize(300,230);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            // Check for big boi skip
            int bob = Integer.parseInt(props.getProperty("bob"));
            int batteriesTotal = Integer.parseInt(props.getProperty("batteriesTotal"));
            int batteryHolders = Integer.parseInt(props.getProperty("batteryHolders"));
            if (bob == 1 && batteriesTotal == 5 && batteryHolders == 3) {
                System.out.println("Our lord and savior, Bob Christ, has come, and has given us the EZ win");
                String sn1 = props.getProperty("sn1");
                if (spinCheck.isSelected()) output.setText(reverseOrder(sn1));
                else output.setText(order(sn1));
            }
            else {
                int value = 0;
                // bob, car, clr check
                int car = Integer.parseInt(props.getProperty("car"));
                int clr = Integer.parseInt(props.getProperty("clr"));
                int bobLit = Integer.parseInt(props.getProperty("bobLit"));
                int carLit = Integer.parseInt(props.getProperty("carLit"));
                int clrLit = Integer.parseInt(props.getProperty("clrLit"));
                if (bob == 1 && bobLit == 0) value -= 1;
                else value += 1;
                if (car == 1 && carLit == 0) value -= 1;
                else value += 1;
                if (clr == 1 && clrLit == 0) value -= 1;
                else value += 1;
                // frk, frq, msa, nsa check
                int frk = Integer.parseInt(props.getProperty("frk"));
                int frq = Integer.parseInt(props.getProperty("frq"));
                int msa = Integer.parseInt(props.getProperty("msa"));
                int nsa = Integer.parseInt(props.getProperty("nsa"));
                int frkLit = Integer.parseInt(props.getProperty("frkLit"));
                int frqLit = Integer.parseInt(props.getProperty("frqLit"));
                int msaLit = Integer.parseInt(props.getProperty("msaLit"));
                int nsaLit = Integer.parseInt(props.getProperty("nsaLit"));
                if (frk == 1 && frkLit == 0) value -= 2;
                else value += 2;
                if (frq == 1 && frqLit == 0) value -= 2;
                else value += 2;
                if (msa == 1 && msaLit == 0) value -= 2;
                else value += 2;
                if (nsa == 1 && nsaLit == 0) value -= 2;
                else value += 2;
                // sig, snd, trn check
                int sig = Integer.parseInt(props.getProperty("sig"));
                int snd = Integer.parseInt(props.getProperty("snd"));
                int trn = Integer.parseInt(props.getProperty("trn"));
                int sigLit = Integer.parseInt(props.getProperty("sigLit"));
                int sndLit = Integer.parseInt(props.getProperty("sndLit"));
                int trnLit = Integer.parseInt(props.getProperty("trnLit"));
                if (sig == 1 && sigLit == 0) value -= 3;
                else value += 3;
                if (snd == 1 && sndLit == 0) value -= 3;
                else value += 3;
                if (trn == 1 && trnLit == 0) value -= 3;
                else value += 3;
                // solved module check
                int modules = Integer.parseInt(solvedTB.getText());
                value = value + (modules * 3);
                // battery check
                if (batteriesTotal % 2 == 1) value += 4;
                else value -= 4;
                // parallel plate check
                int parallelPlate = Integer.parseInt(parallelPlateTB.getText());
                int paraserialPlate = Integer.parseInt(paraserialPlateTB.getText());
                parallelPlate -= paraserialPlate;
                value = value + (parallelPlate * 5);
                value = value - (paraserialPlate * 4);
                // dvid plate check
                int dvidPlate = Integer.parseInt(dvidPlateTB.getText());
                int dvidRCAPlate = Integer.parseInt(dvidRCAPlateTB.getText());
                dvidPlate -= dvidRCAPlate;
                value = value - (dvidPlate * 5);
                value = value + (dvidRCAPlate * 5);
                // mod ind check
                int modInd = Integer.parseInt(props.getProperty("modInd"));
                value = value + (modInd * 6);
                // mod port check
                int modPort = Integer.parseInt(props.getProperty("modPort"));
                value = value - (modPort * 6);
                // two factor check
                int twoFactor = Integer.parseInt(twoFactorTB.getText());
                value += twoFactor;
                // finalize value
                if (value < 0) value *= -1;
                System.out.println("Value is " + value);
                // modulo by 10
                // (seems like there's a pattern that can make it easier to assign sn to value)
                value %= 10;
                // assign sn to value
                String snCorrect = "";
                if (value == 0) snCorrect = props.getProperty("sn1");
                if (value == 1 || value == 9) snCorrect = props.getProperty("sn2");
                if (value == 2 || value == 8) snCorrect = props.getProperty("sn3");
                if (value == 3 || value == 7) snCorrect = props.getProperty("sn4");
                if (value == 4 || value == 6) snCorrect = props.getProperty("sn5");
                if (value == 5) snCorrect = props.getProperty("sn6");
                // Get the order and output it
                if (spinCheck.isSelected()) output.setText(reverseOrder(snCorrect));
                else output.setText(order(snCorrect));
            }
        });
    }
    public static String order(String a) {
        String output = "";
        switch (a) {
            case "0": case "1": case "2": output = "Red, Yellow, Blue"; break;
            case "3": case "4": case "5": output = "Orange, Green, Magenta"; break;
            case "6": case "7": case "8": output = "Blue, Black, Red"; break;
            case "9": case "A": case "B": output = "Magenta, White, Orange"; break;
            case "C": case "D": case "E": output = "Orange, Blue, Black"; break;
            case "F": case "G": case "H": output = "Green, Red, White"; break;
            case "I": case "J": case "K": output = "Magenta, Yellow, Black"; break;
            case "L": case "M": case "N": output = "Red, Orange, Yellow"; break;
            case "O": case "P": case "Q": output = "Yellow, Green, Blue"; break;
            case "R": case "S": case "T": output = "Blue, Magenta, Red"; break;
            case "U": case "V": case "W": output = "Black, White, Green"; break;
            case "X": case "Y": case "Z": output = "White, Yellow, Blue"; break;
        }
        return output;
    }
    public static String reverseOrder(String a) {
        String output = "";
        switch (a) {
            case "0": case "1": case "2": output = "Blue, Yellow, Red"; break;
            case "3": case "4": case "5": output = "Magenta, Green, Orange"; break;
            case "6": case "7": case "8": output = "Red, Black, Blue"; break;
            case "9": case "A": case "B": output = "Orange, White, Magenta"; break;
            case "C": case "D": case "E": output = "Black, Blue, Orange"; break;
            case "F": case "G": case "H": output = "White, Red, Green"; break;
            case "I": case "J": case "K": output = "Black, Yellow, Magenta"; break;
            case "L": case "M": case "N": output = "Yellow, Orange, Red"; break;
            case "O": case "P": case "Q": output = "Blue, Green, Yellow"; break;
            case "R": case "S": case "T": output = "Red, Magenta, Blue"; break;
            case "U": case "V": case "W": output = "Green, White, Black"; break;
            case "X": case "Y": case "Z": output = "Blue, Yellow, White"; break;
        }
        return output;
    }
}
