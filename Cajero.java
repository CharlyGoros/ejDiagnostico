package dsadsa;

public class Cajero {
	
	private double saldo;

	public Cajero(double saldo) {
		super(); //¿?
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarSaldo(double cantidad) {
        saldo += cantidad;
    }//---

    public void agregarBilletes(int cantidadBilletes) {
        double montoTotal = cantidadBilletes * 1000;
        agregarSaldo(montoTotal);//--

	@Override
	public String toString() {
		return "Cajero [saldo=" + saldo + "]";
	} //¿?

	
	

}
