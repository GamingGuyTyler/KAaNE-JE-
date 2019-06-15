/**
 * Blind Alley
 *
 * Started work on 6/13/2019 7:08 PM
 *
 * Had a goddamned BSoD and almost all the logic gone at 8:15 PM
 *
 * Resumed work at 9:50 PM
 *
 * Version 0.1
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class blindAlley {
    static JFrame f;
    static boolean[] logicArr;
    public static void module() {
        System.out.println("[BLIND ALLEY]");
        f = new JFrame("KAaNE [BLIND ALLEY]");
        ImageIcon icon = new ImageIcon("imgs/icons/Blind Alley.png");
        f.setIconImage(icon.getImage());
        // Icons
        ImageIcon doPressICN = new ImageIcon("imgs/blindAlley/dopress-resized.png");
        ImageIcon dontPressICN = new ImageIcon("imgs/blindAlley/dontpress-resized.png");
        // Labels
        JLabel reg1LBL = new JLabel(dontPressICN);
        reg1LBL.setBounds(5,5,40,40);
        JLabel reg2LBL = new JLabel(dontPressICN);
        reg2LBL.setBounds(45,5,40,40);
        JLabel reg3LBL = new JLabel(dontPressICN);
        reg3LBL.setBounds(5,45,40,40);
        JLabel reg4LBL = new JLabel(dontPressICN);
        reg4LBL.setBounds(45,45,40,40);
        JLabel reg5LBL = new JLabel(dontPressICN);
        reg5LBL.setBounds(85,45,40,40);
        JLabel reg6LBL = new JLabel(dontPressICN);
        reg6LBL.setBounds(5,85,40,40);
        JLabel reg7LBL = new JLabel(dontPressICN);
        reg7LBL.setBounds(45,85,40,40);
        JLabel reg8LBL = new JLabel(dontPressICN);
        reg8LBL.setBounds(85,85,40,40);
        // Button
        JButton button = new JButton("REDO LOGIC");
        button.setBounds(175,105,110,20);
        // Add
        f.add(reg1LBL); f.add(reg2LBL);
        f.add(reg3LBL); f.add(reg4LBL); f.add(reg5LBL);
        f.add(reg6LBL); f.add(reg7LBL); f.add(reg8LBL);
        f.add(button);
        // Define JFrame
        f.setLayout(null);
        f.setSize(300,165);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Logic
        logicArr = logic();
        if (logicArr[0]) reg1LBL.setIcon(doPressICN);
        if (logicArr[1]) reg2LBL.setIcon(doPressICN);
        if (logicArr[2]) reg3LBL.setIcon(doPressICN);
        if (logicArr[3]) reg4LBL.setIcon(doPressICN);
        if (logicArr[4]) reg5LBL.setIcon(doPressICN);
        if (logicArr[5]) reg6LBL.setIcon(doPressICN);
        if (logicArr[6]) reg7LBL.setIcon(doPressICN);
        if (logicArr[7]) reg8LBL.setIcon(doPressICN);
        button.addActionListener((ActionEvent e) -> {
            logicArr = logic();
            if (logicArr[0]) reg1LBL.setIcon(doPressICN);
            else reg1LBL.setIcon(dontPressICN);
            if (logicArr[1]) reg2LBL.setIcon(doPressICN);
            else reg2LBL.setIcon(dontPressICN);
            if (logicArr[2]) reg3LBL.setIcon(doPressICN);
            else reg3LBL.setIcon(dontPressICN);
            if (logicArr[3]) reg4LBL.setIcon(doPressICN);
            else reg4LBL.setIcon(dontPressICN);
            if (logicArr[4]) reg5LBL.setIcon(doPressICN);
            else reg5LBL.setIcon(dontPressICN);
            if (logicArr[5]) reg6LBL.setIcon(doPressICN);
            else reg6LBL.setIcon(dontPressICN);
            if (logicArr[6]) reg7LBL.setIcon(doPressICN);
            else reg7LBL.setIcon(dontPressICN);
            if (logicArr[7]) reg8LBL.setIcon(doPressICN);
            else reg8LBL.setIcon(dontPressICN);
        });
    }
    private static boolean[] logic() {
        boolean[] output = {false,false,false,false,false,false,false,false};
        // Edgework
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        // Condition Arr
        int[] conditions = {0,0,0,0,0,0,0,0};
        // REG 1
        int unlitBOB = Integer.parseInt(props.getProperty("bobUnlit"));
        conditions[0] += unlitBOB;
        int litCAR = Integer.parseInt(props.getProperty("carLit"));
        conditions[0] += litCAR;
        int litIND = Integer.parseInt(props.getProperty("indLit"));
        conditions[0] += litIND;
        int batHolds = Integer.parseInt(props.getProperty("batteryHolders"));
        conditions[0] += (batHolds % 2 == 0) ? 1 : 0;
        // REG 2
        int unlitCAR = Integer.parseInt(props.getProperty("carUnlit"));
        conditions[1] += unlitCAR;
        int unlitNSA = Integer.parseInt(props.getProperty("nsaUnlit"));
        conditions[1] += unlitNSA;
        int litFRK = Integer.parseInt(props.getProperty("frkLit"));
        conditions[1] += litFRK;
        int rj45 = Integer.parseInt(props.getProperty("rj45"));
        conditions[1] += rj45;
        // REG 3
        int unlitFRQ = Integer.parseInt(props.getProperty("frqUnlit"));
        conditions[2] += unlitFRQ;
        int unlitIND = Integer.parseInt(props.getProperty("indUnlit"));
        conditions[2] += unlitIND;
        int unlitTRN = Integer.parseInt(props.getProperty("trnUnlit"));
        conditions[2] += unlitTRN;
        int dvid = Integer.parseInt(props.getProperty("dvid"));
        conditions[2] += dvid;
        // REG 4
        int unlitSIG = Integer.parseInt(props.getProperty("sigUnlit"));
        conditions[3] += unlitSIG;
        int unlitSND = Integer.parseInt(props.getProperty("sndUnlit"));
        conditions[3] += unlitSND;
        int litNSA = Integer.parseInt(props.getProperty("nsaLit"));
        conditions[3] += litNSA;
        int bats = Integer.parseInt(props.getProperty("batteriesTotal"));
        conditions[3] += (bats % 2 == 0) ? 1 : 0;
        // REG 5
        int litBOB = Integer.parseInt(props.getProperty("bobLit"));
        conditions[4] += litBOB;
        int litCLR = Integer.parseInt(props.getProperty("clrLit"));
        conditions[4] += litCLR;
        int ps2 = Integer.parseInt(props.getProperty("ps2"));
        conditions[4] += ps2;
        int serial = Integer.parseInt(props.getProperty("serial"));
        conditions[4] += serial;
        // REG 6
        int litFRQ = Integer.parseInt(props.getProperty("frqLit"));
        conditions[5] += litFRQ;
        int litSIG = Integer.parseInt(props.getProperty("sigLit"));
        conditions[5] += litSIG;
        int litTRN = Integer.parseInt(props.getProperty("trnLit"));
        conditions[5] += litTRN;
        String sn1 = props.getProperty("sn1");
        String sn2 = props.getProperty("sn2");
        String sn3 = props.getProperty("sn3");
        String sn4 = props.getProperty("sn4");
        String sn5 = props.getProperty("sn5");
        String sn6 = props.getProperty("sn6");
        boolean snOdd = false;
        if (string.isDigit(sn1)) {
            int a = Integer.parseInt(sn1);
            if (a % 2 == 1) snOdd = true;
        } else if (string.isDigit(sn2)) {
            int a = Integer.parseInt(sn2);
            if (a % 2 == 1) snOdd = true;
        } else if (string.isDigit(sn3)) {
            int a = Integer.parseInt(sn3);
            if (a % 2 == 1) snOdd = true;
        } else if (string.isDigit(sn4)) {
            int a = Integer.parseInt(sn4);
            if (a % 2 == 1) snOdd = true;
        } else if (string.isDigit(sn5)) {
            int a = Integer.parseInt(sn5);
            if (a % 2 == 1) snOdd = true;
        } else if (string.isDigit(sn6)) {
            int a = Integer.parseInt(sn6);
            if (a % 2 == 1) snOdd = true;
        }
        conditions[5] += (snOdd) ? 1 : 0;
        // REG 7
        int unlitFRK = Integer.parseInt(props.getProperty("frkUnlit"));
        conditions[6] += unlitFRK;
        int litMSA = Integer.parseInt(props.getProperty("msaLit"));
        conditions[6] += litMSA;
        int parallel = Integer.parseInt(props.getProperty("parallel"));
        conditions[6] += parallel;
        String snVowel = props.getProperty("snVowel");
        conditions[6] += (snVowel.equals("t")) ? 1 : 0;
        // REG 8
        int unlitCLR = Integer.parseInt(props.getProperty("clrUnlit"));
        conditions[7] += unlitCLR;
        int unlitMSA = Integer.parseInt(props.getProperty("msaUnlit"));
        conditions[7] += unlitMSA;
        int litSND = Integer.parseInt(props.getProperty("sndLit"));
        conditions[7] += litSND;
        int stereoRCA = Integer.parseInt(props.getProperty("stereoRCA"));
        conditions[7] += stereoRCA;
        // Print condition values
        System.out.println("Region 1: " + conditions[0]);
        System.out.println("Region 2: " + conditions[1]);
        System.out.println("Region 3: " + conditions[2]);
        System.out.println("Region 4: " + conditions[3]);
        System.out.println("Region 5: " + conditions[4]);
        System.out.println("Region 6: " + conditions[5]);
        System.out.println("Region 7: " + conditions[6]);
        System.out.println("Region 8: " + conditions[7]);
        // Find highest value
        int highestVal = 0;
        for (int index = 1; index < conditions.length; index++) {
            if (conditions[index] > highestVal) highestVal = conditions[index];
        }
        System.out.println("Highest Value: " + highestVal);
        // Find which ones have the highest value
        for (int index = 0; index < conditions.length; index++) {
            if (conditions[index] == highestVal) {
                output[index] = true;
                System.out.println("Region " + (index + 1) + " is TRUE");
            }
            else System.out.println("Region " + (index + 1) + " is FALSE");
        }
        return output;
    }
}
