package ga222gb_lab4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) throws IOException{

        try{
            ArrayList<Integer> numberList = readFile("C:\\Users\\guust\\Desktop\\heltal.dat");
            System.out.println("Antal i intervallet [1,100]: " + getAmount(numberList));
            System.out.println("Övriga: " + (numberList.size() - getAmount(numberList)));
            System.out.println(getHistogram(numberList));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> readFile(String path) throws IOException{
        ArrayList<Integer> numbers = new ArrayList<>();
        File file = new File(path);
        Scanner scanFile = new Scanner(file);
        while(scanFile.hasNext()){
            int value = Integer.parseInt(scanFile.next());
            numbers.add(value);
        }
        scanFile.close();
        return numbers;
    }

    private static int getAmount(ArrayList<Integer> numberList) {
        int intervalAmount = 0;
        for (int i : numberList) {
            if (i >= 1 && i <= 100) {
                intervalAmount++;
            }
        }
        return intervalAmount;
    }

    private static StringBuilder getHistogram(ArrayList<Integer> numberList){
        int[] array = new int[10];
        for(int i : numberList){
            if(i >= 1 && i <= 10){
                array[0] = array[0] + 1;
            }else if(i >= 11 && i <= 20){
                array[1] = array[1] + 1;
            }else if(i >= 21 && i <= 30){
                array[2] = array[2] + 1;
            }else if(i >= 31 && i <= 40){
                array[3] = array[3] + 1;
            }else if(i >= 41 && i <= 50){
                array[4] = array[4] + 1;
            }else if(i >= 51 && i <= 60){
                array[5] = array[5] + 1;
            }else if(i >= 61 && i <= 70){
                array[6] = array[6] + 1;
            }else if(i >= 71 && i <= 80){
                array[7] = array[7] + 1;
            }else if(i >= 81 && i <= 90){
                array[8] = array[8] + 1;
            }else if(i >= 91 && i <= 100){
                array[9] = array[9] + 1;
            }
        }

        StringBuilder s = new StringBuilder();
        s.append("Histogram");
        int minValue = 1;
        int maxValue = 10;
        for(int i = 0; i < 10; i++){
            s.append("\n" + minValue + "-" + maxValue + "\t" + "| ");
            for(int j = 0; j < array[i]; j++){
                s.append("*");
            }
            minValue = minValue + 10;
            maxValue = maxValue + 10;
        }
        return s;
    }
}