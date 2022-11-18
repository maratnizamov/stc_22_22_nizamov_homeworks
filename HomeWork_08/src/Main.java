public class Main {
    public static void main(String[] args) {
        int[] arrays = new int[]{12, 62, 4, 2, 100, 40, 56};
        ArrayTask taskSum = (array, from, to) -> {
            int sum = 0;
            for (int i = from; i <= to; i++) {
                sum += array[i];
            }
            return sum;
        };
        ArrayTask taskSumDigits = (array, from, to) -> {
            int max = to;
            for (int i = from; i < to; i++) {
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            max = array[max];
            int sum = 0;
            while (max >= 10) {
                sum += (max % 10);
                max /= 10;
            }
            sum += max;
            return sum;
        };
        ArraysTasksResolver.resolveTask(arrays, taskSum, 1, 3);
        ArraysTasksResolver.resolveTask(arrays, taskSumDigits, 1, 3);
    }
}