package main.funcoes;
import java.util.Scanner;
import main.*;

public class Menu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean repetir;
     
 

            System.out.println("Menu de opcoes: ");
            System.out.println("1. Cadastrar novo veiculo");
            System.out.println("2. Listar todos os veiculos");
            System.out.println("3. Executar acao");
            int numeroEscolha = scanner.nextInt();
            
            if(numeroEscolha < 1 || numeroEscolha >3){
                System.out.println("Numero invalido!");
                repetir = false;
            }else{
                repetir = true;
            }
    }
}
