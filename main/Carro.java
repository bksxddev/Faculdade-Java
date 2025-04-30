package main;

public class Carro extends VeiculosTerrestre{
    private int quantidadeLugares;
    private int pCavalos;

    public Carro(String modelo, int ano, String cor, boolean ligado, int numeroRodas, int quantidadeLugares, int pCavalos){
        super(modelo, ano, cor, ligado, numeroRodas);
        this.quantidadeLugares = quantidadeLugares;
        this.pCavalos = pCavalos;
    }
  
    
}
