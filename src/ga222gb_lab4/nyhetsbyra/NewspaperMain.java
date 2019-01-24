package ga222gb_lab4.nyhetsbyra;

public class NewspaperMain {

    public static void main(String[] args){

        NewsAgency reuters = new NewsAgency("Reuters");     //Create a new news agency

        Newspaper telegraph = new Newspaper("Telegraph");   //Create some newspapers
        Newspaper independent = new Newspaper("Independent");
        Newspaper bbc = new Newspaper("BBC");

        telegraph.addPieceOfNews("Nyhet 1");                     //Give the papers some news
        independent.addPieceOfNews("Nyhet 2");
        bbc.addPieceOfNews("Nyhet 3");
        bbc.addPieceOfNews("Nyhet 4");

        reuters.registerPaper(telegraph);                     //Register all the papers to the agency
        reuters.registerPaper(independent);
        reuters.registerPaper(bbc);

        reuters.distributeNews();                               //Distribute the news to each newspaper

        independent.addPieceOfNews("Nyhet 5");                  //Add a new piece of news

        reuters.distributeNews();                               //Distribute again

        for(int j = 0; j < telegraph.getNews().size(); j++){    //Loop through all the news from Telegraph
            System.out.println(telegraph.getName() + ": " + telegraph.getNews().get(j));
        }

        for(int k = 0; k < independent.getNews().size(); k++){  //Loop through all the news from Independent
            System.out.println(independent.getName() + ": " + independent.getNews().get(k));
        }

    }
}
