package main;
public class VeiculosTerrestre extends Veiculos {
    private int numeroRodas;
    
    public VeiculosTerrestre(String modelo, int ano, String cor, boolean ligado, int numeroRodas){
        super(modelo, ano, cor, ligado);
        this.numeroRodas = numeroRodas;

    }
}
