public class PriceCalculator {
    public double getFlavourPrice(IceCreamFlavour flavour){
        return flavour.getPricePerScoop();
    }
    public double getToppingPrice(IceCreamTopping topping){
        return topping.getPrice();
    }
}
