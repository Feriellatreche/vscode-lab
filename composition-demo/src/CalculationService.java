public class CalculationService {
    public double calculateTotal(double subtotal, double taxRate) {
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }

    public double applyDiscount(double total, double discountRate) {
        if (discountRate < 0 || discountRate > 1) {
            throw new IllegalArgumentException("Discount rate must be between 0 and 1");
        }
        return total * (1 - discountRate);
    }
}