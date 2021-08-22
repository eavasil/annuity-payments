import java.math.MathContext;

public class LoanCalculatorService {
    public float calculate(float percent, int creditAmount, int month) {
        float monthlyPercent = percent / (12*100);
        // dividend делимое
        // divider делитель
        float dividend = creditAmount * monthlyPercent;
        float divider = 1 - (float) Math.pow((1+monthlyPercent), -month);
        float monthlyPayment = dividend / divider;
        return monthlyPayment;

        //float monthlyPercent = percent * 100 / 12;
        // dividend делимое
        // divider делитель
        //float dividend = monthlyPercent * (float) Math.pow((1-monthlyPercent), month);
        //float divider = (float) Math.pow((1+monthlyPercent), month) - 1;
        //float monthlyPayment = creditAmount * (dividend / divider);
        //return monthlyPayment;


        //public class LoanCalculatorService {
            //public float calculate(float percent, int creditAmount, int month) {
              //  float monthlyPercent = percent / 100 / 12;
                //float mathPowArg1 = 1 + monthlyPercent;
                //float mathPowArg1and2 = (float) Math.pow((1 + monthlyPercent), -month);
                //float monthlyPayment = creditAmount * (monthlyPercent / mathPowArg1and2);
                //return monthlyPayment;

            }
}


