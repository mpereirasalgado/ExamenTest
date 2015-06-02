/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examentest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mpereirasalgado
 */
public class Visualizar {
    public static void introduccionNumeros(Calculo calculo) {
            
            
        try {
            BufferedReader entradaTeclado = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("Introduzca el número 1: ");
            calculo.setNumero1(Integer.parseInt(entradaTeclado.readLine()));
            
            System.out.print("Introduzca el número 2: ");
            calculo.setNumero2(Integer.parseInt(entradaTeclado.readLine())); 
            

            System.out.println("El MCD de " + calculo.getNumero1() + " y "
                    + calculo.getNumero2() + " es: " + calculo.obtenerMCD(calculo.getNumero1(), calculo.getNumero2()));

            System.out.println("Resultado del cálculo: "
                    + calculo.getMensajeResultado());
        } catch (NumberFormatException e) {
            System.out.println("Debe introducir un número válido: "
                    + e.getMessage());
            
        } catch (IOException e) {
            System.out.println("Error al introducir datos: "
                    + e.getMessage());
        }
        
    }
}
