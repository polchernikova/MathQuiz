package by.polchernikova.quizer.task_generators;

import by.polchernikova.quizer.Task;
import by.polchernikova.quizer.TaskGenerator;

public class EquationTaskGenerator implements TaskGenerator {
    EquationTaskGenerator (
            int minNumber,
            int maxNumber,
            boolean generateSum,
            boolean generateDifference,
            boolean generateMultiplication,
            boolean generateDivision
    ) {
        minNum = minNumber;
        maxNum = maxNumber;
    }

    public Task generate() {
        return null;
    }

    private final int minNum;
    private final int maxNum;
    private boolean generateSum;
    private boolean generateDifference;
    private boolean generateMultiplication;
    private boolean generateDivision;
}
