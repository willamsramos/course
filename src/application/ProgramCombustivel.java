package application;

import util.CalculadoraCombustivel;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCombustivel {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual o preço do litro?");
    double precoLitro = sc.nextDouble();

    System.out.println("Qual a distância em km?");
    double distancia = sc.nextDouble();

    double total = CalculadoraCombustivel.calcularCusto(precoLitro, distancia);

    System.out.printf("Custo total trajeto = R$ %.2f%n", total);

    sc.close();
  }
}
