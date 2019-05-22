/**
 * The Alchemy module, Started work on 02/11/19 10:21 PM
 * 
 * Finished version 0.1 on 2/17/2019 7:40 PM
 * 
 * Version 0.1
 * 
 * Note: The module is broken, but not because KAaNE is. The coder is waiting for the "owner"
 * to make it open-source so he can fix it.
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class alchemy {
    static JFrame f;
    public static void module() {
        System.out.println("[ALCHEMY]");
        f = new JFrame("KAaNE [ALCHEMY]");
        ImageIcon icon = new ImageIcon("imgs/icons/Alchemy.png");
        f.setIconImage(icon.getImage());
        // Image Icons
        ImageIcon creationIcon = new ImageIcon("imgs/alchemy/Creation.png");
        ImageIcon fireIcon = new ImageIcon("imgs/alchemy/Fire.png");
        ImageIcon hevaIcon = new ImageIcon("imgs/alchemy/Heva.png");
        ImageIcon metaIcon = new ImageIcon("imgs/alchemy/Meta.png");
        ImageIcon strucotaIcon = new ImageIcon("imgs/alchemy/Strucota.png");
        ImageIcon teraIcon = new ImageIcon("imgs/alchemy/Tera.png");
        // Hash Map
        Map<Object, Icon> icons = new HashMap<>();
        icons.put("CREATION",creationIcon);
        icons.put("FIRE",fireIcon);
        icons.put("HEVA",hevaIcon);
        icons.put("META",metaIcon);
        icons.put("STRUCOTA",strucotaIcon);
        icons.put("TERA",teraIcon);
        // CBs
        String syms[] = {"CREATION","FIRE","HEVA","META","STRUCOTA","TERA"};
        JComboBox symTLCB = new JComboBox(syms);
        symTLCB.setRenderer(new IconListRenderer(icons));
        symTLCB.setBounds(60,10,150,55);
        JComboBox symTRCB = new JComboBox(syms);
        symTRCB.setRenderer(new IconListRenderer(icons));
        symTRCB.setBounds(260,10,150,55);
        JComboBox symMLCB = new JComboBox(syms);
        symMLCB.setRenderer(new IconListRenderer(icons));
        symMLCB.setBounds(10,70,150,55);
        JComboBox symMRCB = new JComboBox(syms);
        symMRCB.setRenderer(new IconListRenderer(icons));
        symMRCB.setBounds(310,70,150,55);
        JComboBox symBLCB = new JComboBox(syms);
        symBLCB.setRenderer(new IconListRenderer(icons));
        symBLCB.setBounds(60,130,150,55);
        JComboBox symBRCB = new JComboBox(syms);
        symBRCB.setRenderer(new IconListRenderer(icons));
        symBRCB.setBounds(260,130,150,55);
        JComboBox symMidCB = new JComboBox(syms);
        symMidCB.setRenderer(new IconListRenderer(icons));
        symMidCB.setBounds(160,70,150,55);
        // Button
        JButton submit = new JButton("SUBMIT");
        submit.setBounds(195,200,80,20);
        // Label
        JLabel output = new JLabel("");
        output.setBounds(10,230,400,20);
        // Add everything
        f.add(symTLCB); f.add(symTRCB);
        f.add(symMLCB); f.add(symMRCB);
        f.add(symBLCB); f.add(symBRCB);
        f.add(symMidCB);
        f.add(submit); f.add(output);
        // Define JFrame
        f.setLayout(null);
        f.setSize(475,400);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        submit.addActionListener((ActionEvent e) -> {
            // convert cb's to strings
            String symTL = (String) symTLCB.getItemAt(symTLCB.getSelectedIndex());
            String symTR = (String) symTRCB.getItemAt(symTRCB.getSelectedIndex());
            String symML = (String) symMLCB.getItemAt(symMLCB.getSelectedIndex());
            String symMR = (String) symMRCB.getItemAt(symMRCB.getSelectedIndex());
            String symBL = (String) symBLCB.getItemAt(symBLCB.getSelectedIndex());
            String symBR = (String) symBRCB.getItemAt(symBRCB.getSelectedIndex());
            String symMid = (String) symMidCB.getItemAt(symMidCB.getSelectedIndex());
            // check for perfect
            boolean perfCheck = perfCheck(symTL,symTR,symML,symMR,symBL,symBR);
            if (perfCheck == false) {
                System.out.println("Circle is imperfect");
                // imperfect
                if (symTL.equals("HEVA")) output.setText("MIND, RE-DRAW");
                else if (symBR.equals("CREATION")) output.setText("LIFE, RE-DRAW");
                else if (symTR.equals("TERA") || symMR.equals("TERA") || symBR.equals("TERA")) output.setText("ENERGY, RE-DRAW");
                else if (symTL.equals("STRUCOTA") || symML.equals("STRUCOTA") || symBL.equals("STRUCOTA")) output.setText("MATTER, RE-DRAW");
                else if (symBL.equals("FIRE")) output.setText("FLAMES, RE-DRAW");
                else output.setText("RE-DRAW");
            }
            // shoutouts to kingslendy for using goto and getting killed by velociraptors
            // also, shoutouts to java for being a cunt and not adding goto to it
            // thanks guys, really makes my job easier
            else {
                String presses = stepStart(symMid);
                System.out.println(presses);
                output.setText(presses);
            }
        });
    }
    public static String stepStart(String mid) {
        String output = "";
        // step 2
        switch (mid) {
            case "FIRE": output = step4(mid); break;
            case "META": output = step3(mid); break;
            case "STRUCOTA": output = step6(mid); break;
            case "HEVA": output = step5(mid); break;
            case "CREATION": output = "Submit, Final: LIFE"; break;
            default: output = "FIRE, " + step4(mid); break;
        }
        return output;
    }
    public static String step3(String mid) {
        String output = "HEVA, " + step6(mid);
        return output;
    }
    public static String step4(String mid) {
        String output = "";
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0031");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0032");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        int trnLit = Integer.parseInt(props.getProperty("trnLit"));
        if (trnLit == 1) output = "ENERGY, re-draw, " + step7(mid);
        else output = step5(mid);
        return output;
    }
    public static String step5(String mid) {
        String output = "";
        switch (mid) {
            case "TERA": output = "ENERGY, re-draw, " + step11(mid); break;
            case "CREATION": output = "FIRE, " + step8(mid); break;
            case "FIRE": output = "LIFE, STRUCOTA, " + step10(mid); break;
            default: output = "re-draw, " + step6(mid); break;
        }
        return output;
    }
    public static String step6(String mid) {
        String output = "";
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0031");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0032");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        int sndLit = Integer.parseInt(props.getProperty("sndLit"));
        if (sndLit == 1) output = "LIFE, re-draw, " + step9(mid);
        else output = step11(mid);
        return output;
    }
    public static String step7(String mid) {
        String output = "TERA, submit, Final: MIND";
        return output;
    }
    public static String step8(String mid) {
        String output = "CREATION, submit, Final: LIFE";
        return output;
    }
    public static String step9(String mid) {
        String output = "TERA, submit, Final: MATTER";
        return output;
    }
    public static String step10(String mid) {
        String output = "CREATION, submit, Final: FLAMES";
        return output;
    }
    public static String step11(String mid) {
        String output = "HEVA, submit, Final: ENERGY";
        return output;
    }
    public static boolean perfCheck(String tl, String tr, String ml, String mr, String bl, String br) {
        boolean output = true;
        // creation directly across tera
        if (tl.equals("CREATION") && br.equals("TERA") ||
            tr.equals("CREATION") && bl.equals("TERA") || 
            mr.equals("CREATION") && ml.equals("TERA") ||
            br.equals("CREATION") && tl.equals("TERA") ||
            bl.equals("CREATION") && tr.equals("TERA") ||
            ml.equals("CREATION") && mr.equals("TERA")) {
            output = false;
        }
        // heva adjacent to meta
        if (tl.equals("HEVA") && (tr.equals("META") || ml.equals("META")) ||
            tr.equals("HEVA") && (tl.equals("META") || mr.equals("META")) ||
            mr.equals("HEVA") && (tr.equals("META") || br.equals("META")) ||
            br.equals("HEVA") && (mr.equals("META") || bl.equals("META")) ||
            bl.equals("HEVA") && (ml.equals("META") || br.equals("META")) ||
            ml.equals("HEVA") && (tl.equals("META") || bl.equals("META"))) {
           output = false;
        }
        // fire in left most + last digit of SN = even
        if (tl.equals("FIRE") || ml.equals("FIRE") || bl.equals("FIRE")) {
            int lastdigitsn = lastdigitsn();
            if (lastdigitsn % 2 == 0) output = false;
        }
        return output;
    }
    public static int lastdigitsn() {
        int output = 0;
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0031");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0032");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        String sn1 = props.getProperty("sn1");
        String sn2 = props.getProperty("sn2");
        String sn3 = props.getProperty("sn3");
        String sn4 = props.getProperty("sn4");
        String sn5 = props.getProperty("sn5");
        String sn6 = props.getProperty("sn6");
        if (isInteger(sn6)) output = Integer.parseInt(sn6);
        else if (isInteger(sn5)) output = Integer.parseInt(sn5);
        else if (isInteger(sn4)) output = Integer.parseInt(sn4);
        else if (isInteger(sn3)) output = Integer.parseInt(sn3);
        else if (isInteger(sn2)) output = Integer.parseInt(sn2);
        else if (isInteger(sn1)) output = Integer.parseInt(sn1);
        return output;
    }
    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }
    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }
}
