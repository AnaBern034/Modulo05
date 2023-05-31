package EX;

import java.util.HashMap;
import java.util.Map;

public  class Dicionário {
    public static void main(String[] args) {
        Map<String,String> bolas = new HashMap<>();
        bolas.put("bola1","amarela");
        bolas.put("bola2","azul");
        bolas.put("bola3","verde");
        bolas.put("bola4","roxo");
        bolas.put("bola5","preto");

        for (Map.Entry<String,String> entry: bolas.entrySet()) {
            System.out.println("Cores da bola: "+entry.getValue());
        }

        Map<String,String> boneca = new HashMap<>();
        boneca.put("Cabelo1","Crespo");
        boneca.put("Cabelo2","Cacheado");
        boneca.put("Cabelo3","Ondulado");
        boneca.put("Cabelo4","Liso");

        System.out.println("===============");
        for (Map.Entry<String,String> entry: boneca.entrySet()) {
            System.out.println("Tipo de cabelo da boneca: "+entry.getValue());
        }

        Map<String,String> dado = new HashMap<>();
        dado.put("1","6 LADOS");
        dado.put("2","12 LADOS");
        dado.put("3","18 LADOS");
        dado.put("4","24 LADOS");


        System.out.println("===============");
        for (Map.Entry<String,String> entry: dado.entrySet()) {
            System.out.println("Quantidade de lados do dado: "+entry.getValue());
        }



    }






    
}

