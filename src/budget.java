import java.util.Scanner;
public class budget {
    public static void main (String[] args) throws Exception{
        Scanner medida = new Scanner (System.in);
        int broad,longg,area,result;
        System.out.println("Ingrese el valor del ancho: ");
        broad=medida.nextInt();
        System.out.println("Ingrese el valor del largo:");
        longg=medida.nextInt();
        area=broad*longg;
        result=45000*area;
        System.out.println("El total de la mano de obra es:"+result);
        System.out.println ("El ancho es:  "+broad+  "El largo es:  "+longg+" La superficie a cubrir es:  "+area+"^m2");

        medida.close();
    }
}
