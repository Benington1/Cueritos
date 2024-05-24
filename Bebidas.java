public class Bebidas extends Restaurante {
    
    public static void main(String[] args) {

            String[] bebidasSinAlcohol = new String[5];
            bebidasSinAlcohol[0] = "Naranjada";
            bebidasSinAlcohol[1] = "Limonada";
            bebidasSinAlcohol[2] = "Limonada de Fresa";
            bebidasSinAlcohol[3] = "Horchata";
            bebidasSinAlcohol[4] = "Jamaica";

            System.out.println(bebidasSinAlcohol[3]);
        
    }    
    

         @Override
        void comensal() {
            System.out.println("aaaaaaahhhhhh Refrescante");
        }
    

}
