/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbinarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nico2
 */
public class NodoArbol {
     private String nombreNodo;
     private String idNombre;


    private List<NodoArbol> nodoHijo = new ArrayList<>();

    public NodoArbol(String nombreNodo){    
        this.nombreNodo = nombreNodo;
    }

    public String getNombre() {
        return nombreNodo;
    }

    public void addNodo(NodoArbol nodoPadre) {
        this.nodoHijo.add(nodoPadre);
    }
   
    public List<NodoArbol> getHijo() {
        return this.nodoHijo;
    }
}
