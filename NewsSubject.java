public interface NewsSubject {

    public void subscribed(Subscriber Subscriber);
    public void unsubscribed(Subscriber Subcriber);
    public String notifySubscriber();
}