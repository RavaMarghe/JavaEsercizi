/*
 * Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione,
 * moltiplicazione e divisione, min e max) definita in un enum.
 * Crei un metodo per calcolare l'operazione richiesta e ritorni il risultato.
 * Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo.
 * */

package com.develhope.advance.bignumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalCalculator {
    // Definisco le operazioni in un enum
    enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE, MIN, MAX
    }

    // Metodo per calcolare l'operazione richiesta
    public static BigDecimal calculator(BigDecimal num1, BigDecimal num2, Operation operation) {
        switch (operation) {
            case ADD:
                return num1.add(num2);
            case SUBTRACT:
                return num1.subtract(num2);
            case MULTIPLY:
                return num1.multiply(num2);
            // Divisione con scala e rounding per prevenire errori
            case DIVIDE:
                return num1.divide(num2, 2, RoundingMode.HALF_EVEN);
            case MIN:
                return num1.min(num2);
            case MAX:
                return num1.max(num2);
            default:
                throw new IllegalArgumentException("Operazione non valida");
        }
    }


    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("3.1");
        BigDecimal num2 = new BigDecimal("4.5");
        Operation operation = Operation.ADD;

        System.out.println(calculator(num1, num2, operation));
    }
}
