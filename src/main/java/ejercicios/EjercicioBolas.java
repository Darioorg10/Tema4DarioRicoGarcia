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

        Scanner teclado = new Scanner(System.in);
        String cliente;
        double importe;
        double descuentoBola;
        int bola;

        do {

            importe = UtilidadesBolas.pedirImporteProducto();

            bola = UtilidadesBolas.sacarBola();

            descuentoBola = UtilidadesBolas.descuentoBola(bola);

            double importeDescontado = UtilidadesBolas.importeConDescuento(importe, descuentoBola);

            do {

                System.out.println("¿Hay otro cliente?");
                cliente = teclado.nextLine();

            } while (!cliente.equalsIgnoreCase("si") && !cliente.equalsIgnoreCase("no"));

        } while (cliente.equalsIgnoreCase("si"));
        
        if (cliente.equalsIgnoreCase("no")) {
            
            System.out.println("Gracias y ADIOS");
            
        }

    }

}
