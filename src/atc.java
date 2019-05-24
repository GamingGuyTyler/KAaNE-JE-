/**
 * Air Traffic Controller module, Started work on 02/11/19 08:57 PM
 *
 * Actually, properly started work on 05/23/2019 10:47 PM
 *
 * Finished version 0.1 on 05/24/2019 12:50 AM
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import org.jdesktop.swingx.autocomplete.*;

public class atc {
    static JFrame f;
    static String org1col = "red";
    static String org2col = "red";
    static String org3col = "red";
    static String des1col = "red";
    static String des2col = "red";
    static String des3col = "red";
    public static void module() {
        System.out.println("[ATC]");
        f = new JFrame("KAaNE [ATC]");
        ImageIcon icon = new ImageIcon("imgs/icons/Air Traffic Controller.png");
        f.setIconImage(icon.getImage());
        // The long list of airports
        String[] ports = {"ATL","LAX","ORD","DFW","DEN",
                        "JFK","SFO","LAS","SEA","CLT",
                        "EWR","MCO","PHX","MIA","IAH",
                        "BOS","MSP","DTW","FLL","PHL",
                        "LGA","BWI","SLC","DCA","IAD",
                        "SAN","MDW","TPA","HNL","PDX"};
        // ORIGIN CBs
        JComboBox org1CB = new JComboBox(ports);
        JComboBox org2CB = new JComboBox(ports);
        JComboBox org3CB = new JComboBox(ports);
        org1CB.setBounds(20,5,100,20);
        org2CB.setBounds(20,30,100,20);
        org3CB.setBounds(20,55,100,20);
        // DESTINATION CBs
        JComboBox des1CB = new JComboBox(ports);
        JComboBox des2CB = new JComboBox(ports);
        JComboBox des3CB = new JComboBox(ports);
        des1CB.setBounds(177,5,100,20);
        des2CB.setBounds(177,30,100,20);
        des3CB.setBounds(177,55,100,20);
        // Aligned colors
        ImageIcon red = new ImageIcon("imgs/atc/red.png");
        ImageIcon green = new ImageIcon("imgs/atc/green.png");
        ImageIcon blue = new ImageIcon("imgs/atc/blue.png");
        JLabel org1img = new JLabel(red);
        JLabel org2img = new JLabel(red);
        JLabel org3img = new JLabel(red);
        JLabel des1img = new JLabel(red);
        JLabel des2img = new JLabel(red);
        JLabel des3img = new JLabel(red);
        org1img.setBounds(5,10,10,10);
        org2img.setBounds(5,35,10,10);
        org3img.setBounds(5,60,10,10);
        des1img.setBounds(282,10,10,10);
        des2img.setBounds(282,35,10,10);
        des3img.setBounds(282,60,10,10);
        org1img.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        org2img.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        org3img.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        des1img.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        des2img.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        des3img.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // Planes
        ImageIcon planeLevel = new ImageIcon("imgs/atc/plane level.png");
        ImageIcon planeArr = new ImageIcon("imgs/atc/plane arr.png");
        ImageIcon planeDep = new ImageIcon("imgs/atc/plane dep.png");
        JLabel plane1img = new JLabel(planeLevel);
        JLabel plane2img = new JLabel(planeLevel);
        JLabel plane3img = new JLabel(planeLevel);
        plane1img.setBounds(125,5,47,22);
        plane2img.setBounds(125,30,47,22);
        plane3img.setBounds(125,55,47,22);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(115,80,70,20);
        // Output Text
        JLabel outputText = new JLabel("");
        outputText.setBounds(90,105,150,20);
        // AutoComplete decorate
        AutoCompleteDecorator.decorate(org1CB); AutoCompleteDecorator.decorate(des1CB);
        AutoCompleteDecorator.decorate(org2CB); AutoCompleteDecorator.decorate(des2CB);
        AutoCompleteDecorator.decorate(org3CB); AutoCompleteDecorator.decorate(des3CB);
        // Add everything
        f.add(org1CB); f.add(org2CB); f.add(org3CB);
        f.add(org1img); f.add(org2img); f.add(org3img);
        f.add(plane1img); f.add(plane2img); f.add(plane3img);
        f.add(des1CB); f.add(des2CB); f.add(des3CB);
        f.add(des1img); f.add(des2img); f.add(des3img);
        f.add(button); f.add(outputText);
        // Define JFrame
        f.setLayout(null);
        f.setSize(302,155);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Logic
        button.addActionListener((ActionEvent e) -> {
            // Print colors + ports
            System.out.println("ORG Col 1 = " + org1col + "    DES Col 1 = " + des1col);
            System.out.println("ORG Col 2 = " + org2col + "    DES Col 2 = " + des2col);
            System.out.println("ORG Col 3 = " + org3col + "    DES Col 3 = " + des3col);
            System.out.println("ORG Port 1 = " + org1CB.getItemAt(org1CB.getSelectedIndex()) + "   DES Port 1 = " + des1CB.getItemAt(des1CB.getSelectedIndex()));
            System.out.println("ORG Port 2 = " + org2CB.getItemAt(org2CB.getSelectedIndex()) + "   DES Port 2 = " + des2CB.getItemAt(des2CB.getSelectedIndex()));
            System.out.println("ORG Port 3 = " + org3CB.getItemAt(org3CB.getSelectedIndex()) + "   DES Port 3 = " + des3CB.getItemAt(des3CB.getSelectedIndex()));
            // ERROR CHECKING
            boolean noErrors = false;
            // If there's >2 usages of 1 color
            String[] colors = {org1col,org2col,org3col,des1col,des2col,des3col};
            boolean moreThanTwo = false;
            for (int j=0;j<colors.length;j++) {
                for (int k=j+1;k<colors.length;k++) {
                    for (int l=k+1;l<colors.length;l++) {
                        if (colors[k] == colors[j] && colors[k] == colors[l] && colors[j] == colors[l]) {
                            moreThanTwo = true;
                        }
                    }
                }
            }
            // Then shank them
            if (moreThanTwo) {
                outputText.setText(">2 usages of 1 color!");
                System.out.println(">2 usages of 1 color! Aborting...");
            }
            else {
                // Check for improper color usage
                boolean moreThanOne = false;
                String[] colorsORG = {org1col,org2col,org3col};
                for (int j=0;j<colorsORG.length;j++) {
                    for (int k=j+1;k<colorsORG.length;k++) {
                        if (colorsORG[k] == colorsORG[j]) {
                            moreThanOne = true;
                        }
                    }
                }
                String[] colorsDES = {des1col,des2col,des3col};
                for (int j=0;j<colorsDES.length;j++) {
                    for (int k=j+1;k<colorsDES.length;k++) {
                        if (colorsDES[k] == colorsDES[j]) {
                            moreThanOne = true;
                        }
                    }
                }
                if (moreThanOne) {
                    outputText.setText("Improper Color Usage!");
                    System.out.println("Improper Color Usage! Aborting...");
                }
                else {
                    // Check for duplicate ports
                    boolean dupePorts = false;
                    String[] portArray = {(String) org1CB.getItemAt(org1CB.getSelectedIndex()),(String) org2CB.getItemAt(org2CB.getSelectedIndex()),(String) org3CB.getItemAt(org3CB.getSelectedIndex()),
                            (String) des1CB.getItemAt(des1CB.getSelectedIndex()),(String) des2CB.getItemAt(des2CB.getSelectedIndex()),(String) des3CB.getItemAt(des3CB.getSelectedIndex())};
                    for (int j=0;j<portArray.length;j++) {
                        for (int k=j+1;k<portArray.length;k++) {
                            if (portArray[k] == portArray[j]) {
                                dupePorts = true;
                            }
                        }
                    }
                    if (dupePorts) {
                        outputText.setText("Duplicate Airports!");
                        System.out.println("Duplicate Airports! Aborting...");
                    }
                    else noErrors = true;
                }
            }
            if (noErrors) {
                // Print that there's no errors
                outputText.setText("");
                System.out.println("No errors detected.");
                // Let the logic begin
                // ATC grid (-1 = N/A (same), 1 = Level, 0 = DEP, 2 = ARR)
                int[][] grid = {
                        new int[]{ -1, 2, 0, 0, 2, 0, 1, 1, 1, 1, 0, 2, 0, 1, 1, 0, 1, 2, 0, 0, 1, 0, 1, 2, 1, 2, 2, 2, 1, 2 },
                        new int[]{ 1, -1, 2, 0, 1, 0, 2, 2, 2, 0, 0, 2, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 2, 1, 0, 1, 1, 2, 1 },
                        new int[]{ 0, 2, -1, 1, 1, 0, 2, 1, 2, 0, 1, 2, 2, 0, 1, 2, 1, 1, 2, 0, 2, 2, 0, 0, 0, 1, 1, 1, 1, 1 },
                        new int[]{ 1, 1, 1, -1, 1, 1, 2, 2, 0, 0, 1, 0, 0, 0, 1, 1, 2, 1, 0, 0, 2, 0, 0, 1, 2, 1, 0, 2, 0, 0 },
                        new int[]{ 0, 0, 1, 0, -1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 2, 1, 2, 2, 0, 2, 2, 0, 1, 0, 2, 2, 1, 1, 2 },
                        new int[]{ 2, 0, 2, 1, 2, -1, 1, 1, 2, 1, 0, 1, 1, 2, 2, 0, 1, 0, 1, 0, 2, 2, 1, 2, 2, 0, 0, 0, 1, 1 },
                        new int[]{ 2, 0, 0, 0, 0, 0, -1, 1, 1, 2, 0, 1, 0, 1, 2, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 0, 0, 2, 0, 0 },
                        new int[]{ 1, 0, 0, 2, 2, 1, 1, -1, 2, 0, 0, 1, 0, 2, 0, 0, 2, 2, 0, 2, 2, 1, 1, 2, 0, 1, 0, 2, 0, 1 },
                        new int[]{ 1, 2, 2, 0, 2, 2, 1, 1, -1, 2, 1, 1, 1, 1, 2, 0, 1, 1, 0, 1, 1, 0, 2, 2, 0, 2, 1, 1, 0, 1 },
                        new int[]{ 1, 1, 0, 2, 2, 2, 1, 0, 2, -1, 0, 1, 0, 2, 2, 2, 0, 1, 0, 2, 0, 1, 0, 1, 1, 2, 0, 0, 1, 1 },
                        new int[]{ 1, 1, 1, 2, 0, 2, 0, 0, 2, 0, -1, 2, 2, 1, 0, 2, 0, 2, 1, 2, 2, 2, 0, 0, 0, 1, 1, 1, 1, 1 },
                        new int[]{ 0, 0, 0, 2, 1, 1, 1, 1, 2, 0, 2, -1, 1, 1, 1, 1, 2, 1, 0, 0, 2, 0, 2, 1, 1, 2, 0, 2, 2, 0 },
                        new int[]{ 2, 0, 1, 1, 2, 1, 2, 0, 2, 2, 1, 0, -1, 0, 0, 0, 1, 2, 0, 0, 0, 0, 2, 1, 2, 0, 2, 1, 2, 2 },
                        new int[]{ 1, 0, 2, 2, 1, 2, 2, 0, 0, 2, 1, 1, 2, -1, 1, 1, 0, 2, 2, 0, 0, 0, 2, 2, 2, 1, 1, 1, 1, 0 },
                        new int[]{ 1, 0, 1, 0, 2, 2, 1, 0, 0, 2, 2, 1, 1, 1, -1, 1, 2, 1, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 2, 1 },
                        new int[]{ 2, 2, 1, 1, 1, 2, 1, 0, 1, 2, 2, 0, 2, 1, 2, -1, 0, 2, 1, 1, 0, 1, 1, 0, 2, 2, 0, 2, 0, 2 },
                        new int[]{ 2, 2, 1, 2, 2, 1, 1, 1, 2, 0, 1, 1, 2, 2, 1, 0, -1, 0, 1, 1, 0, 1, 0, 2, 1, 0, 2, 0, 2, 2 },
                        new int[]{ 1, 0, 1, 1, 2, 1, 1, 2, 0, 2, 0, 0, 2, 2, 0, 1, 1, -1, 0, 1, 0, 0, 2, 1, 0, 2, 0, 2, 0, 1 },
                        new int[]{ 1, 2, 1, 2, 2, 0, 0, 2, 1, 1, 2, 2, 0, 0, 1, 1, 2, 0, -1, 1, 2, 1, 0, 1, 1, 2, 0, 2, 1, 2 },
                        new int[]{ 1, 1, 2, 0, 1, 2, 1, 0, 2, 0, 2, 1, 0, 2, 2, 0, 0, 1, 0, -1, 2, 2, 2, 1, 2, 1, 0, 1, 0, 0 },
                        new int[]{ 1, 0, 0, 2, 0, 1, 2, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, -1, 1, 1, 2, 0, 1, 2, 1, 2, 0 },
                        new int[]{ 1, 0, 2, 0, 0, 1, 1, 2, 0, 0, 2, 1, 1, 0, 0, 2, 0, 0, 2, 0, 2, -1, 0, 1, 2, 0, 1, 1, 0, 0 },
                        new int[]{ 1, 1, 0, 0, 2, 1, 2, 0, 1, 2, 1, 0, 1, 1, 0, 2, 0, 0, 0, 2, 1, 2, -1, 1, 1, 2, 0, 2, 0, 0 },
                        new int[]{ 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 2, 1, 1, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, -1, 0, 2, 2, 1, 2, 1 },
                        new int[]{ 1, 2, 2, 2, 1, 2, 0, 1, 1, 2, 0, 2, 0, 0, 1, 1, 2, 0, 2, 2, 1, 1, 0, 1, -1, 1, 2, 0, 0, 2 },
                        new int[]{ 0, 2, 2, 0, 1, 2, 1, 2, 2, 2, 0, 0, 1, 1, 0, 1, 0, 2, 1, 0, 2, 0, 0, 0, 2, -1, 2, 0, 1, 2 },
                        new int[]{ 0, 1, 2, 1, 0, 2, 1, 0, 2, 2, 0, 2, 1, 2, 0, 1, 1, 1, 1, 2, 2, 0, 2, 1, 1, 2, -1, 2, 2, 2 },
                        new int[]{ 0, 2, 1, 0, 0, 0, 1, 1, 0, 2, 0, 2, 2, 0, 0, 2, 2, 0, 1, 1, 2, 0, 0, 0, 1, 1, 0, -1, 1, 1 },
                        new int[]{ 1, 1, 1, 1, 2, 1, 2, 0, 0, 0, 2, 1, 2, 2, 1, 2, 0, 2, 2, 1, 1, 2, 0, 2, 0, 1, 0, 2, -1, 0 },
                        new int[]{ 0, 1, 2, 0, 1, 2, 1, 1, 0, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 0, 1, 1, 1, 2, 2, 2, 1, -1 }
                };
                // PLANE 1
                // Find matching color's index
                int matchIndex = 0;
                if (org1col == des1col) matchIndex = des1CB.getSelectedIndex();
                if (org1col == des2col) matchIndex = des2CB.getSelectedIndex();
                if (org1col == des3col) matchIndex = des3CB.getSelectedIndex();
                // Grab the number from the grid
                int state = grid[org1CB.getSelectedIndex()][matchIndex];
                // Print/Output
                System.out.println("Plane 1 State = " + state);
                switch(state) {
                    case 0: plane1img.setIcon(planeDep); break;
                    case 1: plane1img.setIcon(planeLevel); break;
                    case 2: plane1img.setIcon(planeArr); break;
                }
                // PLANE 2
                // Find matching color's index
                matchIndex = 0;
                if (org2col == des1col) matchIndex = des1CB.getSelectedIndex();
                if (org2col == des2col) matchIndex = des2CB.getSelectedIndex();
                if (org2col == des3col) matchIndex = des3CB.getSelectedIndex();
                // Grab the number from the grid
                state = grid[org2CB.getSelectedIndex()][matchIndex];
                // Print/Output
                System.out.println("Plane 2 State = " + state);
                switch(state) {
                    case 0: plane2img.setIcon(planeDep); break;
                    case 1: plane2img.setIcon(planeLevel); break;
                    case 2: plane2img.setIcon(planeArr); break;
                }
                // PLANE 3
                // Find matching color's index
                matchIndex = 0;
                if (org3col == des1col) matchIndex = des1CB.getSelectedIndex();
                if (org3col == des2col) matchIndex = des2CB.getSelectedIndex();
                if (org3col == des3col) matchIndex = des3CB.getSelectedIndex();
                // Grab the number from the grid
                state = grid[org3CB.getSelectedIndex()][matchIndex];
                // Print/Output
                System.out.println("Plane 3 State = " + state);
                switch(state) {
                    case 0: plane3img.setIcon(planeDep); break;
                    case 1: plane3img.setIcon(planeLevel); break;
                    case 2: plane3img.setIcon(planeArr); break;
                }
            }
        });
        // Image Changing
        org1img.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                switch (org1col) {
                    case "red": org1img.setIcon(green); org1col = "green"; break;
                    case "green": org1img.setIcon(blue); org1col = "blue"; break;
                    case "blue": org1img.setIcon(red); org1col = "red"; break;
                }
            }
        });
        org2img.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                switch (org2col) {
                    case "red": org2img.setIcon(green); org2col = "green"; break;
                    case "green": org2img.setIcon(blue); org2col = "blue"; break;
                    case "blue": org2img.setIcon(red); org2col = "red"; break;
                }
            }
        });
        org3img.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                switch (org3col) {
                    case "red": org3img.setIcon(green); org3col = "green"; break;
                    case "green": org3img.setIcon(blue); org3col = "blue"; break;
                    case "blue": org3img.setIcon(red); org3col = "red"; break;
                }
            }
        });
        des1img.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                switch (des1col) {
                    case "red": des1img.setIcon(green); des1col = "green"; break;
                    case "green": des1img.setIcon(blue); des1col = "blue"; break;
                    case "blue": des1img.setIcon(red); des1col = "red"; break;
                }
            }
        });
        des2img.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                switch (des2col) {
                    case "red": des2img.setIcon(green); des2col = "green"; break;
                    case "green": des2img.setIcon(blue); des2col = "blue"; break;
                    case "blue": des2img.setIcon(red); des2col = "red"; break;
                }
            }
        });
        des3img.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                switch (des3col) {
                    case "red": des3img.setIcon(green); des3col = "green"; break;
                    case "green": des3img.setIcon(blue); des3col = "blue"; break;
                    case "blue": des3img.setIcon(red); des3col = "red"; break;
                }
            }
        });
    }
}
