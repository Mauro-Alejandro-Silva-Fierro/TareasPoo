
package pkg8.b.pkg6;


class Demo {

    public void metodoNoFinal() {
        System.out.println("Método no final en Demo");
    }

    public final void metodoFinal() {
        System.out.println("Método final en Demo");
    }
}


class SubDemo extends Demo {

    @Override
    public void metodoNoFinal() {
        System.out.println("Método sobreescrito en SubDemo");
    }


}

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.metodoNoFinal(); 
        demo.metodoFinal();    

        SubDemo subDemo = new SubDemo();
        subDemo.metodoNoFinal(); 
        subDemo.metodoFinal();  
    }
}
