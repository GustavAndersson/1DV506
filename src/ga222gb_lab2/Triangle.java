package ga222gb_lab2;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        StringBuilder ratvinkligTriangel = new StringBuilder();
        StringBuilder likbentTriangel = new StringBuilder();
        int antalMellanslag = 0, antalStjarnor = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Mata in ett udda heltal: ");
        int heltal = sc.nextInt();
        sc.close();

        if(heltal % 2 == 0){
            System.out.println("Du matade inte in ett udda tal. Programmet avslutas.");
            System.exit(0);
        }

        for(int i = 0; i < heltal; i++){
            antalMellanslag = heltal - i;
            antalStjarnor = heltal - antalMellanslag;
            for(int j = 0; j <= antalMellanslag; j++){
                ratvinkligTriangel.append(" ");
            }
            for(int k = 0; k <= antalStjarnor; k++){
                ratvinkligTriangel.append("*");
            }
            ratvinkligTriangel.append("\n");
        }
        System.out.println("Rätvinklig triangel: " + "\n" + ratvinkligTriangel);

        for(int i = 1; i <= heltal; i+=2){
            antalStjarnor = i;
            antalMellanslag = (heltal - antalStjarnor) / 2;
            for(int j = 0; j < antalMellanslag; j++){
                likbentTriangel.append(" ");
            }
            for(int k = 0; k < antalStjarnor; k++){
                likbentTriangel.append("*");
            }
            likbentTriangel.append("\n");
        }
        System.out.println("Likbent triangel: " + "\n" + likbentTriangel);
    }
}
