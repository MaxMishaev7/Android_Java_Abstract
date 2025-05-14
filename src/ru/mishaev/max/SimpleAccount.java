package ru.mishaev.max;

public class SimpleAccount extends Account {
    // обычный счёт, с которого можно платить,
    // пока на нём есть деньги, и пополнять сколько угодно раз.

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
        if (amount > 0) {
            this.amount -= amount;
            account.add(amount);
            return true;    
        }
        return false;        
    }

    public long getBalance() {
        return amount;
    }
}
