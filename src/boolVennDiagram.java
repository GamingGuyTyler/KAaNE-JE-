/**
 * Boolean Venn Diagram
 *
 * Started work on 1:55 AM 6/15/2019
 *
 * Finished on 4:00 AM 6/15/2019
 *
 * Version 0.1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class boolVennDiagram {
    static JFrame f;
    static int currParent = 0;
    static String[] expressions = {"∧","∨","⊻","→","|","↓","↔","←"};
    public static void module() {
        System.out.println("[BOOLEAN VENN DIAGRAM]");
        f = new JFrame("KAaNE [B.V.D.]");
        ImageIcon icon = new ImageIcon("imgs/icons/Boolean Venn Diagram.png");
        f.setIconImage(icon.getImage());
        // Text Field (for the expression)
        JTextField expressionOut = new JTextField("(A ∧ B) ∧ C");
        expressionOut.setBounds(5,5,100,20);
        expressionOut.setEditable(false);
        // CB
        String[] logicArr = {"∧ (AND)", "∨ (OR)","⊻ (XOR)","→ (IMPLIES)",
                "| (NAND)","↓ (NOR)","↔ (XNOR)","← (IMPLIED BY)"};
        JComboBox logicCB1 = new JComboBox(logicArr);
        logicCB1.setBounds(5,30,100,20);
        JComboBox logicCB2 = new JComboBox(logicArr);
        logicCB2.setBounds(5,50,100,20);
        // Labels
        JLabel logicLabel1 = new JLabel("A / B");
        logicLabel1.setBounds(110,30,50,20);
        JLabel logicLabel2 = new JLabel("AB / C");
        logicLabel2.setBounds(110,50,50,20);
        // Buttons
        JButton updateBtn = new JButton("UPDATE");
        updateBtn.setBounds(110,5,80,20);
        JButton changeBtn = new JButton("CHANGE ()");
        changeBtn.setBounds(190,5,100,20);
        JButton button = new JButton("OK");
        button.setBounds(230,50,60,20);
        // Output (TEMP)
        // TODO: Make a fancy image output system
        JTextField outNONE = new JTextField("NONE: FALSE");
        outNONE.setBounds(205,80,85,20);
        outNONE.setEditable(false);
        JTextField outC = new JTextField("C: FALSE");
        outC.setBounds(165,120,80,20);
        outC.setEditable(false);
        JTextField outB = new JTextField("B: FALSE");
        outB.setBounds(5,120,80,20);
        outB.setEditable(false);
        JTextField outBC = new JTextField("BC: FALSE");
        outBC.setBounds(85,120,80,20);
        outBC.setEditable(false);
        JTextField outA = new JTextField("A: FALSE");
        outA.setBounds(85,80,80,20);
        outA.setEditable(false);
        JTextField outAC = new JTextField("AC: FALSE");
        outAC.setBounds(165,100,80,20);
        outAC.setEditable(false);
        JTextField outAB = new JTextField("AB: FALSE");
        outAB.setBounds(5,100,80,20);
        outAB.setEditable(false);
        JTextField outABC = new JTextField("ABC: FALSE");
        outABC.setBounds(85,100,80,20);
        outABC.setEditable(false);
        // Add
        f.add(expressionOut);
        f.add(logicCB1); f.add(logicCB2);
        f.add(logicLabel1); f.add(logicLabel2);
        f.add(updateBtn); f.add(changeBtn);
        f.add(button);
        f.add(outNONE); f.add(outABC);
        f.add(outA); f.add(outB); f.add(outC);
        f.add(outAB); f.add(outAC); f.add(outBC);
        // Define JFrame
        f.setLayout(null);
        f.setSize(300,102);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Logic
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Expression: " + expressionOut.getText());
            // Mostly converted from original code
            int op1_i = logicCB1.getSelectedIndex();
            int op2_i = logicCB2.getSelectedIndex();
            int[] sol = new int[8];
            for (int i = 0; i < 2; i++) {
                if (currParent == 0) {
                    for (int j = 0; j < 2; j++) {
                        boolean r = OpDec(op1_i, i == 1, j == 1);
                        for (int k = 0; k < 2; k ++) {
                            sol[i * 4 + j * 2 + k] = OpDec(op2_i, r, k == 1) ? 1 : 2;
                        }
                    }
                } else {
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            boolean r = OpDec(op2_i, j == 1, k == 1);
                            sol[i * 4 + j * 2 + k] = OpDec(op1_i, i == 1, r) ? 1 : 2;
                        }
                    }
                }
            }
            String[] results = new String[8];
            for (int i = 0; i < 8; i++) {
                results[i] = sol[i] == 1 ? "TRUE" : "FALSE";
                System.out.println(results[i]);
            }
            outNONE.setText("NONE: " + results[0]);
            outC.setText("C: " + results[1]);
            outB.setText("B: " + results[2]);
            outBC.setText("BC: " + results[3]);
            outA.setText("A: " + results[4]);
            outAC.setText("AC: " + results[5]);
            outAB.setText("AB: " + results[6]);
            outABC.setText("ABC: " + results[7]);
            f.setSize(300,180);
        });
        // Update Expression
        updateBtn.addActionListener((ActionEvent e) -> {
            // Grab expressions
            String exp1 = expressions[logicCB1.getSelectedIndex()];
            String exp2 = expressions[logicCB2.getSelectedIndex()];
            if (currParent == 0) {
                // Parenthesis is on AB
                expressionOut.setText("(A " + exp1 + " B) " + exp2 + " C");
                logicLabel1.setText("A / B");
                logicLabel2.setText("AB / C");
            } else {
                // Parenthesis is on BC
                expressionOut.setText("A " + exp1 + " (B " + exp2 + " C)");
                logicLabel1.setText("A / BC");
                logicLabel2.setText("B / C");
            }
        });
        // Change Parenthesis
        changeBtn.addActionListener((ActionEvent e) -> {
            currParent = (currParent == 0) ? 1 : 0;
            // Grab expressions
            String exp1 = expressions[logicCB1.getSelectedIndex()];
            String exp2 = expressions[logicCB2.getSelectedIndex()];
            if (currParent == 0) {
                // Parenthesis is on AB
                expressionOut.setText("(A " + exp1 + " B) " + exp2 + " C");
                logicLabel1.setText("A / B");
                logicLabel2.setText("AB / C");
            } else {
                // Parenthesis is on BC
                expressionOut.setText("A " + exp1 + " (B " + exp2 + " C)");
                logicLabel1.setText("A / BC");
                logicLabel2.setText("B / C");
            }
        });
    }
    private static boolean OpDec(int index, boolean a, boolean b) {
        switch (index) {
            case 0:
                return OP_AND(a, b);
            case 1:
                return OP_OR(a, b);
            case 2:
                return OP_XOR(a, b);
            case 3:
                return OP_LIMP(a, b);
            case 4:
                return OP_NAND(a, b);
            case 5:
                return OP_NOR(a, b);
            case 6:
                return OP_XNOR(a, b);
            case 7:
                return OP_RIMP(a, b);
            default:
                return false;
        }
    }
    private static boolean OP_AND(boolean a, boolean b) { return a && b; }
    private static boolean OP_NAND(boolean a, boolean b) { return !OP_AND(a, b); }
    private static boolean OP_OR(boolean a, boolean b) { return a || b; }
    private static boolean OP_NOR(boolean a, boolean b) { return !OP_OR(a, b); }
    private static boolean OP_XOR(boolean a, boolean b) { return a ^ b; }
    private static boolean OP_XNOR(boolean a, boolean b) { return !OP_XOR(a, b); }
    private static boolean OP_LIMP(boolean a, boolean b) { return !(a && !b); }
    private static boolean OP_RIMP(boolean a, boolean b) { return !(!a && b); }
}
