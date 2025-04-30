import java.util.Scanner;

import main.VeiculosAereo;;
package main.funcoes;

public class Cadastrar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Qual o tipo de veiculo que voce deseja cadastrar: ");
            System.out.println("1. Veiculos Aereos");
            System.out.println("2. Veiculos Aquaticos");
            System.out.println("3. Veiculos Terrestres");
            int nEscolhaTipo = scanner.nextInt();

            if(nEscolhaTipo < 1 || nEscolhaTipo > 3) {
                System.out.println("Numero invalido!");
            }else{

                switch (veiculoModeloCadastro) {
                    case 1:
                    switch () {
                        case 1:
                        System.out.println("Digite qual tipo de veiculo deseja cadastrar: ");
                        System.out.println("1. Aviao");
                        System.out.println("2. Helicoptero");
                        numeroEscolha = scanner.nextInt();
                        
                        switch () {
                            case 1:
                            
                            break;
                            
                            default:
                            break;
                        }  
                        
                        default:
                        break;
                    }
                    
                    break;
                    
                    default:
                    break;
                }
            }    
        }
            
            
            
            
            

}
