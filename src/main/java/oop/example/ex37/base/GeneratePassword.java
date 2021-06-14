package oop.example.ex37.base;

import java.util.ArrayList;
import java.util.Random;

public class GeneratePassword {
    public static ArrayList<Character> lettersList = new ArrayList<Character>();
    public static ArrayList<Character> numbersList = new ArrayList<Character>();
    public static ArrayList<Character> specialCharactersList = new ArrayList<Character>();
    public static Random rand = new Random();

    public static String getPassword(int length, int specialChar, int numbers){
        int leftover = length - specialChar - numbers;

        fillInArrays();
        String finalSpecialChars = generateSpecialChar(specialChar);
        String finalNums = generateNums(numbers);
        String finalLetters = generateLetters(leftover);

        // return a giant string with all the elements
        return finalSpecialChars + finalNums + finalLetters;
    }

    public static String generateLetters(int leftover) {
        String result = "";
        for(int i = 0; i < leftover; i++){
            // randomly generate a special character
            char temp = (lettersList.get(rand.nextInt(lettersList.size())));
            result = result + temp; // append string
        }
        //System.out.println(result);
        return result;
    }

    public static String generateNums(int numbers) {
        String result = "";
        for(int i = 0; i < numbers; i++){
            // randomly generate a special character
            char temp = (numbersList.get(rand.nextInt(numbersList.size())));
            result = result + temp; // append string
        }
        //System.out.println(result);
        return result;
    }

    public static String generateSpecialChar(int specialChar) {
        String result = "";
        for(int i = 0; i < specialChar; i++){
            // randomly generate a special character
            char temp = (specialCharactersList.get(rand.nextInt(specialCharactersList.size())));
            result = result + temp; // append string
        }
        //System.out.println(result);
        return result;
    }

    public static void fillInArrays() {

        for (char c = 'a'; c <= 'z'; c++){
            lettersList.add(c); // add lowercase
        }
        for (char c = 'A'; c <= 'Z'; c++){
            lettersList.add(c); // add Uppercase
        }

        for (char c = '0'; c <= '9'; c++){
            numbersList.add(c); // add numbersList
        }

        for (char c = '!'; c <= '*'; c++){
            specialCharactersList.add(c); // add Special Characters
        }
        specialCharactersList.add('@');
        specialCharactersList.add('?');
        specialCharactersList.add('~');
    }
}
