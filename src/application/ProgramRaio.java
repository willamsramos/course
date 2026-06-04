package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class ProgramRaio {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    System.out.print("Digite o raio: ");
    double raio = sc.nextDouble();

    double c = calc.circunferencia(raio);

    double v = calc.volume(raio);

    System.out.printf("Circunferência: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI valor: %.2f%n", calc.PI);

    sc.close();
  }

}
