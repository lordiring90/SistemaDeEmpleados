public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(String id, String nombre, int edad, double salarioBase, int horasTrabajadas, double valorHora) {
        super(id, nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString() +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                '}';
    }
    @Override
    public void aumentarSalarioBase(double porcentaje) {
        this.valorHora += this.valorHora * (porcentaje / 100);
        System.out.println("nuevo valor de la hora: $" + this.valorHora);
    }

    @Override
    public double calcularSalarioFinal() {
        return horasTrabajadas * valorHora;
    }


    public void mostrarInformacion() {
        System.out.println("ID: " + id + "\n | Nombre: " + nombre + "\n | Edad: " + edad  + "\n | horas trabajadas: " + horasTrabajadas + "\n | valor por hora: " + valorHora);

    }
}