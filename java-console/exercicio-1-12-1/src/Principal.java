import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    double soma = 0.0;
    int contadorDeIdade = 0;

    try{
      while (true) {
        System.out.println("Digite uma idade");
        int idade = leitura.nextInt();

        if (idade == 0) {
          break;
        }
        contadorDeIdade++;
        soma += idade;
      }
    } catch (InputMismatchException e){
      System.out.println("Digite um número inteiro para a idade");
    }

    if (contadorDeIdade > 0) {
      System.out.println("Idade média: " + (soma / contadorDeIdade));
    } else {
      System.out.println("Não há idades informada para o cálculo da média");
    }

  }

}
