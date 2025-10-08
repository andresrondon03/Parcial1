package Punto1.Observer;

import Punto1.Subject.Curso;

public class Periodista implements Observer {

    String nombre;

    // Se agrega el método constructor
    public Periodista (String nombre){
        this.nombre=nombre;
    }

    // Se agregan los métodos getter para Nombre
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void update (Curso curso) {
        System.out.println("El periodista recibio una notificacion");
    }
}   
