package ga222gb_lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* According to the instructions the whitespaces should be 728.
   I also read in the english slide that it could be 715.
   The result I got was the latter (715) so therefore I guess it's okay to skip the "explanation".

   Further I discovered that a txt- and dat-file generates different results in the category "others".
   I get the correct amount (111) with txt, and 112 with dat. I can't explain why this is the case.
 */
public class RaknaTecken {
    public static void main(String[] args) throws IOException{

        try{
            String text = readFile("C:\\Users\\guust\\Desktop\\history.txt");
            System.out.println(text);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /*
    Reading one line at a time. Looping through all characters in the line
    and check what it represents and add to the specific variable.
    After each line a "return" should be added to whitespaces.
    */
    private static String readFile(String path) throws IOException{
        int upperCases = 0;
        int lowerCases = 0;
        int digits = 0;
        int whitespaces = 0;
        int others = 0;

        File file = new File(path);
        Scanner fileScan = new Scanner(file);

        while (fileScan.hasNextLine()) {
            String str = fileScan.nextLine();
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(Character.isLetter(c)){
                    if(Character.isUpperCase(c)){
                        upperCases++;
                    }else{
                        lowerCases++;
                    }
                }else if(Character.isDigit(c)){
                    digits++;
                }else if(Character.isWhitespace(c)){
                    whitespaces++;
                }else{
                    others++;
                }
            }
            whitespaces++;
        }
        fileScan.close();

        String result = "Antal stora bokstäver: " + upperCases + "\n"
                + "Antal små bokstäver: " + lowerCases + "\n"
                + "Antal siffror: " + digits + "\n"
                + "Antal 'whitespaces': " + whitespaces + "\n"
                + "Antal övriga: " + others;

        return result;
    }

}
