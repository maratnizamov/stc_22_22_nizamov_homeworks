public class Main {
    public static void completeAllTasks(Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            tasks[i].complete();
        }
    }
    public static void main(String[] args) {
        final int arrayLength = 4;
        Task[] tasks = new Task[arrayLength];
        tasks[0] = new EvenNumbersPrintTask(1, 5);
        tasks[1] = new EvenNumbersPrintTask(6, 10);
        tasks[2] = new OddNumbersPrintTask(11, 15);
        tasks[3] = new OddNumbersPrintTask(16, 20);
        completeAllTasks(tasks);
    }
}