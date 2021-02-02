/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author giclayne
 */
public class Lavagem {

    private Veiculo veiculo;
    private Funcionario funcionario;
    private String hora, data, status;

    /**
     *
     * @param veiculo
     * @param funcionario
     */
    public Lavagem(Veiculo veiculo, Funcionario funcionario) {
        this.veiculo = veiculo;
        this.funcionario = funcionario;
        this.status = "Lavagem não concluída";

        Calendar c = Calendar.getInstance();
        c.add(Calendar.HOUR, -1);
        Date data = c.getTime();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("DD/MM/YYYY");

        SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:MM");
        this.hora = horaFormatada.format(data);
        this.data = dataFormatada.format(data);
    }

    /**
     *
     * @return
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     *
     * @param veiculo
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     *
     * @return
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     *
     * @param funcionario
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     *
     * @return
     */
    public String getHora() {
        return hora;
    }

    /**
     *
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     *
     */
    public void concluirStatus(){
        this.status = "Lavagem Concluída";
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Lavagem{" + "veiculo=" + veiculo + ", funcionario=" + funcionario + ", hora=" + hora + ", data=" + data + ", status=" + status + '}';
    }
    
    
    

}
