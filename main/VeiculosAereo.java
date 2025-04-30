package main;


public class VeiculosAereo extends Veiculos{
   private int numeroMotores;

  public VeiculosAereo(String modelo, int ano, String cor, boolean ligado, int numeroMotores){
   super(modelo, ano, cor, ligado);
   this.numeroMotores = numeroMotores;

  }
}
