/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

/**
 *
 * @author Mery Acevedo
 */
public class pagoContado extends pago{
    public String nombre,dui,direccion;
    
    @Override
    public void pagar(Double saldo){
        this.saldo=saldo;
        System.out.print("el pago se efectuo en sucursal centro");
    }
}
