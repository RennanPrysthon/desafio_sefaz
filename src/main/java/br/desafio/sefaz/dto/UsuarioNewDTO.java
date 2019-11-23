package br.desafio.sefaz.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UsuarioNewDTO {

    @NotEmpty(message = "Preenchimento obrigatório")
    private String nome;

    @NotEmpty(message = "Preenchimento obrigatório")
    @Email(message = "Digite um email válido")
    private String email;

    @NotEmpty(message = "Preenchimento obrigatório")
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
