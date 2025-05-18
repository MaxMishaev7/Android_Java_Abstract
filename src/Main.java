import ru.mishaev.max.*;

public class Main {
    public static void main(String[] args) {
        SimpleAccount sa = new SimpleAccount(500);
        CreditAccount ca = new CreditAccount(0);

        System.out.println("\nНачальная сумма на простом кошельке: " + sa.getBalance());
        System.out.println("Начальная сумма на кредитном кошельке: " + ca.getBalance());

        // Пополнение обычного аккаунта
        sa.add(2000);
        System.out.println("Пополнен обычный счёт. Баланс: " + sa.getBalance() + " руб." );

        // Покупка с простого счёта
        sa.pay(1000);
        System.out.println("Покупка с обычного счёта. Баланс: " + sa.getBalance() + " руб.");

        // Перевод на другой простой счёт
        SimpleAccount sa2 = new SimpleAccount(250);
        sa.transfer(sa2, 500);
        System.out.println("Перевод на другой аккаунт. На первом счёте осталось: " + sa.getBalance());
        System.out.println("На втором счёте прибавилось. Баланс: " + sa2.getBalance());

        // Покупка с кредитного счёта
        ca.pay(20_000);
        System.out.println("Покупка с кредитного счёта. Баланс: " + ca.getBalance());
        ca.pay(8000);
        System.out.println("Покупка с кредитного счёта. Баланс: " + ca.getBalance());

        // Пополнение кредитного счёта
        ca.add(4300);
        System.out.println("Пополнение кредитного счёта. Баланс: " + ca.getBalance());


    }
}
