package main.structural.decorator.toast;

public class Cheese extends Topping{

	public Cheese(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
