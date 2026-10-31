package bankLab;

public class bankAccound {
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    private double[] recentDeposits;
    private double totalRecentDeposits;
    public static int accountCount = 0;

    public bankAccound(int accountNumber, String accountHolderName, double balance, double[] recentDeposits) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.recentDeposits = new double[3];
        for (int i = 0; i < 3; i++) {
            this.recentDeposits[i] = recentDeposits[i];
        }
        accountCount++;

    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        recentDeposits[0] = recentDeposits[1];
        recentDeposits[1] = recentDeposits[2];

        recentDeposits[3] = amount;

        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("insufficient funds");
            return;
        }
        balance = balance - amount;
        System.out.println("You have successfuly withdrawed Rs : " + amount);
        System.out.println("new balance : " + balance);

    }

    public void calculateTotalRecentDeposits() {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + recentDeposits[i];
        }
        totalRecentDeposits = sum;
    }

    public void displayAccount() {
        System.out.println(accountNumber + " | " + accountHolderName + " | Balance :  " + balance
                + " | Recent Deposits  " + totalRecentDeposits);
    }

}
