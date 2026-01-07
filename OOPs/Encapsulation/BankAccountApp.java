public class BankAccountApp {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "Aneegha",
                1234567890L,
                5000.00
        );

        account.displayAccountInfo();

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
