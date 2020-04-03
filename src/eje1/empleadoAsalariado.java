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
public class empleadoAsalariado extends empleado{
    
    
    public empleadoAsalariado(String nombre, Double salario) {
        super(nombre, salario);
        
    }
    
    @Override
    public Double generarSalario(){
        return this.salario;
    }
    
    
    
}
