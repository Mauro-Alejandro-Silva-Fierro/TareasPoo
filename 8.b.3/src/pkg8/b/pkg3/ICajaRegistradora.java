
package pkg8.b.pkg3;


    public interface ICajaRegistradora {
  
    String getNombre();
       
    int getNumTipoMonedas();    
    
    int getUnidadesTipoMoneda(double tipo);
        
    boolean meterMonedas(double tipo, int unidades);
       
    boolean monedaValida(double tipo);
       
    boolean sacarMonedas(double tipo, int unidades);
        
    void vaciarCajaRegistradora();
    
    double[] getTiposDeMonedas();
     
    double getSaldo();
}

    

