package by.polchernikova.quizer.task_generators;

import by.polchernikova.quizer.Task;
import by.polchernikova.quizer.TaskGenerator;
import java.util.*;

public class PoolTaskGenerator implements TaskGenerator {
    PoolTaskGenerator(
            boolean allowDuplicate,
            Task... tasks
    ) {

    }

    PoolTaskGenerator(
            boolean allowDuplicate,
            List<Task> tasks
    ) {

    }

    public Task generate() {
        return null;
    }
}
