package Punto2;

import Punto2.AlertaSaldo.AlertaPerdida;
import Punto2.NotificacionPromocion.Correo;
import Punto2.NotificacionTransaccion.Resumen;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a su gestor de finanzas");

        Usuario usario1 = new Usuario(new AlertaPerdida(), new Correo(), new Resumen());
    }
}
