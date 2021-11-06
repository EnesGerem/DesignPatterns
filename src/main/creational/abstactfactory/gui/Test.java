package main.creational.abstactfactory.gui;

public class Test {
    public static void main(String[] args) {
        new Client(createOsSpecificFactory());
    }
 
    public static GUIFactory createOsSpecificFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

	private static int readFromConfigFile(String string) {
        return Math.random() > 0.5 ? 1 : 0;
	}
}

