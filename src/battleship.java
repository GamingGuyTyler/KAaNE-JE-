/**
 * Battleship module, started work on 10/17/18 4:30 PM
 * 
 * Finished version 0.1 on 7:49 PM
 * 
 * Version 0.1
 */

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class battleship {
    static JFrame f;
    public static void module() {
        System.out.println("[BATTLESHIP]");
        f = new JFrame("KAaNE [BATTLESHIP]");
        ImageIcon icon = new ImageIcon("imgs/icons/battleship.png");
        f.setIconImage(icon.getImage());
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0023");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0024");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // Determine the # of digits in SN
        String sn1 = props.getProperty("sn1");
        String sn2 = props.getProperty("sn2");
        String sn3 = props.getProperty("sn3");
        String sn4 = props.getProperty("sn4");
        String sn5 = props.getProperty("sn5");
        String sn6 = props.getProperty("sn6");
        int snCheck = 0;
        if (string.isDigit(sn1)) snCheck++;
        if (string.isDigit(sn2)) snCheck++;
        if (string.isDigit(sn3)) snCheck++;
        if (string.isDigit(sn4)) snCheck++;
        if (string.isDigit(sn5)) snCheck++;
        if (string.isDigit(sn6)) snCheck++;
        // Determine # of letter and digit combo
        int sfLocSN = 0;
        if (snCheck != 4 || snCheck != 5 || snCheck != 6) sfLocSN = snCheck;
        if (snCheck == 4) sfLocSN = 2;
        if (snCheck == 5) sfLocSN = 1;
        // Translate SNs to A-E or 1-5
        String sl1 = "EMP";
        String sl2 = "EMP";
        String sl3 = "EMP";
        int sd1 = 0;
        int sd2 = 0;
        int sd3 = 0;
        if (sfLocSN != 0) {
            // Determine first digit
            if (string.isDigit(sn1)) sd1 = convertInt(sn1);
            else if (string.isDigit(sn2)) sd1 = convertInt(sn2);
            else if (string.isDigit(sn3)) sd1 = convertInt(sn3);
            else if (string.isDigit(sn4)) sd1 = convertInt(sn4);
            else if (string.isDigit(sn5)) sd1 = convertInt(sn5);
            else if (string.isDigit(sn6)) sd1 = convertInt(sn6);
            // Determine first letter
            if (!string.isDigit(sn1)) sl1 = convertStr(sn1);
            else if (!string.isDigit(sn2)) sl1 = convertStr(sn2);
            else if (!string.isDigit(sn3)) sl1 = convertStr(sn3);
            else if (!string.isDigit(sn4)) sl1 = convertStr(sn4);
            else if (!string.isDigit(sn5)) sl1 = convertStr(sn5);
            else if (!string.isDigit(sn6)) sl1 = convertStr(sn6);
            if (sfLocSN > 1) {
                // Determine second digit
                int check = 0;
                if (string.isDigit(sn1)) {
                    check++;
                } if (string.isDigit(sn2)) {
                    if (check != 1) check++; 
                    else {check++; sd2 = convertInt(sn2);}
                } if (string.isDigit(sn3)) {
                    if (check != 1) check++; 
                    else {check++; sd2 = convertInt(sn3);}
                } if (string.isDigit(sn4)) {
                    if (check != 1) check++; 
                    else {check++; sd2 = convertInt(sn4);}
                } if (string.isDigit(sn5)) {
                    if (check != 1) check++; 
                    else {check++; sd2 = convertInt(sn5);}
                } if (string.isDigit(sn6)) {
                    if (check != 1) check++; 
                    else {check++; sd2 = convertInt(sn6);}
                }
                // Determine second letter
                check = 0;
                if (!string.isDigit(sn1)) {
                    check++;
                } if (!string.isDigit(sn2)) {
                    if (check != 1) check++; 
                    else {check++; sl2 = convertStr(sn2);}
                } if (!string.isDigit(sn3)) {
                    if (check != 1) check++; 
                    else {check++; sl2 = convertStr(sn3);}
                } if (!string.isDigit(sn4)) {
                    if (check != 1) check++; 
                    else {check++; sl2 = convertStr(sn4);}
                } if (!string.isDigit(sn5)) {
                    if (check != 1) check++; 
                    else {check++; sl2 = convertStr(sn5);}
                } if (!string.isDigit(sn6)) {
                    if (check != 1) check++; 
                    else {check++; sl2 = convertStr(sn6);}
                }
            }
            if (sfLocSN == 3) {
                // Determine third digit
                int check = 0;
                if (string.isDigit(sn1)) {
                    check++;
                } if (string.isDigit(sn2)) {
                    check++;
                } if (string.isDigit(sn3)) {
                    if (check != 2) check++; 
                    else {check++; sd3 = convertInt(sn3);}
                } if (string.isDigit(sn4)) {
                    if (check != 2) check++; 
                    else {check++; sd3 = convertInt(sn4);}
                } if (string.isDigit(sn5)) {
                    if (check != 2) check++;
                    else {check++; sd3 = convertInt(sn5);}
                } if (string.isDigit(sn6)) {
                    if (check != 2) check++;
                    else {check++; sd3 = convertInt(sn6);}
                }
                // Determine third letter
                check = 0;
                if (!string.isDigit(sn1)) {
                    check++;
                } if (!string.isDigit(sn2)) {
                    check++;
                } if (!string.isDigit(sn3)) {
                    if (check != 2) check++;
                    else {check++; sl3 = convertStr(sn3);}
                } if (!string.isDigit(sn4)) {
                    if (check != 2) check++; 
                    else {check++; sl3 = convertStr(sn4);}
                } if (!string.isDigit(sn5)) {
                    if (check != 2) check++; 
                    else {check++; sl3 = convertStr(sn5);}
                } if (!string.isDigit(sn6)) {
                    if (check != 2) check++; 
                    else {check++; sl3 = convertStr(sn6);}
                }
            }
        }
        // Get the # of ports, indicators and batteries
        int dvid = Integer.parseInt(props.getProperty("dvidQuantity"));
        int parallel = Integer.parseInt(props.getProperty("parallelQuantity"));
        int ps2 = Integer.parseInt(props.getProperty("ps2Quantity"));
        int rj45 = Integer.parseInt(props.getProperty("rj45Quantity"));
        int serial = Integer.parseInt(props.getProperty("serialQuantity"));
        int stereoRCA = Integer.parseInt(props.getProperty("stereoRCAQuantity"));
        int totalPort = dvid + parallel + ps2 + rj45 + serial + stereoRCA;
        int bob = Integer.parseInt(props.getProperty("bob"));
        int car = Integer.parseInt(props.getProperty("car"));
        int clr = Integer.parseInt(props.getProperty("clr"));
        int frk = Integer.parseInt(props.getProperty("frk"));
        int frq = Integer.parseInt(props.getProperty("frq"));
        int ind = Integer.parseInt(props.getProperty("ind"));
        int msa = Integer.parseInt(props.getProperty("msa"));
        int nsa = Integer.parseInt(props.getProperty("nsa"));
        int sig = Integer.parseInt(props.getProperty("sig"));
        int snd = Integer.parseInt(props.getProperty("snd"));
        int trn = Integer.parseInt(props.getProperty("trn"));
        int totalInd = bob + car + clr + frk + frq + ind + msa + nsa + sig + snd + trn;
        int totalBat = Integer.parseInt(props.getProperty("batteriesTotal"));
        // Convert to A-E/1-5
        String port = convertStr(totalPort);
        String sl4 = "EMP";
        int sd4 = 0;
        if (sfLocSN == 0) {sl1 = port;sd1 = convertInt(totalInd + totalBat);}
        if (sfLocSN == 1) {sl2 = port;sd2 = convertInt(totalInd + totalBat);}
        if (sfLocSN == 2) {sl3 = port;sd3 = convertInt(totalInd + totalBat);}
        if (sfLocSN == 3) {sl4 = port;sd4 = convertInt(totalInd + totalBat);}
        // Output results
        System.out.println(sl1 + sd1);
        if (sd2 != 0) System.out.println(sl2 + sd2);
        if (sd3 != 0) System.out.println(sl3 + sd3);
        if (sd4 != 0) System.out.println(sl4 + sd4);
        // Make a grid image
        ImageIcon gridImg = new ImageIcon("imgs/battleship/grid.png");
        JLabel grid = new JLabel(gridImg);
        grid.setBounds(10,10,310,310);
        // Mark safe locations
        ImageIcon markImg = new ImageIcon("imgs/battleship/marker.png");
        JLabel mark = new JLabel(markImg);
        JLabel mark2 = new JLabel(markImg);
        JLabel mark3 = new JLabel(markImg);
        JLabel mark4 = new JLabel(markImg);
        mark.setBounds(determineX(sl1),determineY(sd1),50,50);
        mark2.setBounds(determineX(sl2),determineY(sd2),50,50);
        mark3.setBounds(determineX(sl3),determineY(sd3),50,50);
        mark4.setBounds(determineX(sl4),determineY(sd4),50,50);
        // Add
        f.add(grid); f.add(mark); f.add(mark2); f.add(mark3); f.add(mark4);
        // Define JFrame
        f.setLayout(null);
        f.setSize(340,360);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }
    public static int convertInt(String a) {
        int b = Integer.parseInt(a);
        for(int c = 0; b >= 5; c++) {
            b = b - 5;
        }
        if (b == 0) b = 5;
        return b;
    }
    public static int convertInt(int a) {
        for(int b = 0; a >= 5; b++) {
            a = a - 5;
        }
        if (a == 0) a = 5;
        return a;
    }
    public static String convertStr(String a) {
        if (a.equals("F") || a.equals("K") || a.equals("P") || a.equals("U") || a.equals("Z")) a = "A";
        if (a.equals("G") || a.equals("L") || a.equals("Q") || a.equals("V")) a = "B";
        if (a.equals("H") || a.equals("M") || a.equals("R") || a.equals("W")) a = "C";
        if (a.equals("I") || a.equals("N") || a.equals("S") || a.equals("X")) a = "D";
        if (a.equals("J") || a.equals("O") || a.equals("T") || a.equals("Y")) a = "E";
        return a;
    }
    public static String convertStr(int a) {
        String b = "";
        a = convertInt(a);
        if (a == 1) b = "A";
        if (a == 2) b = "B";
        if (a == 3) b = "C";
        if (a == 4) b = "D";
        if (a == 5) b = "E";
        return b;
    }
    public static int determineX(String a) {
        int b = 0;
        if (a.equals("A")) b = 20;
        if (a.equals("B")) b = 80;
        if (a.equals("C")) b = 140;
        if (a.equals("D")) b = 200;
        if (a.equals("E")) b = 260;
        if (a.equals("EMP")) b = 500;
        return b;
    }
    public static int determineY(int a) {
        if (a == 1) a = 20;
        if (a == 2) a = 80;
        if (a == 3) a = 140;
        if (a == 4) a = 200;
        if (a == 5) a = 260;
        if (a == 0) a = 500;
        return a;
    }
}
