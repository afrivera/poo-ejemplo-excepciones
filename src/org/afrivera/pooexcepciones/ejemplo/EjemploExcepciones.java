package org.afrivera.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un numero numerador:");
        String denominador = JOptionPane.showInputDialog("Ingrese un numero denominador:");

        int divisor;
        double division;
        try{
            // divisor = Integer.parseInt(valor);
            // division = calc.dividir(10,divisor);
            // System.out.println(division);

            double division2 = calc.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        }catch (DivisionPorCeroException ae){
            System.out.println("Capturamos la excepcion en timpo de ejecución " + ae.getMessage());
            main(args);
        }catch (FormatoNumeroException fne){
            System.out.println("Se detecto una excepcion: Ingrese un numero valido " + fne.getMessage());
            fne.printStackTrace();
        } catch (NumberFormatException ne){
            System.out.println("Segunda excepción Number format Exception" + ne.getMessage());
            main(args);
        } finally {
            System.out.println("Esta acción siempre se ejecuta, por lo general para cerrar conexiones de base de datos o archivos abiertos");
        }

        System.out.println("continuamos el flujo de la aplicación");
    }
}
