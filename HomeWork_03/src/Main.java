import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is length of array?");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input integer element of the array");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] < array[i + 1]) {
                    count++;
                }
            } else if (i == array.length - 1) {
                if (array[i] < array[i - 1]) {
                    count++;
                }
            } else if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("- Count of local MINs of this array: " + count);
    }
}