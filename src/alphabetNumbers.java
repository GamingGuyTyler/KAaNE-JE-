/**
 *. Alphabet numbers, started work on 7/21/2018 5:28 PM
 * 
 *. Finished version 0.1 on 7/21/2018 9:13 PM
 * 
 *. Version 0.1
 * 
 * Note: If you get a strike, it's likely you'd also get a strike
 * if you weren't using this. It's hard to decipher the solving
 * code when you they don't even have the module open source.
 * 
 * Note 2: Anddd now it's open source but now I don't even know
 * what the hell kind of sorting system they're using.
 */

import be.pcl.swing.ImprovedFormattedTextField;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class alphabetNumbers {
    static JFrame f;
    public static void module() {
        System.out.println("[ALPHABET NUMBERS]");
        f = new JFrame("KAaNE [ALPHABET NUMBERS]");
        ImageIcon icon = new ImageIcon("imgs/icons/alphabet numbers.png");
        f.setIconImage(icon.getImage());
        // Stage 1
        // TBs
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField stage1TB1 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage1TB1.setBounds(40,10,30,20);
        ImprovedFormattedTextField stage1TB2 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage1TB2.setBounds(70,30,30,20);
        ImprovedFormattedTextField stage1TB3 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage1TB3.setBounds(70,50,30,20);
        ImprovedFormattedTextField stage1TB4 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage1TB4.setBounds(40,70,30,20);
        ImprovedFormattedTextField stage1TB5 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage1TB5.setBounds(10,50,30,20);
        ImprovedFormattedTextField stage1TB6 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage1TB6.setBounds(10,30,30,20);
        // Button
        JButton stage1button = new JButton("OK");
        stage1button.setBounds(100,40,60,20);
        // Output
        JTextArea stage1output = new JTextArea();
        stage1output.setBounds(100,60,60,40);
        stage1output.setEditable(false);
        stage1output.setLineWrap(true);
        stage1output.setWrapStyleWord(true);
        // Line
        ImageIcon line = new ImageIcon("imgs/line.png");
        JLabel stage1line = new JLabel(line);
        stage1line.setBounds(0,100,350,1);
        // Stage 2
        // TBs
        ImprovedFormattedTextField stage2TB1 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage2TB1.setBounds(200,10,30,20);
        ImprovedFormattedTextField stage2TB2 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage2TB2.setBounds(230,30,30,20);
        ImprovedFormattedTextField stage2TB3 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage2TB3.setBounds(230,50,30,20);
        ImprovedFormattedTextField stage2TB4 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage2TB4.setBounds(200,70,30,20);
        ImprovedFormattedTextField stage2TB5 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage2TB5.setBounds(170,50,30,20);
        ImprovedFormattedTextField stage2TB6 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage2TB6.setBounds(170,30,30,20);
        // Button
        JButton stage2button = new JButton("OK");
        stage2button.setBounds(260,40,60,20);
        // Output
        JTextArea stage2output = new JTextArea();
        stage2output.setBounds(260,60,60,40);
        stage2output.setEditable(false);
        stage2output.setLineWrap(true);
        stage2output.setWrapStyleWord(true);
        // Stage 3
        // TBs
        ImprovedFormattedTextField stage3TB1 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage3TB1.setBounds(40,110,30,20);
        ImprovedFormattedTextField stage3TB2 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage3TB2.setBounds(70,130,30,20);
        ImprovedFormattedTextField stage3TB3 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage3TB3.setBounds(70,150,30,20);
        ImprovedFormattedTextField stage3TB4 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage3TB4.setBounds(40,170,30,20);
        ImprovedFormattedTextField stage3TB5 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage3TB5.setBounds(10,150,30,20);
        ImprovedFormattedTextField stage3TB6 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage3TB6.setBounds(10,130,30,20);
        // Button
        JButton stage3button = new JButton("OK");
        stage3button.setBounds(100,140,60,20);
        // Output
        JTextArea stage3output = new JTextArea();
        stage3output.setBounds(100,160,60,40);
        stage3output.setEditable(false);
        stage3output.setLineWrap(true);
        stage3output.setWrapStyleWord(true);
        // Stage 4
        // TBs
        ImprovedFormattedTextField stage4TB1 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage4TB1.setBounds(200,110,30,20);
        ImprovedFormattedTextField stage4TB2 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage4TB2.setBounds(230,130,30,20);
        ImprovedFormattedTextField stage4TB3 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage4TB3.setBounds(230,150,30,20);
        ImprovedFormattedTextField stage4TB4 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage4TB4.setBounds(200,170,30,20);
        ImprovedFormattedTextField stage4TB5 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage4TB5.setBounds(170,150,30,20);
        ImprovedFormattedTextField stage4TB6 = new ImprovedFormattedTextField(integerNumberInstance,0);
        stage4TB6.setBounds(170,130,30,20);
        // Button
        JButton stage4button = new JButton("OK");
        stage4button.setBounds(260,140,60,20);
        // Output
        JTextArea stage4output = new JTextArea();
        stage4output.setBounds(260,160,60,40);
        stage4output.setEditable(false);
        stage4output.setLineWrap(true);
        stage4output.setWrapStyleWord(true);
        // Reset Button
        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(260,10,80,20);
        // Disable stages 2-4
        stage2TB1.setEditable(false);
        stage2TB2.setEditable(false);
        stage2TB3.setEditable(false);
        stage2TB4.setEditable(false);
        stage2TB5.setEditable(false);
        stage2TB6.setEditable(false);
        stage2button.setEnabled(false);
        stage3TB1.setEditable(false);
        stage3TB2.setEditable(false);
        stage3TB3.setEditable(false);
        stage3TB4.setEditable(false);
        stage3TB5.setEditable(false);
        stage3TB6.setEditable(false);
        stage3button.setEnabled(false);
        stage4TB1.setEditable(false);
        stage4TB2.setEditable(false);
        stage4TB3.setEditable(false);
        stage4TB4.setEditable(false);
        stage4TB5.setEditable(false);
        stage4TB6.setEditable(false);
        stage4button.setEnabled(false);
        // Add everything
        f.add(stage1TB1); f.add(stage1TB2); f.add(stage1TB3); f.add(stage1TB4); f.add(stage1TB5); f.add(stage1TB6);
        f.add(stage1button); f.add(stage1output); f.add(stage1line);
        f.add(stage2TB1); f.add(stage2TB2); f.add(stage2TB3); f.add(stage2TB4); f.add(stage2TB5); f.add(stage2TB6);
        f.add(stage2button); f.add(stage2output);
        f.add(stage3TB1); f.add(stage3TB2); f.add(stage3TB3); f.add(stage3TB4); f.add(stage3TB5); f.add(stage3TB6);
        f.add(stage3button); f.add(stage3output);
        f.add(stage4TB1); f.add(stage4TB2); f.add(stage4TB3); f.add(stage4TB4); f.add(stage4TB5); f.add(stage4TB6);
        f.add(stage4button); f.add(stage4output); f.add(resetButton);
        // Define JFrame
        f.setLayout(null);
        f.setSize(350,230);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        String regx = "[]";
        stage1button.addActionListener((ActionEvent e) -> {
            int number1 = Integer.parseInt(stage1TB1.getText());
            int number2 = Integer.parseInt(stage1TB2.getText());
            int number3 = Integer.parseInt(stage1TB3.getText());
            int number4 = Integer.parseInt(stage1TB4.getText());
            int number5 = Integer.parseInt(stage1TB5.getText());
            int number6 = Integer.parseInt(stage1TB6.getText());
            // Convert numbers
            String convertnum1 = "";
            String convertnum2 = "";
            String convertnum3 = "";
            String convertnum4 = "";
            String convertnum5 = "";
            String convertnum6 = "";
            switch (number1) {
                case 1: convertnum1 = "eight"; break;
                case 2: convertnum1 = "eighteen"; break;
                case 3: convertnum1 = "twenty eight"; break;
                case 4: convertnum1 = "thirty eight"; break;
                case 5: convertnum1 = "forty eight"; break;
                case 6: convertnum1 = "fifty eight"; break;
                case 7: convertnum1 = "sixty eight"; break;
                case 8: convertnum1 = "seventy eight"; break;
                case 9: convertnum1 = "eighty"; break;
                case 10: convertnum1 = "eighty one"; break;
                case 11: convertnum1 = "eighty two"; break;
                case 12: convertnum1 = "eighty three"; break;
                case 13: convertnum1 = "eighty four"; break;
                case 14: convertnum1 = "eighty five"; break;
                case 15: convertnum1 = "eighty six"; break;
                case 16: convertnum1 = "eighty seven"; break;
                case 17: convertnum1 = "eighty eight"; break;
                case 18: convertnum1 = "eighty nine"; break;
                case 19: convertnum1 = "eight hundred"; break;
                case 20: convertnum1 = "eight hundred and eight"; break;
                case 21: convertnum1 = "eight hundred and eighteen"; break;
                default: convertnum1 = "eight hundred and eighty eight"; break;
            } switch (number2) {
                case 1: convertnum2 = "eight"; break;
                case 2: convertnum2 = "eighteen"; break;
                case 3: convertnum2 = "twenty eight"; break;
                case 4: convertnum2 = "thirty eight"; break;
                case 5: convertnum2 = "forty eight"; break;
                case 6: convertnum2 = "fifty eight"; break;
                case 7: convertnum2 = "sixty eight"; break;
                case 8: convertnum2 = "seventy eight"; break;
                case 9: convertnum2 = "eighty"; break;
                case 10: convertnum2 = "eighty one"; break;
                case 11: convertnum2 = "eighty two"; break;
                case 12: convertnum2 = "eighty three"; break;
                case 13: convertnum2 = "eighty four"; break;
                case 14: convertnum2 = "eighty five"; break;
                case 15: convertnum2 = "eighty six"; break;
                case 16: convertnum2 = "eighty seven"; break;
                case 17: convertnum2 = "eighty eight"; break;
                case 18: convertnum2 = "eighty nine"; break;
                case 19: convertnum2 = "eight hundred"; break;
                case 20: convertnum2 = "eight hundred and eight"; break;
                case 21: convertnum2 = "eight hundred and eighteen"; break;
                default: convertnum2 = "eight hundred and eighty eight"; break;
            } switch (number3) {
                case 1: convertnum3 = "eight"; break;
                case 2: convertnum3 = "eighteen"; break;
                case 3: convertnum3 = "twenty eight"; break;
                case 4: convertnum3 = "thirty eight"; break;
                case 5: convertnum3 = "forty eight"; break;
                case 6: convertnum3 = "fifty eight"; break;
                case 7: convertnum3 = "sixty eight"; break;
                case 8: convertnum3 = "seventy eight"; break;
                case 9: convertnum3 = "eighty"; break;
                case 10: convertnum3 = "eighty one"; break;
                case 11: convertnum3 = "eighty two"; break;
                case 12: convertnum3 = "eighty three"; break;
                case 13: convertnum3 = "eighty four"; break;
                case 14: convertnum3 = "eighty five"; break;
                case 15: convertnum3 = "eighty six"; break;
                case 16: convertnum3 = "eighty seven"; break;
                case 17: convertnum3 = "eighty eight"; break;
                case 18: convertnum3 = "eighty nine"; break;
                case 19: convertnum3 = "eight hundred"; break;
                case 20: convertnum3 = "eight hundred and eight"; break;
                case 21: convertnum3 = "eight hundred and eighteen"; break;
                default: convertnum3 = "eight hundred and eighty eight"; break;
            } switch (number4) {
                case 1: convertnum4 = "eight"; break;
                case 2: convertnum4 = "eighteen"; break;
                case 3: convertnum4 = "twenty eight"; break;
                case 4: convertnum4 = "thirty eight"; break;
                case 5: convertnum4 = "forty eight"; break;
                case 6: convertnum4 = "fifty eight"; break;
                case 7: convertnum4 = "sixty eight"; break;
                case 8: convertnum4 = "seventy eight"; break;
                case 9: convertnum4 = "eighty"; break;
                case 10: convertnum4 = "eighty one"; break;
                case 11: convertnum4 = "eighty two"; break;
                case 12: convertnum4 = "eighty three"; break;
                case 13: convertnum4 = "eighty four"; break;
                case 14: convertnum4 = "eighty five"; break;
                case 15: convertnum4 = "eighty six"; break;
                case 16: convertnum4 = "eighty seven"; break;
                case 17: convertnum4 = "eighty eight"; break;
                case 18: convertnum4 = "eighty nine"; break;
                case 19: convertnum4 = "eight hundred"; break;
                case 20: convertnum4 = "eight hundred and eight"; break;
                case 21: convertnum4 = "eight hundred and eighteen"; break;
                default: convertnum4 = "eight hundred and eighty eight"; break;
            } switch (number5) {
                case 1: convertnum5 = "eight"; break;
                case 2: convertnum5 = "eighteen"; break;
                case 3: convertnum5 = "twenty eight"; break;
                case 4: convertnum5 = "thirty eight"; break;
                case 5: convertnum5 = "forty eight"; break;
                case 6: convertnum5 = "fifty eight"; break;
                case 7: convertnum5 = "sixty eight"; break;
                case 8: convertnum5 = "seventy eight"; break;
                case 9: convertnum5 = "eighty"; break;
                case 10: convertnum5 = "eighty one"; break;
                case 11: convertnum5 = "eighty two"; break;
                case 12: convertnum5 = "eighty three"; break;
                case 13: convertnum5 = "eighty four"; break;
                case 14: convertnum5 = "eighty five"; break;
                case 15: convertnum5 = "eighty six"; break;
                case 16: convertnum5 = "eighty seven"; break;
                case 17: convertnum5 = "eighty eight"; break;
                case 18: convertnum5 = "eighty nine"; break;
                case 19: convertnum5 = "eight hundred"; break;
                case 20: convertnum5 = "eight hundred and eight"; break;
                case 21: convertnum5 = "eight hundred and eighteen"; break;
                default: convertnum5 = "eight hundred and eighty eight"; break;
            } switch (number6) {
                case 1: convertnum6 = "eight"; break;
                case 2: convertnum6 = "eighteen"; break;
                case 3: convertnum6 = "twenty eight"; break;
                case 4: convertnum6 = "thirty eight"; break;
                case 5: convertnum6 = "forty eight"; break;
                case 6: convertnum6 = "fifty eight"; break;
                case 7: convertnum6 = "sixty eight"; break;
                case 8: convertnum6 = "seventy eight"; break;
                case 9: convertnum6 = "eighty"; break;
                case 10: convertnum6 = "eighty one"; break;
                case 11: convertnum6 = "eighty two"; break;
                case 12: convertnum6 = "eighty three"; break;
                case 13: convertnum6 = "eighty four"; break;
                case 14: convertnum6 = "eighty five"; break;
                case 15: convertnum6 = "eighty six"; break;
                case 16: convertnum6 = "eighty seven"; break;
                case 17: convertnum6 = "eighty eight"; break;
                case 18: convertnum6 = "eighty nine"; break;
                case 19: convertnum6 = "eight hundred"; break;
                case 20: convertnum6 = "eight hundred and eight"; break;
                case 21: convertnum6 = "eight hundred and eighteen"; break;
                default: convertnum6 = "eight hundred and eighty eight"; break;
            }
            // Put them all in an array and alphabetize
            String alphabetize[] = {convertnum1,convertnum2,convertnum3,convertnum4,convertnum5,convertnum6};
            Arrays.sort(alphabetize);
            // Output the results
            ArrayList<String> outputs = new ArrayList<>();
            if (convertnum1.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            String[] outputss = outputs.toArray(new String[0]);
            String output = Arrays.toString(outputss);
            char[] ca = regx.toCharArray();
            for (char c : ca) {
                output = output.replace(""+c, "");
            }
            System.out.println(output);
            stage1output.setText(output);
            // Disable stage 1
            stage1TB1.setEditable(false);
            stage1TB2.setEditable(false);
            stage1TB3.setEditable(false);
            stage1TB4.setEditable(false);
            stage1TB5.setEditable(false);
            stage1TB6.setEditable(false);
            stage1button.setEnabled(false);
            // Enable stage 2
            stage2TB1.setEditable(true);
            stage2TB2.setEditable(true);
            stage2TB3.setEditable(true);
            stage2TB4.setEditable(true);
            stage2TB5.setEditable(true);
            stage2TB6.setEditable(true);
            stage2button.setEnabled(true);
        });
        stage2button.addActionListener((ActionEvent e) -> {
            int number1 = Integer.parseInt(stage2TB1.getText());
            int number2 = Integer.parseInt(stage2TB2.getText());
            int number3 = Integer.parseInt(stage2TB3.getText());
            int number4 = Integer.parseInt(stage2TB4.getText());
            int number5 = Integer.parseInt(stage2TB5.getText());
            int number6 = Integer.parseInt(stage2TB6.getText());
            String convertnum1 = "";
            String convertnum2 = "";
            String convertnum3 = "";
            String convertnum4 = "";
            String convertnum5 = "";
            String convertnum6 = "";
            switch (number1) {
                case 1: convertnum1 = "six"; break;
                case 2: convertnum1 = "seven"; break;
                case 3: convertnum1 = "sixteen"; break;
                case 4: convertnum1 = "seventeen"; break;
                case 5: convertnum1 = "sixty"; break;
                case 6: convertnum1 = "sixty six"; break;
                case 7: convertnum1 = "sixty seven"; break;
                case 8: convertnum1 = "seventy"; break;
                case 9: convertnum1 = "seventy six"; break;
                case 10: convertnum1 = "seventy seven"; break;
                case 11: convertnum1 = "six hundred"; break;
                case 12: convertnum1 = "six hundred and six"; break;
                case 13: convertnum1 = "six hundred and seven"; break;
                case 14: convertnum1 = "six hundred and sixty"; break;
                case 15: convertnum1 = "six hundred and sixty six"; break;
                case 16: convertnum1 = "six hundred and sixty seven"; break;
                case 17: convertnum1 = "six hundred and seventy"; break;
                case 18: convertnum1 = "six hundred and seventy six"; break;
                case 19: convertnum1 = "six hundred and seventy seven"; break;
                case 20: convertnum1 = "seven hundred"; break;
                case 21: convertnum1 = "seven hundred and six"; break;
                case 22: convertnum1 = "seven hundred and seven"; break;
                case 23: convertnum1 = "seven hundred and sixty"; break;
                case 24: convertnum1 = "seven hundred and sixty six"; break;
                case 25: convertnum1 = "seven hundred and sixty seven"; break;
                case 26: convertnum1 = "seven hundred and seventy"; break;
                case 27: convertnum1 = "seven hundred and seventy six"; break;
                default: convertnum1 = "seven hundred and seventy seven"; break;
            } switch (number2) {
                case 1: convertnum2 = "six"; break;
                case 2: convertnum2 = "seven"; break;
                case 3: convertnum2 = "sixteen"; break;
                case 4: convertnum2 = "seventeen"; break;
                case 5: convertnum2 = "sixty"; break;
                case 6: convertnum2 = "sixty six"; break;
                case 7: convertnum2 = "sixty seven"; break;
                case 8: convertnum2 = "seventy"; break;
                case 9: convertnum2 = "seventy six"; break;
                case 10: convertnum2 = "seventy seven"; break;
                case 11: convertnum2 = "six hundred"; break;
                case 12: convertnum2 = "six hundred and six"; break;
                case 13: convertnum2 = "six hundred and seven"; break;
                case 14: convertnum2 = "six hundred and sixty"; break;
                case 15: convertnum2 = "six hundred and sixty six"; break;
                case 16: convertnum2 = "six hundred and sixty seven"; break;
                case 17: convertnum2 = "six hundred and seventy"; break;
                case 18: convertnum2 = "six hundred and seventy six"; break;
                case 19: convertnum2 = "six hundred and seventy seven"; break;
                case 20: convertnum2 = "seven hundred"; break;
                case 21: convertnum2 = "seven hundred and six"; break;
                case 22: convertnum2 = "seven hundred and seven"; break;
                case 23: convertnum2 = "seven hundred and sixty"; break;
                case 24: convertnum2 = "seven hundred and sixty six"; break;
                case 25: convertnum2 = "seven hundred and sixty seven"; break;
                case 26: convertnum2 = "seven hundred and seventy"; break;
                case 27: convertnum2 = "seven hundred and seventy six"; break;
                default: convertnum2 = "seven hundred and seventy seven"; break;
            } switch (number3) {
                case 1: convertnum3 = "six"; break;
                case 2: convertnum3 = "seven"; break;
                case 3: convertnum3 = "sixteen"; break;
                case 4: convertnum3 = "seventeen"; break;
                case 5: convertnum3 = "sixty"; break;
                case 6: convertnum3 = "sixty six"; break;
                case 7: convertnum3 = "sixty seven"; break;
                case 8: convertnum3 = "seventy"; break;
                case 9: convertnum3 = "seventy six"; break;
                case 10: convertnum3 = "seventy seven"; break;
                case 11: convertnum3 = "six hundred"; break;
                case 12: convertnum3 = "six hundred and six"; break;
                case 13: convertnum3 = "six hundred and seven"; break;
                case 14: convertnum3 = "six hundred and sixty"; break;
                case 15: convertnum3 = "six hundred and sixty six"; break;
                case 16: convertnum3 = "six hundred and sixty seven"; break;
                case 17: convertnum3 = "six hundred and seventy"; break;
                case 18: convertnum3 = "six hundred and seventy six"; break;
                case 19: convertnum3 = "six hundred and seventy seven"; break;
                case 20: convertnum3 = "seven hundred"; break;
                case 21: convertnum3 = "seven hundred and six"; break;
                case 22: convertnum3 = "seven hundred and seven"; break;
                case 23: convertnum3 = "seven hundred and sixty"; break;
                case 24: convertnum3 = "seven hundred and sixty six"; break;
                case 25: convertnum3 = "seven hundred and sixty seven"; break;
                case 26: convertnum3 = "seven hundred and seventy"; break;
                case 27: convertnum3 = "seven hundred and seventy six"; break;
                default: convertnum3 = "seven hundred and seventy seven"; break;
            } switch (number4) {
                case 1: convertnum4 = "six"; break;
                case 2: convertnum4 = "seven"; break;
                case 3: convertnum4 = "sixteen"; break;
                case 4: convertnum4 = "seventeen"; break;
                case 5: convertnum4 = "sixty"; break;
                case 6: convertnum4 = "sixty six"; break;
                case 7: convertnum4 = "sixty seven"; break;
                case 8: convertnum4 = "seventy"; break;
                case 9: convertnum4 = "seventy six"; break;
                case 10: convertnum4 = "seventy seven"; break;
                case 11: convertnum4 = "six hundred"; break;
                case 12: convertnum4 = "six hundred and six"; break;
                case 13: convertnum4 = "six hundred and seven"; break;
                case 14: convertnum4 = "six hundred and sixty"; break;
                case 15: convertnum4 = "six hundred and sixty six"; break;
                case 16: convertnum4 = "six hundred and sixty seven"; break;
                case 17: convertnum4 = "six hundred and seventy"; break;
                case 18: convertnum4 = "six hundred and seventy six"; break;
                case 19: convertnum4 = "six hundred and seventy seven"; break;
                case 20: convertnum4 = "seven hundred"; break;
                case 21: convertnum4 = "seven hundred and six"; break;
                case 22: convertnum4 = "seven hundred and seven"; break;
                case 23: convertnum4 = "seven hundred and sixty"; break;
                case 24: convertnum4 = "seven hundred and sixty six"; break;
                case 25: convertnum4 = "seven hundred and sixty seven"; break;
                case 26: convertnum4 = "seven hundred and seventy"; break;
                case 27: convertnum4 = "seven hundred and seventy six"; break;
                default: convertnum4 = "seven hundred and seventy seven"; break;
            } switch (number5) {
                case 1: convertnum5 = "six"; break;
                case 2: convertnum5 = "seven"; break;
                case 3: convertnum5 = "sixteen"; break;
                case 4: convertnum5 = "seventeen"; break;
                case 5: convertnum5 = "sixty"; break;
                case 6: convertnum5 = "sixty six"; break;
                case 7: convertnum5 = "sixty seven"; break;
                case 8: convertnum5 = "seventy"; break;
                case 9: convertnum5 = "seventy six"; break;
                case 10: convertnum5 = "seventy seven"; break;
                case 11: convertnum5 = "six hundred"; break;
                case 12: convertnum5 = "six hundred and six"; break;
                case 13: convertnum5 = "six hundred and seven"; break;
                case 14: convertnum5 = "six hundred and sixty"; break;
                case 15: convertnum5 = "six hundred and sixty six"; break;
                case 16: convertnum5 = "six hundred and sixty seven"; break;
                case 17: convertnum5 = "six hundred and seventy"; break;
                case 18: convertnum5 = "six hundred and seventy six"; break;
                case 19: convertnum5 = "six hundred and seventy seven"; break;
                case 20: convertnum5 = "seven hundred"; break;
                case 21: convertnum5 = "seven hundred and six"; break;
                case 22: convertnum5 = "seven hundred and seven"; break;
                case 23: convertnum5 = "seven hundred and sixty"; break;
                case 24: convertnum5 = "seven hundred and sixty six"; break;
                case 25: convertnum5 = "seven hundred and sixty seven"; break;
                case 26: convertnum5 = "seven hundred and seventy"; break;
                case 27: convertnum5 = "seven hundred and seventy six"; break;
                default: convertnum5 = "seven hundred and seventy seven"; break;
            } switch (number6) {
                case 1: convertnum6 = "six"; break;
                case 2: convertnum6 = "seven"; break;
                case 3: convertnum6 = "sixteen"; break;
                case 4: convertnum6 = "seventeen"; break;
                case 5: convertnum6 = "sixty"; break;
                case 6: convertnum6 = "sixty six"; break;
                case 7: convertnum6 = "sixty seven"; break;
                case 8: convertnum6 = "seventy"; break;
                case 9: convertnum6 = "seventy six"; break;
                case 10: convertnum6 = "seventy seven"; break;
                case 11: convertnum6 = "six hundred"; break;
                case 12: convertnum6 = "six hundred and six"; break;
                case 13: convertnum6 = "six hundred and seven"; break;
                case 14: convertnum6 = "six hundred and sixty"; break;
                case 15: convertnum6 = "six hundred and sixty six"; break;
                case 16: convertnum6 = "six hundred and sixty seven"; break;
                case 17: convertnum6 = "six hundred and seventy"; break;
                case 18: convertnum6 = "six hundred and seventy six"; break;
                case 19: convertnum6 = "six hundred and seventy seven"; break;
                case 20: convertnum6 = "seven hundred"; break;
                case 21: convertnum6 = "seven hundred and six"; break;
                case 22: convertnum6 = "seven hundred and seven"; break;
                case 23: convertnum6 = "seven hundred and sixty"; break;
                case 24: convertnum6 = "seven hundred and sixty six"; break;
                case 25: convertnum6 = "seven hundred and sixty seven"; break;
                case 26: convertnum6 = "seven hundred and seventy"; break;
                case 27: convertnum6 = "seven hundred and seventy six"; break;
                default: convertnum6 = "seven hundred and seventy seven"; break;
            }
            String alphabetize[] = {convertnum1,convertnum2,convertnum3,convertnum4,convertnum5,convertnum6};
            Arrays.sort(alphabetize);
            ArrayList<String> outputs = new ArrayList<>();
            if (convertnum1.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            String[] outputss = outputs.toArray(new String[0]);
            String output = Arrays.toString(outputss);
            char[] ca = regx.toCharArray();
            for (char c : ca) {
                output = output.replace(""+c, "");
            }
            System.out.println(output);
            stage2output.setText(output);
            stage2TB1.setEditable(false);
            stage2TB2.setEditable(false);
            stage2TB3.setEditable(false);
            stage2TB4.setEditable(false);
            stage2TB5.setEditable(false);
            stage2TB6.setEditable(false);
            stage2button.setEnabled(false);
            stage3TB1.setEditable(true);
            stage3TB2.setEditable(true);
            stage3TB3.setEditable(true);
            stage3TB4.setEditable(true);
            stage3TB5.setEditable(true);
            stage3TB6.setEditable(true);
            stage3button.setEnabled(true);
        });
        stage3button.addActionListener((ActionEvent e) -> {
            int number1 = Integer.parseInt(stage3TB1.getText());
            int number2 = Integer.parseInt(stage3TB2.getText());
            int number3 = Integer.parseInt(stage3TB3.getText());
            int number4 = Integer.parseInt(stage3TB4.getText());
            int number5 = Integer.parseInt(stage3TB5.getText());
            int number6 = Integer.parseInt(stage3TB6.getText());
            String convertnum1 = "";
            String convertnum2 = "";
            String convertnum3 = "";
            String convertnum4 = "";
            String convertnum5 = "";
            String convertnum6 = "";
            switch (number1) {
                case 1: convertnum1 = "four"; break;
                case 2: convertnum1 = "five"; break;
                case 3: convertnum1 = "fourteen"; break;
                case 4: convertnum1 = "fifteen"; break;
                case 5: convertnum1 = "forty"; break;
                case 6: convertnum1 = "forty four"; break;
                case 7: convertnum1 = "forty five"; break;
                case 8: convertnum1 = "fifty"; break;
                case 9: convertnum1 = "fifty four"; break;
                case 10: convertnum1 = "fifty five"; break;
                case 11: convertnum1 = "four hundred"; break;
                case 12: convertnum1 = "four hundred and four"; break;
                case 13: convertnum1 = "four hundred and five"; break;
                case 14: convertnum1 = "four hundred and forty"; break;
                case 15: convertnum1 = "four hundred and forty four"; break;
                case 16: convertnum1 = "four hundred and forty five"; break;
                case 17: convertnum1 = "four hundred and fifty"; break;
                case 18: convertnum1 = "four hundred and fifty four"; break;
                case 19: convertnum1 = "four hundred and fifty five"; break;
                case 20: convertnum1 = "five hundred"; break;
                case 21: convertnum1 = "five hundred and four"; break;
                case 22: convertnum1 = "five hundred and five"; break;
                case 23: convertnum1 = "five hundred and forty"; break;
                case 24: convertnum1 = "five hundred and forty four"; break;
                case 25: convertnum1 = "five hundred and forty five"; break;
                case 26: convertnum1 = "five hundred and fifty"; break;
                case 27: convertnum1 = "five hundred and fifty four"; break;
                default: convertnum1 = "five hundred and fifty five"; break;
            } switch (number2) {
                case 1: convertnum2 = "four"; break;
                case 2: convertnum2 = "five"; break;
                case 3: convertnum2 = "fourteen"; break;
                case 4: convertnum2 = "fifteen"; break;
                case 5: convertnum2 = "fourty"; break;
                case 6: convertnum2 = "fourty four"; break;
                case 7: convertnum2 = "fourty five"; break;
                case 8: convertnum2 = "fifty"; break;
                case 9: convertnum2 = "fifty four"; break;
                case 10: convertnum2 = "fifty five"; break;
                case 11: convertnum2 = "four hundred"; break;
                case 12: convertnum2 = "four hundred and four"; break;
                case 13: convertnum2 = "four hundred and five"; break;
                case 14: convertnum2 = "four hundred and forty"; break;
                case 15: convertnum2 = "four hundred and forty four"; break;
                case 16: convertnum2 = "four hundred and forty five"; break;
                case 17: convertnum2 = "four hundred and fifty"; break;
                case 18: convertnum2 = "four hundred and fifty four"; break;
                case 19: convertnum2 = "four hundred and fifty five"; break;
                case 20: convertnum2 = "five hundred"; break;
                case 21: convertnum2 = "five hundred and four"; break;
                case 22: convertnum2 = "five hundred and five"; break;
                case 23: convertnum2 = "five hundred and forty"; break;
                case 24: convertnum2 = "five hundred and forty four"; break;
                case 25: convertnum2 = "five hundred and forty five"; break;
                case 26: convertnum2 = "five hundred and fifty"; break;
                case 27: convertnum2 = "five hundred and fifty four"; break;
                default: convertnum2 = "five hundred and fifty five"; break;
            } switch (number3) {
                case 1: convertnum3 = "four"; break;
                case 2: convertnum3 = "five"; break;
                case 3: convertnum3 = "fourteen"; break;
                case 4: convertnum3 = "fifteen"; break;
                case 5: convertnum3 = "fourty"; break;
                case 6: convertnum3 = "fourty four"; break;
                case 7: convertnum3 = "fourty five"; break;
                case 8: convertnum3 = "fifty"; break;
                case 9: convertnum3 = "fifty four"; break;
                case 10: convertnum3 = "fifty five"; break;
                case 11: convertnum3 = "four hundred"; break;
                case 12: convertnum3 = "four hundred and four"; break;
                case 13: convertnum3 = "four hundred and five"; break;
                case 14: convertnum3 = "four hundred and forty"; break;
                case 15: convertnum3 = "four hundred and forty four"; break;
                case 16: convertnum3 = "four hundred and forty five"; break;
                case 17: convertnum3 = "four hundred and fifty"; break;
                case 18: convertnum3 = "four hundred and fifty four"; break;
                case 19: convertnum3 = "four hundred and fifty five"; break;
                case 20: convertnum3 = "five hundred"; break;
                case 21: convertnum3 = "five hundred and four"; break;
                case 22: convertnum3 = "five hundred and five"; break;
                case 23: convertnum3 = "five hundred and forty"; break;
                case 24: convertnum3 = "five hundred and forty four"; break;
                case 25: convertnum3 = "five hundred and forty five"; break;
                case 26: convertnum3 = "five hundred and fifty"; break;
                case 27: convertnum3 = "five hundred and fifty four"; break;
                default: convertnum3 = "five hundred and fifty five"; break;
            } switch (number4) {
                case 1: convertnum4 = "four"; break;
                case 2: convertnum4 = "five"; break;
                case 3: convertnum4 = "fourteen"; break;
                case 4: convertnum4 = "fifteen"; break;
                case 5: convertnum4 = "fourty"; break;
                case 6: convertnum4 = "fourty four"; break;
                case 7: convertnum4 = "fourty five"; break;
                case 8: convertnum4 = "fifty"; break;
                case 9: convertnum4 = "fifty four"; break;
                case 10: convertnum4 = "fifty five"; break;
                case 11: convertnum4 = "four hundred"; break;
                case 12: convertnum4 = "four hundred and four"; break;
                case 13: convertnum4 = "four hundred and five"; break;
                case 14: convertnum4 = "four hundred and forty"; break;
                case 15: convertnum4 = "four hundred and forty four"; break;
                case 16: convertnum4 = "four hundred and forty five"; break;
                case 17: convertnum4 = "four hundred and fifty"; break;
                case 18: convertnum4 = "four hundred and fifty four"; break;
                case 19: convertnum4 = "four hundred and fifty five"; break;
                case 20: convertnum4 = "five hundred"; break;
                case 21: convertnum4 = "five hundred and four"; break;
                case 22: convertnum4 = "five hundred and five"; break;
                case 23: convertnum4 = "five hundred and forty"; break;
                case 24: convertnum4 = "five hundred and forty four"; break;
                case 25: convertnum4 = "five hundred and forty five"; break;
                case 26: convertnum4 = "five hundred and fifty"; break;
                case 27: convertnum4 = "five hundred and fifty four"; break;
                default: convertnum4 = "five hundred and fifty five"; break;
            } switch (number5) {
                case 1: convertnum5 = "four"; break;
                case 2: convertnum5 = "five"; break;
                case 3: convertnum5 = "fourteen"; break;
                case 4: convertnum5 = "fifteen"; break;
                case 5: convertnum5 = "fourty"; break;
                case 6: convertnum5 = "fourty four"; break;
                case 7: convertnum5 = "fourty five"; break;
                case 8: convertnum5 = "fifty"; break;
                case 9: convertnum5 = "fifty four"; break;
                case 10: convertnum5 = "fifty five"; break;
                case 11: convertnum5 = "four hundred"; break;
                case 12: convertnum5 = "four hundred and four"; break;
                case 13: convertnum5 = "four hundred and five"; break;
                case 14: convertnum5 = "four hundred and forty"; break;
                case 15: convertnum5 = "four hundred and forty four"; break;
                case 16: convertnum5 = "four hundred and forty five"; break;
                case 17: convertnum5 = "four hundred and fifty"; break;
                case 18: convertnum5 = "four hundred and fifty four"; break;
                case 19: convertnum5 = "four hundred and fifty five"; break;
                case 20: convertnum5 = "five hundred"; break;
                case 21: convertnum5 = "five hundred and four"; break;
                case 22: convertnum5 = "five hundred and five"; break;
                case 23: convertnum5 = "five hundred and forty"; break;
                case 24: convertnum5 = "five hundred and forty four"; break;
                case 25: convertnum5 = "five hundred and forty five"; break;
                case 26: convertnum5 = "five hundred and fifty"; break;
                case 27: convertnum5 = "five hundred and fifty four"; break;
                default: convertnum5 = "five hundred and fifty five"; break;
            } switch (number6) {
                case 1: convertnum6 = "four"; break;
                case 2: convertnum6 = "five"; break;
                case 3: convertnum6 = "fourteen"; break;
                case 4: convertnum6 = "fifteen"; break;
                case 5: convertnum6 = "fourty"; break;
                case 6: convertnum6 = "fourty four"; break;
                case 7: convertnum6 = "fourty five"; break;
                case 8: convertnum6 = "fifty"; break;
                case 9: convertnum6 = "fifty four"; break;
                case 10: convertnum6 = "fifty five"; break;
                case 11: convertnum6 = "four hundred"; break;
                case 12: convertnum6 = "four hundred and four"; break;
                case 13: convertnum6 = "four hundred and five"; break;
                case 14: convertnum6 = "four hundred and forty"; break;
                case 15: convertnum6 = "four hundred and forty four"; break;
                case 16: convertnum6 = "four hundred and forty five"; break;
                case 17: convertnum6 = "four hundred and fifty"; break;
                case 18: convertnum6 = "four hundred and fifty four"; break;
                case 19: convertnum6 = "four hundred and fifty five"; break;
                case 20: convertnum6 = "five hundred"; break;
                case 21: convertnum6 = "five hundred and four"; break;
                case 22: convertnum6 = "five hundred and five"; break;
                case 23: convertnum6 = "five hundred and forty"; break;
                case 24: convertnum6 = "five hundred and forty four"; break;
                case 25: convertnum6 = "five hundred and forty five"; break;
                case 26: convertnum6 = "five hundred and fifty"; break;
                case 27: convertnum6 = "five hundred and fifty four"; break;
                default: convertnum6 = "five hundred and fifty five"; break;
            }
            String alphabetize[] = {convertnum1,convertnum2,convertnum3,convertnum4,convertnum5,convertnum6};
            Arrays.sort(alphabetize);
            ArrayList<String> outputs = new ArrayList<>();
            if (convertnum1.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            String[] outputss = outputs.toArray(new String[0]);
            String output = Arrays.toString(outputss);
            char[] ca = regx.toCharArray();
            for (char c : ca) {
                output = output.replace(""+c, "");
            }
            System.out.println(output);
            stage3output.setText(output);
            stage3TB1.setEditable(false);
            stage3TB2.setEditable(false);
            stage3TB3.setEditable(false);
            stage3TB4.setEditable(false);
            stage3TB5.setEditable(false);
            stage3TB6.setEditable(false);
            stage3button.setEnabled(false);
            stage4TB1.setEditable(true);
            stage4TB2.setEditable(true);
            stage4TB3.setEditable(true);
            stage4TB4.setEditable(true);
            stage4TB5.setEditable(true);
            stage4TB6.setEditable(true);
            stage4button.setEnabled(true);
        });
        stage4button.addActionListener((ActionEvent e) -> {
            int number1 = Integer.parseInt(stage4TB1.getText());
            int number2 = Integer.parseInt(stage4TB2.getText());
            int number3 = Integer.parseInt(stage4TB3.getText());
            int number4 = Integer.parseInt(stage4TB4.getText());
            int number5 = Integer.parseInt(stage4TB5.getText());
            int number6 = Integer.parseInt(stage4TB6.getText());
            String convertnum1 = "";
            String convertnum2 = "";
            String convertnum3 = "";
            String convertnum4 = "";
            String convertnum5 = "";
            String convertnum6 = "";
            switch (number1) {
                case 1: convertnum1 = "two"; break;
                case 2: convertnum1 = "three"; break;
                case 3: convertnum1 = "ten"; break;
                case 4: convertnum1 = "twelve"; break;
                case 5: convertnum1 = "thirteen"; break;
                case 6: convertnum1 = "twenty"; break;
                case 7: convertnum1 = "twenty two"; break;
                case 8: convertnum1 = "twenty three"; break;
                case 9: convertnum1 = "thirty"; break;
                case 10: convertnum1 = "thirty two"; break;
                case 11: convertnum1 = "thirty three"; break;
                case 12: convertnum1 = "two hundred"; break;
                case 13: convertnum1 = "two hundred and two"; break;
                case 14: convertnum1 = "two hundred and three"; break;
                case 15: convertnum1 = "two hundred and twenty"; break;
                case 16: convertnum1 = "two hundred and twenty two"; break;
                case 17: convertnum1 = "two hundred and twenty three"; break;
                case 18: convertnum1 = "two hundred and thirty"; break;
                case 19: convertnum1 = "two hundred and thirty two"; break;
                case 20: convertnum1 = "two hundred and thirty three"; break;
                case 21: convertnum1 = "three hundred"; break;
                case 22: convertnum1 = "three hundred and two"; break;
                case 23: convertnum1 = "three hundred and three"; break;
                case 24: convertnum1 = "three hundred and twenty"; break;
                case 25: convertnum1 = "three hundred and twenty two"; break;
                case 26: convertnum1 = "three hundred and twenty three"; break;
                case 27: convertnum1 = "three hundred and thirty"; break;
                case 28: convertnum1 = "three hundred and thirty two"; break;
                case 29: convertnum1 = "three hundred and thirty three"; break;
                case 30: convertnum1 = "thousand"; break;
                case 31: convertnum1 = "ten thousand"; break;
                default: convertnum1 = "trillion"; break;
            } switch (number2) {
                case 1: convertnum2 = "two"; break;
                case 2: convertnum2 = "three"; break;
                case 3: convertnum2 = "ten"; break;
                case 4: convertnum2 = "twelve"; break;
                case 5: convertnum2 = "thirteen"; break;
                case 6: convertnum2 = "twenty"; break;
                case 7: convertnum2 = "twenty two"; break;
                case 8: convertnum2 = "twenty three"; break;
                case 9: convertnum2 = "thirty"; break;
                case 10: convertnum2 = "thirty two"; break;
                case 11: convertnum2 = "thirty three"; break;
                case 12: convertnum2 = "two hundred"; break;
                case 13: convertnum2 = "two hundred and two"; break;
                case 14: convertnum2 = "two hundred and three"; break;
                case 15: convertnum2 = "two hundred and twenty"; break;
                case 16: convertnum2 = "two hundred and twenty two"; break;
                case 17: convertnum2 = "two hundred and twenty three"; break;
                case 18: convertnum2 = "two hundred and thirty"; break;
                case 19: convertnum2 = "two hundred and thirty two"; break;
                case 20: convertnum2 = "two hundred and thirty three"; break;
                case 21: convertnum2 = "three hundred"; break;
                case 22: convertnum2 = "three hundred and two"; break;
                case 23: convertnum2 = "three hundred and three"; break;
                case 24: convertnum2 = "three hundred and twenty"; break;
                case 25: convertnum2 = "three hundred and twenty two"; break;
                case 26: convertnum2 = "three hundred and twenty three"; break;
                case 27: convertnum2 = "three hundred and thirty"; break;
                case 28: convertnum2 = "three hundred and thirty two"; break;
                case 29: convertnum2 = "three hundred and thirty three"; break;
                case 30: convertnum2 = "thousand"; break;
                case 31: convertnum2 = "ten thousand"; break;
                default: convertnum2 = "trillion"; break;
            } switch (number3) {
                case 1: convertnum3 = "two"; break;
                case 2: convertnum3 = "three"; break;
                case 3: convertnum3 = "ten"; break;
                case 4: convertnum3 = "twelve"; break;
                case 5: convertnum3 = "thirteen"; break;
                case 6: convertnum3 = "twenty"; break;
                case 7: convertnum3 = "twenty two"; break;
                case 8: convertnum3 = "twenty three"; break;
                case 9: convertnum3 = "thirty"; break;
                case 10: convertnum3 = "thirty two"; break;
                case 11: convertnum3 = "thirty three"; break;
                case 12: convertnum3 = "two hundred"; break;
                case 13: convertnum3 = "two hundred and two"; break;
                case 14: convertnum3 = "two hundred and three"; break;
                case 15: convertnum3 = "two hundred and twenty"; break;
                case 16: convertnum3 = "two hundred and twenty two"; break;
                case 17: convertnum3 = "two hundred and twenty three"; break;
                case 18: convertnum3 = "two hundred and thirty"; break;
                case 19: convertnum3 = "two hundred and thirty two"; break;
                case 20: convertnum3 = "two hundred and thirty three"; break;
                case 21: convertnum3 = "three hundred"; break;
                case 22: convertnum3 = "three hundred and two"; break;
                case 23: convertnum3 = "three hundred and three"; break;
                case 24: convertnum3 = "three hundred and twenty"; break;
                case 25: convertnum3 = "three hundred and twenty two"; break;
                case 26: convertnum3 = "three hundred and twenty three"; break;
                case 27: convertnum3 = "three hundred and thirty"; break;
                case 28: convertnum3 = "three hundred and thirty two"; break;
                case 29: convertnum3 = "three hundred and thirty three"; break;
                case 30: convertnum3 = "thousand"; break;
                case 31: convertnum3 = "ten thousand"; break;
                default: convertnum3 = "trillion"; break;
            } switch (number4) {
                case 1: convertnum4 = "two"; break;
                case 2: convertnum4 = "three"; break;
                case 3: convertnum4 = "ten"; break;
                case 4: convertnum4 = "twelve"; break;
                case 5: convertnum4 = "thirteen"; break;
                case 6: convertnum4 = "twenty"; break;
                case 7: convertnum4 = "twenty two"; break;
                case 8: convertnum4 = "twenty three"; break;
                case 9: convertnum4 = "thirty"; break;
                case 10: convertnum4 = "thirty two"; break;
                case 11: convertnum4 = "thirty three"; break;
                case 12: convertnum4 = "two hundred"; break;
                case 13: convertnum4 = "two hundred and two"; break;
                case 14: convertnum4 = "two hundred and three"; break;
                case 15: convertnum4 = "two hundred and twenty"; break;
                case 16: convertnum4 = "two hundred and twenty two"; break;
                case 17: convertnum4 = "two hundred and twenty three"; break;
                case 18: convertnum4 = "two hundred and thirty"; break;
                case 19: convertnum4 = "two hundred and thirty two"; break;
                case 20: convertnum4 = "two hundred and thirty three"; break;
                case 21: convertnum4 = "three hundred"; break;
                case 22: convertnum4 = "three hundred and two"; break;
                case 23: convertnum4 = "three hundred and three"; break;
                case 24: convertnum4 = "three hundred and twenty"; break;
                case 25: convertnum4 = "three hundred and twenty two"; break;
                case 26: convertnum4 = "three hundred and twenty three"; break;
                case 27: convertnum4 = "three hundred and thirty"; break;
                case 28: convertnum4 = "three hundred and thirty two"; break;
                case 29: convertnum4 = "three hundred and thirty three"; break;
                case 30: convertnum4 = "thousand"; break;
                case 31: convertnum4 = "ten thousand"; break;
                default: convertnum4 = "trillion"; break;
            } switch (number5) {
                case 1: convertnum5 = "two"; break;
                case 2: convertnum5 = "three"; break;
                case 3: convertnum5 = "ten"; break;
                case 4: convertnum5 = "twelve"; break;
                case 5: convertnum5 = "thirteen"; break;
                case 6: convertnum5 = "twenty"; break;
                case 7: convertnum5 = "twenty two"; break;
                case 8: convertnum5 = "twenty three"; break;
                case 9: convertnum5 = "thirty"; break;
                case 10: convertnum5 = "thirty two"; break;
                case 11: convertnum5 = "thirty three"; break;
                case 12: convertnum5 = "two hundred"; break;
                case 13: convertnum5 = "two hundred and two"; break;
                case 14: convertnum5 = "two hundred and three"; break;
                case 15: convertnum5 = "two hundred and twenty"; break;
                case 16: convertnum5 = "two hundred and twenty two"; break;
                case 17: convertnum5 = "two hundred and twenty three"; break;
                case 18: convertnum5 = "two hundred and thirty"; break;
                case 19: convertnum5 = "two hundred and thirty two"; break;
                case 20: convertnum5 = "two hundred and thirty three"; break;
                case 21: convertnum5 = "three hundred"; break;
                case 22: convertnum5 = "three hundred and two"; break;
                case 23: convertnum5 = "three hundred and three"; break;
                case 24: convertnum5 = "three hundred and twenty"; break;
                case 25: convertnum5 = "three hundred and twenty two"; break;
                case 26: convertnum5 = "three hundred and twenty three"; break;
                case 27: convertnum5 = "three hundred and thirty"; break;
                case 28: convertnum5 = "three hundred and thirty two"; break;
                case 29: convertnum5 = "three hundred and thirty three"; break;
                case 30: convertnum5 = "thousand"; break;
                case 31: convertnum5 = "ten thousand"; break;
                default: convertnum5 = "trillion"; break;
            } switch (number6) {
                case 1: convertnum6 = "two"; break;
                case 2: convertnum6 = "three"; break;
                case 3: convertnum6 = "ten"; break;
                case 4: convertnum6 = "twelve"; break;
                case 5: convertnum6 = "thirteen"; break;
                case 6: convertnum6 = "twenty"; break;
                case 7: convertnum6 = "twenty two"; break;
                case 8: convertnum6 = "twenty three"; break;
                case 9: convertnum6 = "thirty"; break;
                case 10: convertnum6 = "thirty two"; break;
                case 11: convertnum6 = "thirty three"; break;
                case 12: convertnum6 = "two hundred"; break;
                case 13: convertnum6 = "two hundred and two"; break;
                case 14: convertnum6 = "two hundred and three"; break;
                case 15: convertnum6 = "two hundred and twenty"; break;
                case 16: convertnum6 = "two hundred and twenty two"; break;
                case 17: convertnum6 = "two hundred and twenty three"; break;
                case 18: convertnum6 = "two hundred and thirty"; break;
                case 19: convertnum6 = "two hundred and thirty two"; break;
                case 20: convertnum6 = "two hundred and thirty three"; break;
                case 21: convertnum6 = "three hundred"; break;
                case 22: convertnum6 = "three hundred and two"; break;
                case 23: convertnum6 = "three hundred and three"; break;
                case 24: convertnum6 = "three hundred and twenty"; break;
                case 25: convertnum6 = "three hundred and twenty two"; break;
                case 26: convertnum6 = "three hundred and twenty three"; break;
                case 27: convertnum6 = "three hundred and thirty"; break;
                case 28: convertnum6 = "three hundred and thirty two"; break;
                case 29: convertnum6 = "three hundred and thirty three"; break;
                case 30: convertnum6 = "thousand"; break;
                case 31: convertnum6 = "ten thousand"; break;
                default: convertnum6 = "trillion"; break;
            }
            String alphabetize[] = {convertnum1,convertnum2,convertnum3,convertnum4,convertnum5,convertnum6};
            Arrays.sort(alphabetize);
            ArrayList<String> outputs = new ArrayList<>();
            if (convertnum1.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[0])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[1])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[2])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[3])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[4])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            if (convertnum1.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number1));
            } else if (convertnum2.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number2));
            } else if (convertnum3.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number3));
            } else if (convertnum4.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number4));
            } else if (convertnum5.equals(alphabetize[5])) {
                outputs.add(Integer.toString(number5));
            } else {
                outputs.add(Integer.toString(number6));
            }
            String[] outputss = outputs.toArray(new String[0]);
            String output = Arrays.toString(outputss);
            char[] ca = regx.toCharArray();
            for (char c : ca) {
                output = output.replace(""+c, "");
            }
            System.out.println(output);
            stage4output.setText(output);
            stage4TB1.setEditable(false);
            stage4TB2.setEditable(false);
            stage4TB3.setEditable(false);
            stage4TB4.setEditable(false);
            stage4TB5.setEditable(false);
            stage4TB6.setEditable(false);
            stage4button.setEnabled(false);
        });
        resetButton.addActionListener((ActionEvent e) -> {
            // Set the text boxes to 0
            stage1TB1.setText("0");
            stage1TB2.setText("0");
            stage1TB3.setText("0");
            stage1TB4.setText("0");
            stage1TB5.setText("0");
            stage1TB6.setText("0");
            stage2TB1.setText("0");
            stage2TB2.setText("0");
            stage2TB3.setText("0");
            stage2TB4.setText("0");
            stage2TB5.setText("0");
            stage2TB6.setText("0");
            stage3TB1.setText("0");
            stage3TB2.setText("0");
            stage3TB3.setText("0");
            stage3TB4.setText("0");
            stage3TB5.setText("0");
            stage3TB6.setText("0");
            stage4TB1.setText("0");
            stage4TB2.setText("0");
            stage4TB3.setText("0");
            stage4TB4.setText("0");
            stage4TB5.setText("0");
            stage4TB6.setText("0");
            // Enable stage 1
            stage1TB1.setEditable(true);
            stage1TB2.setEditable(true);
            stage1TB3.setEditable(true);
            stage1TB4.setEditable(true);
            stage1TB5.setEditable(true);
            stage1TB6.setEditable(true);
            stage1button.setEnabled(true);
            // Disable stages 2-4
            stage2TB1.setEditable(false);
            stage2TB2.setEditable(false);
            stage2TB3.setEditable(false);
            stage2TB4.setEditable(false);
            stage2TB5.setEditable(false);
            stage2TB6.setEditable(false);
            stage2button.setEnabled(false);
            stage3TB1.setEditable(false);
            stage3TB2.setEditable(false);
            stage3TB3.setEditable(false);
            stage3TB4.setEditable(false);
            stage3TB5.setEditable(false);
            stage3TB6.setEditable(false);
            stage3button.setEnabled(false);
            stage4TB1.setEditable(false);
            stage4TB2.setEditable(false);
            stage4TB3.setEditable(false);
            stage4TB4.setEditable(false);
            stage4TB5.setEditable(false);
            stage4TB6.setEditable(false);
            stage4button.setEnabled(false);
        });
    }
}
