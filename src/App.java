import java.util.Arrays;

import controllers.ControllerDAOHash;
import controllers.ControllerDAOTree;
import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHash;
import controllers.EmpleadoDAOTree;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Steve Brito"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();
        runEjerccios();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        //Mapa mapa = new Mapa();
        //mapa.runHashMap();
        //mapa.runLinkedHashMap();
        //mapa.runTreeMap();
        //mapa.runHashMapObj();
       // mapa.runTreeMapObj();
        runEmpleadoExample();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTree(); 
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHash();

        EmpleadoDAO ControllerDAOTree = new ControllerDAOTree(empleadoDAOTree);
        EmpleadoDAO ControllerDAOHash = new ControllerDAOHash(empleadoDAOHash);


        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");

        ControllerDAOHash.add(emp1);
        ControllerDAOHash.add(emp2);
        ControllerDAOHash.add(emp3);
        ControllerDAOHash.add(emp4);
        ControllerDAOHash.add(emp5);

        ControllerDAOTree.add(emp1);
        ControllerDAOTree.add(emp2);
        ControllerDAOTree.add(emp3);
        ControllerDAOTree.add(emp4);
        ControllerDAOTree.add(emp5);



        //Hash
        System.out.println("*****Lista Hash*******");
        ControllerDAOHash.list();
        System.out.println("***Lista Hash Sin 2*****");
        ControllerDAOHash.remove(2);
        ControllerDAOHash.list();

        //Tree
        System.out.println("*******Tree******");
        ControllerDAOTree.list();
        
        System.out.println("*******Lista Tree Sin 2******");
        ControllerDAOTree.remove(2);
        ControllerDAOTree.list();

    }

    private static void runEjerccios() {
        Ejercicios s = new Ejercicios();

        System.out.println("Ejercicio 1");
        System.out.println(Ejercicios.areAnagrams("listen", "silent")); // true
        System.out.println(Ejercicios.areAnagrams("hello", "bello"));   // false
        System.out.println(Ejercicios.areAnagrams("triangle", "integral")); // true

        System.out.println("Ejercicio 2");
        System.out.println(Arrays.toString(s.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5))); // [1, 2]
        System.out.println(Arrays.toString(s.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10))); // null

        System.out.println("Ejercicio 3");
        s.contarCaracteres("hola");

        System.out.println("Ejercicio 4");
        System.out.println(s.sonAnagramas("roma", "amor")); // true

    }
}
