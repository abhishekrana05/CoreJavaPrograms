/* Create an arraylist use iterator to iterate it , use for loop and enhanced for loop. 
 * Print only the even numbers stored in the arraylist in Java. */

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbersExample {
    public static void main(String[] args) {
        // Create an ArrayList to store numbers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(10);

        // Using Iterator to iterate through the ArrayList and print even numbers
        System.out.println("Even numbers using Iterator:");
        Iterator<Integer> iterator = numbersList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        // Using traditional for loop to iterate through the ArrayList and print even numbers
        System.out.println("Even numbers using for loop:");
        for (int i = 0; i < numbersList.size(); i++) {
            int number = numbersList.get(i);
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        // Using enhanced for loop (foreach loop) to iterate through the ArrayList and print even numbers
        System.out.println("Even numbers using enhanced for loop:");
        for (int number : numbersList) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}

/*In this example, we have an ArrayList of integers called numbersList, and we use three 
 * different methods to iterate through it and print the even numbers. The Iterator approach 
 * is generally useful when you need to perform operations like adding or removing elements 
 * while iterating, whereas the enhanced for loop (foreach loop) is more concise and 
 * convenient for simple iterations. The traditional for loop is used when you need access 
 * to the index of the element being iterated.*/

/*
 * Output :
Even numbers using Iterator:
2 4 6 8 10 
Even numbers using for loop:
2 4 6 8 10 
Even numbers using enhanced for loop:
2 4 6 8 10 
 * */
