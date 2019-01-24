package ga222gb_lab1;

import java.util.Random;

public class TelefonNummer {

    public static void main(String[] args){

        Random rand = new Random();

        int rikt1 = 0;
        int rikt2 = rand.nextInt(10);
        int rikt3 = rand.nextInt(10);
        int rikt4 = rand.nextInt(10);

        int lokal1 = rand.nextInt(10) + 1;
        int lokal2 = rand.nextInt(10);
        int lokal3 = rand.nextInt(10);
        int lokal4 = rand.nextInt(10);
        int lokal5 = rand.nextInt(10);
        int lokal6 = rand.nextInt(10);

        System.out.println("Telefonnummer: " + rikt1 + rikt2 + rikt3 + rikt4 + "-"
                + lokal1 + lokal2 + lokal3 + lokal4 + lokal5 + lokal6);
    }
}
