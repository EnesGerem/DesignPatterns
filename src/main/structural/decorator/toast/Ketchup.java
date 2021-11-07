package main.structural.decorator.toast;

public class Ketchup extends Topping{

	public Ketchup(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
