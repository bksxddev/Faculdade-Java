package main;

public class Main {
    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro("Fusca", 1975, "Azul", false, 4, 5, 60);
        Carro carro2 = new Carro("Mustang", 2022, "Vermelho", false, 4, 2, 450);
        
        Moto moto1 = new Moto("Yamaha R1", 2022, "Azul", false, 2, 299.0f, 180);
        Moto moto2 = new Moto("Honda PCX 150", 2021, "Branca", true, 2, 110.0f, 150);
       
        Aviao aviao1 = new Aviao("Boeing 737", 2018, "Branco", false, 2, 35.8f, "Querosene de aviação (Jet A-1)");// f para indicar que o numero e float 
        Aviao aviao2 = new Aviao("F-22 Raptor", 2020, "Cinza", true, 2, 13.6f, "JP-8");// f para indicar que o numero e float 

        Helicoptero heli1 = new Helicoptero("UH-60 Black Hawk", 2019, "Preto", true, 2, 4, 1200.0f);
        Helicoptero heli2 = new Helicoptero("Robinson R44", 2023, "Vermelho", false, 1, 2, 400.0f);

        Barco barco1 = new Barco("Pesqueiro", 2000, "Branco-Azul", false, 12.5f, 2000, 15); // f para indicar que o numero e float 
        Barco barco2 = new Barco("Porta-Avioes", 2005, "Cinza", false, 330, 20000000, 3000);
        
        Submarino submarino1 = new Submarino("Typhoon-class", 1985, "Cinza", false, 175.0f, 400.0f);
        Submarino submarino2 = new Submarino("Alvin", 2020, "Branco", false, 7.0f, 4500.0f);

    }
}
