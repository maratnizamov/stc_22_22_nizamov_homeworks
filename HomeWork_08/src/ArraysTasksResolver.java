import java.util.Arrays;
public class ArraysTasksResolver {
    static void resolveTask(int[] array, ArrayTask task, int from, int to) {
        System.out.println(Arrays.toString(array));
        System.out.println(from);
        System.out.println(to);
        System.out.println(task.resolve(array, from, to));
    }
}