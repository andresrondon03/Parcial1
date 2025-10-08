package Punto1.Subject;

import java.util.ArrayList;
import java.util.List;

import Punto1.Observer.Observer;

public class Curso implements Subject{

    private String nombre;
    private String duracion;
    private String descripcion;

    List<Observer> trabajador = new ArrayList<>();
    @Override
    public void registrerObserver(Observer o){
        trabajador.add((Observer) o);
        System.out.println("El trabajador " + o.getNombre() + " ha sido agregado");
    }

    @Override
    public void removeObserver(Observer o){
        trabajador.remove(o);
        System.out.println("El trabajador " + o.getNombre() + " ha sido eliminado");
    }

    @Override
    public void notifyObservers(){
        
        if (trabajador.isEmpty()){
            System.out.println("No hay trabajadores agregados para recibir notificaciones");
            return;
        }

        System.out.println("¡¡Nuevo curso disponible!!. Notificando a los trabajadores... ");
        for (Observer o: trabajador){
            o.update(this);
        }
    }

     public void setTodo(String nombre, String duracion, String descripcion){
        this.nombre = nombre;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
