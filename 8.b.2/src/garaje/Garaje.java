
package garaje;


import java.util.ArrayList;

public class Garaje implements iGarage {
    private ArrayList<Vehiculo> vehiculos;
    private static final int MAX_ESPECIAS = 10;

    public Garaje() {
        vehiculos = new ArrayList<>();
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (vehiculos.size() < MAX_ESPECIAS) {
            if (vehiculo.getPlaca() != null) {
                double ocupacionMotos = (double) calcularOcupacionPorTipoVehiculo(new Moto("", 0, 0, false)) / vehiculos.size();
                if (!(vehiculo instanceof Moto && ocupacionMotos >= 0.8)) {
                    vehiculos.add(vehiculo);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean retirarVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca() != null && v.getPlaca().equals(matricula)) {
                vehiculos.remove(v);
                return true;
            }
        }
        return false;
    }

    @Override
    public double calcularIngresos() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getCuotaMesGaraje();
        }
        return total;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int count = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getClass() == v.getClass()) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}


