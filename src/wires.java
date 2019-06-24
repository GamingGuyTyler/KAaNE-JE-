import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

/**
 * Wires Module, started work on 1:32 AM 6/17/2018 on this module.
 * 
 * Completely reworked the module on 5:55 AM to use JFrame instead of basic Swing windows.
 *
 * Finished Version 0.1 at 10:47 PM 6/17/2018
 * 
 * Finished Version 0.2 at 9:59 AM 6/18/2018
 *
 * Rework started on 7:08 AM 6/23/2019
 *
 * Finished Version 0.3 on 7:48 AM 6/23/2019
 *
 * Version 0.3
 *
 */

public class wires {
    static JFrame f;
    public static void module() {
        System.out.println("[WIRES MODULE]");
        f = new JFrame("KAaNE [WIRES MODULE]");
        ImageIcon icon = new ImageIcon("imgs/icons/wires.png");
        f.setIconImage(icon.getImage());
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        String dm = props.getProperty("displayModule");
        System.out.println("Display Module Setting = " + dm);
        // Define the Input Text
        JLabel inputText = new JLabel();
        inputText.setHorizontalAlignment(JLabel.CENTER);
        inputText.setSize(320,30);
        inputText.setText("Input the amount of wires below.");
        // Define the Input Amount Button
        JButton buttonAmount = new JButton("OK");
        buttonAmount.setBounds(200,50,75,20);
        // Define the Input Amount Combo Box
        String[] inputAmountText = {"3","4","5","6"};
        JComboBox<String> inputAmount = new JComboBox<>(inputAmountText);
        inputAmount.setBounds(50,50,90,20);
        // Define the wire colors
        String[] wireColors = {"Red","White","Yellow","Blue","Black"};
        // Define the Wire Combo Boxes
        JComboBox<String> wire1cb=new JComboBox<>(wireColors);
        wire1cb.setBounds(50,100,90,20);
        JComboBox<String> wire2cb=new JComboBox<>(wireColors);
        wire2cb.setBounds(50,125,90,20);
        JComboBox<String> wire3cb=new JComboBox<>(wireColors);
        wire3cb.setBounds(50,150,90,20);
        JComboBox<String> wire4cb=new JComboBox<>(wireColors);
        wire4cb.setBounds(50,175,90,20);
        JComboBox<String> wire5cb=new JComboBox<>(wireColors);
        wire5cb.setBounds(50,200,90,20);
        JComboBox<String> wire6cb=new JComboBox<>(wireColors);
        wire6cb.setBounds(50,225,90,20);
        // Define the wire text
        JLabel wire1txt = new JLabel("#1");
        wire1txt.setBounds(150,100,90,20);
        JLabel wire2txt = new JLabel("#2");
        wire2txt.setBounds(150,125,90,20);
        JLabel wire3txt = new JLabel("#3");
        wire3txt.setBounds(150,150,90,20);
        JLabel wire4txt = new JLabel("#4");
        wire4txt.setBounds(150,175,90,20);
        JLabel wire5txt = new JLabel("#5");
        wire5txt.setBounds(150,200,90,20);
        JLabel wire6txt = new JLabel("#6");
        wire6txt.setBounds(150,225,90,20);
        // Define the Final Button
        JButton finalButton=new JButton("OK");
        finalButton.setBounds(50,250,75,20);
        // Clear Button
        JButton clear = new JButton("CLEAR");
        clear.setBounds(50,270,75,20);
        // Display Module Components
        JLayeredPane layers = new JLayeredPane();
        ImageIcon dmBgIcon = new ImageIcon("imgs/EmptyComponent.png"); ImageIcon dmNoneIcon = new ImageIcon("imgs/displaymodules/wires/none.png");
        ImageIcon dmBlack1Icon = new ImageIcon("imgs/displaymodules/wires/black1.png"); ImageIcon dmBlack2Icon = new ImageIcon("imgs/displaymodules/wires/black2.png");
        ImageIcon dmBlack3Icon = new ImageIcon("imgs/displaymodules/wires/black3.png"); ImageIcon dmBlack4Icon = new ImageIcon("imgs/displaymodules/wires/black4.png");
        ImageIcon dmBlack5Icon = new ImageIcon("imgs/displaymodules/wires/black5.png"); ImageIcon dmBlack6Icon = new ImageIcon("imgs/displaymodules/wires/black6.png");
        ImageIcon dmBlue1Icon = new ImageIcon("imgs/displaymodules/wires/blue1.png"); ImageIcon dmBlue2Icon = new ImageIcon("imgs/displaymodules/wires/blue2.png");
        ImageIcon dmBlue3Icon = new ImageIcon("imgs/displaymodules/wires/blue3.png"); ImageIcon dmBlue4Icon = new ImageIcon("imgs/displaymodules/wires/blue4.png");
        ImageIcon dmBlue5Icon = new ImageIcon("imgs/displaymodules/wires/blue5.png"); ImageIcon dmBlue6Icon = new ImageIcon("imgs/displaymodules/wires/blue6.png");
        ImageIcon dmRed1Icon = new ImageIcon("imgs/displaymodules/wires/red1.png"); ImageIcon dmRed2Icon = new ImageIcon("imgs/displaymodules/wires/red2.png");
        ImageIcon dmRed3Icon = new ImageIcon("imgs/displaymodules/wires/red3.png"); ImageIcon dmRed4Icon = new ImageIcon("imgs/displaymodules/wires/red4.png");
        ImageIcon dmRed5Icon = new ImageIcon("imgs/displaymodules/wires/red5.png"); ImageIcon dmRed6Icon = new ImageIcon("imgs/displaymodules/wires/red6.png");
        ImageIcon dmWhite1Icon = new ImageIcon("imgs/displaymodules/wires/white1.png"); ImageIcon dmWhite2Icon = new ImageIcon("imgs/displaymodules/wires/white2.png");
        ImageIcon dmWhite3Icon = new ImageIcon("imgs/displaymodules/wires/white3.png"); ImageIcon dmWhite4Icon = new ImageIcon("imgs/displaymodules/wires/white4.png");
        ImageIcon dmWhite5Icon = new ImageIcon("imgs/displaymodules/wires/white5.png"); ImageIcon dmWhite6Icon = new ImageIcon("imgs/displaymodules/wires/white6.png");
        ImageIcon dmYellow1Icon = new ImageIcon("imgs/displaymodules/wires/yellow1.png"); ImageIcon dmYellow2Icon = new ImageIcon("imgs/displaymodules/wires/yellow2.png");
        ImageIcon dmYellow3Icon = new ImageIcon("imgs/displaymodules/wires/yellow3.png"); ImageIcon dmYellow4Icon = new ImageIcon("imgs/displaymodules/wires/yellow4.png");
        ImageIcon dmYellow5Icon = new ImageIcon("imgs/displaymodules/wires/yellow5.png"); ImageIcon dmYellow6Icon = new ImageIcon("imgs/displaymodules/wires/yellow6.png");
        JLabel dmBg = new JLabel(dmBgIcon); JLabel dmNone = new JLabel(dmNoneIcon);
        JLabel dmWire1 = new JLabel(dmBlack1Icon); JLabel dmWire2 = new JLabel(dmBlack2Icon);
        JLabel dmWire3 = new JLabel(dmBlack3Icon); JLabel dmWire4 = new JLabel(dmBlack4Icon);
        JLabel dmWire5 = new JLabel(dmBlack5Icon); JLabel dmWire6 = new JLabel(dmBlack6Icon);
        dmBg.setBounds(350,40,200,200); dmNone.setBounds(370,60,200,200);
        dmWire1.setBounds(370,60,200,200); dmWire2.setBounds(370,60,200,200);
        dmWire3.setBounds(370,60,200,200); dmWire4.setBounds(370,60,200,200);
        dmWire5.setBounds(370,60,200,200); dmWire6.setBounds(370,60,200,200);
        if (!dm.equals("1")) {dmBg.setVisible(false); dmNone.setVisible(false);}
        dmWire1.setVisible(false); dmWire2.setVisible(false);
        dmWire3.setVisible(false); dmWire4.setVisible(false);
        dmWire5.setVisible(false); dmWire6.setVisible(false);
        JButton update = new JButton("UPDATE");
        update.setBounds(410,250,80,20);
        // Set the Wire CBs, SN CB, text and the final button to non-visible, since we'll make them visible when the user selects the appropriate amount.
        wire1cb.setVisible(false); wire2cb.setVisible(false); wire3cb.setVisible(false);
        wire4cb.setVisible(false); wire5cb.setVisible(false); wire6cb.setVisible(false);
        finalButton.setVisible(false); clear.setVisible(false);
        wire1txt.setVisible(false); wire2txt.setVisible(false); wire3txt.setVisible(false);
        wire4txt.setVisible(false); wire5txt.setVisible(false); wire6txt.setVisible(false);
        // Add normal components
        layers.add(inputText); layers.add(buttonAmount); layers.add(inputAmount); 
        layers.add(wire1cb); layers.add(wire2cb); layers.add(wire3cb); layers.add(wire4cb); layers.add(wire5cb); layers.add(wire6cb); 
        layers.add(wire1txt); layers.add(wire2txt); layers.add(wire3txt); layers.add(wire4txt); layers.add(wire5txt); layers.add(wire6txt); 
        layers.add(finalButton); layers.add(clear); layers.add(update);
        // Add display module components + Set layers
        layers.add(dmBg); layers.add(dmNone); layers.setLayer(dmNone,1);
        layers.add(dmWire1); layers.add(dmWire2); layers.add(dmWire3);
        layers.add(dmWire4); layers.add(dmWire5); layers.add(dmWire6);
        layers.setLayer(dmWire1,2); layers.setLayer(dmWire2,2); layers.setLayer(dmWire3,2);
        layers.setLayer(dmWire4,2); layers.setLayer(dmWire5,2); layers.setLayer(dmWire6,2);
        // Define JFrame
        f.setContentPane(layers);
        f.setLayout(null);
        if (dm.equals("1")) f.setSize(600,350);
        else f.setSize(350,350);
        f.setResizable(false);
        f.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Amount Button
        buttonAmount.addActionListener(e -> {
            // Grab amount
            String x = inputAmount.getItemAt(inputAmount.getSelectedIndex());
            System.out.println("Inputed Wires: " + x);
            // Make CB/Text visible
            wire1txt.setText("#1"); wire2txt.setText("#2"); wire3txt.setText("#3");
            wire4txt.setText("#4"); wire5txt.setText("#5"); wire6txt.setText("#6");
            wire1cb.setVisible(true); wire2cb.setVisible(true); wire3cb.setVisible(true);
            wire4cb.setVisible(false); wire5cb.setVisible(false); wire6cb.setVisible(false);
            finalButton.setVisible(true); clear.setVisible(true); update.setVisible(true);
            wire1txt.setVisible(true); wire2txt.setVisible(true); wire3txt.setVisible(true);
            wire4txt.setVisible(false); wire5txt.setVisible(false); wire6txt.setVisible(false);
            // Determine visibility based on # of wires
            int y = Integer.parseInt(x);
            if (y >= 4) {
                wire4cb.setVisible(true); wire4txt.setVisible(true);
            } if (y >= 5) {
                wire5cb.setVisible(true); wire5txt.setVisible(true);
            } if (y == 6) {
                wire6cb.setVisible(true); wire6txt.setVisible(true);
            }
        });
        // Logic
        finalButton.addActionListener(e -> {
            wire1txt.setVisible(false); wire2txt.setVisible(false); wire3txt.setVisible(false);
            wire4txt.setVisible(false); wire5txt.setVisible(false); wire6txt.setVisible(false);
            String w1 = wire1cb.getItemAt(wire1cb.getSelectedIndex());
            String w2 = wire2cb.getItemAt(wire2cb.getSelectedIndex());
            String w3 = wire3cb.getItemAt(wire3cb.getSelectedIndex());
            String x = inputAmount.getItemAt(inputAmount.getSelectedIndex());
            String sn = props.getProperty("snLastDig");
            System.out.println("SN Last Dig: " + sn);
            // Check which is the last digit of the SN. If there is none, then just set it as 0.
            int snc = Integer.parseInt(sn) % 2;
            System.out.println("1st wire - " + w1);
            System.out.println("2nd wire - " + w2);
            System.out.println("3rd wire - " + w3);
            if(x.equals("3")) {
                String[] wires = {w1,w2,w3}; // Make into array for easier conditions
                if (count(wires,"Red") == 0) {
                    System.out.println("Step 1.1");
                    System.out.println("Cut the 2nd wire, since there's no red wires.");
                    wire2txt.setText("CUT");
                    wire2txt.setVisible(true);
                } else if (w3.equals("White")) {
                    System.out.println("Step 1.2");
                    System.out.println("Cut the last wire because it's white.");
                    wire3txt.setText("CUT");
                    wire3txt.setVisible(true);
                } else if (count(wires,"Blue") > 1) {
                    if (getLastIndex(wires,"Blue") == 2) {
                        System.out.println("Step 1.3.1");
                        System.out.println("Cut the 2nd wire since it's the last blue wire and there's more than one blue wire.");
                        wire2txt.setText("CUT");
                        wire2txt.setVisible(true);
                    } else {
                        System.out.println("Step 1.3.2");
                        System.out.println("Cut the last wire since it's the last blue wire and there's more than one blue wire.");
                        wire3txt.setText("CUT");
                        wire3txt.setVisible(true);
                    }
                } else {
                    System.out.println("Step 1.4");
                    System.out.println("Cut the last wire since no other condition applies.");
                    wire3txt.setText("CUT");
                    wire3txt.setVisible(true);
                }
            } if("4".equals(x)) {
                String w4 = wire4cb.getItemAt(wire4cb.getSelectedIndex());
                System.out.println("4th wire - " + w4);
                String[] wires = {w1,w2,w3,w4};
                if (count(wires,"Red") > 1 && snc == 1) {
                    if (getLastIndex(wires,"Red") == 2) {
                        System.out.println("Step 2.1.1");
                        System.out.println("Cut the 2nd wire since it's the last red wire, there's more than one red wire, and the last digit of the SN is odd.");
                        wire2txt.setText("CUT");
                        wire2txt.setVisible(true);
                    } else if (getLastIndex(wires,"Red") == 3) {
                        System.out.println("Step 2.1.2");
                        System.out.println("Cut the 3rd wire since it's the last red wire, there's more than one red wire, and the last digit of the SN is odd.");
                        wire3txt.setText("CUT");
                        wire3txt.setVisible(true);
                    } else {
                        System.out.println("Step 2.1.3");
                        System.out.println("Cut the last wire since it's the last red wire, there's more than one red wire, and the last digit of the SN is odd.");
                        wire4txt.setText("CUT");
                        wire4txt.setVisible(true);
                    }
                } else if ((w4.equals("Yellow")) && count(wires,"Red") == 0) {
                    System.out.println("Step 2.2");
                    System.out.println("Cut the 1st wire since the last wire is yellow and there are no red wires.");
                    wire1txt.setText("CUT");
                    wire1txt.setVisible(true);
                } else if (count(wires,"Blue") == 1) {
                    System.out.println("Step 2.3");
                    System.out.println("Cut the 1st wire since there's exactly one blue wire.");
                    wire1txt.setText("CUT");
                    wire1txt.setVisible(true);
                } else if (count(wires,"Yellow") > 1) {
                    System.out.println("Step 2.4");
                    System.out.println("Cut the last wire since there's more than one yellow wire.");
                    wire4txt.setText("CUT");
                    wire4txt.setVisible(true);
                } else {
                    System.out.println("Step 2.5");
                    System.out.println("Cut the 2nd wire since no other condition applies.");
                    wire2txt.setText("CUT");
                    wire2txt.setVisible(true);
                }
            } if(x.equals("5")) {
                String w4 = wire4cb.getItemAt(wire4cb.getSelectedIndex());
                String w5 = wire5cb.getItemAt(wire5cb.getSelectedIndex());
                System.out.println("4th wire - " + w4);
                System.out.println("5th wire - " + w5);
                String[] wires = {w1,w2,w3,w4,w5};
                if ((w5.equals("Black")) && (snc == 1)) {
                    System.out.println("Step 3.1");
                    System.out.println("Cut the 4th wire since the last wire is black and the last digit of the SN is odd.");
                    wire4txt.setText("CUT");
                    wire4txt.setVisible(true);
                } else if (count(wires,"Red") == 1 && count(wires,"Yellow") > 1) {
                    System.out.println("Step 3.2");
                    System.out.println("Cut the 1st wire since there's exactly one red wire and there's more than one yellow wire.");
                    wire1txt.setText("CUT");
                    wire1txt.setVisible(true);
                } else if (count(wires,"Black") == 0) {
                    System.out.println("Step 3.3");
                    System.out.println("Cut the 2nd wire since there's no black wires.");
                    wire2txt.setText("CUT");
                    wire2txt.setVisible(true);
                } else {
                    System.out.println("Step 3.4");
                    System.out.println("Cut the 1st wire since no other condition applies.");
                    wire1txt.setText("CUT");
                    wire1txt.setVisible(true);
                }
            } if(x.equals("6")) {
                String w4 = wire4cb.getItemAt(wire4cb.getSelectedIndex());
                String w5 = wire5cb.getItemAt(wire5cb.getSelectedIndex());
                String w6 = wire6cb.getItemAt(wire6cb.getSelectedIndex());
                System.out.println("4th wire - " + w4);
                System.out.println("5th wire - " + w5);
                System.out.println("6th wire - " + w6);
                String[] wires = {w1,w2,w3,w4,w5,w6};
                if (count(wires,"Yellow") == 0 && (snc == 1)) {
                    System.out.println("Step 4.1");
                    System.out.println("Cut the 3rd wire since there's no yellow wires and the last digit of the SN is odd.");
                    wire3txt.setText("CUT");
                    wire3txt.setVisible(true);
                } else if (count(wires,"Yellow") == 1 && count(wires,"White") > 1) {
                    System.out.println("Step 4.2");
                    System.out.println("Cut the 4th wire since there's exactly one yellow wire and there's more than one white wire.");
                    wire4txt.setText("CUT");
                    wire4txt.setVisible(true);
                } else if (count(wires,"Red") == 0) {
                    System.out.println("Step 4.3");
                    System.out.println("Cut the last wire since there's no red wires.");
                    wire6txt.setText("CUT");
                    wire6txt.setVisible(true);
                } else {
                    System.out.println("Step 4.4");
                    System.out.println("Cut the 4th wire since no other condition applies.");
                    wire4txt.setText("CUT");
                    wire4txt.setVisible(true);
                }
            }
        });
        clear.addActionListener(e -> {
            // Reset selected index
            wire1cb.setSelectedIndex(0);
            wire2cb.setSelectedIndex(0);
            wire3cb.setSelectedIndex(0);
            wire4cb.setSelectedIndex(0);
            wire5cb.setSelectedIndex(0);
            wire6cb.setSelectedIndex(0);
            // Reset labels
            wire1txt.setText("#1");
            wire2txt.setText("#2");
            wire3txt.setText("#3");
            wire4txt.setText("#4");
            wire5txt.setText("#5");
            wire6txt.setText("#6");
        });
        update.addActionListener(e -> {
            // Get wire selections
            String w1 = wire1cb.getItemAt(wire1cb.getSelectedIndex());
            String w2 = wire2cb.getItemAt(wire2cb.getSelectedIndex());
            String w3 = wire3cb.getItemAt(wire3cb.getSelectedIndex());
            String w4 = wire4cb.getItemAt(wire4cb.getSelectedIndex());
            String w5 = wire5cb.getItemAt(wire5cb.getSelectedIndex());
            String w6 = wire6cb.getItemAt(wire6cb.getSelectedIndex());
            // If the CB is visible, so is the wire
            dmWire1.setVisible(true); dmWire2.setVisible(true); dmWire3.setVisible(true);
            dmWire4.setVisible(wire4cb.isVisible());
            dmWire5.setVisible(wire5cb.isVisible());
            dmWire6.setVisible(wire6cb.isVisible());
            switch (w1) {
                case "Red": dmWire1.setIcon(dmRed1Icon); break;
                case "Yellow": dmWire1.setIcon(dmYellow1Icon); break;
                case "Blue": dmWire1.setIcon(dmBlue1Icon); break;
                case "White": dmWire1.setIcon(dmWhite1Icon); break;
                case "Black": dmWire1.setIcon(dmBlack1Icon); break;
            } switch (w2) {
                case "Red": dmWire2.setIcon(dmRed2Icon); break;
                case "Yellow": dmWire2.setIcon(dmYellow2Icon); break;
                case "Blue": dmWire2.setIcon(dmBlue2Icon); break;
                case "White": dmWire2.setIcon(dmWhite2Icon); break;
                case "Black": dmWire2.setIcon(dmBlack2Icon); break;
            } switch (w3) {
                case "Red": dmWire3.setIcon(dmRed3Icon); break;
                case "Yellow": dmWire3.setIcon(dmYellow3Icon); break;
                case "Blue": dmWire3.setIcon(dmBlue3Icon); break;
                case "White": dmWire3.setIcon(dmWhite3Icon); break;
                case "Black": dmWire3.setIcon(dmBlack3Icon); break;
            } switch (w4) {
                case "Red": dmWire4.setIcon(dmRed4Icon); break;
                case "Yellow": dmWire4.setIcon(dmYellow4Icon); break;
                case "Blue": dmWire4.setIcon(dmBlue4Icon); break;
                case "White": dmWire4.setIcon(dmWhite4Icon); break;
                case "Black": dmWire4.setIcon(dmBlack4Icon); break;
            } switch (w5) {
                case "Red": dmWire5.setIcon(dmRed5Icon); break;
                case "Yellow": dmWire5.setIcon(dmYellow5Icon); break;
                case "Blue": dmWire5.setIcon(dmBlue5Icon); break;
                case "White": dmWire5.setIcon(dmWhite5Icon); break;
                case "Black": dmWire5.setIcon(dmBlack5Icon); break;
            } switch (w6) {
                case "Red": dmWire6.setIcon(dmRed6Icon); break;
                case "Yellow": dmWire6.setIcon(dmYellow6Icon); break;
                case "Blue": dmWire6.setIcon(dmBlue6Icon); break;
                case "White": dmWire6.setIcon(dmWhite6Icon); break;
                case "Black": dmWire6.setIcon(dmBlack6Icon); break;
            }
        });
    }
    private static int count (String[] array, String val) {
        int count = 0;
        for (String a : array)
            if (a.equals(val))
                count++;
        return count;
    }
    private static int getLastIndex (String[] array, String val) {
        String[] revArr = reverse(array);
        for (int i = 0; i < revArr.length; i++)
            if (revArr[i].equals(val))
                return i;
        return 0;
    }
    // From Java67
    private static String[] reverse (String[] array) {
        for(int i=0; i<array.length/2; i++){
            String temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        return array;
    }
}
