/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontratos.controllers;

import java.util.ArrayList;
import model.Funcionario;
import icontratos.iRepositorioGenerico;

/**
 *
 * @author giclayne
 */
public class RepositorioFuncionario implements iRepositorioGenerico<Funcionario, String>{
    private ArrayList<Funcionario> funcionarios;

    public RepositorioFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public void cadastrar(Funcionario t) {
        this.funcionarios.add(t);
    }

    @Override
    public void alterar(Funcionario t) {
        int id = this.funcionarios.indexOf(t);
        this.funcionarios.set(id, t);
    }

    @Override
    public boolean verificar(String cpf) {
        for (Funcionario f : this.funcionarios) {
            if (cpf.equals(f.getCpf())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Funcionario getObjeto(String cpf) {
        int id;
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                id = this.funcionarios.indexOf(f);
                return this.funcionarios.get(id);
            }
        }
        return getObjeto(cpf);//mudar para uma excecao que a pessoa nn existe
    }

    @Override
    public void remover(String cpf) {
        try {
            Funcionario funcionario = (Funcionario) this.getObjeto(cpf);
            this.funcionarios.remove(funcionario);
        } catch (Exception e) {//Pessoa NAo xiste
            //retorna a excecao mesma do getPessoa
        }
    }

    @Override
    public ArrayList<Funcionario> listarTodos() {
        return this.funcionarios;
    }

    
    

}
