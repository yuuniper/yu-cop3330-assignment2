package oop.example.ex27.base;

public class checkInput {
    public static boolean validateInput(String firstName, String lastName, String id, String zipcode){
        boolean isZIPcode = true, isID = true, isFirstName = true, isLastName = true;

        if (firstName.length() < 2){
            System.out.println("The first name must be at least 2 characters long.");
            isFirstName = false;
        }
        if (lastName.length() < 2){
            System.out.println("The last name must be at least 2 characters long.");
            isLastName = false;
        }
        for (int i = 0; i < zipcode.length(); i++){
            if(zipcode.length() != 5 || !Character.isDigit(zipcode.charAt(i))){
                isZIPcode = false;
            }
        }
        if (!isZIPcode){
            System.out.println("The zipcode must be a 5 digit number.");
        }

        isID = checkID(id, true);
        if (!isID){
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        return isFirstName && isLastName && isID && isZIPcode;
    }

    public static boolean checkID(String id, boolean isID){
        if (id.length() < 7){
            return false;
        }
        if(!Character.isLetter(id.charAt(0)) || !Character.isLetter(id.charAt(1))){
            isID = false;
        }
        if(id.charAt(2) != '-'){
            isID = false;
        }
        if (!Character.isDigit(id.charAt(3)) || !Character.isDigit(id.charAt(4)) ||
                !Character.isDigit(id.charAt(5)) || !Character.isDigit(id.charAt(6))){
            isID = false;
        }

        return isID;
    }
}
