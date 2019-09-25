/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Colegio colegio = new Colegio();

        do {
            System.out.println("1.Agregar alumno");
            System.out.println("2.Buscar alumno");
            System.out.println("3.Borrar alumno");
            System.out.println("4.Listar alumnos");
            System.out.println("5.Listar dnis");
            System.out.println("6.Salir");
            System.out.println("Introduzca la opción que desee: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    String nombre,
                     apellido,
                     dni;
                    int matricula;

                    System.out.println("Introduzca el dni");
                    dni = sc.next();

                    if (!colegio.estaAlumno(dni)) {
                        System.out.println("Introduzca el nombre");
                        nombre = sc.next();
                        System.out.println("Introduzca el apellido");
                        apellido = sc.next();
                        sc.nextLine();
                        matricula = (int) (Math.random() * 100000);
                        if (!colegio.estaMatricula(matricula)) {
                            Alumno alumno = new Alumno(nombre, apellido, dni, matricula);
                            colegio.agregarAlumno(alumno);
                            System.out.println("Alumno registrado con éxito");
                        } else {
                            System.out.println("Error de registro. La matrícula ya existe.");
                        }
                    } else {
                        System.out.println("No se puede porque ya existe");
                    }
                    break;
                case 2:
                    String dniBuscar;
                    System.out.println("Introduzca el dni del alumno que desea");
                    dniBuscar = sc.next();

                    if (colegio.estaAlumno(dniBuscar)) {
                        colegio.buscarAlumno(dniBuscar);
                    } else {
                        System.out.println("El alumno que busca no existe");
                    }
                    break;
                case 3:
                    String dniEliminar;
                    System.out.println("Introduce el dni del alumno que desee eliminar");
                    dniEliminar = sc.next();
                    if (!colegio.estaAlumno(dniEliminar)) {
                        System.out.println("No se puede elminar porque no existe");
                    } else {
                        colegio.eliminarAlumno(dniEliminar);
                        System.out.println("Alumno eliminado");
                    }
                    break;
                case 4:
                    colegio.listarAlumnos();
                    break;
                case 5:
                    colegio.listarDnis();
                    break;
                case 6:
                    System.out.println("Has salido con éxito");
                    break;
            }

        } while (opcion != 6);
    }

}
