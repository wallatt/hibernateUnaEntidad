package datos;
    import java.time.LocalDate;
    
public class Cliente {
    private long idCliente;
    private String apeliido;
    private String nombre;
    private int dni;
    private LocalDate fechaDeNacimiento;
    private boolean baja;

    public Cliente() {
    }

    public Cliente(String apeliido, String nombre, int dni, LocalDate fechaDeNacimiento) {
        this.apeliido = apeliido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.baja = false;
    }

    public long getIdCliente() {
        return this.idCliente;
    }

    protected void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getApeliido() {
        return this.apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isBaja() {
        return this.baja;
    }

    public boolean getBaja() {
        return this.baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }


    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", apeliido='" + getApeliido() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", dni='" + getDni() + "'" +
            ", fechaDeNacimiento='" + fechaDeNacimiento.getMonthValue()+" "+ fechaDeNacimiento.getYear()+ "'" +
            ", baja='" + isBaja() + "'" +
            "}";
    }


}
