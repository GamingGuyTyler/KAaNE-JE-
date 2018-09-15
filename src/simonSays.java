import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

/**
 * Simon Says module, started work on 12:26 PM 6/24/2018
 * 
 * Finished version 0.1 on 1:58 PM 6/24/2018
 * 
 * Version 0.1
 */
public class simonSays {
    static JFrame f;
	public static void module() {
            System.out.println("[SIMON SAYS MODULE]");
            f = new JFrame("KAaNE [SIMON SAYS MODULE]");
            ImageIcon icon = new ImageIcon("imgs/icons/simon says.png");
            f.setIconImage(icon.getImage());
            // Grab the config stuff
            File configFile = new File("config.properties");
            Properties props = new Properties();
            try {
            	FileReader reader = new FileReader(configFile);
            	props.load(reader);
            } catch (FileNotFoundException ex) {
            	System.out.println("ERROR CODE #0009");
            	System.out.println("Config file could not be found!");
            	System.out.println("Ignoring...");
            } catch (IOException ex) {
            	System.out.println("ERROR CODE #0010");
            	System.out.println("IO Exception while trying to load file!");
                System.out.println("Ignoring...");
            }
            // Define the Strike Combo Box
            String strikesText[]={"0","1","2"};
            final JComboBox<String> strikesCombo=new JComboBox<>(strikesText);
            strikesCombo.setBounds(100,25,50,20);
            // Define the Input Button
            JButton button=new JButton("OK");
            button.setBounds(170,25,75,20);
            // Define the Input Text
            JLabel inputTxt = new JLabel();
            inputTxt.setText("Set the # of strikes below.");
            inputTxt.setBounds(95,0,200,20);
            // Define the Output Image
            JLabel outputImg = new JLabel();
            // Credit to Cypher for the images!
            ImageIcon vowelZero = new ImageIcon("imgs/simonSays/vowelZero.png");
            ImageIcon nowelZero = new ImageIcon("imgs/simonSays/nowelZero.png");
            ImageIcon vowelOne = new ImageIcon("imgs/simonSays/vowelOne-nowelTwo.png");
            ImageIcon nowelOne = new ImageIcon("imgs/simonSays/nowelOne.png");
            ImageIcon vowelTwo = new ImageIcon("imgs/simonSays/vowelTwo.png");
            ImageIcon nowelTwo = new ImageIcon("imgs/simonSays/vowelOne-nowelTwo.png");
            outputImg.setIcon(vowelZero);
            outputImg.setBounds(50,55,236,236);
            outputImg.setVisible(false);
            // Define the Output Text
            JLabel outputTxt = new JLabel();
            outputTxt.setText("<html>Red - Blue<br/>Blue - Red<br/>Green - Yellow<br/>Yellow - Green</html>");
            outputTxt.setBounds(120,291,100,80);
            outputTxt.setVisible(false);
            // Add everything in to the JFrame
            f.add(strikesCombo); f.add(button); f.add(inputTxt); f.add(outputImg); f.add(outputTxt);
            // Define the rest of the JFrame stuff
            f.setLayout(null);
            f.setSize(350,400);
            f.setResizable(false);
            f.setVisible(true);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String sn1 = props.getProperty("sn1");
                    String sn2 = props.getProperty("sn2");
                    String sn3 = props.getProperty("sn3");
                    String sn4 = props.getProperty("sn4");
                    String sn5 = props.getProperty("sn5");
                    String sn6 = props.getProperty("sn6");
                    String strikes = strikesCombo.getItemAt(strikesCombo.getSelectedIndex());
                    int vowelCheck = 0;
                    if ((("A".equals(sn1)) || ("E".equals(sn1)) || ("I".equals(sn1)) || ("O".equals(sn1)) || ("U".equals(sn1))) || (("A".equals(sn2)) || ("E".equals(sn2)) || ("I".equals(sn2)) || ("O".equals(sn2)) || ("U".equals(sn2))) || (("A".equals(sn3)) || ("E".equals(sn3)) || ("I".equals(sn3)) || ("O".equals(sn3)) || ("U".equals(sn3))) || (("A".equals(sn4)) || ("E".equals(sn4)) || ("I".equals(sn4)) || ("O".equals(sn4)) || ("U".equals(sn4))) || (("A".equals(sn5)) || ("E".equals(sn5)) || ("I".equals(sn5)) || ("O".equals(sn5)) || ("U".equals(sn5))) || (("A".equals(sn6)) || ("E".equals(sn6)) || ("I".equals(sn6)) || ("O".equals(sn6)) || ("U".equals(sn6)))) {
                        vowelCheck = 1;
                    }
                    if (vowelCheck == 1) {
                        if (strikes.equals("0")) {
                            System.out.println("Vowels, 0 Strikes");
                            outputImg.setIcon(vowelZero);
                            outputTxt.setText("<html>Red - Blue<br/>Blue - Red<br/>Green - Yellow<br/>Yellow - Green</html>");
                            outputImg.setVisible(true);
                            outputTxt.setVisible(true);
                        } else if (strikes.equals("1")) {
                            System.out.println("Vowels, 1 Strike");
                            outputImg.setIcon(vowelOne);
                            outputTxt.setText("<html>Red - Yellow<br/>Blue - Green<br/>Green - Blue<br/>Yellow - Red</html>");
                            outputImg.setVisible(true);
                            outputTxt.setVisible(true);
                        } else {
                            System.out.println("Vowels, 2+ Strikes");
                            outputImg.setIcon(vowelTwo);
                            outputTxt.setText("<html>Red - Green<br/>Blue - Red<br/>Green - Yellow<br/>Yellow - Blue</html>");
                            outputImg.setVisible(true);
                            outputTxt.setVisible(true);
                        }
                    } else {
                        if (strikes.equals("0")) {
                            System.out.println("No vowels, 0 Strikes");
                            outputImg.setIcon(nowelZero);
                            outputTxt.setText("<html>Red - Blue<br/>Blue - Yellow<br/>Green - Green<br/>Yellow - Red</html>");
                            outputImg.setVisible(true);
                            outputTxt.setVisible(true);
                        } else if (strikes.equals("1")) {
                            System.out.println("No vowels, 1 Strike");
                            outputImg.setIcon(nowelOne);
                            outputTxt.setText("<html>Red - Red<br/>Blue - Blue<br/>Green - Yellow<br/>Yellow - Green</html>");
                            outputImg.setVisible(true);
                            outputTxt.setVisible(true);
                        } else {
                            System.out.println("No vowels, 2+ Strikes");
                            outputImg.setIcon(nowelTwo);
                            outputTxt.setText("<html>Red - Yellow<br/>Blue - Green<br/>Green - Blue<br/>Yellow - Red</html>");
                            outputImg.setVisible(true);
                            outputTxt.setVisible(true);
                        }
                    }
                }
            });
        }
}
