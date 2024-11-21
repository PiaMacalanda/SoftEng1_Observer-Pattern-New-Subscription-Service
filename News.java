import java.util.List;

public class News implements NewsSubject{

    private String newsTitle;
    private String newsArticle;
    private List<Subscriber> subscriberList;

    public String getNewsTitle(){
        return newsTitle;
    }

    public void setNewTitle(String newsTitle){
        this.newsTitle = newsTitle;
    }

    public String getNewsArticle(){
        return newsArticle;
    }

    public void setNewsArticle(String newsArticle){
        this.newsArticle = newsArticle;
    }

    public List<Subscriber> getSubscriberList(){
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList){
        this.subscriberList = subscriberList;
    }

    @Override
    public String notifySubscriber(){
        String output = new String();
        for(Subscriber subscriber : subscriberList){
            output += "Hey, " + subscriber.getSubscriberName() + "!\n";
            output += newsTitle; 
        }
        return output;
    }

    public void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    @Override
    public void subscribed(Subscriber Subscriber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subscribed'");
    }

    @Override
    public void unsubscribed(Subscriber Subcriber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unsubscribed'");
    }    
}