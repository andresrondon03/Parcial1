package Punto2.NotificacionPromocion;

public class Correo implements NotificacionPromocion {
    @Override
    public void NotificacionPromocion(){
        System.out.println("Notificación de promocion por correo electronico");
    }
}
