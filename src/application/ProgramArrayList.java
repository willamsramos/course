package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramArrayList {
  static void main() {
    List<String> list = new ArrayList<String>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Ana");
    list.add(2, "Marcos");

    System.out.println(list.size());

    for (String nomes : list) {
      System.out.println(nomes);
    }
    System.out.println("------------------------------");
    list.removeIf(nomes -> nomes.charAt(0) == 'M');
    for (String nomes : list) {
      System.out.println(nomes);
    }
    System.out.println("------------------------------");
    System.out.println("Index do Bob: " + list.indexOf("Bob"));
    System.out.println("Index do Marco: " + list.indexOf("Marco"));
    System.out.println("------------------------------");
    List<String> resultado = list.stream().filter(nomes -> nomes.charAt(0) == 'A').toList();
    for (String nomes : resultado) {
      System.out.println(nomes);
    }
    System.out.println("------------------------------");
    String nome = list.stream().filter(nomes -> nomes.charAt(0) == 'A').findFirst().orElse(null);
    System.out.println(nome);
  }
}
