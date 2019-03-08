package com.alexlee.design.pattern.factory.method;


public class Consumer {
    public void buyComputer(PC c) {
        System.out.println("i bought a " + c.getType() + " computer");
    }

    public static void main(String[] args) {
        Factory factory = new LaptopFactoryImpl();
        new Consumer().buyComputer(factory.getPC());
        Factory factory2 = new DesktopFactoryImpl();
        new Consumer().buyComputer(factory2.getPC());
    }
}
