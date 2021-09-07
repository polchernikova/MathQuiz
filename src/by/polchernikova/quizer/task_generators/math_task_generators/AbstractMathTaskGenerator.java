package by.polchernikova.quizer.task_generators.math_task_generators;

import by.polchernikova.quizer.TaskGenerator;
import by.polchernikova.quizer.task.math_tasks.AbstractMathTask;

import java.util.Vector;

public abstract class AbstractMathTaskGenerator implements TaskGenerator {
    public AbstractMathTaskGenerator(
            boolean generateSum,
            boolean generateDifference,
            boolean generateMultiplication,
            boolean generateDivision
    ) {
        operations = new Vector<String>();
        if(generateSum) {
            operations.add("+");
        }
        if(generateDifference) {
            operations.add("-");
        }
        if(generateMultiplication) {
            operations.add("*");
        }
        if(generateDivision) {
            operations.add("/");
        }
    }
    protected Vector<String> operations;
}
