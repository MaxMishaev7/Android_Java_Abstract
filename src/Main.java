import ru.mishaev.max.*;

public class Main {
    public static void main(String[] args) {
        SimpleAccount sa = new SimpleAccount(500);
        CreditAccount ca = new CreditAccount(0);

        System.out.println("\nНачальная сумма на простом кошельке: " + sa.getBalance());
        System.out.println("Начальная сумма на кредитном кошельке: " + ca.getBalance());

    }
}
