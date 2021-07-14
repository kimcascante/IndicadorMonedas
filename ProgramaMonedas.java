package Adicional;

/**
 * Nombre del programa: Programa de Monedas
 * Descripcion: Modele y escriba un algoritmo que dado un monto en colones calcule el mínimo 
    número de monedas para cubrir el monto. Suponga que sólo tiene monedas de 50, 20, 10 y 5 colones.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej5w1 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int monto;
        int cincuenta;
        int veinte;
        int diez;
        int cinco;
        int vuelto;

        escribir.println("Digite un monto:");
        monto = Integer.parseInt(leer.readLine());

        cincuenta = monto / 50;
        vuelto = monto % 50;

        veinte = vuelto / 20;
        vuelto = vuelto % 20;

        diez = vuelto / 10;
        vuelto = vuelto % 10;

        cinco = vuelto / 5;
        vuelto = vuelto % 5; 
        
        escribir.println("Para el monto de " + monto+ " el minimo de monedas son de : ");
        escribir.println(cincuenta + " monedas de 50");
        escribir.println(veinte + " monedas de 20");
        escribir.println(diez + " monedas de 10");
        escribir.println(cinco + " monedas de 5");
    }
}