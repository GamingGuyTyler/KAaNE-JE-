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
        ImageIcon icon = new ImageIcon("imgs/icon/Bitmaps.png");
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
        button.setBounds(55,180,60,20);
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
        f.add(button);
        // Define JFrame
        f.setLayout(null);
        f.setSize(180,250);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Actual Logic

        // Label Image Changing
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
