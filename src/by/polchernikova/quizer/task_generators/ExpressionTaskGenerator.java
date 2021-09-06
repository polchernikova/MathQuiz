package by.polchernikova.quizer.task_generators;

import by.polchernikova.quizer.Task;
import by.polchernikova.quizer.TaskGenerator;
import by.polchernikova.quizer.task.TextTask;

import java.util.Objects;
import java.util.Vector;

public class ExpressionTaskGenerator implements TaskGenerator {
    public ExpressionTaskGenerator(
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
        int operIndex = (int)(Math.random() * operations.size());
        String ans = "";
        if (Objects.equals(operations.get(operIndex), "+")) {
            ans = Integer.toString(secondInt - firstInt);
        } else if (Objects.equals(operations.get(operIndex), "-")) {
            ans = Integer.toString(firstInt - secondInt);
        } else if (Objects.equals(operations.get(operIndex), "*")) {
            secondInt -= (secondInt % firstInt);
            ans = Integer.toString(secondInt / firstInt);
        } else if (Objects.equals(operations.get(operIndex), "/")) {
            firstInt -= (firstInt % secondInt);
            ans = Integer.toString(firstInt / secondInt);
        }
        String first = Integer.toString(firstInt);
        String second = Integer.toString(secondInt);
        return new TextTask(first + operations.get(operIndex) + "x=" + second, ans);
    }

    private final int minNum;
    private final int maxNum;
    private final Vector<String> operations;
}
