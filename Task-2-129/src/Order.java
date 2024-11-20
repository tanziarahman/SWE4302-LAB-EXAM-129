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
}
