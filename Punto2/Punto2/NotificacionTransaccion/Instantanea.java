package Punto2.NotificacionTransaccion;

public class Instantanea implements NotificacionTransaccion {
    
    @Override
    public void NotificacionTransaccion(){
        System.out.println("Cada transaccion");
    }
}
