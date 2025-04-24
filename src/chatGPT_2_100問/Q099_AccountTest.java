package chatGPT_2_100問;
class Account {
    String owner;
    int balance;

    Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("残高不足です");
        }
    }

    void showBalance() {
        System.out.println(owner + "の残高: " + balance + "円");
    }
}

public class Q099_AccountTest {
    public static void main(String[] args) {
        Account a = new Account("高橋", 10000);
        a.deposit(5000);
        a.withdraw(3000);
        a.showBalance();
    }
}
