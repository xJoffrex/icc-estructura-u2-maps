package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){
        Map<String, String> mapa = new HashMap();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");
        System.out.println("---------------HashMap------------------------");
        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String clave : mapa.keySet()) {
            System.out.println(mapa.get(clave));
        }

        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));


    }

    public void runLinkedHashMap(){
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Steve");
        mapa.put(2, "Thalia");
        mapa.put(3, "Daniel");
        mapa.put(4, "Diana");
        mapa.put(5, "Andres");
        System.out.println("---------------Linked HashMap------------------------");
        for (int valor : mapa.keySet()) {
            System.out.println("Clave: " + valor + " Valor: " + mapa.get(valor));
        }



    }

    public void runTreeMap(){
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(3, "Carro");
        mapa.put(6, "Bicicleta");
        mapa.put(1, "Moto");

        System.out.println("---------------TREE MAP------------------------");
        
        for (int valor : mapa.keySet()) {
            System.out.println("Clave: " + valor + " Valor: " + mapa.get(valor));
        }

    }

    public void runHashMapObj(){
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        System.out.println("---------------HashMapObj------------------------");
        
        for (Empleado valor : empleados.keySet()) {
            System.out.println("Clave: " + valor + " Valor: " + empleados.get(valor));
        }       
    }

    public void runTreeMapObj(){
        Map<Empleado, Integer> empleados = new TreeMap<>();
        
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        

        System.out.println("---------Tree Map Object-----------");
        for (Empleado valor : empleados.keySet()) {
            System.out.println("Clave: " + valor + " Valor: " + empleados.get(valor));
        }   
    }

}
