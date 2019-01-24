package ga222gb_lab1;

import java.util.Scanner;
import java.lang.Math;

public class BMI {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ange din längd i meter: ");
        double langd = sc.nextDouble();
        System.out.print("Ange din vikt  i kilogram: ");
        double vikt = sc.nextDouble();

        double bmi = vikt/Math.pow(langd, 2);
        System.out.println("Ditt BMI är: " + (int)Math.round(bmi));
        sc.close();
    }
}
