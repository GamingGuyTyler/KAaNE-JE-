/**
 * Unfair Cipher, started work on 7:30 AM 5/31/2019
 *
 * Paused work on 11:00 AM 5/31/2019 (finished key a + gui)
 *
 * Version 0.1
 */

import be.pcl.swing.ImprovedFormattedTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.List;

public class unfairCipher {
    static JFrame f;
    public static void module() {
        System.out.println("[UNFAIR CIPHER]");
        f = new JFrame("KAaNE [UNFAIR CIPHER]");
        ImageIcon icon = new ImageIcon("imgs/icons/Unfair Cipher.png");
        f.setIconImage(icon.getImage());
        // Edgework
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        // Text Fields
        JTextField encryptMsg = new JTextField();
        encryptMsg.setBounds(3,5,290,20);
        encryptMsg.setDocument(new JTextFieldLimit(40));
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField moduleIDTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        moduleIDTB.setBounds(5,30,50,20);
        ImprovedFormattedTextField strikeTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        strikeTB.setBounds(5,50,50,20);
        // Labels
        JLabel moduleIDLabel = new JLabel("Module ID");
        moduleIDLabel.setBounds(60,30,100,20);
        JLabel strikeLabel = new JLabel("Strikes");
        strikeLabel.setBounds(60,50,100,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(200,50,75,20);
        // Add everything
        f.add(encryptMsg); f.add(moduleIDTB); f.add(strikeTB);
        f.add(moduleIDLabel); f.add(strikeLabel); f.add(button);
        // Define JFrame
        f.setLayout(null);
        f.setSize(300,150);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Logic
        button.addActionListener((ActionEvent e) -> {
            // Serial Number
            String sn1 = props.getProperty("sn1");
            String sn2 = props.getProperty("sn2");
            String sn3 = props.getProperty("sn3");
            String sn4 = props.getProperty("sn4");
            String sn5 = props.getProperty("sn5");
            String sn6 = props.getProperty("sn6");
            String sn = sn1 + sn2 + sn3 + sn4 + sn5 + sn6;
            // Module ID
            String moduleID = moduleIDTB.getText();
            // Port Plates
            String plates = props.getProperty("plates");
            // Battery Holders
            String batteryHolders = props.getProperty("batteryHolders");
            // Key A
            String keyA = keyA(sn4,sn5,sn,moduleID,plates,batteryHolders);
        });
    }
    public static String keyA(String sn4, String sn5, String sn, String moduleID, String plates, String batteryHolders) {
        String output = "";
        System.out.println("CALCULATING KEY A");
        System.out.println("SN: " + sn);
        // STEP 2
        // Convert SN's to chars
        int sn1INT = 0;
        int sn2INT = 0;
        int sn3INT = 0;
        int sn4INT = 0;
        int sn5INT = 0;
        int sn6INT = 0;
        if (!string.isDigit(String.valueOf(sn.charAt(0)))) sn1INT = sn.charAt(0) - 'A' + 1; else sn1INT = Integer.parseInt(String.valueOf(sn.charAt(0)));
        if (!string.isDigit(String.valueOf(sn.charAt(1)))) sn2INT = sn.charAt(1) - 'A' + 1; else sn2INT = Integer.parseInt(String.valueOf(sn.charAt(1)));
        if (!string.isDigit(String.valueOf(sn.charAt(2)))) sn3INT = sn.charAt(2) - 'A' + 1; else sn3INT = Integer.parseInt(String.valueOf(sn.charAt(2)));
        if (!string.isDigit(String.valueOf(sn.charAt(3)))) sn4INT = sn.charAt(3) - 'A' + 1; else sn4INT = Integer.parseInt(String.valueOf(sn.charAt(3)));
        if (!string.isDigit(String.valueOf(sn.charAt(4)))) sn5INT = sn.charAt(4) - 'A' + 1; else sn5INT = Integer.parseInt(String.valueOf(sn.charAt(4)));
        if (!string.isDigit(String.valueOf(sn.charAt(5)))) sn6INT = sn.charAt(5) - 'A' + 1; else sn6INT = Integer.parseInt(String.valueOf(sn.charAt(5)));
        System.out.println("Ints: " + sn1INT + ", " + sn2INT + ", " + sn3INT + ", " + sn4INT + ", " + sn5INT + ", " + sn6INT);
        int digitSingleInt = 0;
        if (sn1INT >= 20) {
            String digitSingleString = String.valueOf(sn2INT) + String.valueOf(sn3INT) + String.valueOf(sn4INT) + String.valueOf(sn5INT) + String.valueOf(sn6INT);
            digitSingleInt = Integer.parseInt(digitSingleString);
        }
        else {
            String digitSingleString = String.valueOf(sn1INT) + String.valueOf(sn2INT) + String.valueOf(sn3INT) + String.valueOf(sn4INT) + String.valueOf(sn5INT) + String.valueOf(sn6INT);
            digitSingleInt = Integer.parseInt(digitSingleString);
        }
        System.out.println("Step 2 string: " + digitSingleInt);
        // STEP 3
        if (string.isVowel(sn4) || string.isVowel(sn5)) {
            digitSingleInt /= 10;
        }
        System.out.println("Step 3 string: " + digitSingleInt);
        // STEP 4
        String digitConverted = hexConvert(digitSingleInt);
        System.out.println("Step 4 string: " + digitConverted);
        // STEP 5
        String[] digitConvertedArray = digitConverted.split("");
        List<String> convertAgain = new ArrayList<String>();
        for (int index = 0; index!=digitConvertedArray.length-1; index += 1) {
            int index2 = index + 1;
            String check = digitConvertedArray[index] + digitConvertedArray[index2];
            try {
                int checkInt = Integer.parseInt(check);
                if (checkInt >= 10 && checkInt <= 26) {
                    char chr = (char)(checkInt+'A'-1);
                    convertAgain.add(String.valueOf(chr));
                }
                else {
                    checkInt = Integer.parseInt(digitConvertedArray[index]);
                    char chr = (char)(checkInt+'A'-1);
                    convertAgain.add(String.valueOf(chr));
                }
            } catch (NumberFormatException e) {
                if (digitConvertedArray[index].equals("0")) {
                    convertAgain.add("");
                }
                else if (string.isDigit(digitConvertedArray[index])) {
                    int checkInt = Integer.parseInt(digitConvertedArray[index]);
                    char chr = (char)(checkInt+'A'-1);
                    convertAgain.add(String.valueOf(chr));
                }
                else {
                    convertAgain.add(digitConvertedArray[index]);
                }
            }
            System.out.println("Step 5 iteration " + (index + 1) + ": " + convertAgain.toArray()[index]);
        }
        String lastChr = digitConvertedArray[digitConvertedArray.length-1];
        int index = digitConvertedArray.length;
        if (lastChr.equals("0")) {
            convertAgain.add("");
        }
        else if (string.isDigit(lastChr)) {
            int checkInt = Integer.parseInt(lastChr);
            char chr = (char)(checkInt+'A'-1);
            convertAgain.add(String.valueOf(chr));
        } else {
            convertAgain.add(lastChr);
        }
        System.out.println("Step 5 iteration " + index + ": " + convertAgain.toArray()[index-1]);
        convertAgain.removeAll(Arrays.asList("",null));
        System.out.println("Step 5 String: " + Arrays.toString(convertAgain.toArray()).toUpperCase());
        // STEP 6
        System.out.println("Module ID - " + moduleID);
        System.out.println("Plates - " + plates);
        System.out.println("Battery Holders - " + batteryHolders);
        String moduleIDconv = "";
        String platesconv = "";
        String batteryHoldersconv = "";
        if (!moduleID.equals("0")) moduleIDconv = String.valueOf((char)(moduleID.charAt(0) + 48));
        if (!plates.equals("0")) platesconv = String.valueOf((char)(plates.charAt(0) + 48));
        if (!batteryHolders.equals("0")) batteryHoldersconv = String.valueOf((char)(batteryHolders.charAt(0) + 48));
        convertAgain.add(moduleIDconv);
        convertAgain.add(platesconv);
        convertAgain.add(batteryHoldersconv);
        convertAgain.removeAll(Arrays.asList("",null));
        output = Arrays.toString(convertAgain.toArray()).toUpperCase();
        // Remove extra characters
        String regx = "[], ";
        char[] ca = regx.toCharArray();
        for (char c : ca) {
            output = output.replace(""+c, "");
        }
        System.out.println("KEY A - " + output);
        return output;
    }
    public static String hexConvert (int a) {
        System.out.println("CONVERTING TO HEX...");
        String output = "";
        boolean continuing = true;
        List<String> hexRemainder = new ArrayList<String>();
        int iteration = 0;
        while (continuing) {
            // Divide by 16
            int remainder = a % 16;
            a /= 16;
            if (a != 0) {
                // Convert remainder to Hex
                hexRemainder.add(Integer.toHexString(remainder));
                iteration += 1;
                System.out.println("Iteration " + iteration + ": " + Integer.toHexString(remainder));
            }
            else continuing = false;
        }
        Collections.reverse(hexRemainder);
        String[] hexArray = hexRemainder.toArray(new String[0]);
        output = Arrays.toString(hexArray);
        // remove unnecessary characters
        String regx = "[], ";
        char[] ca = regx.toCharArray();
        for (char c : ca) {
            output = output.replace(""+c, "");
        }
        // remove leading zeros (just in case)
        output.replaceFirst("^0+(?!$)", "");
        return output;
    }
}
