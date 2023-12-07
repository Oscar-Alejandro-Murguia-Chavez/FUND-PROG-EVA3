/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

import java.util.*;

/**
 *
 * @author alexl
 */
public class PROYECTO {

    public static void main(String[] args) {            
        Scanner input = new Scanner(System.in);
        int x = 0;
        
        do{
            System.out.println("-----------------------------------------");
            System.out.println("Que quieres hacer?");
            System.out.println("1> Sistema de conversion de unidades");
            System.out.println("2> Calculadora hexadecimal");
            System.out.println("3> Calculadora binaria");
            System.out.println("4> Calculadora octal");  
            System.out.println("5> Matrices");
            System.out.println("6> Cerrar");
            System.out.println("-----------------------------------------");
            System.out.println(">");
            x = input.nextInt();
            
            switch (x){
                case 1:
                    sisConversiones();
                    
                    break;
                case 2:
                    calculadoraHex();
                    
                    break;
                case 3:
                    calculadoraBinaria();
                    
                    break;
                case 4:
                    calculadoraOctal();
                    break;
                case 5:
                    calculadoraMatrices();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Numero invalido, introduzca un umero valido");
            }
            
            x = 1;
        }while(x==1);
                  
    }
    
    
    //----------------CALCULADORA DE MATRICES----------------------
    public static void calculadoraMatrices(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        int[][] matriz;
        String[][] matrizV;
        int tama = 0;
        int resultado = 0;
        
        do{
            
            System.out.println("-----------------------------------------");
            System.out.println("¿Que tipo de matriz quiere usar?");
            System.out.println("2> 2x2");
            System.out.println("3> 3x3");
            tama = input.nextInt();
            
            switch(tama){
                case 2:
                    matrizV = llenarMatrizVisual(tama);
                    matriz = new int[tama][tama];
            
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                    
                            for (int k = 0; k < matrizV.length; k++) {
                                for (int I = 0; I < matrizV[i].length; I++) {
                                    System.out.print(matrizV[i][j]);
                                }
                                System.out.println("");
                            }
                            System.out.println("Introduzca el siguiente digito de la matriz");
                            matriz[i][j] = input.nextInt();
                        }
                    }                 
            
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print("[" + matriz[i][j] + "]");
                        }
                        System.out.println("");
                    }
            
                    resultado = calcularDeterminante(matriz);
            
                    System.out.println("-----------------------------------------------");
                    System.out.println("El Determinante de la matriz es: " + resultado + " <---");
                    System.out.println("-----------------------------------------------");
                    
                    break;
                case 3:
                    matrizV = llenarMatrizVisual(tama);
                    matriz = new int[tama][tama];
            
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                    
                            for (int k = 0; k < matrizV.length; k++) {
                                for (int I = 0; I < matrizV[i].length; I++) {
                                    System.out.print(matrizV[i][j]);
                                }
                                System.out.println("");
                            }
                            System.out.println("Introduzca el siguiente digito de la matriz");
                            matriz[i][j] = input.nextInt();
                        }
                    }                 
                    
                    System.out.println("-----------------------------------------------");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print("[" + matriz[i][j] + "]");
                        }
                        System.out.println("");
                    }
            
                    resultado = calcularDeterminante(matriz);
                    
                    System.out.println("-----------------------------------------------");
                    System.out.println("El Determinante de la matriz es: " + resultado + " <---");
                    System.out.println("-----------------------------------------------");
                    break;
                default:
                    System.out.println("Numero invalido, introduce un numero valido");
            }
    
            
            System.out.println("-----------------------------------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1> repetir");
            System.out.println("2> Volver al menu de inicio");
            System.out.println("3> terminar el programa");
            x = input.nextInt();
            
            if(x==3)
                System.exit(0);
        }while(x == 1);
    }
    
    public static String[][] llenarMatrizVisual(int tama){
        String[][] lleno = new String [tama][tama];
        
        for (int i = 0; i < lleno.length; i++) {
            for (int j = 0; j < lleno[i].length; j++) {
                lleno[i][j] = "  *";
            }
        }
        
        return lleno;
    }
    public static int calcularDeterminante(int matriz[][]){
        int[][] matrizC = matriz;
        int resu = 0;
        
        if(matriz.length == 2){
            int parteSuma = matrizC[0][0]*matrizC[1][1];
            int parteResta = matrizC[0][1]*matrizC[1][0];
            resu = parteSuma - parteResta;
        
            return resu;
        }else if(matriz.length == 3){
            int parteSuma = (matrizC[0][0]*matrizC[1][1]*matrizC[2][2]) + (matrizC[1][0]*matrizC[2][1]*matrizC[0][2]) + (matrizC[2][0]*matrizC[0][1]*matrizC[1][2]);
            int parteResta = (matrizC[0][2]*matrizC[1][1]*matrizC[2][0]) + (matrizC[1][2]*matrizC[2][1]*matrizC[0][0]) + (matrizC[2][2]*matrizC[0][1]*matrizC[1][0]);
            resu = parteSuma - parteResta;
        
            return resu;
        }
        
        return resu;
    }
    
    //-----------------CALCULADORA OCTAL---------------------------
    //menu principal de la calculadora octal
    public static void calculadoraOctal(){
        Scanner java = new Scanner(System.in); 
        int x = 0;
        
        do{
        System.out.println("--------------------- CALCULADORA OCTAL --------------------");
        System.out.println("¿Que desea hacer?");
        System.out.println("1> Convertir de numero decimal a octal");
        System.out.println("2> Convertir de numero octal a decimal");
        System.out.println("3> Volver");
        x = java.nextInt();
        
        if (x == 3) {
                System.out.println("---------------Saliendo de la calculadora--------------");
                break;
            }
        
            switch(x){
                case 1:
                // Conversión de Decimal a Octal
                System.out.print("Ingrese un número decimal: ");
                int decimalNumber = java.nextInt();
                String octal = decimaloctal(decimalNumber);
                break;
                case 2:
                // Conversión de Octal a Decimal
                System.out.print("Ingrese un número octal: ");
                String octalInput = java.next();
                int decimalR = octaldecimal(octalInput);
                break;
            }
            System.out.println("-----------------------------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1> Volver a convertir un numero");
            System.out.println("2> Volver al menu de inicio");
            System.out.println("3> terminar el programa");
            x = java.nextInt();
            
            if(x==3)
                System.exit(0);
        }while(x == 1);     
    }
    //convertir de decimal a octal
    private static String decimaloctal(int decimal) {
        StringBuilder pasos = new StringBuilder("Procedimiento Decimal a Octal:\n");
        int convertir = decimal;
        int restos;
        StringBuilder resultado_octal = new StringBuilder();

        while (convertir != 0) {
            restos = convertir % 8;
            convertir = convertir / 8;
            pasos.append(convertir).append(" * 8 + ").append(restos).append(" = ").append(convertir * 8 + restos).append("\n");
            resultado_octal.insert(0, restos);
        }

        pasos.append("numero decimal a octal es: ").append(resultado_octal);
        System.out.println(pasos.toString());
        return resultado_octal.toString();
    }
    //convertir de octal a decimal
    private static int octaldecimal(String octaldecimal) {
        StringBuilder pasos = new StringBuilder("Procedimiento Octal a Decimal:\n");
        int recultado_decimal = 0;

        for (int i = octaldecimal.length() - 1, j = 0; i >= 0; i--, j++) {
            int digit = Character.getNumericValue(octaldecimal.charAt(i));
            int poder_octal = (int) Math.pow(8, j);
            int producto = digit * poder_octal;
            pasos.append(digit).append(" * 8^").append(j).append(" = ").append(producto).append("\n");
            recultado_decimal += producto;
        }
        //estoy cansado jefe :´V
        pasos.append("Número decimal: ").append(recultado_decimal);
        System.out.println(pasos.toString());
        return recultado_decimal;
    }
    
    //----------------CALCULADORA HEXADECIMAL---------------------------
    //Menu principal de la calculadora hexadecimal
    public static void calculadoraHex(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        
        do{
            System.out.println("-----------------------------------------");
            System.out.println("Que quieres hacer?");
            System.out.println("1> Convertir hexadecimal a decimal");
            System.out.println("2> Convertir decimal a hexadecimal");
            System.out.println("3> Volver");
            System.out.println("-----------------------------------------");
            x = input.nextInt();
            
            if (x == 3) {
                System.out.println("---------------Saliendo de la calculadora--------------");
                break;
            }
            
            switch (x){
                case 1:
                    hexadecimalDeci();
                    break;
                case 2:
                    decimalHex();
                    break;
            }
            
            System.out.println("-----------------------------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1> Volver a convertir un numero");
            System.out.println("2> Volver al menu de inicio");
            System.out.println("3> terminar el programa");
            x = input.nextInt();
            
            if(x==3)
            System.exit(0);
            
        }while(x == 1);
    }
    //convertir numero decimal a hexadecimal
    public static void decimalHex(){
        Scanner input = new Scanner(System.in);
        int residuo;
        int div;
        int num;
        String hexadecimal = "";
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduzca el numero que sea quiere convertir a hexadecimal");
        num = input.nextInt();
        
        div = num ;
        
        
        while(div != 0){
            
            residuo = div % 16;
            
            switch(residuo){
                case 1:
                    hexadecimal = "1" + hexadecimal;
                    break;
                case 2:
                    hexadecimal = "2" + hexadecimal;
                    break;
                case 3:
                    hexadecimal = "3" + hexadecimal;
                    break;
                case 4:
                    hexadecimal = "4" + hexadecimal;
                    break;
                case 5:
                    hexadecimal = "5" + hexadecimal;
                    break;
                case 6:
                    hexadecimal = "6" + hexadecimal;
                    break;
                case 7:
                    hexadecimal = "7" + hexadecimal;
                    break;
                case 8:
                    hexadecimal = "8" + hexadecimal;
                    break;
                case 9:
                    hexadecimal = "9" + hexadecimal;
                    break;
                case 10:
                    hexadecimal = "A" + hexadecimal;
                    break;
                case 11:
                    hexadecimal = "B" + hexadecimal;
                    break;
                case 12:
                    hexadecimal = "C" + hexadecimal;
                    break;
                case 13:
                    hexadecimal = "D" + hexadecimal;
                    break;
                case 14:
                    hexadecimal = "E" + hexadecimal;
                    break;
                case 15:
                    hexadecimal = "F" + hexadecimal;
                    break;
                default:
                    System.out.println("varignon");
            }
            
            div /= 16;
            
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion a hexadecimal seria: " + hexadecimal + " <---");
        System.out.println("-----------------------------------------");
    }
    //convertir numero hexadecimal a decimal
    public static void hexadecimalDeci(){
        Scanner input = new Scanner(System.in);
        int hexI = 0;
        String numHex;
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Introduce un numero hexadecimal para convertir a decimal");       
        numHex = input.nextLine();
        
        for (int i = 0; i < numHex.length(); i++) {
            
            switch (numHex.charAt((numHex.length() - 1) - i)){
                case 49:
                hexI += 1*((int)Math.pow(16, i));
                break;
                case 50:
                hexI += 2*((int)Math.pow(16, i));
                break;
                case 51:
                hexI += 3*((int)Math.pow(16, i));
                break;
                case 52:
                hexI += 4*((int)Math.pow(16, i));
                break;
                case 53:
                hexI += 5*((int)Math.pow(16, i));
                break;
                case 54:
                hexI += 6*((int)Math.pow(16, i));
                break;
                case 55:
                hexI += 7*((int)Math.pow(16, i));
                break;
                case 56:
                hexI += 8*((int)Math.pow(16, i));
                break;
                case 57:
                hexI += 9*((int)Math.pow(16, i));
                break;
                case 65:
                hexI += 10*((int)Math.pow(16, i));
                break;
                case 66:
                hexI += 11*((int)Math.pow(16, i));
                break;
                case 67:
                hexI += 12*((int)Math.pow(16, i));
                break;
                case 68:
                hexI += 13*((int)Math.pow(16, i));
                break;
                case 69:
                hexI += 14*((int)Math.pow(16, i));
                break;
                case 70:
                hexI += 15*((int)Math.pow(16, i));
                break;

            }
            
            
        }
        System.out.println("-----------------------------------------");
        System.out.println("Su conversion a decimal es: " + hexI + " <---");
        System.out.println("-----------------------------------------");
    }
    
    
    //--------------------CALCULADORA BINARIA---------------------------
    //menu principal de la calculadora binaria
    public static void calculadoraBinaria(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------CALCULADORA BINARIA--------------");
            System.out.println("1> Sumar");
            System.out.println("2> Restar");
            System.out.println("3> Multiplicar");
            System.out.println("4> Dividir");
            System.out.println("5> Convertidor de número Decimal a Binario");
            System.out.println("6> Convertidor de número Binario a Decimal");
            System.out.println("7> Volver");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("---------------Saliendo de la calculadora--------------");
                break;
            }

            if (opcion == 5) {
                System.out.print("Ingrese el primer número decimal: ");
                int decimal = scanner.nextInt();
                System.out.print("Ingrese el segundo número decimal: ");
                int decimal2 = scanner.nextInt();
                if (!verificarNumero(decimal) || !verificarNumero(decimal2)) {
                    System.out.print("ERROR: Tiene que ser un número entero positivo. ");
                    return;
                }

                String binario = Integer.toBinaryString(decimal);
                String binario2 = Integer.toBinaryString(decimal2);
                System.out.println("-----------------------------------------");
                System.out.println("Resultado del primer numero binario: " + binario + " <---");
                System.out.println("Resultado del segundo numero en binario: " + binario2 + " <---");
                System.out.println("-----------------------------------------");
                break;
            }
            
            if(opcion==6){
             System.out.println("Ingresa un número binario: ");
             String numeroBinario = scanner.next();
             if (!verificarBinario(numeroBinario)){
                System.out.println("Por favor, ingrese SOLO números binarios válidos.");
                return;
             }
                else{
                      int numeroDecimal = convertirBinarioADecimal(numeroBinario);
                      System.out.println("-----------------------------------------");
                      System.out.println("El número decimal equivalente es: " + numeroDecimal + " <---");
                      System.out.println("-----------------------------------------");
                      return;
            }
            }
            
           
            System.out.println("");
            System.out.print("Ingrese el primer número binario: ");
            String numero1 = scanner.next();
            System.out.print("Ingrese el segundo número binario: ");
            String numero2 = scanner.next();
            
           if (!verificarBinario(numero1) || !verificarBinario(numero2)) {
                System.out.println("Por favor, ingrese SOLO números binarios válidos.");
                return;
            }

            switch (opcion) {
                case 1:
                    String suma = sumarBinarios(numero1, numero2);
                    System.out.println("");
                    System.out.println("Resultado: " + suma);
                    System.out.println("");

                    break;
                case 2:
                    String resta = restarBinarios(numero1, numero2);
                    System.out.println("");
                    System.out.println("Resultado: " + resta);
                    System.out.println("");
                    break;
                case 3:
                    String multiplicacion = multiplicarBinarios(numero1, numero2);
                    System.out.println("");
                    System.out.println("Resultado: " + multiplicacion);
                    System.out.println("");
                    break;
                case 4:
                    String division = dividirBinarios(numero1, numero2);
                    System.out.println("");
                    System.out.println("Resultado: " + division);
                    System.out.println("");
                    break;
                default:
                    while(true){
                    System.out.println("");
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    System.out.println("");
                    break;
                    }
            }
        }
    }
    //  Suma  
    public static String sumarBinarios(String bin1, String bin2) {
        int maxLength = Math.max(bin1.length(), bin2.length());
        bin1 = padLeft(bin1, maxLength);
        bin2 = padLeft(bin2, maxLength);

        StringBuilder resultado = new StringBuilder();
        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int bit1 = Character.getNumericValue(bin1.charAt(i));
            int bit2 = Character.getNumericValue(bin2.charAt(i));

            int suma = bit1 + bit2 + carry;
            resultado.insert(0, suma % 2);
            carry = suma / 2;
        }

        if (carry > 0) {
            resultado.insert(0, carry);
        }

        return resultado.toString();
    }
    // Resta 
    public static String restarBinarios(String bin1, String bin2) {
        int maxLength = Math.max(bin1.length(), bin2.length());
        bin1 = padLeft(bin1, maxLength);
        bin2 = padLeft(bin2, maxLength);

        StringBuilder resultado = new StringBuilder();
        int borrow = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int bit1 = Character.getNumericValue(bin1.charAt(i));
            int bit2 = Character.getNumericValue(bin2.charAt(i));

            int resta = bit1 - bit2 - borrow;
            if (resta < 0) {
                resta += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            resultado.insert(0, resta);
        }

        return resultado.toString();
    }
    // Multiplicación  
    public static String multiplicarBinarios(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) * Integer.parseInt(bin2, 2));
    }
    //Dividición 
    public static String dividirBinarios(String bin1, String bin2) {
        int numero1 = Integer.parseInt(bin1, 2);
        int numero2 = Integer.parseInt(bin2, 2);

        if (numero2 == 0) {
            return "Error: División por cero";
        }

        return Integer.toBinaryString(numero1 / numero2);
    }
    //Verificador de numeros binarios 
    public static boolean verificarBinario(String binario) {
        for (char digito : binario.toCharArray()) {
            if (digito != '0' && digito != '1') {
                return false;
            }
        }
        return true;
    }
    //Verificador de numero entero positivo
    public static boolean verificarNumero (int n){
        return n >= 0;
    }
    private static int convertirBinarioADecimal(String binario) {
       
        int longitud = binario.length();
        int decimal = 0;

        // Recorrer el número binario de derecha a izquierda
        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(binario.charAt(longitud - 1 - i));
            decimal += digito * Math.pow(2, i);
        }

        return decimal;
    }
    //Rellenado de una cadena con ceros a la izquierda
    public static String padLeft(String s, int length) {
        return String.format("%" + length + "s", s).replace(' ', '0');
    }
    
    
    //----------------SISTEMA DE CONVERSION DE UNIDADES---------------------
    public static void sisConversiones(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        
        do{
            //Escoger que se va a convertir
            System.out.println("-----------------------------------------");
            System.out.println("¿Qué desea hacer?");
            System.out.println("2>Conversiones de Longitud");
            System.out.println("3>Conversiones de Masa");
            System.out.println("4>Conversiones de Velocidad");
            System.out.println("5>Conversiones de Volumen");
            System.out.println("6>Conversiones de Area");
            System.out.println("7>Conversiones de Tiempo");
            System.out.println("8>Conversiones de Temperatura");
            System.out.println("9>Volver");
            System.out.println("-----------------------------------------");
            System.out.println(">");
            x = input.nextInt();
            
            switch (x){
                case 2:                   
                    conversionesLongitud();
                    break;
                case 3:
                    conversionesMasa();
                    break;
                case 4:
                    conversionesVelocidad();
                    break;
                case 5:
                    conversionesVolumen();
                    break;
                case 6:
                    conversionesArea();
                    break;
                case 7:
                    conversionesTiempo();
                    break;
                case 8:
                    conversionesTemperatura();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Numero invalido");
            }
            if(x != 9)
             x = 1;
        }while(x == 1);
        
    }
    
    //Conversiones de Longitud
    public static void conversionesLongitud(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        
        do{
        //Escoger la primer unidad que se va a usar en longitud
                    System.out.println("----------------------------------------------------");
                    System.out.println("¿Con que unidad quiere empezar antes de convertir?");
                    System.out.println("1> Metros");//<<<
                    System.out.println("2> Centimetros");//<<<
                    System.out.println("3> Kilometros");//<<<
                    System.out.println("4> Milimetros");//<<<
                    System.out.println("5> Pies");//<<<
                    System.out.println("6> Pulgadas");//<<<
                    System.out.println("7> Millas");//<<<
                    x = input.nextInt();
                    
                    switch(x){
                        case 1:
                            //Escoger a que unidad se va a convertir la longitud
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Centimetros");
                            System.out.println("2> Kilometros");
                            System.out.println("3> Milimetros");
                            System.out.println("4> Pies");
                            System.out.println("5> Pulgadas");
                            System.out.println("6> Millas");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    //Convertir de METROS A CENTIMETROS
                                    convertirMetrosACentimetros();
                                    break;
                                case 2:
                                    //Convertir de METROS A KILOMETROS
                                    convertirMetrosAKilometros();
                                    break;
                                case 3:
                                    //Convertir de METROS A MILIMETROS
                                    convertirMetrosAMilimetros();
                                    break;
                                case 4:
                                    //Convertir de METROS A PIES
                                    convertirMetrosAPies();
                                    break;
                                case 5:
                                    //Convertir de METROS A PULGADAS
                                    convertirMetrosAPulgadas();
                                    break;
                                case 6:
                                    //Convertir de METROS A MILLAS
                                    convertirMetrosAMillas();
                                    break;
                                default:
                                    System.out.println("Numero invalido");
                            }
                            
                            break;
                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Metros");
                            System.out.println("2> Kilometros");
                            System.out.println("3> Milimetros");
                            System.out.println("4> Pies");
                            System.out.println("5> Pulgadas");
                            System.out.println("6> Millas");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirCentimetrosAMetros();
                                    break;
                                case 2:
                                    convertirCentimetrosAKilometros();
                                    break;
                                case 3:
                                    convertirCentimetrosAMilimetros();
                                    break;
                                case 4:
                                    convertirCentimetrosAPies();
                                    break;
                                case 5:
                                    convertirCentimetrosAPulgadas();
                                    break;
                                case 6:
                                    convertirCentimetrosAMillas();
                                    break;
                                default:
                                    System.out.println("Numero invalido");
                            }
                            break;
                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Metros");
                            System.out.println("2> Centimetros");
                            System.out.println("3> Milimetros");
                            System.out.println("4> Pies");
                            System.out.println("5> Pulgadas");
                            System.out.println("6> Millas");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirKilometrosAMetros();
                                    break;
                                case 2:
                                    convertirKilometrosACentimetros();
                                    break;
                                case 3:
                                    convertirKilometrosAMilimetros();
                                    break;
                                case 4:
                                    convertirKilometrosAPies();
                                    break;
                                case 5:
                                    convertirKilometrosAPulgadas();
                                    break;
                                case 6:
                                    convertirKilometrosAMillas();
                                    break;
                                default:
                                    System.out.println("Numero invalido");
                            }
                            break;
                        case 4:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Metros");
                            System.out.println("2> Centimetros");
                            System.out.println("3> Kilometros");
                            System.out.println("4> Pies");
                            System.out.println("5> Pulgadas");
                            System.out.println("6> Millas");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirMMAMetros();
                                    break;
                                case 2:
                                    convertirMMACentimetros();
                                    break;
                                case 3:
                                    convertirMMAKilometros();
                                    break;
                                case 4:
                                    convertirMMAPies();
                                    break;
                                case 5:
                                    convertirMMAPulgadas();
                                    break;
                                case 6:
                                    convertirMMAMillas();
                                    break;
                                default:
                                    System.out.println("Numero invalido");
                            }
                            break;
                        case 5:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Metros");
                            System.out.println("2> Centimetros");
                            System.out.println("3> Kilometros");
                            System.out.println("4> Milimetros");
                            System.out.println("5> Pulgadas");
                            System.out.println("6> Millas");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirPiesAMetros();
                                    break;
                                case 2:
                                    convertirPiesACentimetros();
                                    break;
                                case 3:
                                    convertirPiesAKilometros();
                                    break;
                                case 4:
                                    convertirPiesAMilimetros();
                                    break;
                                case 5:
                                    convertirPiesAPulgadas();
                                    break;
                                case 6:
                                    convertirPiesAMillas();
                                    break;
                                default:
                                    System.out.println("Numero invalido");
                            }
                            break;
                        case 6:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Metros");
                            System.out.println("2> Centimetros");
                            System.out.println("3> Kilometros");
                            System.out.println("4> Milimetros");
                            System.out.println("5> Pies");
                            System.out.println("6> Millas");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirPulgadasAMetros();
                                    break;
                                case 2:
                                    convertirPulgadasACentimetros();
                                    break;
                                case 3:
                                    convertirPulgadasAKilometros();
                                    break;
                                case 4:
                                    convertirPulgadasAMilimetros();
                                    break;
                                case 5:
                                    convertirPulgadasAPies();
                                    break;
                                case 6:
                                    convertirPulgadasAMillas();
                                    break;
                                default:
                                    System.out.println("Numero invalido");
                            }
                            break;
                        case 7:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Metros");
                            System.out.println("2> Centimetros");
                            System.out.println("3> Kilometros");
                            System.out.println("4> Milimetros");
                            System.out.println("5> Pies");
                            System.out.println("6> Pulgadas");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirMillasAMetros();
                                    break;
                                case 2:
                                    convertirMillasACentimetros();
                                    break;
                                case 3:
                                    convertirMillasAKilometros();
                                    break;
                                case 4:
                                    convertirMillasAMilimetros();
                                    break;
                                case 5:
                                    convertirMillasAPies();
                                    break;
                                case 6:
                                    convertirMillasAPulgadas();
                                    break;
                                default:
                                    System.out.println("Numero invalido");
                            }
                            break;
                    }
            System.out.println("-----------------------------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1> Volver a convertir");
            System.out.println("2> Volver al menu principal");
            System.out.println("3> Cerrar el programa");
            x = input.nextInt();
            
            switch (x){
                case 2:
                    System.out.println("---------------Saliendo de la calculadora--------------");
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while(false);
    }
    public static void convertirMetrosACentimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 100;
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMetrosAKilometros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.001;
                           
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMetrosAMilimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000;
                      
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMetrosAPies(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 3.280839895013123;
                     
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMetrosAPulgadas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 39.37007874015748;
                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMetrosAMillas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.0006213711922373339;
                      
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirCentimetrosAMetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.01;
                       
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirCentimetrosAKilometros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.00001;
              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirCentimetrosAMilimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 10;
                        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirCentimetrosAPies(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.03280839895013123;
                      
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirCentimetrosAPulgadas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.3937007874015748;
                        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirCentimetrosAMillas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.000006213711922373339;
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilometrosAMetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000;
                            
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilometrosACentimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 100000;
                             
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilometrosAMilimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000000;
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilometrosAPies(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 3280.839895013123;
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilometrosAPulgadas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 39370.078740157485;
               
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilometrosAMillas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.621371192237334;
                 
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMMAMetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.001;
                  
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMMACentimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.1;
                            
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMMAKilometros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.000001;
                             
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMMAPies(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.0032808398950131233;
                        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMMAPulgadas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.03937007874015748;
                              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMMAMillas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * (6.21371192237334*(Math.pow(10,-7)));
                         
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPiesAMetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.3048;
                          
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPiesACentimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 30.48;
                     
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPiesAMilimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 304.8;
                                  
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPiesAKilometros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.00030480000000000004;
                                  
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPiesAPulgadas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 12.000000000000002;
                              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPiesAMillas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.0001893939393939394;
                              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPulgadasAMetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.0254;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPulgadasACentimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 2.54;
                           
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPulgadasAMilimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 25.4;
                             
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPulgadasAKilometros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.000025399999999999997;
                                 
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPulgadasAPies(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.08333333333333333;
                          
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirPulgadasAMillas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.000015782828282828283;
                       
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMillasAMetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1609.344;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMillasACentimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 160934.4;
                       
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMillasAMilimetros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1609344;
                              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMillasAKilometros(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1.609344;
                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMillasAPies(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 5280;
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMillasAPulgadas(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 63360.00000000001;
                         
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    
    //Conversiones de Masa
    public static void conversionesMasa(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        //Escoger la primer unidad que se va a usar en masa
        do{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("¿Con que unidad quiere empezar antes de convertir?");
                    System.out.println("1> Gramos");
                    System.out.println("2> Kilogramos");
                    System.out.println("3> Miligramos");
                    System.out.println("4> Libras");        
                    x = input.nextInt();
                    
                    switch(x){
                        case 1:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Kilogramos");
                            System.out.println("2> Miligramos");
                            System.out.println("3> Libras");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirGramosAKilogramos();
                                    break;
                                case 2:
                                    convertirGramosAMiligramos();
                                    break;
                                case 3:
                                    convertirGramosALibras();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Gramos");
                            System.out.println("2> Miligramos");
                            System.out.println("3> Libras");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirKilogramosAGramos();
                                    break;
                                case 2:
                                    convertirKilogramosAMiligramos();
                                    break;
                                case 3:
                                    convertirKilogramosALibras();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Kilogramos");
                            System.out.println("2> Gramos");
                            System.out.println("3> Libras");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirMiligramosAKilogramos();
                                    break;
                                case 2:
                                    convertirMiligramosAGramos();
                                    break;
                                case 3:
                                    convertirMiligramosALibras();
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Kilogramos");
                            System.out.println("2> Gramos");
                            System.out.println("3> Miligramos");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirLibrasAKilogramos();
                                    break;
                                case 2:
                                    convertirLibrasAGramos();
                                    break;
                                case 3:
                                    convertirLibrasAMiligramos();
                                    break;
                            }
                            break;
                    }
            System.out.println("-----------------------------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1> Volver a convertir");
            System.out.println("2> Volver al menu principal");
            System.out.println("3> Cerrar el programa");
            x = input.nextInt();
            
            switch (x){
                case 2:
                    System.out.println("---------------Saliendo de la calculadora--------------");
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while(false);
    }
    public static void convertirGramosAKilogramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.001;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirGramosAMiligramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000.0000000000001;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirGramosALibras(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.0022046244201837776;
                       
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilogramosAGramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;

        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilogramosAMiligramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000000;
                     
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKilogramosALibras(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 2.2046244201837775;
                   
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMiligramosAGramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.001;
                                   
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMiligramosAKilogramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.000001;
                             
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMiligramosALibras(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.0000022046244201837775;
                          
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirLibrasAGramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 453.592;
                              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirLibrasAKilogramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.453592;
             
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirLibrasAMiligramos(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 453592;
                     
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    
    //Conversiones de Velocidad
    public static void conversionesVelocidad(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        //Escoger la primer unidad que se va a usar en masa
        do{
                    System.out.println("------------------------------------------------------");
                    System.out.println("¿Con que unidad quiere empezar antes de convertir?");
                    System.out.println("1> m/s");
                    System.out.println("2> km/h");
                    System.out.println("3> km/s");        
                    x = input.nextInt();
                    
                    switch(x){
                        case 1:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> km/h");
                            System.out.println("2> km/s");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirmsAkmh();
                                    break;
                                case 2:
                                    convertirmsAkms();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> m/s");
                            System.out.println("2> km/s");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirkmhAms();
                                    break;
                                case 2:
                                    convertirkmhAkms();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> m/s");
                            System.out.println("2> km/h");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirkmsAms();
                                    break;
                                case 2:
                                    convertirkmsAkmh();
                                    break;
                            }
                            break;
                    }
            System.out.println("-----------------------------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1> Volver a convertir");
            System.out.println("2> Volver al menu principal");
            System.out.println("3> Cerrar el programa");
            x = input.nextInt();
            
            switch (x){
                case 2:
                    System.out.println("---------------Saliendo de la calculadora--------------");
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while(false);
    }
    public static void convertirmsAkmh(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 3.5999999712000004;
                            
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirmsAkms(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.001;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirkmhAms(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.27777778;
                                  
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirkmhAkms(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.00027777777999999997;
                      
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirkmsAms(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000;
                              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirkmsAkmh(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 3599.9999712000003;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    
    //Conversiones de Volumen
    public static void conversionesVolumen(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        //Escoger la primer unidad que se va a usar en masa
        do{
                    System.out.println("------------------------------------------------------");
                    System.out.println("¿Con que unidad quiere empezar antes de convertir?");
                    System.out.println("1> m³");
                    System.out.println("2> cm³");
                    System.out.println("3> Litros");        
                    x = input.nextInt();
                    
                    switch(x){
                        case 1:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("2> cm³");
                            System.out.println("3> Litros"); 
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirm3Acm3();
                                    break;
                                case 2:
                                    convertirm3AL();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> m³");
                            System.out.println("3> Litros");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertircm3Am3();
                                    break;
                                case 2:
                                    convertircm3AL();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> m³");
                            System.out.println("2> cm³");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirLAm3();
                                    break;
                                case 2:
                                    convertirLAcm3();
                                    break;
                            }
                            break;
                    }
        }while(false);
    }
    public static void convertirm3Acm3(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000000;
                  
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirm3AL(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000;
                          
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertircm3Am3(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.000001;
                       
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertircm3AL(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.001;
                  
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirLAm3(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.001;
                              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirLAcm3(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 1000.0000000000001;
                               
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    
    //Conversiones de Area
    public static void conversionesArea(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        //Escoger la primer unidad que se va a usar en masa
        do{
                    System.out.println("------------------------------------------------------");
                    System.out.println("¿Con que unidad quiere empezar antes de convertir?");
                    System.out.println("1> m²");
                    System.out.println("2> cm²");        
                    x = input.nextInt();
                    
                    switch(x){
                        case 1:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> cm²");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirm2Acm2();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> m²");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertircm2Am2();
                                    break;

                            }
                            break;
                    }
        }while(false);
    }
    public static void convertirm2Acm2(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 10000;
                           
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertircm2Am2(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.0001;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    
    //Conversiones de Tiempo
    public static void conversionesTiempo(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        //Escoger la primer unidad que se va a usar en masa
        do{
                    System.out.println("------------------------------------------------------");
                    System.out.println("¿Con que unidad quiere empezar antes de convertir?");
                    System.out.println("1> Segundos");
                    System.out.println("2> Minutos");
                    System.out.println("3> Horas");        
                    x = input.nextInt();
                    
                    switch(x){
                        case 1:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Minutos");
                            System.out.println("2> Horas"); 
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirSAM();
                                    break;
                                case 2:
                                    convertirSAH();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Segundos");
                            System.out.println("2> Horas");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirMAS();
                                    break;
                                case 2:
                                    convertirMAH();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Segundos");
                            System.out.println("2> Minutos");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirHAS();
                                    break;
                                case 2:
                                    convertirHAM();
                                    break;
                            }
                            break;
                    }
        }while(false);
    }
    public static void convertirSAM(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.016666666666666666;
                                 
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirSAH(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.0002777777777777778;
                           
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMAS(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 60;
                            
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirMAH(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 0.016666666666666666;
                                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirHAS(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 3600;
                              
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirHAM(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * 60;
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    
    //Conversiones de Temperatura
    public static void conversionesTemperatura(){
        Scanner input = new Scanner(System.in);
        int x = 0;
        //Escoger la primer unidad que se va a usar en masa 
        do{
                    System.out.println("------------------------------------------------------");
                    System.out.println("¿Con que unidad quiere empezar antes de convertir?");
                    System.out.println("1> Celsius");
                    System.out.println("2> Farenheit");
                    System.out.println("3> Kelvin");        
                    x = input.nextInt();
                    
                    switch(x){
                        case 1:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Farenheit");
                            System.out.println("2> Kelvin"); 
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirCAF();
                                    break;
                                case 2:
                                    convertirCAK();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Celsius");
                            System.out.println("2> Kevin");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirFAC();
                                    break;
                                case 2:
                                    convertirFAK();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("¿A que unidad desea convertirlo?");
                            System.out.println("1> Celsius");
                            System.out.println("2> Farenheit");
                            x = input.nextInt();
                            
                            switch(x){
                                case 1:
                                    convertirKAC();
                                    break;
                                case 2:
                                    convertirKAF();
                                    break;
                            }
                            break;
                    }
        }while(false);
    }
    public static void convertirCAF(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = (num*1.8)+32;
                    
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirCAK(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num + 273.15;
                        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirFAC(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = (num-32)/1.8;
                   
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirFAK(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = ((num - 32)/1.8)+273.15;
                
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKAC(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = num * -273.15;
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
    public static void convertirKAF(){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        
        System.out.println("-----------------------------------------");
        System.out.println("Introduce el numero");
        num = input.nextDouble();
        resultado = (1.8*(num-273.15))+32;
        
        System.out.println("-----------------------------------------");
        System.out.println("La conversion es: " + resultado + " <---");
        System.out.println("-----------------------------------------");
    }
}
