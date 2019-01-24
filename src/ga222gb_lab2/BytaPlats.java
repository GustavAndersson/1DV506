package ga222gb_lab2;

public class BytaPlats {

    public static void main(String[] args) {
        char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a',
                't', 't', 'e', 'D' };

        System.out.println(text);

        for(int i = 0; i < 7; i++){
            char tecken = text[i];
            text[i] = text[text.length - (i+1)];
            text[text.length - (i+1)] = tecken;
        }

        System.out.println(text);
    }
}
