/**
 * Accumulation module, started work on 11/10/18 2:20 PM
 * 
 * Stopped work on it since I didn't know how the fuck to solve it
 * 
 * Restarted work after decompiling the DLL of the mod [11/30/18 6:00 PM]
 * 
 * Finished version 0.1 on 8:38 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import org.jdesktop.swingx.autocomplete.*;

public class accumulation {
    static JFrame f;
    AutoCompleteDecorator decorator;
    static int base = 0;
    static int stage1 = 0;
    static int stage1btns = 0;
    static int stage2 = 0;
    static int stage2btns = 0;
    static int stage3 = 0;
    static int stage3btns = 0;
    static int stage4 = 0;
    static int stage4btns = 0;
    static int stage5 = 0;
    static JComboBox b1CB;
    static JComboBox b2CB;
    static JComboBox b3CB;
    static JComboBox b4CB;
    static JComboBox b5CB;
    static JComboBox b6CB;
    static JComboBox b7CB;
    static JComboBox b8CB;
    static JComboBox b9CB;
    static JComboBox b10CB;
    public static void module() {
        System.out.println("[ACCUMULATION]");
        f = new JFrame("KAaNE [ACCUMULATION]");
        ImageIcon icon = new ImageIcon("imgs/icons/Accumulation.png");
        f.setIconImage(icon.getImage());
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0025");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0026");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // String array
        String colors[] = {"Pink","Red","Orange","Yellow","Lime","Green","Blue","Brown","Grey","White"};
        // CBs
        JComboBox borderCB = new JComboBox(colors); borderCB.setBounds(10,10,70,20);
        JComboBox bgCB = new JComboBox(colors); bgCB.setBounds(290,10,70,20);
        b1CB = new JComboBox(colors); b1CB.setBounds(10,50,70,20);
        b2CB = new JComboBox(colors); b2CB.setBounds(80,50,70,20);
        b3CB = new JComboBox(colors); b3CB.setBounds(150,50,70,20);
        b4CB = new JComboBox(colors); b4CB.setBounds(220,50,70,20);
        b5CB = new JComboBox(colors); b5CB.setBounds(290,50,70,20);
        b6CB = new JComboBox(colors); b6CB.setBounds(10,90,70,20);
        b7CB = new JComboBox(colors); b7CB.setBounds(80,90,70,20);
        b8CB = new JComboBox(colors); b8CB.setBounds(150,90,70,20);
        b9CB = new JComboBox(colors); b9CB.setBounds(220,90,70,20);
        b10CB = new JComboBox(colors); b10CB.setBounds(290,90,70,20);
        // AutoComplete CBs
        AutoCompleteDecorator.decorate(borderCB);
        AutoCompleteDecorator.decorate(bgCB);
        AutoCompleteDecorator.decorate(b1CB);
        AutoCompleteDecorator.decorate(b2CB);
        AutoCompleteDecorator.decorate(b3CB);
        AutoCompleteDecorator.decorate(b4CB);
        AutoCompleteDecorator.decorate(b5CB);
        AutoCompleteDecorator.decorate(b6CB);
        AutoCompleteDecorator.decorate(b7CB);
        AutoCompleteDecorator.decorate(b8CB);
        AutoCompleteDecorator.decorate(b9CB);
        AutoCompleteDecorator.decorate(b10CB);
        // Labels
        JLabel borderLabel = new JLabel("Border"); borderLabel.setBounds(25,30,40,20);
        JLabel bgLabel = new JLabel("BG"); bgLabel.setBounds(320,30,20,20);
        JLabel b1Label = new JLabel("Button 1"); b1Label.setBounds(22,70,50,20);
        JLabel b2Label = new JLabel("Button 2"); b2Label.setBounds(92,70,50,20);
        JLabel b3Label = new JLabel("Button 3"); b3Label.setBounds(162,70,50,20);
        JLabel b4Label = new JLabel("Button 4"); b4Label.setBounds(232,70,50,20);
        JLabel b5Label = new JLabel("Button 5"); b5Label.setBounds(302,70,50,20);
        JLabel b6Label = new JLabel("Button 6"); b6Label.setBounds(22,110,50,20);
        JLabel b7Label = new JLabel("Button 7"); b7Label.setBounds(92,110,50,20);
        JLabel b8Label = new JLabel("Button 8"); b8Label.setBounds(162,110,50,20);
        JLabel b9Label = new JLabel("Button 9"); b9Label.setBounds(232,110,50,20);
        JLabel b10Label = new JLabel("Button 10"); b10Label.setBounds(298,110,55,20);
        JLabel stageLabel = new JLabel("Stage 1"); stageLabel.setBounds(10,200,50,20);
        JLabel output = new JLabel(""); output.setBounds(162,150,50,20);
        // Buttons
        JButton clear = new JButton("Clear"); clear.setBounds(140,10,90,20);
        JButton submit1 = new JButton("Submit"); submit1.setBounds(140,130,90,20);
        JButton submit2 = new JButton("Submit"); submit2.setBounds(140,130,90,20);
        JButton submit3 = new JButton("Submit"); submit3.setBounds(140,130,90,20);
        JButton submit4 = new JButton("Submit"); submit4.setBounds(140,130,90,20);
        JButton submit5 = new JButton("Submit"); submit5.setBounds(140,130,90,20);
        JButton clearAll = new JButton("Clear All"); clearAll.setBounds(100,200,120,20);
        // Make other submit buttons invisible (They'll be used later)
        submit2.setVisible(false); submit3.setVisible(false);
        submit4.setVisible(false); submit5.setVisible(false);
        // Add everything
        f.add(borderCB); f.add(bgCB); f.add(borderLabel); f.add(bgLabel);
        f.add(b1CB); f.add(b2CB); f.add(b3CB); f.add(b4CB); f.add(b5CB);
        f.add(b6CB); f.add(b7CB); f.add(b8CB); f.add(b9CB); f.add(b10CB);
        f.add(b1Label); f.add(b2Label); f.add(b3Label); f.add(b4Label); f.add(b5Label);
        f.add(b6Label); f.add(b7Label); f.add(b8Label); f.add(b9Label); f.add(b10Label);
        f.add(clear); f.add(submit1); f.add(clearAll); f.add(stageLabel); f.add(output);
        f.add(submit2); f.add(submit3); f.add(submit4); f.add(submit5);
        // Define JFrame
        f.setLayout(null);
        f.setSize(375,300);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Oh boy, here goes nothing.
        submit1.addActionListener((ActionEvent e) -> {
            // Get base #
            int bat = Integer.parseInt(props.getProperty("batteriesTotal"));
            int plate = Integer.parseInt(props.getProperty("plates"));
            // God, I really need to improve this on gamma.
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
            int indicators = bob + car + clr + frk + frq + ind + msa + nsa + sig + snd + trn;
            String border = (String) borderCB.getItemAt(borderCB.getSelectedIndex());
            int colorInt = colorValue(border);
            base = bat + plate + indicators + colorInt;
            System.out.println("Base = " + base);
            String bg = (String) bgCB.getItemAt(bgCB.getSelectedIndex());
            colorInt = colorValue(bg);
            stage1 = base + colorInt;
            System.out.println("Stage 1 = " + stage1);
            // Output
            output.setText(String.valueOf(stage1));
            // Split up button presses
            String split = String.valueOf(stage1);
            String[] spliting = split.split("(?<=.)");
            int splittedA = Integer.parseInt(spliting[0]);
            int splittedB = Integer.parseInt(spliting[1]);
            int splittedC = 0;
            try {
                splittedC = Integer.parseInt(spliting[2]);
            } catch (ArrayIndexOutOfBoundsException ex){
                splittedC = 0;
            }
            // Get the color of buttons
            String colorA = buttonColor(splittedA);
            String colorB = buttonColor(splittedB);
            String colorC = buttonColor(splittedC);
            // Get the value
            int buttonA = colorValue(colorA);
            int buttonB = colorValue(colorB);
            int buttonC = colorValue(colorC);
            // Add together
            stage1btns = buttonA + buttonB + buttonC;
            System.out.println("Stage 1 Buttons = " + stage1btns);
            // Transition to Stage 2
            submit1.setVisible(false);
            submit2.setVisible(true);
            stageLabel.setText("Stage 2");
        });
        submit2.addActionListener((ActionEvent e) -> {
            // Get BG color and multiply by stage #
            String bg = (String) bgCB.getItemAt(bgCB.getSelectedIndex());
            int colorInt = colorValue(bg);
            int digitA = colorInt * 2;
            // Add to stage 1 button value
            int digitB = digitA + stage1btns;
            // Add to stage 1 output
            stage2 = digitB + stage1;
            // Check if it's >999
            if (stage2 > 999) stage2 = stage2 % 1000; // If it is, modulo by 1000
            System.out.println("Stage 2 = " + stage2);
            // Output
            output.setText(String.valueOf(stage2));
            // Split up button presses
            String split = String.valueOf(stage2);
            String[] spliting = split.split("(?<=.)");
            int splittedA = Integer.parseInt(spliting[0]);
            int splittedB = Integer.parseInt(spliting[1]);
            int splittedC = 0;
            try {
                splittedC = Integer.parseInt(spliting[2]);
            } catch (ArrayIndexOutOfBoundsException ex){
                splittedC = 0;
            }
            // Get the color of buttons
            String colorA = buttonColor(splittedA);
            String colorB = buttonColor(splittedB);
            String colorC = buttonColor(splittedC);
            // Get the value
            int buttonA = colorValue(colorA);
            int buttonB = colorValue(colorB);
            int buttonC = colorValue(colorC);
            // Add together
            stage2btns = buttonA + buttonB + buttonC;
            System.out.println("Stage 2 Buttons = " + stage2btns);
            // Transition to Stage 3
            submit2.setVisible(false);
            submit3.setVisible(true);
            stageLabel.setText("Stage 3");
        });
        submit3.addActionListener((ActionEvent e) -> {
            // Get BG color and multiply by stage #
            String bg = (String) bgCB.getItemAt(bgCB.getSelectedIndex());
            int colorInt = colorValue(bg);
            int digitA = colorInt * 3;
            // Add to stage 2 button value
            int digitB = digitA + stage2btns;
            // Add to stage 2 output
            stage3 = digitB + stage2;
            // Check if it's >999
            if (stage3 > 999) stage3 = stage3 % 1000; // If it is, modulo by 1000
            System.out.println("Stage 3 = " + stage3);
            // Output
            output.setText(String.valueOf(stage3));
            // Split up button presses
            String split = String.valueOf(stage3);
            String[] spliting = split.split("(?<=.)");
            int splittedA = Integer.parseInt(spliting[0]);
            int splittedB = Integer.parseInt(spliting[1]);
            int splittedC = 0;
            try {
                splittedC = Integer.parseInt(spliting[2]);
            } catch (ArrayIndexOutOfBoundsException ex){
                splittedC = 0;
            }
            // Get the color of buttons
            String colorA = buttonColor(splittedA);
            String colorB = buttonColor(splittedB);
            String colorC = buttonColor(splittedC);
            // Get the value
            int buttonA = colorValue(colorA);
            int buttonB = colorValue(colorB);
            int buttonC = colorValue(colorC);
            // Add together
            stage3btns = buttonA + buttonB + buttonC;
            System.out.println("Stage 3 Buttons = " + stage3btns);
            // Transition to Stage 4
            submit3.setVisible(false);
            submit4.setVisible(true);
            stageLabel.setText("Stage 4");
        });
        submit4.addActionListener((ActionEvent e) -> {
            // Get BG color and multiply by stage #
            String bg = (String) bgCB.getItemAt(bgCB.getSelectedIndex());
            int colorInt = colorValue(bg);
            int digitA = colorInt * 4;
            // Add to stage 3 button value
            int digitB = digitA + stage3btns;
            // Add to stage 3 output
            stage4 = digitB + stage3;
            // Check if it's >999
            if (stage4 > 999) stage4 = stage4 % 1000; // If it is, modulo by 1000
            System.out.println("Stage 4 = " + stage4);
            // Output
            output.setText(String.valueOf(stage4));
            // Split up button presses
            String split = String.valueOf(stage4);
            String[] spliting = split.split("(?<=.)");
            int splittedA = Integer.parseInt(spliting[0]);
            int splittedB = Integer.parseInt(spliting[1]);
            int splittedC = 0;
            try {
                splittedC = Integer.parseInt(spliting[2]);
            } catch (ArrayIndexOutOfBoundsException ex){
                splittedC = 0;
            }
            // Get the color of buttons
            String colorA = buttonColor(splittedA);
            String colorB = buttonColor(splittedB);
            String colorC = buttonColor(splittedC);
            // Get the value
            int buttonA = colorValue(colorA);
            int buttonB = colorValue(colorB);
            int buttonC = colorValue(colorC);
            // Add together
            stage4btns = buttonA + buttonB + buttonC;
            System.out.println("Stage 4 Buttons = " + stage4btns);
            // Transition to Stage 5
            submit4.setVisible(false);
            submit5.setVisible(true);
            stageLabel.setText("Stage 5");
        });
        submit5.addActionListener((ActionEvent e) -> {
            // Get BG color and multiply by stage #
            String bg = (String) bgCB.getItemAt(bgCB.getSelectedIndex());
            int colorInt = colorValue(bg);
            int digitA = colorInt * 5;
            // Add to stage 4 button value
            int digitB = digitA + stage4btns;
            // Add to stage 4 output
            stage5 = digitB + stage4;
            // Check if it's >999
            if (stage5 > 999) stage5 = stage5 % 1000; // If it is, modulo by 1000
            System.out.println("Stage 5 = " + stage5);
            // Output
            output.setText(String.valueOf(stage5));
        });
        clear.addActionListener((ActionEvent e) -> {
            bgCB.setSelectedItem("Pink");
            borderCB.setSelectedItem("Pink");
            b1CB.setSelectedItem("Pink");
            b2CB.setSelectedItem("Pink");
            b3CB.setSelectedItem("Pink");
            b4CB.setSelectedItem("Pink");
            b5CB.setSelectedItem("Pink");
            b6CB.setSelectedItem("Pink");
            b7CB.setSelectedItem("Pink");
            b8CB.setSelectedItem("Pink");
            b9CB.setSelectedItem("Pink");
            b10CB.setSelectedItem("Pink");
        });
        clearAll.addActionListener((ActionEvent e) -> {
            bgCB.setSelectedItem("Pink");
            borderCB.setSelectedItem("Pink");
            b1CB.setSelectedItem("Pink");
            b2CB.setSelectedItem("Pink");
            b3CB.setSelectedItem("Pink");
            b4CB.setSelectedItem("Pink");
            b5CB.setSelectedItem("Pink");
            b6CB.setSelectedItem("Pink");
            b7CB.setSelectedItem("Pink");
            b8CB.setSelectedItem("Pink");
            b9CB.setSelectedItem("Pink");
            b10CB.setSelectedItem("Pink");
            submit1.setVisible(true);
            submit2.setVisible(false);
            submit3.setVisible(false);
            submit4.setVisible(false);
            submit5.setVisible(false);
            stageLabel.setText("Stage 1");
            System.out.println("Cleared to Stage 1");
        });
    }
    public static int colorValue(String a) {
        int b = 0;
        switch (a) {
            case "Blue": b = 9; break;
            case "Brown": b = 23; break;
            case "Green": b = 4; break;
            case "Grey": b = 15; break;
            case "Lime": b = 26; break;
            case "Orange": b = 2; break;
            case "Pink": b = 8; break;
            case "Red": b = 17; break;
            case "White": b = 11; break;
            case "Yellow": b = 10; break;
        }
        return b;
    }
    public static String buttonColor(int a) {
        String b = "";
        switch (a) {
            case 1: b = (String) b1CB.getItemAt(b1CB.getSelectedIndex()); break;
            case 2: b = (String) b2CB.getItemAt(b2CB.getSelectedIndex()); break;
            case 3: b = (String) b3CB.getItemAt(b3CB.getSelectedIndex()); break;
            case 4: b = (String) b4CB.getItemAt(b4CB.getSelectedIndex()); break;
            case 5: b = (String) b5CB.getItemAt(b5CB.getSelectedIndex()); break;
            case 6: b = (String) b6CB.getItemAt(b6CB.getSelectedIndex()); break;
            case 7: b = (String) b7CB.getItemAt(b7CB.getSelectedIndex()); break;
            case 8: b = (String) b8CB.getItemAt(b8CB.getSelectedIndex()); break;
            case 9: b = (String) b9CB.getItemAt(b9CB.getSelectedIndex()); break;
            case 10: b = (String) b10CB.getItemAt(b10CB.getSelectedIndex()); break;
        }
        return b;
    }
}
