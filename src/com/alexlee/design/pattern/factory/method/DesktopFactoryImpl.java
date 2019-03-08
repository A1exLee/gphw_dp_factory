package com.alexlee.design.pattern.factory.method;

public class DesktopFactoryImpl implements Factory {
    @Override
    public PC getPC() {
        return new Desktop();
    }
}
