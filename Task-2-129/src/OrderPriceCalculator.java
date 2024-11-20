public class OrderPriceCalculator {
    private static double totalAmount = 0;
    private UserOrder userOrder;

    public OrderPriceCalculator(){
        this.userOrder = new UserOrder();
    }
    private void calculateFlavourPrice(){
        for(IceCreamFlavour f: userOrder.getFlavours()) {
            totalAmount += f.getPricePerScoop();
        }
    }
    private void calculateToppingPrice(){
        for(IceCreamTopping t: userOrder.getToppings()){
            totalAmount+=t.getPrice();
        }
    }
    private void priceWithCone(){
        if(userOrder.getWaffleCone())
            totalAmount = totalAmount+(totalAmount*0.08);
    }
    private void calculatePrice(){
        calculateFlavourPrice();
        calculateToppingPrice();
        priceWithCone();
        totalAmount = totalAmount+(totalAmount*0.05);
    }
    public double getTotalAmount(){
        calculatePrice();
        return totalAmount;
    }
}
