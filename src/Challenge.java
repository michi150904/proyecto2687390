import java.util.Scanner;
public class Challenge {
    public static void main (String[] args) throws Exception {
        Scanner leer= new Scanner (System.in);
        double temperature1,temperature2;
        System.out.println("Ingrese la temperatura a convertir en grados celcius:");
        temperature1= leer.nextDouble();
        temperature2= (temperature1 - 32) /1.8;
        System.out.println("La temperatura convertida a fahreneit es:  " +temperature2);

        leer.close();
    }
}