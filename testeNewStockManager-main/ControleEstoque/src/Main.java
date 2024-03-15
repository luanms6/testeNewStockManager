import java.util.List; // Adicione esta linha de importação
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();

        boolean running = true;
        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Pesquisar produto");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String name = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double price = scanner.nextDouble();
                    System.out.println("Digite a quantidade do produto:");
                    int quantity = scanner.nextInt();
                    stockManager.addProduct(name, price, quantity);
                    System.out.println("Produto adicionado ao estoque.");
                    break;
                case 2:
                    System.out.println("Digite o nome do produto a ser removido:");
                    String productToRemove = scanner.nextLine();
                    stockManager.removeProduct(productToRemove);
                    System.out.println("Produto removido do estoque.");
                    break;
                case 3:
                    System.out.println("Digite o nome do produto a ser pesquisado:");
                    String productToFind = scanner.nextLine();
                    Product foundProduct = stockManager.findProductByName(productToFind);
                    if (foundProduct != null) {
                        System.out.println("Produto encontrado: " + foundProduct.getName() + " - Preço: $" + foundProduct.getPrice() + " - Quantidade: " + foundProduct.getQuantity());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
