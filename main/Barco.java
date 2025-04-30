package main;

public class Barco extends VeiculosAquatico{
    private int potenciaMotores;
    private int capacidadePessoas;

    public Barco(String modelo, int ano, String cor, boolean ligado,float comprimento, int potenciaMotores, int capacidadePessoas){
        super(modelo, ano, cor, ligado, comprimento);
        this.potenciaMotores = potenciaMotores;
        this.capacidadePessoas = capacidadePessoas;
    }
}
