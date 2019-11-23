package br.desafio.sefaz.dto;

import br.desafio.sefaz.models.Usuario;

public class UsuarioDTO {

    private String nome;
    private String email;
    private Integer quantidadesTelefones;

    public UsuarioDTO(Usuario u) {
        this.nome = u.getNome();
        this.email = u.getEmail();
        this.quantidadesTelefones = u.getTelefones().size();
    }

    public UsuarioDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getQuantidadesTelefones() {
        return quantidadesTelefones;
    }

    public void setQuantidadesTelefones(Integer quantidadesTelefones) {
        this.quantidadesTelefones = quantidadesTelefones;
    }
}
