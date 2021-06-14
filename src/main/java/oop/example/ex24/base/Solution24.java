package oop.example.ex24.base;

import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {

        readUserInput(); // read in two strings

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        System.out.print("\""+ word1 +"\"" + " and " + "\""+ word2+ "\" ");
        String output = generateOutput(result);
        System.out.println(output);

    }
    public static void readUserInput(){
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        word1 = in.nextLine();

        System.out.print("Enter the second string: ");
        word2 = in.nextLine();
    }
    public static String generateOutput(boolean isAnagram) {
        if (isAnagram) {
            return "are anagrams.";
        } else{
            return "are not anagrams.";
        }
    }
}
