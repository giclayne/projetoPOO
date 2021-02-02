/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author giclayne
 */
public class TipoLavagem {
    private String id;
    private String nome;
    private String descricao;
    private double valor;

    /**
     *
     * @param id
     * @param nome
     * @param descricao
     * @param valor
     */
    public TipoLavagem(String id,String nome, String descricao, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        
    }

    /**
     *
     */
    public TipoLavagem() {
    }
    
    

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @return
     */
    public double getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
 /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "TipoLavagem{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

   
    
    
    
}
