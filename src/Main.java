public class Main {

    public static void main(String[] args) {
        // Initial balance
        double balance = 5000.0;

        // Annual interest rate
        double annualInterestRate = 0.17;

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;

        // Calculate interest for the first month
        double interestMonth1 = balance * monthlyInterestRate;

        // Calculate total balance after first month
        double balanceAfterMonth1 = balance + interestMonth1;

        // Calculate interest for the second month
        double interestMonth2 = balanceAfterMonth1 * monthlyInterestRate;

        // Calculate total balance after second month
        double balanceAfterMonth2 = balanceAfterMonth1 + interestMonth2;

        // Display results
        System.out.println("Interest after one month: $" + interestMonth1);
        System.out.println("Balance after one month: $" + balanceAfterMonth1);
        System.out.println("Interest after two months: $" + interestMonth2);
        System.out.println("Balance after two months: $" + balanceAfterMonth2);
    }
}
