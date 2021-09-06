package by.polchernikova.quizer.task_generators;

import by.polchernikova.quizer.Task;
import by.polchernikova.quizer.TaskGenerator;
import by.polchernikova.quizer.task.TextTask;
import java.util.*;
import java.lang.Math;

public class EquationTaskGenerator implements TaskGenerator {
    public EquationTaskGenerator (
            int minNumber,
            int maxNumber,
            boolean generateSum,
            boolean generateDifference,
            boolean generateMultiplication,
            boolean generateDivision
    ) {
        minNum = minNumber;
        maxNum = maxNumber;
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

    public Task generate() {
        String equation;
        int firstInt = (int)(Math.random() * ((maxNum - minNum) + 1) + minNum);
        int secondInt = (int)(Math.random() * ((maxNum - minNum) + 1) + minNum);
        String first = Integer.toString(firstInt);
        String second = Integer.toString(secondInt);
        int operIndex = (int)(Math.random() * operations.size());
        String ans = "";
        if (Objects.equals(operations.get(operIndex), "+")) {
            ans = Integer.toString(firstInt + secondInt);
        } else if (Objects.equals(operations.get(operIndex), "-")) {
            ans = Integer.toString(firstInt - secondInt);
        } else if (Objects.equals(operations.get(operIndex), "*")) {
            ans = Integer.toString(firstInt * secondInt);
        } else if (Objects.equals(operations.get(operIndex), "/")) {
            ans = Integer.toString(firstInt / secondInt);
        }
        return new TextTask(first + operations.get(operIndex) + second + "=?", ans);
    }

    private final int minNum;
    private final int maxNum;
    private final Vector<String> operations;
}
