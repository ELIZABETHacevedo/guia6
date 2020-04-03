/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

/**
 *
 * @author Mery Acevedo
 */
public class empleadoComision extends empleado{
    public double porcentaje,montoVenta;
    
    
    public empleadoComision(String nombre, Double salario,Double porcentaje,Double monto) {
        super(nombre, salario);
        this.porcentaje=porcentaje;
        this.montoVenta=monto;
    }
    
    @Override
    public Double generarSalario(){
        return this.salario+((this.montoVenta*this.porcentaje)/100);
    }
    
    
    
    
}
