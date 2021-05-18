public class Main {
    public static void main(String[] args) {

        double initialAccount = 100;
        double refill = 1000;
        boolean bonus = refill > 1000;

        if (bonus) {
            int balance = (int) (refill / 100);
            System.out.println("Итоговая сумма " + (initialAccount + balance + refill));

        } else {
            System.out.println("Итоговая сумма " + (initialAccount + refill));
        }
    }
}