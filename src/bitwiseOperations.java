/**
 * Bitwise Operations
 *
 * Started work at 6/13/2019 3:49 PM
 *
 * Finished ver 0.1 on 6:16 PM
 *
 * Version 0.1
 */

import be.pcl.swing.ImprovedFormattedTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;
import java.awt.*;

public class bitwiseOperations {
    static JFrame f;
    public static void module() {
        System.out.println("[BITWISE OPERATIONS]");
        f = new JFrame("KAaNE [BITWISE OPERATIONS]");
        ImageIcon icon = new ImageIcon("imgs/icons/Bitwise Operations.png");
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
        String[] opsArr = {"AND","OR","XOR","NOT"};
        JComboBox opsCB = new JComboBox(opsArr);
        opsCB.setBounds(5,5,50,20);
        // TB
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField startTimeTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        startTimeTB.setBounds(5,30,50,20);
        // Label
        JLabel label = new JLabel("Starting Bomb Time (in mins)");
        label.setBounds(60,30,170,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(280,5,60,20);
        // Output Label
        JLabel output = new JLabel("");
        output.setBounds(282,30,60,20);
        // Add Everything
        f.add(opsCB); f.add(startTimeTB); f.add(label);
        f.add(button); f.add(output);
        // Define JFrame
        f.setLayout(null);
        f.setSize(350,100);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            // Byte calculation
            // Byte 1
            int[] byte1 = {0,0,0,0,0,0,0,0};
            int aaBats = Integer.parseInt(props.getProperty("batteriesAA"));
            byte1[0] = (aaBats == 0) ? 1 : 0;
            int parallel = Integer.parseInt(props.getProperty("parallel"));
            byte1[1] = parallel;
            int litNSA = Integer.parseInt(props.getProperty("nsaLit"));
            byte1[2] = litNSA;
            int modules = Integer.parseInt(props.getProperty("modules"));
            int startTime = Integer.parseInt(startTimeTB.getText());
            byte1[3] = (modules > startTime) ? 1 : 0;
            int litIndicators = Integer.parseInt(props.getProperty("totalIndsLit"));
            byte1[4] = (litIndicators > 1) ? 1 : 0;
            byte1[5] = (modules % 3 == 0) ? 1 : 0;
            int dBats = Integer.parseInt(props.getProperty("batteriesD"));
            byte1[6] = (dBats < 2) ? 1 : 0;
            int ports = Integer.parseInt(props.getProperty("totalPorts"));
            byte1[7] = (ports < 4) ? 1 : 0;
            StringBuilder byte1SB = new StringBuilder();
            for (int a : byte1) byte1SB.append(a);
            System.out.println("Byte 1: " + byte1SB.toString());
            // Byte 2
            int[] byte2 = {0,0,0,0,0,0,0,0};
            byte2[0] = (dBats >= 1) ? 1 : 0;
            byte2[1] = (ports >= 3) ? 1 : 0;
            int batHolds = Integer.parseInt(props.getProperty("batteryHolders"));
            byte2[2] = (batHolds >= 2) ? 1 : 0;
            int litBOB = Integer.parseInt(props.getProperty("bobLit"));
            byte2[3] = litBOB;
            int unlitIndicators = Integer.parseInt(props.getProperty("totalIndsUnlit"));
            byte2[4] = (unlitIndicators > 1) ? 1 : 0;
            int snLastDig = Integer.parseInt(props.getProperty("snLastDig"));
            byte2[5] = (snLastDig % 2 != 0) ? 1 : 0;
            byte2[6] = (modules % 2 == 0) ? 1 : 0;
            int totalBats = Integer.parseInt(props.getProperty("batteriesTotal"));
            byte2[7] = (totalBats >= 2) ? 1 : 0;
            StringBuilder byte2SB = new StringBuilder();
            for (int a : byte2) byte2SB.append(a);
            System.out.println("Byte 2: " + byte2SB.toString());
            // Bitwise Operation
            String operation = (String) opsCB.getItemAt(opsCB.getSelectedIndex());
            int[] outputArr = {0,0,0,0,0,0,0,0};
            if (operation.equals("AND")) {
                outputArr[0] = (byte1[0] == 1 && byte2[0] == 1) ? 1 : 0;
                outputArr[1] = (byte1[1] == 1 && byte2[1] == 1) ? 1 : 0;
                outputArr[2] = (byte1[2] == 1 && byte2[2] == 1) ? 1 : 0;
                outputArr[3] = (byte1[3] == 1 && byte2[3] == 1) ? 1 : 0;
                outputArr[4] = (byte1[4] == 1 && byte2[4] == 1) ? 1 : 0;
                outputArr[5] = (byte1[5] == 1 && byte2[5] == 1) ? 1 : 0;
                outputArr[6] = (byte1[6] == 1 && byte2[6] == 1) ? 1 : 0;
                outputArr[7] = (byte1[7] == 1 && byte2[7] == 1) ? 1 : 0;
            } else if (operation.equals("OR")) {
                outputArr[0] = (byte1[0] == 1 || byte2[0] == 1) ? 1 : 0;
                outputArr[1] = (byte1[1] == 1 || byte2[1] == 1) ? 1 : 0;
                outputArr[2] = (byte1[2] == 1 || byte2[2] == 1) ? 1 : 0;
                outputArr[3] = (byte1[3] == 1 || byte2[3] == 1) ? 1 : 0;
                outputArr[4] = (byte1[4] == 1 || byte2[4] == 1) ? 1 : 0;
                outputArr[5] = (byte1[5] == 1 || byte2[5] == 1) ? 1 : 0;
                outputArr[6] = (byte1[6] == 1 || byte2[6] == 1) ? 1 : 0;
                outputArr[7] = (byte1[7] == 1 || byte2[7] == 1) ? 1 : 0;
            } else if (operation.equals("XOR")) {
                outputArr[0] = ((byte1[0] != 1 && byte2[0] == 1) || (byte1[0] == 1 && byte2[0] != 1)) ? 1 : 0;
                outputArr[1] = ((byte1[1] != 1 && byte2[1] == 1) || (byte1[1] == 1 && byte2[1] != 1)) ? 1 : 0;
                outputArr[2] = ((byte1[2] != 1 && byte2[2] == 1) || (byte1[2] == 1 && byte2[2] != 1)) ? 1 : 0;
                outputArr[3] = ((byte1[3] != 1 && byte2[3] == 1) || (byte1[3] == 1 && byte2[3] != 1)) ? 1 : 0;
                outputArr[4] = ((byte1[4] != 1 && byte2[4] == 1) || (byte1[4] == 1 && byte2[4] != 1)) ? 1 : 0;
                outputArr[5] = ((byte1[5] != 1 && byte2[5] == 1) || (byte1[5] == 1 && byte2[5] != 1)) ? 1 : 0;
                outputArr[6] = ((byte1[6] != 1 && byte2[6] == 1) || (byte1[6] == 1 && byte2[6] != 1)) ? 1 : 0;
                outputArr[7] = ((byte1[7] != 1 && byte2[7] == 1) || (byte1[7] == 1 && byte2[7] != 1)) ? 1 : 0;
            } else if (operation.equals("NOT")) {
                outputArr[0] = byte1[0] == 1 ? 0 : 1;
                outputArr[1] = byte1[1] == 1 ? 0 : 1;
                outputArr[2] = byte1[2] == 1 ? 0 : 1;
                outputArr[3] = byte1[3] == 1 ? 0 : 1;
                outputArr[4] = byte1[4] == 1 ? 0 : 1;
                outputArr[5] = byte1[5] == 1 ? 0 : 1;
                outputArr[6] = byte1[6] == 1 ? 0 : 1;
                outputArr[7] = byte1[7] == 1 ? 0 : 1;
            }
            StringBuilder outputSB = new StringBuilder();
            for (int a : outputArr) outputSB.append(a);
            output.setText(outputSB.toString());
            System.out.println("Return Byte: " + outputSB.toString());
        });
    }
}
