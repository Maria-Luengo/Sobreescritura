package com.ceep.dominio;

public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura; //tipoEscritura es un ENUM

   

    
    public Escritor(TipoEscritura tipoEscritura, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public TipoEscritura getTipoEscritura(){
        return tipoEscritura;
    }

    //sobreescribimos el método de la claser padre
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles()+", Escritor: "+this.tipoEscritura;
    }

}
