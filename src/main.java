public class main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount = 1100;

        int bonus;
        int finalScore;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            finalScore = initialAccount + depositAmount + bonus;
        } else {
            bonus = 0;
            finalScore = initialAccount + depositAmount;
        }

        System.out.println("Итоговый счет: " + finalScore);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
