import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/**
 * Keypad Module, started work on 2:40 PM 6/18/2018
 *
 * Finished version 0.1 on 5:21 PM 6/19/2018
 *
 * Version 0.1
 *
 */

public class keypad {
	static JFrame f;
	// List out the proper orders of symbols.
	private static int[][] sList =
		{
			{1, 2, 3, 4, 5, 6, 7},
            {8, 1, 7, 9, 10, 6, 11},
            {12, 13, 9, 14, 15, 3, 10},
            {16, 17, 18, 5, 14, 11, 19},
            {20, 19, 18, 21, 17, 22, 23},
            {16, 8, 24, 25, 20, 26, 27}
		};
	public static void module() {
		System.out.println("[KEYPAD MODULE]");
		f = new JFrame("KAaNE [KEYPAD MODULE]");
		// Define the icons
		Map<Object, Icon> icons = new HashMap<Object, Icon>();
		ImageIcon icon12 = new ImageIcon("imgs/keypad/1-copyright.png");
		ImageIcon icon23 = new ImageIcon("imgs/keypad/2-filledstar.png");
		ImageIcon icon10 = new ImageIcon("imgs/keypad/3-hollowstar.png");
		ImageIcon icon19 = new ImageIcon("imgs/keypad/4-smileyface.png");
		ImageIcon icon14 = new ImageIcon("imgs/keypad/5-doublek.png");
		ImageIcon icon27 = new ImageIcon("imgs/keypad/6-omega.png");
		ImageIcon icon5 = new ImageIcon("imgs/keypad/7-squidknife.png");
		ImageIcon icon13 = new ImageIcon("imgs/keypad/8-pumpkin.png");
		ImageIcon icon6 = new ImageIcon("imgs/keypad/9-hookn.png");
		ImageIcon icon16 = new ImageIcon("imgs/keypad/11-six.png");
		ImageIcon icon4 = new ImageIcon("imgs/keypad/12-squigglyn.png");
		ImageIcon icon2 = new ImageIcon("imgs/keypad/13-at.png");
		ImageIcon icon25 = new ImageIcon("imgs/keypad/14-ae.png");
		ImageIcon icon15 = new ImageIcon("imgs/keypad/15-meltedthree.png");
		ImageIcon icon8 = new ImageIcon("imgs/keypad/16-euro.png");
		ImageIcon icon26 = new ImageIcon("imgs/keypad/18-nwithhat.png");
		ImageIcon icon22 = new ImageIcon("imgs/keypad/19-dragon.png");
		ImageIcon icon11 = new ImageIcon("imgs/keypad/20-questionmark.png");
		ImageIcon icon17 = new ImageIcon("imgs/keypad/21-paragraph.png");
		ImageIcon icon21 = new ImageIcon("imgs/keypad/22-rightc.png");
		ImageIcon icon7 = new ImageIcon("imgs/keypad/23-leftc.png");
		ImageIcon icon20 = new ImageIcon("imgs/keypad/24-pitchfork.png");
		ImageIcon icon9 = new ImageIcon("imgs/keypad/26-cursive.png");
		ImageIcon icon24 = new ImageIcon("imgs/keypad/27-tracks.png");
		ImageIcon icon1 = new ImageIcon("imgs/keypad/28-balloon.png");
		ImageIcon icon3 = new ImageIcon("imgs/keypad/30-upsidedowny.png");
		ImageIcon icon18 = new ImageIcon("imgs/keypad/31-bt.png");
		icons.put("1",icon1);
		icons.put("2",icon2);
		icons.put("3",icon3);
		icons.put("4",icon4);
		icons.put("5",icon5);
		icons.put("6",icon6);
		icons.put("7",icon7);
		icons.put("8",icon8);
		icons.put("9",icon9);
		icons.put("10",icon10);
		icons.put("11",icon11);
		icons.put("12",icon12);
		icons.put("13",icon13);
		icons.put("14",icon14);
		icons.put("15",icon15);
		icons.put("16",icon16);
		icons.put("17",icon17);
		icons.put("18",icon18);
		icons.put("19",icon19);
		icons.put("20",icon20);
		icons.put("21",icon21);
		icons.put("22",icon22);
		icons.put("23",icon23);
		icons.put("24",icon24);
		icons.put("25",icon25);
		icons.put("26",icon26);
		icons.put("27",icon27);
		// Set the 4 Combo Boxes
		JComboBox<String> symbols1CB = new JComboBox(new Object[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"});
		symbols1CB.setRenderer(new IconListRenderer(icons));
		symbols1CB.setBounds(62,50,100,50);
		JComboBox<String> symbols2CB = new JComboBox(new Object[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"});
		symbols2CB.setRenderer(new IconListRenderer(icons));
		symbols2CB.setBounds(162,50,100,50);
		JComboBox<String> symbols3CB = new JComboBox(new Object[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"});
		symbols3CB.setRenderer(new IconListRenderer(icons));
		symbols3CB.setBounds(62,100,100,50);
		JComboBox<String> symbols4CB = new JComboBox(new Object[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"});
		symbols4CB.setRenderer(new IconListRenderer(icons));
		symbols4CB.setBounds(162,100,100,50);
		// Add the button
		JButton button=new JButton("OK");
		button.setBounds(125,175,75,20);
		// Add the output icons
		JLabel output1 = new JLabel();
		JLabel output2 = new JLabel();
		JLabel output3 = new JLabel();
		JLabel output4 = new JLabel();
		output1.setVisible(false);
		output2.setVisible(false);
		output3.setVisible(false);
		output4.setVisible(false);
		output1.setBounds(75,210,50,50);
		output2.setBounds(125,210,50,50);
		output3.setBounds(175,210,50,50);
		output4.setBounds(225,210,50,50);
		// Add the welcome text
		JLabel welcomeText = new JLabel("Input the keys below.");
		welcomeText.setHorizontalAlignment(JLabel.CENTER);
		welcomeText.setSize(320,30);
		// Add everything into JFrame
		f.add(symbols1CB); f.add(symbols2CB); f.add(symbols3CB); f.add(symbols4CB); f.add(button); f.add(output1); f.add(output2); f.add(output3); f.add(output4); f.add(welcomeText);
		// Define the rest of the JFrame stuff
		f.setLayout(null);
		f.setSize(350,350);
		f.setResizable(false);
		f.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Convert CBs into strings
				String symbol1 = symbols1CB.getItemAt(symbols1CB.getSelectedIndex());
				String symbol2 = symbols2CB.getItemAt(symbols2CB.getSelectedIndex());
				String symbol3 = symbols3CB.getItemAt(symbols3CB.getSelectedIndex());
				String symbol4 = symbols4CB.getItemAt(symbols4CB.getSelectedIndex());
				// Convert strings into ints
				int symbol1Int = Integer.parseInt(symbol1);
				int symbol2Int = Integer.parseInt(symbol2);
				int symbol3Int = Integer.parseInt(symbol3);
				int symbol4Int = Integer.parseInt(symbol4);
				// Put the ints into an array
				int[] symbols = new int[4];
				symbols[0] = symbol1Int;
				symbols[1] = symbol2Int;
				symbols[2] = symbol3Int;
				symbols[3] = symbol4Int;
				System.out.println("Symbol 1 - " + symbols[0]);
				System.out.println("Symbol 2 - " + symbols[1]);
				System.out.println("Symbol 3 - " + symbols[2]);
				System.out.println("Symbol 4 - " + symbols[3]);
				// Order everything up.
				symbols = order(symbols);
				String[] images = getImages(symbols);
				// Show the outputs.
				System.out.println("Ordered Symbol 1 - " + symbols[0]);
				System.out.println("Ordered Symbol 2 - " + symbols[1]);
				System.out.println("Ordered Symbol 3 - " + symbols[2]);
				System.out.println("Ordered Symbol 4 - " + symbols[3]);
				ImageIcon i1 = new ImageIcon(images[0]);
				ImageIcon i2 = new ImageIcon(images[1]);
				ImageIcon i3 = new ImageIcon(images[2]);
				ImageIcon i4 = new ImageIcon(images[3]);
				output1.setIcon(i1);
				output2.setIcon(i2);
				output3.setIcon(i3);
				output4.setIcon(i4);
				output1.setVisible(true);
				output2.setVisible(true);
				output3.setVisible(true);
				output4.setVisible(true);
			}
		});
	}
	// Below code is courtesy of OBACHSK KTANE from his programming solutions video.
	// I still have no idea what any of this fucking code means.
	private static int[] order(int[] s) {
		int[] order = new int[s.length];
		int row = 0;
		int best = 0;
		for(int aa = 0; aa < 6; aa++) {
			for(int bb = 0; bb < 7; bb++) {
				for(int cc = 0; cc < 4; cc++) {
					if(sList[aa][bb] == s[cc]) {
						best++;
					}
				}
			}
			if(best == 4) {
				row = aa;
				break;
			}
			best = 0;
		}
		int items = 0;
		for(int dd = 0; dd < 7; dd++) {
			for(int ee = 0; ee < 4; ee++) {
				if(sList[row][dd] == s[ee]) {
					order[items] = s[ee];
					items++;
				}
			}
		}
		return order;
	}
	private static String[] getImages(int[] s) {
		String[] ima = new String[4];
		for(int aa = 0; aa <4; aa ++) {
			switch(s[aa]) {
				case 1:
					ima[aa] = "imgs/keypad/28-balloon.png";
					break;
				case 2:
					ima[aa] = "imgs/keypad/13-at.png";
					break;
				case 3:
					ima[aa] = "imgs/keypad/30-upsidedowny.png";
					break;
				case 4:
					ima[aa] = "imgs/keypad/12-squigglyn.png";
					break;
				case 5:
					ima[aa] = "imgs/keypad/7-squidknife.png";
					break;
				case 6:
					ima[aa] = "imgs/keypad/9-hookn.png";
					break;
				case 7:
					ima[aa] = "imgs/keypad/23-leftc.png";
					break;
				case 8:
					ima[aa] = "imgs/keypad/16-euro.png";
					break;
				case 9:
					ima[aa] = "imgs/keypad/26-cursive.png";
					break;
				case 10:
					ima[aa] = "imgs/keypad/3-hollowstar.png";
					break;
				case 11:
					ima[aa] = "imgs/keypad/20-questionmark.png";
					break;
				case 12:
					ima[aa] = "imgs/keypad/1-copyright.png";
					break;
				case 13:
					ima[aa] = "imgs/keypad/8-pumpkin.png";
					break;
				case 14:
					ima[aa] = "imgs/keypad/5-doublek.png";
					break;
				case 15:
					ima[aa] = "imgs/keypad/15-meltedthree.png";
					break;
				case 16:
					ima[aa] = "imgs/keypad/11-six.png";
					break;
				case 17:
					ima[aa] = "imgs/keypad/21-paragraph.png";
					break;
				case 18:
					ima[aa] = "imgs/keypad/31-bt.png";
					break;
				case 19:
					ima[aa] = "imgs/keypad/4-smileyface.png";
					break;
				case 20:
					ima[aa] = "imgs/keypad/24-pitchfork.png";
					break;
				case 21:
					ima[aa] = "imgs/keypad/22-rightc.png";
					break;
				case 22:
					ima[aa] = "imgs/keypad/19-dragon.png";
					break;
				case 23:
					ima[aa] = "imgs/keypad/2-filledstar.png";
					break;
				case 24:
					ima[aa] = "imgs/keypad/27-tracks.png";
					break;
				case 25:
					ima[aa] = "imgs/keypad/14-ae.png";
					break;
				case 26:
					ima[aa] = "imgs/keypad/18-nwithhat.png";
					break;
				case 27:
					ima[aa] = "imgs/keypad/6-omega.png";
					break;
			}
		}
		return ima;
	}
}
