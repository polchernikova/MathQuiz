package by.polchernikova.quizer;
import by.polchernikova.quizer.task_generators.EquationTaskGenerator;
import by.polchernikova.quizer.task_generators.ExpressionTaskGenerator;

import java.util.*;

public class MathQuiz {
    static Map<String, Quiz> getQuizMap() {
        Map<String, Quiz> quizMap = new HashMap<String, Quiz>();
        EquationTaskGenerator gen0 = new EquationTaskGenerator(1, 5, true, true, true, true);
        quizMap.put("TEST NAME 0", new Quiz(gen0, 5));
        ExpressionTaskGenerator gen1 = new ExpressionTaskGenerator(1, 5, true, false, false, true);
        quizMap.put("TEST NAME 1", new Quiz(gen1, 5));
        return quizMap;
    }
    public static void main(String[] args) {
        System.out.println("Введите название теста...");
        Scanner reader = new Scanner(System.in);
        String test_name = reader.nextLine();
        Quiz test = getQuizMap().get(test_name);
        while(!test.isFinished()) {
            System.out.println(test.nextTask().getText());
            String answer = reader.nextLine();
            test.provideAnswer(answer);
        }
        System.out.println(test.getMark());
    }
}
