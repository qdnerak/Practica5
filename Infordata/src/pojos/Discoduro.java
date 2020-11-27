package pojos;

import Interfaces.IReseteable;

public class Discoduro extends Alquilable implements IReseteable {
    private int capacidad;
    public Discoduro(String codigo, String modelo, double precioHora, int capacidad){
        super(codigo, modelo, precioHora);
        this.setCapacidad(capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void reset() {
        System.out.println("Formateando disco duro...");
    }

   /* @Override
    public void estado() {
        System.out.println("Sectores defectuoso:" + 1420);
    }*/
}
