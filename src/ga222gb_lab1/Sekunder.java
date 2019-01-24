package ga222gb_lab1;

import java.util.Scanner;

public class Sekunder {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Timmar: ");
        int timmar = sc.nextInt();
        System.out.print("Minuter: ");
        int minuter = sc.nextInt();
        System.out.print("Sekunder: ");
        int sekunder = sc.nextInt();

        int sekunderTotalt = timmar * 3600 + minuter * 60 + sekunder;
        System.out.println("Totala antalet sekunder: " + sekunderTotalt);
        sc.close();
    }
}
