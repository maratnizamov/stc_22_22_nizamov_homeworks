public class Bankomat {
    int money = 500000;
    int limit = 100000;
    public static final int maxMoney = 1000000;
    int countOperations;
    void get(int sum) {
        if (getLimits(sum)) {
            System.out.println("Please take your $" + sum);
            money -= sum;
        }
    }
    void put(int sum) {
        if (putLimits(sum)) {
            System.out.println("You've put $" + sum);
            money += sum;
        }
    }
    public boolean getLimits(int sum) {
        boolean result;
        if (sum > limit) {
            System.out.println("Cash getting limit of $100000 exceeded");
            result = false;
        } else if (sum > money) {
            System.out.println("Entered amount is greater than available money");
            result = false;
        } else {
            result = true;
        }
        return result;
    }
    public boolean putLimits(int sum) {
        boolean result;
        if ((sum + money) > maxMoney) {
            System.out.println("Error: ATM is full of money");
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
