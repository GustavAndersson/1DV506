package ga222gb_lab2;

import java.util.Scanner;

public class Baklanges {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Mata in en textrad: ");
        String text = sc.nextLine();
        sc.close();

        StringBuilder textBaklanges = new StringBuilder();

        for(int i = text.length() - 1; i >= 0; i--){
            char c = text.charAt(i);
            textBaklanges.append(c);
        }

        System.out.println("Baklänges: " + textBaklanges);
    }
}
