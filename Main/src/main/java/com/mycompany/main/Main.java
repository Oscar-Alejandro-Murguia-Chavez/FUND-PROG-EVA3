/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Alex
 */
public class Main {
    
    
    public static void main(String[] args) {
        //llamada a funcion o procedimiento
        imprimirMensaje("Hola mundo!!",5);
    }
    
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) {
            System.out.println(mensaje);
        }
        
    }
}