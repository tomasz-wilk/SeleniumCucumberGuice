package com.epam.wilk.pages.objecthandlers;

import java.util.function.Supplier;

@FunctionalInterface
public interface ElementSupplier<T> extends Supplier<T> {
    T get();
}
