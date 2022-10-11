package main.java.p04.modelos;

public class NaveBuilder extends Builder {
  private Nave nave;

  public NaveBuilder() {}

  public NaveBuilder(Nave nave) {
    this.nave = nave;
  }

  public Nave getNave() {
    return this.nave;
  }

  @Override
  public Nave build() {
    this.nave = super.build();
    return this.nave;
  }
}
