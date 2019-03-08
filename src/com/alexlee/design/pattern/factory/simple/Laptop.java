package com.alexlee.design.pattern.factory.simple;

public class Laptop implements PC {
    @Override
    public String getType() {
        return "laptop";
    }
}
