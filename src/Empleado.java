public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String id, String nombre, int edad, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Salario Base: $" + salarioBase);
    }

    public abstract double calcularSalarioFinal();

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void aumentarSalarioBase(double porcentaje) {
        this.salarioBase += this.salarioBase * (porcentaje / 100);
        System.out.println("Nuevo salario base: $" + this.salarioBase);
    }
}