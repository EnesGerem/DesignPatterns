package main.creational.abstactfactory.gui;

public class Client {
    public Client(GUIFactory factory){
        Component button = factory.createButton();
        button.paint();
        
        Component list = factory.createList();
        list.paint();
        
        Component table = factory.createTable();
        table.paint();
    }
}

