package ga222gb_lab3;

public class MultiDisplay {

    private String displayMessage;
    private Integer displayCount;

    public void display(){
        for(int i = 0; i < getDisplayCount(); i++){
            System.out.println(getDisplayMessage());
        }
    }

    public void display(String displayMessage, Integer displayCount){
        setDisplayMessage(displayMessage);
        setDisplayCount(displayCount);
        for(int i = 0; i < getDisplayCount(); i++){
            System.out.println(getDisplayMessage());
        }
    }

    public MultiDisplay(){
        displayMessage = "";
        displayCount = 0;
    }

    public MultiDisplay(String displayMessage, Integer displayCount) {
        setDisplayMessage(displayMessage);
        setDisplayCount(displayCount);
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    public Integer getDisplayCount() {
        return displayCount;
    }

    public void setDisplayCount(Integer displayCount) {
        if(displayCount > 0) {
            this.displayCount = displayCount;
        }else{
            System.out.println("Displaycount must be positive");
        }
    }
}
