package controllers;

import java.util.HashMap;
import java.util.Map;


import models.Empleado;

public class EmpleadoDAOHash implements EmpleadoDAO{
    private Map<Empleado, Empleado> empleados;




    public EmpleadoDAOHash(){
        this.empleados = new HashMap<>();
    }


    @Override
    public void add(Empleado emp) {
        this.empleados.put(emp, emp);
        
    }

    @Override
    public void list() {
       for (Empleado emp : empleados.values()) {
            System.out.println(emp);
        }    
    }

    @Override
    public void remove(int id) {
        Empleado temp = new Empleado(id);
        this.empleados.remove(temp);
        
    }
    
    
}
