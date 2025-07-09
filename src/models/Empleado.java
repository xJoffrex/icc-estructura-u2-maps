package models;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    

    public Empleado(int id) {
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }




    @Override
    public int hashCode() {
        return id;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (id != other.id)
            return false;
        return true;
    }



    @Override
    public int compareTo(Empleado o) {
        int comparacionId = Integer.compare(id, o.id);
        if (id != o.id){
            return comparacionId;
        } 
        return 0;
    }
    




    
}