package main.creational.abstactfactory.gui;

public class WinFactory implements GUIFactory {
    public Component createButton() {
        return new WinButton();
    }

	@Override
	public Component createList() {
		return new WinList();
	}

	@Override
	public Component createTable() {
		return new WinTable();
	}
}
