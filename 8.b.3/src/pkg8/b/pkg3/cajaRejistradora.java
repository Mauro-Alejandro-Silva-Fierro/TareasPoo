
package pkg8.b.pkg3;
 import java.util.HashMap;
import java.util.Map;

public class cajaRejistradora {


public class CajaRegistradora implements ICajaRegistradora {
    private String nombre;
    private Map<Double, Integer> monedas;

    public CajaRegistradora(String nombre) {
        this.nombre = nombre;
        this.monedas = new HashMap<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNumTipoMonedas() {
        return monedas.size();
    }

    @Override
    public int getUnidadesTipoMoneda(double tipo) {
        return monedas.getOrDefault(tipo, -1);
    }

    @Override
    public boolean meterMonedas(double tipo, int unidades) {
        if (monedaValida(tipo) && unidades > 0) {
            monedas.put(tipo, monedas.getOrDefault(tipo, 0) + unidades);
            return true;
        }
        return false;
    }

    @Override
    public boolean monedaValida(double tipo) {
        return tipo == 0.01 || tipo == 0.05 || tipo == 0.10 || tipo == 0.25 || tipo == 1.00 || tipo == 5.00 || tipo == 10.00;
    }

    @Override
    public boolean sacarMonedas(double tipo, int unidades) {
        if (monedas.containsKey(tipo) && monedas.get(tipo) >= unidades) {
            monedas.put(tipo, monedas.get(tipo) - unidades);
            return true;
        }
        return false;
    }

    @Override
    public void vaciarCajaRegistradora() {
        monedas.clear();
    }

    @Override
    public double[] getTiposDeMonedas() {
        return monedas.keySet().stream().mapToDouble(Double::doubleValue).toArray();
    }

    @Override
    public double getSaldo() {
        return monedas.entrySet().stream().mapToDouble(entry -> entry.getKey() * entry.getValue()).sum();
    }
}

    
}
