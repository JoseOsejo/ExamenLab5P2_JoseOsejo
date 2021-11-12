import java.util.ArrayList;

public class Vendedor extends Usuario
{
private double estrellasRecibidas;
private ArrayList<VideoJuego>videoJuegosEnVenta;
private ArrayList<VideoJuego>videoJuegosVendidos;
private int dineroRecibido;
private String personajeFavorito;
private CuentaBancaria cuentaBancaria;

    public Vendedor(String nombre, String username, String password
            ,int edad, double estrellasRecibidas,int dineroRecibido,
                    String personajeFavorito, CuentaBancaria cuentaBancaria) {
        super(nombre, username, password, edad);
        this.estrellasRecibidas = estrellasRecibidas;
        this.dineroRecibido = dineroRecibido;
        this.personajeFavorito = personajeFavorito;
        this.cuentaBancaria = cuentaBancaria;
    }

    public double getEstrellasRecibidas() {
        return estrellasRecibidas;
    }

    public void setEstrellasRecibidas(double estrellasRecibidas) {
        this.estrellasRecibidas = estrellasRecibidas;
    }

    public ArrayList<VideoJuego> getVideoJuegosEnVenta() {
        return videoJuegosEnVenta;
    }

    public void setVideoJuegosEnVenta(ArrayList<VideoJuego> videoJuegosEnVenta) {
        this.videoJuegosEnVenta = videoJuegosEnVenta;
    }

    public ArrayList<VideoJuego> getVideoJuegosVendidos() {
        return videoJuegosVendidos;
    }

    public void setVideoJuegosVendidos(ArrayList<VideoJuego> videoJuegosVendidos) {
        this.videoJuegosVendidos = videoJuegosVendidos;
    }

    public int getDineroRecibido() {
        return dineroRecibido;
    }

    public void setDineroRecibido(int dineroRecibido) {
        this.dineroRecibido = dineroRecibido;
    }

    public String getPersonajeFavorito() {
        return personajeFavorito;
    }

    public void setPersonajeFavorito(String personajeFavorito) {
        this.personajeFavorito = personajeFavorito;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "estrellasRecibidas=" + estrellasRecibidas +
                ", videoJuegosEnVenta=" + videoJuegosEnVenta +
                ", videoJuegosVendidos=" + videoJuegosVendidos +
                ", dineroRecibido=" + dineroRecibido +
                ", personajeFavorito='" + personajeFavorito + '\'' +
                ", cuentaBancaria=" + cuentaBancaria +
                '}';
    }
}
