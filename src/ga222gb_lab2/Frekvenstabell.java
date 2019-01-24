package ga222gb_lab2;

import java.util.Random;

public class Frekvenstabell {

    public static void main(String[] args){

        Random rand = new Random();
        int siffra;
        int[] data = new int[6];

        for(int i = 0; i < 6000; i++){
            siffra = rand.nextInt(6) + 1;

            if(siffra == 1){
                data[0] = data[0] + 1;
            }else if(siffra == 2){
                data[1] = data[1] + 1;
            }else if(siffra == 3){
                data[2] = data[2] + 1;
            }else if(siffra == 4){
                data[3] = data[3] + 1;
            }else if(siffra == 5){
                data[4] = data[4] + 1;
            }else{
                data[5] = data[5] + 1;
            }
        }

        System.out.println("Frequencies when rolling a dice 6000 times."
                + "\n" + "1: " + data[0]
                + "\n" + "2: " + data[1]
                + "\n" + "3: " + data[2]
                + "\n" + "4: " + data[3]
                + "\n" + "5: " + data[4]
                + "\n" + "6: " + data[5]);
    }
}
