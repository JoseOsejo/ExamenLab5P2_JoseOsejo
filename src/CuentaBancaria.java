public class CuentaBancaria
{
    private int numeroDeCuenta;
    private int dinero;

    public CuentaBancaria(int numeroDeCuenta, int dinero) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dinero = dinero;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroDeCuenta=" + numeroDeCuenta +
                ", dinero=" + dinero +
                '}';
    }
}
