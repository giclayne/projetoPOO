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

   private String dataNascimento;

    public Cliente() {
    }

   
    public Cliente(String dataNascimento, int codigo, String nome, Endereco endereco, String telefone, String celular, String cpf, String rg, String email) {
        super(codigo, nome, endereco, telefone, celular, cpf, rg, email);
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "dataNascimento=" + dataNascimento + '}';
    }
   
   
    
   

}
