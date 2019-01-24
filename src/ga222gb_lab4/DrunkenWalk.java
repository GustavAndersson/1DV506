package ga222gb_lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrunkenWalk {
    public static void main(String[] args){

        int outside = 0;
        double probability;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ange storlek: ");
        int size = sc.nextInt();
        System.out.print("Ange max antal steg: ");
        int max = sc.nextInt();
        System.out.print("Ange antal slumpvandringar: ");
        int numberOfWalks = sc.nextInt();

        for(int i = 0; i < numberOfWalks; i++){
            RandomWalk r = new RandomWalk(max, size);
            r.walk();
            if(!r.inBounds()){
                outside++;
            }
        }

        probability = ((double)outside / numberOfWalks) * 100;
        DecimalFormat dFormat = new DecimalFormat("#0.00");
        System.out.println("Av " + numberOfWalks + " onyktra personer, föll " + outside + " (" + dFormat.format(probability) + "%)" + " i vattnet.");
    }
}
