package pojos;

public class Proveedor {
    private String nif;
    private String direccion;

    @Override
    public String toString() {
        return "Proveedor{" +
                "nif='" + nif + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
