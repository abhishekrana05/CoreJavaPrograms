/* Find the frequency of the characters present in a string in Java */

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String inputString = "hello, world!";
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        for (char c : charFrequency.keySet()) {
            int frequency = charFrequency.get(c);
            System.out.println("'" + c + "' occurs " + frequency + " times.");
        }
    }
}

/*
 * To find the frequency of characters present in a string in Java, 
 * we can use a HashMap to store the characters as keys and their occurrences as values.
 * Replace inputString with your desired string, and the program will output the frequency 
 * of each character present in the string (excluding non-alphanumeric characters).
 * */
 
/*
 * Output :
'r' occurs 1 times.
'd' occurs 1 times.
'e' occurs 1 times.
'w' occurs 1 times.
'h' occurs 1 times.
'l' occurs 3 times.
'o' occurs 2 times.
 */
