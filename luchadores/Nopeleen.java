/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luchadores;


public class Nopeleen extends ApoyoDecorador {
Luchador luchador;
    public Nopeleen(Luchador luchador) {
        this.luchador = luchador;
    }

    @Override
    public int usarMovimientoEspecial() {
        return 30 + luchador.usarMovimientoEspecial();
    }

    @Override
    public String nombreMovimientoEspecial() {
        return " NO SE PELEEN +" + luchador.nombreMovimientoEspecial();
    }
    
    
}
