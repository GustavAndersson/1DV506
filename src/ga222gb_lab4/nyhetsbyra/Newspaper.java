package ga222gb_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Newspaper {

    private String name;                                //Name of the newspaper
    private ArrayList<String> news = new ArrayList<>(); //All news within the newspaper

    public Newspaper(String name) {                     //Constructor to create a new paper
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getNews() {
        return news;
    }

    public void addPieceOfNews(String pieceOfNews){ //Add piece of news to the paper
        news.add(pieceOfNews);
    }
}
