package by.polchernikova.quizer;
import by.polchernikova.quizer.task_generators.math_task_generators.*;

import java.util.*;

public class MathQuiz {
    static Map<String, Quiz> getQuizMap() {
        Map<String, Quiz> quizMap = new HashMap<String, Quiz>();
        EquationMathTaskGenerator gen0 = new RealEquationMathTaskGenerator(1, 5, true, true, true, true, 5);
        quizMap.put("0", new Quiz(gen0, 5));
        ExpressionMathTaskGenerator gen1 = new IntegerExpressionMathTaskGenerator(1, 5, true, false, false, true);
        quizMap.put("TEST NAME 1", new Quiz(gen1, 5));
        return quizMap;
    }
    public static void main(String[] args) throws Exception {
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
