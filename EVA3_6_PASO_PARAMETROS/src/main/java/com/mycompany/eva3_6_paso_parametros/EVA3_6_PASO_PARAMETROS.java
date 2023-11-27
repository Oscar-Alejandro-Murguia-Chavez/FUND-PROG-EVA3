/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_paso_parametros;

/**
 *
 * @author Alex
 */
public class EVA3_6_PASO_PARAMETROS {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("El valor de x en el main() es de " + x);
        pasoPorValor(x);
        System.out.println("El valor de x en el main() despues de la llamada es de " + x);
    }
    
    //EN EL PASO POR VALOR DE ARGUMENTOS, SE ENVIA UNA COPIA AL MÉTODO
    public static void pasoPorValor(int valor){
        System.out.println("El valor que recibo en el metodo es de " + valor);
        valor++;
        System.out.println("El valor modificado en el metodo es de " + valor);
    }
}
