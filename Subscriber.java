public class Subscriber implements SubscriberObserver {

    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubcriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNews(News news) {
        System.out.println("Hey, " + subscriberName + "! Breaking News: " + news.getNewsTitle());
    }
}
