package main.structural.decorator.toast;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.makeAyvalikToast1();
		test.makeAyvalikToast2();
	}
	
	public void makeAyvalikToast1(){
		Toastable ayvalikToast = new ToastBread("Toast bread", 5);
		System.out.println("Cost: " + ayvalikToast.calculatePrice());
		printToppings(ayvalikToast);
		ayvalikToast = new Cheese(ayvalikToast, "Cheddar cheese", 3);
		System.out.println("Cost: " + ayvalikToast.calculatePrice());
		printToppings(ayvalikToast);
		ayvalikToast = new Sausage(ayvalikToast, "Sausage", 3);
		System.out.println("Cost: " + ayvalikToast.calculatePrice());
		printToppings(ayvalikToast);
		ayvalikToast = new Tomato(ayvalikToast, "Tomato", 2);
		System.out.println("Cost: " + ayvalikToast.calculatePrice());
		printToppings(ayvalikToast);
		ayvalikToast = new Ketchup(ayvalikToast, "Ketchup", 1);
		System.out.println("Cost: " + ayvalikToast.calculatePrice());
		printToppings(ayvalikToast);
		ayvalikToast = new Salad(ayvalikToast, "Russian salad", 2);
		System.out.println("Cost: " + ayvalikToast.calculatePrice());
		printToppings(ayvalikToast);
	}
	
	public void makeAyvalikToast2(){
		Toastable ayvalikToast = new ToastBread("Toast bread", 5);
		ayvalikToast = new Cheese(ayvalikToast, "Cheddar cheese", 3);
		ayvalikToast = new Sausage(ayvalikToast, "Sucuk", 3);
		ayvalikToast = new Tomato(ayvalikToast, "Tomato", 2);
		ayvalikToast = new Ketchup(ayvalikToast, "Ketchup", 1);
		ayvalikToast = new Salad(ayvalikToast, "Russian salad", 2);
		System.out.println("\nCost: " + ayvalikToast.calculatePrice());
		
		printToppings(ayvalikToast);
	}

	private void printToppings(Toastable tost) {
		tost.getToppings().forEach(System.out::println);
	}
}
