/**
 * Settings
 * 
 * Used to define the bomb
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.text.*;
import be.pcl.swing.*;
import java.util.Properties;

public class settings {
    static JFrame f;
    static Timer t;
    static int x = 255;
    public static void menu() {
        System.out.println("[SETTINGS]");
        f = new JFrame("KAaNE [SETTINGS]");
        ImageIcon icon2 = new ImageIcon("imgs/icons/settings.png");
        f.setIconImage(icon2.getImage());
        // Make the config file
        File configFile = new File("config.properties");
        // Define the properties.
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // Define the Welcome Text
        JLabel welcomeText = new JLabel();
        welcomeText.setHorizontalAlignment(JLabel.CENTER);
        welcomeText.setSize(320,30);
        welcomeText.setText("Set the settings below.");
        // Define the Save Button
        JButton saveButton=new JButton("SAVE");
        saveButton.setBounds(75,30,75,20);
        // Define the Clear Button
        JButton clearButton=new JButton("CLEAR");
        clearButton.setBounds(175,30,75,20);
        // Define the Saved/Cleared Text
        JLabel changeText = new JLabel();
        changeText.setBounds(150,280,70,20);
        changeText.setVisible(false);
        changeText.setForeground(new Color(0,0,0,255));
        changeText.setBackground(new Color(255,255,255,255));
        // Define the Indicator Checkboxes
        String lit = "LIT";
        JCheckBox bobCheck = new JCheckBox("BOB");
        bobCheck.setBounds(20,50,50,20);
        JCheckBox litBobCheck = new JCheckBox(lit);
        litBobCheck.setBounds(71,50,50,20);
        JCheckBox carCheck = new JCheckBox("CAR");
        carCheck.setBounds(20,70,50,20);
        JCheckBox litCarCheck = new JCheckBox(lit);
        litCarCheck.setBounds(71,70,50,20);
        JCheckBox clrCheck = new JCheckBox("CLR");
        clrCheck.setBounds(20,90,50,20);
        JCheckBox litClrCheck = new JCheckBox(lit);
        litClrCheck.setBounds(71,90,50,20);
        JCheckBox frkCheck = new JCheckBox("FRK");
        frkCheck.setBounds(20,110,50,20);
        JCheckBox litFrkCheck = new JCheckBox(lit);
        litFrkCheck.setBounds(71,110,50,20);
        JCheckBox frqCheck = new JCheckBox("FRQ");
        frqCheck.setBounds(20,130,50,20);
        JCheckBox litFrqCheck = new JCheckBox(lit);
        litFrqCheck.setBounds(71,130,50,20);
        JCheckBox indCheck = new JCheckBox("IND");
        indCheck.setBounds(20,150,50,20);
        JCheckBox litIndCheck = new JCheckBox(lit);
        litIndCheck.setBounds(71,150,50,20);
        JCheckBox msaCheck = new JCheckBox("MSA");
        msaCheck.setBounds(20,170,51,20);
        JCheckBox litMsaCheck = new JCheckBox(lit);
        litMsaCheck.setBounds(71,170,50,20);
        JCheckBox nsaCheck = new JCheckBox("NSA");
        nsaCheck.setBounds(20,190,50,20);
        JCheckBox litNsaCheck = new JCheckBox(lit);
        litNsaCheck.setBounds(71,190,50,20);
        JCheckBox sigCheck = new JCheckBox("SIG");
        sigCheck.setBounds(20,210,50,20);
        JCheckBox litSigCheck = new JCheckBox(lit);
        litSigCheck.setBounds(71,210,50,20);
        JCheckBox sndCheck = new JCheckBox("SND");
        sndCheck.setBounds(20,230,50,20);
        JCheckBox litSndCheck = new JCheckBox(lit);
        litSndCheck.setBounds(71,230,50,20);
        JCheckBox trnCheck = new JCheckBox("TRN");
        trnCheck.setBounds(20,250,50,20);
        JCheckBox litTrnCheck = new JCheckBox(lit);
        litTrnCheck.setBounds(71,250,50,20);
        // Define the Battery Textboxes
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField batteriesAATextBox = new ImprovedFormattedTextField(integerNumberInstance,0);
        batteriesAATextBox.setBounds(121,53,50,20);
        ImprovedFormattedTextField batteriesDTextBox = new ImprovedFormattedTextField(integerNumberInstance,0);
        batteriesDTextBox.setBounds(121,73,50,20);
        // Define the Battery text
        JLabel batteriesAAText = new JLabel("Total AAs");
        batteriesAAText.setBounds(176,53,60,20);
        JLabel batteriesDText = new JLabel("Total Ds");
        batteriesDText.setBounds(176,73,60,20);
        // Define the port text boxes
        ImprovedFormattedTextField dvidTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        dvidTB.setBounds(121,93,50,20);
        ImprovedFormattedTextField parallelTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        parallelTB.setBounds(121,113,50,20);
        ImprovedFormattedTextField ps2TB = new ImprovedFormattedTextField(integerNumberInstance,0);
        ps2TB.setBounds(121,133,50,20);
        ImprovedFormattedTextField rj45TB = new ImprovedFormattedTextField(integerNumberInstance,0);
        rj45TB.setBounds(121,153,50,20);
        ImprovedFormattedTextField serialTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        serialTB.setBounds(121,173,50,20);
        ImprovedFormattedTextField stereoRCATB = new ImprovedFormattedTextField(integerNumberInstance,0);
        stereoRCATB.setBounds(121,193,50,20);
        // Define the Port JLabels
        ImageIcon icon = new ImageIcon("imgs/edgework/DVI-D.png");
        JLabel dvidImg = new JLabel(icon);
        dvidImg.setBounds(177,93,58,20);
        JLabel dvidText = new JLabel("DVID");
        dvidText.setBounds(235,93,30,20);
        icon = new ImageIcon("imgs/edgework/Parallel.png");
        JLabel parallelImg = new JLabel(icon);
        parallelImg.setBounds(177,113,76,20);
        JLabel parallelText = new JLabel("PARALLEL");
        parallelText.setBounds(253,113,60,20);
        icon = new ImageIcon("imgs/edgework/PS2.png");
        JLabel ps2Img = new JLabel(icon);
        ps2Img.setBounds(177,133,21,20);
        JLabel ps2Text = new JLabel("PS/2");
        ps2Text.setBounds(198,133,30,20);
        icon = new ImageIcon("imgs/edgework/RJ45.png");
        JLabel rj45Img = new JLabel(icon);
        rj45Img.setBounds(177,153,19,20);
        JLabel rj45Text = new JLabel("RJ-45");
        rj45Text.setBounds(196,153,40,20);
        icon = new ImageIcon("imgs/edgework/Serial.png");
        JLabel serialImg = new JLabel(icon);
        serialImg.setBounds(177,173,39,20);
        JLabel serialText = new JLabel("SERIAL");
        serialText.setBounds(216,173,50,20);
        icon = new ImageIcon("imgs/edgework/RCA.png");
        JLabel stereoRCAImg = new JLabel(icon);
        stereoRCAImg.setBounds(177,193,42,20);
        JLabel stereoRCAText = new JLabel("STEREO RCA");
        stereoRCAText.setBounds(219,193,80,20);
        // Define the SN text box.
        JTextField snTextBox = new JTextField();
        snTextBox.setDocument(new JTextFieldLimit(6)); // Set the char limit to 6.
        snTextBox.setBounds(236,53,75,20);
        // Define the SN text.
        JLabel snText = new JLabel("SN");
        snText.setBounds(311,53,50,20);
        // Define the module text box
        ImprovedFormattedTextField moduleTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        moduleTB.setBounds(236,73,75,20);
        // Define the module text.
        JLabel moduleText = new JLabel("Modules");
        moduleText.setBounds(311,73,60,20);
        // Define the Display Module checkbox
        JCheckBox dmCheck = new JCheckBox("DISPLAY MODULES");
        dmCheck.setBounds(0,300,134,20);
        // Define the plate text box.
        ImprovedFormattedTextField plateTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        plateTB.setBounds(121,213,50,20);
        // Define the plate text.
        JLabel plateText = new JLabel("PORT PLATES");
        plateText.setBounds(176,213,80,20);
        // Define the modded indicator text box
        ImprovedFormattedTextField modIndTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        modIndTB.setBounds(121,233,50,20);
        // Define the modded indicator text
        JLabel modIndText = new JLabel("MOD INDICATORS");
        modIndText.setBounds(176,233,100,20);
        // Define the modded ports text
        ImprovedFormattedTextField modPortTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        modPortTB.setBounds(121,253,50,20);
        // Define the modded ports text
        JLabel modPortText = new JLabel("MOD PORTS");
        modPortText.setBounds(176,253,80,20);
        // Set all the settings to mirror the config file
        // Indicators
        if (Integer.parseInt(props.getProperty("bob")) == 1) bobCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("bobLit")) == 1) litBobCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("car")) == 1) carCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("carLit")) == 1) litCarCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("clr")) == 1) clrCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("clrLit")) == 1) litClrCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("frk")) == 1) frkCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("frkLit")) == 1) litFrkCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("frq")) == 1) frqCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("frqLit")) == 1) litFrqCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("ind")) == 1) indCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("indLit")) == 1) litIndCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("msa")) == 1) msaCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("msaLit")) == 1) litMsaCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("nsa")) == 1) nsaCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("nsaLit")) == 1) litNsaCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("sig")) == 1) sigCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("sigLit")) == 1) litSigCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("snd")) == 1) sndCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("sndLit")) == 1) litSndCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("trn")) == 1) trnCheck.setSelected(true);
        if (Integer.parseInt(props.getProperty("trnLit")) == 1) litTrnCheck.setSelected(true);
        // Batteries
        batteriesAATextBox.setText(props.getProperty("batteriesAA"));
        batteriesDTextBox.setText(props.getProperty("batteriesD"));
        dvidTB.setText(props.getProperty("dvidQuantity"));
        parallelTB.setText(props.getProperty("parallelQuantity"));
        ps2TB.setText(props.getProperty("ps2Quantity"));
        rj45TB.setText(props.getProperty("rj45Quantity"));
        serialTB.setText(props.getProperty("serialQuantity"));
        stereoRCATB.setText(props.getProperty("stereoRCAQuantity"));
        // SN
        snTextBox.setText(props.getProperty("sn1") + props.getProperty("sn2")
                + props.getProperty("sn3") + props.getProperty("sn4")
                + props.getProperty("sn5") + props.getProperty("sn6"));
        // Modules
        moduleTB.setText(props.getProperty("modules"));
        // Plates
        plateTB.setText(props.getProperty("plates"));
        // Mod Indicators
        modIndTB.setText(props.getProperty("modInd"));
        // Mod Ports
        modPortTB.setText(props.getProperty("modPort"));
        // Display Module
        if (Integer.parseInt(props.getProperty("displayModule")) == 1) dmCheck.setSelected(true);
        // Add everything in the JFrame
        f.add(welcomeText); f.add(saveButton); 
        f.add(bobCheck); f.add(litBobCheck); f.add(carCheck); f.add(litCarCheck); f.add(clrCheck); f.add(litClrCheck); f.add(frkCheck); f.add(litFrkCheck); f.add(frqCheck); f.add(litFrqCheck); f.add(indCheck); f.add(litIndCheck); f.add(msaCheck); f.add(litMsaCheck); f.add(nsaCheck); f.add(litNsaCheck); f.add(sigCheck); f.add(litSigCheck); f.add(sndCheck); f.add(litSndCheck); f.add(trnCheck); f.add(litTrnCheck); 
        f.add(clearButton); f.add(changeText); 
         f.add(batteriesAATextBox); f.add(batteriesAAText); f.add(batteriesDTextBox); f.add(batteriesDText);
        f.add(dvidImg); f.add(parallelImg); f.add(ps2Img); f.add(rj45Img); f.add(serialImg); f.add(stereoRCAImg);
        f.add(dvidText); f.add(parallelText); f.add(ps2Text); f.add(rj45Text); f.add(serialText); f.add(stereoRCAText);
        f.add(snTextBox); f.add(snText); f.add(dmCheck); f.add(moduleTB); f.add(moduleText); f.add(plateTB); f.add(plateText);
        f.add(dvidTB); f.add(parallelTB); f.add(ps2TB); f.add(rj45TB); f.add(serialTB); f.add(stereoRCATB);
        f.add(modPortTB); f.add(modIndTB); f.add(modPortText); f.add(modIndText);
        // Define the rest of the JFrame stuff
        f.setLayout(null);
        f.setSize(370,350);
        f.setResizable(false);
        f.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        saveButton.addActionListener(e -> {
            changeText.setForeground(new Color(0,0,0,255));
            changeText.setBackground(new Color(255,255,255,255));
            x = 255;
            // ----------------------------------------------------
            // Primary Edgework
            // ----------------------------------------------------
            // Re-set the Indicator Properties.
            if (bobCheck.isSelected()) {
                props.setProperty("bob","1");
                if (litBobCheck.isSelected()) props.setProperty("bobLit","1");
                else props.setProperty("bobLit","0");
            } else {
                props.setProperty("bob","0");
                props.setProperty("bobLit","0");
                // Unselect the LIT check box since the indicator isn't checked.
                litBobCheck.setSelected(false);
            }
            if (carCheck.isSelected()) {
                props.setProperty("car","1");
                if (litCarCheck.isSelected()) props.setProperty("carLit","1");
                else props.setProperty("carLit","0");
            } else {
                props.setProperty("car","0");
                props.setProperty("carLit","0");
                litCarCheck.setSelected(false);
            }
            if (clrCheck.isSelected()) {
                props.setProperty("clr","1");
                if (litClrCheck.isSelected()) props.setProperty("clrLit","1");
                else props.setProperty("clrLit","0");
            } else {
                props.setProperty("clr","0");
                props.setProperty("clrLit","0");
                litClrCheck.setSelected(false);
            }
            if (frkCheck.isSelected()) {
                props.setProperty("frk","1");
                if (litFrkCheck.isSelected()) props.setProperty("frkLit","1");
                else props.setProperty("frkLit","0");
            } else {
                props.setProperty("frk","0");
                props.setProperty("frkLit","0");
                litFrkCheck.setSelected(false);
            }
            if (frqCheck.isSelected()) {
                props.setProperty("frq","1");
                if (litFrqCheck.isSelected()) props.setProperty("frqLit","1");
                else props.setProperty("frqLit","0");
            } else {
                props.setProperty("frq","0");
                props.setProperty("frqLit","0");
                litFrqCheck.setSelected(false);
            }
            if (indCheck.isSelected()) {
                props.setProperty("ind","1");
                if (litIndCheck.isSelected()) props.setProperty("indLit","1");
                else props.setProperty("indLit","0");
            } else {
                props.setProperty("ind","0");
                props.setProperty("indLit","0");
                litIndCheck.setSelected(false);
            }
            if (msaCheck.isSelected()) {
                props.setProperty("msa","1");
                if (litMsaCheck.isSelected()) props.setProperty("msaLit","1");
                else props.setProperty("msaLit","0");
            } else {
                props.setProperty("msa","0");
                props.setProperty("msaLit","0");
                litMsaCheck.setSelected(false);
            }
            if (nsaCheck.isSelected()) {
                props.setProperty("nsa","1");
                if (litNsaCheck.isSelected()) props.setProperty("nsaLit","1");
                else props.setProperty("nsaLit","0");
            } else {
                props.setProperty("nsa","0");
                props.setProperty("nsaLit","0");
                litNsaCheck.setSelected(false);
            }
            if (sigCheck.isSelected()) {
                props.setProperty("sig","1");
                if (litSigCheck.isSelected()) props.setProperty("sigLit","1");
                else props.setProperty("sigLit","0");
            } else {
                props.setProperty("sig","0");
                props.setProperty("sigLit","0");
                litSigCheck.setSelected(false);
            }
            if (sndCheck.isSelected()) {
                props.setProperty("snd","1");
                if (litSndCheck.isSelected()) props.setProperty("sndLit","1");
                else props.setProperty("sndLit","0");
            } else {
                props.setProperty("snd","0");
                props.setProperty("sndLit","0");
                litSndCheck.setSelected(false);
            }
            if (trnCheck.isSelected()) {
                props.setProperty("trn","1");
                if (litTrnCheck.isSelected()) props.setProperty("trnLit","1");
                else props.setProperty("trnLit","0");
            } else {
                props.setProperty("trn","0");
                props.setProperty("trnLit","0");
                litTrnCheck.setSelected(false);
            }
            // Re-set the Battery properties.
            props.setProperty("batteriesTotal",Integer.toString(Integer.parseInt(batteriesAATextBox.getText()) + Integer.parseInt(batteriesDTextBox.getText())));
            props.setProperty("batteryHolders",Integer.toString(Integer.parseInt(batteriesDTextBox.getText()) + (Integer.parseInt(batteriesAATextBox.getText()) / 2)));
            props.setProperty("batteriesAA",batteriesAATextBox.getText());
            props.setProperty("batteriesD",batteriesDTextBox.getText());
            String dvidQuantity = dvidTB.getText();
            String parallelQuantity = parallelTB.getText();
            String ps2Quantity = ps2TB.getText();
            String rj45Quantity = rj45TB.getText();
            String serialQuantity = serialTB.getText();
            String stereoRCAQuantity = stereoRCATB.getText();
            props.setProperty("dvidQuantity",dvidQuantity);
            props.setProperty("parallelQuantity",parallelQuantity);
            props.setProperty("ps2Quantity",ps2Quantity);
            props.setProperty("rj45Quantity",rj45Quantity);
            props.setProperty("serialQuantity",serialQuantity);
            props.setProperty("stereoRCAQuantity",stereoRCAQuantity);
            if (Integer.parseInt(dvidQuantity) > 0) props.setProperty("dvid","1");
            else props.setProperty("dvid","0");
            if (Integer.parseInt(parallelQuantity) > 0) props.setProperty("parallel","1");
            else props.setProperty("parallel","0");
            if (Integer.parseInt(ps2Quantity) > 0) props.setProperty("ps2","1");
            else props.setProperty("ps2","0");
            if (Integer.parseInt(rj45Quantity) > 0) props.setProperty("rj45","1");
            else props.setProperty("rj45","0");
            if (Integer.parseInt(serialQuantity) > 0) props.setProperty("serial","1");
            else props.setProperty("serial","0");
            if (Integer.parseInt(stereoRCAQuantity) > 0) props.setProperty("stereoRCA","1");
            else props.setProperty("stereoRCA","0");
            // Upper-Case the SN.
            String sn = snTextBox.getText();
            sn = sn.toUpperCase();
            // Split the SN into an array.
            String[] snArr = sn.split("");
            // Set different strings based on the array. Also set the properties inside the Try/Catch stuff because apparently Eclipse doesn't like it if I don't.
            String sn1 = snArr[0];
            if (sn1.equals("")) {
                props.setProperty("sn1","B");
            } else {
                props.setProperty("sn1",sn1);
            }
            String sn2;
            try {
                sn2 = snArr[1];
                props.setProperty("sn2",sn2);
            } catch (ArrayIndexOutOfBoundsException ex) {
                sn2 = "B"; // Rest of the textbox is empty, so just set it as the default property.
                props.setProperty("sn2",sn2);
            }
            String sn3;
            try {
                sn3 = snArr[2];
                props.setProperty("sn3",sn3);
            } catch (ArrayIndexOutOfBoundsException ex) {
                sn3 = "B";
                props.setProperty("sn3",sn3);
            }
            String sn4;
            try {
                sn4 = snArr[3];
                props.setProperty("sn4",sn4);
            } catch (ArrayIndexOutOfBoundsException ex) {
                sn4 = "0";
                props.setProperty("sn4",sn4);
            }
            String sn5;
            try {
                sn5 = snArr[4];
                props.setProperty("sn5",sn5);
            } catch (ArrayIndexOutOfBoundsException ex) {
                sn5 = "0";
                props.setProperty("sn5",sn5);
            }
            String sn6;
            try {
                sn6 = snArr[5];
                props.setProperty("sn6",sn6);
            } catch (ArrayIndexOutOfBoundsException ex) {
                sn6 = "0";
                props.setProperty("sn6",sn6);
            }
            props.setProperty("modules",moduleTB.getText());
            if (dmCheck.isSelected()) {
                props.setProperty("displayModule", "1");
            } else {
                props.setProperty("displayModule","0");
            }
            // do the rest
            props.setProperty("plates",plateTB.getText());
            props.setProperty("modInd",modIndTB.getText());
            props.setProperty("modPort",modPortTB.getText());
            // ----------------------------------------------------
            // Secondary Edgework
            // (Specific things to make module making easier)
            // ----------------------------------------------------
            // Vowel in SN
            String vowel = "f";
            for (String s : snArr) {
                if (string.isVowel(s)) vowel = "t";
            }
            props.setProperty("snVowel",vowel);
            // Last Digit of SN
            int lastDigit = 0;
            if (string.isDigit(sn6)) lastDigit = Integer.parseInt(sn6);
            else if (string.isDigit(sn5)) lastDigit = Integer.parseInt(sn5);
            else if (string.isDigit(sn4)) lastDigit = Integer.parseInt(sn4);
            else if (string.isDigit(sn3)) lastDigit = Integer.parseInt(sn3);
            else if (string.isDigit(sn2)) lastDigit = Integer.parseInt(sn2);
            else if (string.isDigit(sn1)) lastDigit = Integer.parseInt(sn1);
            props.setProperty("snLastDig",String.valueOf(lastDigit));
            // First Digit of SN
            int firstDigit = 0;
            if (string.isDigit(sn1)) firstDigit = Integer.parseInt(sn1);
            else if (string.isDigit(sn2)) firstDigit = Integer.parseInt(sn2);
            else if (string.isDigit(sn3)) firstDigit = Integer.parseInt(sn3);
            else if (string.isDigit(sn4)) firstDigit = Integer.parseInt(sn4);
            else if (string.isDigit(sn5)) firstDigit = Integer.parseInt(sn5);
            else if (string.isDigit(sn6)) firstDigit = Integer.parseInt(sn6);
            props.setProperty("snFirstDig",String.valueOf(firstDigit));
            // Total Digits/Letters in SN
            int snDigs = 0;
            int snLets = 0;
            if (string.isDigit(sn1)) snDigs++; else snLets++;
            if (string.isDigit(sn2)) snDigs++; else snLets++;
            if (string.isDigit(sn3)) snDigs++; else snLets++;
            if (string.isDigit(sn4)) snDigs++; else snLets++;
            if (string.isDigit(sn5)) snDigs++; else snLets++;
            if (string.isDigit(sn6)) snDigs++; else snLets++;
            props.setProperty("snTotalDigs",String.valueOf(snDigs));
            props.setProperty("snTotalLets",String.valueOf(snLets));
            // Unlit Indicators
            if (bobCheck.isSelected() && !litBobCheck.isSelected()) props.setProperty("bobUnlit","1");
            else props.setProperty("bobUnlit","0");
            if (carCheck.isSelected() && !litCarCheck.isSelected()) props.setProperty("carUnlit","1");
            else props.setProperty("carUnlit","0");
            if (clrCheck.isSelected() && !litClrCheck.isSelected()) props.setProperty("clrUnlit","1");
            else props.setProperty("clrUnlit","0");
            if (frkCheck.isSelected() && !litFrkCheck.isSelected()) props.setProperty("frkUnlit","1");
            else props.setProperty("frkUnlit","0");
            if (frqCheck.isSelected() && !litFrqCheck.isSelected()) props.setProperty("frqUnlit","1");
            else props.setProperty("frqUnlit","0");
            if (indCheck.isSelected() && !litIndCheck.isSelected()) props.setProperty("indUnlit","1");
            else props.setProperty("indUnlit","0");
            if (msaCheck.isSelected() && !litMsaCheck.isSelected()) props.setProperty("msaUnlit","1");
            else props.setProperty("msaUnlit","0");
            if (nsaCheck.isSelected() && !litNsaCheck.isSelected()) props.setProperty("nsaUnlit","1");
            else props.setProperty("nsaUnlit","0");
            if (sigCheck.isSelected() && !litSigCheck.isSelected()) props.setProperty("sigUnlit","1");
            else props.setProperty("sigUnlit","0");
            if (sndCheck.isSelected() && !litSndCheck.isSelected()) props.setProperty("sndUnlit","1");
            else props.setProperty("sndUnlit","0");
            if (trnCheck.isSelected() && !litTrnCheck.isSelected()) props.setProperty("trnUnlit","1");
            else props.setProperty("trnUnlit","0");
            // Total Indicators
            int inds = 0;
            if (bobCheck.isSelected()) inds++;
            if (carCheck.isSelected()) inds++;
            if (clrCheck.isSelected()) inds++;
            if (frkCheck.isSelected()) inds++;
            if (frqCheck.isSelected()) inds++;
            if (indCheck.isSelected()) inds++;
            if (msaCheck.isSelected()) inds++;
            if (nsaCheck.isSelected()) inds++;
            if (sigCheck.isSelected()) inds++;
            if (sndCheck.isSelected()) inds++;
            if (trnCheck.isSelected()) inds++;
            props.setProperty("totalInds",String.valueOf(inds));
            // Total Indicators (+ Mods)
            inds += Integer.parseInt(modIndTB.getText());
            props.setProperty("totalIndsPlusMods",String.valueOf(inds));
            // Total Lit Indicators
            int litInds = 0;
            if (litBobCheck.isSelected()) litInds++;
            if (litCarCheck.isSelected()) litInds++;
            if (litClrCheck.isSelected()) litInds++;
            if (litFrkCheck.isSelected()) litInds++;
            if (litFrqCheck.isSelected()) litInds++;
            if (litIndCheck.isSelected()) litInds++;
            if (litMsaCheck.isSelected()) litInds++;
            if (litNsaCheck.isSelected()) litInds++;
            if (litSigCheck.isSelected()) litInds++;
            if (litSndCheck.isSelected()) litInds++;
            if (litTrnCheck.isSelected()) litInds++;
            props.setProperty("totalIndsLit",String.valueOf(litInds));
            // Total Unlit Indicators
            int unlitInds = 0;
            if (bobCheck.isSelected() && !litBobCheck.isSelected()) unlitInds++;
            if (carCheck.isSelected() && !litCarCheck.isSelected()) unlitInds++;
            if (clrCheck.isSelected() && !litClrCheck.isSelected()) unlitInds++;
            if (frkCheck.isSelected() && !litFrkCheck.isSelected()) unlitInds++;
            if (frqCheck.isSelected() && !litFrqCheck.isSelected()) unlitInds++;
            if (indCheck.isSelected() && !litIndCheck.isSelected()) unlitInds++;
            if (msaCheck.isSelected() && !litMsaCheck.isSelected()) unlitInds++;
            if (nsaCheck.isSelected() && !litNsaCheck.isSelected()) unlitInds++;
            if (sigCheck.isSelected() && !litSigCheck.isSelected()) unlitInds++;
            if (sndCheck.isSelected() && !litSndCheck.isSelected()) unlitInds++;
            if (trnCheck.isSelected() && !litTrnCheck.isSelected()) unlitInds++;
            props.setProperty("totalIndsUnlit",String.valueOf(unlitInds));
            // Total Ports
            int ports = 0;
            ports += Integer.parseInt(dvidQuantity);
            ports += Integer.parseInt(parallelQuantity);
            ports += Integer.parseInt(ps2Quantity);
            ports += Integer.parseInt(rj45Quantity);
            ports += Integer.parseInt(serialQuantity);
            ports += Integer.parseInt(stereoRCAQuantity);
            props.setProperty("totalPorts",String.valueOf(ports));
            // Total Ports (+ Mods)
            ports += Integer.parseInt(modPortTB.getText());
            props.setProperty("totalPortsPlusMods",String.valueOf(ports));
            // Total Port Types
            int portTypes = 0;
            portTypes += Integer.parseInt(dvidQuantity) > 0 ? 1 : 0;
            portTypes += Integer.parseInt(parallelQuantity) > 0 ? 1 : 0;
            portTypes += Integer.parseInt(ps2Quantity) > 0 ? 1 : 0;
            portTypes += Integer.parseInt(rj45Quantity) > 0 ? 1 : 0;
            portTypes += Integer.parseInt(serialQuantity) > 0 ? 1 : 0;
            portTypes += Integer.parseInt(stereoRCAQuantity) > 0 ? 1 : 0;
            props.getProperty("totalPortTypes",String.valueOf(portTypes));
            // ----------------------------------------------------
            // Saving
            // ----------------------------------------------------
            // Write everything into the config file.
            try {
                FileWriter writer = new FileWriter(configFile);
                props.store(writer, "settings");
            } catch (FileNotFoundException ex) {
                System.out.println("ERROR CODE #0003");
                System.out.println("Config file could not be found.");
                System.out.println("Ignoring...");
            } catch (IOException ex) {
                System.out.println("ERROR CODE #0004");
                System.out.println("IO Exception while trying to write in the config file.");
                System.out.println("Ignoring...");
            }
            // Show the "saved" text.
            // Fade in code by Gowtham on Java Demos
            // Slightly nodified by me to fade out
            t=new Timer(10, (ActionEvent ae) -> {
                // Decrease the alpha value by time
                // so that transparency Increases for each
                // actionPerformed() call
                changeText.setForeground(new Color(0,0,0,x--));
                changeText.setBackground(new Color(255,255,255,x));
                if(x==0) t.stop();
            });
            changeText.setText("SAVED!");
            changeText.setVisible(true);
            t.setInitialDelay(2000);
            t.start();
        });
        clearButton.addActionListener(e -> {
            changeText.setForeground(new Color(0,0,0,255));
            changeText.setBackground(new Color(255,255,255,255));
            x = 255;
            // Unselect all the Indicator Checkboxes
            bobCheck.setSelected(false);
            litBobCheck.setSelected(false);
            carCheck.setSelected(false);
            litCarCheck.setSelected(false);
            clrCheck.setSelected(false);
            litClrCheck.setSelected(false);
            frkCheck.setSelected(false);
            litFrkCheck.setSelected(false);
            frqCheck.setSelected(false);
            litFrqCheck.setSelected(false);
            indCheck.setSelected(false);
            litIndCheck.setSelected(false);
            msaCheck.setSelected(false);
            litMsaCheck.setSelected(false);
            nsaCheck.setSelected(false);
            litNsaCheck.setSelected(false);
            sigCheck.setSelected(false);
            litSigCheck.setSelected(false);
            sndCheck.setSelected(false);
            litSndCheck.setSelected(false);
            trnCheck.setSelected(false);
            litTrnCheck.setSelected(false);
            // Set the battery text to 0.
            batteriesAATextBox.setText("0");
            batteriesDTextBox.setText("0");
            // Set the port text to 0.
            dvidTB.setText("0");
            parallelTB.setText("0");
            ps2TB.setText("0");
            rj45TB.setText("0");
            serialTB.setText("0");
            stereoRCATB.setText("0");
            // Clear the SN text.
            snTextBox.setText("");
            // Set the module text to 0.
            moduleTB.setText("0");
            // Set the port plate text to 0.
            plateTB.setText("0");
            // Set the modded stuff text to 0
            modIndTB.setText("0");
            modPortTB.setText("0");
            // Unselect the Display Module checkbox
            dmCheck.setSelected(false);
            // Show the "cleared" text.
            t=new Timer(10, (ActionEvent ae) -> {
                // Decrease the alpha value by time
                // so that transparency Increases for each
                // actionPerformed() call
                changeText.setForeground(new Color(0,0,0,x--));
                changeText.setBackground(new Color(255,255,255,x));
                if(x==0) t.stop();
            });
            changeText.setText("CLEARED!");
            changeText.setVisible(true);
            t.setInitialDelay(2000);
            t.start();
        });
    }
}
