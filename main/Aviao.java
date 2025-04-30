package main;

public class Aviao extends VeiculosAereo{
    private float envergaduraAsa;
    private String tipoCombustivel;
    
    public Aviao(String modelo, int ano, String cor, boolean ligado, int numeroMotores, float envergaduraAsa, String tipoConbustivel){
        super(modelo, ano, cor, ligado,  numeroMotores);
        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivel = tipoConbustivel;
    }

    

    //  metodos 
    public void decolar(){

    }

    public void pousar(){
        
    }
}
