package ga222gb_lab1;

import java.util.Scanner;

public class SummaAvTre {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ange ett tresiffrigt heltal: ");
        int heltal = sc.nextInt();

        int tal1 = heltal / 100;

        int tal2 = heltal / 10;
        tal2 = tal2 % 10;

        int tal3 = heltal % 10;

        System.out.println("Summan av siffrorna i heltalet är: " + (tal1 + tal2 + tal3));
        sc.close();
    }
}
