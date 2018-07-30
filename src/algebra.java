/**
 * Algebra, started work on 7/20/2018 4:35 PM
 * 
 * Finished version 0.1 on 7/20/2018 8:09 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import org.jdesktop.swingx.autocomplete.*;

public class algebra {
    static JFrame f;
    static int x = 0;
    static int y = 0;
    static int z = 0;
    static Random rand = new Random();
    public static void module() {
        System.out.println("[ALGEBRA]");
        f = new JFrame("KAaNE [ALGEBRA]");
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0015");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0016");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // String arrays
        String aEquations[] = {"","a = 3z","a = 5 + y","a = 6 - x","a = 7x","a = 8y","a = 9 + z","a = x + 1","a = x/2","a = y - 2","a = y/4",
            "a = z - 7","a = z/10"};
        String bEquations[] = {"","b = (2x/10) - y","b = (7x)y","b = (x + y) - (z/2)","b = (y/2) - z","b = (z - y) / 2","b = (zy) - (2x)",
            "b = 2(z + 7)","b = 2z + 7","b = xy - (2 + x)","b = xyz"};
        int whatsThis = Integer.parseInt(props.getProperty("owo"));
        ArrayList<String> cEquations = new ArrayList<>();
        if (whatsThis == 1) {
            cEquations.add("");
            cEquations.add("(y/2) + 7 = 4c + z");
            cEquations.add("3x - ((2 + y)/10) = (z/4) - c");
            cEquations.add("8x - z = c - y");
            cEquations.add("9(y/2) = c - (xy/4)");
            cEquations.add("fun^10 x int^40 = ir2");
            cEquations.add("x(y/2) + 11 = (4 + c)/2y");
            cEquations.add("x - 2y = c - z");
            cEquations.add("xy = z + (c/10)");
            cEquations.add("(z/2) - (x/4) = 4c - z");
        } else {
            cEquations.add("");
            cEquations.add("(y/2) + 7 = 4c + z");
            cEquations.add("3x - ((2 + y)/10) = (z/4) - c");
            cEquations.add("8x - z = c - y");
            cEquations.add("9(y/2) = c - (xy/4)");
            cEquations.add("x(y/2) + 11 = (4 + c)/2y");
            cEquations.add("x - 2y = c - z");
            cEquations.add("xy = z + (c/10)");
            cEquations.add("(z/2) - (x/4) = 4c - z");
        }
        // CBs
        JComboBox aCB = new JComboBox(aEquations);
        aCB.setBounds(10,10,80,20);
        JComboBox bCB = new JComboBox(bEquations);
        bCB.setBounds(10,30,120,20);
        JComboBox cCB = new JComboBox(cEquations.toArray(new String[cEquations.size()]));
        cCB.setBounds(10,50,160,20);
        // CBs auto-completable
        AutoCompleteDecorator.decorate(aCB);
        AutoCompleteDecorator.decorate(bCB);
        AutoCompleteDecorator.decorate(cCB);
        // Buttons
        JButton aButton = new JButton("OK");
        aButton.setBounds(180,10,60,20);
        JButton bButton = new JButton("OK");
        bButton.setBounds(180,30,60,20);
        JButton cButton = new JButton("OK");
        cButton.setBounds(180,50,60,20);
        // Output labels
        JLabel aOutput = new JLabel("");
        aOutput.setBounds(240,10,50,20);
        JLabel bOutput = new JLabel("");
        bOutput.setBounds(240,30,50,20);
        JLabel cOutput = new JLabel("");
        cOutput.setBounds(240,50,50,20);
        // Add everything to JFrame
        f.add(aCB); f.add(bCB); f.add(cCB); f.add(aButton); f.add(bButton); f.add(cButton); f.add(aOutput); f.add(bOutput); f.add(cOutput);
        // Define the rest of the JFrame
        f.setLayout(null);
        f.setSize(350,120);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Determine x, y, and z before anything
        // X
        String sn1 = props.getProperty("sn1");
        String sn2 = props.getProperty("sn2");
        String sn3 = props.getProperty("sn3");
        String sn4 = props.getProperty("sn4");
        String sn5 = props.getProperty("sn5");
        String sn6 = props.getProperty("sn6");
        int sn1int = 0;
        int sn2int = 0;
        int sn3int = 0;
        int sn4int = 0;
        int sn5int = 0;
        int sn6int = 0;
        if (sn1.equals("0") || sn1.equals("1") || sn1.equals("2") || sn1.equals("3") || sn1.equals("4") || sn1.equals("5") || sn1.equals("6") || sn1.equals("7") || sn1.equals("8") || sn1.equals("9")) {
            sn1int = Integer.parseInt(sn1);
        } if (sn2.equals("0") || sn2.equals("1") || sn2.equals("2") || sn2.equals("3") || sn2.equals("4") || sn2.equals("5") || sn2.equals("6") || sn2.equals("7") || sn2.equals("8") || sn2.equals("9")) {
            sn2int = Integer.parseInt(sn2);
        } if (sn3.equals("0") || sn3.equals("1") || sn3.equals("2") || sn3.equals("3") || sn3.equals("4") || sn3.equals("5") || sn3.equals("6") || sn3.equals("7") || sn3.equals("8") || sn3.equals("9")) {
            sn3int = Integer.parseInt(sn3);
        } if (sn4.equals("0") || sn4.equals("1") || sn4.equals("2") || sn4.equals("3") || sn4.equals("4") || sn4.equals("5") || sn4.equals("6") || sn4.equals("7") || sn4.equals("8") || sn4.equals("9")) {
            sn4int = Integer.parseInt(sn4);
        } if (sn5.equals("0") || sn5.equals("1") || sn5.equals("2") || sn5.equals("3") || sn5.equals("4") || sn5.equals("5") || sn5.equals("6") || sn5.equals("7") || sn5.equals("8") || sn5.equals("9")) {
            sn5int = Integer.parseInt(sn5);
        } if (sn6.equals("0") || sn6.equals("1") || sn6.equals("2") || sn6.equals("3") || sn6.equals("4") || sn6.equals("5") || sn6.equals("6") || sn6.equals("7") || sn6.equals("8") || sn6.equals("9")) {
            sn6int = Integer.parseInt(sn6);
        }
        int snDigitsSum = sn1int + sn2int + sn3int + sn4int + sn5int + sn6int;
        x = snDigitsSum;
        int bh = Integer.parseInt(props.getProperty("batteryHolders"));
        if (bh > 2) {
            x = x + 2;
        }
        int rj45 = Integer.parseInt(props.getProperty("rj45"));
        if (rj45 == 1) {
            x = x - 1;
        }
        int bob = Integer.parseInt(props.getProperty("bob"));
        if (bob == 1) {
            x = x + 4;
        }
        if (sn1.equals("A") || sn2.equals("A") || sn3.equals("A") || sn4.equals("A") || sn5.equals("A") || sn6.equals("A") 
            || sn1.equals("E") || sn2.equals("E") || sn3.equals("E") || sn4.equals("E") || sn5.equals("E") || sn6.equals("E") 
            || sn1.equals("I") || sn2.equals("I") || sn3.equals("I") || sn4.equals("I") || sn5.equals("I") || sn6.equals("I") 
            || sn1.equals("O") || sn2.equals("O") || sn3.equals("O") || sn4.equals("O") || sn5.equals("O") || sn6.equals("O") 
            || sn1.equals("U") || sn2.equals("U") || sn3.equals("U") || sn4.equals("U") || sn5.equals("U") || sn6.equals("U")) {
            x = x - 3;
        }
        // Y
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
        int indicators = bob + car + clr + frk + frq + ind + msa + nsa + sig + snd + trn;
        int dvidQuantity = Integer.parseInt(props.getProperty("dvidQuantity"));
        int parallelQuantity = Integer.parseInt(props.getProperty("parallelQuantity"));
        int ps2Quantity = Integer.parseInt(props.getProperty("ps2Quantity"));
        int rj45Quantity = Integer.parseInt(props.getProperty("rj45Quantity"));
        int serialQuantity = Integer.parseInt(props.getProperty("serialQuantity"));
        int stereoRCAQuantity = Integer.parseInt(props.getProperty("stereoRCAQuantity"));
        int ports = dvidQuantity + parallelQuantity + ps2Quantity + rj45Quantity + serialQuantity + stereoRCAQuantity;
        y = indicators - ports;
        if (bh < 3) {
            y = y - 2;
        }
        if (serialQuantity > 0) {
            y = y + 3;
        }
        int frqLit = Integer.parseInt(props.getProperty("frqLit"));
        if (frq == 1 && frqLit == 0) {
            y = y - 5;
        }
        if (algebra.isPrime(snDigitsSum) == true) {
            y = y + 4;
        }
        // Z
        int modules = Integer.parseInt(props.getProperty("modules"));
        int AAbats = Integer.parseInt(props.getProperty("modules"));
        int Dbats = Integer.parseInt(props.getProperty("modules"));
        z = modules + AAbats + Dbats;
        if (bh == 0) {
            z = z + 3;
        }
        if (parallelQuantity > 0) {
            z = z - 6;
        }
        int msaLit = Integer.parseInt(props.getProperty("msaLit"));
        if (msaLit == 1) {
            z = z + 2;
        }
        if ((snDigitsSum % 3) == 0) {
            z = z + 1;
        }
        aButton.addActionListener((ActionEvent e) -> {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);
            String aEquation = (String) aCB.getItemAt(aCB.getSelectedIndex());
            int a = 0;
            switch (aEquation) {
                case "a = 3z":
                    a = 3 * z;
                    break;
                case "a = 5 + y":
                    a = 5 + y;
                    break;
                case "a = 6 - x":
                    a = 6 - x;
                    break;
                case "a = 7x":
                    a = 7 * x;
                    break;
                case "a = 8y":
                    a = 8 * y;
                    break;
                case "a = 9 + z":
                    a = 9 + z;
                    break;
                case "a = x + 1":
                    a = x + 1;
                    break;
                case "a = x/2":
                    a = x / 2;
                    break;
                case "a = y - 2":
                    a = y - 2;
                    break;
                case "a = y/4":
                    a = y / 4;
                    break;
                case "a = z - 7":
                    a = z - 7;
                    break;
                case "a = z/10":
                    a = z / 10;
                    break;
                default:
                    break;
            }
            System.out.println("a - " + a);
            aOutput.setText(Integer.toString(a));
        });
        bButton.addActionListener((ActionEvent e) -> {
            String bEquation = (String) bCB.getItemAt(bCB.getSelectedIndex());
            int b = 0;
            switch (bEquation) {
                case "b = (2x/10)":
                    b = (2 * x) / 10;
                    break;
                case "b = (7x)y":
                    b = (7 * x) * y;
                    break;
                case "b = (x + y) - (z/2)":
                    b = (x + y) - (z/2);
                    break;
                case "b = (y/2) - z":
                    b = (y / 2) - z;
                    break;
                case "b = (z - y) / 2":
                    b = (z - y) / 2;
                    break;
                case "b = (zy) - (2x)":
                    b = (z * y) - (2 * x);
                    break;
                case "b = 2(z + 7)":
                    b = 2 * (z + 7);
                    break;
                case "b = 2z + 7":
                    b = (2 * z) + 7;
                    break;
                case "b = xy - (2 + x)":
                    b = (x * y) - (2 + x);
                    break;
                case "b = xyz":
                    b = x * y * z;
                    break;
                default:
                    break;
            }
            System.out.println("b - " + b);
            bOutput.setText(Integer.toString(b));
        });
        cButton.addActionListener((ActionEvent e) -> {
            String cEquation = (String) cCB.getItemAt(cCB.getSelectedIndex());
            int c = 0;
            switch (cEquation) {
                case "(y/2) + 7 = 4c + z":
                    c = ((y / 2 + 7) - z) / 4;
                    break;
                case "3x - ((2 + y)/10) = (z/4) - c":
                    c = (2 + y) / 10 - (x * 3) + (z / 4);
                    break;
                case "8x - z = c - y":
                    c = (x * 8) - z + y;
                    break;
                case "9(y/2) = c - (xy/4)":
                    c = 9 * (y / 2) + (x * y) / 4;
                    break;
                case "x(y/2) + 11 = (4 + c)/2y":
                    c = (x * (y / 2) + 11) * (y * 2) - 4;
                    break;
                case "x - 2y = c - z":
                    c = x - (2 * y) + z;
                    break;
                case "xy = z + (c/10)":
                    c = ((x * y) - z) * 10;
                    break;
                case "(z/2) - (x/4) = 4c - z":
                    c = ((z / 2) - (x / 4) + z) / 4;
                    break;
                case "fun^10 x int^40 = ir2":
                    System.out.println("ERROR OCCURED! UNKNOWN EQUATION!");
                    c = rand.nextInt(2147483647) + 1;
                    break;
                default:
                    break;
            }
            System.out.println("c - " + c);
            cOutput.setText(Integer.toString(c));
        });
    }
    // isPrime code not made by me, i just found it on google.
    static public boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
