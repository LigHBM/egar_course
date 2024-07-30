package ru.egar.diexemple.robotclerk.impl;

import ru.egar.diexemple.robotclerk.Task;
import ru.egar.diexemple.robotclerk.TaskExecutor;

public class TaskExecutorImpl implements TaskExecutor {
    @Override
    public String execute(Task task) {
        System.out.printf("Get task: %s, details: %s%n", task.getText(), task.getComment());

        // Some logic

        return String.format("Success execute task \"%s\"", task.getText());
    }
}
