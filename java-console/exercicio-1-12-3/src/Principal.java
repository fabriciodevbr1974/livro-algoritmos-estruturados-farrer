/*

* */


public class Principal {

  public static void main(String[] args) {
    System.out.println("Farenheit - Centrígrado");
    for (int farenheit = 50; farenheit <= 150; farenheit++){
      System.out.printf("%d - %f\n", farenheit, centigrado(farenheit));
    }
  }

  public static double centigrado(int  farenheit){
    return (5/9f) * (farenheit - 32);
  }



}
