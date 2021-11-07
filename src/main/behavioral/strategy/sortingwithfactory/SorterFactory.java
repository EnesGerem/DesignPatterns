package main.behavioral.strategy.sortingwithfactory;

public interface SorterFactory {

    Sorter createBubbleSorter();
    Sorter createQuickSorter();
    Sorter createJavaSorter();
    
}
