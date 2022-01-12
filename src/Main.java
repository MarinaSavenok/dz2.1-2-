public class Main {
    public static void main(String[] args) {
        int initially = 100;
        int refill = 1850;

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        int balance = initially + refill + bonus;

        System.out.println("Баланс: " + balance + " рублей. Бонус: " + bonus + " руб. ");

    }
}
