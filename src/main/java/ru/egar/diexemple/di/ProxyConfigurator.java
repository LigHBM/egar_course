package ru.egar.diexemple.di;

public interface ProxyConfigurator {
    <T> T  wrapWithPoxy(T t);
}
