package application;

import util.CalculadoraEnergia;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEnergia {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual a tarifa de energia (R$/kWh)?");
    double tarifa = sc.nextDouble();

    System.out.println("Quantos kWh foram consumidos?");
    double consumo = sc.nextDouble();
    // Aqui estou chamando a classe e metodo criado na classe
    double total = CalculadoraEnergia.calcularContaEnergia(consumo, tarifa);

    System.out.printf("Total da conta de energia = R$ %.2f%n", total);

    sc.close();
  }
}
