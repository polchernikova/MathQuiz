package by.polchernikova.quizer.task.math_tasks;

import by.polchernikova.quizer.Result;

public abstract class AbstractMathTask implements MathTask {
    public String getText() {
        return null;
    }

    public Result validate(String answer) {
        return null;
    }
}
