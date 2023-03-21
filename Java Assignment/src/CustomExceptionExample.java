class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private int balance;

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            int needed = amount - balance;
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + needed + " Rs. to perform this transaction.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Account account = new Account(2000);

        try {
            int withdrawAmount = Integer.parseInt(args[0]);
            account.withdraw(withdrawAmount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter a valid integer.");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
