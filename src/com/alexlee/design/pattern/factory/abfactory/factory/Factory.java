package com.alexlee.design.pattern.factory.abfactory.factory;

import com.alexlee.design.pattern.factory.abfactory.product.Desktop;
import com.alexlee.design.pattern.factory.abfactory.product.Laptop;

public abstract class Factory {
    public abstract Desktop getDesktop();
    public abstract Laptop getLaptop();
}
