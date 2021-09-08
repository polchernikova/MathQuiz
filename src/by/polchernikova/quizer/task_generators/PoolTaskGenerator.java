package by.polchernikova.quizer.task_generators;

import by.polchernikova.quizer.Task;
import by.polchernikova.quizer.TaskGenerator;
import java.util.*;

public class PoolTaskGenerator implements TaskGenerator {
    public PoolTaskGenerator(
            boolean allowDuplicate,
            Task... tasks
    ) {
        pool = Arrays.stream(tasks).toList();
        allowDupl = allowDuplicate;
    }

    public PoolTaskGenerator(
            boolean allowDuplicate,
            List<Task> tasks
    ) {
        pool = tasks;
        allowDupl = allowDuplicate;
    }

    public Task generate() {
        int index = (int)(Math.random() * (pool.size()));
        if(allowDupl) {
            return pool.get(index);
        } else {
            pool.remove(index);
            return pool.get(index);
        }
    }

    private List<Task> pool;
    private final boolean allowDupl;
}
