package ga222gb_lab2;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StringBuilder b = new StringBuilder();
        boolean palindrom = false;

        System.out.print("Mata in en textrad: ");
        String text = sc.nextLine();
        sc.close();

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(Character.isLetter(c)){
                b.append(Character.toLowerCase(c));
            }
        }

        for(int j = 0; j < b.length(); j++){
            char c = b.charAt(j);
            char d = b.charAt(b.length() - (j + 1));
            if(c == d){
                palindrom = true;
                continue;
            }else{
                palindrom = false;
                break;
            }
        }

        if(palindrom){
            System.out.println("Palindrom!");
        }else{
            System.out.println("Inget palindrom!");
        }
    }
}
