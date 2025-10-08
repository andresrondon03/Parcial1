package Punto1.Observer;

import Punto1.Subject.Curso;

public interface Observer {
    String getNombre();

    void update (Curso curso);
}