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
public class empleadoHoras extends empleado{
    public int horas;
    
    public empleadoHoras(String nombre, Double salario,int horas) {
        super(nombre, salario);
        this.horas=horas;
    }
    
    @Override
    public Double generarSalario(){
        return this.salario*this.horas;
    }
    
    
}
