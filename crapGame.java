import java.util.Random;

public class crapGame {

    public static int tirarDados(Random rnd){

        int dices1 = rnd.nextInt(6)+1;
        int dices2 = rnd.nextInt(6)+1;
        System.out.println("Dado 1: "+ dices1);
        System.out.println("Dado 2: "+ dices2);
        System.out.println("El total es "+ (dices1+dices2));
        return dices1+dices2;
    }

    public static void main(String[] args){

        Random rnd = new Random();
        boolean continuar = true;
        int point = 0;
        
         System.out.println("Vamos a tirar los dados ");

         int calificacion = tirarDados(rnd);
         System.out.println("--- Sacaste "+ calificacion+ " ---");

         if (calificacion == 7 || calificacion == 11) {

             System.out.println("Ganaste en la primera tirada");
             System.out.println("-----------------------------");
             continuar = false;

          }
         else if (calificacion == 2 || calificacion == 3 || calificacion == 12) {

             System.out.println("Perdiste ");
             System.out.println("-----------------------------");
             continuar = false;

         }
         else{
             point = calificacion;
             System.out.println("Sigues lanzando, tu point es "+ point);
             System.out.println("-----------------------------");

         }

         while (continuar) {

             calificacion = tirarDados(rnd);

             if (calificacion == point) {

                 System.out.println("Sacaste "+ calificacion +" Ganaste!");
                 System.out.println("-----------------------------");
                 continuar = false;

            }
             else if (calificacion == 7) {

                System.out.println("Sacaste "+ calificacion +" Perdiste!");
                System.out.println("-----------------------------");
                continuar = false;

            }
             else {

                System.out.println("Sacaste "+ calificacion +" Sigues lanzando.");
                System.out.println("-----------------------------");

            }
         }
    }
}
