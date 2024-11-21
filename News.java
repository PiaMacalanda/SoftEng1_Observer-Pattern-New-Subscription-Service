import java.util.ArrayList;
import java.util.List;

public class News implements NewsSubject{

    private String newsTitle;
    /* 
    private String newsArticle;
        */
    private List<Subscriber> subscriberList = new ArrayList<>();

    public String getNewsTitle(){
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle){
        this.newsTitle = newsTitle;
    }

    /* 
    public String getNewsArticle(){
        return newsArticle;
    } 

    public void setNewsArticle(String newsArticle){
        this.newsArticle = newsArticle;
    }
        */

    public List<Subscriber> getSubscriberList(){
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList){
        this.subscriberList = subscriberList;
    }

    @Override
    public void subscribed(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribed(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.updateNews(this);
        }
        return "All subscribers have been notified.\n";
    }    
}