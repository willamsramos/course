package entities;

// Classe que representa um Produto com informações de nome, preço e quantidade
public class Product {

  // ===== ATRIBUTOS =====
  private String name;
  private double price;
  private int quantity;

  // ===== CONSTRUTORES =====
  
  // Construtor vazio
  public Product() {
  }

  // Construtor que inicializa nome, preço e quantidade
  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // Construtor que inicializa nome e preço (quantidade começa com 0 por ser um int)
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  // ===== GETTERS E SETTERS =====
  
  // Getter: retorna o nome do produto
  public String getName() {
    return name;
  }

  // Setter: define o nome do produto
  public void setName(String name) {
    this.name = name;
  }

  // Getter: retorna o preço do produto
  public double getPrice() {
    return price;
  }

  // Setter: define o preço do produto
  public void setPrice(double price) {
    this.price = price;
  }

  // Getter: retorna a quantidade em estoque
  public int getQuantity() {
    return quantity;
  }

  // ===== MÉTODOS UTILITÁRIOS =====
  
  // Calcula o valor total em estoque (preço × quantidade)
  public double totalValueInStock() {
    return price * quantity;
  }

  // Adiciona uma quantidade de produtos ao estoque
  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  // Remove uma quantidade de produtos do estoque
  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  // ===== METODO toString =====
  
  // Retorna uma representação em texto do produto com todas as informações
  public String toString() {
    return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " unidades, Total: $ "
        + String.format("%.2f", totalValueInStock());
  }
}
