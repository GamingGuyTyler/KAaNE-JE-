/**
 * Wire Sequences, started work on 7/12/2018 3:28 PM
 * 
 * Finished version 0.1 on 7/14/2018 10:39 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class wireSequences {
    static JFrame f;
    private static int red = 0;
    private static int blue = 0;
    private static int black = 0;
    public static void module() {
        wireSequences.red = 0;
        wireSequences.blue = 0;
        wireSequences.black = 0;
        System.out.println("[WIRE SEQUENCES MODULE]");
        f = new JFrame("KAaNE [WIRE SEQUENCES MODULE]");
<<<<<<< HEAD
        ImageIcon icon = new ImageIcon("imgs/icons/wire sequences.png");
        f.setIconImage(icon.getImage());
=======
>>>>>>> 3dedd24bc3ad9a0d728ef4ef2433a9543d23f4e5
        // Define the Color String Array (To lessen the amount of code)
        String colors[] = {"Red","Blue","Black","N/A"};
        // Define the combo boxes
        JComboBox w1CB = new JComboBox(colors);
        w1CB.setBounds(10,40,70,20);
        JComboBox w2CB = new JComboBox(colors);
        w2CB.setBounds(90,40,70,20);
        JComboBox w3CB = new JComboBox(colors);
        w3CB.setBounds(170,40,70,20);
        JComboBox w4CB = new JComboBox(colors);
        w4CB.setBounds(10,110,70,20);
        JComboBox w5CB = new JComboBox(colors);
        w5CB.setBounds(90,110,70,20);
        JComboBox w6CB = new JComboBox(colors);
        w6CB.setBounds(170,110,70,20);
        JComboBox w7CB = new JComboBox(colors);
        w7CB.setBounds(10,180,70,20);
        JComboBox w8CB = new JComboBox(colors);
        w8CB.setBounds(90,180,70,20);
        JComboBox w9CB = new JComboBox(colors);
        w9CB.setBounds(170,180,70,20);
        JComboBox w10CB = new JComboBox(colors);
        w10CB.setBounds(10,250,70,20);
        JComboBox w11CB = new JComboBox(colors);
        w11CB.setBounds(90,250,70,20);
        JComboBox w12CB = new JComboBox(colors);
        w12CB.setBounds(170,250,70,20);
        // Define the labels
        JLabel w1Label = new JLabel("#1");
        w1Label.setBounds(35,10,30,20);
        JLabel w2Label = new JLabel("#2");
        w2Label.setBounds(115,10,30,20);
        JLabel w3Label = new JLabel("#3");
        w3Label.setBounds(195,10,30,20);
        JLabel w4Label = new JLabel("#4");
        w4Label.setBounds(35,80,30,20);
        JLabel w5Label = new JLabel("#5");
        w5Label.setBounds(115,80,30,20);
        JLabel w6Label = new JLabel("#6");
        w6Label.setBounds(195,80,30,20);
        JLabel w7Label = new JLabel("#7");
        w7Label.setBounds(35,150,30,20);
        JLabel w8Label = new JLabel("#8");
        w8Label.setBounds(115,150,30,20);
        JLabel w9Label = new JLabel("#9");
        w9Label.setBounds(195,150,30,20);
        JLabel w10Label = new JLabel("#10");
        w10Label.setBounds(35,220,30,20);
        JLabel w11Label = new JLabel("#11");
        w11Label.setBounds(115,220,30,20);
        JLabel w12Label = new JLabel("#12");
        w12Label.setBounds(195,220,30,20);
        // Define the buttons
        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(250,10,80,20);
        JButton w123Button = new JButton("NEXT");
        w123Button.setBounds(250,40,70,20);
        JButton w456Button = new JButton("NEXT");
        w456Button.setBounds(250,110,70,20);
        JButton w789Button = new JButton("NEXT");
        w789Button.setBounds(250,180,70,20);
        JButton w101112Button = new JButton("NEXT");
        w101112Button.setBounds(250,250,70,20);
        // Define the lines
        ImageIcon line = new ImageIcon("imgs/line.png");
        JLabel line123 = new JLabel(line);
        line123.setBounds(0,70,350,1);
        JLabel line456 = new JLabel(line);
        line456.setBounds(0,140,350,1);
        JLabel line789 = new JLabel(line);
        line789.setBounds(0,210,350,1);
        // Set stages 2-4 to non-visible
        w4CB.setVisible(false);
        w5CB.setVisible(false);
        w6CB.setVisible(false);
        w7CB.setVisible(false);
        w8CB.setVisible(false);
        w9CB.setVisible(false);
        w10CB.setVisible(false);
        w11CB.setVisible(false);
        w12CB.setVisible(false);
        w4Label.setVisible(false);
        w5Label.setVisible(false);
        w6Label.setVisible(false);
        w7Label.setVisible(false);
        w8Label.setVisible(false);
        w9Label.setVisible(false);
        w10Label.setVisible(false);
        w11Label.setVisible(false);
        w12Label.setVisible(false);
        w456Button.setVisible(false);
        w789Button.setVisible(false);
        w101112Button.setVisible(false);
        line123.setVisible(false);
        line456.setVisible(false);
        line789.setVisible(false);
        // Add everything to JFrame
        f.add(w1CB); f.add(w1Label); f.add(w2CB); f.add(w2Label); f.add(w3CB); f.add(w3Label); f.add(w123Button); f.add(resetButton); f.add(line123); f.add(w4CB); f.add(w5CB); f.add(w6CB); f.add(w4Label); f.add(w5Label); f.add(w6Label); f.add(w456Button); f.add(line456); f.add(w7CB); f.add(w8CB); f.add(w9CB); f.add(w7Label); f.add(w8Label); f.add(w9Label); f.add(w789Button); f.add(line789); f.add(w10CB); f.add(w11CB); f.add(w12CB); f.add(w10Label); f.add(w11Label); f.add(w12Label); f.add(w101112Button); 
        // Define the rest of the JFrame
        f.setLayout(null);
        f.setSize(350,330);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        resetButton.addActionListener((ActionEvent e) -> {
            System.out.println("RESET");
            // Reset the variables
            wireSequences.red = 0;
            wireSequences.blue = 0;
            wireSequences.black = 0;
            // Re-enable everything
            w1CB.setEnabled(true);
            w2CB.setEnabled(true);
            w3CB.setEnabled(true);
            w4CB.setEnabled(true);
            w5CB.setEnabled(true);
            w6CB.setEnabled(true);
            w7CB.setEnabled(true);
            w8CB.setEnabled(true);
            w9CB.setEnabled(true);
            w10CB.setEnabled(true);
            w11CB.setEnabled(true);
            w12CB.setEnabled(true);
            w123Button.setEnabled(true);
            w456Button.setEnabled(true);
            w789Button.setEnabled(true);
            w101112Button.setEnabled(true);
            // Reset the text of the labels
            w1Label.setText("#1");
            w2Label.setText("#2");
            w3Label.setText("#3");
            w4Label.setText("#4");
            w5Label.setText("#5");
            w6Label.setText("#6");
            w7Label.setText("#7");
            w8Label.setText("#8");
            w9Label.setText("#9");
            w10Label.setText("#10");
            w11Label.setText("#11");
            w12Label.setText("#12");
            // Re-position everything
            w1Label.setBounds(35,10,30,20);
            w2Label.setBounds(115,10,30,20);
            w3Label.setBounds(195,10,30,20);
            w4Label.setBounds(35,80,30,20);
            w5Label.setBounds(115,80,30,20);
            w6Label.setBounds(195,80,30,20);
            w7Label.setBounds(35,150,30,20);
            w8Label.setBounds(115,150,30,20);
            w9Label.setBounds(195,150,30,20);
            w10Label.setBounds(35,220,30,20);
            w11Label.setBounds(115,220,30,20);
            w12Label.setBounds(195,220,30,20);
            // Set stages 2-4 to non-visible
            w4CB.setVisible(false);
            w5CB.setVisible(false);
            w6CB.setVisible(false);
            w7CB.setVisible(false);
            w8CB.setVisible(false);
            w9CB.setVisible(false);
            w10CB.setVisible(false);
            w11CB.setVisible(false);
            w12CB.setVisible(false);
            w4Label.setVisible(false);
            w5Label.setVisible(false);
            w6Label.setVisible(false);
            w7Label.setVisible(false);
            w8Label.setVisible(false);
            w9Label.setVisible(false);
            w10Label.setVisible(false);
            w11Label.setVisible(false);
            w12Label.setVisible(false);
            w456Button.setVisible(false);
            w789Button.setVisible(false);
            w101112Button.setVisible(false);
            line123.setVisible(false);
            line456.setVisible(false);
            line789.setVisible(false);
        });
        // Stage 1
        w123Button.addActionListener((ActionEvent e) -> {
            String w1 = (String) w1CB.getItemAt(w1CB.getSelectedIndex());
            String w2 = (String) w2CB.getItemAt(w2CB.getSelectedIndex());
            String w3 = (String) w3CB.getItemAt(w3CB.getSelectedIndex());
            System.out.println("Wire 1 - " + w1);
            System.out.println("Wire 2 - " + w2);
            System.out.println("Wire 3 - " + w3);
            System.out.println("[Occurence/Wire]");
            if (w1.equals("Red")) {
                wireSequences.red = 1;
                w1Label.setBounds(20,10,50,20);
                w1Label.setText("CUT IF C");
                System.out.println("Red [1/1] - C");
            } else if (w1.equals("Blue")) {
                wireSequences.blue = 1;
                w1Label.setBounds(20,10,50,20);
                w1Label.setText("CUT IF B");
                System.out.println("Blue [1/1] - B");
            } else if (w1.equals("Black")) {
                wireSequences.black = 1;
                w1Label.setBounds(30,10,30,20);
                w1Label.setText("CUT");
                System.out.println("Black [1/1] - ABC");
            } else {
                w1Label.setText("");
                System.out.println("N/A [0/1] - Ignoring...");
            } if (w2.equals("Red")) {
                wireSequences.red = wireSequences.red + 1;
                if (wireSequences.red == 1) {
                    w2Label.setBounds(100,10,50,20);
                    w2Label.setText("CUT IF C");
                    System.out.println("Red [1/2] - C");
                } else {
                    w2Label.setBounds(100,10,50,20);
                    w2Label.setText("CUT IF B");
                    System.out.println("Red [2/2] - B");
                }
            } else if (w2.equals("Blue")) {
                wireSequences.blue = wireSequences.blue + 1;
                if (wireSequences.blue == 1) {
                    w2Label.setBounds(100,10,50,20);
                    w2Label.setText("CUT IF B");
                    System.out.println("Blue [1/2] - B");
                } else {
                    w2Label.setBounds(95,10,60,20);
                    w2Label.setText("CUT IF A/C");
                    System.out.println("Blue [2/2] - AC");
                }
            } else if (w2.equals("Black")) {
                wireSequences.black = wireSequences.black + 1;
                if (wireSequences.black == 1) {
                    w2Label.setBounds(110,10,30,20);
                    w2Label.setText("CUT");
                    System.out.println("Black [1/2] - ABC");
                } else {
                    w2Label.setBounds(95,10,60,20);
                    w2Label.setText("CUT IF A/C");
                    System.out.println("Black [2/2] - AC");
                }
            } else {
                w2Label.setText("");
                System.out.println("N/A [0/2] - Ignoring...");
            } if (w3.equals("Red")) {
                wireSequences.red = wireSequences.red + 1;
                if (wireSequences.red == 1) {
                    w3Label.setBounds(180,10,50,20);
                    w3Label.setText("CUT IF C");
                    System.out.println("Red [1/3] - C");
                } else if (wireSequences.red == 2) {
                    w3Label.setBounds(180,10,50,20);
                    w3Label.setText("CUT IF B");
                    System.out.println("Red [2/3] - B");
                } else {
                    w3Label.setBounds(180,10,50,20);
                    w3Label.setText("CUT IF A");
                    System.out.println("Red [3/3] - A");
                }
            } else if (w3.equals("Blue")) {
                wireSequences.blue = wireSequences.blue + 1;
                if ((wireSequences.blue == 1) || (wireSequences.blue == 3)) {
                    w3Label.setBounds(180,10,50,20);
                    w3Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/3] - B");
                } else {
                    w3Label.setBounds(175,10,60,20);
                    w3Label.setText("CUT IF A/C");
                    System.out.println("Blue [2/3] - AC");
                }
            } else if (w3.equals("Black")) {
                wireSequences.black = wireSequences.black + 1;
                if (wireSequences.black == 1) {
                    w3Label.setBounds(190,10,30,20);
                    w3Label.setText("CUT");
                    System.out.println("Black [1/3] - ABC");
                } else if (wireSequences.black == 2) {
                    w3Label.setBounds(175,10,60,20);
                    w3Label.setText("CUT IF A/C");
                    System.out.println("Black [2/3] - AC");
                } else {
                    w3Label.setBounds(180,10,50,20);
                    w3Label.setText("CUT IF B");
                    System.out.println("Black [3/3] - B");
                }
            } else {
                w3Label.setText("");
                System.out.println("N/A [0/3] - Ignoring...");
            }
            System.out.println("Red Total: " + wireSequences.red);
            System.out.println("Blue Total: " + wireSequences.blue);
            System.out.println("Black Total: " + wireSequences.black);
            System.out.println("Continuing onto stage 2...");
            // Disable stage 1
            w1CB.setEnabled(false);
            w2CB.setEnabled(false);
            w3CB.setEnabled(false);
            w123Button.setEnabled(false);
            // Make stage 2 visible
            line123.setVisible(true);
            w4CB.setVisible(true);
            w5CB.setVisible(true);
            w6CB.setVisible(true);
            w4Label.setVisible(true);
            w5Label.setVisible(true);
            w6Label.setVisible(true);
            w456Button.setVisible(true);
        });
        // Stage 2
        w456Button.addActionListener((ActionEvent e) -> {
            String w4 = (String) w4CB.getItemAt(w4CB.getSelectedIndex());
            String w5 = (String) w5CB.getItemAt(w5CB.getSelectedIndex());
            String w6 = (String) w6CB.getItemAt(w6CB.getSelectedIndex());
            System.out.println("Wire 4 - " + w4);
            System.out.println("Wire 5 - " + w5);
            System.out.println("Wire 6 - " + w6);
            if (w4.equals("Red")) {
                wireSequences.red = wireSequences.red + 1;
                if (wireSequences.red == 1) {
                    w4Label.setBounds(20,80,50,20);
                    w4Label.setText("CUT IF C");
                    System.out.println("Red [1/4] - C");
                } else if (wireSequences.red == 2) {
                    w4Label.setBounds(20,80,50,20);
                    w4Label.setText("CUT IF B");
                    System.out.println("Red [2/4] - B");
                } else if (wireSequences.red == 3){
                    w4Label.setBounds(20,80,50,20);
                    w4Label.setText("CUT IF A");
                    System.out.println("Red [3/4] - A");
                } else {
                    w4Label.setBounds(15,80,60,20);
                    w4Label.setText("CUT IF A/C");
                    System.out.println("Red [4/4] - AC");
                }
            } else if (w4.equals("Blue")) {
                wireSequences.blue = wireSequences.blue + 1;
                if ((wireSequences.blue == 1) || (wireSequences.blue == 3)) {
                    w4Label.setBounds(20,80,50,20);
                    w4Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/4] - B");
                } else if (wireSequences.blue == 2){
                    w4Label.setBounds(15,80,60,20);
                    w4Label.setText("CUT IF A/C");
                    System.out.println("Blue [2/4] - AC");
                } else {
                    w4Label.setBounds(20,80,50,20);
                    w4Label.setText("CUT IF A");
                    System.out.println("Blue [4/4] - A");
                }
            } else if (w4.equals("Black")) {
                wireSequences.black = wireSequences.black + 1;
                if (wireSequences.black == 1) {
                    w4Label.setBounds(30,80,30,20);
                    w4Label.setText("CUT");
                    System.out.println("Black [1/4] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w4Label.setBounds(15,80,60,20);
                    w4Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/4] - AC");
                } else {
                    w4Label.setBounds(20,80,50,20);
                    w4Label.setText("CUT IF B");
                    System.out.println("Black [3/4] - B");
                }
            } else {
                w4Label.setText("");
                System.out.println("N/A [0/4] - Ignoring...");
            }
            if (w5.equals("Red")) {
                wireSequences.red = wireSequences.red + 1;
                if (wireSequences.red == 1) {
                    w5Label.setBounds(100,80,50,20);
                    w5Label.setText("CUT IF C");
                    System.out.println("Red [1/5] - C");
                } else if (wireSequences.red == 2 || wireSequences.red == 5) {
                    w5Label.setBounds(100,80,50,20);
                    w5Label.setText("CUT IF B");
                    System.out.println("Red [" + wireSequences.red + "/5] - B");
                } else if (wireSequences.red == 3){
                    w5Label.setBounds(100,80,50,20);
                    w5Label.setText("CUT IF A");
                    System.out.println("Red [3/5] - A");
                } else {
                    w5Label.setBounds(95,80,60,20);
                    w5Label.setText("CUT IF A/C");
                    System.out.println("Red [4/5] - AC");
                }
            } else if (w5.equals("Blue")) {
                wireSequences.blue = wireSequences.blue + 1;
                if (wireSequences.blue == 1 || wireSequences.blue == 3 || wireSequences.blue == 5) {
                    w5Label.setBounds(100,80,50,20);
                    w5Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/5] - B");
                } else if (wireSequences.blue == 2){
                    w5Label.setBounds(95,80,60,20);
                    w5Label.setText("CUT IF A/C");
                    System.out.println("Blue [2/5] - AC");
                } else {
                    w5Label.setBounds(100,80,50,20);
                    w5Label.setText("CUT IF A");
                    System.out.println("Blue [4/5] - A");
                }
            } else if (w5.equals("Black")) {
                wireSequences.black = wireSequences.black + 1;
                if (wireSequences.black == 1) {
                    w5Label.setBounds(110,80,30,20);
                    w5Label.setText("CUT");
                    System.out.println("Black [1/5] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w5Label.setBounds(95,80,60,20);
                    w5Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/5] - AC");
                } else {
                    w5Label.setBounds(100,80,50,20);
                    w5Label.setText("CUT IF B");
                    System.out.println("Black [" + wireSequences.black + "/5] - B");
                }
            } else {
                w5Label.setText("");
                System.out.println("N/A [0/5] - Ignoring...");
            }
            if (w6.equals("Red")) {
                wireSequences.red = wireSequences.red + 1;
                if (wireSequences.red == 1) {
                    w6Label.setBounds(180,80,50,20);
                    w6Label.setText("CUT IF C");
                    System.out.println("Red [1/6] - C");
                } else if (wireSequences.red == 2 || wireSequences.red == 5) {
                    w6Label.setBounds(180,80,50,20);
                    w6Label.setText("CUT IF B");
                    System.out.println("Red [" + wireSequences.red + "/6] - B");
                } else if (wireSequences.red == 3){
                    w6Label.setBounds(180,80,50,20);
                    w6Label.setText("CUT IF A");
                    System.out.println("Red [3/6] - A");
                } else {
                    w6Label.setBounds(175,80,60,20);
                    w6Label.setText("CUT IF A/C");
                    System.out.println("Red [" + wireSequences.red + "/6] - AC");
                }
            } else if (w6.equals("Blue")) {
                wireSequences.blue = wireSequences.blue + 1;
                if (wireSequences.blue == 1 || wireSequences.blue == 3 || wireSequences.blue == 5) {
                    w6Label.setBounds(180,80,50,20);
                    w6Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/6] - B");
                } else if (wireSequences.blue == 2){
                    w6Label.setBounds(175,80,60,20);
                    w6Label.setText("CUT IF A/C");
                    System.out.println("Blue [2/6] - AC");
                } else if (wireSequences.blue == 4){
                    w6Label.setBounds(180,80,50,20);
                    w6Label.setText("CUT IF A");
                    System.out.println("Blue [4/6] - A");
                } else {
                    w6Label.setBounds(175,80,60,20);
                    w6Label.setText("CUT IF B/C");
                    System.out.println("Blue [6/6] - BC");
                }
            } else if (w6.equals("Black")) {
                wireSequences.black = wireSequences.black + 1;
                if (wireSequences.black == 1) {
                    w6Label.setBounds(190,80,30,20);
                    w6Label.setText("CUT");
                    System.out.println("Black [1/6] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w6Label.setBounds(175,80,60,20);
                    w6Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/6] - AC");
                } else if (wireSequences.black == 3 || wireSequences.black == 5) {
                    w6Label.setBounds(180,80,50,20);
                    w6Label.setText("CUT IF B");
                    System.out.println("Black [" + wireSequences.black + "/6] - B");
                } else {
                    w6Label.setBounds(175,80,60,20);
                    w6Label.setText("CUT IF B/C");
                    System.out.println("Black [6/6] - BC");
                }
            } else {
                w6Label.setText("");
                System.out.println("N/A [0/6] - Ignoring...");
            }
            System.out.println("Red Total: " + wireSequences.red);
            System.out.println("Blue Total: " + wireSequences.blue);
            System.out.println("Black Total: " + wireSequences.black);
            System.out.println("Continuing onto stage 3...");
            // Disable stage 2
            w4CB.setEnabled(false);
            w5CB.setEnabled(false);
            w6CB.setEnabled(false);
            w456Button.setEnabled(false);
            // Make stage 3 visible
            line456.setVisible(true);
            w7CB.setVisible(true);
            w8CB.setVisible(true);
            w9CB.setVisible(true);
            w7Label.setVisible(true);
            w8Label.setVisible(true);
            w9Label.setVisible(true);
            w789Button.setVisible(true);
        });
        // Stage 3
        w789Button.addActionListener((ActionEvent e) -> {
            String w7 = (String) w7CB.getItemAt(w7CB.getSelectedIndex());
            String w8 = (String) w8CB.getItemAt(w8CB.getSelectedIndex());
            String w9 = (String) w9CB.getItemAt(w9CB.getSelectedIndex());
            System.out.println("Wire 7 - " + w7);
            System.out.println("Wire 8 - " + w8);
            System.out.println("Wire 9 - " + w9);
            if (w7.equals("Red")) {
                wireSequences.red = wireSequences.red + 1;
                if (wireSequences.red == 1) {
                    w7Label.setBounds(20,150,50,20);
                    w7Label.setText("CUT IF C");
                    System.out.println("Red [1/7] - C");
                } else if (wireSequences.red == 2 || wireSequences.red == 5) {
                    w7Label.setBounds(20,150,50,20);
                    w7Label.setText("CUT IF B");
                    System.out.println("Red [" + wireSequences.red + "/7] - B");
                } else if (wireSequences.red == 3){
                    w7Label.setBounds(20,150,50,20);
                    w7Label.setText("CUT IF A");
                    System.out.println("Red [3/7] - A");
                } else if (wireSequences.red == 4 || wireSequences.red == 6) {
                    w7Label.setBounds(15,150,60,20);
                    w7Label.setText("CUT IF A/C");
                    System.out.println("Red [" + wireSequences.red + "/7] - AC");
                } else {
                    w7Label.setBounds(30,150,30,20);
                    w7Label.setText("CUT");
                    System.out.println("Red [7/7] - ABC");
                }
            } else if (w7.equals("Blue")) {
                wireSequences.blue = wireSequences.blue + 1;
                if (wireSequences.blue == 1 || wireSequences.blue == 3 || wireSequences.blue == 5) {
                    w7Label.setBounds(20,150,50,20);
                    w7Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/7] - B");
                } else if (wireSequences.blue == 2){
                    w7Label.setBounds(15,150,60,20);
                    w7Label.setText("CUT IF A/C");
                    System.out.println("Blue [2/7] - AC");
                } else if (wireSequences.blue == 4){
                    w7Label.setBounds(20,150,50,20);
                    w7Label.setText("CUT IF A");
                    System.out.println("Blue [4/7] - A");
                } else if (wireSequences.blue == 6){
                    w7Label.setBounds(15,150,60,20);
                    w7Label.setText("CUT IF B/C");
                    System.out.println("Blue [6/7] - BC");
                } else {
                    w7Label.setBounds(20,150,50,20);
                    w7Label.setText("CUT IF C");
                    System.out.println("Blue [7/7] - C");
                }
            } else if (w7.equals("Black")) {
                wireSequences.black = wireSequences.black + 1;
                if (wireSequences.black == 1) {
                    w7Label.setBounds(30,150,30,20);
                    w7Label.setText("CUT");
                    System.out.println("Black [1/7] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w7Label.setBounds(15,150,60,20);
                    w7Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/7] - AC");
                } else if (wireSequences.black == 3 || wireSequences.black == 5) {
                    w7Label.setBounds(20,150,50,20);
                    w7Label.setText("CUT IF B");
                    System.out.println("Black [" + wireSequences.black + "/7] - B");
                } else if (wireSequences.black == 6){
                    w7Label.setBounds(15,150,60,20);
                    w7Label.setText("CUT IF B/C");
                    System.out.println("Black [6/7] - BC");
                } else {
                    w7Label.setBounds(15,150,60,20);
                    w7Label.setText("CUT IF A/B");
                    System.out.println("Black [7/7] - AB");
                }
            } else {
                w7Label.setText("");
                System.out.println("N/A [0/7] - Ignoring...");
            }
            if (w8.equals("Red")) {
                wireSequences.red = wireSequences.red + 1;
                if (wireSequences.red == 1) {
                    w8Label.setBounds(100,150,50,20);
                    w8Label.setText("CUT IF C");
                    System.out.println("Red [1/8] - C");
                } else if (wireSequences.red == 2 || wireSequences.red == 5) {
                    w8Label.setBounds(100,150,50,20);
                    w8Label.setText("CUT IF B");
                    System.out.println("Red [" + wireSequences.red + "/8] - B");
                } else if (wireSequences.red == 3){
                    w8Label.setBounds(100,150,50,20);
                    w8Label.setText("CUT IF A");
                    System.out.println("Red [3/8] - A");
                } else if (wireSequences.red == 4 || wireSequences.red == 6){
                    w8Label.setBounds(95,150,60,20);
                    w8Label.setText("CUT IF A/C");
                    System.out.println("Red [" + wireSequences.red + "/8] - AC");
                } else if (wireSequences.red == 7) {
                    w8Label.setBounds(110,150,30,20);
                    w8Label.setText("CUT");
                    System.out.println("Red [7/8] - ABC");
                } else {
                    w8Label.setBounds(95,150,60,20);
                    w8Label.setText("CUT IF A/B");
                    System.out.println("Red [8/8] - AB");
                }
            } else if (w8.equals("Blue")) {
                wireSequences.blue = wireSequences.blue + 1;
                if (wireSequences.blue == 1 || wireSequences.blue == 3 || wireSequences.blue == 5) {
                    w8Label.setBounds(100,150,50,20);
                    w8Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/8] - B");
                } else if (wireSequences.blue == 2 || wireSequences.blue == 8){
                    w8Label.setBounds(95,150,60,20);
                    w8Label.setText("CUT IF A/C");
                    System.out.println("Blue [" + wireSequences.blue + "/8] - AC");
                } else if (wireSequences.blue == 4){
                    w8Label.setBounds(100,150,50,20);
                    w8Label.setText("CUT IF A");
                    System.out.println("Blue [4/8] - A");
                } else if (wireSequences.blue == 6){
                    w8Label.setBounds(95,150,60,20);
                    w8Label.setText("CUT IF B/C");
                    System.out.println("Blue [6/8] - BC");
                } else {
                    w8Label.setBounds(100,150,50,20);
                    w8Label.setText("CUT IF C");
                    System.out.println("Blue [7/8] - C");
                }
            } else if (w8.equals("Black")) {
                wireSequences.black = wireSequences.black + 1;
                if (wireSequences.black == 1) {
                    w8Label.setBounds(110,150,30,20);
                    w8Label.setText("CUT");
                    System.out.println("Black [1/8] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w8Label.setBounds(95,150,60,20);
                    w8Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/8] - AC");
                } else if (wireSequences.black == 3 || wireSequences.black == 5) {
                    w8Label.setBounds(100,150,50,20);
                    w8Label.setText("CUT IF B");
                    System.out.println("Black [" + wireSequences.black + "/8] - B");
                } else if (wireSequences.black == 6) {
                    w8Label.setBounds(95,150,60,20);
                    w8Label.setText("CUT IF B/C");
                    System.out.println("Black [6/8] - BC");
                } else if (wireSequences.black == 7) {
                    w8Label.setBounds(95,150,60,20);
                    w8Label.setText("CUT IF A/B");
                    System.out.println("Black [7/8] - AB");
                } else {
                    w8Label.setBounds(100,150,50,20);
                    w8Label.setText("CUT IF C");
                    System.out.println("Black [8/8] - C");
                }
            } else {
                w8Label.setText("");
                System.out.println("N/A [0/8] - Ignoring...");
            }
            if (w9.equals("Red")) {
                wireSequences.red = wireSequences.red + 1;
                if (wireSequences.red == 1) {
                    w9Label.setBounds(180,150,50,20);
                    w9Label.setText("CUT IF C");
                    System.out.println("Red [1/9] - C");
                } else if (wireSequences.red == 2 || wireSequences.red == 5 || wireSequences.red == 9) {
                    w9Label.setBounds(180,150,50,20);
                    w9Label.setText("CUT IF B");
                    System.out.println("Red [" + wireSequences.red + "/9] - B");
                } else if (wireSequences.red == 3){
                    w9Label.setBounds(180,150,50,20);
                    w9Label.setText("CUT IF A");
                    System.out.println("Red [3/9] - A");
                } else if (wireSequences.red == 4 || wireSequences.red == 6){
                    w9Label.setBounds(175,150,60,20);
                    w9Label.setText("CUT IF A/C");
                    System.out.println("Red [" + wireSequences.red + "/9] - AC");
                } else if (wireSequences.red == 7) {
                    w9Label.setBounds(190,150,30,20);
                    w9Label.setText("CUT");
                    System.out.println("Red [7/9] - ABC");
                } else {
                    w9Label.setBounds(175,150,60,20);
                    w9Label.setText("CUT IF A/B");
                    System.out.println("Red [8/9] - AB");
                }
            } else if (w9.equals("Blue")) {
                wireSequences.blue = wireSequences.blue + 1;
                if (wireSequences.blue == 1 || wireSequences.blue == 3 || wireSequences.blue == 5) {
                    w9Label.setBounds(180,150,50,20);
                    w9Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/9] - B");
                } else if (wireSequences.blue == 2 || wireSequences.blue == 8){
                    w9Label.setBounds(175,150,60,20);
                    w9Label.setText("CUT IF A/C");
                    System.out.println("Blue [" + wireSequences.blue + "/9] - AC");
                } else if (wireSequences.blue == 4 || wireSequences.blue == 9){
                    w9Label.setBounds(180,150,50,20);
                    w9Label.setText("CUT IF A");
                    System.out.println("Blue [" + wireSequences.blue + "/9] - A");
                } else if (wireSequences.blue == 6) {
                    w9Label.setBounds(175,150,60,20);
                    w9Label.setText("CUT IF B/C");
                    System.out.println("Blue [6/9] - BC");
                } else {
                    w9Label.setBounds(180,150,50,20);
                    w9Label.setText("CUT IF C");
                    System.out.println("Blue [7/9] - C");
                }
            } else if (w9.equals("Black")) {
                wireSequences.black = wireSequences.black + 1;
                if (wireSequences.black == 1) {
                    w9Label.setBounds(190,150,30,20);
                    w9Label.setText("CUT");
                    System.out.println("Black [1/9] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w9Label.setBounds(175,150,60,20);
                    w9Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/9] - AC");
                } else if (wireSequences.black == 3 || wireSequences.black == 5) {
                    w9Label.setBounds(180,150,50,20);
                    w9Label.setText("CUT IF B");
                    System.out.println("Black [" + wireSequences.black + "/9] - B");
                } else if (wireSequences.black == 6){
                    w9Label.setBounds(175,150,60,20);
                    w9Label.setText("CUT IF B/C");
                    System.out.println("Black [6/9] - BC");
                } else if (wireSequences.black == 7) {
                    w9Label.setBounds(175,150,60,20);
                    w9Label.setText("CUT IF A/B");
                    System.out.println("Black [7/9] - AB");
                } else {
                    w9Label.setBounds(180,150,50,20);
                    w9Label.setText("CUT IF C");
                    System.out.println("Black [" + wireSequences.black + "/9] - C");
                }
            } else {
                w9Label.setText("");
                System.out.println("N/A [0/9] - Ignoring...");
            }
            System.out.println("Red Total: " + wireSequences.red);
            System.out.println("Blue Total: " + wireSequences.blue);
            System.out.println("Black Total: " + wireSequences.black);
            System.out.println("Continuing onto stage 4...");
            // Disable stage 3
            w7CB.setEnabled(false);
            w8CB.setEnabled(false);
            w9CB.setEnabled(false);
            w789Button.setEnabled(false);
            // Make stage 4 visible
            line789.setVisible(true);
            w10CB.setVisible(true);
            w11CB.setVisible(true);
            w12CB.setVisible(true);
            w10Label.setVisible(true);
            w11Label.setVisible(true);
            w12Label.setVisible(true);
            w101112Button.setVisible(true);
        });
        w101112Button.addActionListener((ActionEvent e) -> {
            String w10 = (String) w10CB.getItemAt(w10CB.getSelectedIndex());
            String w11 = (String) w11CB.getItemAt(w11CB.getSelectedIndex());
            String w12 = (String) w12CB.getItemAt(w12CB.getSelectedIndex());
            if (w10.equals("Red")) {
                if (wireSequences.red == 9) {
                    ;
                } else {
                    wireSequences.red = wireSequences.red + 1;
                }
                if (wireSequences.red == 1) {
                    w10Label.setBounds(20,220,50,20);
                    w10Label.setText("CUT IF C");
                    System.out.println("Red [1/10] - C");
                } else if (wireSequences.red == 2 || wireSequences.red == 5 || wireSequences.red == 9) {
                    w10Label.setBounds(20,220,50,20);
                    w10Label.setText("CUT IF B");
                    System.out.println("Red [" + wireSequences.red + "/10] - B");
                } else if (wireSequences.red == 3){
                    w10Label.setBounds(20,220,50,20);
                    w10Label.setText("CUT IF A");
                    System.out.println("Red [3/10] - A");
                } else if (wireSequences.red == 4 || wireSequences.red == 6){
                    w10Label.setBounds(15,220,60,20);
                    w10Label.setText("CUT IF A/C");
                    System.out.println("Red [" + wireSequences.red + "/10] - AC");
                } else if (wireSequences.red == 7) {
                    w10Label.setBounds(30,220,30,20);
                    w10Label.setText("CUT");
                    System.out.println("Red [7/10] - ABC");
                } else {
                    w10Label.setBounds(15,220,60,20);
                    w10Label.setText("CUT IF A/B");
                    System.out.println("Red [8/10] - AB");
                }
            } else if (w10.equals("Blue")) {
                if (wireSequences.blue == 9) {
                    ;
                } else {
                    wireSequences.blue = wireSequences.blue + 1;
                }
                if (wireSequences.blue == 1 || wireSequences.blue == 3 || wireSequences.blue == 5) {
                    w10Label.setBounds(20,220,50,20);
                    w10Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/10] - B");
                } else if (wireSequences.blue == 2 || wireSequences.blue == 8){
                    w10Label.setBounds(15,220,60,20);
                    w10Label.setText("CUT IF A/C");
                    System.out.println("Blue [" + wireSequences.blue + "/10] - AC");
                } else if (wireSequences.blue == 4 || wireSequences.blue == 9){
                    w10Label.setBounds(20,220,50,20);
                    w10Label.setText("CUT IF A");
                    System.out.println("Blue [" + wireSequences.blue + "/10] - A");
                } else if (wireSequences.blue == 6) {
                    w10Label.setBounds(15,220,60,20);
                    w10Label.setText("CUT IF B/C");
                    System.out.println("Blue [6/10] - BC");
                } else {
                    w10Label.setBounds(20,220,50,20);
                    w10Label.setText("CUT IF C");
                    System.out.println("Blue [7/10] - C");
                }
            } else if (w10.equals("Black")) {
                if (wireSequences.black == 9) {
                    ;
                } else {
                    wireSequences.black = wireSequences.black + 1;
                }
                if (wireSequences.black == 1) {
                    w10Label.setBounds(30,220,30,20);
                    w10Label.setText("CUT");
                    System.out.println("Black [1/10] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w10Label.setBounds(15,220,60,20);
                    w10Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/10] - AC");
                } else if (wireSequences.black == 3 || wireSequences.black == 5) {
                    w10Label.setBounds(20,220,50,20);
                    w10Label.setText("CUT IF B");
                    System.out.println("Black [" + wireSequences.black + "/10] - B");
                } else if (wireSequences.black == 6){
                    w10Label.setBounds(15,220,60,20);
                    w10Label.setText("CUT IF B/C");
                    System.out.println("Black [6/10] - BC");
                } else if (wireSequences.black == 7) {
                    w10Label.setBounds(15,220,60,20);
                    w10Label.setText("CUT IF A/B");
                    System.out.println("Black [7/10] - AB");
                } else {
                    w10Label.setBounds(20,220,50,20);
                    w10Label.setText("CUT IF C");
                    System.out.println("Black [" + wireSequences.black + "/10] - C");
                }
            } else {
                w10Label.setText("");
                System.out.println("N/A [0/10] - Ignoring...");
            }
            if (w11.equals("Red")) {
                if (wireSequences.red == 9) {
                    ;
                } else {
                    wireSequences.red = wireSequences.red + 1;
                }
                if (wireSequences.red == 1) {
                    w11Label.setBounds(100,220,50,20);
                    w11Label.setText("CUT IF C");
                    System.out.println("Red [1/11] - C");
                } else if (wireSequences.red == 2 || wireSequences.red == 5 || wireSequences.red == 9) {
                    w11Label.setBounds(100,220,50,20);
                    w11Label.setText("CUT IF B");
                    System.out.println("Red [" + wireSequences.red + "/11] - B");
                } else if (wireSequences.red == 3){
                    w11Label.setBounds(100,220,50,20);
                    w11Label.setText("CUT IF A");
                    System.out.println("Red [3/11] - A");
                } else if (wireSequences.red == 4 || wireSequences.red == 6){
                    w11Label.setBounds(95,220,60,20);
                    w11Label.setText("CUT IF A/C");
                    System.out.println("Red [" + wireSequences.red + "/11] - AC");
                } else if (wireSequences.red == 7) {
                    w11Label.setBounds(110,220,30,20);
                    w11Label.setText("CUT");
                    System.out.println("Red [7/11] - ABC");
                } else {
                    w11Label.setBounds(95,220,60,20);
                    w11Label.setText("CUT IF A/B");
                    System.out.println("Red [8/11] - AB");
                }
            } else if (w11.equals("Blue")) {
                if (wireSequences.blue == 9) {
                    ;
                } else {
                    wireSequences.blue = wireSequences.blue + 1;
                }
                if (wireSequences.blue == 1 || wireSequences.blue == 3 || wireSequences.blue == 5) {
                    w11Label.setBounds(100,220,50,20);
                    w11Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/11] - B");
                } else if (wireSequences.blue == 2 || wireSequences.blue == 8){
                    w11Label.setBounds(95,220,60,20);
                    w11Label.setText("CUT IF A/C");
                    System.out.println("Blue [" + wireSequences.blue + "/11] - AC");
                } else if (wireSequences.blue == 4 || wireSequences.blue == 9){
                    w11Label.setBounds(100,220,50,20);
                    w11Label.setText("CUT IF A");
                    System.out.println("Blue [" + wireSequences.blue + "/11] - A");
                } else if (wireSequences.blue == 6) {
                    w11Label.setBounds(95,220,60,20);
                    w11Label.setText("CUT IF B/C");
                    System.out.println("Blue [6/11] - BC");
                } else {
                    w11Label.setBounds(100,220,50,20);
                    w11Label.setText("CUT IF C");
                    System.out.println("Blue [7/11] - C");
                }
            } else if (w11.equals("Black")) {
                if (wireSequences.black == 9) {
                    ;
                } else {
                    wireSequences.black = wireSequences.black + 1;
                }
                if (wireSequences.black == 1) {
                    w11Label.setBounds(110,220,30,20);
                    w11Label.setText("CUT");
                    System.out.println("Black [1/11] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w11Label.setBounds(95,220,60,20);
                    w11Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/11] - AC");
                } else if (wireSequences.black == 3 || wireSequences.black == 5) {
                    w11Label.setBounds(100,220,50,20);
                    w11Label.setText("CUT IF B");
                    System.out.println("Black [" + wireSequences.black + "/11] - B");
                } else if (wireSequences.black == 6){
                    w11Label.setBounds(95,220,60,20);
                    w11Label.setText("CUT IF B/C");
                    System.out.println("Black [6/11] - BC");
                } else if (wireSequences.black == 7) {
                    w11Label.setBounds(95,220,60,20);
                    w11Label.setText("CUT IF A/B");
                    System.out.println("Black [7/11] - AB");
                } else {
                    w11Label.setBounds(100,220,50,20);
                    w11Label.setText("CUT IF C");
                    System.out.println("Black [" + wireSequences.black + "/11] - C");
                }
            } else {
                w11Label.setText("");
                System.out.println("N/A [0/11] - Ignoring...");
            }
            if (w12.equals("Red")) {
                if (wireSequences.red == 9) {
                    ;
                } else {
                    wireSequences.red = wireSequences.red + 1;
                }
                if (wireSequences.red == 1) {
                    w12Label.setBounds(180,220,50,20);
                    w12Label.setText("CUT IF C");
                    System.out.println("Red [1/12] - C");
                } else if (wireSequences.red == 2 || wireSequences.red == 5 || wireSequences.red == 9) {
                    w12Label.setBounds(180,220,50,20);
                    w12Label.setText("CUT IF B");
                    System.out.println("Red [" + wireSequences.red + "/12] - B");
                } else if (wireSequences.red == 3){
                    w12Label.setBounds(180,220,50,20);
                    w12Label.setText("CUT IF A");
                    System.out.println("Red [3/12] - A");
                } else if (wireSequences.red == 4 || wireSequences.red == 6){
                    w12Label.setBounds(175,220,60,20);
                    w12Label.setText("CUT IF A/C");
                    System.out.println("Red [" + wireSequences.red + "/12] - AC");
                } else if (wireSequences.red == 7) {
                    w12Label.setBounds(190,220,30,20);
                    w12Label.setText("CUT");
                    System.out.println("Red [7/12] - ABC");
                } else {
                    w12Label.setBounds(175,220,60,20);
                    w12Label.setText("CUT IF A/B");
                    System.out.println("Red [8/12] - AB");
                }
            } else if (w12.equals("Blue")) {
                if (wireSequences.blue == 9) {
                    ;
                } else {
                    wireSequences.blue = wireSequences.blue + 1;
                }
                if (wireSequences.blue == 1 || wireSequences.blue == 3 || wireSequences.blue == 5) {
                    w12Label.setBounds(180,220,50,20);
                    w12Label.setText("CUT IF B");
                    System.out.println("Blue [" + wireSequences.blue + "/12] - B");
                } else if (wireSequences.blue == 2 || wireSequences.blue == 8){
                    w12Label.setBounds(175,220,60,20);
                    w12Label.setText("CUT IF A/C");
                    System.out.println("Blue [" + wireSequences.blue + "/12] - AC");
                } else if (wireSequences.blue == 4 || wireSequences.blue == 9){
                    w12Label.setBounds(180,220,50,20);
                    w12Label.setText("CUT IF A");
                    System.out.println("Blue [" + wireSequences.blue + "/12] - A");
                } else if (wireSequences.blue == 6) {
                    w12Label.setBounds(175,220,60,20);
                    w12Label.setText("CUT IF B/C");
                    System.out.println("Blue [6/12] - BC");
                } else {
                    w12Label.setBounds(180,220,50,20);
                    w12Label.setText("CUT IF C");
                    System.out.println("Blue [7/12] - C");
                }
            } else if (w12.equals("Black")) {
                if (wireSequences.black == 9) {
                    ;
                } else {
                    wireSequences.black = wireSequences.black + 1;
                }
                if (wireSequences.black == 1) {
                    w12Label.setBounds(190,220,30,20);
                    w12Label.setText("CUT");
                    System.out.println("Black [1/12] - ABC");
                } else if (wireSequences.black == 2 || wireSequences.black == 4) {
                    w12Label.setBounds(175,220,60,20);
                    w12Label.setText("CUT IF A/C");
                    System.out.println("Black [" + wireSequences.black + "/12] - AC");
                } else if (wireSequences.black == 3 || wireSequences.black == 5) {
                    w12Label.setBounds(180,220,50,20);
                    w12Label.setText("CUT IF B");
                    System.out.println("Black [" + wireSequences.black + "/12] - B");
                } else if (wireSequences.black == 6){
                    w12Label.setBounds(175,220,60,20);
                    w12Label.setText("CUT IF B/C");
                    System.out.println("Black [6/12] - BC");
                } else if (wireSequences.black == 7) {
                    w12Label.setBounds(175,220,60,20);
                    w12Label.setText("CUT IF A/B");
                    System.out.println("Black [7/12] - AB");
                } else {
                    w12Label.setBounds(180,220,50,20);
                    w12Label.setText("CUT IF C");
                    System.out.println("Black [" + wireSequences.black + "/12] - C");
                }
            } else {
                w12Label.setText("");
                System.out.println("N/A [0/12] - Ignoring...");
            }
            System.out.println("Module completed.");
            // Disable Stage 4
            w10CB.setEnabled(false);
            w11CB.setEnabled(false);
            w12CB.setEnabled(false);
            w101112Button.setEnabled(false);
        });
    }
}
