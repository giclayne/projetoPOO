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

    private String cargo;

    /**
     *
     */
    public Funcionario() {
    }

    public Funcionario(String cargo, int codigo, String nome, Endereco endereco, String telefone, String celular, String cpf, String rg, String email) {
        super(codigo, nome, endereco, telefone, celular, cpf, rg, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "Funcionario{" + "cargo=" + cargo + '}';
    }
    

    
}
