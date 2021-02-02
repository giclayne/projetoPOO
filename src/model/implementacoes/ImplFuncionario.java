/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.implementacoes;

import icontratos.controllers.RepositorioFuncionario;
import java.util.ArrayList;
import model.Endereco;
import model.Funcionario;

/**
 *
 * @author giclayne
 */
public class ImplFuncionario {

    private RepositorioFuncionario repositorioFuncionario;

    /**
     *
     * @param repositorioFuncionario
     */
    public ImplFuncionario(RepositorioFuncionario repositorioFuncionario) {
        this.repositorioFuncionario = repositorioFuncionario;
    }

    /**
     *
     * @param funcionario
     */
    public void cadastrarFuncionario(Funcionario funcionario) {
        boolean existeFuncionario = repositorioFuncionario.verificar(funcionario.getCpf());
        if (existeFuncionario) {
            //excecao pessoa cadastrada
        } else {
            this.repositorioFuncionario.cadastrar(funcionario);
        }
    }

    /**
     *
     * @param funcionario
     * @param cpf
     */
    public void alterarCPF(Funcionario funcionario, String cpf) {
        funcionario.setCpf(cpf);
        this.repositorioFuncionario.alterar(funcionario);
    }

    /**
     *
     * @param funcionario
     * @param nome
     * @param email
     * @param rg
     * @param codigo
     * @param cargo
     */
    public void alterarDadosPessoais(Funcionario funcionario, String nome, String email, String rg, int codigo, String cargo) {
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setRg(rg);
        funcionario.setCodigo(codigo);
        funcionario.setCargo(cargo);
        this.repositorioFuncionario.alterar(funcionario);

    } 
    
    /**
     *
     * @param funcionario
     * @param telefone
     * @param celular
     */
    public void alterarTelefones(Funcionario funcionario, String telefone, String celular) {
        funcionario.setTelefone(telefone);
        funcionario.setCelular(celular);
        this.repositorioFuncionario.alterar(funcionario);
    }

    /**
     *
     * @param endereco
     * @param funcionario
     * @param rua
     * @param numero
     * @param bairro
     * @param cidade
     * @param estado
     */
    public void alterarEndereco(Endereco endereco, Funcionario funcionario, String rua, int numero, String bairro, String cidade, String estado) {
        endereco.setRua(rua);
        endereco.setNumeroCasa(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        funcionario.setEndereco(endereco);
        this.repositorioFuncionario.alterar(funcionario);
    }

    /**
     *
     * @param cpf
     * @return
     */
    public Funcionario procurarFuncionario(String cpf) {
        return this.repositorioFuncionario.getObjeto(cpf);
    }

    /**
     *
     * @param cpf
     */
    public void removerFuncionario(String cpf) {
        this.repositorioFuncionario.remover(cpf);
    }

    /**
     *
     * @return
     */
    public ArrayList<Funcionario> listarTodosFuncionarios() {
        return this.repositorioFuncionario.listarTodos();
    }

}
