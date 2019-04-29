import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Storehouse() {
        this.price = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (this.price.containsKey(product)) {
            return this.price.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if(this.price.containsKey(product)) {
            return this.stock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if(!stock.containsKey(product)) {
            return false;
        } else if (stock.get(product)-1 >= 0) {
            stock.replace(product, stock.get(product)-1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return this.stock.keySet();
    }
}
