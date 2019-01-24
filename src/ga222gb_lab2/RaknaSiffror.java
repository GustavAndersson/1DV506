package ga222gb_lab2;

import java.util.Scanner;

public class RaknaSiffror {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Mata in ett heltal: ");
        int heltal = sc.nextInt();
        sc.close();

        int antalNollor = 0, antalUdda = 0, antalJamna = 0, siffra;

        while(heltal > 0){
            siffra = heltal % 10;
            if(siffra == 0){
                antalNollor++;
            }else if(siffra % 2 == 0){
                antalJamna++;
            }else{
                antalUdda++;
            }
            heltal = heltal / 10;
        }

        System.out.println("Nollor: " + antalNollor + "\n" + "Udda: " + antalUdda + "\n" + "Jämna: " + antalJamna);
    }
}
