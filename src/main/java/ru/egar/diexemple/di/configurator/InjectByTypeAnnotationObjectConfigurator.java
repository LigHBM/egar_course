package ru.egar.diexemple.di.configurator;

import lombok.RequiredArgsConstructor;
import ru.egar.diexemple.di.ObjectConfigurator;
import ru.egar.diexemple.di.ObjectFactory;
import ru.egar.diexemple.di.annotation.InjectByType;

import java.lang.reflect.Field;

@RequiredArgsConstructor
public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    private final ObjectFactory factory;

    @Override
    public void configure(Object t) throws ReflectiveOperationException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                field.set(t, factory.createObject(field.getType()));
            }
        }
    }
}
