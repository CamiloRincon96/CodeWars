package NumerosPerfectos;

import java.util.ArrayList;

public class NumerosPerfectos {

    public static ArrayList numeroPerfecto(Integer n) {
        ArrayList<Integer> lista = new ArrayList<>();
        Integer contador = 1;

        while (lista.size() < n){
            Integer suma = 0;
        for (int i = 1; i < contador; i++) {
            if(contador%i == 0){
                suma +=i; }
            }
            if (contador == suma){
                lista.add(contador);
            }
            contador++;
        }
        return lista;
    }
}
