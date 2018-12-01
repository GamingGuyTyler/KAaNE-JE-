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
}
