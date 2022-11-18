/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbinarios;

/**
 *
 * @author nico2
 */
public class ArbolBinario {

    private NodoArbol raizNodo;

    public ArbolBinario() {
        this.raizNodo = null;
    }

    public NodoArbol getRaiz() {
        return this.raizNodo;
    }

    NodoArbol nodoResuelto = null;

    public NodoArbol nodoRecursivo(String nodoPadre) {
        nodoResuelto = null;
        return nodoRecursivo(raizNodo, nodoPadre);
    }

    public NodoArbol nodoRecursivo(NodoArbol nodo, String nodoPadre) {
        if (nodo == null) {
            nodoResuelto = null;
        }
        //System.out.println("Nodo: "+nodo.getNombre()+ " Nodo Padre: "+nodoPadre);
        if (nodoPadre == nodo.getNombre()) {
            nodoResuelto = nodo;
        }
        for (NodoArbol nodoHijo : nodo.getHijo()) {
            if (nodoResuelto != null) {
                break;
            } else {
                nodoRecursivo(nodoHijo, nodoPadre);
            }
        }
        return nodoResuelto;
    }

    public void insertarNodo(String nombreNodo, String nodoPadre) {
        if (getRaiz() == null) {
            //System.out.println("Insertando raiz");
            this.raizNodo = new NodoArbol(nombreNodo);
        } else {
            NodoArbol nodoPadreRaiz = nodoRecursivo(nodoPadre);
            //System.out.println("Nodo Padre: "+ nodoPadreRaiz.getNombre());
            if (nodoPadreRaiz != null) {
                nodoPadreRaiz.addNodo(new NodoArbol(nombreNodo));
            } else {
                raizNodo.getHijo().add(new NodoArbol(nombreNodo));
            }
        }
    }

    public void preOrden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        System.out.print(nodo.getNombre() + ", ");
        for (NodoArbol nodoTemporal : nodo.getHijo()) {
            preOrden(nodoTemporal);
        }
    }

    public void posOrden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }

        for (NodoArbol nodoTemporal : nodo.getHijo()) {
            posOrden(nodoTemporal);
        }
        System.out.print(nodo.getNombre() + ", ");
    }

    public void inOrden(NodoArbol nodo) {
        if(nodo.getHijo().size() == 0){
             System.out.print(nodo.getNombre() + ", ");
        }else{
            inOrden(nodo.getHijo().get(0));
             System.out.print(nodo.getNombre() + ", ");
             for(int i = 1; i < nodo.getHijo().size(); i++){
                 inOrden(nodo.getHijo().get(i));
             }
        }
    }

}
