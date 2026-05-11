public class Auto extends Vehiculo implements Electrico {

    private int numeroPuertas;
    private int bateria;

    public Auto(String marca, String modelo,
                double velocidadMaxima, int numeroPuertas) {

        super(marca, modelo, velocidadMaxima);

        this.numeroPuertas = numeroPuertas;
        this.bateria = 0;
    }

    @Override
    public void describir() {

        System.out.println("Auto");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        System.out.println("Numero de puertas: " + numeroPuertas);
        System.out.println("Bateria: " + bateria );
    }

    @Override
    public void cargarBateria(int porcentaje) {
        bateria = porcentaje;
    }

    @Override
    public int autonomiaKm() {
        return bateria * 3;
    }
}