/**
 * Needy Gas module, started work on 7/18/2018 11:50 PM
 * 
 * Finished version 0.1 on 7/18/2018 12:00 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;

public class needyKnobs {
    static JFrame f;
    public static void module() {
        f = new JFrame("KAaNE [KNOBS MODULE]");
        // Define the only fucking thing (thank god i dont have to spend 12 years on this)
        ImageIcon img = new ImageIcon("imgs/knobs/quickIdentification.jpg");
        JLabel imgShow = new JLabel(img);
        imgShow.setBounds(0,0,640,455);
        // Add it
        f.add(imgShow);
        // Define the JFrame
        f.setLayout(null);
        f.setSize(640,485);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }
}
