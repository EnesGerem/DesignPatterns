package main.structural.adapter.electricity.domain.tr;

public class TurkishPowerProvider implements TurkishPowerSource {

    public TurkishPowerProvider() {
        System.out.println("TurkishPowerProvider is up and running.");
    }

    @Override
    public void providePowerAt220V() {
        System.out.println("Providing 220V, may occur some casual interruptions!");
    }

    @Override
    public void turnOn() {
        System.out.println("TurkishPowerProvider started to provide electricity.");        
    }

    @Override
    public void turnOff() {
        System.out.println("TurkishPowerProvider stopped to provide electricty.");        
    }
    
}
