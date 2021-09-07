package by.polchernikova.quizer.task.math_tasks;

import by.polchernikova.quizer.Result;

public abstract class AbstractMathTask implements MathTask {
    public String getText() {
        return "Кто лучше всего придумывает лабы?";
    }

    public Result validate(String answer) {
        if (answer == "Роман Демидович") {
            return Result.OK;
        } else {
            return Result.WRONG;
        }
    }
}
