/**
 * 3D Tunnels, started work on (forgot to make timestamp)
 * 
 * Finished version 0.1 on 9/10/18 11:05 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;

public class threeDTunnels {
    static JFrame f;
    public static void module() {
        f = new JFrame("KAaNE [3D TUNNELS]");
        ImageIcon icon = new ImageIcon("imgs/icons/3D Tunnels.png");
        f.setIconImage(icon.getImage());
        // Show map
        ImageIcon mapImg = new ImageIcon("imgs/3DTunnels/map.png");
        JLabel map = new JLabel(mapImg);
        map.setBounds(10,-20,768,768);
        // Reminder label
        JLabel reminder = new JLabel("REMEMBER: ROTATING = MOVING FORWARD");
        reminder.setBounds(150,750,600,20);
        reminder.setFont(new Font("Dialog", Font.PLAIN, 22));
        // Add everything in
        f.add(map); f.add(reminder);
        // Define JFrame
        f.setLayout(null);
        f.setSize(780,800);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }
}
