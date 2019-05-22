/**
 * Binary LEDs module, started module on 02/18/19 12:42 PM
 * 
 * Finished version 0.1 on 02/18/19 5:26 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import be.pcl.swing.*;
import java.text.*;

public class binaryLED {
    static JFrame f;
    public static void module() {
        System.out.println("[BINARY LEDs]");
        f = new JFrame("KAaNE [BINARY LEDs]");
        ImageIcon icon = new ImageIcon("imgs/icons/Binary LEDs.png");
        f.setIconImage(icon.getImage());
        // TBs
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField sq1TB = new ImprovedFormattedTextField(integerNumberInstance,0);
        sq1TB.setBounds(10,10,50,20);
        ImprovedFormattedTextField sq2TB = new ImprovedFormattedTextField(integerNumberInstance,0);
        sq2TB.setBounds(10,40,50,20);
        ImprovedFormattedTextField sq3TB = new ImprovedFormattedTextField(integerNumberInstance,0);
        sq3TB.setBounds(10,70,50,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(70,10,60,20);
        // Label
        JLabel output = new JLabel("");
        output.setBounds(70,40,200,60);
        // Add everything
        f.add(sq1TB); f.add(sq2TB); f.add(sq3TB);
        f.add(button); f.add(output);
        // Define JFrame
        f.setLayout(null);
        f.setSize(400,150);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            // grab sequence numbers
            String sq1bin = sq1TB.getText();
            String sq2bin = sq2TB.getText();
            String sq3bin = sq3TB.getText();
            // remove commas (cause iftf likes to include commas for whatever reason)
            sq1bin = sq1bin.replaceAll(",","");
            sq2bin = sq2bin.replaceAll(",","");
            sq3bin = sq3bin.replaceAll(",","");
            // convert from binary
            int sq1 = Integer.parseInt(sq1bin, 2);
            int sq2 = Integer.parseInt(sq2bin, 2);
            int sq3 = Integer.parseInt(sq3bin, 2);
            // find sequence
            int seq = sequenceFind(sq1,sq2,sq3);
            System.out.println("Sequence: " + seq);
            // output correct
            switch (seq) {
                case 1: 
                    output.setText("<html>Green - 2 (00010)<br>Blue - 25 (11001)</html>");
                    System.out.println("Green - 2 (00010)\nBlue - 25 (11001)");
                    break;
                case 2:
                    output.setText("<html>Red - 2 (00010)<br>Green - 11 (01011)<br>Blue - 12 (01100)</html>");
                    System.out.println("Red - 2 (00010)\nGreen - 11 (01011)\nBlue - 12 (01100)");
                    break;
                case 3:
                    output.setText("<html>Green - 25 (11001)</html>");
                    System.out.println("Green - 25 (11001)");
                    break;
                case 4:
                    output.setText("<html>Red - 19 (10011)<br>Green - 9(01001)<br>Blue - 1 (00001)</html>");
                    System.out.println("Red - 19 (10011)\nGreen - 9 (01001)\nBlue - 1 (00001)");
                    break;
                case 5:
                    output.setText("<html>Red - 26 (11010)<br>Green - 28 (11100)</html>");
                    System.out.println("Red - 26 (11010)\nGreen - 28 (11100)");
                    break;
                case 6:
                    output.setText("<html>Red - 8 (01000)<br>Green - 6 (00110)<br>Blue - 31 (11111)</html>");
                    System.out.println("Red - 8 (01000)\nGreen - 6 (00110)\nBlue - 31 (11111)");
                    break;
                case 7:
                    output.setText("<html>Blue - 15 (01111)</html>");
                    System.out.println("Blue - 15 (01111)");
                    break;
                case 8:
                    output.setText("<html>Blue - 12 (01100)</html>");
                    System.out.println("Blue - 12 (01100)");
                    break;
            }
        });
    }
    public static int sequenceFind(int sq1, int sq2, int sq3) {
        int output = 0;
        // prob the worst piece of code i've written in my life
        // if anyone can improve it, that'd be great
        // seq 1, left to right
        if (sq1 == 17 && sq2 == 15 && sq3 == 6) output = 1;
        if (sq1 == 15 && sq2 == 6 && sq3 == 2) output = 1;
        if (sq1 == 6 && sq2 == 2 && sq3 == 24) output = 1;
        if (sq1 == 2 && sq2 == 24 && sq3 == 8) output = 1;
        if (sq1 == 24 && sq2 == 8 && sq3 == 26) output = 1;
        if (sq1 == 8 && sq2 == 26 && sq3 == 25) output = 1;
        if (sq1 == 26 && sq2 == 25 && sq3 == 21) output = 1;
        if (sq1 == 25 && sq2 == 21 && sq3 == 24) output = 1;
        if (sq1 == 21 && sq2 == 24 && sq3 == 1) output = 1;
        if (sq1 == 24 && sq2 == 1 && sq3 == 15) output = 1;
        if (sq1 == 1 && sq2 == 15 && sq3 == 18) output = 1;
        if (sq1 == 15 && sq2 == 18 && sq3 == 8) output = 1;
        // seq 1, midway right end
        if (sq1 == 18 && sq2 == 8 && sq3 == 18) output = 1;
        // seq 1, right to left
        if (sq1 == 8 && sq2 == 18 && sq3 == 15) output = 1;
        if (sq1 == 18 && sq2 == 15 && sq3 == 1) output = 1;
        if (sq1 == 15 && sq2 == 1 && sq3 == 24) output = 1;
        if (sq1 == 1 && sq2 == 24 && sq3 == 21) output = 1;
        if (sq1 == 24 && sq2 == 21 && sq3 == 25) output = 1;
        if (sq1 == 21 && sq2 == 25 && sq3 == 26) output = 1;
        if (sq1 == 25 && sq2 == 26 && sq3 == 8) output = 1;
        if (sq1 == 26 && sq2 == 8 && sq3 == 24) output = 1;
        if (sq1 == 8 && sq2 == 24 && sq3 == 2) output = 1;
        if (sq1 == 24 && sq2 == 2 && sq3 == 6) output = 1;
        if (sq1 == 2 && sq2 == 6 && sq3 == 15) output = 1;
        if (sq1 == 6 && sq2 == 15 && sq3 == 17) output = 1;
        // seq 1, midway left end
        if (sq1 == 15 && sq2 == 17 && sq3 == 15) output = 1;
        // seq 2, left to right
        if (sq1 == 18 && sq2 == 15 && sq3 == 19) output = 2;
        if (sq1 == 15 && sq2 == 19 && sq3 == 31) output = 2;
        if (sq1 == 19 && sq2 == 31 && sq3 == 12) output = 2;
        if (sq1 == 31 && sq2 == 12 && sq3 == 6) output = 2;
        if (sq1 == 12 && sq2 == 6 && sq3 == 19) output = 2;
        if (sq1 == 6 && sq2 == 19 && sq3 == 21) output = 2;
        if (sq1 == 19 && sq2 == 21 && sq3 == 11) output = 2;
        if (sq1 == 21 && sq2 == 11 && sq3 == 16) output = 2;
        if (sq1 == 11 && sq2 == 16 && sq3 == 19) output = 2;
        if (sq1 == 16 && sq2 == 19 && sq3 == 2) output = 2;
        if (sq1 == 19 && sq2 == 2 && sq3 == 1) output = 2;
        if (sq1 == 2 && sq2 == 1 && sq3 == 29) output = 2;
        // seq 2, midway right end
        if (sq1 == 1 && sq2 == 29 && sq3 == 1) output = 2;
        // seq 2, right to left
        if (sq1 == 29 && sq2 == 1 && sq3 == 2) output = 2;
        if (sq1 == 1 && sq2 == 2 && sq3 == 19) output = 2;
        if (sq1 == 2 && sq2 == 19 && sq3 == 16) output = 2;
        if (sq1 == 19 && sq2 == 16 && sq3 == 11) output = 2;
        if (sq1 == 16 && sq2 == 11 && sq3 == 21) output = 2;
        if (sq1 == 11 && sq2 == 21 && sq3 == 19) output = 2;
        if (sq1 == 21 && sq2 == 19 && sq3 == 6) output = 2;
        if (sq1 == 19 && sq2 == 6 && sq3 == 12) output = 2;
        if (sq1 == 6 && sq2 == 12 && sq3 == 31) output = 2;
        if (sq1 == 12 && sq2 == 31 && sq3 == 19) output = 2;
        if (sq1 == 31 && sq2 == 19 && sq3 == 15) output = 2;
        if (sq1 == 19 && sq2 == 15 && sq3 == 18) output = 2;
        // seq 2, midway left end
        if (sq1 == 15 && sq2 == 18 && sq3 == 15) output = 2;
        // seq 3, left to right
        if (sq1 == 8 && sq2 == 25 && sq3 == 1) output = 3;
        if (sq1 == 25 && sq2 == 1 && sq3 == 15) output = 3;
        if (sq1 == 1 && sq2 == 15 && sq3 == 20) output = 3;
        if (sq1 == 15 && sq2 == 20 && sq3 == 15) output = 3;
        if (sq1 == 20 && sq2 == 15 && sq3 == 9) output = 3;
        if (sq1 == 15 && sq2 == 9 && sq3 == 3) output = 3;
        if (sq1 == 9 && sq2 == 3 && sq3 == 6) output = 3;
        if (sq1 == 3 && sq2 == 6 && sq3 == 24) output = 3;
        if (sq1 == 6 && sq2 == 24 && sq3 == 1) output = 3;
        if (sq1 == 24 && sq2 == 1 && sq3 == 24) output = 3;
        if (sq1 == 1 && sq2 == 24 && sq3 == 5) output = 3;
        if (sq1 == 24 && sq2 == 5 && sq3 == 26) output = 3;
        // seq 3, midway right end
        if (sq1 == 5 && sq2 == 26 && sq3 == 5) output = 3;
        // seq 3, right to left
        if (sq1 == 26 && sq2 == 5 && sq3 == 24) output = 3;
        if (sq1 == 5 && sq2 == 24 && sq3 == 1) output = 3;
        if (sq1 == 1 && sq2 == 24 && sq3 == 6) output = 3;
        if (sq1 == 24 && sq2 == 6 && sq3 == 3) output = 3;
        if (sq1 == 6 && sq2 == 3 && sq3 == 9) output = 3;
        if (sq1 == 3 && sq2 == 9 && sq3 == 15) output = 3;
        if (sq1 == 9 && sq2 == 15 && sq3 == 20) output = 3;
        if (sq1 == 20 && sq2 == 15 && sq3 == 1) output = 3;
        if (sq1 == 15 && sq2 == 1 && sq3 == 25) output = 3;
        if (sq1 == 1 && sq2 == 25 && sq3 == 8) output = 3;
        // seq 3, midway left end
        if (sq1 == 8 && sq2 == 25 && sq3 == 8) output = 3;
        // seq 4, left to right
        if (sq1 == 21 && sq2 == 27 && sq3 == 6) output = 4;
        if (sq1 == 27 && sq2 == 6 && sq3 == 12) output = 4;
        if (sq1 == 6 && sq2 == 12 && sq3 == 27) output = 4;
        if (sq1 == 12 && sq2 == 27 && sq3 == 20) output = 4;
        if (sq1 == 27 && sq2 == 20 && sq3 == 7) output = 4;
        if (sq1 == 20 && sq2 == 7 && sq3 == 1) output = 4;
        if (sq1 == 7 && sq2 == 1 && sq3 == 19) output = 4;
        if (sq1 == 1 && sq2 == 19 && sq3 == 15) output = 4;
        if (sq1 == 19 && sq2 == 15 && sq3 == 3) output = 4;
        if (sq1 == 15 && sq2 == 3 && sq3 == 13) output = 4;
        if (sq1 == 3 && sq2 == 13 && sq3 == 9) output = 4;
        if (sq1 == 13 && sq2 == 9 && sq3 == 28) output = 4;
        // seq 4, midway right end
        if (sq1 == 9 && sq2 == 28 && sq3 == 9) output = 4;
        // seq 4, right to left
        if (sq1 == 28 && sq2 == 9 && sq3 == 13) output = 4;
        if (sq1 == 9 && sq2 == 13 && sq3 == 3) output = 4;
        if (sq1 == 13 && sq2 == 3 && sq3 == 15) output = 4;
        if (sq1 == 3 && sq2 == 15 && sq3 == 19) output = 4;
        if (sq1 == 15 && sq2 == 19 && sq3 == 1) output = 4;
        if (sq1 == 19 && sq2 == 1 && sq3 == 7) output = 4;
        if (sq1 == 1 && sq2 == 7 && sq3 == 20) output = 4;
        if (sq1 == 7 && sq2 == 20 && sq3 == 27) output = 4;
        if (sq1 == 20 && sq2 == 27 && sq3 == 12) output = 4;
        if (sq1 == 27 && sq2 == 12 && sq3 == 6) output = 4;
        if (sq1 == 12 && sq2 == 6 && sq3 == 27) output = 4;
        if (sq1 == 6 && sq2 == 27 && sq3 == 21) output = 4;
        // seq 4, midway left end
        if (sq1 == 27 && sq2 == 21 && sq3 == 27) output = 4;
        // seq 5, left to right
        if (sq1 == 3 && sq2 == 21 && sq3 == 14) output = 5;
        if (sq1 == 21 && sq2 == 14 && sq3 == 22) output = 5;
        if (sq1 == 14 && sq2 == 22 && sq3 == 7) output = 5;
        if (sq1 == 22 && sq2 == 7 && sq3 == 28) output = 5;
        if (sq1 == 7 && sq2 == 28 && sq3 == 16) output = 5;
        if (sq1 == 28 && sq2 == 16 && sq3 == 27) output = 5;
        if (sq1 == 16 && sq2 == 27 && sq3 == 22) output = 5;
        if (sq1 == 27 && sq2 == 22 && sq3 == 17) output = 5;
        if (sq1 == 22 && sq2 == 17 && sq3 == 26) output = 5;
        if (sq1 == 17 && sq2 == 26 && sq3 == 2) output = 5;
        if (sq1 == 26 && sq2 == 2 && sq3 == 31) output = 5;
        if (sq1 == 2 && sq2 == 31 && sq3 == 15) output = 5;
        // seq 5, midway right end
        if (sq1 == 31 && sq2 == 15 && sq3 == 31) output = 5;
        // seq 5, right to left
        if (sq1 == 15 && sq2 == 31 && sq3 == 2) output = 5;
        if (sq1 == 31 && sq2 == 2 && sq3 == 26) output = 5;
        if (sq1 == 2 && sq2 == 26 && sq3 == 17) output = 5;
        if (sq1 == 26 && sq2 == 17 && sq3 == 22) output = 5;
        if (sq1 == 17 && sq2 == 22 && sq3 == 27) output = 5;
        if (sq1 == 22 && sq2 == 27 && sq3 == 16) output = 5;
        if (sq1 == 27 && sq2 == 16 && sq3 == 28) output = 5;
        if (sq1 == 16 && sq2 == 28 && sq3 == 7) output = 5;
        if (sq1 == 28 && sq2 == 7 && sq3 == 22) output = 5;
        if (sq1 == 7 && sq2 == 22 && sq3 == 14) output = 5;
        if (sq1 == 22 && sq2 == 14 && sq3 == 21) output = 5;
        if (sq1 == 14 && sq2 == 21 && sq3 == 3) output = 5;
        // seq 5, midway left end
        if (sq1 == 21 && sq2 == 3 && sq3 == 21) output = 5;
        // seq 6, left to right
        if (sq1 == 8 && sq2 == 22 && sq3 == 30) output = 6;
        if (sq1 == 22 && sq2 == 30 && sq3 == 19) output = 6;
        if (sq1 == 30 && sq2 == 19 && sq3 == 1) output = 6;
        if (sq1 == 19 && sq2 == 1 && sq3 == 25) output = 6;
        if (sq1 == 1 && sq2 == 25 && sq3 == 31) output = 6;
        if (sq1 == 25 && sq2 == 31 && sq3 == 16) output = 6;
        if (sq1 == 31 && sq2 == 16 && sq3 == 9) output = 6;
        if (sq1 == 16 && sq2 == 9 && sq3 == 7) output = 6;
        if (sq1 == 9 && sq2 == 7 && sq3 == 6) output = 6;
        if (sq1 == 7 && sq2 == 6 && sq3 == 13) output = 6;
        if (sq1 == 6 && sq2 == 13 && sq3 == 9) output = 6;
        if (sq1 == 13 && sq2 == 9 && sq3 == 7) output = 6;
        // seq 6, midway right end
        if (sq1 == 9 && sq2 == 7 && sq3 == 9) output = 6;
        // seq 6, right to left
        if (sq1 == 7 && sq2 == 9 && sq3 == 13) output = 6;
        if (sq1 == 9 && sq2 == 13 && sq3 == 6) output = 6;
        if (sq1 == 13 && sq2 == 6 && sq3 == 7) output = 6;
        if (sq1 == 6 && sq2 == 7 && sq3 == 9) output = 6;
        if (sq1 == 7 && sq2 == 9 && sq3 == 16) output = 6;
        if (sq1 == 9 && sq2 == 16 && sq3 == 31) output = 6;
        if (sq1 == 16 && sq2 == 31 && sq3 == 25) output = 6;
        if (sq1 == 31 && sq2 == 25 && sq3 == 1) output = 6;
        if (sq1 == 25 && sq2 == 1 && sq3 == 19) output = 6;
        if (sq1 == 1 && sq2 == 19 && sq3 == 30) output = 6;
        if (sq1 == 19 && sq2 == 30 && sq3 == 22) output = 6;
        if (sq1 == 30 && sq2 == 22 && sq3 == 8) output = 6;
        // seq 6, midway left end
        if (sq1 == 22 && sq2 == 8 && sq3 == 22) output = 6;
        // seq 7, left to right
        if (sq1 == 5 && sq2 == 18 && sq3 == 12) output = 7;
        if (sq1 == 18 && sq2 == 12 && sq3 == 7) output = 7;
        if (sq1 == 12 && sq2 == 7 && sq3 == 5) output = 7;
        if (sq1 == 7 && sq2 == 5 && sq3 == 12) output = 7;
        if (sq1 == 5 && sq2 == 12 && sq3 == 31) output = 7;
        if (sq1 == 12 && sq2 == 31 && sq3 == 16) output = 7;
        if (sq1 == 31 && sq2 == 16 && sq3 == 10) output = 7;
        if (sq1 == 16 && sq2 == 10 && sq3 == 15) output = 7;
        if (sq1 == 10 && sq2 == 15 && sq3 == 17) output = 7;
        if (sq1 == 15 && sq2 == 17 && sq3 == 9) output = 7;
        if (sq1 == 17 && sq2 == 9 && sq3 == 12) output = 7;
        if (sq1 == 9 && sq2 == 12 && sq3 == 25) output = 7;
        // seq 7, midway right end
        if (sq1 == 12 && sq2 == 25 && sq3 == 12) output = 7;
        // seq 7, right to left
        if (sq1 == 25 && sq2 == 12 && sq3 == 9) output = 7;
        if (sq1 == 12 && sq2 == 9 && sq3 == 17) output = 7;
        if (sq1 == 9 && sq2 == 17 && sq3 == 15) output = 7;
        if (sq1 == 17 && sq2 == 15 && sq3 == 10) output = 7;
        if (sq1 == 15 && sq2 == 10 && sq3 == 16) output = 7;
        if (sq1 == 10 && sq2 == 16 && sq3 == 31) output = 7;
        if (sq1 == 16 && sq2 == 31 && sq3 == 12) output = 7;
        if (sq1 == 31 && sq2 == 12 && sq3 == 5) output = 7;
        if (sq1 == 12 && sq2 == 5 && sq3 == 7) output = 7;
        if (sq1 == 5 && sq2 == 7 && sq3 == 12) output = 7;
        if (sq1 == 7 && sq2 == 12 && sq3 == 18) output = 7;
        if (sq1 == 12 && sq2 == 18 && sq3 == 5) output = 7;
        // seq 7, midway left end
        if (sq1 == 18 && sq2 == 5 && sq3 == 18) output = 7;
        // seq 8, left to right
        if (sq1 == 4 && sq2 == 20 && sq3 == 18) output = 8;
        if (sq1 == 20 && sq2 == 18 && sq3 == 25) output = 8;
        if (sq1 == 18 && sq2 == 25 && sq3 == 20) output = 8;
        if (sq1 == 25 && sq2 == 20 && sq3 == 4) output = 8;
        if (sq1 == 20 && sq2 == 4 && sq3 == 24) output = 8;
        if (sq1 == 4 && sq2 == 24 && sq3 == 29) output = 8;
        if (sq1 == 24 && sq2 == 29 && sq3 == 17) output = 8;
        if (sq1 == 29 && sq2 == 17 && sq3 == 16) output = 8;
        if (sq1 == 17 && sq2 == 16 && sq3 == 12) output = 8;
        if (sq1 == 16 && sq2 == 12 && sq3 == 16) output = 8;
        if (sq1 == 12 && sq2 == 16 && sq3 == 29) output = 8;
        if (sq1 == 16 && sq2 == 29 && sq3 == 19) output = 8;
        // seq 8, midway right end
        if (sq1 == 29 && sq2 == 19 && sq3 == 29) output = 8;
        // seq 8, right to left
        if (sq1 == 19 && sq2 == 29 && sq3 == 16) output = 8;
        if (sq1 == 29 && sq2 == 16 && sq3 == 12) output = 8;
        if (sq1 == 12 && sq2 == 16 && sq3 == 17) output = 8;
        if (sq1 == 16 && sq2 == 17 && sq3 == 29) output = 8;
        if (sq1 == 17 && sq2 == 29 && sq3 == 24) output = 8;
        if (sq1 == 29 && sq2 == 24 && sq3 == 4) output = 8;
        if (sq1 == 24 && sq2 == 4 && sq3 == 20) output = 8;
        if (sq1 == 4 && sq2 == 20 && sq3 == 25) output = 8;
        if (sq1 == 20 && sq2 == 25 && sq3 == 18) output = 8;
        if (sq1 == 25 && sq2 == 18 && sq3 == 20) output = 8;
        if (sq1 == 18 && sq2 == 20 && sq3 == 4) output = 8;
        // seq 8, midway left end
        if (sq1 == 20 && sq2 == 4 && sq3 == 20) output = 8;
        return output;
    }
}
