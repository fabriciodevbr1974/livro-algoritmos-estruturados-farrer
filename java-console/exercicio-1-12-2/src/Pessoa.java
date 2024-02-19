public class Pessoa {

  private double altura;
  private SexoEnum sexo;

  public Pessoa(double altura, SexoEnum sexo) {
    this.altura = altura;
    this.sexo = sexo;
  }

  public double getAltura() {
    return altura;
  }

  public SexoEnum getSexo() {
    return sexo;
  }
}
