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
public class pagoTarjetaCredito extends pago{

    public String pin,cod;
    public pagoTarjetaCredito(String pin,String cod) {
        this.pin=pin;
        this.cod=cod;
    }

    
    
    
@Override
public void pagar(Double pago){
    if(this.cod.equals("123") && this.pin.equals("123456789")){
    this.saldo=pago;
    System.out.print("pago efectuado");
}else{
        System.out.print("el pago no ha sido realizado");
    }
}


    
}
