/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabillon_cristina_biarray;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Laura Sabillon
 */
public class Sabillon_Cristina_BiArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Numeros [][], tamaño, suma_primaria = 0, suma_secundaria = 0;
        String suma_pri = "", suma_sec = "";
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Ingresar un numero para el tamanio del arreglo (Cuadrado) : ");
        tamaño = scan.nextInt();
        
        while (tamaño <= 0){
            System.out.println("No se permiten numeros negativos o el cero. Intente de nuevo.");
            tamaño = scan.nextInt();
        }
        
        Numeros = new int [tamaño][tamaño];
        System.out.println();
                
        for (int filas = 0; filas < Numeros.length; filas++) {            
            for (int columnas = 0; columnas < Numeros.length; columnas++) {
                int random_num = random.nextInt(100 - 10) + 10;
                Numeros[filas][columnas] = random_num;
                System.out.print(Numeros[filas][columnas] + " ");
            }
            
            suma_secundaria += Numeros[filas][tamaño - filas - 1];
            suma_sec +=  (suma_sec.equals("") ?" ": " + ") + Numeros[filas][tamaño - filas - 1];  
            
            suma_primaria += Numeros[filas][filas]; 
            suma_pri +=(suma_pri.equals("") ?" ": " + ") + Numeros[filas][filas];  
            System.out.println();
        }

        System.out.println("\nSuma de la diagonal Principal:"+ suma_pri+ " : " + suma_primaria);
        System.out.println("Suma de la diagonal Secundaria:" +  suma_sec  +  " : " +suma_secundaria);
    }
    
}
