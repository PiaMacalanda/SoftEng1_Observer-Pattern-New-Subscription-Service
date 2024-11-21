import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    public static void main(String[] args) {

        Subscriber pia = new Subscriber();
        pia.setSubcriberName("Pia");

        Subscriber katleya = new Subscriber();
        katleya.setSubcriberName("Katleya");

        Subscriber macalanda = new Subscriber();
        macalanda.setSubcriberName("Macalanda");

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(pia);
        subscriberList.add(katleya);
        subscriberList.add(macalanda);

        News news = new News();
        news.setName("Super Typhoon Storms the Bicol Region.");
        news.setSubscriberList(subscriberList);

        System.out.println("Updates!");
        System.out.println(news.notifySubscriber());

        news.unsubscribed(pia);

        Subscriber josh = new Subscriber();
        josh.setSubcriberName("Josh");
        news.subscribed(josh);

        System.out.println("Updates recently!");
        System.out.println(news.notifySubscriber());

    }
}