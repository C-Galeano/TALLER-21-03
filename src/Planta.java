public class Planta extends Empleados{

    protected double SalarioFijo;

    public Planta(String nombre, String edad, double salarioFijo) {
        super(nombre, edad);
        SalarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return SalarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        SalarioFijo = salarioFijo;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "SalarioFijo=" + SalarioFijo +
                ", Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void MostrarInfo(){
        System.out.println("NOMBRE: " + Nombre);
        System.out.println("EDAD: " + edad);
        System.out.println("SALARIO FIJO: " + SalarioFijo);
    }
}
