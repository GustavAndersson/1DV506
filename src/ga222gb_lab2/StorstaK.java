package ga222gb_lab2;

import java.util.Scanner;

public class StorstaK {

    public static void main(String[] args){

        int sum = 0;
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mata in ett positivt heltal: ");
        int tal = sc.nextInt();
        sc.close();

        if(tal < 0){
            System.out.println("Du matade inte in ett positivt heltal, programmet avslutas.");
            System.exit(0);
        }

        while(sum < tal){
            k = k + 2;
            sum = sum + k;

            if(sum >= tal){
                k = k - 2;
                break;
            }
        }

        System.out.println("Största tal K sådant att 0+2+4+6+...+K < " + tal + " => K= " + k);
    }
}
