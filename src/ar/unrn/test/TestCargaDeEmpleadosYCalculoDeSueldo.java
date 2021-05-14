package ar.unrn.test;

import ar.unr.model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCargaDeEmpleadosYCalculoDeSueldo {
    @Test
    public void creacionDeEmpresaYcagaDeEmpleados(){

        EmpleadoDirector director = new EmpleadoDirector("1",1200.00);
        Empresa empresa = new Empresa("Empresa1",director);


        EmpleadoGerente gerente1 = new EmpleadoGerente("10",800.00);

        EmpleadoMandoMedio mandosMedios1 =new EmpleadoMandoMedio("100",650.00);
        EmpleadoMandoMedio mandosMedios2 =new EmpleadoMandoMedio("101",650.00);

        EmpleadoLiderDeProyecto lideresDeProyecto1 = new EmpleadoLiderDeProyecto("1000",500.00);
        EmpleadoLiderDeProyecto lideresDeProyecto2 = new EmpleadoLiderDeProyecto("1001",500.00);



        EmpleadoRegular empleado1 = new EmpleadoRegular("1000",400.00);
        EmpleadoRegular empleado2 = new EmpleadoRegular("1001",400.00);
        EmpleadoRegular empleado3 = new EmpleadoRegular("1002",400.00);
        EmpleadoRegular empleado4 = new EmpleadoRegular("1003",400.00);

        director.nuevoEmpleadoACargo(gerente1);

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
