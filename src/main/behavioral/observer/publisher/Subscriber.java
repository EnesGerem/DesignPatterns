package main.behavioral.observer.publisher;

public interface Subscriber {

    String getName();
    void receive(Publication publication);
    
}
