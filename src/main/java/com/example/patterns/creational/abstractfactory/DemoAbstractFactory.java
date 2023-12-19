package com.example.patterns.creational.abstractfactory;

import com.example.patterns.creational.abstractfactory.factory.GUIFactory;
import com.example.patterns.creational.abstractfactory.factory.MacOsFactory;
import com.example.patterns.creational.abstractfactory.factory.WindowFactory;

/**
 * @author tuan.nguyen3
 */
public class DemoAbstractFactory {
    private static Application configureApplication(String osName) {
        Application app;
        GUIFactory factory;
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication("mac");
//        GUIFactory factory = GUIFactory.;

        app.paint();
    }
}
