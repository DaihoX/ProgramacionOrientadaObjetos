public class calculoDeInteres {
    public static void main (String[] args){

        double amount = 1000;
        int years = 10;
        double Interest = 0.05;
        double total, profit;

        System.out.println("Calcular el interes total  " + amount + " a un interes del " + (Interest*100) + "% durante " + years +  " años");

        for(int cont=1 ; cont <= years ; cont++){

            profit = amount * Interest;
            total = amount + profit;
            amount = total;

            System.out.println("La cantidad del año " + cont + " es de " + total);

        }
    }
}
