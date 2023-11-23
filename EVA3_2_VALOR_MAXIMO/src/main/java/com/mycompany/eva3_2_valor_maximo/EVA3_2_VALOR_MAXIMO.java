/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_valor_maximo;

/**
 *
 * @author Alex
 */
public class EVA3_2_VALOR_MAXIMO {

    public static void main(String[] args) {
        //llamada a funcion (invocar funcion)
        //utilizar el valor directamente de la funcion
        System.out.println(buscarMaximo(100,200));
        //guardar el valor y usarlo despues
        int resu = buscarMaximo(300, 500);
        System.out.println(resu);
        //llamar a la funcion e ignorar el resultado
        buscarMaximo(100, 200);
    }
    
    public static int buscarMaximo(int valor1, int valor2){
        
        /*if(valor1 > valor2)
            return valor1;
        else
            return valor2;*/
        
        int resultado;
            
        if(valor1 > valor2)
            resultado = valor1;
        else
            resultado = valor2;
        
        return resultado;
        
    }
}
