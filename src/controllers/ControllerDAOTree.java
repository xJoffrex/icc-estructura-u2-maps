package controllers;

import models.Empleado;

public class ControllerDAOTree implements EmpleadoDAO{

    private EmpleadoDAO Emp;

    public ControllerDAOTree(EmpleadoDAO Emp){
        this.Emp = Emp;
    }

    @Override
    public void add(Empleado EmpN){
        Emp.add(EmpN);
    }
    @Override
    public void list() {
        Emp.list();
    }
    @Override
    public void remove(int id) {
        Emp.remove(id);
    }



}

