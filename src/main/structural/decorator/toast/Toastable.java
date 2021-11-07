package main.structural.decorator.toast;

import java.util.List;

public interface Toastable {
    
    int calculatePrice();
    List<Topping> getToppings();
    String getName();
    
}