package com.objectorientation;
//import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String s = "Creativity is seeing the think but thinking differently";
        
        // Convert the string to a character array
        char a[] = s.toCharArray();
        
        int count = 1; // Start at 1 since the last word won't have a space after it
        
        // Loop through the character array to count spaces
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') { // Check for spaces
                count++;
            }
        }
        
        // Print the word count
        System.out.println("Word count: " + count);
    }
}