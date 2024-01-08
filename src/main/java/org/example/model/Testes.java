package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Declarando uma classe de teste para a classe Calculadora
public class Testes {

// Anotando o método de teste com @Test, indicando que este método é um teste
@Test
    public  void testSoma() {
    // Fase de Arrange (Preparação): Criando uma instância da Calculadora
    Calculadora calculadora = new Calculadora();

// Fase de Act (Ação): Chamando o método somar da Calculadora
    int resultado = calculadora.somar(2, 3);

    /* Fase de Assert (Verificação): Verificando se o resultado da soma é igual a 5
     Utilizando o método assertEquals do JUnit para comparar valores*/
    assertEquals(5, resultado);

    }

    @Test
    public void testSubtrair() {
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.subtrair(2, 3);
    assertEquals(-1, resultado);

    }

    @Test
    public void testCompararStrings() {

    //instanciando
    StringUtils utils = new StringUtils();

    //chamando o metodo sãoIguais do utils
    boolean resultado = utils.saoIguais("AMANDA", "AMANDA");

    //verificando se o resultado do boolean é igual, caso seja tem que dar true e será verdadeiro
    assertEquals(true, resultado);

    }

    @Test
    public void TestListaVazia() {

    //Criando uma nova instância da classe Lista e atribuindo à variável minhalista.
        Lista minhalista = new Lista();

// Chamando o método estaVazia() em um objeto chamado minhalista e armazenando o resultado em uma variável booleana.
    boolean resultado = minhalista.estaVazia();

// Utilizando um método de assert (assertTrue) para verificar se a condição 'resultado' é verdadeira.
    assertTrue(resultado);
    }

    @Test
    public void testDivisaoPorZero() {

        //Criando uma nova instância da classe Calculadora e atribuindo à variável minhaDivisao.
        Calculadora minhadivisao = new Calculadora();

        // Utilizando assertThrows para verificar se uma IllegalArgumentException é lançada
        assertThrows(IllegalArgumentException.class, () -> {
            minhadivisao.dividir(10, 0);

        });

    }
}
