package ru.mishaev.max;

public class SimpleAccount extends Account {
    // обычный счёт, с которого можно платить,
    // пока на нём есть деньги, и пополнять сколько угодно раз.

    public SimpleAccount(long amount) {
        this.amount = Math.abs(amount); // создаём банковский счёт с заданной суммой сразу.
    }

    public boolean add(long amount) {
        if (amount > 0) {
            this.amount += amount;
            return true;
        }
        return false;
    }   
    
    public boolean pay(long amount) {
        if (amount > 0) {
            this.amount -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(Account account, long amount) {        
        return pay(amount)? account.add(amount) : add(amount);
    }

    public long getBalance() {
        return amount;
    }
}
