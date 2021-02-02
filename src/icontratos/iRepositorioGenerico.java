/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontratos;

import java.util.ArrayList;

/**
 *
 * @author giclayne
 * @param <T>
 * @param <G>
 */
public interface iRepositorioGenerico <T,G> {

    /**
     *
     * @param t
     */
    void cadastrar(T t);

    /**
     *
     * @param t
     */
    void alterar(T t);

    /**
     *
     * @param cpf
     * @return
     */
    boolean verificar(G cpf);

    /**
     *
     * @param cpf
     * @return
     */
    T getObjeto(G cpf);

    /**
     *
     * @param cpf
     */
    void remover(G cpf);

    /**
     *
     * @return
     */
    ArrayList<T> listarTodos();
    
}
