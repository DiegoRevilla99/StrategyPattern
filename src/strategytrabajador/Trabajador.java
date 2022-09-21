/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategytrabajador;

import java.util.Date;

/**
 *
 * @author xeng_
 */
public abstract class Trabajador {
    protected int id;
    protected Date[] entrada;
    protected Date[] salida;
    protected TiempoTrabajo tiempoTrabajo;
    protected int salario;
    protected int periodo;

    Trabajador() {}
    
    
    public TiempoTrabajo calculaTiempo() {
       return tiempoTrabajo;
    }
    
    public Date[] getEntradas() {
        return entrada;
    }

    public void setEntradas(Date[] entrada) {
        this.entrada = entrada;
    }

    public Date[] getSalidas() {
        return salida;
    }

    public void setSalidas(Date[] salida) {
        this.salida = salida;
    }
    
    
}
