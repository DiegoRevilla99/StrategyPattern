/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategytrabajador;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author xeng_
 */
public class TiempoTrabajoBase implements TiempoTrabajo {

    @Override
    public long tiempoT(Date[] entrada, Date[] salida) {
        
        System.out.println("\nCalculo de tiempo para Base");
        long horas = 0;
        TimeUnit unidad = TimeUnit.HOURS;
        
        for (int i = 0; i < entrada.length; i++) {
            horas += salida[i].getTime() - entrada[i].getTime() ;
        }
        
        long horasTrabajadas = unidad.convert(horas, TimeUnit.MILLISECONDS);

        return horasTrabajadas;
    }
    
}
