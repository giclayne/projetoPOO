/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.implementacoes;

import icontratos.controllers.RepositorioVeiculo;
import java.util.ArrayList;
import model.Cliente;
import model.Veiculo;

/**
 *
 * @author giclayne
 */
public class ImplVeiculo {
    private RepositorioVeiculo repositorioVeiculo;

    /**
     *
     * @param repositorioVeiculo
     */
    public ImplVeiculo(RepositorioVeiculo repositorioVeiculo) {
        this.repositorioVeiculo = repositorioVeiculo;
    }
    
    /**
     *
     * @param veiculo
     */
    public void cadastrarVeiculo(Veiculo veiculo){
        boolean existeVeiculo = repositorioVeiculo.verificar(veiculo.getId());
        if(existeVeiculo){
            //Excecao
        }else{
            this.repositorioVeiculo.cadastrar(veiculo);
        }
    }
    
    /**
     *
     * @param veiculo
     * @param id
     */
    public void alterarId(Veiculo veiculo, String id){
       veiculo.setId(id);
       this.repositorioVeiculo.alterar(veiculo);
   }
    
    /**
     *
     * @param veiculo
     * @param cliente
     * @param placa
     * @param modelo
     * @param cor
     * @param marca
     */
    public void alterarDadosDoVeiculo(Veiculo veiculo,Cliente cliente, String placa,String modelo,String cor,String marca){
        veiculo.setCliente(cliente);
        veiculo.setCor(cor);
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setPlaca(placa);
        this.repositorioVeiculo.alterar(veiculo);
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Veiculo procurarVeiculo(String id){
        return this.repositorioVeiculo.getObjeto(id);
    }
    
    /**
     *
     * @param id
     */
    public void removerVeiculo(String id){
       this.repositorioVeiculo.remover(id);
   }
   
    /**
     *
     * @return
     */
    public ArrayList<Veiculo> listarTodosVeiculos(){
       return this.repositorioVeiculo.listarTodos();
   }
            
    
    
    

    
}
