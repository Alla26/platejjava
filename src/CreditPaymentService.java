public class CreditPaymentService {
    public int calculate(int amount, int term, float interestRate) {
        float interestRatePerMonth = (interestRate / 1200 + 1);
        double ratio = Math.pow(interestRatePerMonth, term);
        int result = (int) (amount * ((float) ((interestRatePerMonth - 1) * ratio) / (ratio - 1)));
        return result;
    }

}

