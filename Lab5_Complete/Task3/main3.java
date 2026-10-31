import bankLab.bankAccound;
import bankLab.ATM;

public class main3 {
    public static void main(String[] args) {
        bankAccound account1 = new bankAccound(4821, "Ali", 20000, new double[] { 1000, 1000, 1500 });
        bankAccound account2 = new bankAccound(7930, "Sana", 8000, new double[] { 500, 500, 500 });
        bankAccound Ali = account1;
        bankAccound Sana = account2;

        Ali.calculateTotalRecentDeposits();
        Sana.calculateTotalRecentDeposits();
        Ali.displayAccount();
        Sana.displayAccount();
        Ali.withdraw(10000);
        Sana.withdraw(30000);
        System.out.println("Alias Sees balance : " + Ali.getBalance());
        System.out.println("total bank accounts created : " + bankAccound.accountCount);

        ATM atm1 = new ATM("ATM-01", "Ucp Gate", false);

        atm1.setWorking(true);
        atm1.displayATM();
    }
}
