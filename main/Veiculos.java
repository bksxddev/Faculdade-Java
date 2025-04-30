package main;


public class Veiculos {
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;

     public Veiculos(String modelo, int ano, String cor, boolean ligado){
         this.modelo = modelo;
         this.ano = ano;
         this.cor = cor;
         this.ligado = ligado;
     }
 

    
    //  metodos getters 
    public String getModelo() {
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public String getCor(){
        return this.cor;
    }
    
    //  metodos setters
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    //  metodos
    
    public boolean ligar(boolean ligado){
        if(ligado == false){
            System.out.println("O veiculo esta ligando!");
            return true;
        }else{
            System.out.println("O veiculo ja esta ligado!");
            return false;
        }
    }    
    public boolean desligar(boolean ligado){
        if(ligado == true){
            System.out.println("O veiculo esta desligando!");
            return true;
        }else{
            System.out.println("O veiculo ja esta desligado!");
            return false;
        }
    }   
}

    

