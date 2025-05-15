package ru.mishaev.max;

public class CreditAccount extends Account {
    private final long limit;

    // кредитный счёт, который может уходить в минус 
    // до кредитного лимита, указанного в конструкторе, 
    // но не может уходить в плюс.

    public CreditAccount(long limit) {
        if (limit > 0) {
            limit *= -1;  // кредитный лимит должен быть отрицательным
        }
        if (limit == 0) {
            limit = -20000; // значение кредитного лимита по умолчанию
        }
        this.limit = limit;
    }    

    public boolean add(long amount) {
        if (this.amount + Math.abs(amount) <= 0) {
            this.amount += Math.abs(amount);
            return true;
        }
        return false;        
    }

    public boolean pay(long amount) {
        if (this.amount - amount >= limit) {
            this.amount -= amount;
            return true;
        }
        return false;
    }
}
