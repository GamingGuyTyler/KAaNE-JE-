/**
 * Alphabet module, started work on 7/21/2018 2:00 PM
 * 
 * Finished version 0.1 on 5:00 PM
 * 
 * Version 0.1
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.text.*;
import java.util.*;

public class alphabet {
    static JFrame f;
    public static void module() {
        System.out.println("[ALPHABET]");
        f = new JFrame("KAaNE [ALPHABET]");
<<<<<<< HEAD
        ImageIcon icon = new ImageIcon("imgs/icons/alphabet.png");
        f.setIconImage(icon.getImage());
=======
>>>>>>> 3dedd24bc3ad9a0d728ef4ef2433a9543d23f4e5
        // TBs
        JTextField tb1 = new JTextField();
        tb1.setDocument(new JTextFieldLimit(1));
        tb1.setBounds(10,10,20,20);
        JTextField tb2 = new JTextField();
        tb2.setDocument(new JTextFieldLimit(1));
        tb2.setBounds(30,10,20,20);
        JTextField tb3 = new JTextField();
        tb3.setDocument(new JTextFieldLimit(1));
        tb3.setBounds(10,30,20,20);
        JTextField tb4 = new JTextField();
        tb4.setDocument(new JTextFieldLimit(1));
        tb4.setBounds(30,30,20,20);
        // Document Filters
        DocumentFilter filter = new DocumentSizeAndUppercaseFilter(2);
        AbstractDocument tb1d = (AbstractDocument) tb1.getDocument();
        tb1d.setDocumentFilter(filter);
        AbstractDocument tb2d = (AbstractDocument) tb2.getDocument();
        tb2d.setDocumentFilter(filter);
        AbstractDocument tb3d = (AbstractDocument) tb3.getDocument();
        tb3d.setDocumentFilter(filter);
        AbstractDocument tb4d = (AbstractDocument) tb4.getDocument();
        tb4d.setDocumentFilter(filter);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(20,60,60,20);
        // Output Label
        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(60,25,60,20);
        // Add everything
        f.add(tb1); f.add(tb2); f.add(tb3); f.add(tb4);
        f.add(button); f.add(outputLabel);
        // Define JFrame
        f.setLayout(null);
        f.setSize(150,120);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        button.addActionListener((ActionEvent e) -> {
            String letter1 = tb1.getText();
            String letter2 = tb2.getText();
            String letter3 = tb3.getText();
            String letter4 = tb4.getText();
            int check = 0;
            // If anyone can optimize this, it would be greatly appreciated!
            // If the letters can spell a 4 letter word, then just output that word.
            if (letter1.equals("A") || letter2.equals("A") || letter3.equals("A") || letter4.equals("A")) {
                if (letter1.equals("R") || letter2.equals("R") || letter3.equals("R") || letter4.equals("R")) {
                    if (letter1.equals("G") || letter2.equals("G") || letter3.equals("G") | letter4.equals("G")) {
                        if (letter1.equals("F") || letter2.equals("F") || letter3.equals("F") || letter4.equals("F")) {
                            System.out.println("ARGF");
                            outputLabel.setText("ARGF");
                            check = 1;
                        }
                    }
                }
            }
            if (letter1.equals("I") || letter2.equals("I") || letter3.equals("I") || letter4.equals("I")) {
                if (letter1.equals("R") || letter2.equals("R") || letter3.equals("R") || letter4.equals("R")) {
                    if (letter1.equals("N") || letter2.equals("N") || letter3.equals("N") || letter4.equals("N")) {
                        if (letter1.equals("M") || letter2.equals("M") || letter3.equals("M") || letter4.equals("M")) {
                            System.out.println("IRNM");
                            outputLabel.setText("IRNM");
                            check = 1;
                        }
                    }
                }
            }
            if (letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) {
                if (letter1.equals("Q") || letter2.equals("Q") || letter3.equals("Q") || letter4.equals("Q")) {
                    if (letter1.equals("X") || letter2.equals("X") || letter3.equals("X") || letter4.equals("X")) {
                        if (letter1.equals("Z") || letter2.equals("Z") || letter3.equals("Z") || letter4.equals("Z")) {
                            System.out.println("JQXZ");
                            outputLabel.setText("JQXZ");
                            check = 1;
                        }
                    }
                }
            }
            if (letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O")) {
                if (letter1.equals("K") || letter2.equals("K") || letter3.equals("K") || letter4.equals("K")) {
                    if (letter1.equals("B") || letter2.equals("B") || letter3.equals("B") || letter4.equals("B")) {
                        if (letter1.equals("V") || letter2.equals("V") || letter3.equals("V") || letter4.equals("V")) {
                            System.out.println("OKBV");
                            outputLabel.setText("OKBV");
                            check = 1;
                        }
                    }
                }
            }
            if (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P")) {
                if (letter1.equals("Q") || letter2.equals("Q") || letter3.equals("Q") || letter4.equals("Q")) {
                    if (letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) {
                        if (letter1.equals("S") || letter2.equals("S") || letter3.equals("S") || letter4.equals("S")) {
                            System.out.println("PQJS");
                            outputLabel.setText("PQJS");
                            check = 1;
                        }
                    }
                }
            }
            if (letter1.equals("Q") || letter2.equals("Q") || letter3.equals("Q") || letter4.equals("Q")) {
                if (letter1.equals("Y") || letter2.equals("Y") || letter3.equals("Y") || letter4.equals("Y")) {
                    if (letter1.equals("D") || letter2.equals("D") || letter3.equals("D") || letter4.equals("D")) {
                        if (letter1.equals("X") || letter2.equals("X") || letter3.equals("X") || letter4.equals("X")) {
                            System.out.println("QYDX");
                            outputLabel.setText("QYDX");
                            check = 1;
                        }
                    }
                }
            }
            // If the letters can spell a 3 letter word, output that word + the remaining word
            if (letter1.equals("D") || letter2.equals("D") || letter3.equals("D") || letter4.equals("D")) {
                if (letter1.equals("F") || letter2.equals("F") || letter3.equals("F") || letter4.equals("F")) {
                    if (letter1.equals("W") || letter2.equals("W") || letter3.equals("W") || letter4.equals("W")) {
                        // Determine which letter doesn't make the word
                        if (!letter1.equals("D") && !letter1.equals("F") && !letter1.equals("W")) {
                            System.out.println("DFW" + letter1);
                            outputLabel.setText("DFW" + letter1);
                        }
                        if (!letter2.equals("D") && !letter2.equals("F") && !letter2.equals("W")) {
                            System.out.println("DFW" + letter2);
                            outputLabel.setText("DFW" + letter2);
                        }
                        if (!letter3.equals("D") && !letter3.equals("F") && !letter3.equals("W")) {
                            System.out.println("DFW" + letter3);
                            outputLabel.setText("DFW" + letter3);
                        }
                        if (!letter4.equals("D") && !letter4.equals("F") && !letter4.equals("W")) {
                            System.out.println("DFW" + letter4);
                            outputLabel.setText("DFW" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            if (letter1.equals("H") || letter2.equals("H") || letter3.equals("H") || letter4.equals("H")) {
                if (letter1.equals("D") || letter2.equals("D") || letter3.equals("D") || letter4.equals("D")) {
                    if (letter1.equals("U") || letter2.equals("U") || letter3.equals("U") || letter4.equals("U")) {
                        if (!letter1.equals("H") && !letter1.equals("D") && !letter1.equals("U")) {
                            System.out.println("HDU" + letter1);
                            outputLabel.setText("HDU" + letter1);
                        }
                        if (!letter2.equals("H") && !letter2.equals("D") && !letter2.equals("U")) {
                            System.out.println("HDU" + letter2);
                            outputLabel.setText("HDU" + letter2);
                        }
                        if (!letter3.equals("H") && !letter3.equals("D") && !letter3.equals("U")) {
                            System.out.println("HDU" + letter3);
                            outputLabel.setText("HDU" + letter3);
                        }
                        if (!letter4.equals("H") && !letter4.equals("D") && !letter4.equals("U")) {
                            System.out.println("HDU" + letter4);
                            outputLabel.setText("HDU" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            if (letter1.equals("L") || letter2.equals("L") || letter3.equals("L") || letter4.equals("L")) {
                if (letter1.equals("X") || letter2.equals("X") || letter3.equals("X") || letter4.equals("X")) {
                    if (letter1.equals("E") || letter2.equals("E") || letter3.equals("E") || letter4.equals("E")) {
                        if (!letter1.equals("L") && !letter1.equals("X") && !letter1.equals("E")) {
                            System.out.println("LXE" + letter1);
                            outputLabel.setText("LXE" + letter1);
                        }
                        if (!letter2.equals("L") && !letter2.equals("X") && !letter2.equals("E")) {
                            System.out.println("LXE" + letter2);
                            outputLabel.setText("LXE" + letter2);
                        }
                        if (!letter3.equals("L") && !letter3.equals("X") && !letter3.equals("E")) {
                            System.out.println("LXE" + letter3);
                            outputLabel.setText("LXE" + letter3);
                        }
                        if (!letter4.equals("L") && !letter4.equals("X") && !letter4.equals("E")) {
                            System.out.println("LXE" + letter4);
                            outputLabel.setText("LXE" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            if (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P")) {
                if (letter1.equals("K") || letter2.equals("K") || letter3.equals("K") || letter4.equals("K")) {
                    if (letter1.equals("D") || letter2.equals("D") || letter3.equals("D") || letter4.equals("D")) {
                        if (!letter1.equals("P") && !letter1.equals("K") && !letter1.equals("D")) {
                            System.out.println("PKD" + letter1);
                            outputLabel.setText("PKD" + letter1);
                        }
                        if (!letter2.equals("P") && !letter2.equals("K") && !letter2.equals("D")) {
                            System.out.println("PKD" + letter2);
                            outputLabel.setText("PKD" + letter2);
                        }
                        if (!letter3.equals("P") && !letter3.equals("K") && !letter3.equals("D")) {
                            System.out.println("PKD" + letter3);
                            outputLabel.setText("PKD" + letter3);
                        }
                        if (!letter4.equals("P") && !letter4.equals("K") && !letter4.equals("D")) {
                            System.out.println("PKD" + letter4);
                            outputLabel.setText("PKD" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            if (letter1.equals("Q") || letter2.equals("Q") || letter3.equals("Q") || letter4.equals("Q")) {
                if (letter1.equals("E") || letter2.equals("E") || letter3.equals("E") || letter4.equals("E")) {
                    if (letter1.equals("W") || letter2.equals("W") || letter3.equals("W") || letter4.equals("W")) {
                        if (!letter1.equals("Q") && !letter1.equals("E") && !letter1.equals("W")) {
                            System.out.println("QEW" + letter1);
                            outputLabel.setText("QEW" + letter1);
                        }
                        if (!letter2.equals("Q") && !letter2.equals("E") && !letter2.equals("W")) {
                            System.out.println("QEW" + letter2);
                            outputLabel.setText("QEW" + letter2);
                        }
                        if (!letter3.equals("Q") && !letter3.equals("E") && !letter3.equals("W")) {
                            System.out.println("QEW" + letter3);
                            outputLabel.setText("QEW" + letter3);
                        }
                        if (!letter4.equals("Q") && !letter4.equals("E") && !letter4.equals("W")) {
                            System.out.println("QEW" + letter4);
                            outputLabel.setText("QEW" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            if (letter1.equals("T") || letter2.equals("T") || letter3.equals("T") || letter4.equals("T")) {
                if (letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) {
                    if (letter1.equals("L") || letter2.equals("L") || letter3.equals("L") || letter4.equals("L")) {
                        if (!letter1.equals("T") && !letter1.equals("J") && !letter1.equals("L")) {
                            System.out.println("TJL" + letter1);
                            outputLabel.setText("TJL" + letter1);
                        }
                        if (!letter2.equals("T") && !letter2.equals("J") && !letter2.equals("L")) {
                            System.out.println("TJL" + letter2);
                            outputLabel.setText("TJL" + letter2);
                        }
                        if (!letter3.equals("T") && !letter3.equals("J") && !letter3.equals("L")) {
                            System.out.println("TJL" + letter3);
                            outputLabel.setText("TJL" + letter3);
                        }
                        if (!letter4.equals("T") && !letter4.equals("J") && !letter4.equals("L")) {
                            System.out.println("TJL" + letter4);
                            outputLabel.setText("TJL" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            if (letter1.equals("V") || letter2.equals("V") || letter3.equals("V") || letter4.equals("V")) {
                if (letter1.equals("C") || letter2.equals("C") || letter3.equals("C") || letter4.equals("C")) {
                    if (letter1.equals("N") || letter2.equals("N") || letter3.equals("N") || letter4.equals("N")) {
                        if (!letter1.equals("V") && !letter1.equals("C") && !letter1.equals("N")) {
                            System.out.println("VCN" + letter1);
                            outputLabel.setText("VCN" + letter1);
                        }
                        if (!letter2.equals("V") && !letter2.equals("C") && !letter2.equals("N")) {
                            System.out.println("VCN" + letter2);
                            outputLabel.setText("VCN" + letter2);
                        }
                        if (!letter3.equals("V") && !letter3.equals("C") && !letter3.equals("N")) {
                            System.out.println("VCN" + letter3);
                            outputLabel.setText("VCN" + letter3);
                        }
                        if (!letter4.equals("V") && !letter4.equals("C") && !letter4.equals("N")) {
                            System.out.println("VCN" + letter4);
                            outputLabel.setText("VCN" + letter4);
                        }
                        check = 1;
                    }
                } if (letter1.equals("S") || letter2.equals("S") || letter3.equals("S") || letter4.equals("S")) {
                    if (letter1.equals("I") || letter2.equals("I") || letter3.equals("I") || letter4.equals("I")) {
                        if (!letter1.equals("V") && !letter1.equals("S") && !letter1.equals("I")) {
                            System.out.println("VSI" + letter1);
                            outputLabel.setText("VSI" + letter1);
                        }
                        if (!letter2.equals("V") && !letter2.equals("S") && !letter2.equals("I")) {
                            System.out.println("VSI" + letter2);
                            outputLabel.setText("VSI" + letter2);
                        }
                        if (!letter3.equals("V") && !letter3.equals("S") && !letter3.equals("I")) {
                            System.out.println("VSI" + letter3);
                            outputLabel.setText("VSI" + letter3);
                        }
                        if (!letter4.equals("V") && !letter4.equals("S") && !letter4.equals("I")) {
                            System.out.println("VSI" + letter4);
                            outputLabel.setText("VSI" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            if (letter1.equals("Y") || letter2.equals("Y") || letter3.equals("Y") || letter4.equals("Y")) {
                if (letter1.equals("K") || letter2.equals("K") || letter3.equals("K") || letter4.equals("K")) {
                    if (letter1.equals("Q") || letter2.equals("Q") || letter3.equals("Q") || letter4.equals("Q")) {
                        if (!letter1.equals("Y") && !letter1.equals("K") && !letter1.equals("Q")) {
                            System.out.println("YKQ" + letter1);
                            outputLabel.setText("YKQ" + letter1);
                        }
                        if (!letter2.equals("Y") && !letter2.equals("K") && !letter2.equals("Q")) {
                            System.out.println("YKQ" + letter2);
                            outputLabel.setText("YKQ" + letter2);
                        }
                        if (!letter3.equals("Y") && !letter3.equals("K") && !letter3.equals("Q")) {
                            System.out.println("YKQ" + letter3);
                            outputLabel.setText("YKQ" + letter3);
                        }
                        if (!letter4.equals("Y") && !letter4.equals("K") && !letter4.equals("Q")) {
                            System.out.println("YKQ" + letter4);
                            outputLabel.setText("YKQ" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            if (letter1.equals("Z") || letter2.equals("Z") || letter3.equals("Z") || letter4.equals("Z")) {
                if (letter1.equals("N") || letter2.equals("N") || letter3.equals("N") || letter4.equals("N")) {
                    if (letter1.equals("Y") || letter2.equals("Y") || letter3.equals("Y") || letter4.equals("Y")) {
                        if (!letter1.equals("Z") && !letter1.equals("N") && !letter1.equals("Y")) {
                            System.out.println("ZNY" + letter1);
                            outputLabel.setText("ZNY" + letter1);
                        }
                        if (!letter2.equals("Z") && !letter2.equals("N") && !letter2.equals("Y")) {
                            System.out.println("ZNY" + letter2);
                            outputLabel.setText("ZNY" + letter2);
                        }
                        if (!letter3.equals("Z") && !letter3.equals("N") && !letter3.equals("Y")) {
                            System.out.println("ZNY" + letter3);
                            outputLabel.setText("ZNY" + letter3);
                        }
                        if (!letter4.equals("Z") && !letter4.equals("N") && !letter4.equals("Y")) {
                            System.out.println("ZNY" + letter4);
                            outputLabel.setText("ZNY" + letter4);
                        }
                        check = 1;
                    }
                }
            }
            // If the letters can spell out a 2 letter word, output that word.
            // Also, if the letters can spell another word, output that word + the other word.
            // Otherwise, output the remaining words alphabetically + the word.
<<<<<<< HEAD
            if ((letter1.equals("A") || letter2.equals("A") || letter3.equals("A") || letter4.equals("A")) 
                && (letter1.equals("C") || letter2.equals("C") || letter3.equals("C") || letter4.equals("C"))) {
                // Check if other 2 letter words can apply
                if ((letter1.equals("G") || letter2.equals("G") || letter3.equals("G") || letter4.equals("G")) 
                    && (letter1.equals("S") || letter2.equals("S") || letter3.equals("S") || letter4.equals("S"))) {
                    System.out.println("ACGS");
                    outputLabel.setText("ACGS");
                }
                else if ((letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) 
                    && (letter1.equals("R") || letter2.equals("R") || letter3.equals("R") || letter4.equals("R"))) {
                        System.out.println("ACJR");
                        outputLabel.setText("ACJR");
                }
                else if ((letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O"))
                    && (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P"))) {
                        System.out.println("ACOP");
                        outputLabel.setText("ACOP");
                }
                // If they don't, just alphabetize the remaining letters
                else {
                    ArrayList<String> outputs = new ArrayList<>();
                    if (!letter1.equals("A") && !letter1.equals("C")) {
                        outputs.add(letter1);
                        if (!letter2.equals("A") && !letter2.equals("C")) {
                            outputs.add(letter2);
                        } else if (!letter3.equals("A") && !letter3.equals("C")) {
                            outputs.add(letter3);
                        } else  {
                            outputs.add(letter4);
                        }
                    } else if (!letter2.equals("A") && !letter2.equals("C")) {
                        outputs.add(letter2);
                        if (!letter3.equals("A") && !letter3.equals("C")) {
                            outputs.add(letter3);
                        } else {
                            outputs.add(letter4);
                        }
                    } else {
                        outputs.add(letter3);
                        outputs.add(letter4);
                    }
                    String letters[] = outputs.toArray(new String[0]);
                    Arrays.sort(letters);
                    System.out.println("AC" + letters[0] + letters[1]);
                    outputLabel.setText("AC" + letters[0] + letters[1]);
                }
                check = 1;
                } else if ((letter1.equals("G") || letter2.equals("G") || letter3.equals("G") || letter4.equals("G")) 
                    && (letter1.equals("S") || letter2.equals("S") || letter3.equals("S") || letter4.equals("S"))) {
                if ((letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) 
                    && (letter1.equals("R") || letter2.equals("R") || letter3.equals("R") || letter4.equals("R"))) {
                        System.out.println("GSJR");
                        outputLabel.setText("GSJR");
                }
                else if ((letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O"))
                    && (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P"))) {
                        System.out.println("GSOP");
                        outputLabel.setText("GSOP");
                }
                else {
                    ArrayList<String> outputs = new ArrayList<>();
                    if (!letter1.equals("G") && !letter1.equals("S")) {
                        outputs.add(letter1);
                        if (!letter2.equals("G") && !letter2.equals("S")) {
                            outputs.add(letter2);
                        } else if (!letter3.equals("G") && !letter3.equals("S")) {
                            outputs.add(letter3);
                        } else  {
                            outputs.add(letter4);
                        }
                    } else if (!letter2.equals("G") && !letter2.equals("S")) {
                        outputs.add(letter2);
                        if (!letter3.equals("G") && !letter3.equals("S")) {
                            outputs.add(letter3);
                        } else {
                            outputs.add(letter4);
                        }
                    } else {
                        outputs.add(letter3);
                        outputs.add(letter4);
                    }
                    String letters[] = outputs.toArray(new String[0]);
                    Arrays.sort(letters);
                    System.out.println("GS" + letters[0] + letters[1]);
                    outputLabel.setText("GS" + letters[0] + letters[1]);
                }
                check = 1;
            } else if ((letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) 
                    && (letter1.equals("R") || letter2.equals("R") || letter3.equals("R") || letter4.equals("R"))) {
                if ((letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O"))
                    && (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P"))) {
                        System.out.println("JROP");
                        outputLabel.setText("JROP");
                }
                else {
                    ArrayList<String> outputs = new ArrayList<>();
                    if (!letter1.equals("J") && !letter1.equals("R")) {
                        outputs.add(letter1);
                        if (!letter2.equals("J") && !letter2.equals("R")) {
                            outputs.add(letter2);
                        } else if (!letter3.equals("J") && !letter3.equals("R")) {
=======
            if (letter1.equals("A") || letter2.equals("A") || letter3.equals("A") || letter4.equals("A")) {
                if (letter1.equals("C") || letter2.equals("C") || letter3.equals("C") || letter4.equals("C")) {
                    // Check if other 2 letter words can apply
                    if ((letter1.equals("G") || letter2.equals("G") || letter3.equals("G") || letter4.equals("G")) 
                        && (letter1.equals("S") || letter2.equals("S") || letter3.equals("S") || letter4.equals("S"))) {
                        System.out.println("ACGS");
                        outputLabel.setText("ACGS");
                    }
                    else if ((letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) 
                        && (letter1.equals("R") || letter2.equals("R") || letter3.equals("R") || letter4.equals("R"))) {
                            System.out.println("ACJR");
                            outputLabel.setText("ACJR");
                    }
                    else if ((letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O"))
                        && (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P"))) {
                            System.out.println("ACOP");
                            outputLabel.setText("ACOP");
                    }
                    // If they don't, just alphabetize the remaining letters
                    else {
                        ArrayList<String> outputs = new ArrayList<>();
                        if (!letter1.equals("A") && !letter1.equals("C")) {
                            outputs.add(letter1);
                            if (!letter2.equals("A") && !letter2.equals("C")) {
                                outputs.add(letter2);
                            } else if (!letter3.equals("A") && !letter3.equals("C")) {
                                outputs.add(letter3);
                            } else  {
                                outputs.add(letter4);
                            }
                        } else if (!letter2.equals("A") && !letter2.equals("C")) {
                            outputs.add(letter2);
                            if (!letter3.equals("A") && !letter3.equals("C")) {
                                outputs.add(letter3);
                            } else {
                                outputs.add(letter4);
                            }
                        } else {
                            outputs.add(letter3);
                            outputs.add(letter4);
                        }
                        String letters[] = outputs.toArray(new String[0]);
                        Arrays.sort(letters);
                        System.out.println("AC" + letters[0] + letters[1]);
                        outputLabel.setText("AC" + letters[0] + letters[1]);
                    }
                    check = 1;
                }
            } else if (letter1.equals("G") || letter2.equals("G") || letter3.equals("G") || letter4.equals("G")) {
                if (letter1.equals("S") || letter2.equals("S") || letter3.equals("S") || letter4.equals("S")) {
                    if ((letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) 
                        && (letter1.equals("R") || letter2.equals("R") || letter3.equals("R") || letter4.equals("R"))) {
                            System.out.println("GSJR");
                            outputLabel.setText("GSJR");
                    }
                    else if ((letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O"))
                        && (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P"))) {
                            System.out.println("GSOP");
                            outputLabel.setText("GSOP");
                    }
                    else {
                        ArrayList<String> outputs = new ArrayList<>();
                        if (!letter1.equals("G") && !letter1.equals("S")) {
                            outputs.add(letter1);
                            if (!letter2.equals("G") && !letter2.equals("S")) {
                                outputs.add(letter2);
                            } else if (!letter3.equals("G") && !letter3.equals("S")) {
                                outputs.add(letter3);
                            } else  {
                                outputs.add(letter4);
                            }
                        } else if (!letter2.equals("G") && !letter2.equals("S")) {
                            outputs.add(letter2);
                            if (!letter3.equals("G") && !letter3.equals("S")) {
                                outputs.add(letter3);
                            } else {
                                outputs.add(letter4);
                            }
                        } else {
                            outputs.add(letter3);
                            outputs.add(letter4);
                        }
                        String letters[] = outputs.toArray(new String[0]);
                        Arrays.sort(letters);
                        System.out.println("GS" + letters[0] + letters[1]);
                        outputLabel.setText("GS" + letters[0] + letters[1]);
                    }
                    check = 1;
                }
            } else if (letter1.equals("J") || letter2.equals("J") || letter3.equals("J") || letter4.equals("J")) {
                if (letter1.equals("R") || letter2.equals("R") || letter3.equals("R") || letter4.equals("R")) {
                    if ((letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O"))
                        && (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P"))) {
                            System.out.println("JROP");
                            outputLabel.setText("JROP");
                    }
                    else {
                        ArrayList<String> outputs = new ArrayList<>();
                        if (!letter1.equals("J") && !letter1.equals("R")) {
                            outputs.add(letter1);
                            if (!letter2.equals("J") && !letter2.equals("R")) {
                                outputs.add(letter2);
                            } else if (!letter3.equals("J") && !letter3.equals("R")) {
                                outputs.add(letter3);
                            } else  {
                                outputs.add(letter4);
                            }
                        } else if (!letter2.equals("J") && !letter2.equals("R")) {
                            outputs.add(letter2);
                            if (!letter3.equals("J") && !letter3.equals("R")) {
                                outputs.add(letter3);
                            } else {
                                outputs.add(letter4);
                            }
                        } else {
                            outputs.add(letter3);
                            outputs.add(letter4);
                        }
                        String letters[] = outputs.toArray(new String[0]);
                        Arrays.sort(letters);
                        System.out.println("JR" + letters[0] + letters[1]);
                        outputLabel.setText("JR" + letters[0] + letters[1]);
                    }
                    check = 1;
                }
            } else if (letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O")) {
                if (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P")) {
                    ArrayList<String> outputs = new ArrayList<>();
                    if (!letter1.equals("O") && !letter1.equals("P")) {
                        outputs.add(letter1);
                        if (!letter2.equals("O") && !letter2.equals("P")) {
                            outputs.add(letter2);
                        } else if (!letter3.equals("O") && !letter3.equals("P")) {
>>>>>>> 3dedd24bc3ad9a0d728ef4ef2433a9543d23f4e5
                            outputs.add(letter3);
                        } else  {
                            outputs.add(letter4);
                        }
<<<<<<< HEAD
                    } else if (!letter2.equals("J") && !letter2.equals("R")) {
                        outputs.add(letter2);
                        if (!letter3.equals("J") && !letter3.equals("R")) {
=======
                    } else if (!letter2.equals("O") && !letter2.equals("P")) {
                        outputs.add(letter2);
                        if (!letter3.equals("O") && !letter3.equals("P")) {
>>>>>>> 3dedd24bc3ad9a0d728ef4ef2433a9543d23f4e5
                            outputs.add(letter3);
                        } else {
                            outputs.add(letter4);
                        }
                    } else {
                        outputs.add(letter3);
                        outputs.add(letter4);
                    }
                    String letters[] = outputs.toArray(new String[0]);
                    Arrays.sort(letters);
<<<<<<< HEAD
                    System.out.println("JR" + letters[0] + letters[1]);
                    outputLabel.setText("JR" + letters[0] + letters[1]);
                }
                check = 1;
            } else if ((letter1.equals("O") || letter2.equals("O") || letter3.equals("O") || letter4.equals("O")) && 
                    (letter1.equals("P") || letter2.equals("P") || letter3.equals("P") || letter4.equals("P"))) {
                ArrayList<String> outputs = new ArrayList<>();
                if (!letter1.equals("O") && !letter1.equals("P")) {
                    outputs.add(letter1);
                    if (!letter2.equals("O") && !letter2.equals("P")) {
                        outputs.add(letter2);
                    } else if (!letter3.equals("O") && !letter3.equals("P")) {
                        outputs.add(letter3);
                    } else  {
                        outputs.add(letter4);
                    }
                } else if (!letter2.equals("O") && !letter2.equals("P")) {
                    outputs.add(letter2);
                    if (!letter3.equals("O") && !letter3.equals("P")) {
                        outputs.add(letter3);
                    } else {
                        outputs.add(letter4);
                    }
                } else {
                    outputs.add(letter3);
                    outputs.add(letter4);
                }
                String letters[] = outputs.toArray(new String[0]);
                Arrays.sort(letters);
                System.out.println("OP" + letters[0] + letters[1]);
                outputLabel.setText("OP" + letters[0] + letters[1]);
                check = 1;
=======
                    System.out.println("OP" + letters[0] + letters[1]);
                    outputLabel.setText("OP" + letters[0] + letters[1]);
                    check = 1;
                }
>>>>>>> 3dedd24bc3ad9a0d728ef4ef2433a9543d23f4e5
            }
            // If no words are compatible, then just output all the letters alphabetically.
            if (check == 0) {
                String letters[] = {letter1,letter2,letter3,letter4};
                Arrays.sort(letters);
                System.out.println(letters[0] + letters[1] + letters[2] + letters[3]);
                outputLabel.setText(letters[0] + letters[1] + letters[2] + letters[3]);
            }
        });
    }
    // DocumentSizeAndUppercaseFilter code by dacwe on stackoverflow.
    static class DocumentSizeAndUppercaseFilter extends DocumentFilter {

        private final int max;

        public DocumentSizeAndUppercaseFilter(int max) {
            this.max = max;
        }

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset,
                                 String text, AttributeSet attr) 
                throws BadLocationException {
            if (fb.getDocument().getLength() + text.length() < max)
                super.insertString(fb, offset, text.toUpperCase(), attr);
            else 
                showError();
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset,
                            int length, String text, AttributeSet attrs)
                throws BadLocationException {
            int documentLength = fb.getDocument().getLength();
            if (documentLength - length + text.length() < max)
                super.replace(fb, offset, length, text.toUpperCase(), attrs);
            else 
                showError();
        }

        private void showError() {
            
        }
    }
}
