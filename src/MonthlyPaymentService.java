public class MonthlyPaymentService {
    public double calculate(double loanAmount, double interest, double months) {
        double monthlyRate = interest / 12 / 100;
        double annuityCoefficient = monthlyRate * (Math.pow(1 + monthlyRate, months)) / ((Math.pow(1 + monthlyRate, months)) - 1);
        double payment = loanAmount * annuityCoefficient;
        return payment;

    }
}
