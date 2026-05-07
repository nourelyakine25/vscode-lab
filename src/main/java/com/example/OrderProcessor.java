import java.util.List;

public class OrderProcessor {

    public void printOrderSummary(Order order) {

        double totalPrice = calculateTotalPrice(order.getItems());

        totalPrice = applyDiscount(
                totalPrice,
                order.getCustomer().isMember()
        );

        printSummary(order, totalPrice);
    }

    private double calculateTotalPrice(List<Item> items) {

        double totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }

        return totalPrice;
    }

    private double applyDiscount(
            double totalPrice,
            boolean isMember
    ) {

        if (isMember) {
            return totalPrice * 0.9;
        }

        return totalPrice;
    }

    private void printSummary(Order order, double totalPrice) {

        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());

        for (Item item : order.getItems()) {
            System.out.println(item.getName());
        }

        System.out.println("Total: " + totalPrice);
    }
}