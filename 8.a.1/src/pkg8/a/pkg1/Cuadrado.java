
package pkg8.a.pkg1;

public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(String nombre, int par, int posicionX, String color, int par2) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }


@Override    

public double calcularArea(){
    return lado * lado;
}

public double calcularPerimetro(){
return 4 * lado;
}


}
