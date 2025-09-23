package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void setup() {
        calc = new Calculadora();
    }

    @Test
    public void testAdicionar() {
        assertEquals(5, calc.soma(2, 3));
        assertEquals(-1, calc.soma(2, -3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1, calc.subtracao(3, 2));
        assertEquals(5, calc.subtracao(2, -3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicacao(2, 3));
        assertEquals(-6, calc.multiplicacao(2, -3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calc.divisao(6, 3));
        assertEquals(-2, calc.divisao(6, -3));
    }

    @Test
    public void testDividirPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divisao(6, 0);
        });
        assertEquals("Divisor não pode ser zero.", exception.getMessage());
    }
}
