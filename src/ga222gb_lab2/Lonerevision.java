package ga222gb_lab2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Lonerevision {

    public static void main(String[] args){

        int totalLon = 0, medianLon, medelLon = 0, loneSpridning;
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Mata in löner (och avsluta med 'X'): ");

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(list);
        if(list.size() % 2 == 0){
            int mittenLon = list.get(list.size()/2);
            int mittenLon2 = list.get(list.size()/2 - 1);
            medianLon = (mittenLon + mittenLon2) / 2;
        }else{
            medianLon = list.get(list.size()/2);
        }

        int maxLon = Collections.max(list);
        int minLon = Collections.min(list);
        loneSpridning = maxLon - minLon;

        for(int i = 0; i < list.size(); i++){
            totalLon = totalLon + list.get(i);
            medelLon = totalLon / list.size();
        }

        System.out.println("Medianlön: " + medianLon
                + "\n" + "Medellön: " + medelLon
                + "\n" + "Lönespridning: " + loneSpridning);
    }
}
