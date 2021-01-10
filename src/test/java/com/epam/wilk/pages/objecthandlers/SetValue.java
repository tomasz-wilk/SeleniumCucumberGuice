package com.epam.wilk.pages.objecthandlers;

@FunctionalInterface
public interface SetValue<T> {
    void set(T value);
}
