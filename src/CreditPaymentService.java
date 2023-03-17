public class CreditPaymentService {

    public int calculate(int sum, double rai, int period){

        double annuity;
        double interestRate = rai / (100 * 12);

        annuity = sum * interestRate / (1 - Math.pow((1 + interestRate), -period));

    return (int) Math.round(annuity);
    }
}
