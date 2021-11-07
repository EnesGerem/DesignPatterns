package main.structural.decorator.toast;

public class Sausage extends Topping{

	public Sausage(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
