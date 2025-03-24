package com.example.calculadora.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    void testSuma() {
        double resultado = calculadoraService.operar(5, 3, "suma");
        assertEquals(8, resultado, "La suma de 5 + 3 debería ser 8");
    }

    @Test
    void testResta() {
        double resultado = calculadoraService.operar(10, 4, "resta");
        assertEquals(6, resultado, "La resta de 10 - 4 debería ser 6");
    }

    @Test
    void testMultiplicacion() {
        double resultado = calculadoraService.operar(2, 3, "multiplicacion");
        assertEquals(6, resultado, "La multiplicación de 2 * 3 debería ser 6");
    }

    @Test
    void testDivision() {
        double resultado = calculadoraService.operar(10, 2, "division");
        assertEquals(5, resultado, "La división de 10 / 2 debería ser 5");
    }




}