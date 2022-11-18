/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesbinarios;

import java.util.Scanner;

/**
 *
 * @author nico2
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbolNario = new ArbolBinario();
        Scanner scannerInput = new Scanner(System.in);
        int opcionSwitch = 0;

        arbolNario.insertarNodo("1", null);
        arbolNario.insertarNodo("2", "1");
        arbolNario.insertarNodo("21", "1");
        arbolNario.insertarNodo("3", "2");
        arbolNario.insertarNodo("4", "2");
        arbolNario.insertarNodo("5", "3");
        arbolNario.insertarNodo("6", "3");
        arbolNario.insertarNodo("11", "4");
        arbolNario.insertarNodo("12", "4");
        arbolNario.insertarNodo("7", "5");
        arbolNario.insertarNodo("8", "5");
        arbolNario.insertarNodo("9", "6");
        arbolNario.insertarNodo("10", "6");
        arbolNario.insertarNodo("13", "11");
        arbolNario.insertarNodo("14", "11");
        arbolNario.insertarNodo("15", "12");
        arbolNario.insertarNodo("16", "12");
        arbolNario.insertarNodo("20", "21");
        arbolNario.insertarNodo("19", "20");
        arbolNario.insertarNodo("24", "20");
        arbolNario.insertarNodo("17", "19");
        arbolNario.insertarNodo("18", "19");
        arbolNario.insertarNodo("25", "21");
        arbolNario.insertarNodo("26", "25");
        arbolNario.insertarNodo("31", "25");
        arbolNario.insertarNodo("22", "24");
        arbolNario.insertarNodo("23", "24");
        arbolNario.insertarNodo("27", "26");
        arbolNario.insertarNodo("28", "26");
        arbolNario.insertarNodo("29", "31");
        arbolNario.insertarNodo("30", "31");

        do {
            try {

                System.out.println("1. Preorden\n2. Postorden \n3. Inorden \n4. Salir");
                opcionSwitch = scannerInput.nextInt();

                switch (opcionSwitch) {
                    case 1:
                        System.out.println("------------------------");
                        System.out.println("Ordenamiento Preorden");
                        arbolNario.preOrden(arbolNario.getRaiz());
                        System.out.println("\n------------------------");
                        break;
                    case 2:
                        System.out.println("------------------------");
                        System.out.println("Ordenamiento Postorden");
                        arbolNario.posOrden(arbolNario.getRaiz());
                        System.out.println("\n------------------------");
                        break;
                    case 3:
                        System.out.println("------------------------");
                        System.out.println("Ordenamiento Inorden");
                        arbolNario.inOrden(arbolNario.getRaiz());
                        System.out.println("\n------------------------");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        } while (opcionSwitch != 4);

    }

}
