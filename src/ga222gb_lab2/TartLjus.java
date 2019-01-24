package ga222gb_lab2;

public class TartLjus {

    public static void main(String[] args){

        int ask = 0;
        int ljus = 0;
        int askarTotalt = 0;

        for(int i = 1; i <= 100; i++){
            if(ljus < i) {
                while (ljus < i){
                    ljus = ljus + 24;
                    ask++;
                }
                System.out.println("Before birthday " + i + ", buy " + ask + " box(es)");
                ljus = ljus - i;
            }else{
                ljus = ljus - i;
            }
            askarTotalt = askarTotalt + ask;
            ask = 0;
        }
        System.out.println("Total number of boxes: " + askarTotalt + ", Remaining candels: " + ljus);
    }
}
