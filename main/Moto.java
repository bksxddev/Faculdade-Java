package main;

public class Moto extends VeiculosTerrestre{
    private float velocidadeMax;
    private int pesoSuportado;

    public Moto(String modelo, int ano, String cor, boolean ligado, int numeroRodas, float velocidadeMax,int pesoSuportado){
        super(modelo, ano, cor, ligado, numeroRodas);
        this.velocidadeMax = velocidadeMax;
        this.pesoSuportado = pesoSuportado;

    }
}
