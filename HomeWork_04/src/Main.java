import java.util.Scanner;

public class Main {
    public static int sumOfInterval(int from, int to) {
        if (to < from) {
            return -1;
        }
        int x = 0;
        for (int i = from; i <= to; i++) {
            x += i;
        }
        return x;
    }
    public static int[] toArray(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Input integer element of the array");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void isEven (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from, to;
        System.out.println("What is the beginning of interval?");
        from = scanner.nextInt();
        System.out.println("What is the end of interval?");
        to = scanner.nextInt();
        System.out.println("Sum of interval is " + sumOfInterval(from, to));
        int len;
        System.out.println("What is length of array?");
        len = scanner.nextInt();
        int[] array = new int[len];
        array = toArray(len);
        isEven(array);
    }
}