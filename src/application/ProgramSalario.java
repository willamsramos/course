package application;

import util.CalculadoraSalario;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSalario {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual o salário bruto? ");
    double bruto = sc.nextDouble();

    double total = CalculadoraSalario.calcularSalario(bruto);

    System.out.printf("Salário líquido com desconto é: %.2f%n", total);

    sc.close();
  }
}
