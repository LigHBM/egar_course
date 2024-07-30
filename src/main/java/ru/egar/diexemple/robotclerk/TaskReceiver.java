package ru.egar.diexemple.robotclerk;

import java.util.stream.Stream;

public interface TaskReceiver {
    Stream<Task> getTasks();
}
