import java.util.Scanner;
public class Vaccine {
    public static void main (String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        double weight,months,dose;
        System.out.println("digite el peso del bebé: ");
        weight=lectura.nextDouble();
        System.out.println("digite los meses del bebé: ");
        months=lectura.nextDouble();
        dose=((weight+10)/(months*10))*8;
        System.out.println("La dosis a aplicar es: "+dose);
        lectura.close();
    }
}
