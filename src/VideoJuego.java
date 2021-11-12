import java.util.Date;

public class VideoJuego
{
    private String nombre;
    private Date fechaLanzamiento;
    private int cantidad;
    private int precio;

    public VideoJuego(String nombre, Date fechaLanzamiento, int cantidad, int precio) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "VideoJuegos{" +
                "nombre='" + nombre + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
