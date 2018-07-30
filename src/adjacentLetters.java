/**
 * Adjacent Letters, started work on 7/29/2018 6:18 PM
 * 
 * Finished version 0.1 on 7/29/2018 8:33 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.text.*;
import java.util.*;

public class adjacentLetters {
    static JFrame f;
    public static void module() {
        f = new JFrame("KAaNE [ADJACENT LETTERS]");
        System.out.println("KAaNE [ADJACENT LETTERS]");
        // TBs
        JTextField tb1 = new JTextField();
        tb1.setDocument(new JTextFieldLimit(1));
        tb1.setBounds(10,10,20,20);
        JTextField tb2 = new JTextField();
        tb2.setDocument(new JTextFieldLimit(1));
        tb2.setBounds(30,10,20,20);
        JTextField tb3 = new JTextField();
        tb3.setDocument(new JTextFieldLimit(1));
        tb3.setBounds(50,10,20,20);
        JTextField tb4 = new JTextField();
        tb4.setDocument(new JTextFieldLimit(1));
        tb4.setBounds(70,10,20,20);
        JTextField tb5 = new JTextField();
        tb5.setDocument(new JTextFieldLimit(1));
        tb5.setBounds(10,30,20,20);
        JTextField tb6 = new JTextField();
        tb6.setDocument(new JTextFieldLimit(1));
        tb6.setBounds(30,30,20,20);
        JTextField tb7 = new JTextField();
        tb7.setDocument(new JTextFieldLimit(1));
        tb7.setBounds(50,30,20,20);
        JTextField tb8 = new JTextField();
        tb8.setDocument(new JTextFieldLimit(1));
        tb8.setBounds(70,30,20,20);
        JTextField tb9 = new JTextField();
        tb9.setDocument(new JTextFieldLimit(1));
        tb9.setBounds(10,50,20,20);
        JTextField tb10 = new JTextField();
        tb10.setDocument(new JTextFieldLimit(1));
        tb10.setBounds(30,50,20,20);
        JTextField tb11 = new JTextField();
        tb11.setDocument(new JTextFieldLimit(1));
        tb11.setBounds(50,50,20,20);
        JTextField tb12 = new JTextField();
        tb12.setDocument(new JTextFieldLimit(1));
        tb12.setBounds(70,50,20,20);
        // Filters
        DocumentFilter filter = new alphabet.DocumentSizeAndUppercaseFilter(2);
        AbstractDocument tb1d = (AbstractDocument) tb1.getDocument();
        tb1d.setDocumentFilter(filter);
        AbstractDocument tb2d = (AbstractDocument) tb2.getDocument();
        tb2d.setDocumentFilter(filter);
        AbstractDocument tb3d = (AbstractDocument) tb3.getDocument();
        tb3d.setDocumentFilter(filter);
        AbstractDocument tb4d = (AbstractDocument) tb4.getDocument();
        tb4d.setDocumentFilter(filter);
        AbstractDocument tb5d = (AbstractDocument) tb5.getDocument();
        tb5d.setDocumentFilter(filter);
        AbstractDocument tb6d = (AbstractDocument) tb6.getDocument();
        tb6d.setDocumentFilter(filter);
        AbstractDocument tb7d = (AbstractDocument) tb7.getDocument();
        tb7d.setDocumentFilter(filter);
        AbstractDocument tb8d = (AbstractDocument) tb8.getDocument();
        tb8d.setDocumentFilter(filter);
        AbstractDocument tb9d = (AbstractDocument) tb9.getDocument();
        tb9d.setDocumentFilter(filter);
        AbstractDocument tb10d = (AbstractDocument) tb10.getDocument();
        tb10d.setDocumentFilter(filter);
        AbstractDocument tb11d = (AbstractDocument) tb11.getDocument();
        tb11d.setDocumentFilter(filter);
        AbstractDocument tb12d = (AbstractDocument) tb12.getDocument();
        tb12d.setDocumentFilter(filter);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(20,70,55,20);
        // Output Text Area
        JTextArea outputText = new JTextArea();
        outputText.setEditable(false);
        outputText.setLineWrap(true);
        outputText.setWrapStyleWord(true);
        outputText.setBounds(100,10,235,60);
        // Reset Button
        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(110,70,70,20);
        // Add everything
        f.add(tb1); f.add(tb2); f.add(tb3); f.add(tb4);
        f.add(tb5); f.add(tb6); f.add(tb7); f.add(tb8);
        f.add(tb9); f.add(tb10); f.add(tb11); f.add(tb12);
        f.add(button); f.add(outputText); f.add(resetButton);
        // Define the JFrame
        f.setLayout(null);
        f.setSize(350,130);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        String regx = "[]";
        button.addActionListener((ActionEvent e) -> {
            String lt1 = tb1.getText();
            String lt2 = tb2.getText();
            String lt3 = tb3.getText();
            String lt4 = tb4.getText();
            String lt5 = tb5.getText();
            String lt6 = tb6.getText();
            String lt7 = tb7.getText();
            String lt8 = tb8.getText();
            String lt9 = tb9.getText();
            String lt10 = tb10.getText();
            String lt11 = tb11.getText();
            String lt12 = tb12.getText();
            String lr[] = {lt2};
            String ud[] = {lt5};
            ArrayList<String> outputs = new ArrayList<>();
            // Letter 1 Logic
            String checks = logicCheck(lt1);
            String[] check = checks.split("");
            boolean conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt1);
                outputs.add(lt1);
            }
            // Letter 2 Logic
            lr = new String[] {lt1,lt3};
            ud = new String[] {lt6};
            checks = logicCheck(lt2);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt2);
                outputs.add(lt2);
            }
            // Letter 3 Logic
            lr = new String[] {lt2,lt4};
            ud = new String[] {lt7};
            checks = logicCheck(lt3);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt3);
                outputs.add(lt3);
            }
            // Letter 4 Logic
            lr = new String[] {lt3};
            ud = new String[] {lt8};
            checks = logicCheck(lt4);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt4);
                outputs.add(lt4);
            }
            // Letter 5 Logic
            lr = new String[] {lt6};
            ud = new String[] {lt1,lt9};
            checks = logicCheck(lt5);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt5);
                outputs.add(lt5);
            }
            // Letter 6 Logic
            lr = new String[] {lt5,lt7};
            ud = new String[] {lt2,lt10};
            checks = logicCheck(lt6);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt6);
                outputs.add(lt6);
            }
            // Letter 7 Logic
            lr = new String[] {lt6,lt8};
            ud = new String[] {lt3,lt11};
            checks = logicCheck(lt7);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt7);
                outputs.add(lt7);
            }
            // Letter 8 Logic
            lr = new String[] {lt7};
            ud = new String[] {lt4,lt12};
            checks = logicCheck(lt8);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt8);
                outputs.add(lt8);
            }
            // Letter 9 Logic
            lr = new String[] {lt10};
            ud = new String[] {lt5};
            checks = logicCheck(lt9);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt9);
                outputs.add(lt9);
            }
            // Letter 10 Logic
            lr = new String[] {lt9,lt11};
            ud = new String[] {lt6};
            checks = logicCheck(lt10);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt10);
                outputs.add(lt10);
            }
            // Letter 11 Logic
            lr = new String[] {lt10,lt12};
            ud = new String[] {lt7};
            checks = logicCheck(lt11);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt11);
                outputs.add(lt11);
            }
            // Letter 12 Logic
            lr = new String[] {lt11};
            ud = new String[] {lt8};
            checks = logicCheck(lt12);
            check = checks.split("");
            conCheck = containsCheck(lr,ud,check);
            if (conCheck == true) {
                System.out.println(lt12);
                outputs.add(lt12);
            }
            // Output
            String[] outputss = outputs.toArray(new String[0]);
            String output = Arrays.toString(outputss);
            // remove [ and ] characters
            char[] ca = regx.toCharArray();
            for (char c : ca) {
                output = output.replace(""+c, "");
            }
            outputText.setText(output);
            resetButton.requestFocusInWindow();
        });
        resetButton.addActionListener((ActionEvent e) -> {
            tb1.setText("");
            tb2.setText("");
            tb3.setText("");
            tb4.setText("");
            tb5.setText("");
            tb6.setText("");
            tb7.setText("");
            tb8.setText("");
            tb9.setText("");
            tb10.setText("");
            tb11.setText("");
            tb12.setText("");
            outputText.setText("");
            button.requestFocusInWindow();
        });
        tb1.addActionListener((ActionEvent e) -> {
            tb2.requestFocusInWindow();
        });
        tb2.addActionListener((ActionEvent e) -> {
            tb3.requestFocusInWindow();
        });
        tb3.addActionListener((ActionEvent e) -> {
            tb4.requestFocusInWindow();
        });
        tb4.addActionListener((ActionEvent e) -> {
            tb5.requestFocusInWindow();
        });
        tb5.addActionListener((ActionEvent e) -> {
            tb6.requestFocusInWindow();
        });
        tb6.addActionListener((ActionEvent e) -> {
            tb7.requestFocusInWindow();
        });
        tb7.addActionListener((ActionEvent e) -> {
            tb8.requestFocusInWindow();
        });
        tb8.addActionListener((ActionEvent e) -> {
            tb9.requestFocusInWindow();
        });
        tb9.addActionListener((ActionEvent e) -> {
            tb10.requestFocusInWindow();
        });
        tb10.addActionListener((ActionEvent e) -> {
            tb11.requestFocusInWindow();
        });
        tb11.addActionListener((ActionEvent e) -> {
            tb12.requestFocusInWindow();
        });
        tb12.addActionListener((ActionEvent e) -> {
            button.requestFocusInWindow();
        });
    }
    public static String logicCheck(String a) {
        String b = "";
        switch (a) {
            case "A": b = "GJMOYHKPRW"; break;
            case "B": b = "IKLRTCDFYZ"; break;
            case "C": b = "BHIJWDEMTU"; break;
            case "D": b = "IKOPQCJTUW"; break;
            case "E": b = "ACGIJKSUWZ"; break;
            case "F": b = "CERVYAGJPQ"; break;
            case "G": b = "ACFNSHOQYZ"; break;
            case "H": b = "LRTUXDKMPS"; break;
            case "I": b = "DLOWZEFNUV"; break;
            case "J": b = "BQTUWEHIOS"; break;
            case "K": b = "AFPXYDIORZ"; break;
            case "L": b = "GKPTZABRVX"; break;
            case "M": b = "EILQTBFPWX"; break;
            case "N": b = "PQRSVAFGHL"; break;
            case "O": b = "HJLUZIQSTX"; break;
            case "P": b = "DMNOXCFHKR"; break;
            case "Q": b = "CEOPVBDIKN"; break;
            case "R": b = "AEGSUBNOXY"; break;
            case "S": b = "ABEKQGMVYZ"; break;
            case "T": b = "GVXYZCJLSU"; break;
            case "U": b = "FMVXZBILNY"; break;
            case "V": b = "DHMNWAEJQX"; break;
            case "W": b = "DFHMNGLQRT"; break;
            case "X": b = "BDFKWAJNOV"; break;
            case "Y": b = "BCHSUEGMTW"; break;
            case "Z": b = "JNRSYCLMPV"; break;
        }
        return b;
    }
    public static boolean containsCheck(String[] a, String[] b, String[] c) {
        boolean d = false;
        if (Arrays.asList(a).contains(c[0]) || Arrays.asList(a).contains(c[1])
                || Arrays.asList(a).contains(c[2]) || Arrays.asList(a).contains(c[3])
                || Arrays.asList(a).contains(c[4]) || Arrays.asList(b).contains(c[5])
                || Arrays.asList(b).contains(c[6]) || Arrays.asList(b).contains(c[7])
                || Arrays.asList(b).contains(c[8]) || Arrays.asList(b).contains(c[9])) {
            d = true;
        }
        return d;
    }
}
