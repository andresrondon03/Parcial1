package Punto2;

import Punto2.AlertaSaldo.AlertaSaldo;
import Punto2.NotificacionPromocion.NotificacionPromocion;
import Punto2.NotificacionTransaccion.NotificacionTransaccion;

public class Usuario {
    private AlertaSaldo alertaSaldo;
    private NotificacionPromocion notificacionPromocion;
    private NotificacionTransaccion notificacionTransaccion;

    public Usuario(AlertaSaldo alertaSaldo, NotificacionPromocion notificacionPromocion, NotificacionTransaccion notificacionTransaccion){
        this.alertaSaldo = alertaSaldo;
        this.notificacionPromocion = notificacionPromocion;
        this.notificacionTransaccion = notificacionTransaccion;
    }

    public void AlertaSaldo(){
        alertaSaldo.AlertaSaldo();
    }

    public void NotificacionPromocion(){
        notificacionPromocion.NotificacionPromocion();
    }

    public void notificacionTransaccion(){
        notificacionTransaccion.NotificacionTransaccion();
    }

    public void setAlertaSaldo(AlertaSaldo alertaSaldo){
        this.alertaSaldo = alertaSaldo;
    }

    public void setNotificacionPromocion(NotificacionPromocion notificacionPromocion){
        this.notificacionPromocion = notificacionPromocion;
    }

    public void setNotificacionTransaccion(NotificacionTransaccion notificacionTransaccion){
        this.notificacionTransaccion = notificacionTransaccion;
    }
}
