/**
 * Wire Placement
 *
 * Started work on 6/17/2019 11:28 PM
 *
 * Finished version 0.1 on 6/18/2019 3:22 AM
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public class wirePlacement {
    static JFrame f;
    public static void module() {
        System.out.println("[WIRE PLACEMENT]");
        f = new JFrame("KAaNE [WIRE PLACEMENT]");
        ImageIcon icon = new ImageIcon("imgs/icons/Wire Placement.png");
        f.setIconImage(icon.getImage());
        // Input Labels
        ImageIcon redIcon = new ImageIcon("imgs/wirePlacement/red.png");
        ImageIcon yellowIcon = new ImageIcon("imgs/wirePlacement/yellow.png");
        ImageIcon blueIcon = new ImageIcon("imgs/wirePlacement/blue.png");
        ImageIcon whiteIcon = new ImageIcon("imgs/wirePlacement/white.png");
        ImageIcon blackIcon = new ImageIcon("imgs/wirePlacement/black.png");
        JLabel wireA1lbl = new JLabel(whiteIcon);
        wireA1lbl.setBounds(5,5,40,40);
        JLabel wireA2lbl = new JLabel(whiteIcon);
        wireA2lbl.setBounds(5,45,40,40);
        JLabel wireA3lbl = new JLabel(whiteIcon);
        wireA3lbl.setBounds(5,85,40,40);
        JLabel wireA4lbl = new JLabel(whiteIcon);
        wireA4lbl.setBounds(5,125,40,40);
        JLabel wireB1lbl = new JLabel(whiteIcon);
        wireB1lbl.setBounds(45,5,40,40);
        JLabel wireB2lbl = new JLabel(whiteIcon);
        wireB2lbl.setBounds(45,45,40,40);
        JLabel wireB3lbl = new JLabel(whiteIcon);
        wireB3lbl.setBounds(45,85,40,40);
        JLabel wireB4lbl = new JLabel(whiteIcon);
        wireB4lbl.setBounds(45,125,40,40);
        JLabel wireC1lbl = new JLabel(whiteIcon);
        wireC1lbl.setBounds(85,5,40,40);
        JLabel wireC2lbl = new JLabel(whiteIcon);
        wireC2lbl.setBounds(85,45,40,40);
        JLabel wireC3lbl = new JLabel(whiteIcon);
        wireC3lbl.setBounds(85,85,40,40);
        JLabel wireC4lbl = new JLabel(whiteIcon);
        wireC4lbl.setBounds(85,125,40,40);
        JLabel wireD1lbl = new JLabel(whiteIcon);
        wireD1lbl.setBounds(125,5,40,40);
        JLabel wireD2lbl = new JLabel(whiteIcon);
        wireD2lbl.setBounds(125,45,40,40);
        JLabel wireD3lbl = new JLabel(whiteIcon);
        wireD3lbl.setBounds(125,85,40,40);
        JLabel wireD4lbl = new JLabel(whiteIcon);
        wireD4lbl.setBounds(125,125,40,40);
        // Output Icons
        ImageIcon whiteCut = new ImageIcon("imgs/wirePlacement/whiteDoCut.png");
        ImageIcon blackCut = new ImageIcon("imgs/wirePlacement/blackDoCut.png");
        ImageIcon redCut = new ImageIcon("imgs/wirePlacement/redDoCut.png");
        ImageIcon yellowCut = new ImageIcon("imgs/wirePlacement/yellowDoCut.png");
        ImageIcon blueCut = new ImageIcon("imgs/wirePlacement/blueDoCut.png");
        ImageIcon whiteDontCut= new ImageIcon("imgs/wirePlacement/whiteDontCut.png");
        ImageIcon blackDontCut= new ImageIcon("imgs/wirePlacement/blackDontCut.png");
        ImageIcon redDontCut= new ImageIcon("imgs/wirePlacement/redDontCut.png");
        ImageIcon yellowDontCut= new ImageIcon("imgs/wirePlacement/yellowDontCut.png");
        ImageIcon blueDontCut= new ImageIcon("imgs/wirePlacement/blueDontCut.png");
        // Button
        JButton button = new JButton("OK");
        button.setBounds(200,24,80,40);
        JButton clear = new JButton("CLEAR");
        clear.setBounds(200,64,80,40);
        // CB
        String[] colors = {"White","Black","Red","Yellow","Blue"};
        JComboBox colorChoose = new JComboBox(colors);
        colorChoose.setBounds(200,104,80,40);
        // Add
        f.add(wireA1lbl); f.add(wireB1lbl); f.add(wireC1lbl); f.add(wireD1lbl);
        f.add(wireA2lbl); f.add(wireB2lbl); f.add(wireC2lbl); f.add(wireD2lbl);
        f.add(wireA3lbl); f.add(wireB3lbl); f.add(wireC3lbl); f.add(wireD3lbl);
        f.add(wireA4lbl); f.add(wireB4lbl); f.add(wireC4lbl); f.add(wireD4lbl);
        f.add(button); f.add(clear);
        f.add(colorChoose);
        // Define JFrame
        f.setLayout(null);
        f.setSize(320,200);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            // Grab wires
            String wireA1 = (wireA1lbl.getIcon() == whiteIcon) ? "White" : (wireA1lbl.getIcon() == blackIcon) ? "Black" : (wireA1lbl.getIcon() == redIcon) ? "Red" : (wireA1lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireA2 = (wireA2lbl.getIcon() == whiteIcon) ? "White" : (wireA2lbl.getIcon() == blackIcon) ? "Black" : (wireA2lbl.getIcon() == redIcon) ? "Red" : (wireA2lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireA3 = (wireA3lbl.getIcon() == whiteIcon) ? "White" : (wireA3lbl.getIcon() == blackIcon) ? "Black" : (wireA3lbl.getIcon() == redIcon) ? "Red" : (wireA3lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireA4 = (wireA4lbl.getIcon() == whiteIcon) ? "White" : (wireA4lbl.getIcon() == blackIcon) ? "Black" : (wireA4lbl.getIcon() == redIcon) ? "Red" : (wireA4lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireB1 = (wireB1lbl.getIcon() == whiteIcon) ? "White" : (wireB1lbl.getIcon() == blackIcon) ? "Black" : (wireB1lbl.getIcon() == redIcon) ? "Red" : (wireB1lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireB2 = (wireB2lbl.getIcon() == whiteIcon) ? "White" : (wireB2lbl.getIcon() == blackIcon) ? "Black" : (wireB2lbl.getIcon() == redIcon) ? "Red" : (wireB2lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireB3 = (wireB3lbl.getIcon() == whiteIcon) ? "White" : (wireB3lbl.getIcon() == blackIcon) ? "Black" : (wireB3lbl.getIcon() == redIcon) ? "Red" : (wireB3lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireB4 = (wireB4lbl.getIcon() == whiteIcon) ? "White" : (wireB4lbl.getIcon() == blackIcon) ? "Black" : (wireB4lbl.getIcon() == redIcon) ? "Red" : (wireB4lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireC1 = (wireC1lbl.getIcon() == whiteIcon) ? "White" : (wireC1lbl.getIcon() == blackIcon) ? "Black" : (wireC1lbl.getIcon() == redIcon) ? "Red" : (wireC1lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireC2 = (wireC2lbl.getIcon() == whiteIcon) ? "White" : (wireC2lbl.getIcon() == blackIcon) ? "Black" : (wireC2lbl.getIcon() == redIcon) ? "Red" : (wireC2lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireC3 = (wireC3lbl.getIcon() == whiteIcon) ? "White" : (wireC3lbl.getIcon() == blackIcon) ? "Black" : (wireC3lbl.getIcon() == redIcon) ? "Red" : (wireC3lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireC4 = (wireC4lbl.getIcon() == whiteIcon) ? "White" : (wireC4lbl.getIcon() == blackIcon) ? "Black" : (wireC4lbl.getIcon() == redIcon) ? "Red" : (wireC4lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireD1 = (wireD1lbl.getIcon() == whiteIcon) ? "White" : (wireD1lbl.getIcon() == blackIcon) ? "Black" : (wireD1lbl.getIcon() == redIcon) ? "Red" : (wireD1lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireD2 = (wireD2lbl.getIcon() == whiteIcon) ? "White" : (wireD2lbl.getIcon() == blackIcon) ? "Black" : (wireD2lbl.getIcon() == redIcon) ? "Red" : (wireD2lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireD3 = (wireD3lbl.getIcon() == whiteIcon) ? "White" : (wireD3lbl.getIcon() == blackIcon) ? "Black" : (wireD3lbl.getIcon() == redIcon) ? "Red" : (wireD3lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            String wireD4 = (wireD4lbl.getIcon() == whiteIcon) ? "White" : (wireD4lbl.getIcon() == blackIcon) ? "Black" : (wireD4lbl.getIcon() == redIcon) ? "Red" : (wireD4lbl.getIcon() == yellowIcon) ? "Yellow" : "Blue";
            System.out.println("Wires");
            System.out.println(wireA1 + " " + wireB1 + " " + wireC1 + " " + wireD1);
            System.out.println(wireA2 + " " + wireB2 + " " + wireC2 + " " + wireD2);
            System.out.println(wireA3 + " " + wireB3 + " " + wireC3 + " " + wireD3);
            System.out.println(wireA4 + " " + wireB4 + " " + wireC4 + " " + wireD4);
            // Depending on C3, cut wires based on location and color
            System.out.println("C3 - " + wireC3);
            switch (wireC3) {
                case "Black":
                    if (wireD2.equals("Yellow")) {
                        System.out.println("D2 Yellow, cut");
                        wireD2lbl.setIcon(yellowCut);
                    } if (wireA2.equals("Blue")) {
                        System.out.println("A2 Blue, cut");
                        wireA2lbl.setIcon(blueCut);
                    } if (wireD3.equals("White")) {
                        System.out.println("D3 White, cut");
                        wireD3lbl.setIcon(whiteCut);
                    } if (wireB2.equals("White")) {
                        System.out.println("B2 White, cut");
                        wireB2lbl.setIcon(whiteCut);
                    } if (wireA1.equals("Red")) {
                        System.out.println("A1 Red, cut");
                        wireA1lbl.setIcon(redCut);
                    } if (wireC3.equals("Blue")) {
                        System.out.println(lols());
                        System.out.println("(C3 is Blue while C3 is also Black???)");
                    } if (wireB1.equals("Black")) {
                        System.out.println("B1 Black, cut");
                        wireB1lbl.setIcon(blackCut);
                    } if (wireC4.equals("Red")) {
                        System.out.println("C4 Red, cut");
                        wireC4lbl.setIcon(redCut);
                    } if (wireA3.equals("Yellow")) {
                        System.out.println("A3 Yellow, cut");
                        wireA3lbl.setIcon(yellowCut);
                    } if (wireD1.equals("Yellow")) {
                        System.out.println("D1 Yellow, cut");
                        wireD1lbl.setIcon(yellowCut);
                    }
                    break;
                case "Blue":
                    if (wireD1.equals("Yellow")) {
                        System.out.println("D1 Yellow, cut");
                        wireD1lbl.setIcon(yellowCut);
                    } if (wireC4.equals("Blue")) {
                        System.out.println("C4 Blue, cut");
                        wireC4lbl.setIcon(blueCut);
                    } if (wireD2.equals("White")) {
                        System.out.println("D2 White, cut");
                        wireD2lbl.setIcon(whiteCut);
                    } if (wireC1.equals("White")) {
                        System.out.println("C1 White, cut");
                        wireC1lbl.setIcon(whiteCut);
                    } if (wireB3.equals("Red")) {
                        System.out.println("B3 Red, cut");
                        wireB3lbl.setIcon(redCut);
                    } if (wireC2.equals("Blue")) {
                        System.out.println("C2 Blue, cut");
                        wireC2lbl.setIcon(blueCut);
                    } if (wireD4.equals("Black")) {
                        System.out.println("D4 Black, cut");
                        wireD4lbl.setIcon(blackCut);
                    } if (wireD3.equals("Red")) {
                        System.out.println("D3 Red, cut");
                        wireD3lbl.setIcon(redCut);
                    } if (wireC3.equals("Yellow")) {
                        System.out.println(lols());
                        System.out.println("(C3 is Yellow while C3 is also Blue???)");
                    } if (wireA1.equals("Yellow")) {
                        System.out.println("A1 Yellow, cut");
                        wireA1lbl.setIcon(yellowCut);
                    }
                    break;
                case "Red":
                    if (wireD2.equals("Yellow")) {
                        System.out.println("D2 Yellow, cut");
                        wireD2lbl.setIcon(yellowCut);
                    } if (wireA1.equals("Blue")) {
                        System.out.println("A1 Blue, cut");
                        wireA1lbl.setIcon(blueCut);
                    } if (wireD4.equals("White")) {
                        System.out.println("D4 White, cut");
                        wireD4lbl.setIcon(whiteCut);
                    } if (wireB4.equals("White")) {
                        System.out.println("B4 White, cut");
                        wireB4lbl.setIcon(whiteCut);
                    } if (wireC4.equals("Red")) {
                        System.out.println("C4 Red, cut");
                        wireC4lbl.setIcon(redCut);
                    } if (wireC1.equals("Blue")) {
                        System.out.println("C1 Blue, cut");
                        wireC1lbl.setIcon(blueCut);
                    } if (wireA4.equals("Black")) {
                        System.out.println("A4 Black, cut");
                        wireA4lbl.setIcon(blackCut);
                    } if (wireB1.equals("Red")) {
                        System.out.println("B1 Red, cut");
                        wireB1lbl.setIcon(redCut);
                    } if (wireA2.equals("Yellow")) {
                        System.out.println("A2 Yellow, cut");
                        wireA2lbl.setIcon(yellowCut);
                    } if (wireB2.equals("Yellow")) {
                        System.out.println("B2 Yellow, cut");
                        wireB2lbl.setIcon(yellowCut);
                    }
                    break;
                case "White":
                    if (wireA2.equals("Yellow")) {
                        System.out.println("A2 Yellow, cut");
                        wireA2lbl.setIcon(yellowCut);
                    } if (wireC4.equals("Blue")) {
                        System.out.println("C4 Blue, cut");
                        wireC4lbl.setIcon(blueCut);
                    } if (wireB3.equals("White")) {
                        System.out.println("B3 White, cut");
                        wireB3lbl.setIcon(whiteCut);
                    } if (wireA1.equals("White")) {
                        System.out.println("A1 White, cut");
                        wireA1lbl.setIcon(whiteCut);
                    } if (wireB2.equals("Red")) {
                        System.out.println("B2 Red, cut");
                        wireB2lbl.setIcon(redCut);
                    } if (wireD3.equals("Blue")) {
                        System.out.println("D3 Blue, cut");
                        wireD3lbl.setIcon(blueCut);
                    } if (wireD2.equals("Black")) {
                        System.out.println("D2 Black, cut");
                        wireD2lbl.setIcon(blackCut);
                    } if (wireC1.equals("Red")) {
                        System.out.println("C1 Red, cut");
                        wireC1lbl.setIcon(redCut);
                    } if (wireA4.equals("Yellow")) {
                        System.out.println("A4 Yellow, cut");
                        wireA4lbl.setIcon(yellowCut);
                    } if (wireB4.equals("Yellow")) {
                        System.out.println("B4 Yellow, cut");
                        wireB4lbl.setIcon(yellowCut);
                    }
                    break;
                case "Yellow":
                    if (wireD1.equals("Yellow")) {
                        System.out.println("D1 Yellow, cut");
                        wireD1lbl.setIcon(yellowCut);
                    } if (wireD4.equals("Blue")) {
                        System.out.println("D4 Blue, cut");
                        wireD4lbl.setIcon(blueCut);
                    } if (wireB2.equals("White")) {
                        System.out.println("B2 White, cut");
                        wireB2lbl.setIcon(whiteCut);
                    } if (wireC1.equals("White")) {
                        System.out.println("C1 White, cut");
                        wireC1lbl.setIcon(whiteCut);
                    } if (wireB3.equals("Red")) {
                        System.out.println("B3 Red, cut");
                        wireB3lbl.setIcon(redCut);
                    } if (wireB1.equals("Blue")) {
                        System.out.println("B1 Blue, cut");
                        wireB1lbl.setIcon(blueCut);
                    } if (wireB4.equals("Black")) {
                        System.out.println("B4 Black, cut");
                        wireB4lbl.setIcon(blackCut);
                    } if (wireC2.equals("Red")) {
                        System.out.println("C2 Red, cut");
                        wireC2lbl.setIcon(redCut);
                    } if (wireA3.equals("Yellow")) {
                        System.out.println("A3 Yellow, cut");
                        wireA3lbl.setIcon(yellowCut);
                    } if (wireA4.equals("Yellow")) {
                        System.out.println("A4 Yellow, cut");
                        wireA4lbl.setIcon(yellowCut);
                    }
                    break;
            }
            // If icon isn't a cut icon, set it to a don't cut icon.
            // Man do I wish you could add an char inbetween the var name. Then I could just use a for statement instead of this garbage.
            if (wireA1lbl.getIcon() == whiteIcon) wireA1lbl.setIcon(whiteDontCut);
            if (wireA1lbl.getIcon() == blackIcon) wireA1lbl.setIcon(blackDontCut);
            if (wireA1lbl.getIcon() == redIcon) wireA1lbl.setIcon(redDontCut);
            if (wireA1lbl.getIcon() == yellowIcon) wireA1lbl.setIcon(yellowDontCut);
            if (wireA1lbl.getIcon() == blueIcon) wireA1lbl.setIcon(blueDontCut);
            if (wireA2lbl.getIcon() == whiteIcon) wireA2lbl.setIcon(whiteDontCut);
            if (wireA2lbl.getIcon() == blackIcon) wireA2lbl.setIcon(blackDontCut);
            if (wireA2lbl.getIcon() == redIcon) wireA2lbl.setIcon(redDontCut);
            if (wireA2lbl.getIcon() == yellowIcon) wireA2lbl.setIcon(yellowDontCut);
            if (wireA2lbl.getIcon() == blueIcon) wireA2lbl.setIcon(blueDontCut);
            if (wireA3lbl.getIcon() == whiteIcon) wireA3lbl.setIcon(whiteDontCut);
            if (wireA3lbl.getIcon() == blackIcon) wireA3lbl.setIcon(blackDontCut);
            if (wireA3lbl.getIcon() == redIcon) wireA3lbl.setIcon(redDontCut);
            if (wireA3lbl.getIcon() == yellowIcon) wireA3lbl.setIcon(yellowDontCut);
            if (wireA3lbl.getIcon() == blueIcon) wireA3lbl.setIcon(blueDontCut);
            if (wireA4lbl.getIcon() == whiteIcon) wireA4lbl.setIcon(whiteDontCut);
            if (wireA4lbl.getIcon() == blackIcon) wireA4lbl.setIcon(blackDontCut);
            if (wireA4lbl.getIcon() == redIcon) wireA4lbl.setIcon(redDontCut);
            if (wireA4lbl.getIcon() == yellowIcon) wireA4lbl.setIcon(yellowDontCut);
            if (wireA4lbl.getIcon() == blueIcon) wireA4lbl.setIcon(blueDontCut);
            if (wireB1lbl.getIcon() == whiteIcon) wireB1lbl.setIcon(whiteDontCut);
            if (wireB1lbl.getIcon() == blackIcon) wireB1lbl.setIcon(blackDontCut);
            if (wireB1lbl.getIcon() == redIcon) wireB1lbl.setIcon(redDontCut);
            if (wireB1lbl.getIcon() == yellowIcon) wireB1lbl.setIcon(yellowDontCut);
            if (wireB1lbl.getIcon() == blueIcon) wireB1lbl.setIcon(blueDontCut);
            if (wireB2lbl.getIcon() == whiteIcon) wireB2lbl.setIcon(whiteDontCut);
            if (wireB2lbl.getIcon() == blackIcon) wireB2lbl.setIcon(blackDontCut);
            if (wireB2lbl.getIcon() == redIcon) wireB2lbl.setIcon(redDontCut);
            if (wireB2lbl.getIcon() == yellowIcon) wireB2lbl.setIcon(yellowDontCut);
            if (wireB2lbl.getIcon() == blueIcon) wireB2lbl.setIcon(blueDontCut);
            if (wireB3lbl.getIcon() == whiteIcon) wireB3lbl.setIcon(whiteDontCut);
            if (wireB3lbl.getIcon() == blackIcon) wireB3lbl.setIcon(blackDontCut);
            if (wireB3lbl.getIcon() == redIcon) wireB3lbl.setIcon(redDontCut);
            if (wireB3lbl.getIcon() == yellowIcon) wireB3lbl.setIcon(yellowDontCut);
            if (wireB3lbl.getIcon() == blueIcon) wireB3lbl.setIcon(blueDontCut);
            if (wireB4lbl.getIcon() == whiteIcon) wireB4lbl.setIcon(whiteDontCut);
            if (wireB4lbl.getIcon() == blackIcon) wireB4lbl.setIcon(blackDontCut);
            if (wireB4lbl.getIcon() == redIcon) wireB4lbl.setIcon(redDontCut);
            if (wireB4lbl.getIcon() == yellowIcon) wireB4lbl.setIcon(yellowDontCut);
            if (wireB4lbl.getIcon() == blueIcon) wireB4lbl.setIcon(blueDontCut);
            if (wireC1lbl.getIcon() == whiteIcon) wireC1lbl.setIcon(whiteDontCut);
            if (wireC1lbl.getIcon() == blackIcon) wireC1lbl.setIcon(blackDontCut);
            if (wireC1lbl.getIcon() == redIcon) wireC1lbl.setIcon(redDontCut);
            if (wireC1lbl.getIcon() == yellowIcon) wireC1lbl.setIcon(yellowDontCut);
            if (wireC1lbl.getIcon() == blueIcon) wireC1lbl.setIcon(blueDontCut);
            if (wireC2lbl.getIcon() == whiteIcon) wireC2lbl.setIcon(whiteDontCut);
            if (wireC2lbl.getIcon() == blackIcon) wireC2lbl.setIcon(blackDontCut);
            if (wireC2lbl.getIcon() == redIcon) wireC2lbl.setIcon(redDontCut);
            if (wireC2lbl.getIcon() == yellowIcon) wireC2lbl.setIcon(yellowDontCut);
            if (wireC2lbl.getIcon() == blueIcon) wireC2lbl.setIcon(blueDontCut);
            if (wireC3lbl.getIcon() == whiteIcon) wireC3lbl.setIcon(whiteDontCut);
            if (wireC3lbl.getIcon() == blackIcon) wireC3lbl.setIcon(blackDontCut);
            if (wireC3lbl.getIcon() == redIcon) wireC3lbl.setIcon(redDontCut);
            if (wireC3lbl.getIcon() == yellowIcon) wireC3lbl.setIcon(yellowDontCut);
            if (wireC3lbl.getIcon() == blueIcon) wireC3lbl.setIcon(blueDontCut);
            if (wireC4lbl.getIcon() == whiteIcon) wireC4lbl.setIcon(whiteDontCut);
            if (wireC4lbl.getIcon() == blackIcon) wireC4lbl.setIcon(blackDontCut);
            if (wireC4lbl.getIcon() == redIcon) wireC4lbl.setIcon(redDontCut);
            if (wireC4lbl.getIcon() == yellowIcon) wireC4lbl.setIcon(yellowDontCut);
            if (wireC4lbl.getIcon() == blueIcon) wireC4lbl.setIcon(blueDontCut);
            if (wireD1lbl.getIcon() == whiteIcon) wireD1lbl.setIcon(whiteDontCut);
            if (wireD1lbl.getIcon() == blackIcon) wireD1lbl.setIcon(blackDontCut);
            if (wireD1lbl.getIcon() == redIcon) wireD1lbl.setIcon(redDontCut);
            if (wireD1lbl.getIcon() == yellowIcon) wireD1lbl.setIcon(yellowDontCut);
            if (wireD1lbl.getIcon() == blueIcon) wireD1lbl.setIcon(blueDontCut);
            if (wireD2lbl.getIcon() == whiteIcon) wireD2lbl.setIcon(whiteDontCut);
            if (wireD2lbl.getIcon() == blackIcon) wireD2lbl.setIcon(blackDontCut);
            if (wireD2lbl.getIcon() == redIcon) wireD2lbl.setIcon(redDontCut);
            if (wireD2lbl.getIcon() == yellowIcon) wireD2lbl.setIcon(yellowDontCut);
            if (wireD2lbl.getIcon() == blueIcon) wireD2lbl.setIcon(blueDontCut);
            if (wireD3lbl.getIcon() == whiteIcon) wireD3lbl.setIcon(whiteDontCut);
            if (wireD3lbl.getIcon() == blackIcon) wireD3lbl.setIcon(blackDontCut);
            if (wireD3lbl.getIcon() == redIcon) wireD3lbl.setIcon(redDontCut);
            if (wireD3lbl.getIcon() == yellowIcon) wireD3lbl.setIcon(yellowDontCut);
            if (wireD3lbl.getIcon() == blueIcon) wireD3lbl.setIcon(blueDontCut);
            if (wireD4lbl.getIcon() == whiteIcon) wireD4lbl.setIcon(whiteDontCut);
            if (wireD4lbl.getIcon() == blackIcon) wireD4lbl.setIcon(blackDontCut);
            if (wireD4lbl.getIcon() == redIcon) wireD4lbl.setIcon(redDontCut);
            if (wireD4lbl.getIcon() == yellowIcon) wireD4lbl.setIcon(yellowDontCut);
            if (wireD4lbl.getIcon() == blueIcon) wireD4lbl.setIcon(blueDontCut);
        });
        clear.addActionListener((ActionEvent e) -> {
            wireA1lbl.setIcon(whiteIcon);
            wireA2lbl.setIcon(whiteIcon);
            wireA3lbl.setIcon(whiteIcon);
            wireA4lbl.setIcon(whiteIcon);
            wireB1lbl.setIcon(whiteIcon);
            wireB2lbl.setIcon(whiteIcon);
            wireB3lbl.setIcon(whiteIcon);
            wireB4lbl.setIcon(whiteIcon);
            wireC1lbl.setIcon(whiteIcon);
            wireC2lbl.setIcon(whiteIcon);
            wireC3lbl.setIcon(whiteIcon);
            wireC4lbl.setIcon(whiteIcon);
            wireD1lbl.setIcon(whiteIcon);
            wireD2lbl.setIcon(whiteIcon);
            wireD3lbl.setIcon(whiteIcon);
            wireD4lbl.setIcon(whiteIcon);
        });
        // Image changing
        // If statement for collapsing code
        if (true) {
            wireA1lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireA1lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireA1lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireA1lbl.setIcon(whiteIcon); break;
                            case "Black": wireA1lbl.setIcon(blackIcon); break;
                            case "Red": wireA1lbl.setIcon(redIcon); break;
                            case "Yellow": wireA1lbl.setIcon(yellowIcon); break;
                            default: wireA1lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireA2lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireA2lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireA2lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireA2lbl.setIcon(whiteIcon); break;
                            case "Black": wireA2lbl.setIcon(blackIcon); break;
                            case "Red": wireA2lbl.setIcon(redIcon); break;
                            case "Yellow": wireA2lbl.setIcon(yellowIcon); break;
                            default: wireA2lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireA3lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireA3lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireA3lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireA3lbl.setIcon(whiteIcon); break;
                            case "Black": wireA3lbl.setIcon(blackIcon); break;
                            case "Red": wireA3lbl.setIcon(redIcon); break;
                            case "Yellow": wireA3lbl.setIcon(yellowIcon); break;
                            default: wireA3lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireA4lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireA4lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireA4lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireA4lbl.setIcon(whiteIcon); break;
                            case "Black": wireA4lbl.setIcon(blackIcon); break;
                            case "Red": wireA4lbl.setIcon(redIcon); break;
                            case "Yellow": wireA4lbl.setIcon(yellowIcon); break;
                            default: wireA4lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireB1lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireB1lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireB1lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireB1lbl.setIcon(whiteIcon); break;
                            case "Black": wireB1lbl.setIcon(blackIcon); break;
                            case "Red": wireB1lbl.setIcon(redIcon); break;
                            case "Yellow": wireB1lbl.setIcon(yellowIcon); break;
                            default: wireB1lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireB2lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireB2lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireB2lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireB2lbl.setIcon(whiteIcon); break;
                            case "Black": wireB2lbl.setIcon(blackIcon); break;
                            case "Red": wireB2lbl.setIcon(redIcon); break;
                            case "Yellow": wireB2lbl.setIcon(yellowIcon); break;
                            default: wireB2lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireB3lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireB3lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireB3lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireB3lbl.setIcon(whiteIcon); break;
                            case "Black": wireB3lbl.setIcon(blackIcon); break;
                            case "Red": wireB3lbl.setIcon(redIcon); break;
                            case "Yellow": wireB3lbl.setIcon(yellowIcon); break;
                            default: wireB3lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireB4lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireB4lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireB4lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireB4lbl.setIcon(whiteIcon); break;
                            case "Black": wireB4lbl.setIcon(blackIcon); break;
                            case "Red": wireB4lbl.setIcon(redIcon); break;
                            case "Yellow": wireB4lbl.setIcon(yellowIcon); break;
                            default: wireB4lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireC1lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireC1lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireC1lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireC1lbl.setIcon(whiteIcon); break;
                            case "Black": wireC1lbl.setIcon(blackIcon); break;
                            case "Red": wireC1lbl.setIcon(redIcon); break;
                            case "Yellow": wireC1lbl.setIcon(yellowIcon); break;
                            default: wireC1lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireC2lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireC2lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireC2lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireC2lbl.setIcon(whiteIcon); break;
                            case "Black": wireC2lbl.setIcon(blackIcon); break;
                            case "Red": wireC2lbl.setIcon(redIcon); break;
                            case "Yellow": wireC2lbl.setIcon(yellowIcon); break;
                            default: wireC2lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireC3lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireC3lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireC3lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireC3lbl.setIcon(whiteIcon); break;
                            case "Black": wireC3lbl.setIcon(blackIcon); break;
                            case "Red": wireC3lbl.setIcon(redIcon); break;
                            case "Yellow": wireC3lbl.setIcon(yellowIcon); break;
                            default: wireC3lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireC4lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireC4lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireC4lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireC4lbl.setIcon(whiteIcon); break;
                            case "Black": wireC4lbl.setIcon(blackIcon); break;
                            case "Red": wireC4lbl.setIcon(redIcon); break;
                            case "Yellow": wireC4lbl.setIcon(yellowIcon); break;
                            default: wireC4lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireD1lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireD1lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireD1lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireD1lbl.setIcon(whiteIcon); break;
                            case "Black": wireD1lbl.setIcon(blackIcon); break;
                            case "Red": wireD1lbl.setIcon(redIcon); break;
                            case "Yellow": wireD1lbl.setIcon(yellowIcon); break;
                            default: wireD1lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireD2lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireD2lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireD2lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireD2lbl.setIcon(whiteIcon); break;
                            case "Black": wireD2lbl.setIcon(blackIcon); break;
                            case "Red": wireD2lbl.setIcon(redIcon); break;
                            case "Yellow": wireD2lbl.setIcon(yellowIcon); break;
                            default: wireD2lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireD3lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireD3lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireD3lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireD3lbl.setIcon(whiteIcon); break;
                            case "Black": wireD3lbl.setIcon(blackIcon); break;
                            case "Red": wireD3lbl.setIcon(redIcon); break;
                            case "Yellow": wireD3lbl.setIcon(yellowIcon); break;
                            default: wireD3lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
            wireD4lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.isShiftDown()) {
                        Icon icon = wireD4lbl.getIcon();
                        icon = (icon == whiteIcon) ? blackIcon : (icon == blackIcon) ? redIcon : (icon == redIcon) ? yellowIcon : (icon == yellowIcon) ? blueIcon : whiteIcon;
                        wireD4lbl.setIcon(icon);
                    } else {
                        String currCol = (String) colorChoose.getItemAt(colorChoose.getSelectedIndex());
                        switch (currCol) {
                            case "White": wireD4lbl.setIcon(whiteIcon); break;
                            case "Black": wireD4lbl.setIcon(blackIcon); break;
                            case "Red": wireD4lbl.setIcon(redIcon); break;
                            case "Yellow": wireD4lbl.setIcon(yellowIcon); break;
                            default: wireD4lbl.setIcon(blueIcon); break;
                        }
                    }
                }
            });
        }
    } private static String lols() {
        // Random messages for unreachable errors
        int rando = ThreadLocalRandom.current().nextInt(1,10+1);
        String out = "";
        switch (rando) {
            case 1: out = "You shouldn't be here, y'know."; break;
            case 2: out = "ERROR 404: NOT FOUND"; break;
            case 3: out = "How the hell? This is an unreachable statement..."; break;
            case 4: out = "SCP DETECTED!"; break;
            case 5: out = "You've been transported to the dinosaur era."; break;
            case 6: out = "*gnome noises*"; break;
            case 7: out = "Ya just got rick roll'd in " + Calendar.getInstance().get(Calendar.YEAR); break;
            case 8: out = "Found the hacker."; break;
            case 9: out = "You found a secret cookie! Talk to [GGTyler#8605] to claim it!"; break;
            case 10: out = "Yeetus Thy Fetus, this app has been fucked-us"; break;
        }
        return out;
    }
}