/**
 * Benedict Cumberbatch module, started work on 12/1/18 2:55 PM
 * 
 * Finished version 0.1 on 12/22/18 8:39 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import org.jdesktop.swingx.autocomplete.*;

public class benedictCumberbatch {
    static JFrame f;
    AutoCompleteDecorator decorator;
    public static void module() {
        System.out.println("[BENEDICT CUMBERBATCH]");
        f = new JFrame("KAaNE [BENEDICT CUMBERBATCH]");
        ImageIcon icon = new ImageIcon("imgs/icons/Benedict Cumberbatch.png");
        f.setIconImage(icon.getImage());
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0027");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0028");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // String Arrays
        String leftStrings[] = {"Bene","Bomba","Broccoli","Buffalo","Bumble","Bunsen","Burger",
                                "Cadbury","Syphilis"};
        String rightStrings[] = {"Bonaparte","Cabbage","Call","Coddle","Crumple","Cumber",
                                 "Lingerie","Oxfordshire","Talisman"};
        // CBs
        JComboBox leftCB = new JComboBox(leftStrings); leftCB.setBounds(55,10,100,20);
        JComboBox rightCB = new JComboBox(rightStrings); rightCB.setBounds(240,10,100,20);
        // AutoComplete CBs
        AutoCompleteDecorator.decorate(leftCB);
        AutoCompleteDecorator.decorate(rightCB);
        // Button
        JButton button = new JButton("OK"); button.setBounds(167,10,60,20);
        // Output labels
        JLabel outputL = new JLabel("", SwingConstants.CENTER); outputL.setBounds(55,30,100,40);
        JLabel outputR = new JLabel("", SwingConstants.CENTER); outputR.setBounds(240,30,100,40);
        // Check box
        JCheckBox modDefCheck = new JCheckBox("Check if more than half of the modules are disarmed");
        modDefCheck.setBounds(35,70,350,20);
        // Add
        f.add(leftCB); f.add(rightCB); f.add(button); f.add(outputL); f.add(outputR); f.add(modDefCheck);
        // Define JFrame
        f.setLayout(null);
        f.setSize(400,130);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            // Forename
            String left = (String) leftCB.getItemAt(leftCB.getSelectedIndex());
            if (left.equals("Broccoli") || left.equals("Buffalo") || left.equals("Syphilis") || left.equals("Cadbury")) {
                System.out.println("Left - ignore ops");
                outputL.setText("<html>dict, bee, king,<br/>boom, burner</html>");
            } else {
                int index = 0;
                // add 1
                int parallel = Integer.parseInt(props.getProperty("parallel"));
                if (parallel == 1) index += 1;
                String sn1 = props.getProperty("sn1"); String sn2 = props.getProperty("sn2");
                String sn3 = props.getProperty("sn3"); String sn4 = props.getProperty("sn4");
                String sn5 = props.getProperty("sn5"); String sn6 = props.getProperty("sn6");
                String sn = sn1 + sn2 + sn3 + sn4 + sn5 + sn6;
                boolean snVowel = false;
                for (int b=0;b<sn.length();b++){
                    if((sn.charAt(b) == 'A') || (sn.charAt(b) == 'E') ||
                    (sn.charAt(b) == 'I') || (sn.charAt(b) == 'O') ||
                    (sn.charAt(b) == 'U')) {
                        snVowel = true; break;
                    }
                }
                if (snVowel) index += 1;
                if (modDefCheck.isSelected()) index += 1;
                // add 2
                int serial = Integer.parseInt(props.getProperty("serial"));
                if (serial == 1) index+= 2;
                if (!snVowel) index += 2;
                if (!modDefCheck.isSelected()) index += 2;
                // multiply by 2, add n
                int frkLit = Integer.parseInt(props.getProperty("frkLit"));
                if (frkLit == 1) index = index * 2 + 3;
                int snLetters = 0; int snDigits = 0;
                for (int b=0;b<sn.length();b++){
                    if (Character.isLetter(sn.charAt(b))) snLetters += 1;
                    else snDigits += 1;
                }
                if (snLetters < snDigits) index = index * 2 + 4;
                if (!Character.isLetter(sn.charAt(5))) if (Integer.parseInt(sn6) % 2 == 0) index = index * 2 + 5;
                else if (!Character.isLetter(sn.charAt(4))) if (Integer.parseInt(sn5) % 2 == 0) index = index * 2 + 5;
                else if (!Character.isLetter(sn.charAt(3))) if (Integer.parseInt(sn4) % 2 == 0) index = index * 2 + 5;
                else if (!Character.isLetter(sn.charAt(2))) if (Integer.parseInt(sn3) % 2 == 0) index = index * 2 + 5;
                else if (!Character.isLetter(sn.charAt(1))) if (Integer.parseInt(sn2) % 2 == 0) index = index * 2 + 5;
                else if (!Character.isLetter(sn.charAt(0))) if (Integer.parseInt(sn1) % 2 == 0) index = index * 2 + 5;
                // multiply by 3, add n
                int nsa = Integer.parseInt(props.getProperty("nsa"));
                int nsaLit = Integer.parseInt(props.getProperty("nsaLit"));
                int nsaUnlit = 0; if (nsa == 1 && nsaLit == 0) nsaUnlit = 1;
                if (nsaUnlit == 1) index = index * 3 + 6;
                if (snLetters > snDigits) index = index * 3 + 7;
                if (!Character.isLetter(sn.charAt(5))) if (Integer.parseInt(sn6) % 2 == 1) index = index * 3 + 8;
                else if (!Character.isLetter(sn.charAt(4))) if (Integer.parseInt(sn5) % 2 == 1) index = index * 3 + 8;
                else if (!Character.isLetter(sn.charAt(3))) if (Integer.parseInt(sn4) % 2 == 1) index = index * 3 + 8;
                else if (!Character.isLetter(sn.charAt(2))) if (Integer.parseInt(sn3) % 2 == 1) index = index * 3 + 8;
                else if (!Character.isLetter(sn.charAt(1))) if (Integer.parseInt(sn2) % 2 == 1) index = index * 3 + 8;
                else if (!Character.isLetter(sn.charAt(0))) if (Integer.parseInt(sn1) % 2 == 1) index = index * 3 + 8;
                // finalize index results
                index = index % 10;
                System.out.println("left index - " + index);
                // compare with prefix and index
                String output = "";
                switch (index) {
                    case 0: switch (left) {
                        case "Bene": output = "dict"; break;
                        case "Bumble": output = "bee"; break;
                        case "Burger": output = "king"; break;
                        case "Bomba": output = "boom"; break;
                        case "Bunsen": output = "burner"; break;
                        } break;
                    case 1: switch (left) {
                        case "Bene": output = "dryl"; break;
                        case "Bumble": output = "boi"; break;
                        case "Burger": output = "dil"; break;
                        case "Bomba": output = "bait"; break;
                        case "Bunsen": output = "swick"; break;
                        } break;
                    case 2: switch (left) {
                        case "Bene": output = "drive"; break;
                        case "Bumble": output = "basher"; break;
                        case "Burger": output = "coot"; break;
                        case "Bomba": output = "butt"; break;
                        case "Bunsen": output = "don"; break;
                        } break;
                    case 3: switch (left) {
                        case "Bene": output = "dink"; break;
                        case "Bumble": output = "bong"; break;
                        case "Burger": output = "top"; break;
                        case "Bomba": output = "blast"; break;
                        case "Bunsen": output = "snap"; break;
                        } break;
                    case 4: switch (left) {
                        case "Bene": output = "bus"; break;
                        case "Bumble": output = "buzz"; break;
                        case "Burger": output = "trap"; break;
                        case "Bomba": output = "stic"; break;
                        case "Bunsen": output = "whale"; break;
                        } break;
                    case 5: switch (left) {
                        case "Bene": output = "juice"; break;
                        case "Bumble": output = "stick"; break;
                        case "Burger": output = "burg"; break;
                        case "Bomba": output = "dick"; break;
                        case "Bunsen": output = "rock"; break;
                        } break;
                    case 6: switch (left) {
                        case "Bene": output = "snatch"; break;
                        case "Bumble": output = "pest"; break;
                        case "Burger": output = "boop"; break;
                        case "Bomba": output = "buck"; break;
                        case "Bunsen": output = "box"; break;
                        } break;
                    case 7: switch (left) {
                        case "Bene": output = "ton"; break;
                        case "Bumble": output = "blaster"; break;
                        case "Burger": output = "dirk"; break;
                        case "Bomba": output = "blow"; break;
                        case "Bunsen": output = "town"; break;
                        } break;
                    case 8: switch (left) {
                        case "Bene": output = "saur"; break;
                        case "Bumble": output = "berry"; break;
                        case "Burger": output = "bub"; break;
                        case "Bomba": output = "tonk"; break;
                        case "Bunsen": output = "shack"; break;
                        } break;
                    case 9: switch (left) {
                        case "Bene": output = "dang"; break;
                        case "Bumble": output = "milk"; break;
                        case "Burger": output = "cash"; break;
                        case "Bomba": output = "ray"; break;
                        case "Bunsen": output = "ster"; break;
                        } break;
                }
                outputL.setText(output);
                System.out.println("left output - " + output);
            }
            // Surname
            String right = (String) rightCB.getItemAt(rightCB.getSelectedIndex());
            if (right.equals("Bonaparte") || right.equals("Oxfordshire") || right.equals("Talisman") || right.equals("Lingerie")) {
                System.out.println("Right - ignore ops");
                outputR.setText("<html>batch,swort,sack,<br/>dispatch,patch</html>");
            } else {
                int index = 0;
                // add 1
                int stereoRCA = Integer.parseInt(props.getProperty("stereoRCA"));
                if (stereoRCA == 1) index += 1;
                int batteriesTotal = Integer.parseInt(props.getProperty("batteriesTotal"));
                if (batteriesTotal > 2) index += 1;
                int rj45Quantity = Integer.parseInt(props.getProperty("rj45Quantity"));
                int serialQuantity = Integer.parseInt(props.getProperty("serialQuantity"));
                int ps2Quantity = Integer.parseInt(props.getProperty("ps2Quantity"));
                int parallelQuantity = Integer.parseInt(props.getProperty("parallelQuantity"));
                int dvidQuantity = Integer.parseInt(props.getProperty("dvidQuantity"));
                int stereoRCAQuantity = Integer.parseInt(props.getProperty("stereoRCAQuantity"));
                boolean uniquePorts = false;
                if (rj45Quantity > 1 || serialQuantity > 1 || ps2Quantity > 1 || 
                        parallelQuantity > 1 || dvidQuantity > 1 || stereoRCAQuantity > 1) uniquePorts = true;
                if (uniquePorts) index += 1;
                // add 2
                int rj45 = Integer.parseInt(props.getProperty("rj45"));
                if (rj45 == 1) index+= 2;
                if (batteriesTotal < 2) index += 2;
                if (!uniquePorts) index += 2;
                // multiply by 2, add n
                int frqLit = Integer.parseInt(props.getProperty("frqLit"));
                if (frqLit == 1) index = index * 2 + 3;
                int serial = Integer.parseInt(props.getProperty("serial"));
                int ps2 = Integer.parseInt(props.getProperty("ps2"));
                int parallel = Integer.parseInt(props.getProperty("parallel"));
                int dvid = Integer.parseInt(props.getProperty("dvid"));
                if (rj45 + serial + ps2 + parallel + dvid + stereoRCA > 1) index = index * 2 + 4;
                int batteryHolders = Integer.parseInt(props.getProperty("batteryHolders"));
                if (batteryHolders > 1) index = index * 2 + 5;
                // multiply by 3, add n
                int msa = Integer.parseInt(props.getProperty("msa"));
                int msaLit = Integer.parseInt(props.getProperty("msaLit"));
                int msaUnlit = 0; if (msa == 1 && msaLit == 0) msaUnlit = 1;
                if (msaUnlit == 1) index = index * 3 + 6;
                if (rj45 + serial + ps2 + parallel + dvid + stereoRCA == 1) index = index * 3 + 7;
                if (batteryHolders == 0) index = index * 3 + 8;
                // finalize index results
                index = index % 10;
                System.out.println("right index - " + index);
                // compare with prefix and index
                String output = "";
                switch (index) {
                    case 0: switch (right) {
                        case "Cumber": output = "batch"; break;
                        case "Coddle": output = "swort"; break;
                        case "Crumple": output = "sack"; break;
                        case "Call": output = "dispatch"; break;
                        case "Cabbage": output = "patch"; break;
                        } break;
                    case 1: switch (right) {
                        case "Cumber": output = "thatch"; break;
                        case "Coddle": output = "cheese"; break;
                        case "Crumple": output = "horn"; break;
                        case "Call": output = "d'captain"; break;
                        case "Cabbage": output = "butt"; break;
                        } break;
                    case 2: switch (right) {
                        case "Cumber": output = "snatch"; break;
                        case "Coddle": output = "clock"; break;
                        case "Crumple": output = "rash"; break;
                        case "Call": output = "'ur'mum"; break;
                        case "Cabbage": output = "horn"; break;
                        } break;
                    case 3: switch (right) {
                        case "Cumber": output = "bund"; break;
                        case "Coddle": output = "sore"; break;
                        case "Crumple": output = "fish"; break;
                        case "Call": output = "'ya'boi"; break;
                        case "Cabbage": output = "man"; break;
                        } break;
                    case 4: switch (right) {
                        case "Cumber": output = "cooch"; break;
                        case "Coddle": output = "bath"; break;
                        case "Crumple": output = "butt"; break;
                        case "Call": output = "'m'lady"; break;
                        case "Cabbage": output = "sprout"; break;
                        } break;
                    case 5: switch (right) {
                        case "Cumber": output = "sniff"; break;
                        case "Coddle": output = "dinck"; break;
                        case "Crumple": output = "pants"; break;
                        case "Call": output = "ghostbusters"; break;
                        case "Cabbage": output = "dong"; break;
                        } break;
                    case 6: switch (right) {
                        case "Cumber": output = "stick"; break;
                        case "Coddle": output = "snoot"; break;
                        case "Crumple": output = "crush"; break;
                        case "Call": output = "'d'police"; break;
                        case "Cabbage": output = "ship"; break;
                        } break;
                    case 7: switch (right) {
                        case "Cumber": output = "dell"; break;
                        case "Coddle": output = "sniff"; break;
                        case "Crumple": output = "mite"; break;
                        case "Call": output = "'fur'help"; break;
                        case "Cabbage": output = "rash"; break;
                        } break;
                    case 8: switch (right) {
                        case "Cumber": output = "bath"; break;
                        case "Coddle": output = "some"; break;
                        case "Crumple": output = "clomp"; break;
                        case "Call": output = "ing'vienna"; break;
                        case "Cabbage": output = "snutch"; break;
                        } break;
                    case 9: switch (right) {
                        case "Cumber": output = "chord"; break;
                        case "Coddle": output = "wealth"; break;
                        case "Crumple": output = "fish"; break;
                        case "Call": output = "a'vote"; break;
                        case "Cabbage": output = "flage"; break;
                        } break;
                }
                outputR.setText(output);
                System.out.println("Right output - " + output);
            }
        });
    }
}
