package Punto2.NotificacionTransaccion;

public class Resumen implements NotificacionTransaccion {
    @Override
    public void NotificacionTransaccion(){
        System.out.println("Resumen de la transaccion");
    }
}
