package ru.egar.diexemple.robotclerk.impl;

import ru.egar.diexemple.di.annotation.Benchmark;
import ru.egar.diexemple.robotclerk.ReportSender;

public class ReportSenderImpl implements ReportSender {
    @Benchmark
    @Override
    public void sendReport(String text) {
        System.out.printf("Task result: %s%n", text);
    }
}
