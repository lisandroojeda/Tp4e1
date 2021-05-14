package ar.unr.model;

public class EmpleadoRegular implements Empleado{
    private String codigoEmpleado;
    private Double sueldo;

    public EmpleadoRegular(String codigoEmpleado, Double sueldo){
        if (codigoEmpleado == null || codigoEmpleado.isEmpty())
            throw new RuntimeException("Debe cargar un codigo");
        if (sueldo<0)
            throw new RuntimeException("El sueldo no puede ser inferior a 0");
        this.codigoEmpleado = codigoEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public Double calcularSueldo() {
        return this.sueldo;
    }

    @Override
    public void nuevoEmpleadoACargo(Empleado empleado) {
        throw new RuntimeException("No puede tener gente a cargo");
    }
}
