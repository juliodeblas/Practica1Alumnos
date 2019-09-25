/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Usuario DAM 2
 */
public class Colegio {

    private Hashtable<String, Alumno> listaAlumnos;
    private ArrayList<Integer> listaMatriculas = new ArrayList<Integer>();

    public Colegio() {
        listaAlumnos = new Hashtable<>();
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.put(alumno.getDni(), alumno);
        listaMatriculas.add(alumno.getMatricula());
    }

    public void eliminarAlumno(String dni) {
        listaAlumnos.remove(dni);
        listaMatriculas.remove(dni);
    }

    public boolean estaAlumno(String dni) {
        return listaAlumnos.containsKey(dni);
    }

    public boolean estaMatricula(int matricula) {
        if (listaMatriculas.contains(matricula)) {
            return true;
        }else
            return false;
    }

    public void listarAlumnos() {
        Enumeration<Alumno> listaalumno = listaAlumnos.elements();

        while (listaalumno.hasMoreElements()) {
            Alumno a = listaalumno.nextElement();
            System.out.println(a.toString());
        }
    }

    public void listarDnis() {
        Enumeration<Alumno> listadni = listaAlumnos.elements();

        while (listadni.hasMoreElements()) {
            Alumno alumnoDni = listadni.nextElement();
            System.out.println(alumnoDni.getDni());
        }
    }

    public void buscarAlumno(String dniBuscar) {
        Alumno alumnoBuscar = listaAlumnos.get(dniBuscar);
        System.out.println(alumnoBuscar);
    }
}
