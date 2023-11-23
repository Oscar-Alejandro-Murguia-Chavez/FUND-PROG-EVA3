/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_factorial;

/**
 *
 * @author Alex
 */
public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Factorial de 5 = " + calcularFactorial(valor));
        //CREAR MÉTODO calcularPotencia
        int base = 3;
        int potencia = 2;
        System.out.println(calcularPotencia(base, potencia));
    }
    
    public static int calcularFactorial(int valor){
        int guardar = 1;
        
        for (int i = 1; i <= valor; i++) {
            guardar *= i; //guardar = guardar * i
        }
        
        return guardar;
    }
    
    public static int calcularPotencia(int base,int potencia ){
        int resultado = 1;
        
        for (int i = 1; i <= potencia; i++) {
            resultado *= base;
        }
        
        return resultado;
    }
}
