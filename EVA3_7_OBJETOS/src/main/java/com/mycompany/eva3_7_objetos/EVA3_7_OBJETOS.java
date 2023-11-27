/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_objetos;

/**
 *
 * @author Alex
 */
public class EVA3_7_OBJETOS {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Paco";
        perso1.apellido = "Lopez";
        perso1.edad = 10;
        
        imprimirPersonas(perso1);
        
        Persona perso2 = new Persona();
        System.out.println(perso2);
        perso2.nombre = "Alejandro";
        perso2.apellido = "Murguia";
        perso2.edad = 18;
        
        imprimirPersonas(perso2);
    }
    
    public static void imprimirPersonas(Persona perso){
        System.out.println("Direccion: " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
    
}

//definen una plantilla para rear objetos
//crean un nuevo tipo de dato
class Persona{
    String nombre;
    String apellido;
    int edad;
}
