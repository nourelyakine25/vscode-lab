class CalculationService {

    // Shared calculation method
    public double calculateTotal(
            double subtotal,
            double taxRate
    ) {

        double tax = subtotal * taxRate;

        return subtotal + tax;
    }

    // Shared discount method
    public double applyDiscount(
            double total,
            double discountRate
    ) {

        return total * (1 - discountRate);
    }
}