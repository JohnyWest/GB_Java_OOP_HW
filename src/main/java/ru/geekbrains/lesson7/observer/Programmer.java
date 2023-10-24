package ru.geekbrains.lesson7.observer;

import ru.geekbrains.lesson7.factory.Worker;

public class Programmer extends Worker{
    private static final int GRADE = 1;

    public Programmer(String name) {
        super(name, GRADE);
        minSalary = random.nextDouble(120000)
    }
}