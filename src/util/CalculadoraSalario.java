package util;

public class CalculadoraSalario {
  public static final double INSS = 0.11;

  public static double calcularSalario(double bruto) {
    return bruto * (1 - INSS);

  }
}
