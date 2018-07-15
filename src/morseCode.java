/**
 * Morse Code Module, started work on 12:52 PM
 * 
 * Finished Version 0.1 at 11:55 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class morseCode {
    static JFrame f;
    public static void module() {
        System.out.println("[MORSE CODE MODULE]");
        f = new JFrame("KAaNE [MORSE CODE MODULE]");
        // Define the welcome text
        JLabel welcomeText = new JLabel();
        welcomeText.setText("Do not seperate dots/dashes.");
        welcomeText.setBounds(25,20,170,20);
        // Define the first text box
        JTextField textBox1 = new JTextField();
        textBox1.setDocument(new JTextFieldLimit(4));
        textBox1.setBounds(10,50,40,20);
        // Define the first text label
        JLabel textLabel1 = new JLabel();
        textLabel1.setText("1st Letter");
        textLabel1.setBounds(60,50,60,20);
        // Define the first button
        JButton textButton1 = new JButton();
        textButton1.setText("NEXT");
        textButton1.setBounds(130,50,70,20);
        // Define the second text box
        JTextField textBox2 = new JTextField();
        textBox2.setDocument(new JTextFieldLimit(4));
        textBox2.setBounds(10,80,40,20);
        // Define the second text label
        JLabel textLabel2 = new JLabel();
        textLabel2.setText("2nd Letter");
        textLabel2.setBounds(60,80,60,20);
        // Define the second button
        JButton textButton2 = new JButton();
        textButton2.setText("NEXT");
        textButton2.setBounds(130,80,70,20);
        // Define the third text box
        JTextField textBox3 = new JTextField();
        textBox3.setDocument(new JTextFieldLimit(4));
        textBox3.setBounds(10,110,40,20);
        // Define the third text label
        JLabel textLabel3 = new JLabel();
        textLabel3.setText("3rd Letter");
        textLabel3.setBounds(60,110,60,20);
        // Define the third button
        JButton textButton3 = new JButton();
        textButton3.setText("NEXT");
        textButton3.setBounds(130,110,70,20);
        // Define the output text
        JLabel outputText = new JLabel();
        outputText.setText("3.600 MHz");
        outputText.setBounds(80,140,60,20);
        // Define the reset button
        JButton resetButton = new JButton();
        resetButton.setText("RESET");
        resetButton.setBounds(70,170,80,20);
        // Set stage 2, 3 and output text to invisible
        textBox2.setVisible(false);
        textLabel2.setVisible(false);
        textButton2.setVisible(false);
        textBox3.setVisible(false);
        textLabel3.setVisible(false);
        textButton3.setVisible(false);
        outputText.setVisible(false);
        // Add everything into JFrame
        f.add(welcomeText); f.add(textBox1); f.add(textLabel1); f.add(textButton1); f.add(textBox2); f.add(textLabel2); f.add(textButton2); f.add(textBox3); f.add(textLabel3); f.add(textButton3); f.add(outputText); f.add(resetButton);
        // Define the rest of the JFrame stuff
        f.setLayout(null);
        f.setSize(220,250);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        textButton1.addActionListener((ActionEvent e) -> {
            String text = textBox1.getText();
            outputText.setVisible(false);
            outputText.setBounds(80,140,60,20);
            System.out.println("Inputted first letter - " + text);
            switch (text) {
                case "..-.":
                    System.out.println("Deciphered into F");
                    System.out.println("Found word! Word is FLICK");
                    System.out.println("3.555 MHz");
                    outputText.setText("3.555 MHz");
                    outputText.setVisible(true);
                    break;
                case "....":
                    System.out.println("Deciphered into H");
                    System.out.println("Found word! Word is HALLS");
                    System.out.println("3.515 MHz");
                    outputText.setText("3.515 MHz");
                    outputText.setVisible(true);
                    break;
                case ".-..":
                    System.out.println("Decyphered into L");
                    System.out.println("Found word! Word is LEAKS");
                    System.out.println("3.542 MHz");
                    outputText.setText("3.542 MHz");
                    outputText.setVisible(true);
                    break;
                case "-":
                    System.out.println("Decyphered into T");
                    System.out.println("Found word! Word is TRICK");
                    System.out.println("3.532 MHz");
                    outputText.setText("3.532 MHz");
                    outputText.setVisible(true);
                    break;
                case "...-":
                    System.out.println("Decyphered into V");
                    System.out.println("Found word! Word is VECTOR");
                    System.out.println("3.595 MHz");
                    outputText.setText("3.595 MHz");
                    outputText.setVisible(true);
                    break;
                case "-...":
                    System.out.println("Decyphered into B");
                    textBox1.setEditable(false);
                    textButton1.setEnabled(false);
                    textBox2.setVisible(true);
                    textLabel2.setVisible(true);
                    textButton2.setVisible(true);
                    break;
                case "...":
                    System.out.println("Decyphered into S");
                    textBox1.setEditable(false);
                    textButton1.setEnabled(false);
                    textBox2.setVisible(true);
                    textLabel2.setVisible(true);
                    textButton2.setVisible(true);
                    break;
                default:
                    System.out.println("Invalid Input!");
                    outputText.setText("Invalid Input!");
                    outputText.setBounds(75,140,70,20);
                    outputText.setVisible(true);
                    break;
            }
        });
        textBox1.addActionListener((ActionEvent e) -> {
            String text = textBox1.getText();
            outputText.setVisible(false);
            outputText.setBounds(80,140,60,20);
            System.out.println("Inputted first letter - " + text);
            switch (text) {
                case "..-.":
                    System.out.println("Deciphered into F");
                    System.out.println("Found word! Word is FLICK");
                    System.out.println("3.555 MHz");
                    outputText.setText("3.555 MHz");
                    outputText.setVisible(true);
                    break;
                case "....":
                    System.out.println("Deciphered into H");
                    System.out.println("Found word! Word is HALLS");
                    System.out.println("3.515 MHz");
                    outputText.setText("3.515 MHz");
                    outputText.setVisible(true);
                    break;
                case ".-..":
                    System.out.println("Decyphered into L");
                    System.out.println("Found word! Word is LEAKS");
                    System.out.println("3.542 MHz");
                    outputText.setText("3.542 MHz");
                    outputText.setVisible(true);
                    break;
                case "-":
                    System.out.println("Decyphered into T");
                    System.out.println("Found word! Word is TRICK");
                    System.out.println("3.532 MHz");
                    outputText.setText("3.532 MHz");
                    outputText.setVisible(true);
                    break;
                case "...-":
                    System.out.println("Decyphered into V");
                    System.out.println("Found word! Word is VECTOR");
                    System.out.println("3.595 MHz");
                    outputText.setText("3.595 MHz");
                    outputText.setVisible(true);
                    break;
                case "-...":
                    System.out.println("Decyphered into B");
                    textBox1.setEditable(false);
                    textButton1.setEnabled(false);
                    textBox2.setVisible(true);
                    textLabel2.setVisible(true);
                    textButton2.setVisible(true);
                    break;
                case "...":
                    System.out.println("Decyphered into S");
                    textBox1.setEditable(false);
                    textButton1.setEnabled(false);
                    textBox2.setVisible(true);
                    textLabel2.setVisible(true);
                    textButton2.setVisible(true);
                    break;
                default:
                    System.out.println("Invalid Input!");
                    outputText.setText("Invalid Input!");
                    outputText.setBounds(75,140,70,20);
                    outputText.setVisible(true);
                    break;
            }
        });
        textButton2.addActionListener((ActionEvent e) -> {
            String text1 = textBox1.getText();
            String text2 = textBox2.getText();
            outputText.setVisible(false);
            outputText.setBounds(80,140,60,20);
            System.out.println("Inputted second letter - " + text2);
            switch (text1) {
                case "-...":
                    switch (text2) {
                        case ".":
                            System.out.println("Decyphered into E");
                            System.out.println("Found word! Word is BEATS");
                            System.out.println("3.600 MHz");
                            outputText.setText("3.600 MHz");
                            outputText.setVisible(true);
                            break;
                        case "..":
                            System.out.println("Decyphered into I");
                            System.out.println("Found word! Word is BISTRO");
                            System.out.println("3.552 MHz");
                            outputText.setText("3.552 MHz");
                            outputText.setVisible(true);
                            break;
                        case "---":
                            System.out.println("Decyphered into O");
                            textBox2.setEditable(false);
                            textButton2.setEnabled(false);
                            textBox3.setVisible(true);
                            textLabel3.setVisible(true);
                            textButton3.setVisible(true);
                            break;
                        case ".-.":
                            System.out.println("Decyphered into R");
                            textBox2.setEditable(false);
                            textButton2.setEnabled(false);
                            textBox3.setVisible(true);
                            textLabel3.setVisible(true);
                            textButton3.setVisible(true);
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            outputText.setText("Invalid Input!");
                            outputText.setBounds(75,140,70,20);
                            outputText.setVisible(true);
                            break;
                    }
                case "...":
                    switch (text2) {
                        case "....":
                            System.out.println("Decyphered into H");
                            System.out.println("Found word! Word is SHELL");
                            System.out.println("3.505 MHz");
                            outputText.setText("3.505 MHz");
                            outputText.setVisible(true);
                            break;
                        case ".-..":
                            System.out.println("Decyphered into L");
                            System.out.println("Found word! Word is SLICK");
                            System.out.println("3.522 MHz");
                            outputText.setText("3.522 MHz");
                            outputText.setVisible(true);
                            break;
                        case "-":
                            System.out.println("Decyphered into T");
                            textBox2.setEditable(false);
                            textButton2.setEnabled(false);
                            textBox3.setVisible(true);
                            textLabel3.setVisible(true);
                            textButton3.setVisible(true);
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            outputText.setText("Invalid Input!");
                            outputText.setBounds(75,140,70,20);
                            outputText.setVisible(true);
                            break;
                    }
                    break;
                default:
                    break;
            }
        });
        textBox2.addActionListener((ActionEvent e) -> {
            String text1 = textBox1.getText();
            String text2 = textBox2.getText();
            outputText.setVisible(false);
            outputText.setBounds(80,140,60,20);
            System.out.println("Inputted second letter - " + text2);
            switch (text1) {
                case "-...":
                    switch (text2) {
                        case ".":
                            System.out.println("Decyphered into E");
                            System.out.println("Found word! Word is BEATS");
                            System.out.println("3.600 MHz");
                            outputText.setText("3.600 MHz");
                            outputText.setVisible(true);
                            break;
                        case "..":
                            System.out.println("Decyphered into I");
                            System.out.println("Found word! Word is BISTRO");
                            System.out.println("3.552 MHz");
                            outputText.setText("3.552 MHz");
                            outputText.setVisible(true);
                            break;
                        case "---":
                            System.out.println("Decyphered into O");
                            textBox2.setEditable(false);
                            textButton2.setEnabled(false);
                            textBox3.setVisible(true);
                            textLabel3.setVisible(true);
                            textButton3.setVisible(true);
                            break;
                        case ".-.":
                            System.out.println("Decyphered into R");
                            textBox2.setEditable(false);
                            textButton2.setEnabled(false);
                            textBox3.setVisible(true);
                            textLabel3.setVisible(true);
                            textButton3.setVisible(true);
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            outputText.setText("Invalid Input!");
                            outputText.setBounds(75,140,70,20);
                            outputText.setVisible(true);
                            break;
                    }
                case "...":
                    switch (text2) {
                        case "....":
                            System.out.println("Decyphered into H");
                            System.out.println("Found word! Word is SHELL");
                            System.out.println("3.505 MHz");
                            outputText.setText("3.505 MHz");
                            outputText.setVisible(true);
                            break;
                        case ".-..":
                            System.out.println("Decyphered into L");
                            System.out.println("Found word! Word is SLICK");
                            System.out.println("3.522 MHz");
                            outputText.setText("3.522 MHz");
                            outputText.setVisible(true);
                            break;
                        case "-":
                            System.out.println("Decyphered into T");
                            textBox2.setEditable(false);
                            textButton2.setEnabled(false);
                            textBox3.setVisible(true);
                            textLabel3.setVisible(true);
                            textButton3.setVisible(true);
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            outputText.setText("Invalid Input!");
                            outputText.setBounds(75,140,70,20);
                            outputText.setVisible(true);
                            break;
                    }
                    break;
                default:
                    break;
            }
        });
        textButton3.addActionListener((ActionEvent e) -> {
            String text1 = textBox1.getText();
            String text2 = textBox2.getText();
            String text3 = textBox3.getText();
            outputText.setVisible(false);
            outputText.setBounds(80,140,60,20);
            System.out.println("Inputted third letter - " + text3);
            switch (text1) {
                case "-...":
                    switch (text2) {
                        case "---":
                            switch (text3) {
                                case "--":
                                    System.out.println("Decyphered into M");
                                    System.out.println("Found word! Word is BOMBS");
                                    System.out.println("3.565 MHz");
                                    outputText.setText("3.565 MHz");
                                    outputText.setVisible(true);
                                    break;
                                case "-..-":
                                    System.out.println("Decyphered into X");
                                    System.out.println("Found word! Word is BOXES");
                                    System.out.println("3.535 MHz");
                                    outputText.setText("3.535 MHz");
                                    outputText.setVisible(true);
                                    break;
                                default:
                                    System.out.println("Invalid Input!");
                                    outputText.setText("Invalid Input!");
                                    outputText.setBounds(75,140,70,20);
                                    outputText.setVisible(true);
                                    break;
                            }
                            break;
                        case ".-.":
                            switch (text3) {
                                case ".":
                                    System.out.println("Decyphered into E");
                                    System.out.println("Found word! Word is BREAK");
                                    System.out.println("3.572 MHz");
                                    outputText.setText("3.572 MHz");
                                    outputText.setVisible(true);
                                    break;
                                case "..":
                                    System.out.println("Decyphered into I");
                                    System.out.println("Found word! Word is BRICK");
                                    System.out.println("3.575 MHz");
                                    outputText.setText("3.575 MHz");
                                    outputText.setVisible(true);
                                default:
                                    System.out.println("Invalid Input!");
                                    outputText.setText("Invalid Input!");
                                    outputText.setBounds(75,140,70,20);
                                    outputText.setVisible(true);
                                    break;
                            }
                        default:
                            break;
                    }
                    break;
                case "...":
                    switch (text3) {
                        case ".":
                            System.out.println("Decyphered into E");
                            System.out.println("Found word! Word is STEAK");
                            System.out.println("3.582 MHz");
                            outputText.setText("3.582 MHz");
                            outputText.setVisible(true);
                            break;
                        case "..":
                            System.out.println("Decyphered into I");
                            System.out.println("Found word! Word is STING");
                            System.out.println("3.592 MHz");
                            outputText.setText("3.592 MHz");
                            outputText.setVisible(true);
                            break;
                        case ".-.":
                            System.out.println("Decyphered into R");
                            System.out.println("Found word! Word is STROBE");
                            System.out.println("3.545 MHz");
                            outputText.setText("3.545 MHz");
                            outputText.setVisible(true);
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            outputText.setText("Invalid Input!");
                            outputText.setBounds(75,140,70,20);
                            outputText.setVisible(true);
                            break;
                    }
                    break;
                default:
                    break;
            }
        });
        textBox3.addActionListener((ActionEvent e) -> {
            String text1 = textBox1.getText();
            String text2 = textBox2.getText();
            String text3 = textBox3.getText();
            outputText.setVisible(false);
            outputText.setBounds(80,140,60,20);
            System.out.println("Inputted third letter - " + text3);
            switch (text1) {
                case "-...":
                    switch (text2) {
                        case "---":
                            switch (text3) {
                                case "--":
                                    System.out.println("Decyphered into M");
                                    System.out.println("Found word! Word is BOMBS");
                                    System.out.println("3.565 MHz");
                                    outputText.setText("3.565 MHz");
                                    outputText.setVisible(true);
                                    break;
                                case "-..-":
                                    System.out.println("Decyphered into X");
                                    System.out.println("Found word! Word is BOXES");
                                    System.out.println("3.535 MHz");
                                    outputText.setText("3.535 MHz");
                                    outputText.setVisible(true);
                                    break;
                                default:
                                    System.out.println("Invalid Input!");
                                    outputText.setText("Invalid Input!");
                                    outputText.setBounds(75,140,70,20);
                                    outputText.setVisible(true);
                                    break;
                            }
                            break;
                        case ".-.":
                            switch (text3) {
                                case ".":
                                    System.out.println("Decyphered into E");
                                    System.out.println("Found word! Word is BREAK");
                                    System.out.println("3.572 MHz");
                                    outputText.setText("3.572 MHz");
                                    outputText.setVisible(true);
                                    break;
                                case "..":
                                    System.out.println("Decyphered into I");
                                    System.out.println("Found word! Word is BRICK");
                                    System.out.println("3.575 MHz");
                                    outputText.setText("3.575 MHz");
                                    outputText.setVisible(true);
                                default:
                                    System.out.println("Invalid Input!");
                                    outputText.setText("Invalid Input!");
                                    outputText.setBounds(75,140,70,20);
                                    outputText.setVisible(true);
                                    break;
                            }
                        default:
                            break;
                    }
                    break;
                case "...":
                    switch (text3) {
                        case ".":
                            System.out.println("Decyphered into E");
                            System.out.println("Found word! Word is STEAK");
                            System.out.println("3.582 MHz");
                            outputText.setText("3.582 MHz");
                            outputText.setVisible(true);
                            break;
                        case "..":
                            System.out.println("Decyphered into I");
                            System.out.println("Found word! Word is STING");
                            System.out.println("3.592 MHz");
                            outputText.setText("3.592 MHz");
                            outputText.setVisible(true);
                            break;
                        case ".-.":
                            System.out.println("Decyphered into R");
                            System.out.println("Found word! Word is STROBE");
                            System.out.println("3.545 MHz");
                            outputText.setText("3.545 MHz");
                            outputText.setVisible(true);
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            outputText.setText("Invalid Input!");
                            outputText.setBounds(75,140,70,20);
                            outputText.setVisible(true);
                            break;
                    }
                    break;
                default:
                    break;
            }
        });
        resetButton.addActionListener((ActionEvent e) -> {
            textBox1.setText("");
            textBox2.setText("");
            textBox3.setText("");
            textBox2.setVisible(false);
            textLabel2.setVisible(false);
            textButton2.setVisible(false);
            textBox3.setVisible(false);
            textLabel3.setVisible(false);
            textButton3.setVisible(false);
            outputText.setVisible(false);
        });
    }
}
