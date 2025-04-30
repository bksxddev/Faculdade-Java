package main;

public class Submarino extends VeiculosAquatico{
    private float profundidadeMaxima;

    public Submarino(String modelo, int ano, String cor, boolean ligado, float comprimento, float profundidadeMaxima){
        super(modelo, ano, cor, ligado, comprimento);
        this.profundidadeMaxima = profundidadeMaxima;
    }
    
    //metodos
    public void mergulhar(){

    }
    public void emergir(){

    }


}
