/**
 * Bitmaps
 *
 * Started work on 05/25/2019 12:05 AM
 *
 * went to bed at 05/26/2019 1:13 AM because fuck me this gui is gonna need a lot of stuff
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class bitmaps {
    static JFrame f;
    public static void module() {
        System.out.println("[BITMAPS]");
        f = new JFrame("KAaNE [BITMAPS]");
        ImageIcon icon = new ImageIcon("imgs/icons/Bitmaps.png");
        f.setIconImage(icon.getImage());
        // Grab the properties
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        // Define pixel icons
        ImageIcon whiteIcon = new ImageIcon("imgs/bitmaps/white.png");
        ImageIcon blackIcon = new ImageIcon("imgs/bitmaps/black.png");
        // Make a shit-ton of labels
        // Quadrant 1
        JLabel q1x1y1Lbl = new JLabel(whiteIcon);
        JLabel q1x2y1Lbl = new JLabel(whiteIcon);
        JLabel q1x3y1Lbl = new JLabel(whiteIcon);
        JLabel q1x4y1Lbl = new JLabel(whiteIcon);
        JLabel q1x1y2Lbl = new JLabel(whiteIcon);
        JLabel q1x2y2Lbl = new JLabel(whiteIcon);
        JLabel q1x3y2Lbl = new JLabel(whiteIcon);
        JLabel q1x4y2Lbl = new JLabel(whiteIcon);
        JLabel q1x1y3Lbl = new JLabel(whiteIcon);
        JLabel q1x2y3Lbl = new JLabel(whiteIcon);
        JLabel q1x3y3Lbl = new JLabel(whiteIcon);
        JLabel q1x4y3Lbl = new JLabel(whiteIcon);
        JLabel q1x1y4Lbl = new JLabel(whiteIcon);
        JLabel q1x2y4Lbl = new JLabel(whiteIcon);
        JLabel q1x3y4Lbl = new JLabel(whiteIcon);
        JLabel q1x4y4Lbl = new JLabel(whiteIcon);
        q1x1y1Lbl.setBounds(5,5,20,20);
        q1x2y1Lbl.setBounds(25,5,20,20);
        q1x3y1Lbl.setBounds(45,5,20,20);
        q1x4y1Lbl.setBounds(65,5,20,20);
        q1x1y2Lbl.setBounds(5,25,20,20);
        q1x2y2Lbl.setBounds(25,25,20,20);
        q1x3y2Lbl.setBounds(45,25,20,20);
        q1x4y2Lbl.setBounds(65,25,20,20);
        q1x1y3Lbl.setBounds(5,45,20,20);
        q1x2y3Lbl.setBounds(25,45,20,20);
        q1x3y3Lbl.setBounds(45,45,20,20);
        q1x4y3Lbl.setBounds(65,45,20,20);
        q1x1y4Lbl.setBounds(5,65,20,20);
        q1x2y4Lbl.setBounds(25,65,20,20);
        q1x3y4Lbl.setBounds(45,65,20,20);
        q1x4y4Lbl.setBounds(65,65,20,20);
        // Quadrant 2
        JLabel q2x1y1Lbl = new JLabel(whiteIcon);
        JLabel q2x2y1Lbl = new JLabel(whiteIcon);
        JLabel q2x3y1Lbl = new JLabel(whiteIcon);
        JLabel q2x4y1Lbl = new JLabel(whiteIcon);
        JLabel q2x1y2Lbl = new JLabel(whiteIcon);
        JLabel q2x2y2Lbl = new JLabel(whiteIcon);
        JLabel q2x3y2Lbl = new JLabel(whiteIcon);
        JLabel q2x4y2Lbl = new JLabel(whiteIcon);
        JLabel q2x1y3Lbl = new JLabel(whiteIcon);
        JLabel q2x2y3Lbl = new JLabel(whiteIcon);
        JLabel q2x3y3Lbl = new JLabel(whiteIcon);
        JLabel q2x4y3Lbl = new JLabel(whiteIcon);
        JLabel q2x1y4Lbl = new JLabel(whiteIcon);
        JLabel q2x2y4Lbl = new JLabel(whiteIcon);
        JLabel q2x3y4Lbl = new JLabel(whiteIcon);
        JLabel q2x4y4Lbl = new JLabel(whiteIcon);
        q2x1y1Lbl.setBounds( 90,5,20,20);
        q2x2y1Lbl.setBounds(110,5,20,20);
        q2x3y1Lbl.setBounds(130,5,20,20);
        q2x4y1Lbl.setBounds(150,5,20,20);
        q2x1y2Lbl.setBounds(90,25,20,20);
        q2x2y2Lbl.setBounds(110,25,20,20);
        q2x3y2Lbl.setBounds(130,25,20,20);
        q2x4y2Lbl.setBounds(150,25,20,20);
        q2x1y3Lbl.setBounds(90,45,20,20);
        q2x2y3Lbl.setBounds(110,45,20,20);
        q2x3y3Lbl.setBounds(130,45,20,20);
        q2x4y3Lbl.setBounds(150,45,20,20);
        q2x1y4Lbl.setBounds(90,65,20,20);
        q2x2y4Lbl.setBounds(110,65,20,20);
        q2x3y4Lbl.setBounds(130,65,20,20);
        q2x4y4Lbl.setBounds(150,65,20,20);
        // Quadrant 3
        JLabel q3x1y1Lbl = new JLabel(whiteIcon);
        JLabel q3x2y1Lbl = new JLabel(whiteIcon);
        JLabel q3x3y1Lbl = new JLabel(whiteIcon);
        JLabel q3x4y1Lbl = new JLabel(whiteIcon);
        JLabel q3x1y2Lbl = new JLabel(whiteIcon);
        JLabel q3x2y2Lbl = new JLabel(whiteIcon);
        JLabel q3x3y2Lbl = new JLabel(whiteIcon);
        JLabel q3x4y2Lbl = new JLabel(whiteIcon);
        JLabel q3x1y3Lbl = new JLabel(whiteIcon);
        JLabel q3x2y3Lbl = new JLabel(whiteIcon);
        JLabel q3x3y3Lbl = new JLabel(whiteIcon);
        JLabel q3x4y3Lbl = new JLabel(whiteIcon);
        JLabel q3x1y4Lbl = new JLabel(whiteIcon);
        JLabel q3x2y4Lbl = new JLabel(whiteIcon);
        JLabel q3x3y4Lbl = new JLabel(whiteIcon);
        JLabel q3x4y4Lbl = new JLabel(whiteIcon);
        q3x1y1Lbl.setBounds(5,90,20,20);
        q3x2y1Lbl.setBounds(25,90,20,20);
        q3x3y1Lbl.setBounds(45,90,20,20);
        q3x4y1Lbl.setBounds(65,90,20,20);
        q3x1y2Lbl.setBounds(5,110,20,20);
        q3x2y2Lbl.setBounds(25,110,20,20);
        q3x3y2Lbl.setBounds(45,110,20,20);
        q3x4y2Lbl.setBounds(65,110,20,20);
        q3x1y3Lbl.setBounds(5,130,20,20);
        q3x2y3Lbl.setBounds(25,130,20,20);
        q3x3y3Lbl.setBounds(45,130,20,20);
        q3x4y3Lbl.setBounds(65,130,20,20);
        q3x1y4Lbl.setBounds(5,150,20,20);
        q3x2y4Lbl.setBounds(25,150,20,20);
        q3x3y4Lbl.setBounds(45,150,20,20);
        q3x4y4Lbl.setBounds(65,150,20,20);
        // Quadrant 4
        JLabel q4x1y1Lbl = new JLabel(whiteIcon);
        JLabel q4x2y1Lbl = new JLabel(whiteIcon);
        JLabel q4x3y1Lbl = new JLabel(whiteIcon);
        JLabel q4x4y1Lbl = new JLabel(whiteIcon);
        JLabel q4x1y2Lbl = new JLabel(whiteIcon);
        JLabel q4x2y2Lbl = new JLabel(whiteIcon);
        JLabel q4x3y2Lbl = new JLabel(whiteIcon);
        JLabel q4x4y2Lbl = new JLabel(whiteIcon);
        JLabel q4x1y3Lbl = new JLabel(whiteIcon);
        JLabel q4x2y3Lbl = new JLabel(whiteIcon);
        JLabel q4x3y3Lbl = new JLabel(whiteIcon);
        JLabel q4x4y3Lbl = new JLabel(whiteIcon);
        JLabel q4x1y4Lbl = new JLabel(whiteIcon);
        JLabel q4x2y4Lbl = new JLabel(whiteIcon);
        JLabel q4x3y4Lbl = new JLabel(whiteIcon);
        JLabel q4x4y4Lbl = new JLabel(whiteIcon);
        q4x1y1Lbl.setBounds(90,90,20,20);
        q4x2y1Lbl.setBounds(110,90,20,20);
        q4x3y1Lbl.setBounds(130,90,20,20);
        q4x4y1Lbl.setBounds(150,90,20,20);
        q4x1y2Lbl.setBounds(90,110,20,20);
        q4x2y2Lbl.setBounds(110,110,20,20);
        q4x3y2Lbl.setBounds(130,110,20,20);
        q4x4y2Lbl.setBounds(150,110,20,20);
        q4x1y3Lbl.setBounds(90,130,20,20);
        q4x2y3Lbl.setBounds(110,130,20,20);
        q4x3y3Lbl.setBounds(130,130,20,20);
        q4x4y3Lbl.setBounds(150,130,20,20);
        q4x1y4Lbl.setBounds(90,150,20,20);
        q4x2y4Lbl.setBounds(110,150,20,20);
        q4x3y4Lbl.setBounds(130,150,20,20);
        q4x4y4Lbl.setBounds(150,150,20,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(85,180,75,20);
        // Clear
        JButton clear = new JButton("CLEAR");
        clear.setBounds(15,180,75,20);
        // Output
        JLabel output = new JLabel();
        output.setBounds(65,200,50,20);
        // Add everything
        f.add(q1x1y1Lbl); f.add(q1x2y1Lbl); f.add(q1x3y1Lbl); f.add(q1x4y1Lbl);
        f.add(q1x1y2Lbl); f.add(q1x2y2Lbl); f.add(q1x3y2Lbl); f.add(q1x4y2Lbl);
        f.add(q1x1y3Lbl); f.add(q1x2y3Lbl); f.add(q1x3y3Lbl); f.add(q1x4y3Lbl);
        f.add(q1x1y4Lbl); f.add(q1x2y4Lbl); f.add(q1x3y4Lbl); f.add(q1x4y4Lbl);
        f.add(q2x1y1Lbl); f.add(q2x2y1Lbl); f.add(q2x3y1Lbl); f.add(q2x4y1Lbl);
        f.add(q2x1y2Lbl); f.add(q2x2y2Lbl); f.add(q2x3y2Lbl); f.add(q2x4y2Lbl);
        f.add(q2x1y3Lbl); f.add(q2x2y3Lbl); f.add(q2x3y3Lbl); f.add(q2x4y3Lbl);
        f.add(q2x1y4Lbl); f.add(q2x2y4Lbl); f.add(q2x3y4Lbl); f.add(q2x4y4Lbl);
        f.add(q3x1y1Lbl); f.add(q3x2y1Lbl); f.add(q3x3y1Lbl); f.add(q3x4y1Lbl);
        f.add(q3x1y2Lbl); f.add(q3x2y2Lbl); f.add(q3x3y2Lbl); f.add(q3x4y2Lbl);
        f.add(q3x1y3Lbl); f.add(q3x2y3Lbl); f.add(q3x3y3Lbl); f.add(q3x4y3Lbl);
        f.add(q3x1y4Lbl); f.add(q3x2y4Lbl); f.add(q3x3y4Lbl); f.add(q3x4y4Lbl);
        f.add(q4x1y1Lbl); f.add(q4x2y1Lbl); f.add(q4x3y1Lbl); f.add(q4x4y1Lbl);
        f.add(q4x1y2Lbl); f.add(q4x2y2Lbl); f.add(q4x3y2Lbl); f.add(q4x4y2Lbl);
        f.add(q4x1y3Lbl); f.add(q4x2y3Lbl); f.add(q4x3y3Lbl); f.add(q4x4y3Lbl);
        f.add(q4x1y4Lbl); f.add(q4x2y4Lbl); f.add(q4x3y4Lbl); f.add(q4x4y4Lbl);
        f.add(button); f.add(output); f.add(clear);
        // Define JFrame
        f.setLayout(null);
        f.setSize(180,250);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Actual Logic
        button.addActionListener((ActionEvent e) -> {
            // Grab the status of pixels and add them to an array
            boolean[][] q1Arr = {
                    {false,false,false,false},
                    {false,false,false,false},
                    {false,false,false,false},
                    {false,false,false,false}
            };
            if (q1x1y1Lbl.getIcon() == blackIcon) q1Arr[0][0] = true;
            if (q1x2y1Lbl.getIcon() == blackIcon) q1Arr[0][1] = true;
            if (q1x3y1Lbl.getIcon() == blackIcon) q1Arr[0][2] = true;
            if (q1x4y1Lbl.getIcon() == blackIcon) q1Arr[0][3] = true;
            if (q1x1y2Lbl.getIcon() == blackIcon) q1Arr[1][0] = true;
            if (q1x2y2Lbl.getIcon() == blackIcon) q1Arr[1][1] = true;
            if (q1x3y2Lbl.getIcon() == blackIcon) q1Arr[1][2] = true;
            if (q1x4y2Lbl.getIcon() == blackIcon) q1Arr[1][3] = true;
            if (q1x1y3Lbl.getIcon() == blackIcon) q1Arr[2][0] = true;
            if (q1x2y3Lbl.getIcon() == blackIcon) q1Arr[2][1] = true;
            if (q1x3y3Lbl.getIcon() == blackIcon) q1Arr[2][2] = true;
            if (q1x4y3Lbl.getIcon() == blackIcon) q1Arr[2][3] = true;
            if (q1x1y4Lbl.getIcon() == blackIcon) q1Arr[3][0] = true;
            if (q1x2y4Lbl.getIcon() == blackIcon) q1Arr[3][1] = true;
            if (q1x3y4Lbl.getIcon() == blackIcon) q1Arr[3][2] = true;
            if (q1x4y4Lbl.getIcon() == blackIcon) q1Arr[3][3] = true;
            boolean[][] q2Arr = {
                    {false,false,false,false},
                    {false,false,false,false},
                    {false,false,false,false},
                    {false,false,false,false}
            };
            if (q2x1y1Lbl.getIcon() == blackIcon) q2Arr[0][0] = true;
            if (q2x2y1Lbl.getIcon() == blackIcon) q2Arr[0][1] = true;
            if (q2x3y1Lbl.getIcon() == blackIcon) q2Arr[0][2] = true;
            if (q2x4y1Lbl.getIcon() == blackIcon) q2Arr[0][3] = true;
            if (q2x1y2Lbl.getIcon() == blackIcon) q2Arr[1][0] = true;
            if (q2x2y2Lbl.getIcon() == blackIcon) q2Arr[1][1] = true;
            if (q2x3y2Lbl.getIcon() == blackIcon) q2Arr[1][2] = true;
            if (q2x4y2Lbl.getIcon() == blackIcon) q2Arr[1][3] = true;
            if (q2x1y3Lbl.getIcon() == blackIcon) q2Arr[2][0] = true;
            if (q2x2y3Lbl.getIcon() == blackIcon) q2Arr[2][1] = true;
            if (q2x3y3Lbl.getIcon() == blackIcon) q2Arr[2][2] = true;
            if (q2x4y3Lbl.getIcon() == blackIcon) q2Arr[2][3] = true;
            if (q2x1y4Lbl.getIcon() == blackIcon) q2Arr[3][0] = true;
            if (q2x2y4Lbl.getIcon() == blackIcon) q2Arr[3][1] = true;
            if (q2x3y4Lbl.getIcon() == blackIcon) q2Arr[3][2] = true;
            if (q2x4y4Lbl.getIcon() == blackIcon) q2Arr[3][3] = true;
            boolean[][] q3Arr = {
                    {false,false,false,false},
                    {false,false,false,false},
                    {false,false,false,false},
                    {false,false,false,false}
            };
            if (q3x1y1Lbl.getIcon() == blackIcon) q3Arr[0][0] = true;
            if (q3x2y1Lbl.getIcon() == blackIcon) q3Arr[0][1] = true;
            if (q3x3y1Lbl.getIcon() == blackIcon) q3Arr[0][2] = true;
            if (q3x4y1Lbl.getIcon() == blackIcon) q3Arr[0][3] = true;
            if (q3x1y2Lbl.getIcon() == blackIcon) q3Arr[1][0] = true;
            if (q3x2y2Lbl.getIcon() == blackIcon) q3Arr[1][1] = true;
            if (q3x3y2Lbl.getIcon() == blackIcon) q3Arr[1][2] = true;
            if (q3x4y2Lbl.getIcon() == blackIcon) q3Arr[1][3] = true;
            if (q3x1y3Lbl.getIcon() == blackIcon) q3Arr[2][0] = true;
            if (q3x2y3Lbl.getIcon() == blackIcon) q3Arr[2][1] = true;
            if (q3x3y3Lbl.getIcon() == blackIcon) q3Arr[2][2] = true;
            if (q3x4y3Lbl.getIcon() == blackIcon) q3Arr[2][3] = true;
            if (q3x1y4Lbl.getIcon() == blackIcon) q3Arr[3][0] = true;
            if (q3x2y4Lbl.getIcon() == blackIcon) q3Arr[3][1] = true;
            if (q3x3y4Lbl.getIcon() == blackIcon) q3Arr[3][2] = true;
            if (q3x4y4Lbl.getIcon() == blackIcon) q3Arr[3][3] = true;
            boolean[][] q4Arr = {
                    {false,false,false,false},
                    {false,false,false,false},
                    {false,false,false,false},
                    {false,false,false,false}
            };
            if (q4x1y1Lbl.getIcon() == blackIcon) q4Arr[0][0] = true;
            if (q4x2y1Lbl.getIcon() == blackIcon) q4Arr[0][1] = true;
            if (q4x3y1Lbl.getIcon() == blackIcon) q4Arr[0][2] = true;
            if (q4x4y1Lbl.getIcon() == blackIcon) q4Arr[0][3] = true;
            if (q4x1y2Lbl.getIcon() == blackIcon) q4Arr[1][0] = true;
            if (q4x2y2Lbl.getIcon() == blackIcon) q4Arr[1][1] = true;
            if (q4x3y2Lbl.getIcon() == blackIcon) q4Arr[1][2] = true;
            if (q4x4y2Lbl.getIcon() == blackIcon) q4Arr[1][3] = true;
            if (q4x1y3Lbl.getIcon() == blackIcon) q4Arr[2][0] = true;
            if (q4x2y3Lbl.getIcon() == blackIcon) q4Arr[2][1] = true;
            if (q4x3y3Lbl.getIcon() == blackIcon) q4Arr[2][2] = true;
            if (q4x4y3Lbl.getIcon() == blackIcon) q4Arr[2][3] = true;
            if (q4x1y4Lbl.getIcon() == blackIcon) q4Arr[3][0] = true;
            if (q4x2y4Lbl.getIcon() == blackIcon) q4Arr[3][1] = true;
            if (q4x3y4Lbl.getIcon() == blackIcon) q4Arr[3][2] = true;
            if (q4x4y4Lbl.getIcon() == blackIcon) q4Arr[3][3] = true;
            boolean[][] gridArr = {
                    {q1Arr[0][0],q1Arr[0][1],q1Arr[0][2],q1Arr[0][3],q2Arr[0][0],q2Arr[0][1],q2Arr[0][2],q2Arr[0][3]},
                    {q1Arr[1][0],q1Arr[1][1],q1Arr[1][2],q1Arr[1][3],q2Arr[1][0],q2Arr[1][1],q2Arr[1][2],q2Arr[1][3]},
                    {q1Arr[2][0],q1Arr[2][1],q1Arr[2][2],q1Arr[2][3],q2Arr[2][0],q2Arr[2][1],q2Arr[2][2],q2Arr[2][3]},
                    {q1Arr[3][0],q1Arr[3][1],q1Arr[3][2],q1Arr[3][3],q2Arr[3][0],q2Arr[3][1],q2Arr[3][2],q2Arr[3][3]},
                    {q3Arr[0][0],q3Arr[0][1],q3Arr[0][2],q3Arr[0][3],q4Arr[0][0],q4Arr[0][1],q4Arr[0][2],q4Arr[0][3]},
                    {q3Arr[1][0],q3Arr[1][1],q3Arr[1][2],q3Arr[1][3],q4Arr[1][0],q4Arr[1][1],q4Arr[1][2],q4Arr[1][3]},
                    {q3Arr[2][0],q3Arr[2][1],q3Arr[2][2],q3Arr[2][3],q4Arr[2][0],q4Arr[2][1],q4Arr[2][2],q4Arr[2][3]},
                    {q3Arr[3][0],q3Arr[3][1],q3Arr[3][2],q3Arr[3][3],q4Arr[3][0],q4Arr[3][1],q4Arr[3][2],q4Arr[3][3]}
            };
            // Print for debug
            System.out.println((q1Arr[0][0] ? "██" : "░░") + (q1Arr[0][1] ? "██" : "░░") + (q1Arr[0][2] ? "██" : "░░") + (q1Arr[0][3] ? "██" : "░░") + " | "
                    + (q2Arr[0][0] ? "██" : "░░") + (q2Arr[0][1] ? "██" : "░░") + (q2Arr[0][2] ? "██" : "░░") + (q2Arr[0][3] ? "██" : "░░"));
            System.out.println((q1Arr[1][0] ? "██" : "░░") + (q1Arr[1][1] ? "██" : "░░") + (q1Arr[1][2] ? "██" : "░░") + (q1Arr[1][3] ? "██" : "░░") + " | "
                    + (q2Arr[1][0] ? "██" : "░░") + (q2Arr[1][1] ? "██" : "░░") + (q2Arr[1][2] ? "██" : "░░") + (q2Arr[1][3] ? "██" : "░░"));
            System.out.println((q1Arr[2][0] ? "██" : "░░") + (q1Arr[2][1] ? "██" : "░░") + (q1Arr[2][2] ? "██" : "░░") + (q1Arr[2][3] ? "██" : "░░") + " | "
                    + (q2Arr[2][0] ? "██" : "░░") + (q2Arr[2][1] ? "██" : "░░") + (q2Arr[2][2] ? "██" : "░░") + (q2Arr[2][3] ? "██" : "░░"));
            System.out.println((q1Arr[3][0] ? "██" : "░░") + (q1Arr[3][1] ? "██" : "░░") + (q1Arr[3][2] ? "██" : "░░") + (q1Arr[3][3] ? "██" : "░░") + " | "
                    + (q2Arr[3][0] ? "██" : "░░") + (q2Arr[3][1] ? "██" : "░░") + (q2Arr[3][2] ? "██" : "░░") + (q2Arr[3][3] ? "██" : "░░"));
            System.out.println("--------------+--------------");
            System.out.println((q3Arr[0][0] ? "██" : "░░") + (q3Arr[0][1] ? "██" : "░░") + (q3Arr[0][2] ? "██" : "░░") + (q3Arr[0][3] ? "██" : "░░") + " | "
                    + (q4Arr[0][0] ? "██" : "░░") + (q4Arr[0][1] ? "██" : "░░") + (q4Arr[0][2] ? "██" : "░░") + (q4Arr[0][3] ? "██" : "░░"));
            System.out.println((q3Arr[1][0] ? "██" : "░░") + (q3Arr[1][1] ? "██" : "░░") + (q3Arr[1][2] ? "██" : "░░") + (q3Arr[1][3] ? "██" : "░░") + " | "
                    + (q4Arr[1][0] ? "██" : "░░") + (q4Arr[1][1] ? "██" : "░░") + (q4Arr[1][2] ? "██" : "░░") + (q4Arr[1][3] ? "██" : "░░"));
            System.out.println((q3Arr[2][0] ? "██" : "░░") + (q3Arr[2][1] ? "██" : "░░") + (q3Arr[2][2] ? "██" : "░░") + (q3Arr[2][3] ? "██" : "░░") + " | "
                    + (q4Arr[2][0] ? "██" : "░░") + (q4Arr[2][1] ? "██" : "░░") + (q4Arr[2][2] ? "██" : "░░") + (q4Arr[2][3] ? "██" : "░░"));
            System.out.println((q3Arr[3][0] ? "██" : "░░") + (q3Arr[3][1] ? "██" : "░░") + (q3Arr[3][2] ? "██" : "░░") + (q3Arr[3][3] ? "██" : "░░") + " | "
                    + (q4Arr[3][0] ? "██" : "░░") + (q4Arr[3][1] ? "██" : "░░") + (q4Arr[3][2] ? "██" : "░░") + (q4Arr[3][3] ? "██" : "░░"));
            // Get SN last digit
            int lastsn = Integer.parseInt(props.getProperty("snLastDig"));
            System.out.println("SN Last: " + lastsn);
            int ans = 0;
            int q1white = count(q1Arr,false);
            int q1black = count(q1Arr,true);
            int q2white = count(q2Arr,false);
            int q2black = count(q2Arr,true);
            int q3white = count(q3Arr,false);
            int q3black = count(q3Arr,true);
            int q4white = count(q4Arr,false);
            int q4black = count(q4Arr,true);
            int mostlyWhite = (q1white > q1black) ? 1 : 0;
            mostlyWhite += (q2white > q2black) ? 1 : 0;
            mostlyWhite += (q3white > q3black) ? 1 : 0;
            mostlyWhite += (q4white > q4black) ? 1 : 0;
            int mostlyBlack = (q1white < q1black) ? 1 : 0;
            mostlyBlack += (q2white < q2black) ? 1 : 0;
            mostlyBlack += (q3white < q3black) ? 1 : 0;
            mostlyBlack += (q4white < q4black) ? 1 : 0;
            for (boolean b = true; ;) {
                // rule 0
                if (lastsn == 0) {
                    // If exactly one quadrant has 5 or fewer white pixels,
                    // the answer is the number of white pixels in the other 3 quadrants.
                    System.out.println("RULE 0");
                    boolean q1five = q1white <= 5;
                    boolean q2five = q2white <= 5;
                    boolean q3five = q3white <= 5;
                    boolean q4five = q4white <= 5;
                    boolean[] tempArr = {q1five,q2five,q3five,q4five};
                    if (count(tempArr,true) == 1) {
                        System.out.println("IS TRUE");
                        if (q1five) {
                            ans = q2white + q3white + q4white;
                            break;
                        }
                        if (q2five) {
                            ans = q1white + q3white + q4white;
                            break;
                        }
                        if (q3five) {
                            ans = q1white + q2white + q4white;
                            break;
                        }
                        if (q4five) {
                            ans = q1white + q2white + q3white;
                            break;
                        }
                    }
                    else lastsn++;
                }
                // rule 1
                else if (lastsn == 1) {
                    // If there are exactly as many mostly-white quadrants as there are lit indicators,
                    // the answer is the number of batteries.
                    System.out.println("RULE 1");
                    int litInds = Integer.parseInt(props.getProperty("totalIndsLit"));
                    if (mostlyWhite == litInds) {
                        System.out.println("IS TRUE");
                        ans = Integer.parseInt(props.getProperty("batteriesTotal"));
                        break;
                    }
                    else lastsn++;
                }
                // rule 2
                else if (lastsn == 2) {
                    System.out.println("RULE 2");
                    // If exactly one row or column is completely white or completely black,
                    // the answer is its x-/y-coordinate (starting from 1 in the top/left).
                    int colRow = colRow(gridArr);
                    if (colRow != -1) {
                        System.out.println("IS TRUE");
                        ans = colRow + 1;
                        break;
                    }
                    else lastsn++;
                }
                // rule 3
                else if (lastsn == 3) {
                    // If there are fewer mostly-white quadrants than mostly-black quadrants, 
                    // the answer is the number of mostly-black quadrants.
                    System.out.println("RULE 3");
                    if (mostlyWhite < mostlyBlack) {
                        System.out.println("IS TRUE");
                        ans = mostlyBlack;
                        break;
                    }
                    else lastsn++;
                }
                // rule 4
                else if (lastsn == 4) {
                    // If the entire bitmap has 36 or more white pixels,
                    // the answer is the total number of white pixels.
                    System.out.println("RULE 4");
                    int white = count(gridArr,false);
                    if (white >= 36) {
                        System.out.println("IS TRUE");
                        ans = white;
                        break;
                    }
                    else lastsn++;
                }
                // rule 5
                else if (lastsn == 5) {
                    // If there are more mostly-white quadrants than mostly-black quadrants,
                    // the answer is the smallest number of black pixels in any quadrant.
                    System.out.println("RULE 5");
                    if (mostlyWhite > mostlyBlack) {
                        System.out.println("IS TRUE");
                        int[] tempArr = {q1black,q2black,q3black,q4black};
                        ans = getSmallest(tempArr);
                        break;
                    }
                    else lastsn++;
                }
                // rule 6
                else if (lastsn == 6) {
                    // If exactly one quadrant has 5 or fewer black pixels,
                    // the answer is the number of black pixels in the other 3 quadrants.
                    System.out.println("RULE 6");
                    boolean q1five = q1black <= 5;
                    boolean q2five = q2black <= 5;
                    boolean q3five = q3black <= 5;
                    boolean q4five = q4black <= 5;
                    boolean[] tempArr = {q1five,q2five,q3five,q4five};
                    if (count(tempArr,true) == 1) {
                        System.out.println("IS TRUE");
                        if (q1five) {
                            ans = q2black + q3black + q4black;
                            break;
                        }
                        if (q2five) {
                            ans = q1black + q3black + q4black;
                            break;
                        }
                        if (q3five) {
                            ans = q1black + q2black + q4black;
                            break;
                        }
                        if (q4five) {
                            ans = q1black + q2black + q3black;
                            break;
                        }
                    }
                    else lastsn++;
                }
                // rule 7
                else if (lastsn == 7) {
                    // If there are exactly as many mostly-black quadrants as there are unlit indicators, 
                    // the answer is the number of ports.
                    System.out.println("RULE 7");
                    int unlitInds = Integer.parseInt(props.getProperty("totalIndsUnlit"));
                    if (mostlyBlack == unlitInds) {
                        System.out.println("IS TRUE");
                        ans = Integer.parseInt(props.getProperty("totalPorts"));
                        break;
                    }
                    else lastsn++;
                }
                // rule 8
                else if (lastsn == 8) {
                    // If there is a 3×3 square that is completely white or completely black,
                    // the answer is the x-coordinate (starting from 1) of the center of the first such square in reading order.
                    System.out.println("RULE 8");
                    int squareCenter = findSquare(gridArr);
                    if (squareCenter != -1) {
                        System.out.println("IS TRUE");
                        ans = squareCenter + 1;
                        break;
                    }
                    else lastsn++;
                }
                // rule 9
                else if (lastsn == 9) {
                    // If there are exactly as many mostly-white quadrants as mostly-black quadrants,
                    // the answer is the first numeric digit of the serial number.
                    System.out.println("RULE 9");
                    if (mostlyWhite == mostlyBlack) {
                        System.out.println("IS TRUE");
                        ans = Integer.parseInt(props.getProperty("snFirstDig"));
                        break;
                    }
                    else lastsn = 0;
                }
            }
            System.out.println("ANS - " + ans);
            int btn = (ans + 3) % 4 + 1;
            System.out.println("Button - " + btn);
            output.setText("PUSH " + btn);

        });
        // Clear Button functionality
        clear.addActionListener((ActionEvent e) -> {
            // q1
            q1x1y1Lbl.setIcon(whiteIcon);
            q1x2y1Lbl.setIcon(whiteIcon);
            q1x3y1Lbl.setIcon(whiteIcon);
            q1x4y1Lbl.setIcon(whiteIcon);
            q1x1y2Lbl.setIcon(whiteIcon);
            q1x2y2Lbl.setIcon(whiteIcon);
            q1x3y2Lbl.setIcon(whiteIcon);
            q1x4y2Lbl.setIcon(whiteIcon);
            q1x1y3Lbl.setIcon(whiteIcon);
            q1x2y3Lbl.setIcon(whiteIcon);
            q1x3y3Lbl.setIcon(whiteIcon);
            q1x4y3Lbl.setIcon(whiteIcon);
            q1x1y4Lbl.setIcon(whiteIcon);
            q1x2y4Lbl.setIcon(whiteIcon);
            q1x3y4Lbl.setIcon(whiteIcon);
            q1x4y4Lbl.setIcon(whiteIcon);
            // q2
            q2x1y1Lbl.setIcon(whiteIcon);
            q2x2y1Lbl.setIcon(whiteIcon);
            q2x3y1Lbl.setIcon(whiteIcon);
            q2x4y1Lbl.setIcon(whiteIcon);
            q2x1y2Lbl.setIcon(whiteIcon);
            q2x2y2Lbl.setIcon(whiteIcon);
            q2x3y2Lbl.setIcon(whiteIcon);
            q2x4y2Lbl.setIcon(whiteIcon);
            q2x1y3Lbl.setIcon(whiteIcon);
            q2x2y3Lbl.setIcon(whiteIcon);
            q2x3y3Lbl.setIcon(whiteIcon);
            q2x4y3Lbl.setIcon(whiteIcon);
            q2x1y4Lbl.setIcon(whiteIcon);
            q2x2y4Lbl.setIcon(whiteIcon);
            q2x3y4Lbl.setIcon(whiteIcon);
            q2x4y4Lbl.setIcon(whiteIcon);
            // q3
            q3x1y1Lbl.setIcon(whiteIcon);
            q3x2y1Lbl.setIcon(whiteIcon);
            q3x3y1Lbl.setIcon(whiteIcon);
            q3x4y1Lbl.setIcon(whiteIcon);
            q3x1y2Lbl.setIcon(whiteIcon);
            q3x2y2Lbl.setIcon(whiteIcon);
            q3x3y2Lbl.setIcon(whiteIcon);
            q3x4y2Lbl.setIcon(whiteIcon);
            q3x1y3Lbl.setIcon(whiteIcon);
            q3x2y3Lbl.setIcon(whiteIcon);
            q3x3y3Lbl.setIcon(whiteIcon);
            q3x4y3Lbl.setIcon(whiteIcon);
            q3x1y4Lbl.setIcon(whiteIcon);
            q3x2y4Lbl.setIcon(whiteIcon);
            q3x3y4Lbl.setIcon(whiteIcon);
            q3x4y4Lbl.setIcon(whiteIcon);
            // q4
            q4x1y1Lbl.setIcon(whiteIcon);
            q4x2y1Lbl.setIcon(whiteIcon);
            q4x3y1Lbl.setIcon(whiteIcon);
            q4x4y1Lbl.setIcon(whiteIcon);
            q4x1y2Lbl.setIcon(whiteIcon);
            q4x2y2Lbl.setIcon(whiteIcon);
            q4x3y2Lbl.setIcon(whiteIcon);
            q4x4y2Lbl.setIcon(whiteIcon);
            q4x1y3Lbl.setIcon(whiteIcon);
            q4x2y3Lbl.setIcon(whiteIcon);
            q4x3y3Lbl.setIcon(whiteIcon);
            q4x4y3Lbl.setIcon(whiteIcon);
            q4x1y4Lbl.setIcon(whiteIcon);
            q4x2y4Lbl.setIcon(whiteIcon);
            q4x3y4Lbl.setIcon(whiteIcon);
            q4x4y4Lbl.setIcon(whiteIcon);
            // output
            output.setText("");
        });
        // Label Image Changing
        // Below if condition is to make code collapsible.
        if (true) {
            // Quadrant 1
            q1x1y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x1y1Lbl.getIcon() == whiteIcon) q1x1y1Lbl.setIcon(blackIcon);
                    else q1x1y1Lbl.setIcon(whiteIcon);
                }
            });
            q1x2y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x2y1Lbl.getIcon() == whiteIcon) q1x2y1Lbl.setIcon(blackIcon);
                    else q1x2y1Lbl.setIcon(whiteIcon);
                }
            });
            q1x3y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x3y1Lbl.getIcon() == whiteIcon) q1x3y1Lbl.setIcon(blackIcon);
                    else q1x3y1Lbl.setIcon(whiteIcon);
                }
            });
            q1x4y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x4y1Lbl.getIcon() == whiteIcon) q1x4y1Lbl.setIcon(blackIcon);
                    else q1x4y1Lbl.setIcon(whiteIcon);
                }
            });
            q1x1y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x1y2Lbl.getIcon() == whiteIcon) q1x1y2Lbl.setIcon(blackIcon);
                    else q1x1y2Lbl.setIcon(whiteIcon);
                }
            });
            q1x2y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x2y2Lbl.getIcon() == whiteIcon) q1x2y2Lbl.setIcon(blackIcon);
                    else q1x2y2Lbl.setIcon(whiteIcon);
                }
            });
            q1x3y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x3y2Lbl.getIcon() == whiteIcon) q1x3y2Lbl.setIcon(blackIcon);
                    else q1x3y2Lbl.setIcon(whiteIcon);
                }
            });
            q1x4y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x4y2Lbl.getIcon() == whiteIcon) q1x4y2Lbl.setIcon(blackIcon);
                    else q1x4y2Lbl.setIcon(whiteIcon);
                }
            });
            q1x1y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x1y3Lbl.getIcon() == whiteIcon) q1x1y3Lbl.setIcon(blackIcon);
                    else q1x1y3Lbl.setIcon(whiteIcon);
                }
            });
            q1x2y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x2y3Lbl.getIcon() == whiteIcon) q1x2y3Lbl.setIcon(blackIcon);
                    else q1x2y3Lbl.setIcon(whiteIcon);
                }
            });
            q1x3y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x3y3Lbl.getIcon() == whiteIcon) q1x3y3Lbl.setIcon(blackIcon);
                    else q1x3y3Lbl.setIcon(whiteIcon);
                }
            });
            q1x4y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x4y3Lbl.getIcon() == whiteIcon) q1x4y3Lbl.setIcon(blackIcon);
                    else q1x4y3Lbl.setIcon(whiteIcon);
                }
            });
            q1x1y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x1y4Lbl.getIcon() == whiteIcon) q1x1y4Lbl.setIcon(blackIcon);
                    else q1x1y4Lbl.setIcon(whiteIcon);
                }
            });
            q1x2y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x2y4Lbl.getIcon() == whiteIcon) q1x2y4Lbl.setIcon(blackIcon);
                    else q1x2y4Lbl.setIcon(whiteIcon);
                }
            });
            q1x3y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x3y4Lbl.getIcon() == whiteIcon) q1x3y4Lbl.setIcon(blackIcon);
                    else q1x3y4Lbl.setIcon(whiteIcon);
                }
            });
            q1x4y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q1x4y4Lbl.getIcon() == whiteIcon) q1x4y4Lbl.setIcon(blackIcon);
                    else q1x4y4Lbl.setIcon(whiteIcon);
                }
            });
            // Quadrant 2
            q2x1y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x1y1Lbl.getIcon() == whiteIcon) q2x1y1Lbl.setIcon(blackIcon);
                    else q2x1y1Lbl.setIcon(whiteIcon);
                }
            });
            q2x2y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x2y1Lbl.getIcon() == whiteIcon) q2x2y1Lbl.setIcon(blackIcon);
                    else q2x2y1Lbl.setIcon(whiteIcon);
                }
            });
            q2x3y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x3y1Lbl.getIcon() == whiteIcon) q2x3y1Lbl.setIcon(blackIcon);
                    else q2x3y1Lbl.setIcon(whiteIcon);
                }
            });
            q2x4y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x4y1Lbl.getIcon() == whiteIcon) q2x4y1Lbl.setIcon(blackIcon);
                    else q2x4y1Lbl.setIcon(whiteIcon);
                }
            });
            q2x1y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x1y2Lbl.getIcon() == whiteIcon) q2x1y2Lbl.setIcon(blackIcon);
                    else q2x1y2Lbl.setIcon(whiteIcon);
                }
            });
            q2x2y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x2y2Lbl.getIcon() == whiteIcon) q2x2y2Lbl.setIcon(blackIcon);
                    else q2x2y2Lbl.setIcon(whiteIcon);
                }
            });
            q2x3y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x3y2Lbl.getIcon() == whiteIcon) q2x3y2Lbl.setIcon(blackIcon);
                    else q2x3y2Lbl.setIcon(whiteIcon);
                }
            });
            q2x4y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x4y2Lbl.getIcon() == whiteIcon) q2x4y2Lbl.setIcon(blackIcon);
                    else q2x4y2Lbl.setIcon(whiteIcon);
                }
            });
            q2x1y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x1y3Lbl.getIcon() == whiteIcon) q2x1y3Lbl.setIcon(blackIcon);
                    else q2x1y3Lbl.setIcon(whiteIcon);
                }
            });
            q2x2y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x2y3Lbl.getIcon() == whiteIcon) q2x2y3Lbl.setIcon(blackIcon);
                    else q2x2y3Lbl.setIcon(whiteIcon);
                }
            });
            q2x3y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x3y3Lbl.getIcon() == whiteIcon) q2x3y3Lbl.setIcon(blackIcon);
                    else q2x3y3Lbl.setIcon(whiteIcon);
                }
            });
            q2x4y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x4y3Lbl.getIcon() == whiteIcon) q2x4y3Lbl.setIcon(blackIcon);
                    else q2x4y3Lbl.setIcon(whiteIcon);
                }
            });
            q2x1y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x1y4Lbl.getIcon() == whiteIcon) q2x1y4Lbl.setIcon(blackIcon);
                    else q2x1y4Lbl.setIcon(whiteIcon);
                }
            });
            q2x2y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x2y4Lbl.getIcon() == whiteIcon) q2x2y4Lbl.setIcon(blackIcon);
                    else q2x2y4Lbl.setIcon(whiteIcon);
                }
            });
            q2x3y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x3y4Lbl.getIcon() == whiteIcon) q2x3y4Lbl.setIcon(blackIcon);
                    else q2x3y4Lbl.setIcon(whiteIcon);
                }
            });
            q2x4y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q2x4y4Lbl.getIcon() == whiteIcon) q2x4y4Lbl.setIcon(blackIcon);
                    else q2x4y4Lbl.setIcon(whiteIcon);
                }
            });
            // Quadrant 3
            q3x1y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x1y1Lbl.getIcon() == whiteIcon) q3x1y1Lbl.setIcon(blackIcon);
                    else q3x1y1Lbl.setIcon(whiteIcon);
                }
            });
            q3x2y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x2y1Lbl.getIcon() == whiteIcon) q3x2y1Lbl.setIcon(blackIcon);
                    else q3x2y1Lbl.setIcon(whiteIcon);
                }
            });
            q3x3y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x3y1Lbl.getIcon() == whiteIcon) q3x3y1Lbl.setIcon(blackIcon);
                    else q3x3y1Lbl.setIcon(whiteIcon);
                }
            });
            q3x4y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x4y1Lbl.getIcon() == whiteIcon) q3x4y1Lbl.setIcon(blackIcon);
                    else q3x4y1Lbl.setIcon(whiteIcon);
                }
            });
            q3x1y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x1y2Lbl.getIcon() == whiteIcon) q3x1y2Lbl.setIcon(blackIcon);
                    else q3x1y2Lbl.setIcon(whiteIcon);
                }
            });
            q3x2y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x2y2Lbl.getIcon() == whiteIcon) q3x2y2Lbl.setIcon(blackIcon);
                    else q3x2y2Lbl.setIcon(whiteIcon);
                }
            });
            q3x3y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x3y2Lbl.getIcon() == whiteIcon) q3x3y2Lbl.setIcon(blackIcon);
                    else q3x3y2Lbl.setIcon(whiteIcon);
                }
            });
            q3x4y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x4y2Lbl.getIcon() == whiteIcon) q3x4y2Lbl.setIcon(blackIcon);
                    else q3x4y2Lbl.setIcon(whiteIcon);
                }
            });
            q3x1y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x1y3Lbl.getIcon() == whiteIcon) q3x1y3Lbl.setIcon(blackIcon);
                    else q3x1y3Lbl.setIcon(whiteIcon);
                }
            });
            q3x2y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x2y3Lbl.getIcon() == whiteIcon) q3x2y3Lbl.setIcon(blackIcon);
                    else q3x2y3Lbl.setIcon(whiteIcon);
                }
            });
            q3x3y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x3y3Lbl.getIcon() == whiteIcon) q3x3y3Lbl.setIcon(blackIcon);
                    else q3x3y3Lbl.setIcon(whiteIcon);
                }
            });
            q3x4y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x4y3Lbl.getIcon() == whiteIcon) q3x4y3Lbl.setIcon(blackIcon);
                    else q3x4y3Lbl.setIcon(whiteIcon);
                }
            });
            q3x1y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x1y4Lbl.getIcon() == whiteIcon) q3x1y4Lbl.setIcon(blackIcon);
                    else q3x1y4Lbl.setIcon(whiteIcon);
                }
            });
            q3x2y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x2y4Lbl.getIcon() == whiteIcon) q3x2y4Lbl.setIcon(blackIcon);
                    else q3x2y4Lbl.setIcon(whiteIcon);
                }
            });
            q3x3y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x3y4Lbl.getIcon() == whiteIcon) q3x3y4Lbl.setIcon(blackIcon);
                    else q3x3y4Lbl.setIcon(whiteIcon);
                }
            });
            q3x4y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q3x4y4Lbl.getIcon() == whiteIcon) q3x4y4Lbl.setIcon(blackIcon);
                    else q3x4y4Lbl.setIcon(whiteIcon);
                }
            });
            // Quadrant 4
            q4x1y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x1y1Lbl.getIcon() == whiteIcon) q4x1y1Lbl.setIcon(blackIcon);
                    else q4x1y1Lbl.setIcon(whiteIcon);
                }
            });
            q4x2y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x2y1Lbl.getIcon() == whiteIcon) q4x2y1Lbl.setIcon(blackIcon);
                    else q4x2y1Lbl.setIcon(whiteIcon);
                }
            });
            q4x3y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x3y1Lbl.getIcon() == whiteIcon) q4x3y1Lbl.setIcon(blackIcon);
                    else q4x3y1Lbl.setIcon(whiteIcon);
                }
            });
            q4x4y1Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x4y1Lbl.getIcon() == whiteIcon) q4x4y1Lbl.setIcon(blackIcon);
                    else q4x4y1Lbl.setIcon(whiteIcon);
                }
            });
            q4x1y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x1y2Lbl.getIcon() == whiteIcon) q4x1y2Lbl.setIcon(blackIcon);
                    else q4x1y2Lbl.setIcon(whiteIcon);
                }
            });
            q4x2y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x2y2Lbl.getIcon() == whiteIcon) q4x2y2Lbl.setIcon(blackIcon);
                    else q4x2y2Lbl.setIcon(whiteIcon);
                }
            });
            q4x3y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x3y2Lbl.getIcon() == whiteIcon) q4x3y2Lbl.setIcon(blackIcon);
                    else q4x3y2Lbl.setIcon(whiteIcon);
                }
            });
            q4x4y2Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x4y2Lbl.getIcon() == whiteIcon) q4x4y2Lbl.setIcon(blackIcon);
                    else q4x4y2Lbl.setIcon(whiteIcon);
                }
            });
            q4x1y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x1y3Lbl.getIcon() == whiteIcon) q4x1y3Lbl.setIcon(blackIcon);
                    else q4x1y3Lbl.setIcon(whiteIcon);
                }
            });
            q4x2y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x2y3Lbl.getIcon() == whiteIcon) q4x2y3Lbl.setIcon(blackIcon);
                    else q4x2y3Lbl.setIcon(whiteIcon);
                }
            });
            q4x3y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x3y3Lbl.getIcon() == whiteIcon) q4x3y3Lbl.setIcon(blackIcon);
                    else q4x3y3Lbl.setIcon(whiteIcon);
                }
            });
            q4x4y3Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x4y3Lbl.getIcon() == whiteIcon) q4x4y3Lbl.setIcon(blackIcon);
                    else q4x4y3Lbl.setIcon(whiteIcon);
                }
            });
            q4x1y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x1y4Lbl.getIcon() == whiteIcon) q4x1y4Lbl.setIcon(blackIcon);
                    else q4x1y4Lbl.setIcon(whiteIcon);
                }
            });
            q4x2y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x2y4Lbl.getIcon() == whiteIcon) q4x2y4Lbl.setIcon(blackIcon);
                    else q4x2y4Lbl.setIcon(whiteIcon);
                }
            });
            q4x3y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x3y4Lbl.getIcon() == whiteIcon) q4x3y4Lbl.setIcon(blackIcon);
                    else q4x3y4Lbl.setIcon(whiteIcon);
                }
            });
            q4x4y4Lbl.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (q4x4y4Lbl.getIcon() == whiteIcon) q4x4y4Lbl.setIcon(blackIcon);
                    else q4x4y4Lbl.setIcon(whiteIcon);
                }
            });
        }
    }
    private static int count (boolean[][] array, boolean val) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == val) {
                    count++;
                }
            }
        }
        return count;
    }
    private static int count (boolean[] array, boolean val) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                count++;
            }
        }
        return count;
    }
    private static int getSmallest(int[] a){
        // Code from JavaTPoint
        // (yeah, apparently I can't even do small code like this)
        Arrays.sort(a);
        return a[0];
    }
    private static int colRow(boolean[][] grid) {
        // Manually converted from original code
        int output = -1;
        boolean skip = false;
        // Columns
        for (int x = 0; x < 8; x++) {
            boolean isWhite = grid[x][0];
            for (int y = 1; y < 8; y++)
                if (grid[x][y] != isWhite) {
                    skip = true;
                    break;
                }
             if (output != -1 && !skip) return -1;
             if (!skip) output = x;
        }
        skip = false;
        // Rows
        for (int y = 0; y < 8; y++) {
            boolean isWhite = grid[0][y];
            for (int x = 1; x < 8; x++)
                if (grid[x][y] != isWhite) {
                    skip = true;
                    break;
                }
            if (output != -1 && !skip) return -1;
            if (!skip) output = y;
        }
        return output;
    }
    private static int findSquare(boolean[][] grid) {
        // Mostly from original code
        boolean skip = false;
        int output = -1;
        for (int y = 0; y <= 5; y++)
            for (int x = 0; x <= 5; x++) {
                boolean same = grid[x][y];
                label:
                for (int xx = 0; xx < 3; xx++)
                    for (int yy = 0; yy < 3; yy++)
                        if (grid[x + xx][y + yy] != same) {
                            skip = true;
                            break label;
                        }
                if (!skip) output = x + 1;
            }
        return output;
    }
}
