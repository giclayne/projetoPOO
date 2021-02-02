/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.implementacoes;

import icontratos.controllers.RepositorioTipoLavagem;
import java.util.ArrayList;
import model.TipoLavagem;

/**
 *
 * @author giclayne
 */
public class ImplTipoLavagem {
    private RepositorioTipoLavagem repositorioTipoLavagem;

    /**
     *
     * @param repositorioTipoLavagem
     */
    public ImplTipoLavagem(RepositorioTipoLavagem repositorioTipoLavagem) {
        this.repositorioTipoLavagem = repositorioTipoLavagem;
    }

    /**
     *
     * @param tipoLavagem
     */
    public void cadastrarTipoLavagem(TipoLavagem tipoLavagem){
        boolean existeTipoLavagem = repositorioTipoLavagem.verificar(tipoLavagem.getId());
        if(existeTipoLavagem){
            //ExcecaoPessoaJaCadastrada
        }else{
            this.repositorioTipoLavagem.cadastrar(tipoLavagem);
        }
    }
     
    /**
     *
     * @param tipoLavagem
     * @param id
     */
    public void alterarID(TipoLavagem tipoLavagem, String id){
       tipoLavagem.setId(id);
       this.repositorioTipoLavagem.alterar(tipoLavagem);
   }
     
    /**
     *
     * @param tipoLavagem
     * @param descricao
     * @param nome
     * @param valor
     */
    public void alterarTipoLavagem(TipoLavagem tipoLavagem,String descricao,String nome,double valor){
         tipoLavagem.setDescricao(descricao);
         tipoLavagem.setNome(nome);
         tipoLavagem.setValor(valor);
         this.repositorioTipoLavagem.alterar(tipoLavagem);
     }
     
    /**
     *
     * @param id
     * @return
     */
    public TipoLavagem procurarTipoLavagem(String id){
        return this.repositorioTipoLavagem.getObjeto(id);
    }
    
    /**
     *
     * @param id
     */
    public void removerTipoLavagem(String id){
       this.repositorioTipoLavagem.remover(id);
   }
   
    /**
     *
     * @return
     */
    public ArrayList<TipoLavagem> listarTodosTipoLavagem(){
       return this.repositorioTipoLavagem.listarTodos();
   }
    
}
