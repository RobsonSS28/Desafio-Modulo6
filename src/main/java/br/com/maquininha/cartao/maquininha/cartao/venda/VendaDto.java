package br.com.maquininha.cartao.maquininha.cartao.venda;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotBlank;

public class VendaDto {

    private int id;
    private double valor;
    private Opcao opcao;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int qtdParcela;
    private double valorTotal;

    public VendaDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Opcao getOpcao() {
        return opcao;
    }

    public void setOpcao(Opcao opcao) {
        this.opcao = opcao;
    }

    public int getQtdParcela() {
        return qtdParcela;
    }

    public void setQtdParcela(int qtdParcela) {
        this.qtdParcela = qtdParcela;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Venda converterDtoEmVenda(){
        Venda venda = new Venda();
        venda.setValor(valor);
        venda.setOpcao(opcao);
        venda.setQtdParcela(qtdParcela);
        venda.setValorTotal(valorTotal);

        return venda;
    }
}
