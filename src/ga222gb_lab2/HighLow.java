package ga222gb_lab2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int slumptal = rand.nextInt(100) + 1;
        int gissning = 0, antalGissningar = 1;
        boolean svar = false;

        while(svar == false){
            System.out.print("Gissning " + antalGissningar + ": ");
            gissning = sc.nextInt();
            if(gissning < slumptal){
                System.out.println("högre");
                antalGissningar++;
            }else if(gissning > slumptal){
                System.out.println("lägre");
                antalGissningar++;
            }else{
                System.out.println("Rätt svar efter " + antalGissningar + " gissningar!");
                svar = true;
            }
            if(antalGissningar > 10){
                System.out.println("Nu får du inte fler försök!");
                break;
            }
        }
        sc.close();
    }
}
