package com.alexlee.design.pattern.factory.simple;

public class SimpleFactory {
    public PC getPC(String type) {
        PC pc;
        switch (type) {
            case "laptop":
                pc = new Laptop();
                break;
            case "desktop":
                pc = new Desktop();
                break;
            default:
                pc = null;
                break;
        }
        return pc;
    }
}
