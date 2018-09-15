/**
 * Anagrams, started work on 7/29/2018 8:38 PM
 * 
 * Finished version 0.1 on 7/29/2018 8:51 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.text.*;

public class anagrams {
    static JFrame f;
    public static void module() {
        f = new JFrame("KAaNE [ANAGRAMS]");
        System.out.println("[ANAGRAMS]");
        ImageIcon icon = new ImageIcon("imgs/icons/anagrams.png");
        f.setIconImage(icon.getImage());
        // TB
        JTextField tb = new JTextField();
        tb.setDocument(new JTextFieldLimit(6));
        tb.setBounds(10,10,60,20);
        DocumentFilter filter = new alphabet.DocumentSizeAndUppercaseFilter(7);
        AbstractDocument tbd = (AbstractDocument) tb.getDocument();
        tbd.setDocumentFilter(filter);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(12,30,55,20);
        // Output Label
        JLabel output = new JLabel();
        output.setBounds(80,20,180,20);
        // Add everything
        f.add(tb); f.add(button); f.add(output);
        // Define the JFrame
        f.setLayout(null);
        f.setSize(300,100);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            String text = tb.getText();
            switch (text) {
                case "STREAM": case "MASTER": case "TAMERS":
                    output.setText("STREAM, MASTER, TAMERS"); break;
                case "LOOPED": case "POODLE": case "POOLED":
                    output.setText("LOOPED, POODLE, POOLED"); break;
                case "CELLAR": case "CALLER": case "RECALL":
                    output.setText("CELLAR, CALLER, RECALL"); break;
                case "SEATED": case "SEDATE": case "TEASED":
                    output.setText("SEATED, SEDATE, TEASED"); break;
                case "RESCUE": case "SECURE": case "RECUSE":
                    output.setText("RESCUE, SECURE, RECUSE"); break;
                case "RASHES": case "SHEARS": case "SHARES":
                    output.setText("RASHES, SHEARS, SHARES"); break;
                case "BARELY": case "BARLEY": case "BLEARY":
                    output.setText("BARELY, BARLEY, BLEARY"); break;
                default:
                    output.setText("DUSTER, RUSTED, RUDEST"); break;
            }
        });
    }
}
