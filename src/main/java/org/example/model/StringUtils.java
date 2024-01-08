package org.example.model;

public class StringUtils {

    //declarado um método público chamado saoIguais, que retorna um valor booleano. Esse método aceita dois parâmetros do tipo String chamados str1 e str2.
    public boolean saoIguais(String str1, String str2) {

    //O método saoIguais utiliza o método equals da classe String para verificar se as duas strings (str1 e str2) são iguais. Ele retorna true se forem iguais e false se forem diferentes.
        return str1.equals(str2);
    }
}
