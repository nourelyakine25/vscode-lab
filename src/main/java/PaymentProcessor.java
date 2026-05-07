public class PaymentProcessor {

    public void processPayment(
            String paymentMethod,
            double amount
    ) {

        // if else كثيرة
        if (paymentMethod.equals("CreditCard")) {

            System.out.println(
                    "Processing credit card payment"
            );

        } else if (paymentMethod.equals("PayPal")) {

            System.out.println(
                    "Processing PayPal payment"
            );

        } else {

            System.out.println(
                    "Processing Bitcoin payment"
            );
        }
    }
}