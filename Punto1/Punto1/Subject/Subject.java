package Punto1.Subject;

public interface Subject {
    void registrerObserver(Punto1.Observer.Observer o);
    void removeObserver(Punto1.Observer.Observer o);
    void notifyObservers();
}