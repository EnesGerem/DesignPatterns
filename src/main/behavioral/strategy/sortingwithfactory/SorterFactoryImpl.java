package main.behavioral.strategy.sortingwithfactory;

public class SorterFactoryImpl implements SorterFactory{

    @Override
    public Sorter createBubbleSorter() {
        return new BubbleSorter();
    }

    @Override
    public Sorter createQuickSorter() {
        return new QuickSorter();
    }

    @Override
    public Sorter createJavaSorter() {
        return new JavaSorter();
    }
    
}
