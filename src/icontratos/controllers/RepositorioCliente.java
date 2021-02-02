/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontratos.controllers;

import java.util.ArrayList;
import model.Cliente;
import icontratos.iRepositorioGenerico;

/**
 *
 * @author giclayne
 */
public class RepositorioCliente implements iRepositorioGenerico<Cliente, String> {

    private ArrayList<Cliente> clientes;

    /**
     *
     */
    public RepositorioCliente() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void cadastrar(Cliente t) {
        this.clientes.add(t);
    }

    @Override
    public void alterar(Cliente t) {
        int id = this.clientes.indexOf(t);
        this.clientes.set(id, t);
    }

    @Override
    public boolean verificar(String cpf) {
        for (Cliente c : this.clientes) {
            if (cpf.equals(c.getCpf())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Cliente getObjeto(String cpf) {
        int id;
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                id = this.clientes.indexOf(c);
                return this.clientes.get(id);
            }
        }
        return getObjeto(cpf);//mudar para uma excecao que a pessoa nn existe

    }

    @Override
    public void remover(String cpf) {

        try {
            Cliente cliente = this.getObjeto(cpf);
            this.clientes.remove(cliente);
        } catch (Exception e) {//Pessoa NAo xiste
            //retorna a excecao mesma do getPessoa
        }
    }

    @Override
    public ArrayList<Cliente> listarTodos() {
        return this.clientes;
    }

}
