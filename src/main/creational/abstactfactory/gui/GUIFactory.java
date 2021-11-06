package main.creational.abstactfactory.gui;

interface GUIFactory {
	
    public Component createButton();
    
    public Component createList();
    
    public Component createTable();
}
