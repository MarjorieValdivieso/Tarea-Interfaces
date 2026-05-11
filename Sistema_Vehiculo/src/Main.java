public class Main {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[3];

        Auto auto = new Auto("Kia", "Model 3", 250, 4);
        auto.cargarBateria(80);

        vehiculos[0] = auto;
        vehiculos[1] = new Moto("Yamaha", "R15", 180, 150);
        vehiculos[2] = new Camion("Volvo", "FH16", 140, 20);

        for (Vehiculo v : vehiculos) {

            v.describir();

            if (v instanceof Electrico) {

                Electrico e = (Electrico) v;

                System.out.println("Autonomia: " + e.autonomiaKm() + " km");
            }


        }
    }
}