package by.polchernikova.quizer;
import java.util.*;

public class MathQuiz {
    static Map<String, Quiz> getQuizMap() {
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Введите название теста...");
        Scanner reader = new Scanner(System.in);
        String test_name = reader.nextLine();
        Quiz test = getQuizMap().get(test_name);
    }
}
