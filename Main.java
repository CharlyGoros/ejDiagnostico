package dsadsa;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Cliente ignacio = new Cliente("ignacio","sagnella",1234,1000);
		
		Cajero cajero = new Cajero(5000);
		
		JOptionPane.showMessageDialog(null, ignacio.retirarDinero(7000, cajero));
		JOptionPane.showMessageDialog(null, ignacio.retirarDinero(1000, cajero));
		JOptionPane.showMessageDialog(null, cajero.getSaldo() );

		

	}

}
