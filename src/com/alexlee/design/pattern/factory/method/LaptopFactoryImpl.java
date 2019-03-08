package com.alexlee.design.pattern.factory.method;

public class LaptopFactoryImpl implements Factory {
    @Override
    public PC getPC() {
        return new Laptop();
    }
}
