/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_tuttifrutti;

import java.util.*;

/**
 *
 * @author Alex
 */
public class EVA3_8_TUTTIFRUTTI {

    final static String USUARIO = "tutti";
    final static String PASSWORD = "frutti";
    
    public static void main(String[] args) {
        String usu = "";
        String pwd = "";
        do{
            //preguntar usuario y contraseña
            usu = capturarDatos("Usuario: ");
            pwd = capturarDatos("Contraseña: ");
            System.out.println();
            
        }while(!validarUsuario(usu, pwd));
        
        System.out.println("BIENVENIDO AL SISTEMA!!");
    }
    
    public static boolean validarUsuario(String usuario, String password){
        if((usuario.equals(USUARIO)) && (password.equals(PASSWORD)))
            return true;
        else
            return false;
    }
    
    public static String capturarDatos(String mensaje){
        Scanner input = new Scanner(System.in);
        
        System.out.println(mensaje);
        return input.nextLine();
    }
}
