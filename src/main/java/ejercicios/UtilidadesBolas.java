/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class UtilidadesBolas {
    
    private static Random aleatorio = new Random();
    private static Scanner teclado = new Scanner(System.in);

    public UtilidadesBolas() {
    }
    
    public static double sacarBolas(){
        
        
    
    }
    
    public static double menuImporteProducto(){
        double importe;
        
        System.out.println("Introduce el importe del producto");
        importe = teclado.nextDouble();
        return importe;
    }
    
    public static boolean esImporteProductoValido(double menuImporteProducto){
        boolean importeValido = true;
        double importe;
        
        try {
            System.out.println("Introduce el importe del producto");
            importe = teclado.nextDouble();
        } catch (NumberFormatException nfe) {
            System.out.println("No has introducido el número correctamente");
        }
        return importeValido;
    
    }
    
}
