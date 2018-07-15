/**
 * Who's on First module, started work on 2:02 PM 6/24/2018
 * 
 * Finished version 0.1 on 5:54 PM
 * 
 * Version 0.1
 * 
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class whosOnFirst {
    static JFrame f;
    public static void module() {
        System.out.println("[WHO'S ON FIRST MODULE]");
	f = new JFrame("KAaNE [WHO'S ON FIRST MODULE]");
        // Define the Display CB
        String displayTexts[]={"","BLANK","C","CEE","DISPLAY","FIRST","HOLD ON","LEAD","LED","LEED","NO","NOTHING","OKAY","READ","RED","REED","SAYS","SEE","THEIR","THERE","THEY ARE","THEY'RE","UR","YES","YOU","YOU ARE", "YOU'RE","YOUR"};
        JComboBox<String> displayCombo=new JComboBox<>(displayTexts);
        displayCombo.setBounds(50,20,100,20);
        // Define the Display Text
        JLabel displayText = new JLabel();
        displayText.setText("Displayed text");
        displayText.setBounds(165,20,125,20);
        // Define the Display Button
        JButton displayButton=new JButton("OK");
        displayButton.setBounds(260,20,75,20);
        // Define the Position CB
        String positionTexts[]={"BLANK","DONE","FIRST","HOLD","LEFT","LIKE","MIDDLE","NEXT","NO","NOTHING","OKAY","PRESS","READY","RIGHT","SURE","U","UH HUH","UH UH","UHHH","UR","WAIT","WHAT","WHAT?","YES","YOU","YOU ARE","YOU'RE","YOUR"};
        JComboBox<String> positionCombo = new JComboBox<>(positionTexts);
        positionCombo.setBounds(50,50,100,20);
        positionCombo.setVisible(false);
        // Define the Position Text
        JLabel positionText = new JLabel();
        positionText.setText("Position 1");
        positionText.setBounds(165,50,125,20);
        positionText.setVisible(false);
        // Define the Position Button
        JButton positionButton=new JButton("OK");
        positionButton.setBounds(260,50,75,20);
        positionButton.setVisible(false);
        // Define the Output Text
        JLabel outputText = new JLabel();
        outputText.setBounds(20,80,350,100);
        outputText.setVisible(false);
        // Add everything in to the JFrame
        f.add(displayCombo); f.add(displayText); f.add(displayButton); f.add(positionCombo); f.add(positionText); f.add(positionButton); f.add(outputText);
        // Define the rest of the JFrame stuff
        f.setLayout(null);
        f.setSize(350,350);
        f.setResizable(false);
        f.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String display = displayCombo.getItemAt(displayCombo.getSelectedIndex());
                if (display.equals("UR")) {
                    System.out.println("Position 1");
                    positionText.setText("Position 1");
                    positionCombo.setVisible(true);
                    positionText.setVisible(true);
                    positionButton.setVisible(true);
                }
                if ((display.equals("FIRST")) || (display.equals("OKAY")) || (display.equals("C"))) {
                    System.out.println("Position 2");
                    positionText.setText("Position 2");
                    positionCombo.setVisible(true);
                    positionText.setVisible(true);
                    positionButton.setVisible(true);
                }
                if ((display.equals("YES")) || (display.equals("NOTHING")) || (display.equals("LED")) || (display.equals("THEY ARE"))) {
                    System.out.println("Position 3");
                    positionText.setText("Position 3");
                    positionCombo.setVisible(true);
                    positionText.setVisible(true);
                    positionButton.setVisible(true);
                }
                if ((display.equals("BLANK")) || (display.equals("READ")) || (display.equals("RED")) || (display.equals("YOU")) || (display.equals("YOUR")) || (display.equals("YOU'RE")) || (display.equals("THEIR"))) {
                    System.out.println("Position 4");
                    positionText.setText("Position 4");
                    positionCombo.setVisible(true);
                    positionText.setVisible(true);
                    positionButton.setVisible(true);
                }
                if ((display.equals("")) || (display.equals("REED")) || (display.equals("LEED")) || (display.equals("THEY'RE"))) {
                    System.out.println("Position 5");
                    positionText.setText("Position 5");
                    positionCombo.setVisible(true);
                    positionText.setVisible(true);
                    positionButton.setVisible(true);
                }
                if ((display.equals("DISPLAY")) || (display.equals("SAYS")) || (display.equals("NO")) || (display.equals("LEAD")) || (display.equals("HOLD ON")) || (display.equals("THERE")) || (display.equals("SEE")) || (display.equals("CEE"))) {
                    System.out.println("Position 6");
                    positionText.setText("Position 6");
                    positionCombo.setVisible(true);
                    positionText.setVisible(true);
                    positionButton.setVisible(true);
                }
            }
        });
        positionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String position = positionCombo.getItemAt(positionCombo.getSelectedIndex());
                if (position.equals("BLANK")) {
                    System.out.println("BLANK");
                    outputText.setText("WAIT, RIGHT, OKAY, MIDDLE, BLANK");
                    outputText.setVisible(true);
                }
                if (position.equals("DONE")) {
                    System.out.println("DONE");
                    outputText.setText("<html>SURE, UH HUH, NEXT, WHAT?, YOUR, UR, YOU'RE, HOLD, <br/>LIKE, YOU, U, YOU ARE, UH UH, DONE</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("FIRST")) {
                    System.out.println("FIRST");
                    outputText.setText("<html>LEFT, OKAY, YES, MIDDLE, NO, RIGHT, NOTHING, UHHH, <br/>WAIT, READY, BLANK, WHAT, PRESS, FIRST</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("HOLD")) {
                    System.out.println("HOLD");
                    outputText.setText("<html>YOU ARE, U, DONE, UH UH, YOU, UR, SURE, WHAT?, <br/>YOU'RE, NEXT, HOLD</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("LEFT")) {
                    System.out.println("LEFT");
                    outputText.setText("RIGHT, LEFT");
                    outputText.setVisible(true);
                }
                if (position.equals("LIKE")) {
                    System.out.println("LIKE");
                    outputText.setText("<html>YOU'RE, NEXT, U, UR, HOLD, DONE, UH UH, WHAT?, <br/> UH HUH, YOU, LIKE</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("MIDDLE")) {
                    System.out.println("MIDDLE");
                    outputText.setText("<html>BLANK, READY, OKAY, WHAT, NOTHING, PRESS, NO, <br/>WAIT, LEFT, MIDDLE</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("NEXT")) {
                    System.out.println("NEXT");
                    outputText.setText("WHAT?, UH HUH, UH UH, YOUR, HOLD, SURE, NEXT");
                    outputText.setVisible(true);
                }
                if (position.equals("NO")) {
                    System.out.println("NO");
                    outputText.setText("<html>BLANK, UHH, WAIT, FIRST, WHAT, READY, RIGHT, YES, <br/>NOTHING, LEFT, PRESS, OKAY, NO</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("NOTHING")) {
                    System.out.println("NO");
                    outputText.setText("<html>UHHH, RIGHT, OKAY, MIDDLE, YES, BLANK, NO, PRESS, <br/>LEFT, WHAT, WAIT, FIRST, NOTHING</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("OKAY")) {
                    System.out.println("OKAY");
                    outputText.setText("MIDDLE, NO, FIRST, YES, UHH, NOTHING, WAIT, OKAY");
                    outputText.setVisible(true);
                }
                if (position.equals("PRESS")) {
                    System.out.println("PRESS");
                    outputText.setText("RIGHT, MIDDLE, YES, READY, PRESS");
                    outputText.setVisible(true);
                }
                if (position.equals("READY")) {
                    System.out.println("READY");
                    outputText.setText("<html>YES, OKAY, WHAT, MIDDLE, LEFT, PRESS, RIGHT, BLANK, <br/>READY</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("RIGHT")) {
                    System.out.println("RIGHT");
                    outputText.setText("YES, NOTHING, READY, PRESS, NO, WAIT, WHAT, RIGHT");
                    outputText.setVisible(true);
                }
                if (position.equals("SURE")) {
                    System.out.println("SURE");
                    outputText.setText("<html>YOU ARE, DONE, LIKE, YOU'RE, YOU, HOLD, UH HUH, UR, <br/>SURE</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("U")) {
                    System.out.println("U");
                    outputText.setText("<html>UH HUH, SURE, NEXT, WHAT?, YOU'RE, UR, UH UH, DONE, <br/>U</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("UR")) {
                    System.out.println("UR");
                    outputText.setText("DONE, U, UR");
                    outputText.setVisible(true);
                }
                if (position.equals("UH HUH")) {
                    System.out.println("UH HUH");
                    outputText.setText("UH HUH");
                    outputText.setVisible(true);
                }
                if (position.equals("UH UH")) {
                    System.out.println("UH UH");
                    outputText.setText("UR, U, YOU ARE, YOU'RE, NEXT, UH UH");
                    outputText.setVisible(true);
                }
                if (position.equals("UHHH")) {
                    System.out.println("UHHH");
                    outputText.setText("<html>READY, NOTHING, LEFT, WHAT, OKAY, YES, RIGHT, NO, <br/>PRESS, BLANK, UHHH</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("WAIT")) {
                    System.out.println("WAIT");
                    outputText.setText("<html>UHHH, NO, BLANK, OKAY, YES, LEFT, FIRST, PRESS, <br/>WHAT, WAIT</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("WHAT")) {
                    System.out.println("WHAT");
                    outputText.setText("UHHH, WHAT");
                    outputText.setVisible(true);
                }
                if (position.equals("WHAT?")) {
                    System.out.println("WHAT?");
                    outputText.setText("<html>YOU, HOLD, YOU'RE, YOUR, U, DONE, UH UH, LIKE, <br/>YOU ARE, UH HUH, UR, NEXT, WHAT?</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("YES")) {
                    System.out.println("YES");
                    outputText.setText("<html>OKAY, RIGHT, UHHH, MIDDLE, FIRST, WHAT, PRESS, <br/>READY, NOTHING, YES</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("YOU")) {
                    System.out.println("YOU");
                    outputText.setText("<html>SURE, YOU ARE, YOUR, YOU'RE, NEXT, UH HUH, UR, <br/>HOLD, WHAT?, YOU</html>");
                    outputText.setVisible(true);
                }
                if (position.equals("YOUR")) {
                    System.out.println("YOUR");
                    outputText.setText("UH UH, YOU ARE, UH HUH, YOUR");
                    outputText.setVisible(true);
                }
                if (position.equals("YOU'RE")) {
                    System.out.println("YOU'RE");
                    outputText.setText("YOU, YOU'RE");
                    outputText.setVisible(true);
                }
                if (position.equals("YOU ARE")) {
                    System.out.println("YOU");
                    outputText.setText("<html>YOUR, NEXT, LIKE, UH HUH, WHAT?, DONE, UH UH, HOLD, <br/>YOU, U, YOU'RE, SURE, UR, YOU ARE</html>");
                    outputText.setVisible(true);
                }
            }
        });
    }
}
