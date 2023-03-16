package dsadsa;
public class Empleado extends Persona {
    
    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

    
    public void agregarBilletesAlCajero(Cajero cajero, int cantidadBilletes) {
        cajero.agregarBilletes(cantidadBilletes);
    }
}
