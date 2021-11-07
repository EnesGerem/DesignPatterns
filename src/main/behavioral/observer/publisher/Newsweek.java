package main.behavioral.observer.publisher;

public class Newsweek extends AbstractPublication {

    public Newsweek(String name) {
        super(name);
    }
    
    @Override
    public void publish(String date) {
        name = name + " - " + date;
        subscribers.forEach(s -> s.receive(this));
    }
    
}
