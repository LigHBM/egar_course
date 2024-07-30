package ru.egar.diexemple;

import ru.egar.diexemple.di.ObjectFactory;
import ru.egar.diexemple.robotclerk.RobotClerk;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        RobotClerk robot =
                new ObjectFactory().createObject(RobotClerk.class);

        robot.doWork();
    }
}
