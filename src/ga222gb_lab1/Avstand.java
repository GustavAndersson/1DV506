package ga222gb_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Avstand {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Första kordinatens x-axel: ");
        double x1 = sc.nextDouble();
        System.out.print("Första kordinatens y-axel: ");
        double y1 = sc.nextDouble();

        System.out.print("Andra kordinatens x-axel: ");
        double x2 = sc.nextDouble();
        System.out.print("Andra kordinatens y-axel: ");
        double y2 = sc.nextDouble();

        double beraknaAvstand = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        DecimalFormat dFormat = new DecimalFormat("0.###");
        String avstand = dFormat.format(beraknaAvstand);

        System.out.println("Avståndet mellan kordinaterna är: " + avstand + " längdenheter.");
        sc.close();
    }
}
