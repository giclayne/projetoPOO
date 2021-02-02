/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontratos.controllers;

import icontratos.iRepositorioGenerico;
import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author giclayne
 */
public class RepositorioVeiculo implements iRepositorioGenerico<Veiculo, String>{

    private ArrayList<Veiculo> veiculos;

    /**
     *
     */
    public RepositorioVeiculo() {
        this.veiculos = new ArrayList<>();
    }
    
    
    
    @Override
    public void cadastrar(Veiculo t) {
        this.veiculos.add(t);
    }

    @Override
    public void alterar(Veiculo t) {
        int id = this.veiculos.indexOf(t);
        this.veiculos.set(id, t);
    }

    @Override
    public boolean verificar(String id) {
        for (Veiculo v : veiculos) {
            if(id.equals(v.getId())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Veiculo getObjeto(String id) {
        int idt;
        for (Veiculo v : veiculos) {
            if(v.getId().equals(id)){
                idt = this.veiculos.indexOf(v);
                return this.veiculos.get(idt);
            }
        }
        return getObjeto(id);//mudar para uma excesao que o veiculo nn existe
    }

    @Override
    public void remover(String id) {
        try {
            Veiculo veiculo = this.getObjeto(id);
            this.veiculos.remove(veiculo);
        } catch (Exception e) { //Veiculo nn existe
            //retorna e excecqoa mesma
        }
    }

    @Override
    public ArrayList<Veiculo> listarTodos() {
        return this.veiculos;
    }
    
    
    
    
}
