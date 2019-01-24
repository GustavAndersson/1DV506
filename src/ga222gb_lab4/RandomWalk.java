package ga222gb_lab4;

import java.util.Random;

public class RandomWalk {
    private int x = 0;
    private int y = 0;
    private int max;
    private int numberOfSteps;
    private int size;

    public RandomWalk(int max, int size){
        this.max = max;
        this.size = size;
    }

    public String toString(){
        String info = "Number of steps: " + numberOfSteps + "\n" + "Current position: (" + x + "," + y + ")";
        return info;
    }

    public void takeStep(){
        if(moreSteps()) {
            Random r = new Random();
            int n = r.nextInt(4) + 1;
            if (n == 1) {
                x += 1;
            } else if (n == 2) {
                x -= 1;
            } else if (n == 3) {
                y += 1;
            } else {
                y -= 1;
            }
            numberOfSteps++;
        }
    }

    public boolean moreSteps(){
        if(numberOfSteps < max){
            return true;
        }
        return false;
    }

    public boolean inBounds(){
        int xAbs = Math.abs(x);
        int yAbs = Math.abs(y);

        if(xAbs > size || yAbs > size){
            return false;
        }
        return true;
    }

    public void walk(){
        for(int i = 0; i < max; i++){
            if(inBounds()){
                takeStep();
            }else{
                break;
            }
        }
    }
}
