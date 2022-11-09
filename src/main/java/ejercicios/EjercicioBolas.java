/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class EjercicioBolas {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        double importe;
        
        try {
            System.out.println("Introduce el importe del producto");
            importe = teclado.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("No has introducido el número correctamente");
        }
        
    }
    
}
