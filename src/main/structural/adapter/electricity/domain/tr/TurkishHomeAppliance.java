package main.structural.adapter.electricity.domain.tr;

public class TurkishHomeAppliance extends HomeAppliance {

    protected String name;

    public TurkishHomeAppliance(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("TurkishHomeAppliance " + name + " is starting!");
        powerSource.turnOn();
    }

    @Override
    public void stop() {
        System.out.println("TurkishHomeAppliance " + name + " is stopping!");
        powerSource.turnOff();
    }   
}
