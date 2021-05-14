package ar.unr.model;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Empresa {

    private String nombre;
    private Empleado director;


    public Empresa(String nombre, Empleado director){
        if (nombre == null ||nombre.isEmpty())
            throw new RuntimeException("Debe cargar un nombre");
        if (director ==null){
            throw new RuntimeException("La empresa tiene que tener un director");
        }
        this.nombre = nombre;
        this.director = director;
    }

    public Double generarSueldosDeEmpleados(){
        return this.director.calcularSueldo();
    }


}
