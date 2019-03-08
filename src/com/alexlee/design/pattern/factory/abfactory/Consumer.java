package com.alexlee.design.pattern.factory.abfactory;

import com.alexlee.design.pattern.factory.abfactory.factory.AppleFactoryImpl;
import com.alexlee.design.pattern.factory.abfactory.factory.Factory;
import com.alexlee.design.pattern.factory.abfactory.factory.LenovoFactoryImpl;
import com.alexlee.design.pattern.factory.abfactory.product.Desktop;
import com.alexlee.design.pattern.factory.abfactory.product.Laptop;

public class Consumer {
    public static void main(String[] args) {
        Factory factory = new LenovoFactoryImpl();
        Desktop lenovoDesktop = factory.getDesktop();
        Laptop lenovoLaptop = factory.getLaptop();
        Factory factory2 = new AppleFactoryImpl();
        Desktop lenovoDesktop2 = factory2.getDesktop();
        Laptop lenovoLaptop2 = factory2.getLaptop();
    }
}
