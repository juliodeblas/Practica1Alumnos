/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;

import java.util.ArrayList;

/**
 *
 * @author Usuario DAM 2
 */
public class ColegioArray {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

    public void añadirAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public void quitarAlumno(Alumno alumno) {
        listaAlumnos.remove(alumno);
    }

    public boolean estaDni(String dni) {
        return listaAlumnos.contains(dni);
    }

    public boolean estaMatricula(int matricula) {
        return listaAlumnos.contains(matricula);
    }

    public void listar() {
        if (!listaAlumnos.isEmpty()) {
            for (Alumno a : listaAlumnos) {
                System.out.println(a);
            }
        }
    }

    public void listarDni() {
        if (!listaAlumnos.isEmpty()) {
            for (Alumno a : listaAlumnos) {
                System.out.println(a.getDni());
            }
        }
    }

    public void buscarAlumno(String dniBuscar) {
        if (!listaAlumnos.isEmpty()) {
            for (Alumno a : listaAlumnos) {
                if (a.getDni().equals(dniBuscar)) {
                    System.out.println(a);;
                }
            }
        }
    }
}
