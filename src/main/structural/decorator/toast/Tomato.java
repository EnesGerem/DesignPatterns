package main.structural.decorator.toast;

public class Tomato extends Topping{

	public Tomato(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
