/**
 * Memory module, started work on 5:49 PM 6/24/2018
 * 
 * (i forgot to put the details of version 0.1 and 0.2)
 * 
 * Version 0.2
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class memory {
    static JFrame f;
    // Set the position and label variables as static so java shuts the fuck up about "local inner class"
    static int p1 = 1;
    static int p2 = 1;
    static int l1 = 1;
    static int l2 = 1;
    static int l3 = 1;
    static int l4 = 1;
    public static void module() {
        System.out.println("[MEMORY MODULE]");
	f = new JFrame("KAaNE [MEMORY MODULE]");
        ImageIcon icon = new ImageIcon("imgs/icons/memory.png");
        f.setIconImage(icon.getImage());
        // Set line icon (Because I can't be arsed to fuck around with graphics)
        ImageIcon line = new ImageIcon("imgs/line.png");
        // Set number string array
        String numberArray[] = {"1","2","3","4"};
        // Stage 1 Text + Line
        JLabel stage1 = new JLabel();
        stage1.setBounds(20,10,45,20);
        stage1.setText("Stage 1");
        JLabel stage1line = new JLabel();
        stage1line.setIcon(line);
        stage1line.setBounds(0,35,350,1);
        // Stage 1 Display
        JComboBox<String> stage1DisplayCombo = new JComboBox<>(numberArray);
        stage1DisplayCombo.setBounds(20,40,40,20);
        // Stage 1 Display Text
        JLabel stage1DisplayText = new JLabel();
        stage1DisplayText.setBounds(70,40,50,20);
        stage1DisplayText.setText("Display");
        // Stage 1 Display Button
        JButton stage1DisplayButton = new JButton("OK");
        stage1DisplayButton.setBounds(120,40,60,20);
        // Stage 1 Label
        JComboBox<String> stage1LabelCombo = new JComboBox<>(numberArray);
        stage1LabelCombo.setBounds(190,40,40,20);
        // Stage 1 Label Text
        JLabel stage1LabelText = new JLabel();
        stage1LabelText.setBounds(240,40,60,20);
        // Stage 1 Next Button
        JButton stage1NextButton = new JButton("NEXT");
        stage1NextButton.setBounds(260,10,70,20);
        // Stage 1 Output Text
        JLabel stage1OutputText = new JLabel();
        stage1OutputText.setBounds(70,10,190,20);
        // Stage 2 Text + Lines
        JLabel stage2Line1 = new JLabel();
        stage2Line1.setIcon(line);
        stage2Line1.setBounds(0,65,350,1);
        JLabel stage2 = new JLabel();
        stage2.setBounds(20,72,45,20);
        stage2.setText("Stage 2");
        JLabel stage2Line2 = new JLabel();
        stage2Line2.setIcon(line);
        stage2Line2.setBounds(0,100,350,1);
        // Stage 2 Display
        JComboBox<String> stage2DisplayCombo = new JComboBox<>(numberArray);
        stage2DisplayCombo.setBounds(20,110,40,20);
        // Stage 2 Display Text
        JLabel stage2DisplayText = new JLabel();
        stage2DisplayText.setBounds(70,110,50,20);
        stage2DisplayText.setText("Display");
        // Stage 2 Display Button
        JButton stage2DisplayButton = new JButton("OK");
        stage2DisplayButton.setBounds(120,110,60,20);
        // Stage 2 Label/Position
        JComboBox<String> stage2LabelCombo = new JComboBox<>(numberArray);
        stage2LabelCombo.setBounds(190,110,40,20);
        // Stage 2 Label/Position Text
        JLabel stage2LabelText = new JLabel();
        stage2LabelText.setBounds(240,110,60,20);
        // Stage 2 Next Button
        JButton stage2NextButton = new JButton("NEXT");
        stage2NextButton.setBounds(260,72,70,20);
        // Stage 2 Output Text
        JLabel stage2OutputText = new JLabel();
        stage2OutputText.setBounds(70,72,190,20);
        // Stage 3 Text + Lines
        JLabel stage3Line1 = new JLabel();
        stage3Line1.setIcon(line);
        stage3Line1.setBounds(0,135,350,1);
        JLabel stage3 = new JLabel();
        stage3.setBounds(20,142,45,20);
        stage3.setText("Stage 3");
        JLabel stage3Line2 = new JLabel();
        stage3Line2.setIcon(line);
        stage3Line2.setBounds(0,170,350,1);
        // Stage 3 Display
        JComboBox<String> stage3DisplayCombo = new JComboBox<>(numberArray);
        stage3DisplayCombo.setBounds(20,180,40,20);
        // Stage 3 Display Text
        JLabel stage3DisplayText = new JLabel();
        stage3DisplayText.setBounds(70,180,50,20);
        stage3DisplayText.setText("Display");
        // Stage 3 Display Button
        JButton stage3DisplayButton = new JButton("OK");
        stage3DisplayButton.setBounds(120,180,60,20);
        // Stage 3 Label
        JComboBox<String> stage3LabelCombo = new JComboBox<>(numberArray);
        stage3LabelCombo.setBounds(190,180,40,20);
        // Stage 3 Label Text
        JLabel stage3LabelText = new JLabel();
        stage3LabelText.setBounds(240,180,60,20);
        // Stage 3 Next Button
        JButton stage3NextButton = new JButton("NEXT");
        stage3NextButton.setBounds(260,142,70,20);
        // Stage 3 Output Text
        JLabel stage3OutputText = new JLabel();
        stage3OutputText.setBounds(70,142,190,20);
        // Stage 4 Text + Lines
        JLabel stage4Line1 = new JLabel();
        stage4Line1.setIcon(line);
        stage4Line1.setBounds(0,205,350,1);
        JLabel stage4 = new JLabel();
        stage4.setBounds(20,212,45,20);
        stage4.setText("Stage 4");
        JLabel stage4Line2 = new JLabel();
        stage4Line2.setIcon(line);
        stage4Line2.setBounds(0,240,350,1);
        // Stage 4 Display
        JComboBox<String> stage4DisplayCombo = new JComboBox<>(numberArray);
        stage4DisplayCombo.setBounds(20,250,40,20);
        // Stage 4 Display Text
        JLabel stage4DisplayText = new JLabel();
        stage4DisplayText.setBounds(70,250,50,20);
        stage4DisplayText.setText("Display");
        // Stage 4 Display Button
        JButton stage4DisplayButton = new JButton("OK");
        stage4DisplayButton.setBounds(120,250,60,20);
        // Stage 4 Label
        JComboBox<String> stage4LabelCombo = new JComboBox<>(numberArray);
        stage4LabelCombo.setBounds(190,250,40,20);
        // Stage 4 Label Text
        JLabel stage4LabelText = new JLabel();
        stage4LabelText.setBounds(240,250,60,20);
        // Stage 4 Next Button
        JButton stage4NextButton = new JButton("NEXT");
        stage4NextButton.setBounds(260,212,70,20);
        // Stage 4 Output Text
        JLabel stage4OutputText = new JLabel();
        stage4OutputText.setBounds(70,212,190,20);
        // Stage 5 Text + Lines
        JLabel stage5Line1 = new JLabel();
        stage5Line1.setIcon(line);
        stage5Line1.setBounds(0,275,350,1);
        JLabel stage5 = new JLabel();
        stage5.setBounds(20,282,45,20);
        stage5.setText("Stage 5");
        JLabel stage5Line2 = new JLabel();
        stage5Line2.setIcon(line);
        stage5Line2.setBounds(0,310,350,1);
        // Stage 5 Display
        JComboBox<String> stage5DisplayCombo = new JComboBox<>(numberArray);
        stage5DisplayCombo.setBounds(20,320,40,20);
        // Stage 5 Display Text
        JLabel stage5DisplayText = new JLabel();
        stage5DisplayText.setBounds(70,320,50,20);
        stage5DisplayText.setText("Display");
        // Stage 5 Display Button
        JButton stage5DisplayButton = new JButton("OK");
        stage5DisplayButton.setBounds(120,320,60,20);
        // Stage 5 Output Text
        JLabel stage5OutputText = new JLabel();
        stage5OutputText.setBounds(70,282,190,20);
        // Reset Button
        JButton resetButton=new JButton("RESET");
        resetButton.setBounds(260,390,75,20);
        // Set most of the stages and stuff as non-visible, since we'll make it visible throughout.
        stage1LabelCombo.setVisible(false);
        stage1LabelText.setVisible(false);
        stage1NextButton.setVisible(false);
        stage1OutputText.setVisible(false);
        stage2Line1.setVisible(false);
        stage2.setVisible(false);
        stage2Line2.setVisible(false);
        stage2DisplayCombo.setVisible(false);
        stage2DisplayText.setVisible(false);
        stage2DisplayButton.setVisible(false);
        stage2LabelCombo.setVisible(false);
        stage2LabelText.setVisible(false);
        stage2NextButton.setVisible(false);
        stage2OutputText.setVisible(false);
        stage3Line1.setVisible(false);
        stage3.setVisible(false);
        stage3Line2.setVisible(false);
        stage3DisplayCombo.setVisible(false);
        stage3DisplayText.setVisible(false);
        stage3DisplayButton.setVisible(false);
        stage3LabelCombo.setVisible(false);
        stage3LabelText.setVisible(false);
        stage3NextButton.setVisible(false);
        stage3OutputText.setVisible(false);
        stage4Line1.setVisible(false);
        stage4.setVisible(false);
        stage4Line2.setVisible(false);
        stage4DisplayCombo.setVisible(false);
        stage4DisplayText.setVisible(false);
        stage4DisplayButton.setVisible(false);
        stage4LabelCombo.setVisible(false);
        stage4LabelText.setVisible(false);
        stage4NextButton.setVisible(false);
        stage4OutputText.setVisible(false);
        stage5Line1.setVisible(false);
        stage5.setVisible(false);
        stage5Line2.setVisible(false);
        stage5DisplayCombo.setVisible(false);
        stage5DisplayText.setVisible(false);
        stage5DisplayButton.setVisible(false);
        stage5OutputText.setVisible(false);
        // Add everything to the JFrame
        f.add(stage1); f.add(stage1line); f.add(stage1DisplayCombo); f.add(stage1DisplayText); f.add(stage1DisplayButton); f.add(resetButton); f.add(stage1LabelCombo); f.add(stage1LabelText); f.add(stage1NextButton); f.add(stage2Line1); f.add(stage2Line2); f.add(stage2); f.add(stage2DisplayCombo); f.add(stage2DisplayText); f.add(stage2DisplayButton); f.add(stage2LabelCombo); f.add(stage2LabelText); f.add(stage2NextButton); f.add(stage3Line1); f.add(stage3); f.add(stage3Line2); f.add(stage3DisplayCombo); f.add(stage3DisplayText); f.add(stage3DisplayButton); f.add(stage3LabelCombo); f.add(stage3LabelText); f.add(stage3NextButton); f.add(stage4Line1); f.add(stage4); f.add(stage4Line2); f.add(stage4DisplayCombo); f.add(stage4DisplayText); f.add(stage4DisplayButton); f.add(stage4LabelCombo); f.add(stage4LabelText); f.add(stage4NextButton); f.add(stage1OutputText); f.add(stage2OutputText); f.add(stage3OutputText); f.add(stage4OutputText); f.add(stage5OutputText); f.add(stage5Line1); f.add(stage5); f.add(stage5Line2); f.add(stage5DisplayCombo); f.add(stage5DisplayText); f.add(stage5DisplayButton);
        // Define the rest of the JFrame stuff
        f.setLayout(null);
        f.setSize(350,450);
        f.setResizable(false);
        f.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Stage 1 Display
        stage1DisplayButton.addActionListener((ActionEvent e) -> {
            String display = stage1DisplayCombo.getItemAt(stage1DisplayCombo.getSelectedIndex());
            System.out.println("Display #1 - " + display);
            // Disable the Display CB + Button so the user doesn't fuck everything up.
            stage1DisplayCombo.setEnabled(false);
            stage1DisplayButton.setEnabled(false);
            // Determine what position it is.
            switch (display) {
                case "1":
                case "2":
                    p1 = 2;
                    stage1LabelText.setText("Position 2");
                    break;
                case "3":
                    p1 = 3;
                    stage1LabelText.setText("Position 3");
                    break;
                default:
                    p1 = 4;
                    stage1LabelText.setText("Position 4");
                    break;
            }
            System.out.println("Position #1 - " + p1);
            // Make the label and next button visible.
            stage1LabelCombo.setVisible(true);
            stage1LabelText.setVisible(true);
            stage1NextButton.setVisible(true);
        });
        // Stage 1 Next
        stage1NextButton.addActionListener((ActionEvent e) -> {
            String label = stage1LabelCombo.getItemAt(stage1LabelCombo.getSelectedIndex());
            // Disable CB + Button
            stage1LabelCombo.setEnabled(false);
            stage1NextButton.setEnabled(false);
            // Set label integer
            l1 = Integer.parseInt(label);
            System.out.println("Label #1 - " + l1);
            // Set the output text
            stage1OutputText.setText("Press label " + label);
            // Make Stage 2 visible.
            stage1OutputText.setVisible(true);
            stage2Line1.setVisible(true);
            stage2.setVisible(true);
            stage2Line2.setVisible(true);
            stage2DisplayCombo.setVisible(true);
            stage2DisplayText.setVisible(true);
            stage2DisplayButton.setVisible(true);
        });
        // Stage 2 Display
        stage2DisplayButton.addActionListener((ActionEvent e) -> {
            String display = stage2DisplayCombo.getItemAt(stage2DisplayCombo.getSelectedIndex());
            System.out.println("Display #2 - " + display);
            stage2DisplayCombo.setEnabled(false);
            stage2DisplayButton.setEnabled(false);
            switch (display) {
                case "1":
                    l2 = 4;
                    stage2LabelText.setText("Label 4");
                    System.out.println("Label #2 - 4");
                    break;
                case "2":
                case "4":
                    p2 = p1;
                    stage2LabelText.setText("Position " + p2);
                    System.out.println("Position #2 - " + p2);
                    break;
                default:
                    p2 = 1;
                    stage2LabelText.setText("Position 1");
                    System.out.println("Position #2 - 1");
                    break;
            }
            stage2LabelCombo.setVisible(true);
            stage2LabelText.setVisible(true);
            stage2NextButton.setVisible(true);
        });
        // Stage 2 Next
        stage2NextButton.addActionListener((ActionEvent e) -> {
            String label = stage2LabelCombo.getItemAt(stage2LabelCombo.getSelectedIndex());
            String labelText = stage2LabelText.getText();
            stage2LabelCombo.setEnabled(false);
            stage2NextButton.setEnabled(false);
            if (labelText.equals("Label 4")) {
                p2 = Integer.parseInt(label);
                System.out.println("Position #2 - " + p2);
                stage2OutputText.setText("Press position " + label);
            } else {
                l2 = Integer.parseInt(label);
                System.out.println("Label #2 - " + l2);
                stage2OutputText.setText("Press label " + label);
            }
            stage2OutputText.setVisible(true);
            stage3Line1.setVisible(true);
            stage3.setVisible(true);
            stage3Line2.setVisible(true);
            stage3DisplayCombo.setVisible(true);
            stage3DisplayText.setVisible(true);
            stage3DisplayButton.setVisible(true);
        });
        // Stage 3 Display
        stage3DisplayButton.addActionListener((ActionEvent e) -> {
            String display = stage3DisplayCombo.getItemAt(stage3DisplayCombo.getSelectedIndex());
            System.out.println("Display #3 - " + display);
            stage3DisplayCombo.setEnabled(false);
            stage3DisplayButton.setEnabled(false);
            switch (display) {
                case "1":
                    l3 = l2;
                    stage3OutputText.setText("Press Label " + l3);
                    System.out.println("Label #3 - " + l3);
                    stage3OutputText.setVisible(true);
                    stage4Line1.setVisible(true);
                    stage4.setVisible(true);
                    stage4Line2.setVisible(true);
                    stage4DisplayCombo.setVisible(true);
                    stage4DisplayText.setVisible(true);
                    stage4DisplayButton.setVisible(true);
                    break;
                case "2":
                    l3 = l1;
                    stage3OutputText.setText("Press Label " + l3);
                    System.out.println("Label #3 - " + l3);
                    stage3OutputText.setVisible(true);
                    stage4Line1.setVisible(true);
                    stage4.setVisible(true);
                    stage4Line2.setVisible(true);
                    stage4DisplayCombo.setVisible(true);
                    stage4DisplayText.setVisible(true);
                    stage4DisplayButton.setVisible(true);
                    break;
                case "3":
                    stage3LabelText.setText("Position 3");
                    stage3LabelCombo.setVisible(true);
                    stage3LabelText.setVisible(true);
                    stage3NextButton.setVisible(true);
                    break;
                default:
                    l3 = 4;
                    stage3OutputText.setText("Press Label " + l3);
                    System.out.println("Label #3 - 4");
                    stage3OutputText.setVisible(true);
                    stage4Line1.setVisible(true);
                    stage4.setVisible(true);
                    stage4Line2.setVisible(true);
                    stage4DisplayCombo.setVisible(true);
                    stage4DisplayText.setVisible(true);
                    stage4DisplayButton.setVisible(true);
                    break;
            }
        });
        // Stage 3 Next
        stage3NextButton.addActionListener((ActionEvent e) -> {
            String label = stage3LabelCombo.getItemAt(stage3LabelCombo.getSelectedIndex());
            stage3LabelCombo.setEnabled(false);
            stage3NextButton.setEnabled(false);
            l3 = Integer.parseInt(label);
            System.out.println("Label #3 - " + l3);
            stage3OutputText.setText("Press label " + label);
            stage3OutputText.setVisible(true);
            stage4Line1.setVisible(true);
            stage4.setVisible(true);
            stage4Line2.setVisible(true);
            stage4DisplayCombo.setVisible(true);
            stage4DisplayText.setVisible(true);
            stage4DisplayButton.setVisible(true);
        });
        // Stage 4 Display
        stage4DisplayButton.addActionListener((ActionEvent e) -> {
            String display = stage4DisplayCombo.getItemAt(stage4DisplayCombo.getSelectedIndex());
            System.out.println("Display #4 - " + display);
            stage4DisplayCombo.setEnabled(false);
            stage4DisplayButton.setEnabled(false);
            switch (display) {
                case "1":
                    stage4LabelText.setText("Position " + p1);
                    break;
                case "2":
                    stage4LabelText.setText("Position 1");
                    break;
                default:
                    stage4LabelText.setText("Position " + p2);
                    break;
            }
            stage4LabelCombo.setVisible(true);
            stage4LabelText.setVisible(true);
            stage4NextButton.setVisible(true);
        });
        // Stage 4 Next
        stage4NextButton.addActionListener((ActionEvent e) -> {
            String label = stage4LabelCombo.getItemAt(stage4LabelCombo.getSelectedIndex());
            stage4LabelCombo.setEnabled(false);
            stage4NextButton.setEnabled(false);
            l4 = Integer.parseInt(label);
            System.out.println("Label #4 - " + l4);
            stage4OutputText.setText("Press label " + label);
            stage4OutputText.setVisible(true);
            stage5Line1.setVisible(true);
            stage5.setVisible(true);
            stage5Line2.setVisible(true);
            stage5DisplayCombo.setVisible(true);
            stage5DisplayText.setVisible(true);
            stage5DisplayButton.setVisible(true);
        });
        // Stage 5
        stage5DisplayButton.addActionListener((ActionEvent e) -> {
            String display = stage5DisplayCombo.getItemAt(stage5DisplayCombo.getSelectedIndex());
            System.out.println("Display #5 - " + display);
            stage5DisplayCombo.setEnabled(false);
            stage5DisplayButton.setEnabled(false);
            switch (display) {
                case "1":
                    stage5OutputText.setText("Press label " + l1);
                    System.out.println("Label #5 - " + l1);
                    break;
                case "2":
                    stage5OutputText.setText("Press label " + l2);
                    System.out.println("Label #5 - " + l2);
                    break;
                case "3":
                    stage5OutputText.setText("Press label " + l4);
                    System.out.println("Label #5 - " + l4);
                    break;
                default:
                    stage5OutputText.setText("Press label " + l3);
                    System.out.println("Label #5 - " + l3);
                    break;
            }
            stage5OutputText.setVisible(true);
        });
        // Reset
        resetButton.addActionListener((ActionEvent e) -> {
            System.out.println("[RESET]");
            // Set mostly everything back to non-visible
            stage1LabelCombo.setVisible(false);
            stage1LabelText.setVisible(false);
            stage1NextButton.setVisible(false);
            stage1OutputText.setVisible(false);
            stage2Line1.setVisible(false);
            stage2.setVisible(false);
            stage2Line2.setVisible(false);
            stage2DisplayCombo.setVisible(false);
            stage2DisplayText.setVisible(false);
            stage2DisplayButton.setVisible(false);
            stage2LabelCombo.setVisible(false);
            stage2LabelText.setVisible(false);
            stage2NextButton.setVisible(false);
            stage2OutputText.setVisible(false);
            stage3Line1.setVisible(false);
            stage3.setVisible(false);
            stage3Line2.setVisible(false);
            stage3DisplayCombo.setVisible(false);
            stage3DisplayText.setVisible(false);
            stage3DisplayButton.setVisible(false);
            stage3LabelCombo.setVisible(false);
            stage3LabelText.setVisible(false);
            stage3NextButton.setVisible(false);
            stage3OutputText.setVisible(false);
            stage4Line1.setVisible(false);
            stage4.setVisible(false);
            stage4Line2.setVisible(false);
            stage4DisplayCombo.setVisible(false);
            stage4DisplayText.setVisible(false);
            stage4DisplayButton.setVisible(false);
            stage4LabelCombo.setVisible(false);
            stage4LabelText.setVisible(false);
            stage4NextButton.setVisible(false);
            stage4OutputText.setVisible(false);
            stage5Line1.setVisible(false);
            stage5.setVisible(false);
            stage5Line2.setVisible(false);
            stage5DisplayCombo.setVisible(false);
            stage5DisplayText.setVisible(false);
            stage5DisplayButton.setVisible(false);
            stage5OutputText.setVisible(false);
            // Re-enable everything
            stage1DisplayCombo.setEnabled(true);
            stage1DisplayButton.setEnabled(true);
            stage1LabelCombo.setEnabled(true);
            stage1NextButton.setEnabled(true);
            stage2DisplayCombo.setEnabled(true);
            stage2DisplayButton.setEnabled(true);
            stage2LabelCombo.setEnabled(true);
            stage2NextButton.setEnabled(true);
            stage3DisplayCombo.setEnabled(true);
            stage3DisplayButton.setEnabled(true);
            stage3LabelCombo.setEnabled(true);
            stage3NextButton.setEnabled(true);
            stage4DisplayCombo.setEnabled(true);
            stage4DisplayButton.setEnabled(true);
            stage4LabelCombo.setEnabled(true);
            stage4NextButton.setEnabled(true);
            stage5DisplayCombo.setEnabled(true);
            stage5DisplayButton.setEnabled(true);
        });
    }
}
