import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

/**
 * Buttons Module, started work on 10:47 PM 6/17/2018
 *
 * Finished version 0.1 on 10:00 AM 6/18/2018
 *
 * Finished version 0.2 on 11:22 AM 6/24/2019
 *
 * Version 0.2
 */

public class button {
    static JFrame f;
    static JLayeredPane l;
    public static void module() {
        System.out.println("[BUTTON MODULE]");
        f = new JFrame("KAaNE [BUTTON MODULE]");
        ImageIcon icon = new ImageIcon("imgs/icons/button.png");
        f.setIconImage(icon.getImage());
        l = new JLayeredPane();
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // Define the Input Text
        JLabel inputText = new JLabel();
        inputText.setHorizontalAlignment(JLabel.CENTER);
        inputText.setSize(320,30);
        inputText.setText("Input the text and color below.");
        // Define the Input Button
        JButton button = new JButton("OK");
        button.setBounds(200,50,75,20);
        // Define the Color Combo Box
        String[] colorText = {"Red","Yellow","Blue","White"};
        JComboBox<String> colorCombo = new JComboBox<>(colorText);
        colorCombo.setBounds(50,50,90,20);
        // Define the Text Combo Box
        String[] tText = {"PRESS","HOLD","ABORT","DETONATE"};
        JComboBox<String> textCombo = new JComboBox<>(tText);
        textCombo.setBounds(50,70,90,20);
        // Define the Final text
        JLabel finalText = new JLabel("");
        finalText.setHorizontalAlignment(JLabel.CENTER);
        finalText.setSize(320,320);
        finalText.setVisible(false);
        // Display Module Components
        ImageIcon emptyIcon = new ImageIcon("imgs/EmptyComponent.png");
        ImageIcon noneIcon = new ImageIcon("imgs/displaymodules/button/none.png");
        ImageIcon redIcon = new ImageIcon("imgs/displaymodules/button/col-red.png");
        ImageIcon yellowIcon = new ImageIcon("imgs/displaymodules/button/col-yellow.png");
        ImageIcon blueIcon = new ImageIcon("imgs/displaymodules/button/col-blue.png");
        ImageIcon whiteIcon = new ImageIcon("imgs/displaymodules/button/col-white.png");
        ImageIcon pressWIcon = new ImageIcon("imgs/displaymodules/button/txt-w-press.png");
        ImageIcon holdWIcon = new ImageIcon("imgs/displaymodules/button/txt-w-hold.png");
        ImageIcon abortWIcon = new ImageIcon("imgs/displaymodules/button/txt-w-abort.png");
        ImageIcon detonateWIcon = new ImageIcon("imgs/displaymodules/button/txt-w-detonate.png");
        ImageIcon pressBIcon = new ImageIcon("imgs/displaymodules/button/txt-b-press.png");
        ImageIcon holdBIcon = new ImageIcon("imgs/displaymodules/button/txt-b-hold.png");
        ImageIcon abortBIcon = new ImageIcon("imgs/displaymodules/button/txt-b-abort.png");
        ImageIcon detonateBIcon = new ImageIcon("imgs/displaymodules/button/txt-b-detonate.png");
        JLabel dmEmpty = new JLabel(emptyIcon); dmEmpty.setBounds(350,40,200,200);
        JLabel dmNone = new JLabel(noneIcon); dmNone.setBounds(350,40,200,200);
        JLabel dmColor = new JLabel(); dmColor.setBounds(350,40,200,200);
        JLabel dmText = new JLabel(); dmText.setBounds(350,40,200,200);
        JButton update = new JButton("UPDATE"); update.setBounds(410,250,80,20);
        // Add normal components
        l.add(inputText); l.add(button); 
        l.add(colorCombo); l.add(textCombo);
        l.add(finalText);
        // Add display module components
        l.add(dmEmpty); l.add(dmNone);
        l.add(dmColor); l.add(dmText);
        l.add(update);
        // Set layers
        l.setLayer(dmNone,1);
        l.setLayer(dmColor,2); l.setLayer(dmText,3);
        // Set pane
        f.setContentPane(l);
        // Define the rest of the JFrame stuff
        f.setLayout(null);
        if (props.getProperty("displayModule").equals("1")) f.setSize(600,350);
        else f.setSize(350,350);
        f.setResizable(false);
        f.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Logic
        button.addActionListener(e -> {
            String color = colorCombo.getItemAt(colorCombo.getSelectedIndex());
            String text = textCombo.getItemAt(textCombo.getSelectedIndex());
            int batteriesTotal = Integer.parseInt(props.getProperty("batteriesTotal"));
            String litCar = props.getProperty("carLit");
            String litFrk = props.getProperty("frkLit");
            System.out.println("Color - " + color);
            System.out.println("Text - " + text);
            finalText.setText("<html>Hold the button.<br/>Release on 4 if the strip is blue.<br/>Release on 5 if the strip is yellow.<br/>Release on 1 if it's anything else.</html>");
            if ((color.equals("Blue")) && (text.equals("ABORT"))) {
                    System.out.println("Step 1");
                    System.out.println("Blue and ABORT, so refer to RaHB.");
            } else if ((text.equals("DETONATE")) && (batteriesTotal > 1)) {
                    System.out.println("Step 2");
                    System.out.println("More than 1B and DETONATE, so press and release.");
                    finalText.setText("Press and immediately release.");
            } else if ((color.equals("White")) && (litCar.equals("1"))) {
                    System.out.println("Step 3");
                    System.out.println("White and lit CAR, so refer to RaHB.");
            } else if ((batteriesTotal > 2) && (litFrk.equals("1"))) {
                    System.out.println("Step 4");
                    System.out.println("More than 2B and lit FRK, so press and release.");
                    finalText.setText("Press and immediately release.");
            } else if (color.equals("Yellow")) {
                    System.out.println("Step 5");
                    System.out.println("Yellow, so refer to RaHB.");
            } else if ((color.equals("Red")) && (text.equals("HOLD"))) {
                    System.out.println("Step 6");
                    System.out.println("Red and HOLD, so press and release.");
                    finalText.setText("Press and immediately release.");
            } else {
                    System.out.println("Step 7");
                    System.out.println("No other condition applies, so refer to RaHB.");
            }
            finalText.setVisible(true);
        });
        update.addActionListener(e -> {
            // Get color/text
            String color = colorCombo.getItemAt(colorCombo.getSelectedIndex());
            String text = textCombo.getItemAt(textCombo.getSelectedIndex());
            // Set color
            switch (color) {
                case "Red": dmColor.setIcon(redIcon); break;
                case "Yellow": dmColor.setIcon(yellowIcon); break;
                case "Blue": dmColor.setIcon(blueIcon); break;
                case "White": dmColor.setIcon(whiteIcon); break;
            }
            // Determine whether text should be white or black based on color
            if (color.equals("Red") || color.equals("Blue"))
                // Set white text
                switch (text) {
                    case "PRESS": dmText.setIcon(pressWIcon); break;
                    case "HOLD": dmText.setIcon(holdWIcon); break;
                    case "ABORT": dmText.setIcon(abortWIcon); break;
                    case "DETONATE": dmText.setIcon(detonateWIcon); break;
                }
            else
                // Set black text
                switch (text) {
                    case "PRESS": dmText.setIcon(pressBIcon); break;
                    case "HOLD": dmText.setIcon(holdBIcon); break;
                    case "ABORT": dmText.setIcon(abortBIcon); break;
                    case "DETONATE": dmText.setIcon(detonateBIcon); break;
                }
        });
    }
}
