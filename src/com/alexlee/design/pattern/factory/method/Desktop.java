package com.alexlee.design.pattern.factory.method;

public class Desktop implements PC {
    @Override
    public String getType() {
        return "desktop";
    }
}
