package main.funcoes;
import main.*;
import java.util.Scanner;
import main.Main;

public class ExecutarAcoes {
    
    Scanner scanner = new Scanner(System.in);

    public static void executarAcoes() {
        // declarando variaveis
        int nVeiculoEscolhido = 0;
        int escolhaAereo = -1;
        int escolhaAquatico = -1;
        int escolhaTerrestre = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Em qual tipo de veiculo voce deseja executar uma acao: ");
        System.out.println("1. Veiculos Aereos");
        System.out.println("2. Veiculos Aquaticos");
        System.out.println("3. Veiculos Terrestres");
        int nEscolhaTipo = scanner.nextInt();

        switch (nEscolhaTipo) {
            case 1:
                System.out.println("Escolha o modelo do veiculo aereo que voce deseja executar uma acao: ");
                System.out.println("1. Aviao");
                System.out.println("2. Helicoptero");
                escolhaAereo = scanner.nextInt();
                break;

            case 2:
                System.out.println("Escolha o modelo do veiculo aquatico que voce deseja executar uma acao: ");
                System.out.println("1. Barco");
                System.out.println("2. Submarino");
                escolhaAquatico = scanner.nextInt();
                break;

            case 3:
                System.out.println("Escolha o modelo do veiculo terrestre que voce deseja executar uma acao: ");
                System.out.println("1. Moto");
                System.out.println("2. Carro");
                escolhaTerrestre = scanner.nextInt();
                break;

            default:
                System.out.println("O numero digitado nao corresponde a nenhuma opcao!");
                break;
        }

        // switch veiculos aéreos
        switch (escolhaAereo) {
            case 1:
                System.out.println("Escolha que funcao voce deseja realizar no aviao: ");
                System.out.println("1. " + Main.aviao1.getModelo());
                System.out.println("2. " + Main.aviao2.getModelo());
                nVeiculoEscolhido = scanner.nextInt();
                break;
            case 2:
                System.out.println("Escolha que funcao voce deseja realizar no helicoptero: ");
                System.out.println("1. " + Main.heli1.getModelo());
                System.out.println("2. " + Main.heli2.getModelo());
                nVeiculoEscolhido = scanner.nextInt();
                break;
        }

        // switch veiculos aquáticos
        switch (escolhaAquatico) {
            case 1:
                System.out.println("Escolha que funcao voce deseja realizar no barco: ");
                System.out.println("1. " + Main.barco1.getModelo());
                System.out.println("2. " + Main.barco2.getModelo());
                nVeiculoEscolhido = scanner.nextInt();
                break;
            case 2:
                System.out.println("Escolha que funcao voce deseja realizar no submarino: ");
                System.out.println("1. " + Main.submarino1.getModelo());
                System.out.println("2. " + Main.submarino2.getModelo());
                nVeiculoEscolhido = scanner.nextInt();
                break;
        }

        // switch veiculos terrestres
        switch (escolhaTerrestre) {
            case 1:
                System.out.println("Escolha que funcao voce deseja realizar na moto: ");
                System.out.println("1. " + Main.moto1.getModelo());
                System.out.println("2. " + Main.moto2.getModelo());
                nVeiculoEscolhido = scanner.nextInt();
                break;
            case 2:
                System.out.println("Escolha que funcao voce deseja realizar no carro: ");
                System.out.println("1. " + Main.carro1.getModelo());
                System.out.println("2. " + Main.carro2.getModelo());
                nVeiculoEscolhido = scanner.nextInt();
                break;
        }
    }
}
