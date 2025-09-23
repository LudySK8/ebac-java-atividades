package org.example;

public class Fibonacci {

    /**
     * Calcula o n-ésimo número da sequência de Fibonacci recursivamente.
     *
     * @param n Posição na sequência (começando em 0)
     * @return Número de Fibonacci na posição n
     * @throws IllegalArgumentException se n for negativo
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n não pode ser negativo");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}