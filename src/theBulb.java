/**
 * The Bulb
 *
 * Started work on 6/16/2019 12:44 AM
 *
 * Finished version 0.1 on 2:38 AM
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class theBulb {
    static JFrame f;
    private static int stage = 1;
    private static boolean pressI = false;
    private static char prevBtn;
    private static char step1Btn;
    private static char step23Btn;
    private static ArrayList<String> stepSystem;
    private static String color;
    private static boolean clear;
    private static boolean light;
    private static Properties props;
    private static boolean answer;
    private static boolean answered = false;
    private static String remember;
    public static void module() {
        System.out.println("[THE BULB]");
        f = new JFrame("KAaNE [THE BULB]");
        ImageIcon icon = new ImageIcon("imgs/icons/The Bulb.png");
        f.setIconImage(icon.getImage());
        // Edgework
        File configFile = new File("config.properties");
        props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        // CB
        String[] colors = {"Blue","Red","Green","Yellow","White","Purple"};
        Arrays.sort(colors);
        JComboBox colorCB = new JComboBox(colors);
        colorCB.setBounds(5,5,60,20);
        // Label
        JLabel colorLabel = new JLabel("Color");
        colorLabel.setBounds(70,5,50,20);
        // CheckBox
        JCheckBox clearCB = new JCheckBox("See-Through?");
        clearCB.setBounds(5,25,120,20);
        JCheckBox lightCB = new JCheckBox("Light on?");
        lightCB.setBounds(5,45,100,20);
        // Buttons
        JButton button = new JButton("OK");
        button.setBounds(200,45,60,20);
        JButton yesBtn = new JButton("YES");
        yesBtn.setBounds(60,170,60,20);
        yesBtn.setEnabled(false);
        JButton noBtn = new JButton("NO");
        noBtn.setBounds(180,170,60,20);
        noBtn.setEnabled(false);
        // Output
        JTextArea output = new JTextArea("");
        output.setEditable(false);
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        JScrollPane sp = new JScrollPane(output);
        sp.setBounds(5,70,285,100);
        // Add
        f.add(colorCB); f.add(colorLabel);
        f.add(clearCB); f.add(lightCB);
        f.getContentPane().add(sp);
        f.add(button);
        f.add(yesBtn); f.add(noBtn);
        // Define JFrame
        f.setLayout(null);
        f.setSize(300,300);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            output.setText("");
            stage = 1;
            pressI = false;
            answered = false;
            color = (String) colorCB.getItemAt(colorCB.getSelectedIndex());
            clear = clearCB.isSelected();
            light = lightCB.isSelected();
            stepSystem = step1();
            String[] arr = new String[stepSystem.size()];
            arr = stepSystem.toArray(arr);
            for (String a : arr) {
                output.append(a + "\n");
            }
            if (stage == 5 || stage == 6 || stage == 12 || stage == 13) {
                yesBtn.setEnabled(true);
                noBtn.setEnabled(true);
            }
        });
        yesBtn.addActionListener((ActionEvent e) -> {
            answer = true;
            answered = true;
            ArrayList<String> blankArrList = new ArrayList<>();
            switch (stage) {
                case 5: stepSystem = step5(blankArrList); break;
                case 6: stepSystem = step6(blankArrList); break;
                case 12: stepSystem = step12(blankArrList); break;
                case 13: stepSystem = step13(blankArrList); break;
            }
            String[] arr = new String[stepSystem.size()];
            arr = stepSystem.toArray(arr);
            for (String a : arr) {
                output.append(a + "\n");
            }
        });
        noBtn.addActionListener((ActionEvent e) -> {
            answer = false;
            answered = true;
            ArrayList<String> blankArrList = new ArrayList<>();
            switch (stage) {
                case 5: stepSystem = step5(blankArrList); break;
                case 6: stepSystem = step6(blankArrList); break;
                case 12: stepSystem = step12(blankArrList); break;
                case 13: stepSystem = step13(blankArrList); break;
            }
            String[] arr = new String[stepSystem.size()];
            arr = stepSystem.toArray(arr);
            for (String a : arr) {
                output.append(a + "\n");
            }
        });
    }
    private static ArrayList<String> step1() {
        ArrayList<String> output = new ArrayList<>();
        System.out.println("Step 1");
        if (light && clear) {
            System.out.println("Press I ; Light + Clear");
            prevBtn = 'I';
            step1Btn = 'I';
            pressI = true;
            output.add("Press I");
            output = step2(output);
        } else if (light) {
            System.out.println("Press O ; Light");
            prevBtn = 'O';
            step1Btn = 'O';
            output.add("Press O");
            output = step3(output);
        } else {
            System.out.println("Unscrew ; No other conditions");
            output.add("Unscrew");
            output = step4(output);
        }
        return output;
    }
    private static ArrayList<String> step2(ArrayList<String> output) {
        System.out.println("Step 2");
        stage = 2;
        if (color.equals("Red")) {
            System.out.println("Press I, Unscrew ; Color Red");
            prevBtn = 'I';
            step23Btn = 'I';
            pressI = true;
            output.add("Press I");
            output.add("Unscrew");
            output = step5(output);
        } else if (color.equals("White")) {
            System.out.println("Press O, Unscrew ; Color White");
            prevBtn = 'O';
            step23Btn = 'O';
            output.add("Press O");
            output.add("Unscrew");
            output = step6(output);
        } else {
            System.out.println("Unscrew ; No other conditions");
            output.add("Unscrew");
            output = step7(output);
        }
        return output;
    }
    private static ArrayList<String> step3(ArrayList<String> output) {
        System.out.println("Step 3");
        stage = 3;
        if (color.equals("Green")) {
            System.out.println("Press I, Unscrew ; Color Green");
            prevBtn = 'I';
            step23Btn = 'I';
            pressI = true;
            output.add("Press I");
            output.add("Unscrew");
            output = step6(output);
        } else if (color.equals("Purple")) {
            System.out.println("Press O, Unscrew ; Color Purple");
            prevBtn = 'O';
            step23Btn = 'O';
            output = step5(output);
        } else {
            System.out.println("Unscrew ; No other conditions");
            output.add("Unscrew");
            output = step8(output);
        }
        return output;
    }
    private static ArrayList<String> step4(ArrayList<String> output) {
        System.out.println("Step 4");
        stage = 4;
        int car = Integer.parseInt(props.getProperty("car"));
        int ind = Integer.parseInt(props.getProperty("ind"));
        int msa = Integer.parseInt(props.getProperty("msa"));
        int snd = Integer.parseInt(props.getProperty("snd"));
        if (car == 1 || ind == 1 || msa == 1 || snd == 1) {
            System.out.println("Press I ; CAR/IND/MSA/SND exists");
            prevBtn = 'I';
            pressI = true;
            output.add("Press I");
            output = step9(output);
        } else {
            System.out.println("Press O ; No other conditions");
            prevBtn = 'O';
            output.add("Press O");
            output = step10(output);
        }
        return output;
    }
    private static ArrayList<String> step5(ArrayList<String> output) {
        stage = 5;
        if (!answered) {
            System.out.println("Step 5");
            System.out.println("Did light go off at step 1?");
            output.add("Did the light go off at the first instruction?");
        } else {
            if (answer) {
                System.out.println("Press prev btn, Screw ; Answer is YES");
                output.add("Press " + prevBtn);
                output.add("Screw");
            } else {
                System.out.println("Press unpressed btn, Screw ; Answer is NO");
                if (pressI) {
                    prevBtn = 'I';
                }
                else {
                    prevBtn = 'O';
                }
                output.add("Press " + prevBtn);
                output.add("Screw");
            }
        }
        return output;
    }
    private static ArrayList<String> step6(ArrayList<String> output) {
        stage = 6;
        if (!answered) {
            System.out.println("Step 6");
            System.out.println("Did light go off when press I?");
            output.add("Did the light go off when pressing I?");
        } else {
            if (answer) {
                System.out.println("Press " + step1Btn + ", Screw ; Answer is YES");
                output.add("Press " + step1Btn);
                output.add("Screw");
            } else {
                System.out.println("Press " + step23Btn + ", Screw ; Answer is NO");
                output.add("Press " + step23Btn);
                output.add("Screw");
            }
        }
        return output;
    }
    private static ArrayList<String> step7(ArrayList<String> output) {
        System.out.println("Step 7");
        stage = 7;
        if (color.equals("Green")) {
            System.out.println("Press I, Rem SIG ; Color Green");
            remember = "sig";
            output.add("Press I");
            output = step11(output);
        } else if (color.equals("Purple")) {
            System.out.println("Press I, Screw ; Color Purple");
            output.add("Press I");
            output.add("Screw");
            output = step12(output);
        } else if (color.equals("Blue")) {
            System.out.println("Press O, Rem CLR ; Color Blue");
            remember = "clr";
            output.add("Press O");
            output = step11(output);
        } else {
            System.out.println("Press O, Screw ; No other conditions");
            output.add("Press O");
            output.add("Screw");
            output = step13(output);
        }
        return output;
    }
    private static ArrayList<String> step8(ArrayList<String> output) {
        System.out.println("Step 8");
        stage = 8;
        if (color.equals("White")) {
            System.out.println("Press I, Rem FRQ ; Color White");
            remember = "frq";
            output.add("Press I");
            output = step11(output);
        } else if (color.equals("Red")) {
            System.out.println("Press I, Screw ; Color Red");
            output.add("Press I");
            output.add("Screw");
            output = step13(output);
        } else if (color.equals("Yellow")) {
            System.out.println("Press O, Rem FRK ; Color Yellow");
            remember = "frk";
            output.add("Press O");
            output = step11(output);
        } else {
            System.out.println("Press O, Screw ; No other conditions");
            output.add("Press O");
            output.add("Screw");
            output = step12(output);
        }
        return output;
    }
    private static ArrayList<String> step9(ArrayList<String> output) {
        System.out.println("Step 9");
        stage = 9;
        if (color.equals("Blue")) {
            System.out.println("Press I ; Color Blue");
            output.add("Press I");
            output = step14(output);
        } else if (color.equals("Green")) {
            System.out.println("Press I, Screw ; Color Green");
            output.add("Press I");
            output.add("Screw");
            output = step12(output);
        } else if (color.equals("Yellow")) {
            System.out.println("Press O ; Color Yellow");
            output.add("Press O");
            output = step15(output);
        } else if (color.equals("White")) {
            System.out.println("Press O, Screw ; Color White");
            output.add("Press O");
            output.add("Screw");
            output = step13(output);
        } else if (color.equals("Purple")) {
            System.out.println("Screw, Press I; Color Purple");
            output.add("Screw");
            output.add("Press I");
            output = step12(output);
        } else {
            System.out.println("Screw, Press O; No other conditions");
            output.add("Screw");
            output.add("Press O");
            output = step13(output);
        }
        return output;
    }
    private static ArrayList<String> step10(ArrayList<String> output) {
        System.out.println("Step 10");
        stage = 10;
        if (color.equals("Purple")) {
            System.out.println("Press I ; Color Purple");
            output.add("Press I");
            output = step14(output);
        } else if (color.equals("Red")) {
            System.out.println("Press I, Screw ; Color Red");
            output.add("Press I");
            output.add("Screw");
            output = step13(output);
        } else if (color.equals("Blue")) {
            System.out.println("Press O ; Color Blue");
            output.add("Press O");
            output = step15(output);
        } else if (color.equals("Yellow")) {
            System.out.println("Press O, Screw ; Color Yellow");
            output.add("Press O");
            output.add("Screw");
            output = step12(output);
        } else if (color.equals("Green")) {
            System.out.println("Screw, Press I; Color Green");
            output.add("Screw");
            output.add("Press I");
            output = step13(output);
        } else {
            System.out.println("Screw, Press O; No other conditions");
            output.add("Screw");
            output.add("Press O");
            output = step12(output);
        }
        return output;
    }
    private static ArrayList<String> step11(ArrayList<String> output) {
        System.out.println("Step 11");
        stage = 11;
        int indicator = Integer.parseInt(props.getProperty(remember));
        if (indicator == 1) {
            System.out.println("Press I, Screw ; Bomb has rem indicator");
            output.add("Press I");
            output.add("Screw");
        } else {
            System.out.println("Press O, Screw ; No other conditions");
            output.add("Press O");
            output.add("Screw");
        }
        return output;
    }
    private static ArrayList<String> step12(ArrayList<String> output) {
        System.out.println("Step 12");
        stage = 12;
        if (!answered) {
            System.out.println("Is light on?");
            output.add("Is the light now on?");
        } else {
            if (answer) {
                System.out.println("Press I ; Answer is YES");
                output.add("Press I");
            } else {
                System.out.println("Press O ; Answer is NO");
                output.add("Press O");
            }
        }
        return output;
    }
    private static ArrayList<String> step13(ArrayList<String> output) {
        System.out.println("Step 13");
        stage = 13;
        if (!answered) {
            System.out.println("Is light on?");
            output.add("Is the light now on?");
        } else {
            if (answer) {
                System.out.println("Press O ; Answer is YES");
                output.add("Press O");
            } else {
                System.out.println("Press I ; Answer is NO");
                output.add("Press I");
            }
        }
        return output;
    }
    private static ArrayList<String> step14(ArrayList<String> output) {
        System.out.println("Step 14");
        stage = 14;
        if (!clear) {
            System.out.println("Press I, Screw ; Opaque");
            output.add("Press I");
            output.add("Screw");
        } else {
            System.out.println("Press O, Screw ; No other conditions");
            output.add("Press O");
            output.add("Screw");
        }
        return output;
    }
    private static ArrayList<String> step15(ArrayList<String> output) {
        System.out.println("Step 15");
        stage = 15;
        if (clear) {
            System.out.println("Press I, Screw ; Clear");
            output.add("Press I");
            output.add("Screw");
        } else {
            System.out.println("Press O, Screw ; No other conditions");
            output.add("Press O");
            output.add("Screw");
        }
        return output;
    }
}
