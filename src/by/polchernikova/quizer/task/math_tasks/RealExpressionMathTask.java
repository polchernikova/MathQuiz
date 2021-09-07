package by.polchernikova.quizer.task.math_tasks;

import by.polchernikova.quizer.Result;

import java.util.Objects;

public class RealExpressionMathTask extends ExpressionMathTask implements RealMathTask {
    public RealExpressionMathTask(int firstArgument, int secondArgument, String oper) {
        firstArg = firstArgument;
        secondArg = secondArgument;
        operation = oper;
    }
    public String getText() {
        return Double.toString(firstArg) + operation + "x=" + Double.toString(secondArg);
    }
    public String getAnswer() {
        return Double.toString(calculateAnswer());
    }
    public double calculateAnswer() {
        double ans;
        if (Objects.equals(operation, "+")) {
            ans = (secondArg - firstArg);
        } else if (Objects.equals(operation, "-")) {
            ans = (firstArg - secondArg);
        } else if (Objects.equals(operation, "*")) {
            ans = (secondArg / firstArg);
        } else if (Objects.equals(operation, "/")) {
            ans = (firstArg/secondArg);
        } else {
            throw new NumberFormatException();
        }
        return ans;
    }

    public Result validate(String answer) {
        try {
            Double.parseDouble(answer);
        } catch (NumberFormatException nfe) {
            return Result.INCORRECT_INPUT;
        }
        String ans = getAnswer();
        if(answer.equals(ans)) {
            return Result.OK;
        } else {
            return Result.WRONG;
        }
    }
    private String operation;
    private double firstArg;
    private double secondArg;
}
