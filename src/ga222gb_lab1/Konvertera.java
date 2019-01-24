package ga222gb_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Konvertera {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double beraknaCelsius = (fahrenheit - 32) * 5 / 9;
        DecimalFormat dFormat = new DecimalFormat("0.#");
        String celsius = dFormat.format(beraknaCelsius);
        System.out.println("Celsius: " + celsius);
        sc.close();
    }
}
