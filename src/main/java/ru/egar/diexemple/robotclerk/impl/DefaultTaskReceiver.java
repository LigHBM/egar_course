package ru.egar.diexemple.robotclerk.impl;

import ru.egar.diexemple.di.annotation.Benchmark;
import ru.egar.diexemple.robotclerk.TaskReceiver;
import ru.egar.diexemple.robotclerk.Task;

import java.util.stream.Stream;

public class DefaultTaskReceiver implements TaskReceiver {
    @Override
    @Benchmark
    public Stream<Task> getTasks() {
        return Stream.of(
            new Task("Print docs", "Print 10 pages of document"),
            new Task("Calculate expenses", "Calculate monthly expenses"));
    }
}
