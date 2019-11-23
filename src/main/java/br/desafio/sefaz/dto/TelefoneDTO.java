package br.desafio.sefaz.dto;

import br.desafio.sefaz.models.Telefone;

public class TelefoneDTO {

    private Integer ddd;
    private String numero;
    private String tipo;


    public TelefoneDTO(Telefone t) {
        this.ddd = t.getDdd();
        this.numero = t.getNumero();
        this.tipo = t.getTipo();
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
