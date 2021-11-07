package main.structural.decorator.toast;

import java.util.ArrayList;
import java.util.List;

public class ToastBread implements Toastable {
	private String name;
	protected int price;
	
	public ToastBread(String name, int price) {
		this.name = name;
		this.price = price;
	}

    @Override
    public String getName() {
        return name;
    }

	@Override
	public int calculatePrice() {
		return price;
	}

	@Override
	public List<Topping> getToppings() {
		return new ArrayList<Topping>();
	}
}
