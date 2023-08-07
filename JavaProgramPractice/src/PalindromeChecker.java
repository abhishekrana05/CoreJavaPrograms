/* To check whether a string is palindrome or not in Java */

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "level"; // Replace this with your string to check
        if (isPalindrome(input)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}

/*
 * This code defines a method isPalindrome() that takes a string as input and 
 * checks if it is a palindrome by comparing characters from the start and end 
 * of the string. If they match, it continues to the next pair of characters until 
 * the whole string is checked. If any pair of characters doesn't match, it returns false, 
 * otherwise, it returns true.
 * */

// Output = It is a palindrome.
 