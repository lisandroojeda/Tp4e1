package ar.unr.model;

import java.util.ArrayList;

public abstract class Empleador implements Empleado{

    private String codigoEmpleado;
    protected ArrayList<Empleado> nominaEmpleados;
    private Double sueldo;

    public Empleador (String codigoEmpleado, Double sueldo){
        if (codigoEmpleado == null || codigoEmpleado.isEmpty())
            throw new RuntimeException("Debe cargar un codigo");
        if (sueldo<0)
            throw new RuntimeException("El sueldo no puede ser inferior a 0");
        this.codigoEmpleado = codigoEmpleado;
        this.sueldo = sueldo;
        this.nominaEmpleados = new ArrayList<>();
    }


    @Override
    public Double calcularSueldo() {
        Double sueldoAcumulado= 0.00;
        for (Empleado emp: this.nominaEmpleados){
            sueldoAcumulado = sueldoAcumulado + emp.calcularSueldo(); //ver su sueldo cuantas veces lo tendria que sumar
        }
        return this.sueldo + sueldoAcumulado;
    }

    @Override
    public void nuevoEmpleadoACargo(Empleado empleado) {
        this.nominaEmpleados.add(empleado);
    }
}
