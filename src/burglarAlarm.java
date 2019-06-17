/**
 * Burglar Alarm
 *
 * Started work on 6/16/2019 9:38 PM
 *
 * Finished version 0.1 on 6/17/2019 1:20 AM
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;
import java.util.List;

import be.pcl.swing.ImprovedFormattedTextField;

public class burglarAlarm {
    static JFrame f;
    private static Properties props;
    private static int solved;
    private static ArrayList<Integer> moduleNumArrList = new ArrayList<>();
    private static String moduleNumStr;
    public static void module() {
        System.out.println("[BURGLAR ALARM]");
        f = new JFrame("KAaNE [BURGLAR ALARM]");
        ImageIcon icon = new ImageIcon("imgs/icons/Burglar Alarm.png");
        f.setIconImage(icon.getImage());
        // Edgework
        File configFile = new File("config.properties");
        props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        // Text Field
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField solvedTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        solvedTB.setBounds(250,5,60,20);
        JTextField moduleNumberTB = new JTextField();
        moduleNumberTB.setBounds(250,25,60,20);
        moduleNumberTB.setDocument(new JTextFieldLimit(8));
        // Label
        JLabel solvedLabel = new JLabel("Solved");
        solvedLabel.setBounds(203,5,40,20);
        JLabel moduleNumberLabel = new JLabel("Module #");
        moduleNumberLabel.setBounds(197,25,60,20);
        // Output
        Font font = new Font("SansSerif", Font.BOLD, 40);
        JTextField output = new JTextField("8888 8888");
        output.setEditable(false);
        output.setFont(font);
        output.setBounds(5,5,190,40);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(315,5,60,40);
        // Add
        f.add(solvedTB); f.add(solvedLabel);
        f.add(moduleNumberTB); f.add(moduleNumberLabel);
        f.add(output); f.add(button);
        // Define JFrame
        f.setLayout(null);
        f.setSize(385,80);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Do logic
        button.addActionListener((ActionEvent e) -> {
            solved = Integer.parseInt(solvedTB.getText());
            moduleNumStr = moduleNumberTB.getText();
            for (int i = 0; i<moduleNumStr.length(); i++) {
                moduleNumArrList.add(Integer.parseInt(String.valueOf(moduleNumStr.charAt(i))));
            }
            output.setText(logic());
        });
    }
    private static String logic() {
        String output = "";
        ArrayList<String> outputList = new ArrayList<>();
        // Numero 1
        System.out.println("Calculating #1");
        int bats = Integer.parseInt(props.getProperty("batteriesTotal"));
        int ports = Integer.parseInt(props.getProperty("totalPorts"));
        if (bats > ports) {
            System.out.println("Bats > Ports");
            int batHolds = Integer.parseInt(props.getProperty("batteryHolders"));
            if (batHolds % 2 == 0) {
                System.out.println("Even number of Bat Holds");
                outputList.add("9");
            } else {
                System.out.println("Else (Odd number of Bat Holds)");
                outputList.add("1");
            }
        } else {
            System.out.println("Else (Bats < Ports)");
            if (moduleNumArrList.get(7) % 2 == 0) {
                System.out.println("Last digit of Mod Num even");
                outputList.add("3");
            } else {
                System.out.println("Else (Last digit of Mod Num odd)");
                outputList.add("4");
            }
        }
        // Numero 2
        System.out.println("Calculating #2");
        int ps2 = Integer.parseInt(props.getProperty("ps2"));
        if (ps2 == 1) {
            System.out.println("PS/2");
            int snDigits = Integer.parseInt(props.getProperty("snTotalDigs"));
            int snLetters = Integer.parseInt(props.getProperty("snTotalLets"));
            if (snLetters > snDigits) {
                System.out.println("SN Letters > SN Digits");
                outputList.add("0");
            } else {
                System.out.println("Else (SN Letters < SN Digits)");
                outputList.add("6");
            }
        } else {
            System.out.println("Else (No PS/2)");
            int litBOB = Integer.parseInt(props.getProperty("bobLit"));
            if (litBOB == 1) {
                System.out.println("Lit BOB");
                outputList.add("5");
            } else {
                System.out.println("Else (No Lit BOB)");
                outputList.add("2");
            }
        }
        // Numero 3
        System.out.println("Calculating #3");
        if (solved % 2 == 0) {
            System.out.println("Solved # even");
            if (moduleNumArrList.get(2) % 2 == 0) {
                System.out.println("3rd dig of mod# even");
                outputList.add("8");
            } else {
                System.out.println("Else (3rd dig of mod# odd)");
                outputList.add("4");
            }
        } else {
            System.out.println("Else (Solved # odd)");
            int rj45 = Integer.parseInt(props.getProperty("rj45"));
            if (rj45 == 1) {
                System.out.println("RJ-45");
                outputList.add("9");
            } else {
                System.out.println("Else (No RJ-45)");
                outputList.add("3");
            }
        }
        // Numero 4
        System.out.println("Calculating #4");
        int moduleNumTotal = 0;
        for (int a : moduleNumArrList) {
            moduleNumTotal += a;
        }
        int portPlates = Integer.parseInt(props.getProperty("plates"));
        int indicators = Integer.parseInt(props.getProperty("totalInds"));
        if (moduleNumTotal % 2 == 1) {
            System.out.println("Module# sum odd");
            if (portPlates > indicators) {
                System.out.println("Plates > Indicators");
                outputList.add("7");
            } else {
                System.out.println("Else (Plates < Indicators)");
                outputList.add("3");
            }
        } else {
            System.out.println("Else (Module# sum even)");
            int dBats = Integer.parseInt(props.getProperty("batteriesD"));
            int aaBats = Integer.parseInt(props.getProperty("batteriesAA"));
            if (dBats > aaBats) {
                System.out.println("D Bats > AA Bats");
                outputList.add("7");
            } else {
                System.out.println("Else (D Bats < AA Bats)");
                outputList.add("2");
            }
        }
        // Numero 5
        System.out.println("Calculating #5");
        if (solved > (bats * portPlates)) {
            System.out.println("Solved > (Bats * Plates)");
            if (ports % 2 == 0) {
                System.out.println("Port # Even");
                outputList.add("9");
            } else {
                System.out.println("Else (Port # Odd)");
                outputList.add("3");
            }
        } else {
            System.out.println("Else (Solved < (Bats * Plates))");
            if (ports > indicators) {
                System.out.println("Ports > Inds");
                outputList.add("7");
            } else {
                System.out.println("Else (Ports < Inds)");
                outputList.add("8");
            }
        }
        // Numero 6
        System.out.println("Calculating #6");
        int parallel = Integer.parseInt(props.getProperty("parallel"));
        if (parallel == 1) {
            System.out.println("Parallel");
            int serial = Integer.parseInt(props.getProperty("serial"));
            if (serial == 1) {
                System.out.println("Serial");
                outputList.add("1");
            } else {
                System.out.println("Else (No Serial)");
                outputList.add("5");
            }
        } else {
            System.out.println("Else (No Parallel)");
            int litFRQ = Integer.parseInt(props.getProperty("frqLit"));
            if (litFRQ == 1) {
                System.out.println("Lit FRQ");
                outputList.add("0");
            } else {
                System.out.println("Else (No Lit FRQ)");
                outputList.add("4");
            }
        }
        // Numero 7
        System.out.println("Calculating #7");
        if (bats > 4) {
            System.out.println("Bats > 4");
            int indsUnlit = Integer.parseInt(props.getProperty("totalIndsUnlit"));
            if (indsUnlit == 0) {
                System.out.println("No unlit inds");
                outputList.add("2");
            } else {
                System.out.println("Else (Unlit Inds)");
                outputList.add("6");
            }
        } else {
            System.out.println("Else (Bats < 4)");
            int indsLit = Integer.parseInt(props.getProperty("totalIndsLit"));
            if (indsLit == 0) {
                System.out.println("No lit inds");
                outputList.add("4");
            } else {
                System.out.println("Else (Lit Inds)");
                outputList.add("9");
            }
        }
        // Numero 8
        System.out.println("Calculating #8");
        String sn1 = props.getProperty("sn1");
        String sn2 = props.getProperty("sn2");
        String sn3 = props.getProperty("sn3");
        String sn4 = props.getProperty("sn4");
        String sn5 = props.getProperty("sn5");
        String sn6 = props.getProperty("sn6");
        String[] snArr = {sn1,sn2,sn3,sn4,sn5,sn6};
        if (bats == indicators) {
            System.out.println("Bats = Inds");
            if (hasChars("BURG14R",snArr)) {
                System.out.println("SN has BURG14R");
                outputList.add("1");
            } else {
                System.out.println("Else (SN doesn't have BURG14R)");
                outputList.add("0");
            }
        } else {
            System.out.println("Else (Bats != Inds)");
            if (hasChars("AL53M",snArr)) {
                System.out.println("SN has AL53M");
                outputList.add("0");
            } else {
                System.out.println("Else (SN doesn't have AL53M)");
                outputList.add("8");
            }
        }
        System.out.println("Calculated Number: " + Arrays.toString(outputList.toArray()));
        System.out.println("Module Number: " + moduleNumStr);
        // Convert arraylist to int array
        String[] outputArr = new String[outputList.size()];
        outputArr = outputList.toArray(outputArr);
        int[] outputIntArr = new int[outputArr.length];
        for (int i = 0; i < outputArr.length; i++)
            outputIntArr[i] = Integer.parseInt(outputArr[i]);
        // Convert module number to array
        int[] moduleNumArr = new int[moduleNumArrList.size()];
        for (int i = 0; i < moduleNumArr.length; i++)
            moduleNumArr[i] = moduleNumArrList.get(i);
        // Add both module numbers
        for (int i = 0; i < moduleNumArr.length; i++) {
            int temp1 = (outputIntArr[i] + moduleNumArr[i]) % 10;
            outputIntArr[i] = temp1;
        }
        // Convert back to string
        for (int i = 0; i < outputIntArr.length; i++) {
            // If it's the middle character
            if (i == (outputIntArr.length / 2)) {
                // Add a space as well (for easier reading)
                output += " " + outputIntArr[i];
            } else {
                output += outputIntArr[i];
            }
        }
        System.out.println("Final Number: " + output);
        return output;
    }
    private static boolean hasChars (String s, String[] arr) {
        // Split string into char array
        char[] cArr = s.toCharArray();
        for (String a : arr)
            for (char c : cArr)
                if (a.equals(String.valueOf(c)))
                    return true;
        return false;
    }
}
