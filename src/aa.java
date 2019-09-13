/**
 * aa
 *
 * Started work on 5/24/2019 3:33 AM
 *
 * Finished on 5/24/2019 4:33 AM
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class aa {
    static JFrame f;
    public static void module() {
        System.out.println("[aa]");
        f = new JFrame("KAaNE [aa]");
        ImageIcon icon = new ImageIcon("imgs/icons/aa.png");
        f.setIconImage(icon.getImage());
        // Text Box
        JTextField input = new JTextField();
        input.setBounds(5,5,50,20);
        input.setDocument(new JTextFieldLimit(2));
        // Button
        JButton button = new JButton("OK");
        button.setBounds(60,5,60,20);
        // Output Text
        JLabel output = new JLabel("");
        output.setBounds(5,30,200,20);
        // Add everything
        f.add(input); f.add(button); f.add(output);
        // Define JFrame
        f.setLayout(null);
        f.setSize(250,100);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            // Grab input
            String inputted = input.getText();
            System.out.println("Input: " + inputted);
            // Define available texts
            String[] texts = {"K","M","B","T",
                    "aa","ab","ac","ad","ae","af","ag","ah","ai","aj","ak","al","am",
                    "an","ao","ap","aq","ar","as","at","au","av","aw","ax","ay","az",
                    "ba","bb","bc","bd","be","bf","bg","bh","bi","bj","bk","bl","bm",
                    "bn","bo","bp","bq","br","bs","bt","bu","bv","bw","bx","by","bz",
                    "ca","cb","cc","cd","ce","cf","cg","ch","ci","cj","ck","cl","cm",
                    "cn","co","cp","cq","cr","cs","ct","cu","cv","cw","cx","cy","cz",
                    "da","db","dc","dd","de","df"};
            // Check if text is available
            if (Arrays.stream(texts).noneMatch(inputted::equals)) {
                // If not, shank them
                output.setText("Invalid Input!");
                System.out.println("Invalid Input.");
            }
            else {
                // If it is
                // Find the index of the matching value
                int index = Arrays.asList(texts).indexOf(inputted);
                // Define available outputs
                // Fun fact: These were originally gonna be ints, but because 009 is considered an octal number, it doesn't exist, and Java hates it.
                // Thanks Java.
                String[] outputs = {"003", "006", "009", "012", "015", "018", "021", "024", "027", "030", "033", "036", "039", "042", "045", "048",
                        "051", "054", "057", "060","063", "066", "069", "072", "075", "078", "081", "084", "087", "090", "093", "096", "099",
                        "102", "105", "108", "111", "114", "117", "120", "123", "126", "129", "132", "135", "138", "141", "144", "147", "150",
                        "153", "156", "159", "162", "165", "168", "171", "174", "177", "180", "183", "186", "189", "192", "195", "198",
                        "201", "204", "207", "210", "213", "216", "219", "222", "225", "228", "231", "234", "237", "240", "243", "246", "249",
                        "252", "255", "258", "261", "264"};
                // Output based on index
                String outputted = outputs[index];
                output.setText("Output: " + outputted);
                System.out.println("Output: " + outputted);
            }
        });
    }
}
