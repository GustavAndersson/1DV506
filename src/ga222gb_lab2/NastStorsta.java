package ga222gb_lab2;

import java.util.Scanner;

public class NastStorsta {

    public static void main(String [] args){

        int nastStorstaTalet = 0, storstaTalet;
        int antalTal = 10, tal;

        Scanner sc = new Scanner(System.in);
        System.out.print("Mata in 10 heltal: ");
        storstaTalet = sc.nextInt();

        for(int i = 1; i < antalTal; i++){
            tal = sc.nextInt();
            if(tal > storstaTalet){
                nastStorstaTalet = storstaTalet;
                storstaTalet = tal;
            }else if(tal > nastStorstaTalet){
                nastStorstaTalet = tal;
            }
        }
        System.out.println("Det näst största talet är: " + nastStorstaTalet);
        sc.close();
    }
}
