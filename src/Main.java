public class Main {
    public static void main(String[] args) {
        LoanCalculatorService service = new LoanCalculatorService();
        float percent1 = (float) 9.99;
        int creditAmount1 = 1_000_000;
        int month1 = 12;
        float monthlyPayment1 = service.calculate(percent1, creditAmount1, month1);
        System.out.println(monthlyPayment1);

        int month2 = 24;
        float monthlyPayment2 = service.calculate(percent1, creditAmount1, month2);
        System.out.println(monthlyPayment2);

        int month3 = 36;
        float monthlyPayment3 = service.calculate(percent1, creditAmount1, month3);
        System.out.println(monthlyPayment2);


    }
}