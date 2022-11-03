import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankomat atm = new Bankomat();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to put money\nPress 2 to get money\nPress 3 to exit");
            int key = scanner.nextInt();
            if (key == 1) {
                System.out.println("Please enter amount of $ to put:");
                int sum = scanner.nextInt();
                atm.put(sum);
                System.out.println();
            } else if (key == 2) {
                System.out.println("Please enter amount of $ to get:");
                int sum = scanner.nextInt();
                atm.get(sum);
                System.out.println();
            } else if (key == 3) {
                break;
            } else {
                System.out.println("Wrong key!");
            }
        }
    }
}