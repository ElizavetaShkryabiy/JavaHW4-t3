public class Main {
    public static void main(String[] args) {
        MonthlyPaymentService service = new MonthlyPaymentService();
//        int loanAmount, int interest, int months
        double testCase1 = service.calculate(1_000_000, 9.99, 12);
        System.out.println(testCase1);

        double testCase2 = service.calculate(1_000_000, 9.99, 24);
        System.out.println(testCase2);

        double testCase3 = service.calculate(1_000_000, 9.99, 36);
        System.out.println(testCase3);

    }
}
