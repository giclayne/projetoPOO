/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontratos.controllers;

import icontratos.iRepositorioGenerico;
import java.util.ArrayList;
import model.TipoLavagem;

/**
 *
 * @author giclayne
 */
public class RepositorioTipoLavagem implements iRepositorioGenerico<TipoLavagem, String>{
    
    private ArrayList<TipoLavagem> tiposLavagems;

    /**
     *
     */
    public RepositorioTipoLavagem() {
        this.tiposLavagems = new ArrayList<>();
    }
    
    
    
    @Override
    public void cadastrar(TipoLavagem t) {
        this.tiposLavagems.add(t);
    }

    @Override
    public void alterar(TipoLavagem t) {
        int id = this.tiposLavagems.indexOf(t);
        this.tiposLavagems.set(id, t);
    }

    @Override
    public boolean verificar(String id) {
        for (TipoLavagem tl : this.tiposLavagems) {
            if (id.equals(tl.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public TipoLavagem getObjeto(String id) {
        int idt;
        for (TipoLavagem tl : tiposLavagems) {
            if (tl.getId().equals(id)) {
                idt = this.tiposLavagems.indexOf(tl);
                return this.tiposLavagems.get(idt);
            }
        }
        return getObjeto(id);//mudar para uma excecao que a pessoa nn existe

    }

    @Override
    public void remover(String id) {
        try {
            TipoLavagem tipoLavagem  = this.getObjeto(id);
        } catch (Exception e) {//TipoLavagem nn existe
            //retorna e excecao
        }
    }

    @Override
    public ArrayList<TipoLavagem> listarTodos() {
        return this.tiposLavagems;
    }
    
    
}
