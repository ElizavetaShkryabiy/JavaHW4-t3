public class MonthlyPaymentService {
    public double calculate(double loanAmount, double interest, double months) {
        // А=К*(П/(1+П)-М-1), где К – сумма кредита, П – процентная ставка, М – количество месяцев
        double monthlyRate = interest / 12/100;
        double annuityCoefficient = monthlyRate * (Math.pow(1 + monthlyRate,months)) / ((Math.pow(1 + monthlyRate,months)) - 1);
        double payment = loanAmount * annuityCoefficient;
        return payment;

    }
}
