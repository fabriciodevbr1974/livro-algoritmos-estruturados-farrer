import java.util.List;

public class PrincipalSomenteHomens {

  public static void main(String[] args) {

    List<Pessoa> pessoas = PessoasRepository.listarSomenteHomens();

    double maiorAltura = 0.0;
    double menorAltura = Double.MAX_VALUE;

    int contadorDeMulhores = 0;
    double somaAlturaDasMulheres = 0.0;

    int contadorDeHomens = 0;

    for (Pessoa pessoa : pessoas) {

      if (pessoa.getAltura() > maiorAltura) {
        maiorAltura = pessoa.getAltura();
      }

      if (pessoa.getAltura() < menorAltura) {
        menorAltura = pessoa.getAltura();
      }

      if (pessoa.getSexo().equals(SexoEnum.FEMININO)) {
        contadorDeMulhores++;
        somaAlturaDasMulheres += pessoa.getAltura();
      }

      if (pessoa.getSexo().equals(SexoEnum.MASCULINO)) {
        contadorDeHomens++;
      }

    }

    System.out.println("Maior altura: " + maiorAltura);
    System.out.println("Menor altura: " + menorAltura);
    System.out.println("Média das alturas das mulheres: " + (contadorDeMulhores > 0 ? (somaAlturaDasMulheres / contadorDeMulhores) : 0));
    System.out.println("Total de homens: " + contadorDeHomens);


  }


}
