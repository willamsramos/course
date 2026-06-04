package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner teclado = new Scanner(System.in);

    Student aluno = new Student();

    System.out.print("Nome: ");
    aluno.name = teclado.nextLine();

    System.out.print("Nota do primeiro trimestre: ");
    aluno.n1 = teclado.nextDouble();

    System.out.print("Nota do segundo trimestre: ");
    aluno.n2 = teclado.nextDouble();

    System.out.print("Nota do terceiro trimestre: ");
    aluno.n3 = teclado.nextDouble();

    System.out.println("NOTA FINAL: " + String.format("%.2f", aluno.finalGrade()));

    if (aluno.finalGrade() < 60) {
      System.out.println("REPROVADO");
      System.out.println(
          "PONTOS FALTANDO: " + String.format("%.2f", aluno.missingPoints()));
    } else {
      System.out.println("APROVADO");
    }
    

    teclado.close();
  }
}
