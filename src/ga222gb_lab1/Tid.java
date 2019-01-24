package ga222gb_lab1;

import java.util.Scanner;

public class Tid {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ange antal sekunder: ");
        int sekunderTotalt = sc.nextInt();

        int timmar = sekunderTotalt / 3600;
        int sekunderKvar = sekunderTotalt - timmar * 3600;
        int minuter = sekunderKvar / 60;
        sekunderKvar = sekunderKvar - minuter * 60;
        int sekunder = sekunderKvar;

        System.out.println("Detta motsvarar: " + timmar + " timmar, " + minuter + " minuter och " + sekunder + " sekunder.");
        sc.close();
    }
}
