/**
 * 101 Dalmatians module, started work on 11/15/18 8:28 PM
 * 
 * Finished version 0.1 on 9:00 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class dalmatians {
    static JFrame f;
    public static void module() {
        System.out.println("[101 DALMATIANS]");
        f = new JFrame("KAaNE [101 DALMATIANS]");
        ImageIcon icon = new ImageIcon("imgs/icons/101 Dalmatians.png");
        f.setIconImage(icon.getImage());
        // Make a basic image of list
        ImageIcon listImg = new ImageIcon("imgs/dalmatians/list.png");
        JLabel list = new JLabel(listImg);
        list.setBounds(10,10,683,753);
        // Make other images for marking
        ImageIcon list3Img = new ImageIcon("imgs/dalmatians/listThree.png");
        ImageIcon list4Img = new ImageIcon("imgs/dalmatians/listFour.png");
        ImageIcon listAllImg = new ImageIcon("imgs/dalmatians/listAll.png");
        // Buttons
        JButton button3 = new JButton("MARK 3 DOTS");
        JButton button4 = new JButton("MARK 4 DOTS");
        JButton buttonAll = new JButton("MARK ALL");
        JButton button = new JButton("UNMARK");
        button3.setBounds(10,763,125,20);
        button4.setBounds(135,763,125,20);
        buttonAll.setBounds(10,783,125,20);
        button.setBounds(135,783,125,20);
        // Add
        f.add(list); f.add(button); f.add(button3); f.add(button4); f.add(buttonAll);
        // Define JFrame
        f.setLayout(null);
        f.setSize(700,850);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            list.setIcon(listImg);
        });
        button3.addActionListener((ActionEvent e) -> {
            list.setIcon(list3Img);
        });
        button4.addActionListener((ActionEvent e) -> {
            list.setIcon(list4Img);
        });
        buttonAll.addActionListener((ActionEvent e) -> {
            list.setIcon(listAllImg);
        });
    }
}