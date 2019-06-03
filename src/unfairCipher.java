/**
 * Unfair Cipher, started work on 7:30 AM 5/31/2019
 *
 * Paused work on 11:00 AM 5/31/2019 (finished key a + gui)
 *
 * Version 0.1
 */

import be.pcl.swing.ImprovedFormattedTextField;
import tangible.ListHelper;

import javax.management.ObjectInstance;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;
import java.util.List;

public class unfairCipher {
    static JFrame f;
    public static void module() {
        System.out.println("[UNFAIR CIPHER]");
        f = new JFrame("KAaNE [UNFAIR CIPHER]");
        ImageIcon icon = new ImageIcon("imgs/icons/Unfair Cipher.png");
        f.setIconImage(icon.getImage());
        // Edgework
        File configFile = new File("config.properties");
        Properties props = new Properties();
        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        // Text Fields
        JTextField encryptMsg = new JTextField();
        encryptMsg.setBounds(3,5,290,20);
        encryptMsg.setDocument(new JTextFieldLimit(40));
        NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
        ImprovedFormattedTextField moduleIDTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        moduleIDTB.setBounds(5,30,50,20);
        ImprovedFormattedTextField strikeTB = new ImprovedFormattedTextField(integerNumberInstance,0);
        strikeTB.setBounds(5,50,50,20);
        // Labels
        JLabel moduleIDLabel = new JLabel("Module ID");
        moduleIDLabel.setBounds(60,30,100,20);
        JLabel strikeLabel = new JLabel("Strikes");
        strikeLabel.setBounds(60,50,100,20);
        // Button
        JButton button = new JButton("OK");
        button.setBounds(200,50,75,20);
        // Add everything
        f.add(encryptMsg); f.add(moduleIDTB); f.add(strikeTB);
        f.add(moduleIDLabel); f.add(strikeLabel); f.add(button);
        // Define JFrame
        f.setLayout(null);
        f.setSize(300,150);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Logic
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Ah shit...here we go again.");
            // Serial Number
            String sn1 = props.getProperty("sn1");
            String sn2 = props.getProperty("sn2");
            String sn3 = props.getProperty("sn3");
            String sn4 = props.getProperty("sn4");
            String sn5 = props.getProperty("sn5");
            String sn6 = props.getProperty("sn6");
            String sn = sn1 + sn2 + sn3 + sn4 + sn5 + sn6;
            // Module ID
            String moduleID = moduleIDTB.getText();
            // Port Plates
            String plates = props.getProperty("plates");
            // Battery Holders
            String batteryHolders = props.getProperty("batteryHolders");
            System.out.println("====CALCULATING KEYS====");
            // Key A
            String keyA = keyA(sn4,sn5,sn,moduleID,plates,batteryHolders);
            // Key B
            String keyB = keyB();
            // Key C
            System.out.println("====KEY C====");
            String keyC = playfair(keyB,keyA);
            System.out.println("Key C - " + keyC);
        });
    }
    private static String keyA(String sn4, String sn5, String sn, String moduleID, String plates, String batteryHolders) {
        String output = "";
        System.out.println("====KEY A====");
        System.out.println("SN: " + sn);
        // STEP 2
        int sn1INT = 0;
        int sn2INT = 0;
        int sn3INT = 0;
        int sn4INT = 0;
        int sn5INT = 0;
        int sn6INT = 0;
        if (!string.isDigit(String.valueOf(sn.charAt(0)))) sn1INT = sn.charAt(0) - 'A' + 1; else sn1INT = Integer.parseInt(String.valueOf(sn.charAt(0)));
        if (!string.isDigit(String.valueOf(sn.charAt(1)))) sn2INT = sn.charAt(1) - 'A' + 1; else sn2INT = Integer.parseInt(String.valueOf(sn.charAt(1)));
        if (!string.isDigit(String.valueOf(sn.charAt(2)))) sn3INT = sn.charAt(2) - 'A' + 1; else sn3INT = Integer.parseInt(String.valueOf(sn.charAt(2)));
        if (!string.isDigit(String.valueOf(sn.charAt(3)))) sn4INT = sn.charAt(3) - 'A' + 1; else sn4INT = Integer.parseInt(String.valueOf(sn.charAt(3)));
        if (!string.isDigit(String.valueOf(sn.charAt(4)))) sn5INT = sn.charAt(4) - 'A' + 1; else sn5INT = Integer.parseInt(String.valueOf(sn.charAt(4)));
        if (!string.isDigit(String.valueOf(sn.charAt(5)))) sn6INT = sn.charAt(5) - 'A' + 1; else sn6INT = Integer.parseInt(String.valueOf(sn.charAt(5)));
        System.out.println("Ints: " + sn1INT + ", " + sn2INT + ", " + sn3INT + ", " + sn4INT + ", " + sn5INT + ", " + sn6INT);
        int digitSingleInt = 0;
        if (sn1INT >= 20) {
            String digitSingleString = String.valueOf(sn2INT) + String.valueOf(sn3INT) + String.valueOf(sn4INT) + String.valueOf(sn5INT) + String.valueOf(sn6INT);
            digitSingleInt = Integer.parseInt(digitSingleString);
        }
        else {
            String digitSingleString = String.valueOf(sn1INT) + String.valueOf(sn2INT) + String.valueOf(sn3INT) + String.valueOf(sn4INT) + String.valueOf(sn5INT) + String.valueOf(sn6INT);
            digitSingleInt = Integer.parseInt(digitSingleString);
        }
        System.out.println("Step 2 string: " + digitSingleInt);
        // STEP 3
        if (string.isVowel(sn4) || string.isVowel(sn5)) {
            digitSingleInt /= 10;
        }
        System.out.println("Step 3 string: " + digitSingleInt);
        // STEP 4
        String digitConverted = hexConvert(digitSingleInt);
        System.out.println("Step 4 string: " + digitConverted);
        // STEP 5
        String[] digitConvertedArray = digitConverted.split("");
        List<String> convertAgain = new ArrayList<String>();
        for (int index = 0; index!=digitConvertedArray.length-1; index += 1) {
            int index2 = index + 1;
            String check = digitConvertedArray[index] + digitConvertedArray[index2];
            try {
                int checkInt = Integer.parseInt(check);
                if (checkInt >= 10 && checkInt <= 26) {
                    char chr = (char)(checkInt+'A'-1);
                    convertAgain.add(String.valueOf(chr));
                }
                else {
                    checkInt = Integer.parseInt(digitConvertedArray[index]);
                    char chr = (char)(checkInt+'A'-1);
                    convertAgain.add(String.valueOf(chr));
                }
            } catch (NumberFormatException e) {
                if (digitConvertedArray[index].equals("0")) {
                    convertAgain.add("");
                }
                else if (string.isDigit(digitConvertedArray[index])) {
                    int checkInt = Integer.parseInt(digitConvertedArray[index]);
                    char chr = (char)(checkInt+'A'-1);
                    convertAgain.add(String.valueOf(chr));
                }
                else {
                    convertAgain.add(digitConvertedArray[index]);
                }
            }
            System.out.println("Step 5 iteration " + (index + 1) + ": " + convertAgain.toArray()[index]);
        }
        String lastChr = digitConvertedArray[digitConvertedArray.length-1];
        int index = digitConvertedArray.length;
        if (lastChr.equals("0")) {
            convertAgain.add("");
        }
        else if (string.isDigit(lastChr)) {
            int checkInt = Integer.parseInt(lastChr);
            char chr = (char)(checkInt+'A'-1);
            convertAgain.add(String.valueOf(chr));
        } else {
            convertAgain.add(lastChr);
        }
        System.out.println("Step 5 iteration " + index + ": " + convertAgain.toArray()[index-1]);
        convertAgain.removeAll(Arrays.asList("",null));
        System.out.println("Step 5 String: " + Arrays.toString(convertAgain.toArray()).toUpperCase());
        // STEP 6
        System.out.println("Module ID - " + moduleID);
        System.out.println("Plates - " + plates);
        System.out.println("Battery Holders - " + batteryHolders);
        String moduleIDconv = "";
        String platesconv = "";
        String batteryHoldersconv = "";
        if (!moduleID.equals("0")) moduleIDconv = String.valueOf((char)(moduleID.charAt(0) + 48));
        if (!plates.equals("0")) platesconv = String.valueOf((char)(plates.charAt(0) + 48));
        if (!batteryHolders.equals("0")) batteryHoldersconv = String.valueOf((char)(batteryHolders.charAt(0) + 48));
        convertAgain.add(moduleIDconv);
        convertAgain.add(platesconv);
        convertAgain.add(batteryHoldersconv);
        convertAgain.removeAll(Arrays.asList("",null));
        output = Arrays.toString(convertAgain.toArray()).toUpperCase();
        // Remove extra characters
        String regx = "[], ";
        char[] ca = regx.toCharArray();
        for (char c : ca) {
            output = output.replace(""+c, "");
        }
        System.out.println("KEY A - " + output);
        return output;
    }
    private static String keyB () {
        System.out.println("====KEY B====");
        // Array of Arrays
        String[][] possibilities = {
                {"ABDA","FEV","DBHC","BLD","DBIE","AFEF","AFCG","CQH","DEAI","FEAA","EFAB","DECC"},
                {"ABDB","FEW","DBHD","BLE","DBIF","AFEG","AFCH","CQI","DEAA","FEAB","EFAC","DECD"},
                {"ABDC","FEX","DBHE","BLF","DBIG","AFEH","AFCI","CQA","DEAB","FEAC","EFAD","DECE"},
                {"ABDD","FEY","DBHF","BLG","DBIH","AFEI","AFCA","CQB","DEAC","FEAD","EFAE","DECF"},
                {"ABDE","FEZ","DBHG","BLH","DBII","AFEA","AFCB","CQC","DEAD","FEAE","EFAF","DED"},
                {"ABDF","FEBG","DBHH","BLI","DBIA","AFEB","AFCC","CQD","DEAE","FEAF","EFB","DEDA"},
                {"ABDG","FEBH","DBHI","BLA","DBIB","AFEC","AFCD","CQE","DEAF","FET","EFBA","DEDB"}
        };
        // Grab current day + month
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int month = calendar.get(Calendar.MONTH);
        // Get indexes
        int i1 = 0;
        int i2 = 0;
        switch (day) {
            case Calendar.MONDAY: i1 = 0; break;
            case Calendar.TUESDAY: i1 = 1; break;
            case Calendar.WEDNESDAY: i1 = 2; break;
            case Calendar.THURSDAY: i1 = 3; break;
            case Calendar.FRIDAY: i1 = 4; break;
            case Calendar.SATURDAY: i1 = 5; break;
            case Calendar.SUNDAY: i1 = 6; break;
        }
        switch (month) {
            case Calendar.JANUARY: i2 = 0; break;
            case Calendar.FEBRUARY: i2 = 1; break;
            case Calendar.MARCH: i2 = 2; break;
            case Calendar.APRIL: i2 = 3; break;
            case Calendar.MAY: i2 = 4; break;
            case Calendar.JUNE: i2 = 5; break;
            case Calendar.JULY: i2 = 6; break;
            case Calendar.AUGUST: i2 = 7; break;
            case Calendar.SEPTEMBER: i2 = 8; break;
            case Calendar.OCTOBER: i2 = 9; break;
            case Calendar.NOVEMBER: i2 = 10; break;
            case Calendar.DECEMBER: i2 = 11; break;
        }
        // output
        String output = possibilities[i1][i2];
        System.out.println("Day Index: " + i1 + ", Month Index: " + i2);
        System.out.println("KEY B: " + output);
        return output;
    }
    // Note: Might not work as intended due to Java not allowing user-defined value types.
    // public struct Cell
    public final static class Cell {
        public char character;
        public int X;
        public int Y;
        public Cell() {}

        public Cell(char _character, int _X, int _Y) {
            this.character = _character;
            this.X = _X;
            this.Y = _Y;
        }

        public Cell clone() {
            Cell varCopy = new Cell();

            varCopy.character = this.character;
            varCopy.X = this.X;
            varCopy.Y = this.Y;

            return varCopy;
        }
    }
    private static String playfair(String key, String plain) {
        System.out.println("Playfair Inputs: Key - " + key + " PlainText - " + plain);
        // Mostly manually converted from Maca's code (because I don't know how to complex code for shit)

        // define alphabet
        char[] alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ".toCharArray();

        // adjust key
        key = key.trim();
        key = key.toUpperCase();
        key = key.replace(" ", "");
        key = key.replace("J","I");
        plain = plain.trim();
        plain = plain.toUpperCase();
        plain = plain.replace(" ","");
        plain = plain.replace("J","I");

        StringBuilder keyString = new StringBuilder();

        // TODO: Fix any exceptions
        for (char c : key.toCharArray()) {
            if (!keyString.toString().contains(String.valueOf(c))) {
                keyString.append(c);
                // alphabet = alphabet.Where(val => val != c).ToArray();
                List alphabetList = new ArrayList(Arrays.asList(alphabet));
                for (Iterator<String> it=alphabetList.iterator(); it.hasNext();) {
                    if (it.next().contains(String.valueOf(c)))
                        it.remove();
                }
                String str = alphabetList.toString().replaceAll(",","");
                alphabet = str.substring(1,str.length()-1).replaceAll(" ","").toCharArray();
                // I have no idea if the above code will work, but it's my best attempt.
                // Fuck me C# devs are lucky.
            }
        }

        adjustText(plain);

        // If the length of the plain text is odd, add X
        if ((plain.length() % 2 > 0)){
            plain += "X";
        }

        ArrayList<String> plainTextEdited = new ArrayList<String>();

        //Split plain text into pairs
        for (int i = 0; i < plain.length(); i += 2) {
            //If a pair of chars contains the same letters replace one of them with X
            if (plain.charAt(i) == (plain.charAt(i + 1))) {
                plainTextEdited.add(String.valueOf(plain.charAt(i) + 'X'));
            }
            else {
                plainTextEdited.add(String.valueOf(plain.charAt(i) + plain.charAt(i + 1)));
            }
        }

        //region Create 5 x 5 matrix
        List<Cell> matrix = new ArrayList<>();

        int keyIDCounter = 0;
        int alphabetIDCounter = 0;

        //Fill the matrix. First with the key characters then with the alphabet
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (keyIDCounter < keyString.length()) {
                    Cell cell = new Cell(keyString.charAt(keyIDCounter), x, y);
                    matrix.add(cell);
                    keyIDCounter++;
                }
                else {
                    Cell cell = new Cell(alphabet[alphabetIDCounter], x, y);
                    matrix.add(cell);
                    alphabetIDCounter++;

                }
            }
        }
        //endregion
        StringBuilder cipher = new StringBuilder();
        for (String pair : plainTextEdited) {
            int indexA = ListHelper.findIndex(matrix, (Cell c) -> c.character == pair.charAt(0));
            Cell a = matrix.get(indexA).clone();
            int indexB = ListHelper.findIndex(matrix, (Cell c) -> c.character == pair.charAt(1));
            Cell b = matrix.get(indexB).clone();
            //Write cipher
            if (a.X == b.X){
                cipher.append(matrix.get(ListHelper.findIndex(matrix, (Cell c) -> c.Y == (a.Y + 1) % 5 && c.X == a.X)).character);
                cipher.append(matrix.get(ListHelper.findIndex(matrix, (Cell c) -> c.Y == (b.Y + 1) % 5 && c.X == b.X)).character);
            }
            else if (a.Y == b.Y) {
                cipher.append(matrix.get(ListHelper.findIndex(matrix, (Cell c) -> c.Y == a.Y && c.X == (a.X + 1) % 5)).character);
                cipher.append(matrix.get(ListHelper.findIndex(matrix, (Cell c) -> c.Y == b.Y % 5 && c.X == (b.X + 1) % 5)).character);
            }
            else {
                cipher.append(matrix.get(ListHelper.findIndex(matrix, (Cell c) -> c.X == a.X && c.Y == b.Y)).character);
                cipher.append(matrix.get(ListHelper.findIndex(matrix, (Cell c) -> c.X == b.X % 5 && c.Y == a.Y)).character);
            }
        }
        return cipher.toString();
    }
    private static String hexConvert (int a) {
        System.out.println("CONVERTING TO HEX...");
        String output = "";
        boolean continuing = true;
        List<String> hexRemainder = new ArrayList<String>();
        int iteration = 0;
        int b = a;
        while (continuing) {
            // Divide by 16
            b = a;
            int remainder = a % 16;
            a /= 16;
            if (b != 0) {
                // Convert remainder to Hex
                hexRemainder.add(Integer.toHexString(remainder));
                iteration += 1;
                System.out.println("Iteration " + iteration + ": " + Integer.toHexString(remainder));
            }
            else continuing = false;
        }
        Collections.reverse(hexRemainder);
        String[] hexArray = hexRemainder.toArray(new String[0]);
        output = Arrays.toString(hexArray);
        // remove unnecessary characters
        String regx = "[], ";
        char[] ca = regx.toCharArray();
        for (char c : ca) {
            output = output.replace(""+c, "");
        }
        // remove leading zeros (just in case)
        output.replaceFirst("^0+(?!$)", "");
        return output;
    }
    private static String adjustText(String text) {
        text = text.trim();
        text = text.replace(" ", "");
        text = text.replace("J", "I");
        text = text.toUpperCase();

        return text;
    }
}
