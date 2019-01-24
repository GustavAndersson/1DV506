package ga222gb_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class VindAvkylning {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ange temperatur (C): ");
        double temperatur = sc.nextDouble();
        System.out.print("Ange vindhastigheten (m/s): ");
        double vind = sc.nextDouble();

        double vindHastighet = vind * 3.6;
        double twc = 13.12 + 0.6215 * temperatur - 11.37 * Math.pow(vindHastighet, 0.16) + 0.3965 * temperatur * Math.pow(vindHastighet, 0.16);

        DecimalFormat dFormat = new DecimalFormat("0.#");
        String upplevdTemp = dFormat.format(twc);

        System.out.println("Upplevd temperatur (C): "+ upplevdTemp);
        sc.close();
    }
}
