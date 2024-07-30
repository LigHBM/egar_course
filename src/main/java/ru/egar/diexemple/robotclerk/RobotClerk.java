package ru.egar.diexemple.robotclerk;

import ru.egar.diexemple.di.annotation.InjectByType;
import ru.egar.diexemple.di.annotation.InjectRandomInt;

import javax.annotation.PostConstruct;

public class RobotClerk {
    @InjectByType
    private TaskReceiver taskReceiver;
    @InjectByType
    private TaskExecutor taskExecutor;
    @InjectByType
    private ReportSender reportSender;

    private String name;

    @InjectRandomInt(min = 1, max = 3)
    private int repeat = 1;

    public void doWork() {
        for (int i = 0; i < repeat; i++) {
            taskReceiver.getTasks()
                .map(task -> taskExecutor.execute(task))
                .forEach(result -> reportSender.sendReport(result));
        }
    }

    @PostConstruct
    public void init() {
        this.name = "Jack";
        System.out.println("Hello, my name is " + this.name);
    }
}
