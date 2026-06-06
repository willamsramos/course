package application;

import util.ConversorMoeda;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMoeda {
  static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual é o preço em dólares? ");
    double cotacao = sc.nextDouble();

    System.out.println("Quantos dólares serão comprados?");
    double dolares = sc.nextDouble();

    double total = ConversorMoeda.converteReal(cotacao, dolares);

    System.out.printf("Valor a ser pago em reais = %.2f%n", total);

    sc.close();
  }
}
