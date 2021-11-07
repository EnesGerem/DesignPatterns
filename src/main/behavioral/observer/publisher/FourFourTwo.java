package main.behavioral.observer.publisher;

public class FourFourTwo extends AbstractPublication {

	protected FourFourTwo(String name) {
		super(name);
	}

	public void publish(String date) {
		name = name + " - " + date;
		subscribers.forEach(s -> s.receive(this));
	}

	public void listSubscribers() {
        subscribers.forEach(System.out::println);
	}
    
}
