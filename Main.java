package dsadsa;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Cliente ignacio = new Cliente("ignacio","sagnella",1234,1000);
		Empleado empleado = new Empleado("Juan", "Pérez");
		Cajero cajero = new Cajero(5000);
		empleado.agregarBilletesAlCajero(cajero, 100);
		
		
		JOptionPane.showMessageDialog(null, ignacio.retirarDinero(7000, cajero));
		JOptionPane.showMessageDialog(null, ignacio.retirarDinero(1000, cajero));
		JOptionPane.showMessageDialog(null, "Saldo del cajero: " + cajero.getSaldo());
		
		

	}

}
