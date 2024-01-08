package org.example.model;
// criando uma classe principal, Calculadora, que contém um método de soma.
public class Calculadora {
    public int somar (int a, int b) {
        return a + b;
    }
        public int subtrair (int c, int d) {
            return c - d;
    }

    public  int dividir (int a, int b) {
        //// Verifica se o divisor (b) é igual a zero
        if (b == 0) {
            // Se for igual a zero, lança uma exceção IllegalArgumentException
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        // Se o divisor não for zero, realiza a divisão e retorna o resultado.
        return a / b;
    }
}

