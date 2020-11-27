package pojos;

import Interfaces.IReseteable;

public class Impresora extends  Producto implements IReseteable {
    private int velocidad;
    public Impresora(String codigo, String modelo, int velocidad){
        super(codigo, modelo);
        this.setVelocidad(velocidad);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void reset() {
        System.out.println();
    }

    /*@Override
    public void estado() {
        System.out.println("Paginas impresas:"+15240);
    }*/
}
