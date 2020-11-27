package pojos;

import Interfaces.IReseteable;

public class Monitor extends Alquilable implements IReseteable {
    private String resolucionMaxima;
    public Monitor(String codigo, String modelo, double precioHora, String resolucionMaxima){
        super(codigo, modelo, precioHora);
        this.setResolucionMaxima(resolucionMaxima);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolucionMaxima='" + resolucionMaxima + '\'' +
                ", preciohora=" + preciohora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public void reset() {
        System.out.println("Reseteando monitor...");
    }
    /*@Override
    public void estado() {
        System.out.println("Brillo:"+ 75+ "%");
    }*/
}
