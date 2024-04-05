package com.softtek.presentacion;

import com.softtek.modelo.Empleado;
import com.softtek.modelo.Gerente;
import com.softtek.modelo.Operador;
import com.softtek.modelo.Vendedor;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.setNombre("Luis");
        e1.setSueldo(1075.23);
        System.out.println(e1.toString());
        System.out.println(e1.calcularNomina());

        Operador o1 = new Operador("Pedro",1208.87,60,0.02);
        System.out.println(o1.toString());
        System.out.println(o1.calcularNomina());

        Vendedor v1 = new Vendedor("Fran",1300.30,240,0.03);
        System.out.println(v1.toString());
        System.out.println(v1.calcularNomina());

        Gerente g1 = new Gerente("Jose",1280.42,1.08);
        System.out.println(g1.toString());
        System.out.println(g1.calcularNomina());
    }
}
