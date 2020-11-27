package pojos;

import Interfaces.IReseteable;

import java.util.Date;

public class Cpu extends Tecnologico implements IReseteable {
    private int memoriaPrincipal;
    public Cpu(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante){
        super(codigo,modelo,paisOrigen,fechaFabricacion,fabricante);
        this.setMemoriaPrincipal(getMemoriaPrincipal());
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public void reset() {
        System.out.println("Reseteando al estado de fabrica...");
    }
    /*@Override
    public void estado() {
        System.out.println("Añs de uso_"+ 12);
    }*/
}
