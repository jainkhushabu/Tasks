package task25;

	class BankAccount {
	    private int balance;

	    public BankAccount(int balance) {
	        this.balance = balance;
	    }

	    // Synchronized method to ensure thread safety
	    public synchronized void withdraw(int amount, String threadName) {
	        if (amount > balance) {
	            System.out.println(threadName + " tried to withdraw " + amount + " but insufficient funds. Balance: " + balance);
	            return;
	        }
	        balance -= amount;
	        System.out.println(threadName + " withdrew " + amount + ". Remaining balance: " + balance);
	    }

	    public int getBalance() {
	        return balance;
	    }
	}

	class Customer extends Thread {
	    private BankAccount account;
	    private int withdrawalAmount;

	    public Customer(BankAccount account, int withdrawalAmount, String name) {
	        super(name);
	        this.account = account;
	        this.withdrawalAmount = withdrawalAmount;
	    }

	    @Override
	    public void run() {
	        account.withdraw(withdrawalAmount, getName());
	    }
	}

	public class BankingSystem {
	    public static void main(String[] args) {
	        BankAccount sharedAccount = new BankAccount(1000); // Shared account with initial balance

	        // Creating multiple threads (customers) trying to withdraw money
	        Thread t1 = new Customer(sharedAccount, 500, "Customer-1");
	        Thread t2 = new Customer(sharedAccount, 700, "Customer-2");
	        Thread t3 = new Customer(sharedAccount, 300, "Customer-3");

	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}


