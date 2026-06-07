package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os dados do produto: ");
    System.out.print("Nome: ");
    String name = sc.nextLine();
    System.out.print("Preço: ");
    double price = sc.nextDouble();
    System.out.print("Quantidade em estoque: ");
    int quantity = sc.nextInt();
    Product product = new Product(name, price, quantity);

    System.out.println();
    System.out.println("Dados do produtos : " + product);

    System.out.println();
    System.out.println("Digite a quantidade de produtos a ser adicionada ao estoque: ");
    quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Dados atualizados : " + product);

    System.out.println();
    System.out.println("Digite a quantidade de produtos a ser removida do estoque: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Dados atualizados : " + product);

    sc.close();
  }
}

