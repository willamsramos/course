package entities;

public class Account {

  private final int numero;
  private String titular;
  private double saldo;

  public Account(int numero, String titular) {
    this.numero = numero;
    this.titular = titular;
  }

  public Account(int numero, String titular, double depositoInicial) {
    this.numero = numero;
    this.titular = titular;
    deposito(depositoInicial);
  }

  public int getNumero() {
    return numero;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void deposito(double quantia) {
    saldo += quantia;
  }

  public void whithdraw(double quantia) {
    saldo -= quantia + 5.0;
  }

  public String toString() {
    return "Conta "
            + numero
            + ", titular: "
            + titular
            + ", Saldo: R$ "
            + String.format("%.2f", saldo);
  }

}

