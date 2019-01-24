package ga222gb_lab3;

import java.lang.Math;

public class Point {

    private int x;
    private int y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        String settings = "(" + x + "," + y + ")";
        return settings;
    }

    public boolean isEqualTo(Point p){
        if(p.x == x && p.y == y){
            return true;
        }
        return false;
    }

    public double distanceTo(Point p){
        double distance = Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
        return distance;
    }

    public void move(int xSteps, int ySteps){
        x = x + xSteps;
        y = y + ySteps;
    }

    public void moveToXY(int xCoordinate, int yCoordinate){
        x = xCoordinate;
        y = yCoordinate;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
