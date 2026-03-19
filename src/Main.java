import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Empleado> lstEmpleado = new ArrayList<>();
        int op = -1;

        while (op != 0) {
            System.out.println("\n--- SISTEMA DE INFORMACIÓN DE EMPLEADOS ---");
            System.out.println("1. Registrar Empleado Administrativo");
            System.out.println("2. Registrar Empleado Ventas");
            System.out.println("3. Registrar Empleado Por Horas");
            System.out.println("4. Mostrar Empleados");
            System.out.println("5. Mostrar a empleado por identificación");
            System.out.println("6. Aumentar salario base de un empleado");
            System.out.println("7. Mostrar empleados mayores de edad");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            op = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (op) {
                case 1:
                    System.out.print("Id: ");
                    String idAdmin = sc.next();
                    System.out.print("Nombre: ");
                    String nombreAdmin = sc.next();
                    System.out.print("Edad: ");
                    int edadAdmin = sc.nextInt();
                    System.out.print("Salario Base: ");
                    double salarioBaseAdmin = sc.nextDouble();
                    System.out.print("Bonificación Fija: ");
                    double bonificacion = sc.nextDouble();

                    // Se crea el objeto con la clase Administrativo
                    lstEmpleado.add(new EmpleadoAdministrativo(idAdmin, nombreAdmin, edadAdmin, salarioBaseAdmin, bonificacion));
                    System.out.println("Empleado agregaooodoo");
                    break;

                case 2:
                    System.out.print("Id: ");
                    String idVentas = sc.next();
                    System.out.print("Nombre: ");
                    String nombreVentas = sc.next();
                    System.out.print("Edad: ");
                    int edadVentas = sc.nextInt();
                    System.out.print("Salario Base: ");
                    double salarioBaseVentas = sc.nextDouble();
                    System.out.print("Total Ventas del Mes: ");
                    double totalVentas = sc.nextDouble();
                    System.out.print("Porcentaje de Comisión: ");
                    double porcentaje = sc.nextDouble();

                    // Se crea el objeto con la clase Ventas
                    lstEmpleado.add(new EmpleadoVentas(idVentas, nombreVentas, edadVentas, salarioBaseVentas, totalVentas, porcentaje));
                    System.out.println("Empleado agregaooodoodo");
                    break;

                case 3:
                    System.out.print("Id: ");
                    String idHoras = sc.next();
                    System.out.print("Nombre: ");
                    String nombreHoras = sc.next();
                    System.out.print("Edad: ");
                    int edadHoras = sc.nextInt();
                    double salarioBaseHoras = 0;
                    System.out.print("horas trabajadas: ");
                    int horasT = sc.nextInt();
                    System.out.print("Valor de la Hora: ");
                    double valorH = sc.nextDouble();

                    // Se crea el objeto con la clase Por Horas
                    lstEmpleado.add(new EmpleadoPorHoras(idHoras, nombreHoras, edadHoras, salarioBaseHoras, horasT, valorH));
                    System.out.println("empleado agregadooooo");
                    break;

                case 4:
                    int opEmpleados=-2;

                    while (opEmpleados != -1){
                        System.out.println("\n=== Que deseas hacer? ===");
                        System.out.println("1. Mostrar todos los empleados");
                        System.out.println("2. Mostrar unicamente a los Empleados Administrativos");
                        System.out.println("3. Mostrar unicamente a los Empleados Ventas");
                        System.out.println("4. Mostrar unicamente a los Empleados por horas");
                        System.out.println("-1. Salir");
                        System.out.println("Seleccione una opcion: ");
                        opEmpleados = sc.nextInt();

                        switch (opEmpleados){
                            case 1:
                                System.out.println("\n--- LISTADO GENERAL DE EMPLEADOS ---");
                                if (lstEmpleado.isEmpty()) {
                                    System.out.println("No hay empleados en el sistema.");
                                } else {
                                    for (Empleado e : lstEmpleado) {
                                        e.mostrarInformacion();
                                        // También podemos mostrar el salario final aprovechando el polimorfismo
                                        System.out.println("salario Final calculado: $" + e.calcularSalarioFinal());
                                        System.out.println("-----------------------------------");
                                    }
                                }

                                break;

                            case 2:
                                System.out.println("\n--- LISTADO DE EMPLEADOS ADMINISTRATIVOS ---");
                                if (lstEmpleado.isEmpty()) {
                                    System.out.println("No hay empleados en el sistema.");
                                } else {
                                    for (Empleado e : lstEmpleado) {
                                        if (e instanceof EmpleadoAdministrativo){
                                            e.mostrarInformacion();
                                        }
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("\n--- LISTADO DE EMPLEADOS VENTAS ---");
                                if (lstEmpleado.isEmpty()) {
                                    System.out.println("No hay empleados en el sistema.");
                                } else {
                                    for (Empleado e : lstEmpleado) {
                                        if (e instanceof EmpleadoVentas){
                                            e.mostrarInformacion();
                                        }
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("\n--- LISTADO DE EMPLEADOS POR HORAS ---");
                                if (lstEmpleado.isEmpty()) {
                                    System.out.println("No hay empleados en el sistema.");
                                } else {
                                    for (Empleado e : lstEmpleado) {
                                        if (e instanceof EmpleadoPorHoras) {
                                            e.mostrarInformacion();
                                        }
                                    }
                                }
                                break;
                            case -1:
                                System.out.println("SalioDemaneraNICE");
                                break;
                            default:
                                System.out.println("opcion no ok, vrother");
                                break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("\nID?: ");
                    String idBuscado = sc.next();
                    boolean encontrado = false; //uno falso para buscar hasta encontrarlo

                    for (Empleado e : lstEmpleado) {
                        //usamos el .equals() cuando es de tipo String
                        if (e.getId().equals(idBuscado)) {
                            System.out.println("===================");
                            e.mostrarInformacion();
                            encontrado = true; //aqui cambiamos el estado para dejar ed buscarlo
                            break; // Rompemos el bucle porque ya no hace falta seguir buscando
                        }
                    }

                    if (!encontrado) { // en caso de no estar
                        System.out.println("no existe, sorry");
                    }
                    break;

                case 6:
                    System.out.print("\ncual es el ID?:  ");
                    String idAumento = sc.next();
                    boolean hallado = false;

                    for (Empleado e : lstEmpleado) {
                        if (e.getId().equals(idAumento)) {
                            System.out.print("Que porcentaje quiere aumentarle? diga solo el numero sin el %: ");

                            double porc = sc.nextDouble();

                            e.aumentarSalarioBase(porc);

                            System.out.println("Se le aplico el aumento a: " + e.getNombre());
                            hallado = true;
                            break;
                        }
                    }

                    if (!hallado) {
                        System.out.println("no ta, no existe");
                    }
                    break;

                case 7:
                    System.out.println("\nLista de los mayores de edad: ");
                    boolean hayMayores = false;

                    for (Empleado e : lstEmpleado) {
                        if (e.esMayorDeEdad()) {
                            e.mostrarInformacion();
                            System.out.println("-----------------------------------");
                            hayMayores = true;
                        }
                    }

                    if (!hayMayores) {
                        System.out.println("No hay dio mio");
                    }
                    break;

                case 0:
                    System.out.println("Chao Pescao");
                    break;

                default:
                    System.out.println("opcion no ok, another");
                    break;
            }
        }
    }
}