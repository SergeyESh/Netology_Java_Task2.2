public class Main {
    public static void main(String[] args) {

        int balance = 100; // баланс счёта
        int refill = 1100; // стоимость пополнения
        int x = 100; // коэффициент для расчета бонусных рублей
        int result;
        if (refill > 1000) {
            int bonus = refill / x;
            result = balance + refill + bonus;
            System.out.println(("Количество бонусов: ") + bonus);
            System.out.println(("Итоговая сумма на счету: ") + result + (" рублей"));
        } else {
            result = balance + refill;
            System.out.println(("Бонусов нет, итоговая сумма на счету: ") + result + (" рублей"));
        }

    }
}