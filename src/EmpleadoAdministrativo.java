public class EmpleadoAdministrativo extends Empleado {
    private double bonificacionFija;

    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(String id, String nombre, int edad, double salarioBase, double bonificacionFija) {
        super(id, nombre, edad, salarioBase);
        this.bonificacionFija = bonificacionFija;
    }

    public double getBonificacionFija() {
        return bonificacionFija;
    }

    public void setBonificacionFija(double bonificacionFija) {
        this.bonificacionFija = bonificacionFija;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bonificacionFija=" + bonificacionFija +
                '}';
    }
    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonificacionFija;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + "\n | Nombre: " + nombre + "\n | Edad: " + edad + "\n | Salario Base: $" + salarioBase + "\n | bonificacion: " + bonificacionFija);
    }

}