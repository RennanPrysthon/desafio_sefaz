package br.desafio.sefaz.models;

import br.desafio.sefaz.dto.TelefoneNewDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer ddd;
    private String numero;
    private String tipo;

    @JsonIgnore
    @ManyToOne
    private Usuario usuario;

    public Telefone(Long id, Integer ddd, String numero, String tipo, Usuario usuario) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
        this.usuario = usuario;
    }

    public Telefone() {
    }

    public Telefone(TelefoneNewDTO x) {
        this.id = null;
        this.numero = x.getNumero();
        this.ddd = x.getDdd();
        this.tipo = x.getTipo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return id.equals(telefone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
