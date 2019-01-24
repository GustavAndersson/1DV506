package ga222gb_lab3;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public boolean isNegative(){
        if(numerator < 0 && denominator > 0 || numerator > 0 && denominator < 0){
            return true;
        }
        return false;
    }

    public String toString(){
        String fraction = "Fraction: " + numerator + "/" + denominator;
        return fraction;
    }

    public Fraction add(Fraction f){
        int newNumerator = (numerator * f.denominator) + (f.numerator * denominator);
        int newDenominator = denominator * f.denominator;
        Fraction newF = new Fraction(newNumerator, newDenominator);
        return newF;
    }

    public Fraction subtract(Fraction f){
        int newNumerator = (numerator * f.denominator) - (f.numerator * denominator);
        int newDenominator = denominator * f.denominator;
        Fraction newF = new Fraction(newNumerator, newDenominator);
        return newF;
    }

    public Fraction multiply(Fraction f){
        int newNumerator = numerator * f.numerator;
        int newDenominator = denominator * f.denominator;
        Fraction newF = new Fraction(newNumerator, newDenominator);
        return newF;
    }

    public Fraction divide(Fraction f){
        int newNumerator = numerator * f.denominator;
        int newDenominator = denominator * f.numerator;
        Fraction newF = new Fraction(newNumerator, newDenominator);
        return newF;
    }

    public boolean isEqualTo(Fraction f){
        if(numerator/denominator == f.numerator/f.denominator){
            return true;
        }
        return false;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator != 0) {
            this.denominator = denominator;
        }else{
            System.out.println("Denominator can't be zero ==> Undefined");
        }
    }
}
