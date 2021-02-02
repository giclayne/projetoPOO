/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import icontratos.iRepositorioPessoa;
import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author giclayne
 */
public class RepositorioCliente implements iRepositorioPessoa {

    private ArrayList<Pessoa> clientes;

    public RepositorioCliente() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void cadastrarPessoa(Pessoa cliente) {
        this.clientes.add(cliente);

    }

    @Override
    public void alterarPessoa(Pessoa cliente) {
        int id = this.clientes.indexOf(cliente);
        this.clientes.set(id, cliente);
    }

    @Override
    public boolean verificarPessoa(String cpf) {
        for (Pessoa c : this.clientes) {
            if (cpf.equals(c.getCpf())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Pessoa getPessoa(String cpf) {
        int id;
        for (Pessoa c : clientes) {
            if (c.getCpf().equals(cpf)) {
                id = this.clientes.indexOf(c);
                return this.clientes.get(id);
            }
        }
        return getPessoa(cpf);//mudar para uma excecao que a pessoa nn existe
    }

    @Override
    public void removerPessoa(String cpf) {
        try {
            Pessoa cliente = this.getPessoa(cpf);
            this.clientes.remove(cliente);
        } catch (Exception e) {//Pessoa NAo xiste
            //retorna a excecao mesma do getPessoa
        }
    }

    @Override
    public ArrayList<Pessoa> listarPessoas() {
        return this.clientes;
    }

}
