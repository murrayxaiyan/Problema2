/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luchadores;


public class Tarro extends ApoyoDecorador {
Luchador luchador;
    public Tarro(Luchador luchador) {
        this.luchador = luchador;
    }
    
    @Override
    public int usarMovimientoEspecial() {
        return 25 + luchador.usarMovimientoEspecial();
    }

    @Override
    public String nombreMovimientoEspecial() {
        return " ME SAQUE LA .... +" + luchador.nombreMovimientoEspecial();
    }
    
    
}
