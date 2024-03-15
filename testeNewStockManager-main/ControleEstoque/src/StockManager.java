import java.util.ArrayList;
import java.util.List;

public class StockManager {
    private List<Product> products;

    public StockManager() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price, int quantity) {
        Product newProduct = new Product(name, price, quantity);
        products.add(newProduct);
    }

    public void removeProduct(String name) {
        Product productToRemove = findProductByName(name);
        if (productToRemove != null) {
            products.remove(productToRemove);
        }
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
