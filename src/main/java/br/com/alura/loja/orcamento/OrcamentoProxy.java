package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{

    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
       if (this.valor == null) {
           System.out.println("Chamou método getValor do Orcamento...");
           this.valor = orcamento.getValor();
       }
       return this.valor;
    }
}
