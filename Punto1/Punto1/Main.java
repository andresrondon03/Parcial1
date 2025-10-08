package Punto1;

import Punto1.Subject.Curso;
import Punto1.Observer.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Universidad Central de Oriente");
        Curso curso = new Curso();

        Webmaster andrea= new Webmaster("Andrea Mahecha");
        Periodista luzDary= new Periodista("Luz Dary Varela");
        CommunityManager laura= new CommunityManager("Laura Molano");


        curso.registrerObserver(andrea);
        curso.registrerObserver(luzDary);
        curso.registrerObserver(laura);
        
        Curso c1 = new Curso();
        curso.notifyObservers();

        Curso c2 = new Curso();
        curso.notifyObservers();
    }
        
}
