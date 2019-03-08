package com.alexlee.design.pattern.factory.abfactory.factory;

import com.alexlee.design.pattern.factory.abfactory.product.AppleDesktopImpl;
import com.alexlee.design.pattern.factory.abfactory.product.AppleLaptopImpl;
import com.alexlee.design.pattern.factory.abfactory.product.Desktop;
import com.alexlee.design.pattern.factory.abfactory.product.Laptop;

public class AppleFactoryImpl extends Factory {
    @Override
    public Desktop getDesktop() {
        return new AppleDesktopImpl();
    }

    @Override
    public Laptop getLaptop() {
        return new AppleLaptopImpl();
    }
}
