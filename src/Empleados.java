public class Empleados {
    protected String Nombre;
    protected String edad;

    public Empleados() {
    }

    public Empleados(String nombre,String edad) {
        Nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void MostrarInfo(){
        System.out.println("NOMBRE: " + Nombre);
        System.out.println("EDAD: " + edad);
    }
}
