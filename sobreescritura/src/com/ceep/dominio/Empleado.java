package com.ceep.dominio;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    //constructores
    public Empleado() { //este vacío lo creo xa que se puede aextender sin errores
    }

    public Empleado( String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarDetalles() {
        return "Nombre: " + this.nombre+", Sueldo: " + this.sueldo;
    }

}
