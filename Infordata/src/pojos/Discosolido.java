package pojos;

import Interfaces.IReseteable;

import java.util.Date;

public class Discosolido extends Tecnologico implements IReseteable {
    private int capacidad;
    public Discosolido(String codigo, String modelo,String paisOrigen, Date fechaFabricacion, Empresa fabricante, int capacidad){
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);
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
        System.out.println("Formateando disco solido...");
    }

    /*@Override
    public void estado() {
        System.out.println("Cantidad de veces que se dio formato al disco:" + 50);
    }*/
}
