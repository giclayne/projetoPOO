/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author giclayne
 */
public class Veiculo {
    private Cliente cliente;
    private String marca;
    private String modelo;
    private String placa;
    private String cor;

    /**
     *
     * @param cliente
     * @param marca
     * @param modelo
     * @param placa
     * @param cor
     */
    public Veiculo(Cliente cliente, String marca, String modelo, String placa, String cor) {
        this.cliente = cliente;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }

    /**
     *
     */
    public Veiculo() {
    }
    
    

    /**
     *
     * @return
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     *
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     *
     * @return
     */
    public String getCor() {
        return cor;
    }

    /**
     *
     * @param cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Veiculo{" + "cliente=" + cliente + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + '}';
    }
    
    
    
}
