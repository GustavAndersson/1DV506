package ga222gb_lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class OmvandOrdning {

    public static void main(String[] args){

        int tal = 1;
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder utskrift = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Mata in positiva heltal. Avsluta med ett negativt.");

        while(tal > 0){
            System.out.print("Tal " + (list.size() + 1) + ": ");
            tal = sc.nextInt();
            list.add(tal);
        }
        sc.close();

        utskrift.append("Antal positiva: " + (list.size() - 1) + "\n" + "Baklänges: ");
        for(int i = list.size() - 2; i >= 0; i--){
            utskrift.append(list.get(i) + " ");
        }
        System.out.println(utskrift);
    }
}
