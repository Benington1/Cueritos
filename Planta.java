public class Planta {
    int Tamaño;
    int Edad;
    Boolean esTerrestre;


    public static void main (String[] args){
        Planta planta = new Planta();
        Pinos pino = new Pinos();

        Planta [] plantas = {planta, pino};

        for (Planta p : plantas) {
            p.utilidad();
        }

    }

    void utilidad() {
        System.out.println("Dan oxigeno");
    }

}
