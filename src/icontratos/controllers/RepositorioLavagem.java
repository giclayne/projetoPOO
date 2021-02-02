/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontratos.controllers;

import icontratos.iRepositorioGenerico;
import java.util.ArrayList;
import model.Lavagem;

/**
 *
 * @author giclayne
 */
public class RepositorioLavagem implements iRepositorioGenerico<Lavagem, String>{
    
    private ArrayList<Lavagem> lavagems;

    public RepositorioLavagem() {
        this.lavagems = new ArrayList<>();
    }
    
    @Override
    public void cadastrar(Lavagem t) {
        this.lavagems.add(t);
    }

    @Override
    public void alterar(Lavagem t) {
        int id= this.lavagems.indexOf(t);
        this.lavagems.set(id, t);
    }

    @Override
    public boolean verificar(String id) {
        for (Lavagem l : this.lavagems) {
           if(id.equals(l.getId())){
               return true;
           }
    }
        return false;
    }

    @Override
    public Lavagem getObjeto(String id) {
          int idt;
        for (Lavagem l : lavagems) {
            if (l.getId().equals(id)) {
                idt = this.lavagems.indexOf(l);
                return this.lavagems.get(idt);
            }
        }
        return getObjeto(id);//mudar para uma excecao que a pessoa nn existe

    }

    @Override
    public void remover(String id) {
        
        try {
            Lavagem lavagem = this.getObjeto(id);
            this.lavagems.remove(lavagem);
        } catch (Exception e) {//Lavagem nn exsite
            //retorna a excecao
        }
    }

    @Override
    public ArrayList<Lavagem> listarTodos() {
        return this.lavagems;
    }

   
    
}
