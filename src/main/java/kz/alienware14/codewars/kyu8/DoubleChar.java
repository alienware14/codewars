package kz.alienware14.codewars.kyu8;

/** Double Char

 *Given a string, you have to return a string in which each
 * character (case-sensitive) is repeated once.

 * Examples (Input -> Output):
 * * "String"      -> "SSttrriinngg"
 * * "Hello World" -> "HHeelllloo  WWoorrlldd"
 * * "1234!_ "     -> "11223344!!__  "

 * **/
public class DoubleChar {

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
    }

    public static String doubleChar(String s){
        //enter your code here
        String r = "";
        for(int i = 0; i < s.length(); i++){
            r += s.charAt(i) +""+ s.charAt(i);
        }
        return r;
    }
}
