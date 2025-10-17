package Chapter9;

public class BankAccount {
    public static void main(String[] args) {
        // Create account with initial balance
        BankAccount acc1 = new BankAccount("Cns232", "Ali", 500);



        System.out.println(acc1);
        System.out.println("We Make  crediting Money :");
        // Deposit (credit)
        acc1.credit(200);
        System.out.println("After credit 200: " + acc1);

        System.out.println();
        System.out.println("We Make  Deposing Money :");
        // Withdraw (debit)
        acc1.debit(100);
        System.out.println("After debit 100: " + acc1);





    }
    String id;
    String name;
    int balance = 0;

    // Constructor with id and name
    BankAccount(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with id, name, and balance
    BankAccount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // Add money
    int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Withdraw money
    int debit(int amount) {

        balance -= amount;

        return balance;
    }

    public String toString() {
        return "Account_id=" + id + ", Account_name=" + name + ", Account_balance=" + balance + "]";
    }}
