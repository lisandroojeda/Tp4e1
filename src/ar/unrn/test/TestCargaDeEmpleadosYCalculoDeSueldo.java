package ar.unrn.test;

import ar.unr.model.EmpleadoRegular;
import ar.unr.model.Empleador;
import ar.unr.model.Empresa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCargaDeEmpleadosYCalculoDeSueldo {
    @Test
    public void creacionDeEmpresaYcagaDeEmpleados(){
        ArrayList<String> puestos = new ArrayList<>();
        puestos.add("DIRECTOR");
        puestos.add("GERENTE");
        puestos.add("MANDOS MEDIOS");
        puestos.add("LIDER DE PROYECTO");
        puestos.add("EMPLEADO REGULAR");

        Empleador diretor = new Empleador("1",1200.00);
        Empresa empresa = new Empresa("Empresa1",puestos,diretor);


        Empleador gerente1 = new Empleador("10",800.00);

        Empleador mandosMedios1 =new  Empleador("100",650.00);
        Empleador mandosMedios2 =new  Empleador("101",650.00);

        Empleador lideresDeProyecto1 = new Empleador("1000",500.00);
        Empleador lideresDeProyecto2 = new Empleador("1001",500.00);



        Empleador empleado1 = new Empleador("1000",400.00);
        Empleador empleado2 = new Empleador("1001",400.00);
        Empleador empleado3 = new Empleador("1002",400.00);
        Empleador empleado4 = new Empleador("1003",400.00);

        diretor.nuevoEmpleadoACargo(gerente1);

        gerente1.nuevoEmpleadoACargo(mandosMedios1);
        gerente1.nuevoEmpleadoACargo(mandosMedios2);

        mandosMedios1.nuevoEmpleadoACargo(lideresDeProyecto1);
        mandosMedios2.nuevoEmpleadoACargo(lideresDeProyecto2);

        lideresDeProyecto1.nuevoEmpleadoACargo(empleado1);
        lideresDeProyecto1.nuevoEmpleadoACargo(empleado2);
        lideresDeProyecto1.nuevoEmpleadoACargo(empleado3);

        lideresDeProyecto2.nuevoEmpleadoACargo(empleado4);

        Double sueldoEsperado = 5900.00;

        assertEquals(sueldoEsperado,empresa.generarSueldosDeEmpleados());


    }
}
