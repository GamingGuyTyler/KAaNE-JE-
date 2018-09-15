/**
 * Mazes Module, started work on 7/16/2018 4:50 PM
 * 
 * Finished version 0.1 on 7/16/2018 7:39 PM
 * 
 * Version 0.1 
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mazes {
    static JFrame f;
    public static void module() {
        System.out.println("[MAZES MODULE]");
        f = new JFrame("KAaNE [MAZES MODULE]");
<<<<<<< HEAD
        ImageIcon icon = new ImageIcon("imgs/icons/mazes.png");
        f.setIconImage(icon.getImage());
=======
>>>>>>> 3dedd24bc3ad9a0d728ef4ef2433a9543d23f4e5
        // Define the instructional text
        JLabel instructions = new JLabel("Click the areas that are circled.");
        instructions.setBounds(75,10,180,20);
        // Define the maze buttons
        JButton a1Button = new JButton("•");
        JButton a2Button = new JButton("•");
        JButton a3Button = new JButton("•");
        JButton a4Button = new JButton("•");
        JButton a5Button = new JButton("•");
        JButton a6Button = new JButton("•");
        JButton b1Button = new JButton("•");
        JButton b2Button = new JButton("•");
        JButton b3Button = new JButton("•");
        JButton b4Button = new JButton("•");
        JButton b5Button = new JButton("•");
        JButton b6Button = new JButton("•");
        JButton c1Button = new JButton("•");
        JButton c2Button = new JButton("•");
        JButton c3Button = new JButton("•");
        JButton c4Button = new JButton("•");
        JButton c5Button = new JButton("•");
        JButton c6Button = new JButton("•");
        JButton d1Button = new JButton("•");
        JButton d2Button = new JButton("•");
        JButton d3Button = new JButton("•");
        JButton d4Button = new JButton("•");
        JButton d5Button = new JButton("•");
        JButton d6Button = new JButton("•");
        JButton e1Button = new JButton("•");
        JButton e2Button = new JButton("•");
        JButton e3Button = new JButton("•");
        JButton e4Button = new JButton("•");
        JButton e5Button = new JButton("•");
        JButton e6Button = new JButton("•");
        JButton f1Button = new JButton("•");
        JButton f2Button = new JButton("•");
        JButton f3Button = new JButton("•");
        JButton f4Button = new JButton("•");
        JButton f5Button = new JButton("•");
        JButton f6Button = new JButton("•");
        a1Button.setBounds(20,30,50,20);
        a2Button.setBounds(70,30,50,20);
        a3Button.setBounds(120,30,50,20);
        a4Button.setBounds(170,30,50,20);
        a5Button.setBounds(220,30,50,20);
        a6Button.setBounds(270,30,50,20);
        b1Button.setBounds(20,50,50,20);
        b2Button.setBounds(70,50,50,20);
        b3Button.setBounds(120,50,50,20);
        b4Button.setBounds(170,50,50,20);
        b5Button.setBounds(220,50,50,20);
        b6Button.setBounds(270,50,50,20);
        c1Button.setBounds(20,70,50,20);
        c2Button.setBounds(70,70,50,20);
        c3Button.setBounds(120,70,50,20);
        c4Button.setBounds(170,70,50,20);
        c5Button.setBounds(220,70,50,20);
        c6Button.setBounds(270,70,50,20);
        d1Button.setBounds(20,90,50,20);
        d2Button.setBounds(70,90,50,20);
        d3Button.setBounds(120,90,50,20);
        d4Button.setBounds(170,90,50,20);
        d5Button.setBounds(220,90,50,20);
        d6Button.setBounds(270,90,50,20);
        e1Button.setBounds(20,110,50,20);
        e2Button.setBounds(70,110,50,20);
        e3Button.setBounds(120,110,50,20);
        e4Button.setBounds(170,110,50,20);
        e5Button.setBounds(220,110,50,20);
        e6Button.setBounds(270,110,50,20);
        f1Button.setBounds(20,130,50,20);
        f2Button.setBounds(70,130,50,20);
        f3Button.setBounds(120,130,50,20);
        f4Button.setBounds(170,130,50,20);
        f5Button.setBounds(220,130,50,20);
        f6Button.setBounds(270,130,50,20);
        // Define the reset button
        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(80,160,90,20);
        // Define the final button
        JButton finalButton = new JButton("CONFIRM");
        finalButton.setBounds(170,160,90,20);
        // Define the output image
        ImageIcon outputMap1 = new ImageIcon("imgs/mazes/maze0.png");
        ImageIcon outputMap2 = new ImageIcon("imgs/mazes/maze1.png");
        ImageIcon outputMap3 = new ImageIcon("imgs/mazes/maze2.png");
        ImageIcon outputMap4 = new ImageIcon("imgs/mazes/maze3.png");
        ImageIcon outputMap5 = new ImageIcon("imgs/mazes/maze4.png");
        ImageIcon outputMap6 = new ImageIcon("imgs/mazes/maze5.png");
        ImageIcon outputMap7 = new ImageIcon("imgs/mazes/maze6.png");
        ImageIcon outputMap8 = new ImageIcon("imgs/mazes/maze7.png");
        ImageIcon outputMap9 = new ImageIcon("imgs/mazes/maze8.png");
        JLabel outputImg = new JLabel(outputMap1);
        outputImg.setBounds(350,10,300,300);
        // Define the output text
        JLabel outputText = new JLabel("Invalid!");
        outputText.setBounds(150,190,50,20);
        outputText.setVisible(false);
        // Add everything to JFrame
        f.add(instructions); f.add(a1Button); f.add(a2Button); f.add(a3Button); f.add(a4Button); f.add(a5Button); f.add(a6Button);
        f.add(b1Button); f.add(b2Button); f.add(b3Button); f.add(b4Button); f.add(b5Button); f.add(b6Button);
        f.add(c1Button); f.add(c2Button); f.add(c3Button); f.add(c4Button); f.add(c5Button); f.add(c6Button);
        f.add(d1Button); f.add(d2Button); f.add(d3Button); f.add(d4Button); f.add(d5Button); f.add(d6Button);
        f.add(e1Button); f.add(e2Button); f.add(e3Button); f.add(e4Button); f.add(e5Button); f.add(e6Button);
        f.add(f1Button); f.add(f2Button); f.add(f3Button); f.add(f4Button); f.add(f5Button); f.add(f6Button); 
        f.add(resetButton); f.add(finalButton); f.add(outputImg); f.add(outputText);
        // Define the rest of the JFrame
        f.setLayout(null);
        f.setSize(350,350);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Reset button action listener
        resetButton.addActionListener((ActionEvent e) -> {
            // Set output text to invisible
            outputText.setVisible(false);
            // Set all the button's text to non-circled
            a1Button.setText("•");
            a2Button.setText("•");
            a3Button.setText("•");
            a4Button.setText("•");
            a5Button.setText("•");
            a6Button.setText("•");
            b1Button.setText("•");
            b2Button.setText("•");
            b3Button.setText("•");
            b4Button.setText("•");
            b5Button.setText("•");
            b6Button.setText("•");
            c1Button.setText("•");
            c2Button.setText("•");
            c3Button.setText("•");
            c4Button.setText("•");
            c5Button.setText("•");
            c6Button.setText("•");
            d1Button.setText("•");
            d2Button.setText("•");
            d3Button.setText("•");
            d4Button.setText("•");
            d5Button.setText("•");
            d6Button.setText("•");
            e1Button.setText("•");
            e2Button.setText("•");
            e3Button.setText("•");
            e4Button.setText("•");
            e5Button.setText("•");
            e6Button.setText("•");
            f1Button.setText("•");
            f2Button.setText("•");
            f3Button.setText("•");
            f4Button.setText("•");
            f5Button.setText("•");
            f6Button.setText("•");
            // Reset the size of the JFrame
            f.setSize(350,350);
        });
        // Final button action listener
        finalButton.addActionListener((ActionEvent e) -> {
            // Set output text to invisible
            outputText.setVisible(false);
            // Get all the button's text
            String a1 = a1Button.getText();
            String a2 = a2Button.getText();
            String a3 = a3Button.getText();
            String a4 = a4Button.getText();
            String a5 = a5Button.getText();
            String a6 = a6Button.getText();
            String b1 = b1Button.getText();
            String b2 = b2Button.getText();
            String b3 = b3Button.getText();
            String b4 = b4Button.getText();
            String b5 = b5Button.getText();
            String b6 = b6Button.getText();
            String c1 = c1Button.getText();
            String c2 = c2Button.getText();
            String c3 = c3Button.getText();
            String c4 = c4Button.getText();
            String c5 = c5Button.getText();
            String c6 = c6Button.getText();
            String d1 = d1Button.getText();
            String d2 = d2Button.getText();
            String d3 = d3Button.getText();
            String d4 = d4Button.getText();
            String d5 = d5Button.getText();
            String d6 = d6Button.getText();
            String e1 = e1Button.getText();
            String e2 = e2Button.getText();
            String e3 = e3Button.getText();
            String e4 = e4Button.getText();
            String e5 = e5Button.getText();
            String e6 = e6Button.getText();
            String f1 = f1Button.getText();
            String f2 = f2Button.getText();
            String f3 = f3Button.getText();
            String f4 = f4Button.getText();
            String f5 = f5Button.getText();
            String f6 = f6Button.getText();
            // Print which dots are circled
            if (a1.equals("⊙")) {
                System.out.println("A1");
            }
            if (a2.equals("⊙")) {
                System.out.println("A2");
            }
            if (a3.equals("⊙")) {
                System.out.println("A3");
            }
            if (a4.equals("⊙")) {
                System.out.println("A4");
            }
            if (a5.equals("⊙")) {
                System.out.println("A5");
            }
            if (a6.equals("⊙")) {
                System.out.println("A6");
            }
            if (b1.equals("⊙")) {
                System.out.println("B1");
            }
            if (b2.equals("⊙")) {
                System.out.println("B2");
            }
            if (b3.equals("⊙")) {
                System.out.println("B3");
            }
            if (b4.equals("⊙")) {
                System.out.println("B4");
            }
            if (b5.equals("⊙")) {
                System.out.println("B5");
            }
            if (b6.equals("⊙")) {
                System.out.println("B6");
            }
            if (c1.equals("⊙")) {
                System.out.println("C1");
            }
            if (c2.equals("⊙")) {
                System.out.println("C2");
            }
            if (c3.equals("⊙")) {
                System.out.println("C3");
            }
            if (c4.equals("⊙")) {
                System.out.println("C4");
            }
            if (c5.equals("⊙")) {
                System.out.println("C5");
            }
            if (c6.equals("⊙")) {
                System.out.println("C6");
            }
            if (d1.equals("⊙")) {
                System.out.println("D1");
            }
            if (d2.equals("⊙")) {
                System.out.println("D2");
            }
            if (d3.equals("⊙")) {
                System.out.println("D3");
            }
            if (d4.equals("⊙")) {
                System.out.println("D4");
            }
            if (d5.equals("⊙")) {
                System.out.println("D5");
            }
            if (d6.equals("⊙")) {
                System.out.println("D6");
            }
            if (e1.equals("⊙")) {
                System.out.println("E1");
            }
            if (e2.equals("⊙")) {
                System.out.println("E2");
            }
            if (e3.equals("⊙")) {
                System.out.println("E3");
            }
            if (e4.equals("⊙")) {
                System.out.println("E4");
            }
            if (e5.equals("⊙")) {
                System.out.println("E5");
            }
            if (e6.equals("⊙")) {
                System.out.println("E6");
            }
            if (f1.equals("⊙")) {
                System.out.println("F1");
            }
            if (f2.equals("⊙")) {
                System.out.println("F2");
            }
            if (f3.equals("⊙")) {
                System.out.println("F3");
            }
            if (f4.equals("⊙")) {
                System.out.println("F4");
            }
            if (f5.equals("⊙")) {
                System.out.println("F5");
            }
            if (f6.equals("⊙")) {
                System.out.println("F6");
            }
            if (b1.equals("⊙") && c6.equals("⊙")) {
                System.out.println("Maze 1");
                f.setSize(680,350);
            } else if (d2.equals("⊙") && b5.equals("⊙")) {
                System.out.println("Maze 2");
                outputImg.setIcon(outputMap2);
                f.setSize(680,350);
            } else if (d4.equals("⊙") && d6.equals("⊙")) {
                System.out.println("Maze 3");
                outputImg.setIcon(outputMap3);
                f.setSize(680,350);
            } else if (a1.equals("⊙") && d1.equals("⊙")) {
                System.out.println("Maze 4");
                outputImg.setIcon(outputMap4);
                f.setSize(680,350);
            } else if (c5.equals("⊙") && f4.equals("⊙")) {
                System.out.println("Maze 5");
                outputImg.setIcon(outputMap5);
                f.setSize(680,350);
            } else if (a5.equals("⊙") && e3.equals("⊙")) {
                System.out.println("Maze 6");
                outputImg.setIcon(outputMap6);
                f.setSize(680,350);
            } else if (a2.equals("⊙") && f2.equals("⊙")) {
                System.out.println("Maze 7");
                outputImg.setIcon(outputMap7);
                f.setSize(680,350);
            } else if (d3.equals("⊙") && a4.equals("⊙")) {
                System.out.println("Maze 8");
                outputImg.setIcon(outputMap8);
                f.setSize(680,350);
            } else if (e1.equals("⊙") && b3.equals("⊙")) {
                System.out.println("Maze 9");
                outputImg.setIcon(outputMap9);
                f.setSize(680,350);
            } else {
                System.out.println("Invalid Indicator/s!");
                outputText.setVisible(true);
            }
        });
        // Maze button action listeners
        a1Button.addActionListener((ActionEvent e) -> {
            String a1 = a1Button.getText();
            if (a1.equals("•")) {
                a1Button.setText("⊙");
            } else {
                a1Button.setText("•");
            }
        });
        a2Button.addActionListener((ActionEvent e) -> {
            String a2 = a2Button.getText();
            if (a2.equals("•")) {
                a2Button.setText("⊙");
            } else {
                a2Button.setText("•");
            }
        });
        a3Button.addActionListener((ActionEvent e) -> {
            String a3 = a3Button.getText();
            if (a3.equals("•")) {
                a3Button.setText("⊙");
            } else {
                a3Button.setText("•");
            }
        });
        a4Button.addActionListener((ActionEvent e) -> {
            String a4 = a4Button.getText();
            if (a4.equals("•")) {
                a4Button.setText("⊙");
            } else {
                a4Button.setText("•");
            }
        });
        a5Button.addActionListener((ActionEvent e) -> {
            String a5 = a5Button.getText();
            if (a5.equals("•")) {
                a5Button.setText("⊙");
            } else {
                a5Button.setText("•");
            }
        });
        a6Button.addActionListener((ActionEvent e) -> {
            String a6 = a6Button.getText();
            if (a6.equals("•")) {
                a6Button.setText("⊙");
            } else {
                a6Button.setText("•");
            }
        });
        b1Button.addActionListener((ActionEvent e) -> {
            String b1 = b1Button.getText();
            if (b1.equals("•")) {
                b1Button.setText("⊙");
            } else {
                b1Button.setText("•");
            }
        });
        b2Button.addActionListener((ActionEvent e) -> {
            String b2 = b2Button.getText();
            if (b2.equals("•")) {
                b2Button.setText("⊙");
            } else {
                b2Button.setText("•");
            }
        });
        b3Button.addActionListener((ActionEvent e) -> {
            String b3 = b3Button.getText();
            if (b3.equals("•")) {
                b3Button.setText("⊙");
            } else {
                b3Button.setText("•");
            }
        });
        b4Button.addActionListener((ActionEvent e) -> {
            String b4 = b4Button.getText();
            if (b4.equals("•")) {
                b4Button.setText("⊙");
            } else {
                b4Button.setText("•");
            }
        });
        b5Button.addActionListener((ActionEvent e) -> {
            String b5 = b5Button.getText();
            if (b5.equals("•")) {
                b5Button.setText("⊙");
            } else {
                b5Button.setText("•");
            }
        });
        b6Button.addActionListener((ActionEvent e) -> {
            String b6 = b6Button.getText();
            if (b6.equals("•")) {
                b6Button.setText("⊙");
            } else {
                b6Button.setText("•");
            }
        });
        c1Button.addActionListener((ActionEvent e) -> {
            String c1 = c1Button.getText();
            if (c1.equals("•")) {
                c1Button.setText("⊙");
            } else {
                c1Button.setText("•");
            }
        });
        c2Button.addActionListener((ActionEvent e) -> {
            String c2 = c2Button.getText();
            if (c2.equals("•")) {
                c2Button.setText("⊙");
            } else {
                c2Button.setText("•");
            }
        });
        c3Button.addActionListener((ActionEvent e) -> {
            String c3 = c3Button.getText();
            if (c3.equals("•")) {
                c3Button.setText("⊙");
            } else {
                c3Button.setText("•");
            }
        });
        c4Button.addActionListener((ActionEvent e) -> {
            String c4 = c4Button.getText();
            if (c4.equals("•")) {
                c4Button.setText("⊙");
            } else {
                c4Button.setText("•");
            }
        });
        c5Button.addActionListener((ActionEvent e) -> {
            String c5 = c5Button.getText();
            if (c5.equals("•")) {
                c5Button.setText("⊙");
            } else {
                c5Button.setText("•");
            }
        });
        c6Button.addActionListener((ActionEvent e) -> {
            String c6 = c6Button.getText();
            if (c6.equals("•")) {
                c6Button.setText("⊙");
            } else {
                c6Button.setText("•");
            }
        });
        d1Button.addActionListener((ActionEvent e) -> {
            String d1 = d1Button.getText();
            if (d1.equals("•")) {
                d1Button.setText("⊙");
            } else {
                d1Button.setText("•");
            }
        });
        d2Button.addActionListener((ActionEvent e) -> {
            String d2 = d2Button.getText();
            if (d2.equals("•")) {
                d2Button.setText("⊙");
            } else {
                d2Button.setText("•");
            }
        });
        d3Button.addActionListener((ActionEvent e) -> {
            String d3 = d3Button.getText();
            if (d3.equals("•")) {
                d3Button.setText("⊙");
            } else {
                d3Button.setText("•");
            }
        });
        d4Button.addActionListener((ActionEvent e) -> {
            String d4 = d4Button.getText();
            if (d4.equals("•")) {
                d4Button.setText("⊙");
            } else {
                d4Button.setText("•");
            }
        });
        d5Button.addActionListener((ActionEvent e) -> {
            String d5 = d5Button.getText();
            if (d5.equals("•")) {
                d5Button.setText("⊙");
            } else {
                d5Button.setText("•");
            }
        });
        d6Button.addActionListener((ActionEvent e) -> {
            String d6 = d6Button.getText();
            if (d6.equals("•")) {
                d6Button.setText("⊙");
            } else {
                d6Button.setText("•");
            }
        });
        e1Button.addActionListener((ActionEvent e) -> {
            String e1 = e1Button.getText();
            if (e1.equals("•")) {
                e1Button.setText("⊙");
            } else {
                e1Button.setText("•");
            }
        });
        e2Button.addActionListener((ActionEvent e) -> {
            String e2 = e2Button.getText();
            if (e2.equals("•")) {
                e2Button.setText("⊙");
            } else {
                e2Button.setText("•");
            }
        });
        e3Button.addActionListener((ActionEvent e) -> {
            String e3 = e3Button.getText();
            if (e3.equals("•")) {
                e3Button.setText("⊙");
            } else {
                e3Button.setText("•");
            }
        });
        e4Button.addActionListener((ActionEvent e) -> {
            String e4 = e4Button.getText();
            if (e4.equals("•")) {
                e4Button.setText("⊙");
            } else {
                e4Button.setText("•");
            }
        });
        e5Button.addActionListener((ActionEvent e) -> {
            String e5 = e5Button.getText();
            if (e5.equals("•")) {
                e5Button.setText("⊙");
            } else {
                e5Button.setText("•");
            }
        });
        e6Button.addActionListener((ActionEvent e) -> {
            String e6 = e6Button.getText();
            if (e6.equals("•")) {
                e6Button.setText("⊙");
            } else {
                e6Button.setText("•");
            }
        });
        f1Button.addActionListener((ActionEvent e) -> {
            String f1 = f1Button.getText();
            if (f1.equals("•")) {
                f1Button.setText("⊙");
            } else {
                f1Button.setText("•");
            }
        });
        f2Button.addActionListener((ActionEvent e) -> {
            String f2 = f2Button.getText();
            if (f2.equals("•")) {
                f2Button.setText("⊙");
            } else {
                f2Button.setText("•");
            }
        });
        f3Button.addActionListener((ActionEvent e) -> {
            String f3 = f3Button.getText();
            if (f3.equals("•")) {
                f3Button.setText("⊙");
            } else {
                f3Button.setText("•");
            }
        });
        f4Button.addActionListener((ActionEvent e) -> {
            String f4 = f4Button.getText();
            if (f4.equals("•")) {
                f4Button.setText("⊙");
            } else {
                f4Button.setText("•");
            }
        });
        f5Button.addActionListener((ActionEvent e) -> {
            String f5 = f5Button.getText();
            if (f5.equals("•")) {
                f5Button.setText("⊙");
            } else {
                f5Button.setText("•");
            }
        });
        f6Button.addActionListener((ActionEvent e) -> {
            String f6 = f6Button.getText();
            if (f6.equals("•")) {
                f6Button.setText("⊙");
            } else {
                f6Button.setText("•");
            }
        });
    }
}
