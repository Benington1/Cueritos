public class Restaurante {
    int capComenzales;
    String bebidas;
    String entradas;
    String sopas;
    String ensaladas;
    String platillos;
    String postres;
    float precio;


    public static void main (String[] args){
        Restaurante restaurante = new Restaurante();
        Bebidas bebidas = new Bebidas();

        Restaurante [] comidas = {restaurante, bebidas};

        for (Restaurante r : comidas) {
            r.comensal();
        }

    }

    void comensal() {
        System.out.println("mmmmmmm Buenisimo");
    }

}
