/*
 1.12.1. Fazer um algoritmo que:
 Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo.
 A última linha que não entrará nos cálculos, contém o valor da idade igual a zero.
 Calcule e escreva a idade média deste grupo de indivíduos.
 */

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    double soma = 0.0;
    int contadorDeIdade = 0;

    while (true) {
      System.out.println("Digite uma idade");
      String idadeEntrada = leitura.nextLine();
      try {
        int idade = Integer.parseInt(idadeEntrada);
        if (idade == 0) {
          break;
        }
        contadorDeIdade++;
        soma += idade;

      } catch (NumberFormatException e) {
        continue;
      }
    }

    if (contadorDeIdade > 0) {
      System.out.println("Idade média: " + (soma / contadorDeIdade));
    } else {
      System.out.println("Não há idades informada para o cálculo da média");
    }

  }

}
