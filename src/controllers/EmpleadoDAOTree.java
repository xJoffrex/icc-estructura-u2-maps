package controllers;


import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTree implements EmpleadoDAO{
    private TreeMap<Empleado, Empleado> empleados;




    public EmpleadoDAOTree(){
        this.empleados = new TreeMap<>();
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
