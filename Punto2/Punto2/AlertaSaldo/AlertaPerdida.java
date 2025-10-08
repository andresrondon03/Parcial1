package Punto2.AlertaSaldo;

public class AlertaPerdida implements AlertaSaldo {
    
    @Override
    public void AlertaSaldo (){
        System.out.println("Su saldo cayo por debajo de su umbral preestablecido");
    }
}
