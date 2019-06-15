/**
 * Blind Maze
 *
 * Started work on 6/14/2019 11:02 PM
 *
 * Finished version 0.1 on 6/15/2019 1:47 AM
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;
import org.jdesktop.swingx.autocomplete.*;
import be.pcl.swing.ImprovedFormattedTextField;

public class blindMaze {
    static JFrame f;
    public static void module() {
        System.out.println("[BLIND MAZE]");
        f = new JFrame("KAaNE [BLIND MAZE]");
        ImageIcon icon = new ImageIcon("imgs/icons/Blind Maze.png");
        f.setIconImage(icon.getImage());
        // Edgework
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        // CB
        String[] colorArr = {"Red","Green","Blue","Gray","Yellow"};
        JComboBox northCB = new JComboBox(colorArr);
        northCB.setBounds(70,5,60,20);
        AutoCompleteDecorator.decorate(northCB);
        JComboBox westCB = new JComboBox(colorArr);
        westCB.setBounds(5,30,60,20);
        AutoCompleteDecorator.decorate(westCB);
        JComboBox eastCB = new JComboBox(colorArr);
        eastCB.setBounds(135,30,60,20);
        AutoCompleteDecorator.decorate(eastCB);
        JComboBox southCB = new JComboBox(colorArr);
        southCB.setBounds(70,55,60,20);
        AutoCompleteDecorator.decorate(southCB);
        // TB
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField solvedModulesTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        solvedModulesTB.setBounds(5,80,50,20);
        ImprovedFormattedTextField mazeModulesTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        mazeModulesTB.setBounds(5,105,50,20);
        // Label
        JLabel solvedModulesLabel = new JLabel("Solved Modules");
        solvedModulesLabel.setBounds(60,80,100,20);
        JLabel mazeModulesLabel = new JLabel("Maze Modules");
        mazeModulesLabel.setBounds(60,105,100,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(220,105,60,20);
        // The many, many, icons.
        ImageIcon maze0 = new ImageIcon("imgs/blindMaze/maze0.png");
        ImageIcon maze1 = new ImageIcon("imgs/blindMaze/maze1.png");
        ImageIcon maze2 = new ImageIcon("imgs/blindMaze/maze2.png");
        ImageIcon maze3 = new ImageIcon("imgs/blindMaze/maze3.png");
        ImageIcon maze4 = new ImageIcon("imgs/blindMaze/maze4.png");
        ImageIcon maze5 = new ImageIcon("imgs/blindMaze/maze5.png");
        ImageIcon maze6 = new ImageIcon("imgs/blindMaze/maze6.png");
        ImageIcon maze7 = new ImageIcon("imgs/blindMaze/maze7.png");
        ImageIcon maze8 = new ImageIcon("imgs/blindMaze/maze8.png");
        ImageIcon maze9 = new ImageIcon("imgs/blindMaze/maze9.png");
        ImageIcon maze0r90c = new ImageIcon("imgs/blindMaze/maze0-90c.png");
        ImageIcon maze1r90c = new ImageIcon("imgs/blindMaze/maze1-90c.png");
        ImageIcon maze2r90c = new ImageIcon("imgs/blindMaze/maze2-90c.png");
        ImageIcon maze3r90c = new ImageIcon("imgs/blindMaze/maze3-90c.png");
        ImageIcon maze4r90c = new ImageIcon("imgs/blindMaze/maze4-90c.png");
        ImageIcon maze5r90c = new ImageIcon("imgs/blindMaze/maze5-90c.png");
        ImageIcon maze6r90c = new ImageIcon("imgs/blindMaze/maze6-90c.png");
        ImageIcon maze7r90c = new ImageIcon("imgs/blindMaze/maze7-90c.png");
        ImageIcon maze8r90c = new ImageIcon("imgs/blindMaze/maze8-90c.png");
        ImageIcon maze9r90c = new ImageIcon("imgs/blindMaze/maze9-90c.png");
        ImageIcon maze0r180 = new ImageIcon("imgs/blindMaze/maze0-180.png");
        ImageIcon maze1r180 = new ImageIcon("imgs/blindMaze/maze1-180.png");
        ImageIcon maze2r180 = new ImageIcon("imgs/blindMaze/maze2-180.png");
        ImageIcon maze3r180 = new ImageIcon("imgs/blindMaze/maze3-180.png");
        ImageIcon maze4r180 = new ImageIcon("imgs/blindMaze/maze4-180.png");
        ImageIcon maze5r180 = new ImageIcon("imgs/blindMaze/maze5-180.png");
        ImageIcon maze6r180 = new ImageIcon("imgs/blindMaze/maze6-180.png");
        ImageIcon maze7r180 = new ImageIcon("imgs/blindMaze/maze7-180.png");
        ImageIcon maze8r180 = new ImageIcon("imgs/blindMaze/maze8-180.png");
        ImageIcon maze9r180 = new ImageIcon("imgs/blindMaze/maze9-180.png");
        ImageIcon maze0r90cc = new ImageIcon("imgs/blindMaze/maze0-90cc.png");
        ImageIcon maze1r90cc = new ImageIcon("imgs/blindMaze/maze1-90cc.png");
        ImageIcon maze2r90cc = new ImageIcon("imgs/blindMaze/maze2-90cc.png");
        ImageIcon maze3r90cc = new ImageIcon("imgs/blindMaze/maze3-90cc.png");
        ImageIcon maze4r90cc = new ImageIcon("imgs/blindMaze/maze4-90cc.png");
        ImageIcon maze5r90cc = new ImageIcon("imgs/blindMaze/maze5-90cc.png");
        ImageIcon maze6r90cc = new ImageIcon("imgs/blindMaze/maze6-90cc.png");
        ImageIcon maze7r90cc = new ImageIcon("imgs/blindMaze/maze7-90cc.png");
        ImageIcon maze8r90cc = new ImageIcon("imgs/blindMaze/maze8-90cc.png");
        ImageIcon maze9r90cc = new ImageIcon("imgs/blindMaze/maze9-90cc.png");
        ImageIcon startIndicator = new ImageIcon("imgs/blindMaze/start-indicator.png");
        // Output
        JLabel output = new JLabel(maze0);
        output.setBounds(5,130,127,127);
        JLabel outputStart = new JLabel(startIndicator);
        // Add
        f.add(northCB); f.add(southCB);
        f.add(westCB); f.add(eastCB);
        f.add(solvedModulesTB); f.add(solvedModulesLabel);
        f.add(mazeModulesTB); f.add(mazeModulesLabel);
        f.add(button); f.add(output); f.add(outputStart);
        // Define JFrame
        f.setLayout(null);
        f.setSize(290,160);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Logic
        button.addActionListener((ActionEvent e) -> {
            // Maze #
            int snLastDig = Integer.parseInt(props.getProperty("snLastDig"));
            int solvedModules = Integer.parseInt(solvedModulesTB.getText());
            int maze = (snLastDig + solvedModules) % 10;
            System.out.println("Maze #" + maze);
            // Initial Variables
            String[] rotations = {"0","90c","180","90cc"};
            String rotation = rotations[0];
            int[] startLoc = {0,0};
            String north = (String) northCB.getItemAt(northCB.getSelectedIndex());
            String west = (String) westCB.getItemAt(westCB.getSelectedIndex());
            String east = (String) eastCB.getItemAt(eastCB.getSelectedIndex());
            String south = (String) southCB.getItemAt(southCB.getSelectedIndex());
            String[] colors = {north,east,west,south};
            // Needed Edgework
            int totalBats = Integer.parseInt(props.getProperty("batteriesTotal"));
            int ind = Integer.parseInt(props.getProperty("ind"));
            int mazeModules = Integer.parseInt(mazeModulesTB.getText());
            int portTypes = Integer.parseInt(props.getProperty("totalPortTypes"));
            // Rotation
            if (count(colors,"Red") >= 2) {
                rotation = rotations[1];
                startLoc = calcStartLoc(colors);
            }
            else if (totalBats >= 5) {
                startLoc = calcStartLoc(colors);
                System.out.println("Before Rotation Location - " + startLoc[0] + ", " + startLoc[1]);
                rotation = rotations[1];
                startLoc = rotateStartLoc(startLoc,rotation);
            }
            else if (ind == 1) {
                rotation = rotations[2];
                startLoc = calcStartLoc(colors);
            }
            else if ((count(colors,"Yellow") == 0) && (count(colors,"Red") >= 1)) {
                rotation = rotations[3];
                startLoc = calcStartLoc(colors);
            }
            else if (mazeModules >= 1) {
                startLoc = calcStartLoc(colors);
                System.out.println("Before Rotation Location - " + startLoc[0] + ", " + startLoc[1]);
                rotation = rotations[2];
                startLoc = rotateStartLoc(startLoc,rotation);
            }
            else if (portTypes <= 1) {
                startLoc = calcStartLoc(colors);
                System.out.println("Before Rotation Location - " + startLoc[0] + ", " + startLoc[1]);
                rotation = rotations[3];
                startLoc = rotateStartLoc(startLoc,rotation);
            }
            else {
                startLoc = calcStartLoc(colors);
            }
            System.out.println("Rotation - " + rotation);
            System.out.println("Starting Location - " + startLoc[0] + ", " + startLoc[1]);
            // Output
            // Map + Rotation
            if (rotation.equals("0")) {
                switch (maze) {
                    case 0: output.setIcon(maze0); break;
                    case 1: output.setIcon(maze1); break;
                    case 2: output.setIcon(maze2); break;
                    case 3: output.setIcon(maze3); break;
                    case 4: output.setIcon(maze4); break;
                    case 5: output.setIcon(maze5); break;
                    case 6: output.setIcon(maze6); break;
                    case 7: output.setIcon(maze7); break;
                    case 8: output.setIcon(maze8); break;
                    case 9: output.setIcon(maze9); break;
                }
            }
            if (rotation.equals("90c")) {
                switch (maze) {
                    case 0: output.setIcon(maze0r90c); break;
                    case 1: output.setIcon(maze1r90c); break;
                    case 2: output.setIcon(maze2r90c); break;
                    case 3: output.setIcon(maze3r90c); break;
                    case 4: output.setIcon(maze4r90c); break;
                    case 5: output.setIcon(maze5r90c); break;
                    case 6: output.setIcon(maze6r90c); break;
                    case 7: output.setIcon(maze7r90c); break;
                    case 8: output.setIcon(maze8r90c); break;
                    case 9: output.setIcon(maze9r90c); break;
                }
            }
            if (rotation.equals("180")) {
                switch (maze) {
                    case 0: output.setIcon(maze0r180); break;
                    case 1: output.setIcon(maze1r180); break;
                    case 2: output.setIcon(maze2r180); break;
                    case 3: output.setIcon(maze3r180); break;
                    case 4: output.setIcon(maze4r180); break;
                    case 5: output.setIcon(maze5r180); break;
                    case 6: output.setIcon(maze6r180); break;
                    case 7: output.setIcon(maze7r180); break;
                    case 8: output.setIcon(maze8r180); break;
                    case 9: output.setIcon(maze9r180); break;
                }
            }
            if (rotation.equals("90cc")) {
                switch (maze) {
                    case 0: output.setIcon(maze0r90cc); break;
                    case 1: output.setIcon(maze1r90cc); break;
                    case 2: output.setIcon(maze2r90cc); break;
                    case 3: output.setIcon(maze3r90cc); break;
                    case 4: output.setIcon(maze4r90cc); break;
                    case 5: output.setIcon(maze5r90cc); break;
                    case 6: output.setIcon(maze6r90cc); break;
                    case 7: output.setIcon(maze7r90cc); break;
                    case 8: output.setIcon(maze8r90cc); break;
                    case 9: output.setIcon(maze9r90cc); break;
                }
            }
            // Starting Location
            int x = 0;
            switch (startLoc[0]) {
                case 1: x = 10; break;
                case 2: x = 35; break;
                case 3: x = 60; break;
                case 4: x = 85; break;
                case 5: x = 110; break;
            }
            int y = 0;
            switch (startLoc[1]) {
                case 1: y = 135; break;
                case 2: y = 160; break;
                case 3: y = 185; break;
                case 4: y = 210; break;
                case 5: y = 235; break;
            }
            outputStart.setBounds(x,y,17,17);
            f.setSize(290,290);
        });
    }
    private static int[] calcStartLoc (String[] colors) {
        int[] output = {1,1};
        int[][] valueGrid = {
               //R G B g y
                {1,5,2,2,3}, // North
                {3,1,5,5,2}, // East
                {2,5,3,1,4}, // West
                {3,2,4,3,2}, // South
        };
        // Calculate Values
        int north = 0;
        int east = 0;
        int west = 0;
        int south = 0;
        for (int index = 0; index < colors.length; index++) {
            String curr = colors[index];
            int currVal = 0;
            switch (curr) {
                case "Red": currVal = valueGrid[index][0]; break;
                case "Green": currVal = valueGrid[index][1]; break;
                case "Blue": currVal = valueGrid[index][2]; break;
                case "Gray": currVal = valueGrid[index][3]; break;
                case "Yellow": currVal = valueGrid[index][4]; break;
            }
            switch (index) {
                case 0: north = currVal; break;
                case 1: east = currVal; break;
                case 2: west = currVal; break;
                case 3: south = currVal; break;
            }
        }
        // Get positions
        output[0] = (north + south > 5) ? (north + south) % 5 : north + south;
        output[1] = (east + west > 5) ? (east + west) % 5 : east + west;
        return output;
    }
    private static int[] rotateStartLoc (int[] startLoc, String rotation) {
        if (rotation.equals("90c")) {
            // x = -y (5 = 1, 4 = 2, etc)
            // y = x
            int temp = startLoc[0];
            startLoc[0] = (startLoc[1] == 5) ? 1 : (startLoc[1] == 4) ? 2 : (startLoc[1] == 2) ? 4 : (startLoc[1] == 1) ? 5 : 3;
            startLoc[1] = temp;
        }
        if (rotation.equals("180")) {
            // x = -x
            // y = -y
            startLoc[0] = (startLoc[0] == 5) ? 1 : (startLoc[0] == 4) ? 2 : (startLoc[0] == 2) ? 4 : (startLoc[0] == 1) ? 5 : 3;
            startLoc[1] = (startLoc[1] == 5) ? 1 : (startLoc[1] == 4) ? 2 : (startLoc[1] == 2) ? 4 : (startLoc[1] == 1) ? 5 : 3;
        }
        if (rotation.equals("90cc")) {
            // x = y
            // y = -x
            int temp = startLoc[0];
            startLoc[0] = startLoc[1];
            startLoc[1] = (temp == 5) ? 1 : (temp == 4) ? 2 : (temp == 2) ? 4 : (temp == 1) ? 5 : 3;
        }
        return startLoc;
    }
    private static int count (String[] array, String val) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(val)) {
                count++;
            }
        }
        return count;
    }
}