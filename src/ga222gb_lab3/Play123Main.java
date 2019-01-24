package ga222gb_lab3;

import java.text.DecimalFormat;

public class Play123Main {

    public static void main(String[] args){

        double successfulRounds = 0;
        double probability;

        for(int i = 0; i < 10000; i++){
            Deck d = new Deck();
            d.shuffle();
            if(d.play123()){
                successfulRounds++;
            }
        }

        probability = (successfulRounds / 10000) * 100;
        DecimalFormat dFormat = new DecimalFormat("#0.00");
        System.out.println("The probability is " + dFormat.format(probability) + "%");
    }
}
