public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo,
                double velocidadMaxima, int cilindrada) {

        super(marca, modelo, velocidadMaxima);

        this.cilindrada = cilindrada;
    }

    @Override
    public void describir() {

        System.out.println("Moto");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        System.out.println("Cilindrada: " + cilindrada);
    }
}