package ga222gb_lab3;

public class Card {

    private Color color;
    private Value value;

    public Card(Color color, Value value){
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public enum Color{
        hearts,
        spades,
        diamonds,
        clubs
    }

    public enum Value{
        ace,
        two,
        three,
        four,
        five,
        six,
        seven,
        eight,
        nine,
        ten,
        jack,
        queen,
        king
    }
}
