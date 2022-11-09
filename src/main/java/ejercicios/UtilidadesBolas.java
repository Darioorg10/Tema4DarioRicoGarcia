/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class UtilidadesBolas {

    private static Random aleatorio = new Random();
    private static Scanner teclado = new Scanner(System.in);
    
    // Preguntar si hay otro cliente

    // Se pide el importe del producto y se comprueba que está bien y si no, se repite
    public static double pedirImporteProducto() {
        double importe = 1;
        boolean repetir = true;

        do {

            System.out.println("Introduce el importe del producto:");

            try {
                importe = teclado.nextDouble();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido el número correctamente");
                teclado.nextLine();
            }

        } while (repetir);

        return importe;

    }

    // Se saca la bola
    public static int sacarBola() {
        int bolaAzul = 1;
        int bolaRoja = 2;
        int bolaBlanca = 3;
        int bolaVerde = 4;
        int aleatorio1 = 0;

        do {
            aleatorio1 = aleatorio.nextInt(1, 4 + 1);
            return aleatorio1;
        } while (aleatorio1 != 4);

    }

    // Se ve que bola se ha sacado y se dice su descuento
    public static double descuentoBola(int sacarBola) {
        final double DESCUENTO_BOLA_AZUL = 0.2;
        final double DESCUENTO_BOLA_ROJA = 0.25;
        final double DESCUENTO_BOLA_BLANCA = 0; // No hay descuento, no es que sea 0 OJO
        double descuento = 1;
        int aleatorio2 = 0;

        switch (sacarBola) {
            case 1:
                System.out.println("Has sacado la bola azul");
                descuento = DESCUENTO_BOLA_AZUL;
                break;

            case 2:
                System.out.println("Has sacado la bola roja");
                descuento = DESCUENTO_BOLA_ROJA;
                break;

            case 3:
                System.out.println("Has sacado la bola blanca");
                descuento = DESCUENTO_BOLA_BLANCA;
                break;

            case 4:
                System.out.println("Has sacado la bola verde, así que vuelves a coger bola");
                aleatorio2 = aleatorio.nextInt(1, 3 + 1);

                switch (aleatorio2) {
                    case 1:
                        System.out.println("Has sacado la bola azul");
                        descuento = DESCUENTO_BOLA_AZUL;
                        break;
                    case 2:
                        System.out.println("Has sacado la bola roja");
                        descuento = DESCUENTO_BOLA_ROJA;
                        break;
                    case 3:
                        System.out.println("Has sacado la bola azul");
                        descuento = DESCUENTO_BOLA_AZUL;
                        break;
                    default:

                }
                break;
            default:
        }

        System.out.println("El descuento es " + descuento);
        return descuento;

    }

    // Se calcula y se muestra el importe con descuento
    public static double importeConDescuento(double pedirImporteProducto, double descuentoBola) {
        double importeDescontado = 1;
        double importeDescontadoBlanca = 1;

        if (descuentoBola!=0) {
            importeDescontado = pedirImporteProducto - (descuentoBola*pedirImporteProducto);
            System.out.println("El importe con el descuento aplicado es de " + importeDescontado);
        }                    

        if (descuentoBola == 0) {

            System.out.println("El importe con el descuento aplicado es de " + pedirImporteProducto);

        }

        return importeDescontado;

    }

}
