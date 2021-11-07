package main.behavioral.observer.publisher;

import java.util.Date;

public class Publisher {
    private Publication newsweek;
    private Publication fourFourTwo;

    public Publisher() {
        newsweek = new Newsweek("Newsweek");
        fourFourTwo = new FourFourTwo("FourFourTwo");
    }

    public void publishNewsweek() {
        System.out.println("\nNew Newsweek On the Way");
        newsweek.publish(new Date().toString());
    }

    public void publishFourFourTwo() {
        System.out.println("\nNew FourFourTwo On the Way");
        fourFourTwo.publish(new Date().toString());
    }

    public Publication getNewsweek() {
        return newsweek;
    }

    public Publication getFourFourTwo() {
        return fourFourTwo;
    }
}
