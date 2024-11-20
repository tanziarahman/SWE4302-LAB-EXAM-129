import java.util.*;
public class Order {
    private List<IceCreamFlavour> flavors = new ArrayList<>();
    private Map<IceCreamTopping, Integer> toppings = new HashMap<>();
    private boolean isWaffleCone;
    private static final double WAFFLE_CONE_PRICE = 5.00;
    private static final double TAX_RATE = 0.08;
    public void addFlavor(IceCreamFlavour flavor) {
        flavors.add(flavor);
    }
    public void addTopping(IceCreamTopping topping) {
        toppings.put(topping, toppings.getOrDefault(topping, 0) + 1);
    }
    public void chooseWaffleCone(boolean isWaffleCone) {
        this.isWaffleCone = isWaffleCone;
    }
    public double calculateSubtotal() {
        double subtotal = 0.0;
        for (IceCreamFlavour flavor : flavors) {
            subtotal += flavor.getPricePerScoop();
        }
        for (Map.Entry<IceCreamTopping, Integer> entry : toppings.entrySet()) {
            subtotal += entry.getKey().getPrice() * entry.getValue();
        }
        if (isWaffleCone) {
            subtotal += WAFFLE_CONE_PRICE;
        }
        return subtotal;
    }
    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }
    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
    public boolean isWaffleCone() {
        return isWaffleCone;
    }
}
