/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.implementacoes;

import icontratos.controllers.RepositorioCliente;
import java.util.ArrayList;
import model.Cliente;
import model.Endereco;

/**
 *
 * @author giclayne
 */
public class ImplCliente {
    private RepositorioCliente repositorioCliente;

    /**
     *
     * @param repositorioCliente
     */
    public ImplCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }
    
    /**
     *
     * @param cliente
     */
    public void cadastrarCliente(Cliente cliente){
        boolean existeCliente = repositorioCliente.verificar(cliente.getCpf());
        if(existeCliente){
            //ExcecaoPessoaJaCadastrada
        }else{
            this.repositorioCliente.cadastrar(cliente);
        }
    }
    
    /**
     *
     * @param cliente
     * @param cpf
     */
    public void alterarCPF(Cliente cliente, String cpf){
       cliente.setCpf(cpf);
       this.repositorioCliente.alterar(cliente);
   }

    /**
     *
     * @param cliente
     * @param nome
     * @param email
     * @param rg
     * @param dataNascimento
     */
    public void alterarDadosPessoais(Cliente cliente,String nome,String email,String rg,String dataNascimento){
       cliente.setNome(nome);
       cliente.setEmail(email);
       cliente.setRg(rg);
       cliente.setDataNascimento(dataNascimento);
       this.repositorioCliente.alterar(cliente);
   }
   
    /**
     *
     * @param cliente
     * @param telefone
     * @param celular
     */
    public void alterarTelefones(Cliente cliente, String telefone,String celular){
       cliente.setTelefone(telefone);
       cliente.setCelular(celular);
       this.repositorioCliente.alterar(cliente);
   }
   
    /**
     *
     * @param endereco
     * @param cliente
     * @param rua
     * @param numero
     * @param bairro
     * @param cidade
     * @param estado
     */
    public void alterarEndereco(Endereco endereco, Cliente cliente, String rua,int numero,String bairro,String cidade,String estado){
       endereco.setRua(rua);
       endereco.setNumeroCasa(numero);
       endereco.setBairro(bairro);
       endereco.setCidade(cidade);
       endereco.setEstado(estado);
       cliente.setEndereco(endereco);
       this.repositorioCliente.alterar(cliente);
   }
   
    /**
     *
     * @param cpf
     * @return
     */
    public Cliente procurarCliente(String cpf){
        return this.repositorioCliente.getObjeto(cpf);
    }
    
    /**
     *
     * @param cpf
     */
    public void removerCliente(String cpf){
       this.repositorioCliente.remover(cpf);
   }
   
    /**
     *
     * @return
     */
    public ArrayList<Cliente> listarTodosClientes(){
       return this.repositorioCliente.listarTodos();
   }
    
}
