
package pkg8.a.pkg4;


   public class A4 {
    public static void main(String[] args) {
       
        Coche coche1 = new Coche("Toyota", "Rojo", 20000, 0.2, 2018);
        coche1.setDniTitular("12345678A");
        
    
        Coche coche2 = new Coche("Ford", "Azul", 18000, 0.15, 2020);
        coche2.setDniTitular("87654321B");

       
        coche1.comprarCoche(coche2);
        System.out.println("Nuevo DNI Titular de coche1: " + coche1.getDniTitular());


        CocheMatriculado cocheMatriculado = new CocheMatriculado("Honda", "Negro", 22000, 0.25, 2015,
                "XYZ-1234", "13579246C", 2015, 6);

        System.out.println("Impuesto de matriculación: " + cocheMatriculado.getImpuestoMatriculacion());
    }
}
    
    

