package com.alexlee.design.pattern.factory.simple;

public class Consumer {
    public void buyComputer(PC c) {
        System.out.println("i bought a " + c.getType() + " computer");
    }

    public static void main(String[] args) {
        //new 实例
        new Consumer().buyComputer(new Laptop());
        //简单工厂
        new Consumer().buyComputer(new SimpleFactory().getPC("laptop"));

    }
}
