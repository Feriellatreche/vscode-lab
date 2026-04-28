public class Main {
    public static void main(String[] args) {
        System.out.println("=== BEFORE ===");
        OrderCalculatorBefore orderBefore = new OrderCalculatorBefore();
        DiscountCalculatorBefore discountBefore = new DiscountCalculatorBefore();
        
        double subtotal = 100;
        double taxRate = 0.1;
        double discountRate = 0.2;
        
        System.out.println("Order Total: " + orderBefore.calculateTotal(subtotal, taxRate));
        System.out.println("Discounted: " + orderBefore.applyDiscount(110, discountRate));
        
        System.out.println("\n=== AFTER (Composition) ===");
        
        CalculationService calcService = new CalculationService();
        OrderCalculator orderAfter = new OrderCalculator(calcService);
        DiscountCalculator discountAfter = new DiscountCalculator(calcService);
        
        System.out.println("Order Total: " + orderAfter.calculateOrderTotal(subtotal, taxRate));
        System.out.println("Discounted: " + orderAfter.applyOrderDiscount(110, discountRate));
        System.out.println("Full Discount: " + discountAfter.calculateDiscountedTotal(subtotal, taxRate, discountRate));
    }
}