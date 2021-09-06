package by.polchernikova.quizer;

public class Quiz {
    Quiz(TaskGenerator generator, int taskCount) {
        tasksRemain = taskCount;
        gen = generator;
    }
    Task nextTask() {
        tasksRemain--;
        currentTask = gen.generate();
        return currentTask;
    }
    Result provideAnswer(String answer) {
        Result res = currentTask.validate(answer);
        if(res == Result.OK) {
            correctAnswers++;
        } else if(res == Result.WRONG) {
            wrongAnswers++;
        } else if(res == Result.INCORRECT_INPUT ){
            incorrectInputAnswers++;
        }
        return res;
    }
    boolean isFinished() {
        return tasksRemain == 0;
    }
    int getCorrectAnswerNumber() {
        return correctAnswers;
    }
    int getWrongAnswerNumber() {
        return wrongAnswers;
    }
    int getIncorrectInputNumber() {
        return incorrectInputAnswers;
    }
    double getMark() {
        return (double) (correctAnswers) /  (double) (correctAnswers + incorrectInputAnswers + wrongAnswers);
    }
    private TaskGenerator gen;
    private Task currentTask = null;
    private int tasksRemain;
    private int wrongAnswers = 0;
    private int correctAnswers = 0;
    private int incorrectInputAnswers = 0;
}

