package com.alexlee.design.pattern.factory.method;

public class Laptop implements PC {
    @Override
    public String getType() {
        return "laptop";
    }
}
