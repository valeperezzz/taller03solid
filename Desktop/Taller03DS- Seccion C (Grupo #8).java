//package com.example;
//Clase Pago
public abstract class Pago {
    
    public abstract void realizarCobro(double monto) throws PagoException;
}
//Clase PagoPayPal
public class PagoPayPal extends Pago {
    private boolean loggedIn;

    @Override
    public void realizarCobro(double monto) throws PagoException {
        if (!loggedIn) {
             throw new PagoException("No hay sesión activa en PayPal");
        }
        
    }
}
//Clase Facturacion
public class Facturacion{
    
    public void generarFactura(Pago p){
        //se implementa el metodo
    }
}
//CLase calculador Impuestos
public class calculadorImpuestos{
public void calculoImpuestosFactura(Pago p){
//implementacion del metodo

}
}
//Clase Compra
public class Compra {
  
    private Pago medioDePago;
    private List<Articulo> articulos;

    
    public Compra(Pago medioDePago) {
       //implementacion metodo
    }

    public void agregarArticulo(Articulo articulo) {
        //implementacion metodo
    }

    public void removerArticulo(Articulo articulo) {
      //implementacion
    }
    
    public void procesarCompra(double total) {
        
       //implementacion metodo
    }
}
//interfaz Notificacion
public interface Notificacion{

    void notificar(Pago p);
}








