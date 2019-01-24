package ga222gb_lab3;

public class FractionMain {

    public static void main(String[] args){

        Fraction f = new Fraction(1, 2); //Creates fraction 1/2
        Fraction f1 = new Fraction(7, 5); //Creates fraction 7/5
        Fraction f2 = f.add(f1); // 1/2 + 7/5 in f2 ==> 19/10
        Fraction f3 = f.multiply(f2); // 1/2 * 19/10 ==> 19/20
        Fraction f4 = f.divide(f3); // 1/2 / 19/20 ==> 20/38
        Fraction f5 = f.subtract(f4); // 1/2 - 20/38 ==> -2/76

        System.out.println(f5.isNegative()); // -2/76 is negative ==> true
        System.out.println(f5.getNumerator()); // Returns -2
        System.out.println(f5.getDenominator()); // Returns 76
        System.out.println(f5.toString()); //Returns -2/76

        Fraction f6 = new Fraction(4, 2); //Creates fraction 4/2
        Fraction f7 = new Fraction(8, 4); //Creates fraction 8/4
        System.out.println(f6.isEqualTo(f7)); //Check if 4/2 is equal to 8/4 ==> true
    }
}
