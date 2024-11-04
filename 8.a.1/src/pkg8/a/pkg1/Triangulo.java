
package pkg8.a.pkg1;

public class Triangulo extends Forma {
    
   private int base;
   private int altura;

    public Triangulo(int base, int altura, String nombre, double posicionX, double posicionY, String color) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public double calcularArea(){
    return (base*altura)/2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
