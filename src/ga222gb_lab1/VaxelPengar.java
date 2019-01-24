package ga222gb_lab1;

import java.util.Scanner;
import java.lang.Math;

public class VaxelPengar {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ange kostnaden: ");
        double kostnad = sc.nextDouble();
        System.out.print("Ange erhållet belopp: ");
        double erhalletBelopp = sc.nextDouble();

        int pengarTillbaka = (int)Math.round(erhalletBelopp - kostnad);
        System.out.println("Tillbaka: " + pengarTillbaka + " kronor");

        int tusenLappar = pengarTillbaka / 1000;
        int pengarKvar = pengarTillbaka % 1000;

        int femhundraLappar = pengarKvar / 500;
        pengarKvar = pengarKvar % 500;

        int hundraLappar = pengarKvar / 100;
        pengarKvar = pengarKvar % 100;

        int femtioLappar = pengarKvar / 50;
        pengarKvar = pengarKvar % 50;

        int tjugoLappar = pengarKvar / 20;
        pengarKvar = pengarKvar % 20;

        int tioKronor = pengarKvar / 10;
        pengarKvar = pengarKvar % 10;

        int femKronor = pengarKvar / 5;
        pengarKvar = pengarKvar % 5;

        int enKronor = pengarKvar;

        System.out.println("1000-lappar: " + tusenLappar + "\n"
                + "500-lappar: " + femhundraLappar + "\n"
                + "100-lappar: " + hundraLappar + "\n"
                + "50-lappar: " + femtioLappar + "\n"
                + "20-lappar: " + tjugoLappar + "\n"
                + "10-kronor: " + tioKronor + "\n"
                + "5-kronor: " + femKronor + "\n"
                + "1-kronor: " + enKronor);

        sc.close();
    }
}
