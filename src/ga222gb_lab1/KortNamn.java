package ga222gb_lab1;

import java.util.Scanner;

public class KortNamn {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Förnamn: ");
        String fornamn = sc.nextLine();
        System.out.print("Efternamn: ");
        String efternamn = sc.nextLine();
        char kortFornamn = fornamn.charAt(0);

        String kortEfternamn = efternamn.substring(0, Math.min(4, efternamn.length()));
        System.out.println("Kort namn: " + kortFornamn + ". " + kortEfternamn);
        sc.close();
    }
}
