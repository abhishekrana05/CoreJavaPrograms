/* Count the number of vowels in a string in Java */

public class VowelCounter {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

/*
 * In this code, the countVowels method takes a string as input and iterates 
 * through each character in the string. It checks if the character is a 
 * lowercase vowel ('a', 'e', 'i', 'o', or 'u'). If it is, the count of vowels is 
 * incremented. The input string is converted to lowercase before counting the vowels 
 * to ensure that both uppercase and lowercase vowels are considered.
 * */

// Output = Number of vowels in the string: 3