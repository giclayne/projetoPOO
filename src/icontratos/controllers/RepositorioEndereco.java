/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontratos.controllers;

import icontratos.iRepositorioGenerico;
import java.util.ArrayList;
import model.Endereco;

/**
 *
 * @author giclayne
 */
public class RepositorioEndereco implements iRepositorioGenerico<Endereco, String>{

    private ArrayList<Endereco> enderecos;

    public RepositorioEndereco() {
        this.enderecos = new ArrayList<>();
    }
    
    


    @Override
    public void cadastrar(Endereco t) {
        this.enderecos.add(t);
    }

    @Override
    public void alterar(Endereco t) {
        int id = this.enderecos.indexOf(t);
        this.enderecos.set(id, t);
    }

    @Override
    public boolean verificar(String rua) {
        for (Endereco e : enderecos) {
            if(rua.equals(e.getId())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Endereco getObjeto(String id) {
        int idt;
        for (Endereco e : enderecos) {
            if(e.getId().equals(id)){
                idt=this.enderecos.indexOf(e);
                return this.enderecos.get(idt);
            }
        }
        return getObjeto(id);//excecao se nn existe
    }

    @Override
    public void remover(String id) {
        try {
            Endereco endereco = this.getObjeto(id);
        } catch (Exception e) {//Endereco nn existe
            //retorna a excesao
        }
    }

    @Override
    public ArrayList<Endereco> listarTodos() {
        return this.enderecos;
    }
    
    
}
