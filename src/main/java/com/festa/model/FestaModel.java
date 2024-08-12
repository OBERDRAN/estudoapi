package com.festa.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class FestaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private int qtdepessoas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdepessoas() {
        return qtdepessoas;
    }

    public void setQtdepessoas(int qtdepessoas) {
        this.qtdepessoas = qtdepessoas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FestaModel)) return false;
        FestaModel that = (FestaModel) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
