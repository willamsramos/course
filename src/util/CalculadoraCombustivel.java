package util;

public class CalculadoraCombustivel {
   public static final double COMBUSTIVEL = 12.0;

   public static double calcularCusto(double precoLitro, double distancia) {
     double litroNescessarios = distancia / COMBUSTIVEL;
     return litroNescessarios * precoLitro;
   }
}
