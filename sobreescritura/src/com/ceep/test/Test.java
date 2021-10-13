package com.ceep.test;

import com.ceep.dominio.*;

//import com.ceep.dominio.Empleado;
//import com.ceep.dominio.Gerente;
public class Test {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Maria", 20000.00);
        e1.mostrarDetalles();
        System.out.println("");
        Gerente g1 = new Gerente("IT", "Ana", 240000.50);
        //System.out.println(g1.mostrarDetalles()); //lo metpo en sout xq mpostrar detalles es FUNCION
        imprimir(e1.mostrarDetalles());
        imprimir(g1.mostrarDetalles());
        imprimirEmpleado(g1); //funciona xq es un Empleado

        System.out.println("");
//        System.out.println("");
//        determonmatTipo(e1);
        System.out.println("");
        determonmatTipo(g1);

        //obj ESCRITOR
        /* Escritor escritor1 = new Escritor(TipoEscritura.MODERNO, "Gema", 30000);
        System.out.println("VAMOS A IMPRIMI ESCRITOR");
        imprimirEmpleado(escritor1);*/
        Empleado e2;
        e2 = new Escritor(TipoEscritura.CLASICO, "Cervantes", 1000);
        System.out.println(e2.mostrarDetalles());
        //e2.getdescripcion(); //no sale xq el objeto  es empleado, por eso hacemos DOWNCASTING
        
        //DOWN CASTING
        System.out.println(((Escritor)e2).getTipoEscritura().getDescripcion()); 
        
        Escritor escritor = (Escritor)e2;
        escritor.getTipoEscritura();
        
        //DOWN CASTING 
        Empleado e3 = escritor; //convierto empleado en escritor, no es necesario poner (Empleado)escritor
        
        
        
        

    }

    public static void imprimir(Object obj) { //esto es POLIMORFISMO
        System.out.println(obj);
    }

    //solicion santi
    public static void imprimirEmpleado(Empleado emp) { //esto es POLIMOSRIFCMOD
        System.out.println(emp.mostrarDetalles());
    }

    //INSTANCE OF -> se pone de lo más específico a lo más global
    //OJO! si no pongo el else y todo es if me salen todos xq son verdaderos
    public static void determonmatTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Empleado es de tipo Gerente");
            //DOWN CASTING
            System.out.println(((Gerente) empleado).getDepartamento());//OJO! me hace un down casting
        } else if (empleado instanceof Empleado) {
            System.out.println("Empleado es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Empleado es de tipo Object");
        }
    }

}
