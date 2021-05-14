package ar.unr.model;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Empresa {

    private static ArrayList<String> puesto = new ArrayList<>();
    private String nombre;
    private Empleado director;


    public Empresa(String nombre, ArrayList<String> puestos, Empleado director){
        if (nombre == null ||nombre.isEmpty())
            throw new RuntimeException("Debe cargar un nombre");
        if (puestos.size()==0)
            throw new RuntimeException("Debe cargar la estructura de la empresa");
        if (director ==null){
            throw new RuntimeException("La empresa tiene que tener un director");
        }
        this.nombre = nombre;
        this.director = director;
        puesto = puestos;
    }

    public Double generarSueldosDeEmpleados(){
        return this.director.calcularSueldo();
    }


}
