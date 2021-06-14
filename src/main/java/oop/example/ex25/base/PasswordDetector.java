package oop.example.ex25.base;

public class PasswordDetector {
    public static int passwordValidator(String password){
        int n = password.length();
        int isDigitFlag = 0, isLetterFlag = 0, isSpecialCharFlag = 0;

        for (int i = 0; i < n; i++){
            if (Character.isDigit(password.charAt(i))){
                isDigitFlag = 1;
            } else if (Character.isLetter(password.charAt(i))){
                isLetterFlag = 1;
            } else{
                // is special character
                isSpecialCharFlag = 1;
            }
        }
        return getStrength(isDigitFlag, isLetterFlag, isSpecialCharFlag, n);
    }

    private static int getStrength(int isDigitFlag, int isLetterFlag, int isSpecialCharFlag, int length) {
        if (length < 8 && isDigitFlag == 1 && isLetterFlag == 0){
            // A very weak password contains only numbersList and special characters
            // and is fewer than eight characters
           return 1;
        } else if (length < 8 && isDigitFlag == 0 && isLetterFlag == 1){
            // A weak password contains only lettersList or special characters
            // and is fewer than eight characters.
            return 2;
        } else if (length >= 8 && isDigitFlag == 1 && isLetterFlag == 1 && isSpecialCharFlag == 0){
            // A strong password contains lettersList and at least one number and is at least eight characters.
            return 3;
        } else if (length >= 8 && isDigitFlag == 1 && isLetterFlag == 1 && isSpecialCharFlag == 1){
            // A very strong password contains lettersList, numbersList,
            // and special characters and is at least eight characters.
            return 4;
        } else if (length < 8){
            // less than 8 characters
            // can contain special characters and/or a combination of lettersList/numbersList
            return 5;
        } else{
            // length is greater than 8 but does not satisfy the last two conditions
            return 5;
        }
    }


}
