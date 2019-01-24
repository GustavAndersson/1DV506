package ga222gb_lab3;

public class Pnr {

    public static void main(String[] args){

        String personNumber = "970326-4219";
        String personNumber2 = "930314-7349";

        System.out.println(isFemaleNumber(personNumber));
        System.out.println(isMaleNumber(personNumber));
        System.out.println(areEqual(personNumber, personNumber2));
        System.out.println(isCorrect(personNumber));
    }

    private static String getFirstPart(String pnr){
        String firstPart = pnr.substring(0, 6);
        return firstPart;
    }

    private static String getSecondPart(String pnr){
        String secondPart = pnr.substring(7, 11);
        return secondPart;
    }

    private static boolean isFemaleNumber(String pnr){
        char genderLetter = pnr.charAt(9);
        if(genderLetter % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    private static boolean isMaleNumber(String pnr){
        char genderLetter = pnr.charAt(9);
        if(genderLetter % 2 != 0){
            return true;
        }else{
            return false;
        }
    }

    private static boolean areEqual(String pnr1, String pnr2){
        if(pnr1.equals(pnr2)){
            return true;
        }
        else{
            return false;
        }
    }

    private static boolean isCorrect(String pnr){
        int[] number = new int[pnr.length() - 1];
        String firstPart = getFirstPart(pnr);
        String secondPart = getSecondPart(pnr);

        //Check if person number are 10 digits
        if(firstPart.length() + secondPart.length() != 10){
            System.out.println("It's not the correct amount of digits");
            return false;
        }

        //Put first part into the array "number"
        for(int i = 0; i < firstPart.length(); i++){
            if(Character.isDigit(firstPart.charAt(i))){
                char c = firstPart.charAt(i);
                number[i] = Character.getNumericValue(c);
            }else{
                System.out.println("Letters are not allowed");
                return false;
            }
        }

        //Put second part into the array "number"
        for(int i = 0; i < secondPart.length(); i++){
            if(Character.isDigit(secondPart.charAt(i))){
                char c = secondPart.charAt(i);
                number[i + 6] = Character.getNumericValue(c);
            }else{
                System.out.println("Letters are not allowed");
                return false;
            }
        }

        //Calculations below to see if the check digit is correct
        String products = "";
        for(int i = 0; i < number.length; i++){
            int product = 0;
            if(i % 2 == 0){
                product = number[i] * 2;
            }else{
                product = number[i];
            }
            products = products + product;
        }

        int sum = 0;
        for(int i = 0; i < products.length() - 1; i++){
            char c = products.charAt(i);
            sum = sum + Character.getNumericValue(c);
        }

        if((10 - (sum % 10)) % 10 != number[9]){
            System.out.println("The check digit is wrong");
            return false;
        }

        return true;
    }
}
