public class Main {
    public static void main(String[] args) {
        int account = 100_00;
        int refill = 3000_00;
        int bonus;

        if (refill > 1000_00) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int currentAccount = account + refill + bonus;
        System.out.println(currentAccount);
    }
}
