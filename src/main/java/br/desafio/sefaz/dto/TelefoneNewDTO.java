package br.desafio.sefaz.dto;

import br.desafio.sefaz.models.Telefone;

public class TelefoneNewDTO {

    private Integer ddd;
    private String numero;
    private String tipo;

    public TelefoneNewDTO(Telefone telefone) {
        this.ddd  = telefone.getDdd();
        this.numero = telefone.getNumero();
        this.tipo = telefone.getTipo();
    }

    public TelefoneNewDTO() {
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
