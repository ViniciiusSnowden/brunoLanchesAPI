package com.specialistSpring.brunoLanche.di.modelo;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private Boolean ativo = false;

    public Cliente(String nome, String endereco, String telefone, Boolean ativo) {
        this.nome = nome;
        this.email = endereco;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return email;
    }

    public void setEndereco(String endereco) {
        this.email = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
