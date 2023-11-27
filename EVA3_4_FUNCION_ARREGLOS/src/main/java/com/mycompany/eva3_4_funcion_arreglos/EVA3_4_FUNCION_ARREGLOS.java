/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_funcion_arreglos;

/**
 *
 * @author Alex
 */
public class EVA3_4_FUNCION_ARREGLOS {

    public static void main(String[] args) {
        int[] arreglo;
        arreglo = crearArreglos(10);
        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");
        }
    }
    
    public static int[] crearArreglos(int tama){
        int[] arreglo = new int[tama];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100);
        }
        
        return arreglo;
    }
}
