/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontratos;

import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author giclayne
 */
public interface iRepositorioPessoa {
    void cadastrarPessoa(Pessoa pessoa);
    void alterarPessoa(Pessoa pessoa);
    boolean verificarPessoa(String cpf);
    Pessoa getPessoa(String cpf);
    void removerPessoa(String cpf);
    ArrayList<Pessoa> listarPessoas();
    
}
