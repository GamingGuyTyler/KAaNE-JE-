/**
 * Astrology, started work on 8/1/2018 7:46 PM
 * 
 * Finished version 0.1 on 8/6/2018 5:02 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class astrology {
    static JFrame f;
    public static void module() {
        System.out.println("[ASTROLOGY]");
        f = new JFrame("KAaNE [ASTROLOGY]");
        ImageIcon icon = new ImageIcon("imgs/icons/astrology.png");
        f.setIconImage(icon.getImage());
        // Grab the config stuff
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR CODE #0017");
            System.out.println("Config file could not be found!");
            System.out.println("Ignoring...");
        } catch (IOException ex) {
            System.out.println("ERROR CODE #0018");
            System.out.println("IO Exception while trying to load file!");
            System.out.println("Ignoring...");
        }
        // Define the icons
        Map<Object, Icon> icons1 = new HashMap<>();
        Map<Object, Icon> icons2 = new HashMap<>();
        Map<Object, Icon> icons3 = new HashMap<>();
        ImageIcon iconE1 = new ImageIcon("imgs/astrology/e_air.png");
        ImageIcon iconE2 = new ImageIcon("imgs/astrology/e_earth.png");
        ImageIcon iconE3 = new ImageIcon("imgs/astrology/e_fire.png");
        ImageIcon iconE4 = new ImageIcon("imgs/astrology/e_water.png");
        ImageIcon iconP1 = new ImageIcon("imgs/astrology/p_jupiter.png");
        ImageIcon iconP2 = new ImageIcon("imgs/astrology/p_mars.png");
        ImageIcon iconP3 = new ImageIcon("imgs/astrology/p_mercury.png");
        ImageIcon iconP4 = new ImageIcon("imgs/astrology/p_moon.png");
        ImageIcon iconP5 = new ImageIcon("imgs/astrology/p_neptune.png");
        ImageIcon iconP6 = new ImageIcon("imgs/astrology/p_pluto.png");
        ImageIcon iconP7 = new ImageIcon("imgs/astrology/p_saturn.png");
        ImageIcon iconP8 = new ImageIcon("imgs/astrology/p_sun.png");
        ImageIcon iconP9 = new ImageIcon("imgs/astrology/p_uranus.png");
        ImageIcon iconP10 = new ImageIcon("imgs/astrology/p_venus.png");
        ImageIcon iconZ1 = new ImageIcon("imgs/astrology/a_aquarius.png");
        ImageIcon iconZ2 = new ImageIcon("imgs/astrology/a_aries.png");
        ImageIcon iconZ3 = new ImageIcon("imgs/astrology/a_cancer.png");
        ImageIcon iconZ4 = new ImageIcon("imgs/astrology/a_capricorn.png");
        ImageIcon iconZ5 = new ImageIcon("imgs/astrology/a_gemini.png");
        ImageIcon iconZ6 = new ImageIcon("imgs/astrology/a_leo.png");
        ImageIcon iconZ7 = new ImageIcon("imgs/astrology/a_libra.png");
        ImageIcon iconZ8 = new ImageIcon("imgs/astrology/a_pisces.png");
        ImageIcon iconZ9 = new ImageIcon("imgs/astrology/a_sagittarius.png");
        ImageIcon iconZ10 = new ImageIcon("imgs/astrology/a_scorpio.png");
        ImageIcon iconZ11 = new ImageIcon("imgs/astrology/a_taurus.png");
        ImageIcon iconZ12 = new ImageIcon("imgs/astrology/a_virgo.png");
        icons1.put("Air",iconE1);
        icons1.put("Earth",iconE2);
        icons1.put("Fire",iconE3);
        icons1.put("Water",iconE4);
        icons2.put("Jupiter",iconP1);
        icons2.put("Mars",iconP2);
        icons2.put("Mercury",iconP3);
        icons2.put("Moon",iconP4);
        icons2.put("Neptune",iconP5);
        icons2.put("Pluto",iconP6);
        icons2.put("Saturn",iconP7);
        icons2.put("Sun",iconP8);
        icons2.put("Uranus",iconP9);
        icons2.put("Venus",iconP10);
        icons3.put("Aquarius",iconZ1);
        icons3.put("Aries",iconZ2);
        icons3.put("Cancer",iconZ3);
        icons3.put("Capricorn",iconZ4);
        icons3.put("Gemini",iconZ5);
        icons3.put("Leo",iconZ6);
        icons3.put("Libra",iconZ7);
        icons3.put("Pisces",iconZ8);
        icons3.put("Sagittarius",iconZ9);
        icons3.put("Scorpio",iconZ10);
        icons3.put("Taurus",iconZ11);
        icons3.put("Virgo",iconZ12);
        // Define the CBs
        JComboBox<String> elementCB = new JComboBox(new Object[] {"Air","Earth","Fire","Water"});
        elementCB.setRenderer(new IconListRenderer(icons1));
        elementCB.setBounds(10,10,150,50);
        JComboBox<String> planetCB = new JComboBox(new Object[] {"Jupiter","Mars","Mercury","Moon","Neptune","Pluto","Saturn","Sun","Uranus","Venus"});
        planetCB.setRenderer(new IconListRenderer(icons2));
        planetCB.setBounds(170,10,150,50);
        JComboBox<String> zodiacCB = new JComboBox(new Object[] {"Aquarius","Aries","Cancer","Capricorn","Gemini","Leo","Libra","Pisces","Sagittarius","Scorpio","Taurus","Virgo"});
        zodiacCB.setRenderer(new IconListRenderer(icons3));
        zodiacCB.setBounds(330,10,150,50);
        // Define the button
        JButton button = new JButton("OK");
        button.setBounds(210,70,75,20);
        // Define output label
        JLabel output = new JLabel();
        output.setBounds(212,100,80,20);
        // Add everything
        f.add(elementCB); f.add(planetCB); f.add(zodiacCB); f.add(button); f.add(output);
        // Define JFrame
        f.setLayout(null);
        f.setSize(495,155);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            // Define variables
            String element = elementCB.getItemAt(elementCB.getSelectedIndex());
            String planet = planetCB.getItemAt(planetCB.getSelectedIndex());
            String zodiac = zodiacCB.getItemAt(zodiacCB.getSelectedIndex());
            int omen = 0;
            String sn1 = props.getProperty("sn1");
            String sn2 = props.getProperty("sn2");
            String sn3 = props.getProperty("sn3");
            String sn4 = props.getProperty("sn4");
            String sn5 = props.getProperty("sn5");
            String sn6 = props.getProperty("sn6");
            String[] sn = {sn1,sn2,sn3,sn4,sn5,sn6};
            // Compare with other symbols
            switch (element) {
                case "Fire": switch (planet) {
                    case "Mercury": omen = omen + 1; break;
                    case "Venus": omen = omen - 1; break;
                    case "Jupiter": omen = omen + 1; break;
                    case "Saturn": omen = omen - 2; break;
                    case "Uranus": omen = omen + 2; break;
                    case "Pluto": omen = omen - 1; break;}
                    break;
                case "Water": switch (planet) {
                    case "Sun": omen = omen - 2; break;
                    case "Mercury": omen = omen - 1; break;
                    case "Mars": omen = omen + 2; break;
                    case "Saturn": omen = omen - 2; break;
                    case "Uranus": omen = omen + 2; break;
                    case "Pluto": omen = omen + 1; break;}
                    break;
                case "Earth": switch (planet) {
                    case "Sun": omen = omen - 1; break;
                    case "Moon": omen = omen - 1; break;
                    case "Venus": omen = omen - 1; break;
                    case "Mars": omen = omen + 1; break;
                    case "Jupiter": omen = omen + 2; break;
                    case "Uranus": omen = omen + 2; break;
                    case "Neptune": omen = omen + 1; break;
                    case "Pluto": omen = omen - 2; break;}
                    break;
                default: switch (planet) {
                    case "Sun": omen = omen - 1; break;
                    case "Moon": omen = omen + 2; break;
                    case "Mercury": omen = omen - 1; break;
                    case "Mars": omen = omen - 2; break;
                    case "Jupiter": omen = omen - 1; break;
                    case "Uranus": omen = omen + 2; break;
                    case "Neptune": omen = omen - 2; break;
                    case "Pluto": omen = omen + 2; break;}
                    break;
            } switch (element) {
                case "Fire": switch(zodiac) {
                    case "Aries": omen = omen + 1; break;
                    case "Gemini": omen = omen - 1; break;
                    case "Virgo": omen = omen + 2; break;
                    case "Libra": omen = omen + 2; break;
                    case "Sagittarius": omen = omen + 1; break;
                    case "Aquarius": omen = omen + 1; break;}
                    break;
                case "Water": switch(zodiac) {
                    case "Aries": omen = omen + 2; break;
                    case "Taurus": omen = omen + 2; break;
                    case "Gemini": omen = omen - 1; break;
                    case "Cancer": omen = omen + 2; break;
                    case "Leo": omen = omen - 1; break;
                    case "Virgo": omen = omen - 1; break;
                    case "Libra": omen = omen - 2; break;
                    case "Scorpio": omen = omen + 1; break;
                    case "Sagittarius": omen = omen + 2; break;
                    case "Pisces": omen = omen + 2; break;}
                    break;
                case "Earth": switch(zodiac) {
                    case "Aries": omen = omen - 2; break;
                    case "Taurus": omen = omen - 1; break;
                    case "Leo": omen = omen + 1; break;
                    case "Libra": omen = omen + 1; break;
                    case "Scorpio": omen = omen + 2; break;
                    case "Sagittarius": omen = omen - 1; break;
                    case "Capricorn": omen = omen - 2; break;
                    case "Aquarius": omen = omen + 1; break;
                    case "Pisces": omen = omen + 1; break;}
                    break;
                default: switch (zodiac) {
                    case "Aries": omen = omen + 1; break;
                    case "Taurus": omen = omen + 1; break;
                    case "Gemini": omen = omen - 2; break;
                    case "Cancer": omen = omen - 2; break;
                    case "Leo": omen = omen + 2; break;
                    case "Libra": omen = omen - 1; break;
                    case "Scorpio": omen = omen + 1; break;
                    case "Aquarius": omen = omen - 1; break;
                    case "Pisces": omen = omen - 1; break;}
                    break;
            } switch (planet) {
                case "Sun": switch (zodiac) {
                    case "Aries": omen = omen - 1; break;
                    case "Taurus": omen = omen - 1; break;
                    case "Gemini": omen = omen + 2; break;
                    case "Leo": omen = omen - 1; break;
                    case "Libra": omen = omen - 1; break;
                    case "Scorpio": omen = omen + 1; break;
                    case "Aquarius": omen = omen + 1; break;}
                    break;
                case "Moon": switch (zodiac) {
                    case "Aries": omen = omen - 2; break;
                    case "Gemini": omen = omen + 1; break;
                    case "Leo": omen = omen - 1; break;
                    case "Libra": omen = omen - 1; break;
                    case "Scorpio": omen = omen + 1; break;
                    case "Sagittarius": omen = omen + 2; break;
                    case "Aquarius": omen = omen + 1; break;}
                    break;
                case "Mercury": switch (zodiac) {
                    case "Aries": omen = omen - 2; break;
                    case "Taurus": omen = omen - 2; break;
                    case "Gemini": omen = omen - 1; break;
                    case "Cancer": omen = omen - 1; break;
                    case "Leo": omen = omen + 1; break;
                    case "Virgo": omen = omen - 1; break;
                    case "Scorpio": omen = omen - 2; break;
                    case "Aquarius": omen = omen - 1; break;
                    case "Pisces": omen = omen + 1; break;}
                    break;
                case "Venus": switch (zodiac) {
                    case "Aries": omen = omen - 2; break;
                    case "Taurus": omen = omen + 2; break;
                    case "Gemini": omen = omen - 2; break;
                    case "Virgo": omen = omen + 1; break;
                    case "Libra": omen = omen - 1; break;
                    case "Sagittarius": omen = omen + 2; break;
                    case "Capricorn": omen = omen - 2; break;
                    case "Aquarius": omen = omen - 1; break;
                    case "Pisces": omen = omen + 1; break;}
                    break;
                case "Mars": switch (zodiac) {
                    case "Aries": omen = omen - 2; break;
                    case "Gemini": omen = omen - 1; break;
                    case "Cancer": omen = omen - 2; break;
                    case "Leo": omen = omen - 2; break;
                    case "Virgo": omen = omen - 2; break;
                    case "Libra": omen = omen - 1; break;
                    case "Scorpio": omen = omen + 1; break;
                    case "Sagittarius": omen = omen + 1; break;
                    case "Capricorn": omen = omen + 1; break;
                    case "Pisces": omen = omen - 1; break;}
                    break;
                case "Jupiter": switch (zodiac) {
                    case "Aries": omen = omen - 1; break;
                    case "Taurus": omen = omen - 2; break;
                    case "Gemini": omen = omen + 1; break;
                    case "Cancer": omen = omen - 1; break;
                    case "Scorpio": omen = omen + 1; break;
                    case "Capricorn": omen = omen - 1; break;
                    case "Aquarius": omen = omen + 2; break;}
                    break;
                case "Saturn": switch (zodiac) {
                    case "Aries": omen = omen - 1; break;
                    case "Taurus": omen = omen - 1; break;
                    case "Leo": omen = omen + 1; break;
                    case "Virgo": omen = omen + 1; break;
                    case "Aquarius": omen = omen - 1; break;
                    case "Pisces": omen = omen - 1; break;}
                    break;
                case "Uranus": switch (zodiac) {
                    case "Aries": omen = omen - 1; break;
                    case "Taurus": omen = omen + 2; break;
                    case "Leo": omen = omen + 1; break;
                    case "Virgo": omen = omen - 2; break;
                    case "Libra": omen = omen + 1; break;
                    case "Sagittarius": omen = omen + 2; break;
                    case "Capricorn": omen = omen - 1; break;
                    case "Aquarius": omen = omen + 1; break;}
                    break;
                // Neptune best nep
                case "Neptune": switch (zodiac) {
                    case "Aries": omen = omen + 1; break;
                    case "Gemini": omen = omen + 2; break;
                    case "Cancer": omen = omen + 1; break;
                    case "Leo": omen = omen - 1; break;
                    case "Virgo": omen = omen + 1; break;
                    case "Libra": omen = omen + 1; break;
                    case "Scorpio": omen = omen + 1; break;
                    case "Capricorn": omen = omen - 2; break;
                    case "Aquarius": omen = omen + 2; break;}
                    break;
                default: switch (zodiac) {
                    case "Aries": omen = omen - 1; break;
                    case "Cancer": omen = omen - 1; break;
                    case "Leo": omen = omen - 2; break;
                    case "Virgo": omen = omen + 1; break;
                    case "Libra": omen = omen + 2; break;
                    case "Scorpio": omen = omen + 1; break;
                    case "Sagittarius": omen = omen + 1; break;
                    case "Pisces": omen = omen - 1; break;}
                    break;
            }
            System.out.println("Omen score after comparing symbols: " + omen);
            // Uppercase symbols so comparing works
            element = element.toUpperCase();
            planet = planet.toUpperCase();
            zodiac = zodiac.toUpperCase();
            // Compare symbols with SN
            boolean test = false;
            // Code by Abhishek on Stack Overflow
            for(String temp:sn) {
                if (element.contains(temp)) {
                    test = true;
                    break;
                }
            }
            if (test) {
                omen = omen + 1;
                System.out.println("Element symbol has a letter common with SN.");
            } else {
                omen = omen - 1;
                System.out.println("Element symbol does not have a letter common with SN.");
            }
            test = false;
            for(String temp:sn) {
                if (planet.contains(temp)) {
                    test = true;
                    break;
                }
            }
            if (test) {
                omen = omen + 1;
                System.out.println("Planet symbol has a letter common with SN.");
            } else {
                omen = omen - 1;
                System.out.println("Planet symbol does not have a letter common with SN.");
            }
            test = false;
            for(String temp:sn) {
                if (zodiac.contains(temp)) {
                    test = true;
                    break;
                }
            }
            if (test) {
                omen = omen + 1;
                System.out.println("Zodiac symbol has a letter common with SN.");
            } else {
                omen = omen - 1;
                System.out.println("Zodiac symbol does not have a letter common with SN.");
            }
            System.out.println("Final omen score: " + omen);
            // Check omen score
            if (omen == 0) {output.setText("NO OMEN"); System.out.println("NO OMEN"); output.setBounds(222,100,80,20);}
            if (omen > 0) {output.setText("GOOD OMEN ON " + omen); System.out.println("GOOD OMEN ON " + omen); output.setBounds(197,100,110,20);}
            if (omen < 0) {output.setText("POOR OMEN ON " + Math.abs(omen)); System.out.println("POOR OMEN ON " + Math.abs(omen)); output.setBounds(197,100,110,20);}
        });
    }
}
