package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("1200"), 4);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento));

        Orcamento segundo = new Orcamento(new BigDecimal("800"), 5);
        System.out.println(calculadora.calcular(segundo));
    }
}
