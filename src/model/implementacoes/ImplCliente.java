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

    public ImplCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }
    
    public void cadastrarCliente(Cliente cliente){
        boolean existeCliente = repositorioCliente.verificar(cliente.getCpf());
        if(existeCliente){
            //ExcecaoPessoaJaCadastrada
        }else{
            this.repositorioCliente.cadastrar(cliente);
        }
    }
    
    
   public void alterarCPF(Cliente cliente, String cpf){
       cliente.setCpf(cpf);
       this.repositorioCliente.alterar(cliente);
   }
   public void alterarDadosPessoais(Cliente cliente,String nome,String email,String rg,String dataNascimento){
       cliente.setNome(nome);
       cliente.setEmail(email);
       cliente.setRg(rg);
       cliente.setDataNascimento(dataNascimento);
       this.repositorioCliente.alterar(cliente);
   }
   
   public void alterarTelefones(Cliente cliente, String telefone,String celular){
       cliente.setTelefone(telefone);
       cliente.setCelular(celular);
       this.repositorioCliente.alterar(cliente);
   }
   
   public void alterarEndereco(Endereco endereco, Cliente cliente, String rua,int numero,String bairro,String cidade,String estado){
       endereco.setRua(rua);
       endereco.setNumeroCasa(numero);
       endereco.setBairro(bairro);
       endereco.setCidade(cidade);
       endereco.setEstado(estado);
       cliente.setEndereco(endereco);
       this.repositorioCliente.alterar(cliente);
   }
   
   public Cliente procurarCliente(String cpf){
        return this.repositorioCliente.getObjeto(cpf);
    }
    
   public void removerCliente(String cpf){
       this.repositorioCliente.remover(cpf);
   }
   
   public ArrayList<Cliente> listarTodosClientes(){
       return this.repositorioCliente.listarTodos();
   }
    
}
