/**
 * 3D Maze module, started work on 7/22/2018 9:32 AM
 * 
 * Finished version 0.1 on 7/29/2018 5:30 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class maze3D {
    static JFrame f;
    // Add all this during initialization because java doesn't like it
    // if I don't
    static ImageIcon abcIcon = new ImageIcon("imgs/mazes3D/abc.png");
    static ImageIcon abdIcon = new ImageIcon("imgs/mazes3D/abd.png");
    static ImageIcon abhIcon = new ImageIcon("imgs/mazes3D/abh.png");
    static ImageIcon acdIcon = new ImageIcon("imgs/mazes3D/acd.png");
    static ImageIcon achIcon = new ImageIcon("imgs/mazes3D/ach.png");
    static ImageIcon adhIcon = new ImageIcon("imgs/mazes3D/adh.png");
    static ImageIcon bcdIcon = new ImageIcon("imgs/mazes3D/bcd.png");
    static ImageIcon bchIcon = new ImageIcon("imgs/mazes3D/bch.png");
    static ImageIcon bdhIcon = new ImageIcon("imgs/mazes3D/bdh.png");
    static ImageIcon cdhIcon = new ImageIcon("imgs/mazes3D/cdh.png");
    static ImageIcon abcIcon2 = new ImageIcon("imgs/mazes3D/abc.png");
    static ImageIcon abdIcon2 = new ImageIcon("imgs/mazes3D/abd.png");
    static ImageIcon abhIcon2 = new ImageIcon("imgs/mazes3D/abh.png");
    static ImageIcon acdIcon2 = new ImageIcon("imgs/mazes3D/acd.png");
    static ImageIcon achIcon2 = new ImageIcon("imgs/mazes3D/ach.png");
    static ImageIcon adhIcon2 = new ImageIcon("imgs/mazes3D/adh.png");
    static ImageIcon bcdIcon2 = new ImageIcon("imgs/mazes3D/bcd.png");
    static ImageIcon bchIcon2 = new ImageIcon("imgs/mazes3D/bch.png");
    static ImageIcon bdhIcon2 = new ImageIcon("imgs/mazes3D/bdh.png");
    static ImageIcon cdhIcon2 = new ImageIcon("imgs/mazes3D/cdh.png");
    static Image abcImg = abcIcon.getImage();
    static Image abdImg = abdIcon.getImage();
    static Image abhImg = abhIcon.getImage();
    static Image acdImg = acdIcon.getImage();
    static Image achImg = achIcon.getImage();
    static Image adhImg = adhIcon.getImage();
    static Image bcdImg = bcdIcon.getImage();
    static Image bchImg = bchIcon.getImage();
    static Image bdhImg = bdhIcon.getImage();
    static Image cdhImg = cdhIcon.getImage();
    static int w = 0;
    static int h = 0;
    static int row = 0;
    static int column = 0;
    static int x = 0;
    static int y = 0;
    static JLayeredPane e;
    public static void module() {
        System.out.println("KAaNE [3D MAZE]");
        f = new JFrame("[3D MAZE]");
        // Get the config props
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
        // Maze CB
        Map<Object, Icon> icons = new HashMap<>();
        w = 50;
        h = 56;
        abcImg = abcImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        abdImg = abdImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        abhImg = abhImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        acdImg = acdImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        achImg = achImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        adhImg = adhImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        bcdImg = bcdImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        bchImg = bchImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        bdhImg = bdhImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        cdhImg = cdhImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        abcIcon = new ImageIcon(abcImg);
        abdIcon = new ImageIcon(abdImg);
        abhIcon = new ImageIcon(abhImg);
        acdIcon = new ImageIcon(acdImg);
        achIcon = new ImageIcon(achImg);
        adhIcon = new ImageIcon(adhImg);
        bcdIcon = new ImageIcon(bcdImg);
        bchIcon = new ImageIcon(bchImg);
        bdhIcon = new ImageIcon(bdhImg);
        cdhIcon = new ImageIcon(cdhImg);
        icons.put("ABC",abcIcon);
        icons.put("ABD",abdIcon);
        icons.put("ABH",abhIcon);
        icons.put("ACD",acdIcon);
        icons.put("ACH",achIcon);
        icons.put("ADH",adhIcon);
        icons.put("BCD",bcdIcon);
        icons.put("BCH",bchIcon);
        icons.put("BDH",bdhIcon);
        icons.put("CDH",cdhIcon);
        JComboBox<String> mazesCB = new JComboBox(new Object[] {"ABC","ABD","ABH","ACD","ACH","ADH","BCD","BCH","BDH","CDH"});
	mazesCB.setRenderer(new IconListRenderer(icons));
	mazesCB.setBounds(10,10,110,56);
        // Direction CB
        String directions[] = {"N","S","W","E"};
        JComboBox<String> dirCB = new JComboBox(directions);
        dirCB.setBounds(130,10,50,20);
        // Output images
        JLabel outputMaze = new JLabel();
        outputMaze.setBounds(10,70,300,336);
        ImageIcon indc = new ImageIcon("imgs/mazes3D/indicator.png");
        JLabel outputInd = new JLabel(indc);
        outputInd.setBounds(51,147,21,23);
        outputInd.setVisible(false);
        ImageIcon horLine = new ImageIcon("imgs/mazes3D/horizontal-line2.png");
        ImageIcon verLine = new ImageIcon("imgs/mazes3D/vertical-line2.png");
        JLabel outputLine = new JLabel();
        outputLine.setVisible(false);
        // Layered Pane
        e = new JLayeredPane();
        e.setBounds(0,0,350,450);
        // Add everything
        e.add(mazesCB, new Integer(0)); e.add(outputMaze, new Integer(0)); e.add(outputInd, new Integer(1)); e.add(dirCB, new Integer(0)); e.add(outputLine, new Integer(2)); f.setContentPane(e);
        // Define JFrame
        f.setLayout(null);
        f.setSize(350,450);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Calculate coords
        String sn1 = props.getProperty("sn1");
        String sn2 = props.getProperty("sn2");
        String sn3 = props.getProperty("sn3");
        String sn4 = props.getProperty("sn4");
        String sn5 = props.getProperty("sn5");
        String sn6 = props.getProperty("sn6");
        String lastDigitSng = "0";
        // Last digit checker
        if (sn6.equals("0") || sn6.equals("1") || sn6.equals("2") || sn6.equals("3") || sn6.equals("4") || sn6.equals("5") || sn6.equals("6") || sn6.equals("7") || sn6.equals("8") || sn6.equals("9")) {
            lastDigitSng = sn6;
        } else if (sn5.equals("0") || sn5.equals("1") || sn5.equals("2") || sn5.equals("3") || sn5.equals("4") || sn5.equals("5") || sn5.equals("6") || sn5.equals("7") || sn5.equals("8") || sn5.equals("9")) {
            lastDigitSng = sn5;
        } else if (sn4.equals("0") || sn4.equals("1") || sn4.equals("2") || sn4.equals("3") || sn4.equals("4") || sn4.equals("5") || sn4.equals("6") || sn4.equals("7") || sn4.equals("8") || sn4.equals("9")) {
            lastDigitSng = sn4;
        } else if (sn3.equals("0") || sn3.equals("1") || sn3.equals("2") || sn3.equals("3") || sn3.equals("4") || sn3.equals("5") || sn3.equals("6") || sn3.equals("7") || sn3.equals("8") || sn3.equals("9")) {
            lastDigitSng = sn3;
        } else if (sn2.equals("0") || sn2.equals("1") || sn2.equals("2") || sn2.equals("3") || sn2.equals("4") || sn2.equals("5") || sn2.equals("6") || sn2.equals("7") || sn2.equals("8") || sn2.equals("9")) {
            lastDigitSng = sn2;
        } else if (sn1.equals("0") || sn1.equals("1") || sn1.equals("2") || sn1.equals("3") || sn1.equals("4") || sn1.equals("5") || sn1.equals("6") || sn1.equals("7") || sn1.equals("8") || sn1.equals("9")) {
            lastDigitSng = sn1;
        }
        int lastDigit = Integer.parseInt(lastDigitSng);
        // First digit checker
        String firstDigitSng = "0";
        if (sn1.equals("0") || sn1.equals("1") || sn1.equals("2") || sn1.equals("3") || sn1.equals("4") || sn1.equals("5") || sn1.equals("6") || sn1.equals("7") || sn1.equals("8") || sn1.equals("9")) {
            firstDigitSng = sn1;
        } else if (sn2.equals("0") || sn2.equals("1") || sn2.equals("2") || sn2.equals("3") || sn2.equals("4") || sn2.equals("5") || sn2.equals("6") || sn2.equals("7") || sn2.equals("8") || sn2.equals("9")) {
            firstDigitSng = sn2;
        } else if (sn3.equals("0") || sn3.equals("1") || sn3.equals("2") || sn3.equals("3") || sn3.equals("4") || sn3.equals("5") || sn3.equals("6") || sn3.equals("7") || sn3.equals("8") || sn3.equals("9")) {
            firstDigitSng = sn3;
        } else if (sn4.equals("0") || sn4.equals("1") || sn4.equals("2") || sn4.equals("3") || sn4.equals("4") || sn4.equals("5") || sn4.equals("6") || sn4.equals("7") || sn4.equals("8") || sn4.equals("9")) {
            firstDigitSng = sn4;
        } else if (sn5.equals("0") || sn5.equals("1") || sn5.equals("2") || sn5.equals("3") || sn5.equals("4") || sn5.equals("5") || sn5.equals("6") || sn5.equals("7") || sn5.equals("8") || sn5.equals("9")) {
            firstDigitSng = sn5;
        } else if (sn6.equals("0") || sn6.equals("1") || sn6.equals("2") || sn6.equals("3") || sn6.equals("4") || sn6.equals("5") || sn6.equals("6") || sn6.equals("7") || sn6.equals("8") || sn6.equals("9")) {
            firstDigitSng = sn6;
        }
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
        // Get unlit indicators thru lit variables
        int carUnlit = 0;
        int clrUnlit = 0;
        int frkUnlit = 0;
        int frqUnlit = 0;
        int msaUnlit = 0;
        int nsaUnlit = 0;
        int sigUnlit = 0;
        int trnUnlit = 0;
        if (car == 1 && carLit == 0) {carUnlit = 1;}
        if (clr == 1 && clrLit == 0) {clrUnlit = 1;}
        if (frk == 1 && frkLit == 0) {frkUnlit = 1;}
        if (frq == 1 && frqLit == 0) {frqUnlit = 1;}
        if (msa == 1 && msaLit == 0) {msaUnlit = 1;}
        if (nsa == 1 && nsaLit == 0) {nsaUnlit = 1;}
        if (sig == 1 && sigLit == 0) {sigUnlit = 1;}
        if (trn == 1 && trnLit == 0) {trnUnlit = 1;}
        // Row calculation
        row = Integer.parseInt(firstDigitSng);
        row = row + carUnlit + clrUnlit + frkUnlit + frqUnlit +
            msaUnlit + nsaUnlit + sigUnlit + trnUnlit;
        if (row > 7) {row = row - 8;}
        // Column calculation
        column = Integer.parseInt(lastDigitSng);
        column = column + bobLit + clrLit + indLit + msaLit +
            nsaLit + sigLit + sndLit + trnLit;
        if (column > 7) {column = column - 8;}
        System.out.println("Row - " + row);
        System.out.println("Column - " + column);
        // Set indicator at location
        x = 0;
        y = 0;
        switch (Integer.toString(row)) {
            case "0": y = 147; break;
            case "1": y = 177; break;
            case "2": y = 207; break;
            case "3": y = 237; break;
            case "4": y = 267; break;
            case "5": y = 297; break;
            case "6": y = 327; break;
            case "7": y = 357; break;
            case "8": y = 387; break;
        }
        switch (Integer.toString(column)) {
            case "0": x = 51; break;
            case "1": x = 81; break;
            case "2": x = 111; break;
            case "3": x = 141; break;
            case "4": x = 171; break;
            case "5": x = 201; break;
            case "6": x = 231; break;
            case "7": x = 261; break;
            case "8": x = 291; break;
        }
        outputInd.setBounds(x,y,21,23);
        // Combo Box action listener
        mazesCB.addActionListener((ActionEvent e) -> {
            String maze = (String) mazesCB.getItemAt(mazesCB.getSelectedIndex());
            w = 300;
            h = 336;
            switch (maze) {
                case "ABC":
                    abcImg = abcIcon2.getImage();
                    abcImg = abcImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    abcIcon = new ImageIcon(abcImg);
                    outputMaze.setIcon(abcIcon);
                    break;
                case "ABD":
                    abdImg = abdIcon2.getImage();
                    abdImg = abdImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    abdIcon = new ImageIcon(abdImg);
                    outputMaze.setIcon(abdIcon);
                    break;
                case "ABH":
                    abhImg = abhIcon2.getImage();
                    abhImg = abhImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    abhIcon = new ImageIcon(abhImg);
                    outputMaze.setIcon(abhIcon);
                    break;
                case "ACD":
                    acdImg = acdIcon2.getImage();
                    acdImg = acdImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    acdIcon = new ImageIcon(acdImg);
                    outputMaze.setIcon(acdIcon);
                    break;
                case "ACH":
                    achImg = achIcon2.getImage();
                    achImg = achImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    achIcon = new ImageIcon(achImg);
                    outputMaze.setIcon(achIcon);
                    break;
                case "ADH":
                    adhImg = adhIcon2.getImage();
                    adhImg = adhImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    adhIcon = new ImageIcon(adhImg);
                    outputMaze.setIcon(adhIcon);
                    break;
                case "BCD":
                    bcdImg = bcdIcon2.getImage();
                    bcdImg = bcdImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    bcdIcon = new ImageIcon(bcdImg);
                    outputMaze.setIcon(bcdIcon);
                    break;
                case "BCH":
                    bchImg = bchIcon2.getImage();
                    bchImg = bchImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    bchIcon = new ImageIcon(bchImg);
                    outputMaze.setIcon(bchIcon);
                    break;
                case "BDH":
                    bdhImg = bdhIcon2.getImage();
                    bdhImg = bdhImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    bdhIcon = new ImageIcon(bdhImg);
                    outputMaze.setIcon(bdhIcon);
                    break;
                default:
                    cdhImg = cdhIcon2.getImage();
                    cdhImg = cdhImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                    cdhIcon = new ImageIcon(cdhImg);
                    outputMaze.setIcon(cdhIcon);
                    break;
            }
            outputInd.setVisible(true);
        });
        dirCB.addActionListener((ActionEvent e) -> {
            String dir = (String) dirCB.getItemAt(dirCB.getSelectedIndex());
            switch (Integer.toString(row)) {
                case "0": y = 137; break;
                case "1": y = 167; break;
                case "2": y = 197; break;
                case "3": y = 227; break;
                case "4": y = 257; break;
                case "5": y = 287; break;
                case "6": y = 317; break;
                case "7": y = 347; break;
                case "8": y = 377; break;
            }
            switch (Integer.toString(column)) {
                case "0": x = 41; break;
                case "1": x = 71; break;
                case "2": x = 101; break;
                case "3": x = 131; break;
                case "4": x = 161; break;
                case "5": x = 191; break;
                case "6": x = 221; break;
                case "7": x = 251; break;
                case "8": x = 281; break;
            }
            switch (dir) {
                case "N": case "S": outputLine.setIcon(verLine); w = 25; h = 256; y = 135; x = x + 10; break;
                case "W": case "E": outputLine.setIcon(horLine); w = 251; h = 23; x = 42; y = y + 10; break;
            }
            outputLine.setBounds(x,y,w,h);
            outputLine.setVisible(true);
        });
    }
}
