/**
 * Little bits of code that I've been meaning to make as separate shit.
 * 
 * Originally made for KAaNE JE.
 * 
 * Feel free to use this in your code. You don't even have to credit me.
 * 
 * If you do, my name is Tyler.
 * 
 * Started this thing on 10/17/2018 4:44 PM
 * 
 * Version 0.1 - Initial Release.
 * 
 * Version 0.1
 */

public class string {
    public static boolean isDigit(String a) {
        try {double b = Double.parseDouble(a);}  
        catch(NumberFormatException ex){return false;}  
        return true;
    }
    public static boolean isVowel(String a) {
        if (a.equals("A") || a.equals("a") ||
            a.equals("E") || a.equals("e") ||
            a.equals("I") || a.equals("i") ||
            a.equals("O") || a.equals("o") ||
            a.equals("U") || a.equals("u")) {
            return true;
        }
        else return false;
    }
}
