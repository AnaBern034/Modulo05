package EX;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercicios {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        System.out.println(lista);
        System.out.println("----------------");

        Set<Integer> listaNova = new HashSet<>();
        listaNova.add(1);
        listaNova.add(5);
        listaNova.add(5);
        listaNova.add(6);
        listaNova.add(7);
        listaNova.add(8);
        listaNova.add(8);
        listaNova.add(8);

        System.out.println(listaNova);
    } // a lista como pede no exercicio anterior ela exibe todos os numero que foram insentados
    //enquanto isso no junto que usamos o hashSet exibe-se todos os numeros porém aqueles que
    // são iguais é anulado
}
