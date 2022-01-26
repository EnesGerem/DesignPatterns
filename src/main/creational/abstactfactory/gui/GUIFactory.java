package main.creational.abstactfactory.gui;

interface GUIFactory {
	
    Component createButton();

    Component createList();
    
    Component createTable();
}
