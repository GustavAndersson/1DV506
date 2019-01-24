package ga222gb_lab4.sorter_orter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SorteraOrter {

    public static void main(String[] args)throws IOException{

        String path = "C:\\Users\\guust\\Desktop\\orter.dat";
        System.out.println("Läser orter från filen: " + path);
        ArrayList<Ort> list = new ArrayList<>();
        try{
            File file = new File(path);
            Scanner scanFile = new Scanner(file);
            while(scanFile.hasNext()){
                String town = scanFile.next();

                String[] info = town.split(";");
                String name = info[0];
                int postalCode = Integer.parseInt(info[1]);

                Ort ort = new Ort(name, postalCode);
                list.add(ort);
            }
            scanFile.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Antal funna orter: " + list.size());
        Collections.sort(list);
        for(Ort ort : list){
            System.out.println(ort.getPostalCode() + " " + ort.getTown());
        }

    }
}