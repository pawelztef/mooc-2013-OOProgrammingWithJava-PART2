import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket(){
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if(this.basket.containsKey(product)){
            Purchase p = this.basket.get(product);
            p.increaseAmount();
            this.basket.replace(product, p);
        } else {
           this.basket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for(Purchase p : this.basket.values()) {
            sum += p.price();
        }
        return sum;
    }

    public void print() {
        for(Purchase p : this.basket.values()) {
            System.out.println(p);
        }
    }


}
