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
    private String id;
    private Veiculo veiculo;
    private Funcionario funcionario;
    private TipoLavagem tipoLavagem;
    private String hora, data, status;

    /**
     *
     * @param id
     * @param veiculo
     * @param funcionario
     * @param tipoLavagem
     */
    public Lavagem(String id,Veiculo veiculo, Funcionario funcionario,TipoLavagem tipoLavagem) {
        this.veiculo = veiculo;
        this.funcionario = funcionario;
        this.tipoLavagem = tipoLavagem;
        this.id = id;
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
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     *
     */
    public void concluirStatus(){
        this.status = "Lavagem Concluída";
    }

    public TipoLavagem getTipoLavagem() {
        return tipoLavagem;
    }

    public void setTipoLavagem(TipoLavagem tipoLavagem) {
        this.tipoLavagem = tipoLavagem;
    }

    @Override
    public String toString() {
        return "Lavagem{" + "id=" + id + ", veiculo=" + veiculo + ", funcionario=" + funcionario + ", tipoLavagem=" + tipoLavagem + ", hora=" + hora + ", data=" + data + ", status=" + status + '}';
    }
    
    
    
    
    

}
