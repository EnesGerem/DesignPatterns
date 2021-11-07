package main.behavioral.strategy.sortingwithfactory;

public class SortingContext {
	private SorterFactory sorterFactory = new SorterFactoryImpl();
	
	private Sorter bubbleSorter = sorterFactory.createBubbleSorter();
	private Sorter quickSorter = sorterFactory.createQuickSorter();
	private Sorter javaSorter = sorterFactory.createJavaSorter();

	public void sortDouble(double[] list) {
		int size = list.length;
		
		if(size < 100){
			bubbleSorter.sort(list);
		}
		else if(size < 1_000_000){
			quickSorter.sort(list);
		}
		else{
			javaSorter.sort(list);
		}
	}
}