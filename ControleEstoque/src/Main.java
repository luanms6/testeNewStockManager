import java.util.List; // Adicione esta linha de importação


public class Main {
    public static void main(String[] args) {
        // Criar instâncias de produtos
        Product product1 = new Product("Laptop", 1200.0, 10);
        Product product2 = new Product("Mouse", 20.0, 50);
        Product product3 = new Product("Teclado", 50.0, 30);

        // Criar instância do gerenciador de estoque
        StockManager stockManager = new StockManager();

        // Adicionar produtos ao estoque
        stockManager.addProduct(product1);
        stockManager.addProduct(product2);
        stockManager.addProduct(product3);

        // Atualizar preço e quantidade de um produto
        Product laptop = stockManager.findProductByName("Laptop");
        if (laptop != null) {
            stockManager.updateProduct(laptop, 1300.0, 8);
        }

        // Remover um produto do estoque
        stockManager.removeProduct(product2);

        // Exibir lista de produtos no estoque
        List<Product> productsInStock = stockManager.getProducts();
        System.out.println("Produtos em estoque:");
        for (Product product : productsInStock) {
            System.out.println(product.getName() + " - Preço: $" + product.getPrice() + " - Quantidade: " + product.getQuantity());
        }
    }
}