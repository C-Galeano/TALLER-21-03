public class PorHoras extends Empleados{

    protected double Pago;
    protected double HorasTrabajadas;

    public PorHoras(String nombre, String edad, double pago, double horasTrabajadas) {
        super(nombre, edad);
        Pago = pago;
        HorasTrabajadas = horasTrabajadas;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(double pago) {
        Pago = pago;
    }

    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "PorHoras{" +
                "Pago=" + Pago +
                ", HorasTrabajadas=" + HorasTrabajadas +
                ", Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void MostrarInfo(){
        System.out.println("NOMBRE: " + Nombre);
        System.out.println("EDAD: " + edad);
        System.out.println("HORAS TRABAJADAS: " + HorasTrabajadas);
        System.out.println("SALARIO: " + Pago);
    }
}
