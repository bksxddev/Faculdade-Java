package main;

public class Helicoptero extends VeiculosAereo{
    private int numeroHelices;
    private float capacidadeCarga;

    public Helicoptero(String modelo, int ano, String cor, boolean ligado, int numeroMotores, int numeroHelices, float capacidadeCarga){
        super(modelo, ano, cor, ligado, numeroMotores);
        this.numeroHelices = numeroHelices;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    //  metodos
    public void pairar(){

    }
    public void resgatarPessoas(){
        
    }
}
