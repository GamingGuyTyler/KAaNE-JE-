/**
 * Adventure Game module, started work on 7/19/2018 7:03 PM
 * 
 * Finished version 0.1 on 7/20/2018 10:30 AM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import org.jdesktop.swingx.autocomplete.*;
import java.util.*;
import java.io.*;

public class adventureGame {
    static JFrame f;
    AutoCompleteDecorator decorator;
    public static void module() {
        System.out.println("[ADV. GAME]");
        f = new JFrame("KAaNE [ADV. GAME]");
        ImageIcon icon = new ImageIcon("imgs/icons/adventure game.png");
        f.setIconImage(icon.getImage());
        JOptionPane.showMessageDialog(null,"Use the potion if you have it.","KAaNE [ADV.GAME]",JOptionPane.PLAIN_MESSAGE);
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0013");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0014");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // Define the string arrays
        String enemies[] = {"Demon","Dragon","Eagle","Goblin","Golem","Troll","Lizard","Wizard"};
        String items[] = {"","Balloon","Battery","Bellows","Cheat Code","Crystal ball","Feather","Hard drive","Lamp","Moonstone","N/A","Small dog","Stepladder",
                          "Sunstone","Symbol","Ticket","Trophy"};
        String weapons[] = {"","Broadsword","Caber","Grimore","Longbow","Magic orb","Nasty Knife"};
        // Define the enemy CB
        JComboBox enemyCB = new JComboBox(enemies);
        enemyCB.setBounds(10,10,70,20);
        // Define the enemy label
        JLabel enemyLabel = new JLabel("Enemy");
        enemyLabel.setBounds(85,10,40,20);
        // Define the stat text boxes
        JTextField strTB = new JTextField();
        strTB.setDocument(new JTextFieldLimit(2));
        strTB.setBounds(10,40,20,20);
        JTextField dexTB = new JTextField();
        dexTB.setDocument(new JTextFieldLimit(2));
        dexTB.setBounds(10,70,20,20);
        JTextField intTB = new JTextField();
        intTB.setDocument(new JTextFieldLimit(2));
        intTB.setBounds(10,100,20,20);
        JTextField ftTB = new JTextField();
        ftTB.setDocument(new JTextFieldLimit(1));
        ftTB.setBounds(10,130,20,20);
        JTextField inTB = new JTextField();
        inTB.setDocument(new JTextFieldLimit(2));
        inTB.setBounds(10,160,20,20);
        JTextField tempTB = new JTextField();
        tempTB.setDocument(new JTextFieldLimit(2));
        tempTB.setBounds(10,190,20,20);
        JTextField gravTB = new JTextField();
        gravTB.setDocument(new JTextFieldLimit(4));
        gravTB.setBounds(10,220,30,20);
        JTextField presTB = new JTextField();
        presTB.setDocument(new JTextFieldLimit(3));
        presTB.setBounds(10,250,30,20);
        // Define the stat labels
        JLabel strLabel = new JLabel("STR");
        strLabel.setBounds(35,40,30,20);
        JLabel dexLabel = new JLabel("DEX");
        dexLabel.setBounds(35,70,30,20);
        JLabel intLabel = new JLabel("INT");
        intLabel.setBounds(35,100,30,20);
        JLabel ftLabel = new JLabel("FT (')");
        ftLabel.setBounds(35,130,30,20);
        JLabel inLabel = new JLabel("IN (\")");
        inLabel.setBounds(35,160,30,20);
        JLabel tempLabel = new JLabel("°C");
        tempLabel.setBounds(35,190,30,20);
        JLabel gravLabel = new JLabel("m/s²");
        gravLabel.setBounds(45,220,40,20);
        JLabel presLabel = new JLabel("kPa");
        presLabel.setBounds(45,250,30,20);
        // Define the item CBs
        JComboBox itemCB1 = new JComboBox(items);
        itemCB1.setBounds(90,40,90,20);
        JComboBox itemCB2 = new JComboBox(items);
        itemCB2.setBounds(90,70,90,20);
        JComboBox itemCB3 = new JComboBox(items);
        itemCB3.setBounds(90,100,90,20);
        JComboBox itemCB4 = new JComboBox(items);
        itemCB4.setBounds(90,130,90,20);
        JComboBox itemCB5 = new JComboBox(items);
        itemCB5.setBounds(90,160,90,20);
        // Define the weapon CBs
        JComboBox wpnCB1 = new JComboBox(weapons);
        wpnCB1.setBounds(90,190,100,20);
        JComboBox wpnCB2 = new JComboBox(weapons);
        wpnCB2.setBounds(90,220,100,20);
        JComboBox wpnCB3 = new JComboBox(weapons);
        wpnCB3.setBounds(90,250,100,20);
        // Make the item/weapon CBs auto-completable
        AutoCompleteDecorator.decorate(itemCB1);
        AutoCompleteDecorator.decorate(itemCB2);
        AutoCompleteDecorator.decorate(itemCB3);
        AutoCompleteDecorator.decorate(itemCB4);
        AutoCompleteDecorator.decorate(itemCB5);
        AutoCompleteDecorator.decorate(wpnCB1);
        AutoCompleteDecorator.decorate(wpnCB2);
        AutoCompleteDecorator.decorate(wpnCB3);
        // Define the item labels
        JLabel itemLabel1 = new JLabel("Item #1");
        itemLabel1.setBounds(185,40,50,20);
        JLabel itemLabel2 = new JLabel("Item #2");
        itemLabel2.setBounds(185,70,50,20);
        JLabel itemLabel3 = new JLabel("Item #3");
        itemLabel3.setBounds(185,100,50,20);
        JLabel itemLabel4 = new JLabel("Item #4");
        itemLabel4.setBounds(185,130,50,20);
        JLabel itemLabel5 = new JLabel("Item #5");
        itemLabel5.setBounds(185,160,50,20);
        // Define the weapon labels
        JLabel wpnLabel1 = new JLabel("Weapon #1");
        wpnLabel1.setBounds(195,190,70,20);
        JLabel wpnLabel2 = new JLabel("Weapon #2");
        wpnLabel2.setBounds(195,220,70,20);
        JLabel wpnLabel3 = new JLabel("Weapon #3");
        wpnLabel3.setBounds(195,250,70,20);
        // Define the buttons
        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(260,10,80,20);
        JButton button = new JButton("OK");
        button.setBounds(10,280,70,20);
        // Define the output text
        JTextArea outputText = new JTextArea();
        outputText.setEditable(false);
        outputText.setLineWrap(true);
        outputText.setWrapStyleWord(true);
        outputText.setBounds(285,40,155,275);
        // Add everything to JFrame
        f.add(enemyCB); f.add(enemyLabel);
        f.add(strTB); f.add(dexTB); f.add(intTB); f.add(ftTB); f.add(inTB); f.add(tempTB); f.add(gravTB); f.add(presTB);
        f.add(strLabel); f.add(dexLabel); f.add(intLabel); f.add(ftLabel); f.add(inLabel); f.add(tempLabel); f.add(gravLabel); f.add(presLabel);
        f.add(itemCB1); f.add(itemCB2); f.add(itemCB3); f.add(itemCB4); f.add(itemCB5);
        f.add(itemLabel1); f.add(itemLabel2); f.add(itemLabel3); f.add(itemLabel4); f.add(itemLabel5);
        f.add(wpnCB1); f.add(wpnCB2); f.add(wpnCB3);
        f.add(wpnLabel1); f.add(wpnLabel2); f.add(wpnLabel3);
        f.add(resetButton); f.add(button); f.add(outputText);
        // Define the rest of the JFrame
        f.setLayout(null);
        f.setSize(450,350);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        String regx = "[]";
        button.addActionListener((ActionEvent e) -> {
            String strSng = strTB.getText();
            String dexSng = dexTB.getText();
            String intSng = intTB.getText();
            String ftSng = ftTB.getText();
            String inSng = inTB.getText();
            String tempSng = tempTB.getText();
            String gravSng = gravTB.getText();
            String presSng = presTB.getText();
            int str = Integer.parseInt(strSng);
            int dex = Integer.parseInt(dexSng);
            int Int = Integer.parseInt(intSng);
            int ft = Integer.parseInt(ftSng);
            int in = Integer.parseInt(inSng);
            int temp = Integer.parseInt(tempSng);
            double grav = Double.parseDouble(gravSng);
            int pres = Integer.parseInt(presSng);
            String enemy = (String) enemyCB.getItemAt(enemyCB.getSelectedIndex());
            String item1 = (String) itemCB1.getItemAt(itemCB1.getSelectedIndex());
            String item2 = (String) itemCB2.getItemAt(itemCB2.getSelectedIndex());
            String item3 = (String) itemCB3.getItemAt(itemCB3.getSelectedIndex());
            String item4 = (String) itemCB4.getItemAt(itemCB4.getSelectedIndex());
            String item5 = (String) itemCB5.getItemAt(itemCB5.getSelectedIndex());
            String wpn1 = (String) wpnCB1.getItemAt(wpnCB1.getSelectedIndex());
            String wpn2 = (String) wpnCB2.getItemAt(wpnCB2.getSelectedIndex());
            String wpn3 = (String) wpnCB3.getItemAt(wpnCB3.getSelectedIndex());
            ArrayList<String> outputs = new ArrayList<>();
            String batteries = props.getProperty("batteriesTotal");
            int bats = Integer.parseInt(batteries);
            String sn1 = props.getProperty("sn1");
            String sn2 = props.getProperty("sn2");
            String sn3 = props.getProperty("sn3");
            String sn4 = props.getProperty("sn4");
            String sn5 = props.getProperty("sn5");
            String sn6 = props.getProperty("sn6");
            String lastDigitSng = "0";
            // Last digit checker
            if (sn6.equals("0") || sn6.equals("1") || sn6.equals("2") || sn6.equals("3") || sn6.equals("4") || sn6.equals("5") || sn6.equals("6") || sn6.equals("7") || sn6.equals("8") || sn6.equals("9")) {
                lastDigitSng = sn6;
            } else if (sn5.equals("0") || sn5.equals("1") || sn5.equals("2") || sn5.equals("3") || sn5.equals("4") || sn5.equals("5") || sn5.equals("6") || sn5.equals("7") || sn5.equals("8") || sn5.equals("9")) {
                lastDigitSng = sn5;
            } else if (sn4.equals("0") || sn4.equals("1") || sn4.equals("2") || sn4.equals("3") || sn4.equals("4") || sn4.equals("5") || sn4.equals("6") || sn4.equals("7") || sn4.equals("8") || sn4.equals("9")) {
                lastDigitSng = sn4;
            } else if (sn3.equals("0") || sn3.equals("1") || sn3.equals("2") || sn3.equals("3") || sn3.equals("4") || sn3.equals("5") || sn3.equals("6") || sn3.equals("7") || sn3.equals("8") || sn3.equals("9")) {
                lastDigitSng = sn3;
            } else if (sn2.equals("0") || sn2.equals("1") || sn2.equals("2") || sn2.equals("3") || sn2.equals("4") || sn2.equals("5") || sn2.equals("6") || sn2.equals("7") || sn2.equals("8") || sn2.equals("9")) {
                lastDigitSng = sn2;
            } else if (sn1.equals("0") || sn1.equals("1") || sn1.equals("2") || sn1.equals("3") || sn1.equals("4") || sn1.equals("5") || sn1.equals("6") || sn1.equals("7") || sn1.equals("8") || sn1.equals("9")) {
                lastDigitSng = sn1;
            }
            int lastDigit = Integer.parseInt(lastDigitSng);
            // First digit checker
            String firstDigitSng = "0";
            if (sn1.equals("0") || sn1.equals("1") || sn1.equals("2") || sn1.equals("3") || sn1.equals("4") || sn1.equals("5") || sn1.equals("6") || sn1.equals("7") || sn1.equals("8") || sn1.equals("9")) {
                firstDigitSng = sn1;
            } else if (sn2.equals("0") || sn2.equals("1") || sn2.equals("2") || sn2.equals("3") || sn2.equals("4") || sn2.equals("5") || sn2.equals("6") || sn2.equals("7") || sn2.equals("8") || sn2.equals("9")) {
                firstDigitSng = sn2;
            } else if (sn3.equals("0") || sn3.equals("1") || sn3.equals("2") || sn3.equals("3") || sn3.equals("4") || sn3.equals("5") || sn3.equals("6") || sn3.equals("7") || sn3.equals("8") || sn3.equals("9")) {
                firstDigitSng = sn3;
            } else if (sn4.equals("0") || sn4.equals("1") || sn4.equals("2") || sn4.equals("3") || sn4.equals("4") || sn4.equals("5") || sn4.equals("6") || sn4.equals("7") || sn4.equals("8") || sn4.equals("9")) {
                firstDigitSng = sn4;
            } else if (sn5.equals("0") || sn5.equals("1") || sn5.equals("2") || sn5.equals("3") || sn5.equals("4") || sn5.equals("5") || sn5.equals("6") || sn5.equals("7") || sn5.equals("8") || sn5.equals("9")) {
                firstDigitSng = sn5;
            } else if (sn6.equals("0") || sn6.equals("1") || sn6.equals("2") || sn6.equals("3") || sn6.equals("4") || sn6.equals("5") || sn6.equals("6") || sn6.equals("7") || sn6.equals("8") || sn6.equals("9")) {
                firstDigitSng = sn6;
            }
            int firstDigit = Integer.parseInt(firstDigitSng);
            int dvidQty = Integer.parseInt(props.getProperty("dvidQuantity"));
            int parallelQty = Integer.parseInt(props.getProperty("parallelQuantity"));
            int ps2Qty = Integer.parseInt(props.getProperty("ps2Quantity"));
            int rj45Qty = Integer.parseInt(props.getProperty("rj45Quantity"));
            int serialQty = Integer.parseInt(props.getProperty("serialQuantity"));
            int stereoRCAQty = Integer.parseInt(props.getProperty("stereoRCAQuantity"));
            // Check if there's more than one of the same port
            boolean doublePort = false;
            if (dvidQty > 1 || parallelQty > 1 || ps2Qty > 1 || rj45Qty > 1 || serialQty > 1 || stereoRCAQty > 1) {
                doublePort = true;
            }
            int bob = Integer.parseInt(props.getProperty("bob"));
            int bobLit = Integer.parseInt(props.getProperty("bobLit"));
            int car = Integer.parseInt(props.getProperty("car"));
            int carLit = Integer.parseInt(props.getProperty("carLit"));
            int clr = Integer.parseInt(props.getProperty("clr"));
            int clrLit = Integer.parseInt(props.getProperty("clrLit"));
            int frk = Integer.parseInt(props.getProperty("frk"));
            int frkLit = Integer.parseInt(props.getProperty("frkLit"));
            int frq = Integer.parseInt(props.getProperty("frq"));
            int frqLit = Integer.parseInt(props.getProperty("frqLit"));
            int ind = Integer.parseInt(props.getProperty("ind"));
            int indLit = Integer.parseInt(props.getProperty("indLit"));
            int msa = Integer.parseInt(props.getProperty("msa"));
            int msaLit = Integer.parseInt(props.getProperty("msaLit"));
            int nsa = Integer.parseInt(props.getProperty("nsa"));
            int nsaLit = Integer.parseInt(props.getProperty("nsaLit"));
            int sig = Integer.parseInt(props.getProperty("sig"));
            int sigLit = Integer.parseInt(props.getProperty("sigLit"));
            int snd = Integer.parseInt(props.getProperty("snd"));
            int sndLit = Integer.parseInt(props.getProperty("sndLit"));
            int trn = Integer.parseInt(props.getProperty("trn"));
            int trnLit = Integer.parseInt(props.getProperty("trnLit"));
            // Get unlit indicators thru lit variables
            int bobUnlit = 0;
            int carUnlit = 0;
            int clrUnlit = 0;
            int frkUnlit = 0;
            int frqUnlit = 0;
            int indUnlit = 0;
            int msaUnlit = 0;
            int nsaUnlit = 0;
            int sigUnlit = 0;
            int sndUnlit = 0;
            int trnUnlit = 0;
            if (bob == 1 && bobLit == 0) {bobUnlit = 1;}
            if (car == 1 && carLit == 0) {carUnlit = 1;}
            if (clr == 1 && clrLit == 0) {clrUnlit = 1;}
            if (frk == 1 && frkLit == 0) {frkUnlit = 1;}
            if (frq == 1 && frqLit == 0) {frqUnlit = 1;}
            if (ind == 1 && indLit == 0) {indUnlit = 1;}
            if (msa == 1 && msaLit == 0) {msaUnlit = 1;}
            if (nsa == 1 && nsaLit == 0) {nsaUnlit = 1;}
            if (sig == 1 && sigLit == 0) {sigUnlit = 1;}
            if (snd == 1 && sndLit == 0) {sndUnlit = 1;}
            if (trn == 1 && trnLit == 0) {trnUnlit = 1;}
            int unlitInds = bobUnlit + carUnlit + clrUnlit
                + frkUnlit + frqUnlit + indUnlit + msaUnlit
                + nsaUnlit + sigUnlit + sndUnlit + trnUnlit;
            int litInds = bobLit + carLit + clrLit + frkLit
                + frqLit + indLit + msaLit + nsaLit + sigLit
                + sndLit + trnLit;
            System.out.println(str + "STR");
            System.out.println(dex + "DEX");
            System.out.println(Int + "INT");
            System.out.println(ft + "' " + in + "\"");
            System.out.println(temp + "°C");
            System.out.println(grav + "m/s²");
            System.out.println(pres + "kPa");
            System.out.println("Item #1 - " + item1);
            System.out.println("Item #2 - " + item2);
            System.out.println("Item #3 - " + item3);
            System.out.println("Item #4 - " + item4);
            System.out.println("Item #5 - " + item5);
            System.out.println("Weapon #1 - " + wpn1);
            System.out.println("Weapon #2 - " + wpn2);
            System.out.println("Weapon #3 - " + wpn3);
            System.out.println("Enemy - " + enemy);
            System.out.println("Batteries - " + bats);
            System.out.println("First digit - " + firstDigit);
            System.out.println("Last Digit - " + lastDigit);
            System.out.println("Double Port - " + doublePort);
            System.out.println("# of unlit indicators - " + unlitInds);
            System.out.println("# of lit indicators - " + litInds);
            // Item checking
            // MAN do I wish switch cases could work with multiple variables. Oh well.
            // Sorry for the un-tidiness.
            if (item1.equals("Balloon") || item2.equals("Balloon") || item3.equals("Balloon") || item4.equals("Balloon") || item5.equals("Balloon")) {
                if ((grav < 9.3 || pres > 110) && !enemy.equals("Eagle")) {
                    System.out.println("Balloon");
                    outputs.add("Balloon");
                }
            }
            if (item1.equals("Battery") || item2.equals("Battery") || item3.equals("Battery") || item4.equals("Battery") || item5.equals("Battery")) {
                if (bats < 2 && !enemy.equals("Golem") && !enemy.equals("Wizard")) {
                    System.out.println("Battery");
                    outputs.add("Battery");
                }
            }
            if (item1.equals("Bellows") || item2.equals("Bellows") || item3.equals("Bellows") || item4.equals("Bellows") || item5.equals("Bellows")) {
                if (enemy.equals("Dragon") || enemy.equals("Eagle")) {
                    if (pres > 105) {
                        System.out.println("Bellows");
                        outputs.add("Bellows");
                    }
                } else {
                    if (pres < 95) {
                        System.out.println("Bellows");
                        outputs.add("Bellows");
                    }
                }
            }
            if (item1.equals("Crystal ball") || item2.equals("Crystal ball") || item3.equals("Crystal ball") || item4.equals("Crystal ball") || item5.equals("Crystal ball")) {
                if (Int > lastDigit && !enemy.equals("Wizard")) {
                    System.out.println("Crystal ball");
                    outputs.add("Crystal ball");
                }
            }
            if (item1.equals("Feather") || item2.equals("Feather") || item3.equals("Feather") || item4.equals("Feather") || item5.equals("Feather")) {
                if (dex > str || dex > Int) {
                    System.out.println("Feather");
                    outputs.add("Feather");
                }
            }
            if (item1.equals("Hard drive") || item2.equals("Hard drive") || item3.equals("Hard drive") || item4.equals("Hard drive") || item5.equals("Hard drive")) {
                if (doublePort == true) {
                    System.out.println("Hard drive");
                    outputs.add("Hard drive");
                }
            }
            if (item1.equals("Lamp") || item2.equals("Lamp") || item3.equals("Lamp") || item4.equals("Lamp") || item5.equals("Lamp")) {
                if (temp < 12 && !enemy.equals("Lizard")) {
                    System.out.println("Lamp");
                    outputs.add("Lamp");
                }
            }
            if (item1.equals("Moonstone") || item2.equals("Moonstone") || item3.equals("Moonstone") || item4.equals("Moonstone") || item5.equals("Moonstone")) {
                if (unlitInds > 1) {
                    System.out.println("Moonstone");
                    outputs.add("Moonstone");
                }
            }
            if (item1.equals("Small dog") || item2.equals("Small dog") || item3.equals("Small dog") || item4.equals("Small dog") || item5.equals("Small dog")) {
                if (!enemy.equals("Demon") && !enemy.equals("Dragon") && !enemy.equals("Troll")) {
                    System.out.println("Small dog");
                    outputs.add("Small dog");
                }
            }
            if (item1.equals("Stepladder") || item2.equals("Stepladder") || item3.equals("Stepladder") || item4.equals("Stepladder") || item5.equals("Stepladder")) {
                if (ft < 4 && !enemy.equals("Goblin") && !enemy.equals("Lizard")) {
                    System.out.println("Stepladder");
                    outputs.add("Stepladder");
                }
            }
            if (item1.equals("Sunstone") || item2.equals("Sunstone") || item3.equals("Sunstone") || item4.equals("Sunstone") || item5.equals("Sunstone")) {
                if (litInds > 1) {
                    System.out.println("Sunstone");
                    outputs.add("Sunstone");
                }
            }
            if (item1.equals("Symbol") || item2.equals("Symbol") || item3.equals("Symbol") || item4.equals("Symbol") || item5.equals("Symbol")) {
                if ((enemy.equals("Demon") || enemy.equals("Golem")) || temp > 31) {
                    System.out.println("Symbol");
                    outputs.add("Symbol");
                }
            }
            if (item1.equals("Ticket") || item2.equals("Ticket") || item3.equals("Ticket") || item4.equals("Ticket") || item5.equals("Ticket")) {
                if (((ft == 4 && in > 5) || ft > 4) && (grav > 9.1 && grav < 10.5)) {
                    System.out.println("Ticket");
                    outputs.add("Ticket");
                }
            }
            if (item1.equals("Trophy") || item2.equals("Trophy") || item3.equals("Trophy") || item4.equals("Trophy") || item5.equals("Trophy")) {
                if (str > firstDigit || enemy.equals("Troll")) {
                    System.out.println("Trophy");
                    outputs.add("Trophy");
                }
            }
            // Get enemy stats
            int enemySTR = 0;
            int enemyDEX = 0;
            int enemyINT = 0;
            switch (enemy) {
                case "Demon":
                    enemySTR = 50;
                    enemyDEX = 50;
                    enemyINT = 50;
                    break;
                case "Dragon":
                    enemySTR = 10;
                    enemyDEX = 11;
                    enemyINT = 13;
                    break;
                case "Eagle":
                    enemySTR = 4;
                    enemyDEX = 7;
                    enemyINT = 3;
                    break;
                case "Goblin":
                    enemySTR = 3;
                    enemyDEX = 6;
                    enemyINT = 5;
                    break;
                case "Golem":
                    enemySTR = 9;
                    enemyDEX = 4;
                    enemyINT = 7;
                    break;
                case "Troll":
                    enemySTR = 8;
                    enemyDEX = 5;
                    enemyINT = 4;
                    break;
                case "Lizard":
                    enemySTR = 4;
                    enemyDEX = 6;
                    enemyINT = 3;
                    break;
                default:
                    enemySTR = 4;
                    enemyDEX = 3;
                    enemyINT = 8;
                    break;
            }
            // Calculate weapon scores and usages
            int wpn1score = 0;
            int wpn2score = 0;
            int wpn3score = 0;
            switch (wpn1) {
                case "Broadsword":
                    wpn1score = str - enemySTR;
                    break;
                case "Caber":
                    wpn1score = (str + 2) - enemySTR;
                    break;
                case "Nasty Knife":
                    wpn1score = dex - enemyDEX;
                    break;
                case "Longbow":
                    wpn1score = (dex + 2) - enemyDEX;
                    break;
                case "Magic orb":
                    wpn1score = Int - enemyINT;
                    break;
                default:
                    wpn1score = (Int + 2) - enemyINT;
                    break;
            }
            switch (wpn2) {
                case "Broadsword":
                    wpn2score = str - enemySTR;
                    break;
                case "Caber":
                    wpn2score = (str + 2) - enemySTR;
                    break;
                case "Nasty Knife":
                    wpn2score = dex - enemyDEX;
                    break;
                case "Longbow":
                    wpn2score = (dex + 2) - enemyDEX;
                    break;
                case "Magic orb":
                    wpn2score = Int - enemyINT;
                    break;
                default:
                    wpn2score = (Int + 2) - enemyINT;
                    break;
            }
            switch (wpn3) {
                case "Broadsword":
                    wpn3score = str - enemySTR;
                    break;
                case "Caber":
                    wpn3score = (str + 2) - enemySTR;
                    break;
                case "Nasty Knife":
                    wpn3score = dex - enemyDEX;
                    break;
                case "Longbow":
                    wpn3score = (dex + 2) - enemyDEX;
                    break;
                case "Magic orb":
                    wpn3score = Int - enemyINT;
                    break;
                default:
                    wpn3score = (Int + 2) - enemyINT;
                    break;
            }
            System.out.println("Weapon 1 score - " + wpn1score);
            System.out.println("Weapon 2 score - " + wpn2score);
            System.out.println("Weapon 3 socre - " + wpn3score);
            String correctWeapon = "";
            if (wpn1score > wpn2score && wpn1score > wpn3score) {
                correctWeapon = wpn1;
            } else if (wpn2score > wpn1score && wpn2score > wpn3score) {
                correctWeapon = wpn2;
            } else {
                correctWeapon = wpn3;
            }
            System.out.println("Calculated correct weapon: " + correctWeapon);
            outputs.add(correctWeapon);
            String[] outputss = outputs.toArray(new String[0]);
            String output = Arrays.toString(outputss);
            // remove [ and ] characters
            char[] ca = regx.toCharArray();
            for (char c : ca) {
                output = output.replace(""+c, "");
            }
            outputText.setText(output);
        });
        // Reset button
        resetButton.addActionListener((ActionEvent e) -> {
            enemyCB.setSelectedItem("Demon");
            strTB.setText("");
            dexTB.setText("");
            intTB.setText("");
            ftTB.setText("");
            inTB.setText("");
            tempTB.setText("");
            gravTB.setText("");
            presTB.setText("");
            itemCB1.setSelectedItem("");
            itemCB2.setSelectedItem("");
            itemCB3.setSelectedItem("");
            itemCB4.setSelectedItem("");
            itemCB5.setSelectedItem("");
            wpnCB1.setSelectedItem("");
            wpnCB2.setSelectedItem("");
            wpnCB3.setSelectedItem("");
            outputText.setText("");
        });
    }
}
