package pojos;

public /*abstract*/ class Alquilable extends Producto{
    protected double preciohora;
    public Alquilable(String codigo, String modelo, double preciohora){
        super(codigo, modelo);
        this.setPreciohora(preciohora);
    }


    @Override
    public String toString() {
        return "Alquilable{" +
                "preciohora=" + preciohora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public double getPreciohora() {
        return preciohora;
    }

    public void setPreciohora(double preciohora) {
        this.preciohora = preciohora;
    }
}
