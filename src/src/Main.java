public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[6];

        empleados[0] = new EmpleadoPorHora("Ana", 1, 40, 5);
        empleados[1] = new EmpleadoPorHora("Luis", 2, 35, 6);

        empleados[2] = new EmpleadoFijo("Carlos", 3, 40, 800);
        empleados[3] = new EmpleadoFijo("Maria", 4, 40, 950);

        empleados[4] = new EmpleadoComision("Pedro", 5, 40, 500, 10, 2000);
        empleados[5] = new EmpleadoComision("Sofia", 6, 40, 600, 8, 3000);

        for (Empleado e : empleados) {

            e.mostrarInfo();

            if (e instanceof Bonificable) {

                Bonificable b = (Bonificable) e;

                System.out.println("Bono: " + b.calcularBono());
            }
        }
    }
}