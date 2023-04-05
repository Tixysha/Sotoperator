public class main {
    public static void main(String[] args) {
        int initial_account = 100;
        int deposit_amount = 1100;

        int bonus;
        int final_score;
        if (deposit_amount > 1000) {
            bonus = deposit_amount / 100;
            final_score = initial_account + deposit_amount + bonus;
        } else {
            bonus = 0;
            final_score = initial_account + deposit_amount;
        }

        System.out.println("Итоговый счет: " + final_score);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
