import pojos.*;

import java.util.Calendar;

public class Main {
    public  static void main(String [] args){
       //INFORDATA
        System.out.println("===================================================================================================================================================");
        System.out.println("=========================================  *  *  *  I  N  F  O  R  D  A  T  A  *  *  *   ==========================================================");
        System.out.println("===================================================================================================================================================");
        //producto
        System.out.print("1.");
        Producto producto= new Producto("12345","Teclado");
        System.out.println(producto);

        //alquilable
        System.out.print("2.");
        Alquilable alquilable= new Alquilable("78945","Monitor",20.5);
        System.out.println(alquilable);

        //tecnologico
        System.out.print("3.");
        Empresa empresa= new Empresa("DELUX","Av. San Martin",20);
        Tecnologico tecnologico= new Tecnologico("159","Vsotro 1000","USA", Calendar.getInstance().getTime(),empresa);
        System.out.println(tecnologico);

        //monitor
        System.out.print("4.");
        Monitor monitor= new Monitor("f45","Monitor 20",30.5,"4K-Full HD");
        System.out.println(monitor);

        //producto
        System.out.print("5.");
        Empresa toshiva= new Empresa("Toshiva","Av. BlancoGAlindo",50);
        Cpu cpu= new Cpu("45DF","Satellite","China",Calendar.getInstance().getTime(), empresa);
        System.out.println(cpu);

//--------------------------------------------------------------------------------------------------------------------------------

        /*//POLIMORFISMO
        System.out.println("================================================================================");
        System.out.println("==================*  *  *  I  N  F  O  R  D  A  T  A  *  *  *===================");
        System.out.println("================================================================================");
        Producto producto = new Producto("G156","Genius78");

        Producto  lk56 = new Impresora("k956","Canon123",30);
        //System.out.println(lk56);
        Producto s56 = new Monitor("gh56","Samnsung",15,"4K");
        //System.out.println(s56);
        Producto m900= new Discoduro("hi890", "Maxtor78",15.6,500);
        //System.out.println(m900);

        Impresora impresora =(Impresora)lk56;
        //System.out.println(impresora);
        Monitor monitor =(Monitor)s56;
        //System.out.println(monitor);
        Discoduro discoduro=(Discoduro)m900;
        //System.out.println(discoduro);

        Producto[]productos = new Producto[3];
        productos[0]=impresora;
        productos[1]=monitor;
        productos[2]=discoduro;
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }*/

//--------------------------------------------------------------------------------------------------------------------------------

        /*//INTERFACES
        System.out.println("=====================================");
        System.out.println("===*  *  *R  E  S  E  T  *  *  *  ===");
        System.out.println("=====================================");
        Monitor lg1092= new Monitor("FB56","Lg",20.5,"4K");
        lg1092.reset();
        Discoduro sc1000= new Discoduro("56-LK","ASUs",56.2,152);
        sc1000.reset();*/

//--------------------------------------------------------------------------------------------------------------------------------

        /*//CLASES ABSTRACTAS
        System.out.println("=====================================");
        System.out.println("===*  *  *R  E  S  E  T  *  *  *  ===");
        System.out.println("=====================================");
        Monitor lg1092= new Monitor("FB56","Lg",20.5,"4K");
        System.out.print("Monitor:");
        lg1092.estado();
        System.out.print("Disco Duro:");
        Discoduro sc1000= new Discoduro("56-LK","ASUs",56.2,152);
        sc1000.estado();*/

    }
}
