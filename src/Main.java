public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double sum = 1_000_000;
        double rai = 9.99;
        int period = 24;

        int annuityPayment = service.calculate((int) sum, rai, period);

        System.out.println(annuityPayment);
    }
}