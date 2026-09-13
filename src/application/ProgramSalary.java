package application;

import entities.EmployeeRegistered;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramSalary {
  static void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<EmployeeRegistered> list = new ArrayList<>();

    System.out.print("Quantos funcionários serão cadastrados? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Funcionário #" + i + ":");

      System.out.print("Id: ");
      int id = sc.nextInt();
      sc.nextLine();

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Salary: ");
      double salary = sc.nextDouble();

      list.add(new EmployeeRegistered(id, name, salary));
    }

    System.out.print("Insira o ID do funcionário que receberá um aumento salarial:");
    int id = sc.nextInt();

    System.out.print("Insira a porcentagem: ");
    double percentage = sc.nextDouble();

    EmployeeRegistered emp = list.stream()
            .filter(employeeRegistered -> employeeRegistered.getId().equals(id))
            .findFirst()
            .orElse(null);

    if (emp != null) {
      emp.increaseSalary(percentage);
    } else {
      System.out.println("Id não encontrado!");
    }

    System.out.println("Lista de Funcionários");
    for (EmployeeRegistered e : list) {
      System.out.println(e);
    }
    sc.close();
  }
}
