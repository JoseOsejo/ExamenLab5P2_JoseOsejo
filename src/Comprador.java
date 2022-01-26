import java.util.ArrayList;

public class Comprador extends Usuario
{
private ArrayList<VideoJuego>videoJuegosComprados;
private int dineroParaComprar;
private String personajeFavorito;
private CuentaBancaria cuentaBancaria;
private int number;

    public Comprador(String nombre, String username, String password, int edad, ArrayList<VideoJuego> videoJuegosComprados, int dineroParaComprar, String personajeFavorito, CuentaBancaria cuentaBancaria,int numeroPrueba) {
        super(nombre, username, password, edad);
        this.videoJuegosComprados = videoJuegosComprados;
        this.dineroParaComprar = dineroParaComprar;
        this.personajeFavorito = personajeFavorito;
        this.cuentaBancaria = cuentaBancaria;
        this.number = numeroPrueba;
    }

    public ArrayList<VideoJuego> getVideoJuegosComprados() {
        return videoJuegosComprados;
    }

    public void setVideoJuegosComprados(ArrayList<VideoJuego> videoJuegosComprados) {
        this.videoJuegosComprados = videoJuegosComprados;
    }

    public int getDineroParaComprar() {
        return dineroParaComprar;
    }

    public void setDineroParaComprar(int dineroParaComprar) {
        this.dineroParaComprar = dineroParaComprar;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "videoJuegosComprados=" + videoJuegosComprados +
                ", dineroParaComprar=" + dineroParaComprar +
                ", personajeFavorito='" + personajeFavorito + '\'' +
                ", cuentaBancaria=" + cuentaBancaria +
                '}';
    }
}
