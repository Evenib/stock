package br.gov.rj.faeterj.estoque.model;

import org.hibernate.validator.constraints.NotBlank;

public class Produto {

	@NotBlank
    private String sku;
    private String nome;
    
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
