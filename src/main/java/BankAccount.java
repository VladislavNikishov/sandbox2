public class BankAccount {
    String name;
    int account;
    int balance;

    BankAccount(int balance, String name, int account) {
        this.balance = balance;
        this.name = name;
        this.account = account;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void showBalance() {
        System.out.println("Номер счета: " + account);
        System.out.println("Владелец: " + name);
        System.out.println("Баланс: " + balance);
    }
}
