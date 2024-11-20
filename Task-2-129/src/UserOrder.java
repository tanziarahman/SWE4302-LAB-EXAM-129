import java.util.*;
public class UserOrder {
    private List<IceCreamFlavour> flavours;
    private List<IceCreamTopping> toppings;
    private boolean isWaffleCone;

    public UserOrder(){
        this.flavours = new ArrayList<>();
        this.toppings = new ArrayList<>();
    }
    public void addflavour(IceCreamFlavour flavour){
        flavours.add(flavour);
    }
    public void addTopping(IceCreamTopping topping){
        toppings.add(topping);
    }
    public void setWaffleCone(boolean w){
        isWaffleCone = w;
    }
    public boolean getWaffleCone(){
        return isWaffleCone;
    }
    public List<IceCreamFlavour> getFlavours(){
        return flavours;
    }
    public List<IceCreamTopping> getToppings(){
        return toppings;
    }
}
