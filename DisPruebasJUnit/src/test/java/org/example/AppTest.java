package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App api = new App();

    //Act 1 a)
    @Test
    public void testListaOrdenada() {
        List<Integer> ListaInte = new ArrayList<Integer>();
        ListaInte.add(3); ListaInte.add(9);
        ListaInte.add(1); ListaInte.add(4);
        List<Integer> ListaInteNoOrden = new ArrayList<Integer>();
        ListaInte.add(3); ListaInte.add(9);
        ListaInte.add(1); ListaInte.add(4);
        api.OrdenaListas(ListaInte);
        assertFalse(ListaInte==ListaInteNoOrden, "Porque antes y después de ordenar, la lista " +
                "no debe ser igual a cómo estaba antes.");

    }

    //Act 1 b)
    @Test
    public void testAgregaNumeros() {
        List<Integer> ListaInte = new ArrayList<Integer>();
        int numero1=584748;
        api.AgregaNumeros(ListaInte, numero1, 3, 110);
        assertTrue(ListaInte.contains(numero1) && ListaInte.contains(3) && ListaInte.contains(110),
                "La lista debe contener los nuevos números dados.");
    }

    //Act 1 c)
    @Test
    public void pruebaNumeroMaximo(){
        List<Integer> ListaInte = new ArrayList<Integer>();
        ListaInte.add(12); ListaInte.add(-7);
        ListaInte.add(192); ListaInte.add(26);
        int mayor = (int) api.NumeroMax(ListaInte);
        assertTrue(mayor==192, "Porque el número máximo de la lista debe ser ese.");
    }

    //Act 2:
    @Test
    public void testFusionListas(){
        List<Integer> Lista1 = new ArrayList<Integer>();
        List<Integer> Lista2 = new ArrayList<Integer>();
        Lista1.add(6); Lista1.add(2); Lista1.add(-20);
        Lista2.add(18); Lista2.add(6); Lista2.add(24);
        System.out.print(api.fusionListasOrdenadas(Lista1, Lista2));
    }

}
