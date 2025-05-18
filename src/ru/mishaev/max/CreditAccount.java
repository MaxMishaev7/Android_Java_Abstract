package ru.mishaev.max;

public class CreditAccount extends Account {
    private final long limit;

    // кредитный счёт, который может уходить в минус 
    // до кредитного лимита, указанного в конструкторе, 
    // но не может уходить в плюс.

    public CreditAccount(long limit) {
        if (limit != 0) {
            this.limit = Math.abs(limit) * (-1);
        } else {
            this.limit = -10000; // если в конструкторе указан 0, то назначаем кредитный лимит по умолчанию
        }
        this.amount = 0;
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

    public boolean transfer(Account account, long amount) {
        return pay(amount)? account.add(amount) : add(amount);
    }

    public long getBalance() {
        return this.amount;
    }
}

// javac -d out -cp src src/Main.java src/ru/mishaev/max/*
// java -cp out Main
