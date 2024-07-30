package ru.egar.diexemple.di;

public interface ObjectConfigurator {
    void configure(Object t) throws ReflectiveOperationException;
}
