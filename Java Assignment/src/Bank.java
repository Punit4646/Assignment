abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance = 150;

    public int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance = 200;

    public int getBalance() {
        return balance;
    }
}
