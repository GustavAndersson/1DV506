package ga222gb_lab4.nyhetsbyra;

import java.util.ArrayList;

public class NewsAgency {

    private String name;                                                    //Name of the agency
    private int numberOfNews = 0;                                           //Amount of news within the agency
    private ArrayList<Newspaper> papers = new ArrayList<>();                //Array to store all the registered papers
    private ArrayList<Newspaper> publisher = new ArrayList<>();             //Array to store the "main-publisher" of the piece of news
    private ArrayList<String> latestNews = new ArrayList<>();               //Array to store all the latest news

    public NewsAgency(String name) {                                        //Constructor to create a new agency
        this.name = name;
    }

    public ArrayList<Newspaper> getPapers() {
        return papers;
    }

    public void registerPaper(Newspaper paper){                           //Method to register a new paper
        boolean duplicate = false;
        for(Newspaper p : papers){
            if(paper.getName() == p.getName()){                             //Check if the given paper already exists within the agency
                duplicate = true;
                System.out.println("This paper (" + paper.getName() + ")" + " is already registrated.");
            }else{
                duplicate = false;
            }
        }

        if(duplicate == false){
            papers.add(paper);
        }
    }

    /*
        This method are investigating each paper to see if any
        news has been added lately. All the latest news will be added to the array
        latestNews. Then all the latest news will be distributed to all the other papers.
     */
    public void distributeNews(){
        for(int i = 0; i < papers.size(); i++){
            for(int j = numberOfNews; j < papers.get(i).getNews().size(); j++){
                publisher.add(papers.get(i));
                latestNews.add(papers.get(i).getNews().get(j));
            }
        }
        for(int k = 0; k < papers.size(); k++){
            for(int h = numberOfNews; h < latestNews.size(); h++){
                if(publisher.get(h) == (papers.get(k))){
                    continue;
                }else{
                    papers.get(k).addPieceOfNews(latestNews.get(h));
                }
            }
        }
        numberOfNews = latestNews.size();
    }
}
