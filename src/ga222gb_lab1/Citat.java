package ga222gb_lab1;

import java.util.Scanner;

public class Citat {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv in en rad text: ");
        String text = sc.next();
        System.out.println("Citat: " + "\"" + text + "\"");
        sc.close();
    }
}
