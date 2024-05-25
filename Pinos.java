public class Pinos extends Planta {
    
    public static void main(String[] args) {

            String[] especiePinos = new String[5];
            especiePinos[0] = "Cedro";
            especiePinos[1] = "Ficus";
            especiePinos[2] = "Picea";
            especiePinos[3] = "Hoyamel";
            especiePinos[4] = "Pinonero";

            System.out.println(especiePinos[0]);
            Pinos cedro = new Pinos();
            cedro.utilidad();
    }    
         @Override
        void utilidad() {
            System.out.println("Se hacen muebles");
        }
    

}
