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
public class StrategyTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Establecimiento de fechas de entrada y salida para el trabajador de base
        Date[] entradas = {new Date(122, 9,21, 8, 0, 0), new Date(122, 9,22, 8, 0, 0), new Date(122, 9,23, 7, 0, 0), new Date(122, 9,24, 8, 0, 0), new Date(122, 9,25, 9, 0, 0)};
        Date[] salidas = {new Date(122, 9,21, 16, 0, 0), new Date(122, 9,22, 17, 0, 0), new Date(122, 9,23, 18, 0, 0),  new Date(122, 9,24, 16, 0, 0),  new Date(122, 9,25, 17, 0, 0)};
        
        //Calculo de las horas trabajadas por el trabajador de base
        Base base = new Base(new TiempoTrabajoBase());
        base.setEntradas(entradas);
        base.setSalidas(salidas);
        long horasTrabajadasBase = base.calculaTiempo().tiempoT(base.getEntradas(), base.getSalidas());
        System.out.println("El trabajador base acumuló " + horasTrabajadasBase + " horas trabajadas en la semana");
        
        
        //Calculo de las horas trabajadas por el trabajador de confianza
        Confianza confianza = new Confianza(new TiempoTrabajoConfianza());
        long horasTrabajadasConfianza = confianza.calculaTiempo().tiempoT(confianza.getEntradas(), confianza.getSalidas());
        System.out.println("El trabajador de confianza acumuló " + horasTrabajadasConfianza + " horas trabajadas en la semana");
        
        
        
    }
    
}
