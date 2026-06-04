package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle ret = new Rectangle();

    System.out.print("Largura: ");
    ret.width = sc.nextDouble();
    System.out.print("Altura: ");
    ret.height = sc.nextDouble();

    System.out.println();
    System.out.println(ret);

    sc.close();
  }
}

