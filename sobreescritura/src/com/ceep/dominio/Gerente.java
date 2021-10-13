
package com.ceep.dominio;


public class Gerente extends Empleado{
    private String departamento; //privado xq es la clase hija

    public Gerente() {
    }

//constructor de Gerenere mas la claser padre
    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //G&S
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

   
    //OJO mostrar con return
    public String mostrarDetalles(){
        return super.mostrarDetalles()+ "Gerente: " +this.departamento;
        //System.out.println("Departamento: "+this.departamento);
    }
    
    
    
    
    
}
