package com.alexlee.design.pattern.factory.simple;

public class Desktop implements PC {
    @Override
    public String getType() {
        return "desktop";
    }
}
