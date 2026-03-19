public class EmpleadoVentas extends Empleado {
    private double totalVentasMes;
    private double porcentajeComision;

    public EmpleadoVentas() {
    }

    public EmpleadoVentas(String id, String nombre, int edad, double salarioBase, double totalVentasMes, double porcentajeComision) {
        super(id, nombre, edad, salarioBase);
        this.totalVentasMes = totalVentasMes;
        this.porcentajeComision = porcentajeComision;
    }

    public double getTotalVentasMes() {
        return totalVentasMes;
    }

    public void setTotalVentasMes(double totalVentasMes) {
        this.totalVentasMes = totalVentasMes;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public String toString() {
        return super.toString() +
                "totalVentasMes=" + totalVentasMes +
                ", porcentajeComision=" + porcentajeComision +
                '}';
    }

    @Override
    public double calcularSalarioFinal() {
        double comision = totalVentasMes * (porcentajeComision / 100);
        return salarioBase + comision;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + "\n | Nombre: " + nombre + "\n | Edad: " + edad + "\n | Salario Base: $" + salarioBase + "\n | bonificacion: " + "\n | total ventas: " + totalVentasMes + "\n | comision: " + porcentajeComision);
    }
}