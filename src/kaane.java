/**
 * KAaNE Java Edition
 * 
 * Started the project on June 16, 2018 at around 5:35 AM.
 * 
 * Current Version: 0.7.1 (β)
 *
 * Credits can be found on www.github.com/GamingGuyTyler/KAaNE-JE-/wiki/Credits
 *
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import org.jdesktop.swingx.autocomplete.*;

class kaane {
    static JFrame f;
    AutoCompleteDecorator decorator;
    public static void main(String[] args) {
        // Define JFrame stuff
        f = new JFrame("KAaNE");
        ImageIcon icon = new ImageIcon("imgs/icons/KAaNE logo.png");
        f.setIconImage(icon.getImage());
        // Define the Welcome Text
        final JLabel welcome = new JLabel();
        welcome.setBounds(10,10,350,50);
        welcome.setText("<html>Welcome to KAaNE [Java Ed.]! Select a Module below!<br/>MAKE SURE TO SET THE EDGEWORK SETTINGS BEFORE ANYTHING ELSE!</html>");
        // Define the Button
        JButton b=new JButton("OK");
        b.setBounds(225,70,75,20);
        // Define the Combo Box
        String modules[]={"","Settings", "Custom Modloader", // KAaNE menus
                "Wires","Button","Keypad","Simon Says", // vanilla
                "Who's on First","Memory","Morse Code","Complicated Wires","Wire Sequences",
                "Mazes","Passwords","Needy Gas","Capciator Discharge","Needy Knobs",
                "101 Dalmatians","3D Maze","3D Tunnels","aa","Accumulation","Adjacent Letters", // mods
                "Adventure Game","Air Traffic Controller","Alchemy","Algebra","Alphabet","Alphabet Numbers",
                "Anagrams","Adv. Vent Gas","Astrology","Backgrounds","Bases","Battleship",
                "Benedict Cumberbatch","Big Circle","Binary LEDs","Bitmaps","Bitwise Operations","Unfair Cipher",
                "Word Scramble"};
        final JComboBox<String> cb=new JComboBox<>(modules);
        cb.setBounds(50,70,175,20);
        // Do the cool autocomplete stuff
        // Dev note: Looks like this is a bit buggy. If anyone can fix it up, i'd be grateful.
        AutoCompleteDecorator.decorate(cb);
        // Define more JFrame stuff
        f.add(cb); f.add(b); f.add(welcome);
        f.setLayout(null);
        f.setSize(350,150);
        f.setResizable(false);
        f.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Wait till the user actually does stuff
        b.addActionListener((ActionEvent e) -> {
            String x = cb.getItemAt(cb.getSelectedIndex());
            // Modules start below
            switch (x) {
                case "Settings": settings.menu(); break;
                case "Custom Modloader":  modloader.menu(); break;
                case "Wires": wires.module(); break;
                case "Button": button.module(); break;
                case "Keypad": keypad.module(); break;
                case "Simon Says": simonSays.module(); break;
                case "Who's on First": whosOnFirst.module(); break;
                case "Memory": memory.module(); break;
                case "Morse Code": morseCode.module(); break;
                case "Complicated Wires": complicatedWires.module(); break;
                case "Wire Sequences": wireSequences.module(); break;
                case "Mazes": mazes.module(); break;
                case "Passwords": passwords.module(); break;
                case "Needy Gas": needyGas.module(); break;
                case "Capciator Discharge": needyCD.module(); break;
                case "Needy Knobs": needyKnobs.module(); break;
                case "Adventure Game": adventureGame.module(); break;
                case "Algebra": algebra.module(); break;
                case "Alphabet": alphabet.module(); break;
                case "Alphabet Numbers": alphabetNumbers.module(); break;
                case "3D Maze": maze3D.module(); break;
                case "Adjacent Letters": adjacentLetters.module(); break;
                case "Anagrams": anagrams.module(); break;
                case "Word Scramble": wordScramble.module(); break;
                case "Adv. Vent Gas": advancedVentingGas.module(); break;
                case "Astrology": astrology.module(); break;
                case "Backgrounds": backgrounds.module(); break;
                case "3D Tunnels": threeDTunnels.module(); break;
                case "Bases": bases.module(); break;
                case "Battleship": battleship.module(); break;
                case "Accumulation": accumulation.module(); break;
                case "101 Dalmatians": dalmatians.module(); break;
                case "Benedict Cumberbatch": benedictCumberbatch.module(); break;
                case "Big Circle": bigCircle.module(); break;
                case "Air Traffic Controller": atc.module(); break;
                case "Alchemy": alchemy.module(); break;
                case "Binary LEDs": binaryLED.module(); break;
                case "aa": aa.module(); break;
                case "Bitmaps": bitmaps.module(); break;
                case "Bitwise Operations": bitwiseOperations.module(); break;
                case "Unfair Cipher": unfairCipher.module(); break;
            }
        });
    }
}