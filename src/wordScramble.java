/**
 * Word Scramble, started work on 7/29/2018 8:38 PM
 * 
 * Finished version 0.1 on 7/29/2018 11:43 PM
 * 
 * Finished version 0.2 on 8/05/2018 11:19 PM
 * 
 * Version 0.2
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.text.*;
import java.util.*;

public class wordScramble {
    static JFrame f;
    public static void module() {
        f = new JFrame("KAaNE [WORD SCRAMBLE]");
        System.out.println("[WORD SCRAMBLE]");
        ImageIcon icon = new ImageIcon("imgs/icons/word scramble.png");
        f.setIconImage(icon.getImage());
        // TB
        JTextField tb = new JTextField();
        tb.setDocument(new JTextFieldLimit(6));
        tb.setBounds(10,10,60,20);
        DocumentFilter filter = new alphabet.DocumentSizeAndUppercaseFilter(7);
        AbstractDocument tbd = (AbstractDocument) tb.getDocument();
        tbd.setDocumentFilter(filter);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(12,30,55,20);
        // Output Label
        JLabel output = new JLabel();
        output.setBounds(80,20,180,20);
        // Add everything
        f.add(tb); f.add(button); f.add(output);
        // Define the JFrame
        f.setLayout(null);
        f.setSize(300,100);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            String text = tb.getText();
            String d = "MODULE"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "OTTAWA"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "BANANA"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "KABOOM"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "LETTER"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "WIDGET"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "PERSON"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "SAPPER"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "WIRING"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "ARCHER"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "DEVICE"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "ROCKET"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "DAMAGE"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "DEFUSE"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "FLAMES"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "SEMTEX"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "CANNON"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "BLASTS"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "ATTACK"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "WEAPON"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "CHARGE"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "NAPALM"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "MORTAR"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "BURSTS"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "CASING"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "DISARM"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "KEYPAD"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "BUTTON"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "ROBOTS"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            d = "KEVLAR"; if (wordSearch(text,d)) {System.out.println(d);output.setText(d);}
            
        });
    }
    // Code from Veluria on Stack Overflow
    public static boolean wordSearch(String searchIn, String searchFor) {
        for (char c : searchFor.toCharArray()) {
            if (searchIn.indexOf(c) == -1) {
                return false;
            }
            searchIn = searchIn.replaceFirst(Character.toString(c), "");
        }
        return true;
    }
}
