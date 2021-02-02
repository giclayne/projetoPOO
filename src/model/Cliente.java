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
public class Cliente extends Pessoa{
    private String numTelefone;
    private String endereco;

    /**
     *
     * @param numTelefone
     * @param endereco
     * @param nome
     * @param cpf
     */
    public Cliente(String numTelefone, String endereco, String nome, String cpf) {
        super(nome, cpf);
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    /**
     *
     */
    public Cliente() {
    }

    /**
     *
     * @return
     */
    public String getNumTelefone() {
        return numTelefone;
    }

    /**
     *
     * @param numTelefone
     */
    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    /**
     *
     * @return
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    /**
     *
     * @return
     */
    
    @Override
    public String toString() {
        return super.toString() + "Nº telefone: " + numTelefone
                + "Endereco: " + endereco ;
    }
    
    
    
}
