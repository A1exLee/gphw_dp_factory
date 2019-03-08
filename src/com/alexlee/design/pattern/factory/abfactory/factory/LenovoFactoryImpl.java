package com.alexlee.design.pattern.factory.abfactory.factory;

import com.alexlee.design.pattern.factory.abfactory.product.Desktop;
import com.alexlee.design.pattern.factory.abfactory.product.Laptop;
import com.alexlee.design.pattern.factory.abfactory.product.LenovoDesktopImpl;
import com.alexlee.design.pattern.factory.abfactory.product.LenovoLaptopImpl;

public class LenovoFactoryImpl extends Factory {
    @Override
    public Desktop getDesktop() {
        return new LenovoDesktopImpl();
    }

    @Override
    public Laptop getLaptop() {
        return new LenovoLaptopImpl();
    }
}
