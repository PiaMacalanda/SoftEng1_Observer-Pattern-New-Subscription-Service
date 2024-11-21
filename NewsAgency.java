public class NewsAgency {

    public static void main(String[] args) {

        Subscriber pia = new Subscriber();
        pia.setSubcriberName("Pia");

        Subscriber katleya = new Subscriber();
        katleya.setSubcriberName("Katleya");

        Subscriber macalanda = new Subscriber();
        macalanda.setSubcriberName("Macalanda");

        News news = new News();
        news.setNewsTitle("Super Typhoon Storms the Bicol Region.");

        // subscribers
        news.subscribed(pia);
        news.subscribed(katleya);
        news.subscribed(macalanda);

        // notify subscribers
        System.out.println("Updates!");
        System.out.println(news.notifySubscriber());

        news.unsubscribed(pia); // modify subscription

        Subscriber josh = new Subscriber();
        josh.setSubcriberName("Josh");
        news.subscribed(josh);

        // notify subscriber again
        news.setNewsTitle("QC Declares Class Suspension.");
        System.out.println("Recently updates!");
        System.out.println(news.notifySubscriber());

    }
}