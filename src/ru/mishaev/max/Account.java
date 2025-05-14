package ru.mishaev.max;

public abstract class Account {

    protected long amount;
    
    // пополнение счёта на amount, возвращает true, 
    // если пополнение успешно, 
    // и false, если иначе

    public abstract boolean add(long amount);


    // покупка со счёта на amount, 
    // возвращает true, если покупка успешна, 
    // и false, если иначе}

    public abstract boolean pay(long amount);

    /* 
    * перевод денег со счёта, у которого был вызван метод, 
    * на счёт из параметра на сумму в размере amount, 
    * возвращает true, если пополнение успешно, 
    * и false, если иначе
    * Мы советуем реализовать операцию transfer как комбинацию из двух других операций.
    */
    public abstract boolean transfer(Account account, long amount);

    // метод возвращает текущий баланс на счёте.
    public abstract long getBalance();

}