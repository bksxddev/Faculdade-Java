package main;
public class VeiculosAquatico extends Veiculos {
    private float comprimento;

    public VeiculosAquatico(String modelo, int ano, String cor, boolean ligado, float comprimento){
        super(modelo, ano, cor, ligado);
        this.comprimento = comprimento;
    }

}
