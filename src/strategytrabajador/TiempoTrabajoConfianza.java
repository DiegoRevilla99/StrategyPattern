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
public class TiempoTrabajoConfianza implements TiempoTrabajo{
    
    @Override
    public long tiempoT(Date[] entrada, Date[] salida) {
        System.out.println("\nCalculo de tiempo para Confianza");
        return 48;
    }
    
}
