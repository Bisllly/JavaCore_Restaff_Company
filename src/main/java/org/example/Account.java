package org.example;

//create a class
public class Account {
    static String id;
    String name;
    int balance = 15;

    public Account() {}

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    int credit(int amount) {
        balance += amount;
        return balance;
    }
    int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.print("amount exceeded");
        }
        return balance;
    }
    // Account a = new Account();
    int transferTo(Account a,int amount){
        if (amount <= balance) {
            balance = debit(amount);
            a.credit(amount);
        } else {
            System.out.print("amount exceeded");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
