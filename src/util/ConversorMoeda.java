package util;

public class ConversorMoeda {
   public  static final double IFO = 0.06;

   public  static  double converteReal(double contacao, double dolares) {
     return dolares * contacao * (1 + IFO);
   }
}
