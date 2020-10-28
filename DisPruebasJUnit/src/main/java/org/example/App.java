package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class App {
    
/*Act 1:
    Escribe todas las pruebas que consideres conveniente para verificar los
    siguientes métodos de java.util.Collections:
        -Comprueba que Collections::sort ordena correctamente un objeto de tipo List<Integer>
        -Compruebe que Collections:addAll añade todos los números indicados a un objeto de tipo List<Integer>
        -Compruebe que el método Collections::max devuelve el mayor valor de una lista de enteros.*/

    public List OrdenaListas(List Lista) {
        Collections.sort(Lista);
        return Lista;
    }

    public List AgregaNumeros(List Lista, Integer num1, Integer num2, Integer num3){
            Collections.addAll(Lista, num1, num2, num3);
            return Lista;
    }

    public Comparable NumeroMax(List Lista){
        return Collections.max(Lista);
    }

/*Act 2:
    Escribe un conjunto de pruebas para verificar el comportamiento de un método que recibe
    como parámetro dos conjuntos ordenados (o dos listas o dos arrays ordenadas de menor a mayor)
    y devuelve un nuevo conjunto ordenado que contenga los elementos de ambos conjuntos.

    ¿Cómo podríamos saber el número de elementos comunes que había en ambos conjuntos de entrada?
*/

   public List<Integer> fusionListasOrdenadas(List Lista1, List Lista2){
       Collections.sort(Lista1); Collections.sort(Lista2); //Para que se ordenen dentro por si no lo están al entrar
       List<Integer> ListaConRepetidos = new ArrayList<Integer>();
       ListaConRepetidos.addAll(Lista1); ListaConRepetidos.addAll(Lista2);
       List<Integer> ListaSinRepetidos = new ArrayList<Integer>(new HashSet<Integer>(ListaConRepetidos));
       int repetidos=(ListaConRepetidos.size()-ListaSinRepetidos.size()); //La diferencia del tamaño de los arrays
       System.out.print("Había " + repetidos + " números repetidos.\n"); //Es lo que nos dá los números repetidos
       return ListaSinRepetidos;
    }

}
