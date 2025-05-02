package main;

import main.funcoes.CadastrarVeiculos;

public class  Main {
    public static void main(String[] args) throws Exception { 
    }
        
        public static Carro carro1 = new Carro("Fusca", 1975, "Azul", false, 4, 5, 60);
        public static Carro carro2 = new Carro("Mustang", 2022, "Vermelho", false, 4, 2, 450);
        
        public static Moto moto1 = new Moto("Yamaha R1", 2022, "Azul", false, 2, 299.0f, 180);
        public static Moto moto2 = new Moto("Honda PCX 150", 2021, "Branca", true, 2, 110.0f, 150);
        
        public static Aviao aviao1 = new Aviao("Boeing 737", 2018, "Branco", false, 2, 35.8f, "Querosene de aviação (Jet A-1)");// f para indicar que o numero e float 
        public static Aviao aviao2 = new Aviao("F-22 Raptor", 2020, "Cinza", true, 2, 13.6f, "JP-8");// f para indicar que o numero e float 
        
        public static Helicoptero heli1 = new Helicoptero("UH-60 Black Hawk", 2019, "Preto", true, 2, 4, 1200.0f);
        public static Helicoptero heli2 = new Helicoptero("Robinson R44", 2023, "Vermelho", false, 1, 2, 400.0f);
        
        public static Barco barco1 = new Barco("Pesqueiro", 2000, "Branco-Azul", false, 12.5f, 2000, 15); // f para indicar que o numero e float 
        public static Barco barco2 = new Barco("Porta-Avioes", 2005, "Cinza", false, 330, 20000000, 3000);
        
        public static Submarino submarino1 = new Submarino("Typhoon-class", 1985, "Cinza", false, 175.0f, 400.0f);
        public static Submarino submarino2 = new Submarino("Alvin", 2020, "Branco", false, 7.0f, 4500.0f);
    }
    