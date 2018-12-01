/**
 * Bases module, started work on 10/8/18 8:34 PM
 * 
 * Finished version 0.1 on 10/8/18 10:30 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.text.*;
import be.pcl.swing.*;

public class bases {
    static JFrame f;
    public static void module() {
        System.out.println("[BASES]");
        f = new JFrame("KAaNE [BASES]");
        ImageIcon icon = new ImageIcon("imgs/icons/bases.png");
        f.setIconImage(icon.getImage());
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0021");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0022");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // TBs
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        integerNumberInstance.setGroupingUsed(false);
        ImprovedFormattedTextField tb1 = new ImprovedFormattedTextField(integerNumberInstance,0);
        tb1.setBounds(10,10,100,20);
        ImprovedFormattedTextField tb2 = new ImprovedFormattedTextField(integerNumberInstance,0);
        tb2.setBounds(10,40,100,20);
        // CB
        String op[] = {"+","-","*","/"};
        JComboBox cb = new JComboBox(op);
        cb.setBounds(10,70,40,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(60,70,60,20);
        // Reset Button
        JButton reset = new JButton("RESET");
        reset.setBounds(120,10,80,20);
        // Output
        JLabel output = new JLabel("");
        output.setBounds(130,70,100,20);
        // Add everything
        f.add(tb1); f.add(tb2); f.add(button); f.add(output); f.add(reset); f.add(cb);
        // Define JFrame
        f.setLayout(null);
        f.setSize(240,140);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            int number1 = Integer.parseInt(tb1.getText());
            int number2 = Integer.parseInt(tb2.getText());
            String operator = (String) cb.getItemAt(cb.getSelectedIndex());
            // Grab bomb info
            // INDs
            int bob = Integer.parseInt(props.getProperty("bob"));
            int bobLit = Integer.parseInt(props.getProperty("bobLit"));
            int car = Integer.parseInt(props.getProperty("car"));
            int carLit = Integer.parseInt(props.getProperty("carLit"));
            int clr = Integer.parseInt(props.getProperty("clr"));
            int clrLit = Integer.parseInt(props.getProperty("clrLit"));
            int frk = Integer.parseInt(props.getProperty("frk"));
            int frkLit = Integer.parseInt(props.getProperty("frkLit"));
            int frq = Integer.parseInt(props.getProperty("frq"));
            int frqLit = Integer.parseInt(props.getProperty("frqLit"));
            int ind = Integer.parseInt(props.getProperty("ind"));
            int indLit = Integer.parseInt(props.getProperty("indLit"));
            int msa = Integer.parseInt(props.getProperty("msa"));
            int msaLit = Integer.parseInt(props.getProperty("msaLit"));
            int nsa = Integer.parseInt(props.getProperty("nsa"));
            int nsaLit = Integer.parseInt(props.getProperty("nsaLit"));
            int sig = Integer.parseInt(props.getProperty("sig"));
            int sigLit = Integer.parseInt(props.getProperty("sigLit"));
            int snd = Integer.parseInt(props.getProperty("snd"));
            int sndLit = Integer.parseInt(props.getProperty("sndLit"));
            int trn = Integer.parseInt(props.getProperty("trn"));
            int trnLit = Integer.parseInt(props.getProperty("trnLit"));
            // Determine unlit
            int bobUnlit = 0; int carUnlit = 0; int clrUnlit = 0;
            int frkUnlit = 0; int frqUnlit = 0; int indUnlit = 0;
            int msaUnlit = 0; int nsaUnlit = 0; int sigUnlit = 0;
            int sndUnlit = 0; int trnUnlit = 0;
            if (bobLit == 0 && bob == 1) bobUnlit = 1;
            if (carLit == 0 && car == 1) carUnlit = 1;
            if (clrLit == 0 && clr == 1) clrUnlit = 1;
            if (frkLit == 0 && frk == 1) frkUnlit = 1;
            if (frqLit == 0 && frq == 1) frqUnlit = 1;
            if (indLit == 0 && ind == 1) indUnlit = 1;
            if (msaLit == 0 && msa == 1) msaUnlit = 1;
            if (nsaLit == 0 && nsa == 1) nsaUnlit = 1;
            if (sigLit == 0 && sig == 1) sigUnlit = 1;
            if (sndLit == 0 && snd == 1) sndUnlit = 1;
            if (trnLit == 0 && trn == 1) trnUnlit = 1;
            // Add all lit and unlit
            int lit = bobLit + carLit + clrLit + frkLit + frqLit + indLit + msaLit + nsaLit + sigLit + sndLit + trnLit;
            int unlit = bobUnlit + carUnlit + clrUnlit + frkUnlit + frqUnlit + indUnlit + msaUnlit + nsaUnlit + sigUnlit + sndUnlit + trnUnlit;
            // SN
            String sn1 = props.getProperty("sn1");
            String sn2 = props.getProperty("sn2");
            String sn3 = props.getProperty("sn3");
            String sn4 = props.getProperty("sn4");
            String sn5 = props.getProperty("sn5");
            String sn6 = props.getProperty("sn6");
            // Determine last digit
            int lastDigit = 0;
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
            // Determine first digit
            int firstDigit = 0;
            if (sn1.equals("0") || sn1.equals("1") || sn1.equals("2") || sn1.equals("3") || sn1.equals("4") || sn1.equals("5") || sn1.equals("6") || sn1.equals("7") || sn1.equals("8") || sn1.equals("9")) {
                firstDigit = Integer.parseInt(sn1);
            } else if (sn2.equals("0") || sn2.equals("1") || sn2.equals("2") || sn2.equals("3") || sn2.equals("4") || sn2.equals("5") || sn2.equals("6") || sn2.equals("7") || sn2.equals("8") || sn2.equals("9")) {
                firstDigit = Integer.parseInt(sn2);
            } else if (sn3.equals("0") || sn3.equals("1") || sn3.equals("2") || sn3.equals("3") || sn3.equals("4") || sn3.equals("5") || sn3.equals("6") || sn3.equals("7") || sn3.equals("8") || sn3.equals("9")) {
                firstDigit = Integer.parseInt(sn3);
            } else if (sn4.equals("0") || sn4.equals("1") || sn4.equals("2") || sn4.equals("3") || sn4.equals("4") || sn4.equals("5") || sn4.equals("6") || sn4.equals("7") || sn4.equals("8") || sn4.equals("9")) {
                firstDigit = Integer.parseInt(sn4);
            } else if (sn5.equals("0") || sn5.equals("1") || sn5.equals("2") || sn5.equals("3") || sn5.equals("4") || sn5.equals("5") || sn5.equals("6") || sn5.equals("7") || sn5.equals("8") || sn5.equals("9")) {
                firstDigit = Integer.parseInt(sn5);
            } else if (sn6.equals("0") || sn6.equals("1") || sn6.equals("2") || sn6.equals("3") || sn6.equals("4") || sn6.equals("5") || sn6.equals("6") || sn6.equals("7") || sn6.equals("8") || sn6.equals("9")) {
                firstDigit = Integer.parseInt(sn6);
            }
            // Ports
            int dvid = Integer.parseInt(props.getProperty("dvid"));
            int serial = Integer.parseInt(props.getProperty("serial"));
            int plates = Integer.parseInt(props.getProperty("plates"));
            // Let the calculations begin
            // Calculate 1st base
            int base1 = lit + lastDigit; if (dvid == 1) base1 = base1 + 3;
            if (base1 != 10) base1 = base1 % 7 + 2;
            System.out.println(base1);
            // Convert to base 10 for proper calculation
            int cnv1 = Integer.parseInt(convert(Integer.toString(number1),base1,10));
            System.out.println(cnv1);
            // Calculate 2nd base
            int base2 = unlit + firstDigit; if (serial == 1) base2 = base2 + 6;
            if (base2 != 10) base2 = base2 % 7 + 2;
            System.out.println(base2);
            // Convert to base 10
            int cnv2 = Integer.parseInt(convert(Integer.toString(number2),base2,10));
            System.out.println(cnv2);
            // Calculate
            int ans = 0;
            switch (operator) {
                case "+": ans = cnv1 + cnv2; break;
                case "-": ans = cnv1 - cnv2; break;
                case "*": ans = cnv1 * cnv2; break;
                case "/": ans = cnv1 / cnv2; break;
            }
            System.out.println(ans);
            // Convert to another base
            int base3 = plates; if (ind == 1) base3 = base3 + 2;
            if (base3 != 10) base3 = base3 % 7 + 2;
            System.out.println(base3);
            int realAns = Integer.parseInt(convert(Integer.toString(ans),10,base3));
            if (realAns > 0) realAns = Math.abs(realAns);
            System.out.println(realAns);
            output.setText(Integer.toString(realAns));
        });
        reset.addActionListener((ActionEvent e) -> {
            tb1.setText(""); tb2.setText(""); output.setText("");
        });
    }
    // Convert Base code by bilal-hungund on Geeks for Geeks (yeah, I couldn't figure out THIS.)
    public static String convert(String number, int sBase, int dBase) 
    {
        // Parse the number with source radix  
        // and return in specified radix(base) 
        return Integer.toString(Integer.parseInt(number,sBase),dBase); 
    }
}
