public class Main {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[6];

        figuras[0] = new Circulo("Rojo", true, 5);
        figuras[1] = new Circulo("Azul", false, 3);

        figuras[2] = new Rectangulo("Verde", true, 4, 6);
        figuras[3] = new Rectangulo("Amarillo", false, 8, 2);

        figuras[4] = new TrianguloRectangulo("Negro", true, 3, 4);
        figuras[5] = new TrianguloRectangulo("Blanco", false, 5, 12);

        for (Figura f : figuras) {

            f.describir();

        }
    }
}