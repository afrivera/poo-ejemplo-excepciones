package org.afrivera.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un numero");

        int divisor;
        double division;
        try{
            divisor = Integer.parseInt(valor);
            division = calc.dividir(10,divisor);
            System.out.println(division);

        }catch (DivisionPorCeroException ae){
            System.out.println("Capturamos la excepcion en timpo de ejecución " + ae.getMessage());
            main(args);
        } catch (NumberFormatException ne){
            System.out.println("Segunda excepción Number format Exception" + ne.getMessage());
            main(args);
        } finally {
            System.out.println("Esta acción siempre se ejecuta, por lo general para cerrar conexiones de base de datos o archivos abiertos");
        }

        System.out.println("continuamos el flujo de la aplicación");
    }
}
