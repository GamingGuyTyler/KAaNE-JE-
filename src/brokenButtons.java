/**
 * Broken Buttons
 *
 * Started work on 6/15/2019 9:16 PM
 *
 * Finished work on 6/16/2019 12:00 AM
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import org.jdesktop.swingx.autocomplete.*;

public class brokenButtons {
    static JFrame f;
    private static int pressed = 0;
    private static String submit = "L";
    private static boolean letterE = false;
    public static void module() {
        System.out.println("[BROKEN BUTTONS]");
        f = new JFrame("KAaNE [BROKEN BTNS]");
        ImageIcon icon = new ImageIcon("imgs/icons/Broken Buttons.png");
        f.setIconImage(icon.getImage());
        // Ensure it's reset
        pressed = 0;
        submit = "L";
        letterE = false;
        // CB
        String[] words = {"BOMB","BLAST","BOOM","BURST", // Explosions
        "WIRE","BUTTON","MODULE","LIGHT","LED","SWITCH","RJ-45","DVI-D","RCA","PS/2","SERIAL","PORT", // Bomb Components
        "ROW","COLUMN","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","SIZE", // Descriptions
        "THIS","THAT","OTHER","SUBMIT","ABORT","DROP","THING","BLANK","","BROKEN","TOO","TO","YES", // Misc
        "SEE","SEA","C","WAIT","WORD","BOB","NO","NOT","FIRST","HOLD","LATE","FAIL"};
        Arrays.sort(words);
        JComboBox btn1CB = new JComboBox(words);
        btn1CB.setBounds(5,5,70,20);
        AutoCompleteDecorator.decorate(btn1CB);
        JComboBox btn2CB = new JComboBox(words);
        btn2CB.setBounds(75,5,70,20);
        AutoCompleteDecorator.decorate(btn2CB);
        JComboBox btn3CB = new JComboBox(words);
        btn3CB.setBounds(145,5,70,20);
        AutoCompleteDecorator.decorate(btn3CB);
        JComboBox btn4CB = new JComboBox(words);
        btn4CB.setBounds(5,25,70,20);
        AutoCompleteDecorator.decorate(btn4CB);
        JComboBox btn5CB = new JComboBox(words);
        btn5CB.setBounds(75,25,70,20);
        AutoCompleteDecorator.decorate(btn5CB);
        JComboBox btn6CB = new JComboBox(words);
        btn6CB.setBounds(145,25,70,20);
        AutoCompleteDecorator.decorate(btn6CB);
        JComboBox btn7CB = new JComboBox(words);
        btn7CB.setBounds(5,45,70,20);
        AutoCompleteDecorator.decorate(btn7CB);
        JComboBox btn8CB = new JComboBox(words);
        btn8CB.setBounds(75,45,70,20);
        AutoCompleteDecorator.decorate(btn8CB);
        JComboBox btn9CB = new JComboBox(words);
        btn9CB.setBounds(145,45,70,20);
        AutoCompleteDecorator.decorate(btn9CB);
        JComboBox btn10CB = new JComboBox(words);
        btn10CB.setBounds(5,65,70,20);
        AutoCompleteDecorator.decorate(btn10CB);
        JComboBox btn11CB = new JComboBox(words);
        btn11CB.setBounds(75,65,70,20);
        AutoCompleteDecorator.decorate(btn11CB);
        JComboBox btn12CB = new JComboBox(words);
        btn12CB.setBounds(145,65,70,20);
        AutoCompleteDecorator.decorate(btn12CB);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(215,65,80,20);
        JButton reset = new JButton("RESET");
        reset.setBounds(215,45,80,20);
        JButton pressIfLetterE = new JButton("<html><center>PRESS HAS E</center></html>");
        pressIfLetterE.setBounds(215,5,80,40);
        // Output
        JTextArea output = new JTextArea("");
        output.setEditable(false);
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        // output.setBounds(5,90,285,76);
        JScrollPane sp = new JScrollPane(output);
        sp.setBounds(5,90,285,76);
        // Add
        f.add(btn1CB);  f.add(btn2CB);  f.add(btn3CB);
        f.add(btn4CB);  f.add(btn5CB);  f.add(btn6CB);
        f.add(btn7CB);  f.add(btn8CB);  f.add(btn9CB);
        f.add(btn10CB); f.add(btn11CB); f.add(btn12CB);
        f.add(button); f.add(reset); f.add(pressIfLetterE);
        f.getContentPane().add(sp);
        // Define JFrame
        f.setLayout(null);
        f.setSize(300,200);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            if (pressed == 5) {
                output.append("-------------------\n");
                submit = (submit.equals("L")) ? "left" : "right";
                System.out.println("Pressed 5 Buttons, correct submit is " + submit);
                output.append("Press the " + submit + " submit button\n");
            }
            else {
                // Get buttons
                String btn1Str = (String) btn1CB.getItemAt(btn1CB.getSelectedIndex());
                String btn2Str = (String) btn2CB.getItemAt(btn2CB.getSelectedIndex());
                String btn3Str = (String) btn3CB.getItemAt(btn3CB.getSelectedIndex());
                String btn4Str = (String) btn4CB.getItemAt(btn4CB.getSelectedIndex());
                String btn5Str = (String) btn5CB.getItemAt(btn5CB.getSelectedIndex());
                String btn6Str = (String) btn6CB.getItemAt(btn6CB.getSelectedIndex());
                String btn7Str = (String) btn7CB.getItemAt(btn7CB.getSelectedIndex());
                String btn8Str = (String) btn8CB.getItemAt(btn8CB.getSelectedIndex());
                String btn9Str = (String) btn9CB.getItemAt(btn9CB.getSelectedIndex());
                String btn10Str = (String) btn10CB.getItemAt(btn10CB.getSelectedIndex());
                String btn11Str = (String) btn11CB.getItemAt(btn11CB.getSelectedIndex());
                String btn12Str = (String) btn12CB.getItemAt(btn12CB.getSelectedIndex());
                // (fix up null attributes since for some reason "" = null)
                btn1Str = btn1Str == null ? "" : btn1Str;
                btn2Str = btn2Str == null ? "" : btn2Str;
                btn3Str = btn3Str == null ? "" : btn3Str;
                btn4Str = btn4Str == null ? "" : btn4Str;
                btn5Str = btn5Str == null ? "" : btn5Str;
                btn6Str = btn6Str == null ? "" : btn6Str;
                btn7Str = btn7Str == null ? "" : btn7Str;
                btn8Str = btn8Str == null ? "" : btn8Str;
                btn9Str = btn9Str == null ? "" : btn9Str;
                btn10Str = btn10Str == null ? "" : btn10Str;
                btn11Str = btn11Str == null ? "" : btn11Str;
                btn12Str = btn12Str == null ? "" : btn12Str;
                if (pressed == 0) {
                    System.out.println("Button 1 - " + btn1Str);
                    System.out.println("Button 2 - " + btn2Str);
                    System.out.println("Button 3 - " + btn3Str);
                    System.out.println("Button 4 - " + btn4Str);
                    System.out.println("Button 5 - " + btn5Str);
                    System.out.println("Button 6 - " + btn6Str);
                    System.out.println("Button 7 - " + btn7Str);
                    System.out.println("Button 8 - " + btn8Str);
                    System.out.println("Button 9 - " + btn9Str);
                    System.out.println("Button 10 - " + btn10Str);
                    System.out.println("Button 11 - " + btn11Str);
                    System.out.println("Button 12 - " + btn12Str);
                }
                else {
                    output.append("-------------------\n");
                }
                String[] buttons = {btn1Str,btn2Str,btn3Str,
                                    btn4Str,btn5Str,btn6Str,
                                    btn7Str,btn8Str,btn9Str,
                                    btn10Str,btn11Str,btn12Str};
                String[][] buttonPos = {{btn1Str,btn2Str,btn3Str},
                                    {btn4Str,btn5Str,btn6Str},
                                    {btn7Str,btn8Str,btn9Str},
                                    {btn10Str,btn11Str,btn12Str}};
                // Get needed info from buttons
                // (Note: Converted from original code)
                ArrayList letterT = new ArrayList();
                for (int x = 0; x < 3; x++) {
                    String currBtn = buttonPos[0][x];
                    if (currBtn.length() > 0 && currBtn.charAt(0) == 'T')
                        letterT.add(currBtn);
                    currBtn = buttonPos[2][x];
                    if (currBtn.length() > 0 && currBtn.charAt(0) == 'T')
                        letterT.add(currBtn);
                }
                ArrayList lessThan3 = new ArrayList();
                for (String currBtn : buttons)
                    if (currBtn.length() < 3)
                        lessThan3.add(currBtn);
                ArrayList ports = new ArrayList();
                for (String currBtn : buttons)
                    if (currBtn.equals("RJ-45") || currBtn.equals("DVI-D") || currBtn.equals("RCA") ||
                    currBtn.equals("PS/2") || currBtn.equals("SERIAL"))
                        ports.add(currBtn);
                ArrayList sea = getButtons("SEA",buttons);
                ArrayList one = getButtons("ONE",buttons);
                ArrayList blank = getButtons("",buttons);
                ArrayList other = getButtons("OTHER",buttons);
                ArrayList<String> column = getButtons("COLUMN",buttons);
                ArrayList boom = getButtons("BOOM",buttons);
                ArrayList duplicates = getDuplicates(buttons);
                // Rule Logic
                if (sea.size() > 0) {
                    System.out.println("Press SEA (rule 1)");
                    output.append("Press SEA, then replace text and press OK on here\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (letterT.size() > 0) {
                    System.out.println("Press any word on 1st/3rd row that starts with T (rule 2)");
                    output.append("Press any word on the 1st/3rd row that starts with T, then replace text and press OK on here\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (getButtons("submit",buttons).size() > 0 && one.size() > 0) {
                    System.out.println("Press ONE (rule 3)");
                    output.append("Press ONE, then replace text and press OK on here\n");
                    submit = "L";
                    System.out.println("Submit button is now on the LEFT");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (blank.size() > 0) {
                    System.out.println("Press complete blank (rule 4)");
                    output.append("Press the completely blank button, then replace text and press OK on here\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (other.size() > 0) {
                    System.out.println("Press OTHER (rule 5)");
                    output.append("Press OTHER, then replace text and press OK on here\n");
                    submit = (submit.equals("L")) ? "R" : "L";
                    System.out.println("Submit button is now on the " + ((submit.equals("L")) ? "LEFT" : "RIGHT"));
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (duplicates.size() > 0) {
                    System.out.println("Press duplicate (rule 6)");
                    output.append("Press any duplicate word, then replace text and press OK on here\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if ((getButtons("PORT",buttons).size() > 0 || getButtons("MODULE",buttons).size() > 0) && ports.size() > 0) {
                    System.out.println("Press port name (rule 7)");
                    output.append("Press a port name, then replace text and press OK on here\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (lessThan3.size() > 0) {
                    System.out.println("Press < 3 letters (rule 8)");
                    output.append("Press any button that has < 3 letters, then replace text and press OK on here\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (getButtons("BOMB",buttons).size() > 0 && boom.size() > 0) {
                    System.out.println("Press BOOM (rule 9)");
                    output.append("Press BOOM, then replace text and press OK on here\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (getButtons("SUBMIT",buttons).size() > 0 && getButtons("BUTTON",buttons).size() > 0) {
                    submit = (submit.equals("L")) ? "left" : "right";
                    System.out.println("Press the " + submit + " submit button (rule 10)");
                    output.append("Press the " + submit + " submit button\n");
                }
                else if ((getButtons("SEVEN",buttons).size() > 0 || getButtons("TWO",buttons).size() > 0) && column.size() > 0) {
                    ArrayList<String> sol = new ArrayList();
                    String[] colArr = new String[column.size()];
                    colArr = column.toArray(colArr);
                    for (String currBtn : colArr) {
                        int z = getPos(currBtn,buttonPos);
                        for (int x = 0; x < 3; x++) {
                            sol.add(buttonPos[z-1][x]);
                        }
                    }
                    String[] solArr = new String[sol.size()];
                    solArr = sol.toArray(solArr);
                    System.out.println("Press any row that has a column button in it. (rule 11)");
                    System.out.println("[That would be either " + solArr[0] + ", " + solArr[1] + ", or " + solArr[2] + "]");
                    output.append("Press any row that has a column button in it, then replace text and press OK on here.\n");
                    output.append("(That would be either " + solArr[0] + ", "+ solArr[1] + ", or " + solArr[2] + ")\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else if (pressed == 0) {
                    String currBtn = buttonPos[1][2];
                    System.out.println("Press 3rd in 2nd row (" + currBtn + ") (rule 12)");
                    output.append("Press the 3rd button on the 2nd row (" + currBtn + "), then replace text and press OK on here\n");
                    pressed++;
                    System.out.println("Pressed: " + pressed);
                }
                else {
                    if (letterE) {
                        System.out.println("Submit on RIGHT (rule 13)");
                        submit = "R";
                    }
                    submit = (submit.equals("L")) ? "left" : "right";
                    System.out.println("Press the " + submit + " submit button (rule 14)");
                    output.append("Press the " + submit + " submit button\n");
                }
            }
        });
        reset.addActionListener((ActionEvent e) -> {
            System.out.println("RESET");
            btn1CB.setSelectedIndex(0);
            btn2CB.setSelectedIndex(0);
            btn3CB.setSelectedIndex(0);
            btn4CB.setSelectedIndex(0);
            btn5CB.setSelectedIndex(0);
            btn6CB.setSelectedIndex(0);
            btn7CB.setSelectedIndex(0);
            btn8CB.setSelectedIndex(0);
            btn9CB.setSelectedIndex(0);
            btn10CB.setSelectedIndex(0);
            btn11CB.setSelectedIndex(0);
            btn12CB.setSelectedIndex(0);
            output.setText("");
            pressed = 0;
            submit = "L";
            letterE = false;
        });
        pressIfLetterE.addActionListener((ActionEvent e) -> {
            // The sole purpose of this button is to make coding easier.
            if (pressed == 1) letterE = true;
        });
    }
    private static ArrayList getButtons(String Text,String[] Buttons) {
        ArrayList Found = new ArrayList();
        for (String button : Buttons)
            if (button.equals(Text))
                Found.add(button);
        return Found;
    }
    private static ArrayList getDuplicates(String[] buttons) {
        ArrayList dupeButtons = new ArrayList();
        for (int i = 0; i < buttons.length-1; i++)
            if (buttons[i].length() > 1)
                for (int j = i + 1; j < buttons.length; j++)
                    if (buttons[i].equals(buttons[j]))
                        dupeButtons.add(buttons[i]);
        return dupeButtons;
    }
    private static int getPos(String text, String[][] buttons) {
        for (int x = 0; x<4; x++)
            for (int y = 0; y<3; y++)
                if (text.equals(buttons[x][y]))
                    return y;
        return 0;
    }
}
