package org.afrivera.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorCeroException {
        if(divisor ==0){
            throw new DivisionPorCeroException("No se puede dividir por cero");
        }
        return numerador / (double)divisor;
    }
}
