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
public class Funcionario extends Pessoa {

    private int numIdentificacao;
    private String rg;

    /**
     *
     */
    public Funcionario() {
    }

    /**
     *
     * @param numIdentificacao
     * @param rg
     * @param nome
     * @param cpf
     */
    public Funcionario(int numIdentificacao, String rg, String nome, String cpf) {
        super(nome, cpf);
        this.numIdentificacao = numIdentificacao;
        this.rg = rg;
    }

    /**
     *
     * @return
     */
    public int getNumIdentificacao() {
        return numIdentificacao;
    }

    /**
     *
     * @param numIdentificacao
     */
    public void setNumIdentificacao(int numIdentificacao) {
        this.numIdentificacao = numIdentificacao;
    }

    /**
     *
     * @return
     */
    public String getRg() {
        return rg;
    }

    /**
     *
     * @param rg
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     *
     * @return
     */

    @Override
    public String toString() {
        return super.toString() + "Funcionario{" + "numIdentificacao=" + numIdentificacao + ", rg=" + rg + '}';
    }

}
