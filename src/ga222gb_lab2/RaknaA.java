package ga222gb_lab2;

import java.util.Scanner;

public class RaknaA {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Mata in en textrad: ");
        String text = sc.nextLine();
        sc.close();

        int storaA = 0;
        int smaA = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a'){
                smaA++;
            }else if(text.charAt(i) == 'A'){
                storaA++;
            }
        }
        System.out.println("Antal a: " + smaA + "\n" + "Antal A: " + storaA);
    }
}
