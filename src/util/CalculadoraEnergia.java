package util;

public class CalculadoraEnergia {
  public static final double ICMS = 0.06;

  public static double calcularContaEnergia(double consumo, double tarifa) {
    return consumo * tarifa * (1 + ICMS);
  }

}
