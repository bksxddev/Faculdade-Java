package main.funcoes;
import java.util.Scanner;

public class CadastrarVeiculos {
    
    
        public static void cadastrar(){
            Scanner scanner = new Scanner(System.in);
                

            System.out.println("Qual o tipo de veiculo que voce deseja cadastrar: ");
            System.out.println("1. Veiculos Aereos");
            System.out.println("2. Veiculos Aquaticos");
            System.out.println("3. Veiculos Terrestres");
            int nEscolhaTipo = scanner.nextInt();
                
            switch (nEscolhaTipo){
                    
            // case 1 diz respoeito aos atributos dos veiculos aereos
                
                case 1:
                System.out.println("Escolha o modelo do veiculo aereo que voce deseja cadastrar: ");   // tring modelo, int ano, String cor, boolean ligado, int numeroMotores, float envergaduraAsa, String tipoConbustivel
                System.out.println("1. Aviao");
                System.out.println("2. Helicoptero");
                int escolhaAereo = scanner.nextInt();
                    
                    switch (escolhaAereo) {
                        case 1:
                        System.out.println("Digite o modelo do aviao: ");
                        
                        case 2:
                        System.out.println("Digite o modelo do helicoptero;");    
                        
                        default:
                        System.out.println("O numero digitado nao corresponde a nenhuma opcao!");
                        break;
                    }
                    
                // case 2 diz respeito aos atributos dos veiculos aquaticos
                break;
                case 2:
                System.out.println("Escolha o modelo do veiculo aquatico que voce deseja cadastrar: ");
                System.out.println("1. Barco");
                System.out.println("2. Submarino");
                int escolhaAquatico = scanner.nextInt();
                    
                    switch (escolhaAquatico) {
                        case 1:
                        System.out.println("Digite o modelo do barco: ");
                        
                        case 2:
                        System.out.println("Digite o modelo do Submarino: ");    
                        
                        default:
                        System.out.println("O numero digitado nao corresponde a nenhuma opcao!");
                        break;
                    }
                    
                // case 3 diz respeito aos atributos dos veiculos terrestres
                break;
                case 3:
                System.out.println("Escolha o modelo do veiculo terrestre que voce deseja cadastrar: ");
                System.out.println("1. Moto");
                System.out.println("2.Carro");
                int escolhaTerrestre = scanner.nextInt();
                    
                    switch (escolhaTerrestre) {
                        case 1:
                        System.out.println("Digite o modelo da moto: ");
                        
                        case 2:
                        System.out.println("Digite o modelo do carro: ");    
                    
                        default:
                        System.out.println("O numero digitado nao corresponde a nenhuma opcao!");
                        break;
                    }
                default:
                System.out.println("O numero digitado nao corresponde a nenhuma opcao!");
                break;
                }
            }
        }
        