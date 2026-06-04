package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    Employee func = new Employee();
    
    System.out.print("Nome: ");
    func.name = sc.nextLine();
    System.out.print("Salário bruto: ");
    func.grossSalary = sc.nextDouble();
    System.out.print("Imposto: ");
    func.tax = sc.nextDouble();
    
    System.out.println();
    System.out.println("Funcionário: " + func);
    System.out.println();
    System.out.print("Qual percentual de aumento salarial? ");
    double percentual = sc.nextDouble();
    func.increaseSalary(percentual);
    
    System.out.println();
    System.out.println("Dados atualizados: " + func);
    sc.close();
  }

}
