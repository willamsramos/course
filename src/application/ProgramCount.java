package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCount {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Account account;

    System.out.print("Digite o número da conta: ");
    int numero = sc.nextInt();
    System.out.print("Digite o titular da conta: ");
    sc.nextLine();
    String titular = sc.nextLine();
    System.out.print("Existe um depósito inicial (s/n)? ");
    char response = sc.next().charAt(0);
    if (response == 's') {
      System.out.print("Insira o valor inicial do depósito: ");
      double depositoInicial = sc.nextDouble();
      account = new Account(numero, titular, depositoInicial);
    } else {
      account = new Account(numero, titular);
    }

    System.out.println();
    System.out.println("Dados da conta: ");
    System.out.println(account);

    System.out.println();
    System.out.print("Insira o valor do depósito: ");
    double valorDeposito = sc.nextDouble();
    account.deposito(valorDeposito);
    System.out.println("Dados atualizados da conta: ");
    System.out.println(account);

    System.out.println();
    System.out.print("Insira um valor de retirada: ");
    double valorRetirada = sc.nextDouble();
    account.whithdraw(valorRetirada);
    System.out.println("Dados atualizados da conta: ");
    System.out.println(account);

    sc.close();
  }
}
