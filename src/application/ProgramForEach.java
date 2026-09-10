package application;

public class ProgramForEach {
  static void main() {
    String[] vect = new String[]{"Maria", "Bob", "Alex"};

    for (int i = 0; i < vect.length; i++) {
      System.out.println(vect[i]);

    }
    System.out.println("-------------------------------------");
    // para cada objeto contido no OBJ contido no vetor VECT faça...
    for (String obj : vect) {
      System.out.println(obj);
    }
  }
}
