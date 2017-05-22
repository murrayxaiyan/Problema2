/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luchadores;


public class Illuminati extends ApoyoDecorador {
Luchador luchador;
    public Illuminati(Luchador luchador) {
        this.luchador = luchador;
    }

    @Override
    public int usarMovimientoEspecial() {
        return 40 + luchador.usarMovimientoEspecial();
    }

    @Override
    public String nombreMovimientoEspecial() {
        return "SALFATEEEEE +" +luchador.nombreMovimientoEspecial();
    }
    

    
}
