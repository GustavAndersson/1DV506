package ga222gb_lab4.sorter_orter;

public class Ort implements Comparable<Ort>{

    private String town;
    private int postalCode;

    public Ort(String town, int postalCode) {
        this.town = town;
        this.postalCode = postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int compareTo(Ort ort){
        return Integer.compare(this.postalCode, ort.postalCode);
    }

}

