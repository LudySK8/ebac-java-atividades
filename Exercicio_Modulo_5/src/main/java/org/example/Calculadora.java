package org.example;

/**
 * Classe que implementa operações básicas de cálculo: adição, subtração,
 * multiplicação e divisão.
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da soma
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     *
     * @param a Minuendo
     * @param b Subtraendo
     * @return Resultado da subtração
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a Primeiro fator
     * @param b Segundo fator
     * @return Resultado da multiplicação
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número pelo segundo.
     *
     * @param a Dividendo
     * @param b Divisor (não pode ser zero)
     * @return Resultado da divisão inteira
     * @throws ArithmeticException se o divisor for zero
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero.");
        }
        return a / b;
    }

    // Métodos públicos para acesso aos métodos privados, usados para teste
    public int soma(int a, int b) {
        return adicionar(a, b);
    }

    public int subtracao(int a, int b) {
        return subtrair(a, b);
    }

    public int multiplicacao(int a, int b) {
        return multiplicar(a, b);
    }

    public int divisao(int a, int b) {
        return dividir(a, b);
    }
}
